package fr.inria.kairos.influence.patch;

public class InfluencePatchRow {

    public String rowName;

    public String variedParticipant;
    public String output;
    public String condition;

    public Double xMin;
    public Double xMax;

    public String trend;

    public String effect; //to be added later EffectType in dsl

    public Double localSlope;
    public Double r2;
    public Integer nLevels;

    public String rationale;
}