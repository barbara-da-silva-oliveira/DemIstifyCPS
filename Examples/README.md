# Influence Examples – Exploration Robot Use Case

We detail the influences found for the Cherokey 4WD exploration robot, and explain how they are encoded in the `explorationRobot.inf` InfluenceModel using the DemIstifyCPS DSL. The model makes explicit how design artifacts and environmental factors jointly shape system response properties that are constrained by requirements.

---

## 1. Use case overview

The robot must satisfy two high-level requirements:

- **EfficientExploration**  
  The robot should explore the environment efficiently, avoiding unnecessary maneuvers and completing the mission within a limited time.

- **ObstacleAvoidance**  
  The robot should detect obstacles and avoid them, maintaining a minimum distance of 5 cm to any obstacle at any time.

The behavior and structure of the robot are modeled in SysML (wheel control, dynamic/static detection, avoidance strategies). The Influence model adds an orthogonal view that links:

- design parameters (artifacts in the SysML models),
- environmental factors (terrain, air, noise, etc.),
- system response properties (SRPs) such as braking distance or exploration time,
- and requirements.

---

## 2. Design Artifacts and Environment Factors

We refer to a set of design artifacts from the SysML models that influence the robot operation. On the system hardware, the artifacts include \texttt{mass}, \texttt{frontalArea}, and \texttt{ultrasonicSensor}. On the design side, within the \texttt{Wheel Controller} model, we vary the \texttt{motorSpeed}.
The \texttt{Dynamic and Static Detection} include a parameter to determine the maximum distance to obstacles, \texttt{detectionThreshold}, and we add a delay for transitioning to \texttt{Static Detection}, \texttt{delayStaticDetection}. The rotary servo connected to the ultrasonic sensor sweeps in a step time \texttt{sweepingDelay}. For processing the detected distances, the action of \texttt{computeDistance} is performed. 
We include the environmental factors, that are not part of design models, comprising \texttt{surfaceFriction}, \texttt{slopeInclination}, \texttt{aerodynamicDrag}, ambient \texttt{temperature} and \texttt{humidity}, and \texttt{acousticNoise}.


## 3. Influence examples (i1–i8)

This section summarizes each influence in the model and how they relate artifacts, environment, SRPs, and requirements.

### i1 – Braking dynamics

```text
Influence i1 ... affects DistanceToStop
```

- **Participants:**  
  `motorSpeed`, `mass`, `frontalArea`, `frictionCoef`, `slopeAngleRad`,  
  `dragCoefficient`, `gravityAccel`, `airDensity`.
- **Output SRP:** `DistanceToStop` – distance the robot needs to fully brake after a stop command.
- **Function:** Physics-based formula combining kinetic energy, friction, slope, and aerodynamic drag.
- **Intuition:** Higher speed, low friction, downhill slopes, larger frontal area or higher drag increase `DistanceToStop`. This SRP is a building block for safety and efficiency analyses.

---

### i2 – Collision margin

```text
Influence i2 ... participants: detectionThreshold, SRPInput DistanceToStop
affects MarginCollision
```

- **Participants:**  
  `detectionThreshold`, `DistanceToStop` (from i1).
- **Output SRP:** `MarginCollision` – remaining safety margin before hitting an obstacle.
- **Function:** `MarginCollision = detectionThreshold - DistanceToStop`.
- **Requirement link:** `MarginCollision` is constrained by `ObstacleAvoidance` (`MarginCollision - 0.05 > 0`).
- **Intuition:** If the robot stops within the detection threshold, the margin is positive; if braking distance grows too large or threshold is too small, the margin becomes negative, indicating risk of collision.

Chain:  
`motorSpeed`, `mass`, terrain and air → **i1.DistanceToStop** → **i2.MarginCollision** → `ObstacleAvoidance`.

---

### i3 – Motion during static detection

```text
Influence i3 ... participants: DistanceToStop, delayStaticDetection
affects MotionWhileScanning
```

- **Participants:**  
  `DistanceToStop` (from i1), `delayStaticDetection`.
- **Output SRP:** `MotionWhileScanning` – how much the robot is still moving while static detection is active.
- **Function:** Natural-language description (Text).
- **Intuition:** If static detection starts too early (small `delayStaticDetection`) while the robot still needs time to brake (`DistanceToStop` large), the robot is still moving during supposedly “static” scans. This degrades distance accuracy and indirectly challenges `ObstacleAvoidance`.

---

### i4 – Ultrasonic wave propagation conditions

```text
Influence i4 ... participants: ultrasonicSensor,
                           MotionWhileScanning, temperature, humidity, noise
affects WavePropagation
```

- **Participants:**  
  `ultrasonicSensor`, `MotionWhileScanning` (from i3), `temperature`, `humidity`, `noise`.
- **Output SRP:** `WavePropagation` – quality and reliability of the ultrasonic wave propagation.
- **Function:** Natural-language description (Text).
- **Intuition:** Sensor type, motion during scan, and environmental conditions (temperature, humidity, acoustic noise) jointly influence how well ultrasonic pulses propagate and are received.

---

### i5 – Sensor motion during transmission and reception

```text
Influence i5 ... participants: WavePropagation, sweepingDelay
affects MotionDuringTxRx
```

- **Participants:**  
  `WavePropagation` (from i4), `sweepingDelay`.
- **Output SRP:** `MotionDuringTxRx` – how much the sensor/head moves while a pulse is in flight.
- **Requirement link:** `MotionDuringTxRx` is constrained by `ObstacleAvoidance`.
- **Intuition:** If the sweep is too fast or wave propagation is poor, the sensor may move significantly during transmit/receive. This can distort distance estimates and increase the risk of unsafe maneuvers.

Chain:  
`DistanceToStop` → `MotionWhileScanning` → `WavePropagation` → `MotionDuringTxRx` → `ObstacleAvoidance`.

---

### i6 – Effective travel speed

```text
Influence i6 ... participants: motorSpeed, mass, frontalArea, motor,
                               frictionCoef, slopeAngleRad, dragCoefficient,
                               gravityAccel, airDensity
affects TravelSpeed
```

- **Participants:**  
  `motorSpeed`, `mass`, `frontalArea`, `motor`,  
  `frictionCoef`, `slopeAngleRad`, `dragCoefficient`,  
  `gravityAccel`, `airDensity`.
- **Output SRP:** `TravelSpeed` – effective nominal travel speed of the robot in operation.
- **Intuition:** Under the same physical conditions as in i1, this influence captures how the robot’s commanded speed (`motorSpeed`) is translated into actual travel speed on different terrains and configurations.

---

### i7 – Total exploration time

```text
Influence i7 ... participants: TravelSpeed, detectionThreshold
affects ExplorationTime
```

- **Participants:**  
  `TravelSpeed` (from i6), `detectionThreshold`.
- **Output SRP:** `ExplorationTime` – total mission time.
- **Requirement link:** `ExplorationTime` is constrained by `EfficientExploration`.
- **Intuition:** Higher travel speed reduces mission time, but a stricter `detectionThreshold` causes more frequent stops/avoidance maneuvers, increasing exploration time. The trade-off between safety margin and mission efficiency is made explicit.

Chain:  
physics and terrain → **i6.TravelSpeed** → **i7.ExplorationTime** → `EfficientExploration`.

---

### i8 – Coverage quality during moving scans

```text
Influence i8 ... participants: WavePropagation, sweepingDelay, computeDistance
affects CoverageQuality
```

- **Participants:**  
  `WavePropagation` (from i4), `sweepingDelay`, `computeDistance`.
- **Output SRP:** `CoverageQuality` – quality of area coverage during exploration.
- **Requirement link:** `CoverageQuality` is constrained by `ObstacleAvoidance`.
- **Intuition:** Long `sweepingDelay`, expensive `computeDistance` steps, and degraded wave propagation lead to slower and less accurate coverage while the robot is moving. This can degrade both obstacle detection and exploration quality.

---

## 4. How to read the `explorationRobot.inf` file

This section explains the structure of the file so that each part of the text can be mapped back to the concepts above.

### 4.1 Model header

```text
InfluenceModel explorationRobot
```

Defines a named model that groups all artifacts, factors, SRPs, requirements, and influences for this use case.

### 4.2 Declaring design artifacts

Pattern:

```text
DesignArtifact <name> -> "<path in SysML model>"
    changeability <0..1>,
```

Example:

```text
DesignArtifact detectionThreshold -> "ActivityDiagramDynamicDetection.activityDynamicDetection.detectionThreshold"
    changeability 0.9,
```

- `<name>` is the short name used inside influences.
- The string after `->` is the reference to the SysML element.
- `changeability` gives a relative measure of how easily this parameter can be changed.

### 4.3 Declaring environmental factors

Pattern:

```text
EnvironmentalFactor <name>
    description "<human-readable text>"
    flexibility <0..1>
    value <double>,
```

Example:

```text
EnvironmentalFactor slopeAngleRad
    description "slope(rad)"
    flexibility 0.7
    value -0.3491,
```

- `flexibility` encodes how much this condition can be modified (e.g., choosing test tracks with different slopes).
- `value` is the nominal value used for analysis.

### 4.4 Declaring SRPs and requirements

SRPs:

```text
SystemResponseProperty MarginCollision
  description "ObstacleAvoidanceEfficiency proxy"
  constrainedBy ObstacleAvoidance,
```

Requirements:

```text
Requirement ObstacleAvoidance
  description "The robot should detect obstacles and avoid them, maintaining a minimum distance of 5cm to any obstacle at any time "
  satisfied when "MarginCollision - 0.05 > 0" languageType JavaNumericExpression,
```

- SRPs can be linked to one or more requirements via `constrainedBy`.
- Requirements define how those SRPs are evaluated (`satisfied when`).

### 4.5 Declaring an influence

Numeric example (i1):

```text
Influence i1
  #** "Observed when tuning motor speed in outdoor environment" **#
  participants:
    ArtifactParticipant motorSpeed  confidence 1.0,
    ArtifactParticipant mass confidence 1.0,
    ArtifactParticipant frontalArea confidence 1.0,
    EnvironmentalFactorParticipant  frictionCoef confidence 1.0,
    EnvironmentalFactorParticipant slopeAngleRad confidence 1.0,
    EnvironmentalFactorParticipant dragCoefficient  confidence 1.0,
    EnvironmentalFactorParticipant gravityAccel confidence 1.0,
    EnvironmentalFactorParticipant airDensity confidence 0.5;
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

- The `participants:` block lists all contributing elements. They are typed by kind (`ArtifactParticipant`, `EnvironmentalFactorParticipant`, `SRPInputParticipant`) with an optional `confidence`.
- `influenceFunction` gives the implementation:
  - `definition` is either a numeric expression or a textual description.
  - `returnType` is `Real` (numeric) or `Text`.
  - `languageType` tells the tooling how to interpret `definition`.
- `affects` specifies the single output SRP.

Composite chains are built by using `SRPInputParticipant` to reuse outputs of other influences, for example:

```text
SRPInputParticipant DistanceToStop confidence 1.0 ;
```

This is how i2, i3, i4, i5, i7, and i8 refer to upstream SRPs from other influences.

---

## 5. Typical usage of this model

When loaded into the DemIstifyCPS tooling, this `.inf` file allows:

- **Traceability analysis:** From a requirement (e.g., `ObstacleAvoidance`) back to all artifacts and environmental factors that can affect it via the chain of influences.
- **Structural advice:** Ranking participants by `changeability` / `flexibility` and graph distance to requirements to identify which participants can be more easily changed.
- **Quantitative analysis (for numeric influences like i1 and i2):**  
  Computing SRP values, requirement margins (e.g., `MarginCollision - 0.05`), and local sensitivities (how increasing each participant helps or hurts satisfaction).


