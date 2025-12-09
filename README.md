# DemIstify Domain Specific Language

This document describes the DemIstifyCPS DSL and Eclipse-based tooling.

The DSL allows developers to specify **Influence Models** that relate:

- design artifacts in existing MBSE models,
- environmental factors,
- system response properties (SRPs),
- and requirements,

and to run analyses (traceability, impact, and quantitative sensitivity) over these models.

---

## 2. Prerequisites

### 2.1. General

- Java Development Kit (JDK) 17 (recommended; any JDK > 11 is usually compatible with the SysML v2 tooling).
- Eclipse 2024-03 Modeling distribution (or later), including:
  - EMF / Ecore tools,
  - Xtext tooling,
  - standard Eclipse Java tooling.
- KLighD (Kieler Lightweight Diagrams) plug-ins for graph visualization, refer to [KLighD](https://github.com/kieler/KLighD)
- Git client (optional but recommended) to clone the repository.

### 2.2. Example using SysML v2 (textual editors and diagrams)

The examples use SysML v2 textual models (`.sysml`, `.kerml`) based on the official OMG SysML v2 Release.

To install the SysML v2 editors into Eclipse 2024-03, refer to [SysML v2 install Eclipse](https://github.com/Systems-Modeling/SysML-v2-Release/tree/master/install/eclipse/)

---

## 3. Importing and building the DSL in Eclipse

### 3.1. Clone and import projects

1. Clone the repository:

   ```bash
   git clone https://github.com/barbara-da-silva-oliveira/DemIstifyCPS2.git
   ```

2. Start Eclipse 2024-03 with a new workspace.

3. Import the projects:

   - `File -> Import… ->  Existing Projects into Workspace`
   - Select the cloned directory.

Eclipse will build the workspace automatically. 
Compiles errors at this stage usually indicate missing plug-ins (Xtext, EMF, KLighD, or SysML v2) or an incompatible Java version. 
Moreover, if an error concerns the build path: ensure that both `src` and `src-gen` are included in the projects build path.

---

### 3.2. Generate Xtext artifacts (language developer mode)

If you change the grammar (`InfluenceDSL.xtext`) or need to regenerate the DSL:

1. Open `InfluenceDSL.xtext` in the Xtext editor.
2. Right-click inside the editor and select  
   **Run As -> Generate Xtext Artifacts**.
3. Wait for code generation to finish and for the workspace to rebuild.

This step regenerates the parser, serializer, EMF model, and Eclipse editor integration for the DSL.

---

### 3.3. Launch a runtime Eclipse (end-user workbench)

To experiment with the DSL in a clean runtime workbench:

1. In the **language** project, right-click the main plug-in project (the one containing `plugin.xml`).
2. Select **Run As -> Eclipse Application**.
3. A second Eclipse instance (the *runtime workbench*) starts with the Influence DSL installed.

In that runtime workbench you can:

- import the **examples** project,
- open `.inf` files with syntax highlighting and validation,
- visualize influence graphs,
- inspect analysis results.

---

## 4. Language concepts and file format

### 4.1. InfluenceModel files (`.inf`)

Influence models are stored in text files with the extension `.inf`, using the DemIstifyCPS DSL:

```text
InfluenceModel explorationRobot
```

Inside an `InfluenceModel` you declare:

- `DesignArtifact` - references to existing model elements (e.g., SysML v2 properties),
- `EnvironmentalFactor` - explicit environment parameters,
- `SystemResponseProperty` - observable system outcomes,
- `Requirement` - requirements and their satisfaction predicates,
- `Influence` - multi-participant relations that produce a single SRP.

---

### 4.2. DesignArtifact

References an existing design element (e.g., a SysML v2 attribute) and attaches a changeability score:

```text
DesignArtifact motorSpeed ->
  "ActivityDiagramWheelControl.activityWheelControl.speedWheel"
  changeability 0.6,
```

- The string after `->` is a logical reference (path, URI, or qualified name) to the external model element.
- `changeability` approximates how easy/costly it is to change this artifact.

---

### 4.3. EnvironmentalFactor

Declares an environmental parameter not necessarily modeled elsewhere:

```text
EnvironmentalFactor frictionCoef
  description "friction"
  flexibility 0.4
  value 0.6,
```

- `description` documents the factor.
- `flexibility` summarizes how much this factor can be changed in practice.
- `value` provides a default numeric value for quantitative analysis.

---

### 4.4. SystemResponseProperty (SRP)

Represents an observable outcome or metric:

```text
SystemResponseProperty MarginCollision
  description "Physical distance remaining from obstacle after braking"
  constrainedBy ObstacleAvoidance,
```

- `description` documents the SRP.
- `constrainedBy` links to one or more `Requirement`s whose satisfaction depends on this SRP.

---

### 4.5. Requirement

Declares a requirement and its satisfaction condition:

```text
Requirement ObstacleAvoidance
  description "The robot should detect obstacles and avoid them, maintaining a minimum distance of 5cm to any obstacle at any time"
  satisfied when "MarginCollision - 0.05 > 0"
  languageType JavaNumericExpression,
```

- `description`: informal statement of intent.
- `satisfied when` is either:
  - `NaturalLanguage` for informal text, or
  - `JavaNumericExpression` for evaluable expressions over SRPs and parameters.

When an evaluable expression is present, the tooling interprets it as a **margin** (positive = satisfied, negative = violated) and uses it in quantitative analysis.

---

### 4.6. Influence and InfluenceFunction

An `Influence` couples a set of participants to a single output SRP via an influence function:

```text
Influence i1
  #** "Observed when tuning motor speed in outdoor environment" **#
  participants:
    ArtifactParticipant motorSpeed  confidence 1.0,
    ArtifactParticipant mass        confidence 1.0,
    ArtifactParticipant frontalArea confidence 1.0,
    EnvironmentalFactorParticipant frictionCoef   confidence 1.0,
    EnvironmentalFactorParticipant slopeAngleRad  confidence 1.0,
    EnvironmentalFactorParticipant dragCoefficient confidence 1.0,
    EnvironmentalFactorParticipant gravityAccel   confidence 1.0,
    EnvironmentalFactorParticipant airDensity     confidence 0.5;
  influenceFunction "f1":
    definition "mass*motorSpeed^2 /
      ( 2*gravityAccel*mass*frictionCoef*cos(slopeAngleRad)
      + 2*gravityAccel*mass*sin(slopeAngleRad)
      + frontalArea*dragCoefficient*airDensity*(motorSpeed)^2 )"
    returnType Real
    languageType JavaNumericExpression;
  affects DistanceToStop ,
```

Key points:

- The `participants:` block may contain:
  - `ArtifactParticipant`,
  - `EnvironmentalFactorParticipant`,
  - `SRPInputParticipant` (to chain influences).
- Each participant has a `confidence` value (and can be extended with weights).
- `influenceFunction` defines:
  - `definition`: a numeric expression or textual description,
  - `returnType`: `Real` (numeric) or `Text`,
  - `languageType`: `JavaNumericExpression` for numeric, or `NaturalLanguage` for qualitative descriptions.
- `affects` points to exactly one output SRP.

Chaining is achieved by using `SRPInputParticipant` to reference SRPs produced by other influences, for example:

```text
Influence i2
  participants:
    ArtifactParticipant detectionThreshold confidence 1.0,
    SRPInputParticipant DistanceToStop      confidence 1.0;
  influenceFunction "f2":
    definition "detectionThreshold - DistanceToStop"
    returnType Real
    languageType JavaNumericExpression;
  affects MarginCollision ,
```

---

## 5. Using the tooling in Eclipse (runtime workbench)

### 5.1. Editing and validation

In the runtime workbench:

1. Import the **examples** project.
2. Open `explorationRobot.inf` (or any `.inf`) in the Influence DSL editor.

The editor provides:

- syntax highlighting,
- structural validation (well-formedness of influences and participants),
- problem markers for violations of participation patterns (e.g., influences without non-artifact participants).

Validation is triggered on save.

---

### 5.2. Influence graph visualization (KLighD)

The tooling converts Influence Models into a graph where:

- each `Influence` is a central node,
- participants point to the influence,
- the influence points to its output SRP,
- SRPs are linked to their constraining requirements.

To visualize the graph:

1. Open the `.inf` file.
2. Open the **Influence Graph** / KLighD view  
   (`Window → Show View → Other… → <your Influence graph view>`).
3. The view renders the influence graph for the active model:
   - nodes for design artifacts, environmental factors, SRPs, requirements,
   - edges showing the chaining of influences.

The graph can be exported (for example as DOT/JSON) for external processing.

---

### 5.3. Static analyses

The analysis engine (in the **analysis** project) operates on the Influence Model and its graph representation. The main analyses include:

1. **Traceability**

   For a given requirement:

   - compute all SRPs it constrains,
   - traverse upstream influences to collect all direct and indirect participants (artifacts and environmental factors),
   - output the chains `(participant -> influence -> SRP -> requirement)`.

2. **Impact metrics**

   For each participant:

   - **direct impact**: number of influences where the participant appears,
   - **propagated impact**: number of influences reachable via chaining through SRPs,
   - optional **confidence-weighted impact** based on participant confidence.

3. **Structural requirement analysis**

   Purely structure-based (does not require numeric influence functions):

   - identifies which participants can affect a requirement,
   - ranks them according to `changeability` (artifacts) and `flexibility` (environmental factors),
   - supports "which participants are involved in the requirement satisfaction "reasoning in socio-technical coordination.

---

### 5.4. Quantitative requirement analysis

For influences whose `influenceFunction` is numeric and whose SRPs are linked to evaluable requirement predicates:

1. The evaluator:

   - resolves numeric values for artifacts (from referenced models, when available),
   - uses `value` attributes for environmental factors,
   - computes the output SRP value by evaluating the expression.

2. For each requirement with `languageType JavaNumericExpression`:

   - extracts the margin function from `satisfied when` (e.g., `MarginCollision - 0.05 > 0`),
   - evaluates the margin at the current point,
   - reports whether the requirement is satisfied (margin > 0) or violated (margin < 0).

3. Sensitivity analysis:

   - computes central-difference partial derivatives of the margin with respect to each numeric participant,
   - classifies the change in the participant as:
     - **beneficial** (for example, increasing its value improves the margin),
     - **prejudicial** (for example, increasing its value worsens the margin),
     - or **neutral**,
   - outputs a table of sensitivities.

For CPS with hybrid behavior, derivative-based sensitivities are meaningful only where the influence functions are locally differentiable, discontinuities at mode switches must be interpreted with care.

---

## 6. Reproducing the mobile robot case study

The **Examples** project contains:

- SysML v2 models for the exploration robot (activities, parts, etc., `.sysml`),
- the Influence model `explorationRobot.inf` encoding influences i1–i8,

To reproduce the case study:

1. Ensure the SysML v2 editors are installed (Section 2.2).
2. In the runtime workbench, import the **examples** project.
3. Open the SysML v2 models (`*.sysml`) in the SysML v2 editor to inspect the structure and behavior of the robot.
4. Open `explorationRobot.inf` to inspect:
   - design artifacts (e.g., `motorSpeed`, `detectionThreshold`),
   - environmental factors (e.g., friction, slope, drag, temperature),
   - SRPs (`DistanceToStop`, `MarginCollision`, `ExplorationTime`, etc.),
   - influences i1–i8 and their chains.
5. Use the Influence graph view to confirm the chains described in the paper  
   (e.g., `motorSpeed` -> i1 -> `DistanceToStop`-> i2 -> `MarginCollision`-> `ObstacleAvoidance`).
6. Run the structural and quantitative analyses as described in Section 5, using the same parameter ranges as in the paper to reproduce tables and plots.

---

## 7. Citation

If you use the DemIstifyCPS DSL or tooling in publications, please mention this repository.
