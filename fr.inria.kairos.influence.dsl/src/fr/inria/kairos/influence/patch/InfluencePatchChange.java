package fr.inria.kairos.influence.patch;

import java.util.ArrayList;
import java.util.List;

public class InfluencePatchChange {

    public String changeType;

    public String representationType;
    public String representationName;

    public Double confidence;

    public String sourceUri;
    public String rationale;

     // Used for AnalyticExpressionFunction.
    public String expression;
    public String expressionLanguage;

    
     // Used for MonotonicityTable.
    public List<InfluencePatchRow> rows = new ArrayList<>();

     //Used for ParticipantImpactFunction.
    public List<InfluencePatchImpact> impacts = new ArrayList<>();
}