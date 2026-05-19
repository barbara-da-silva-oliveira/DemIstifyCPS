package fr.inria.kairos.influence.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.kairos.influence.services.InfluenceDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInfluenceDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "','", "'SystemResponseProperty'", "'description'", "'SatisfactionCriterion'", "'for'", "'constrains'", "'satisfied'", "'when'", "'languageType'", "'EnvironmentalFactor'", "'flexibility'", "'DesignArtifact'", "'->'", "'changeability'", "'ArtifactParticipant'", "'target'", "'confidence'", "'SRPInputParticipant'", "'EnvironmentalFactorParticipant'", "'admissibleSpace'", "'value'", "'unit'", "'range'", "'['", "'..'", "']'", "'nominal'", "'step'", "'inclusiveLower'", "'inclusiveUpper'", "'ParticipantRange'", "'of'", "'Influence'", "'#**'", "'**#'", "'participants'", "':'", "';'", "'influenceFunction'", "'affects'", "'CompositeInfluence'", "'internalInfluences'", "'('", "')'", "'ownedInfluenceFunction'", "'representations'", "'NaturalLanguageFunction'", "'sourceUri'", "'applicabilityDomain'", "'definition'", "'ParticipantImpactFunction'", "'participantContributions'", "'ParticipantRelativeImpact'", "'participant'", "'importance'", "'direction'", "'rationale'", "'AnalyticExpressionFunction'", "'expression'", "'expressionLanguage'", "'MonotonicityTable'", "'tableRows'", "'MonotonicityRow'", "'conditions'", "'variedParticipant'", "'output'", "'trend'", "'-'", "'.'", "'E'", "'e'", "'+'", "'true'", "'false'", "'NaturalLanguage'", "'JavaNumericExpression'", "'Increasing'", "'Decreasing'", "'Flat'", "'NotMonotonic'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalInfluenceDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInfluenceDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInfluenceDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInfluenceDSL.g"; }



     	private InfluenceDSLGrammarAccess grammarAccess;

        public InternalInfluenceDSLParser(TokenStream input, InfluenceDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "InfluenceModel";
       	}

       	@Override
       	protected InfluenceDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfluenceModel"
    // InternalInfluenceDSL.g:65:1: entryRuleInfluenceModel returns [EObject current=null] : iv_ruleInfluenceModel= ruleInfluenceModel EOF ;
    public final EObject entryRuleInfluenceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluenceModel = null;


        try {
            // InternalInfluenceDSL.g:65:55: (iv_ruleInfluenceModel= ruleInfluenceModel EOF )
            // InternalInfluenceDSL.g:66:2: iv_ruleInfluenceModel= ruleInfluenceModel EOF
            {
             newCompositeNode(grammarAccess.getInfluenceModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfluenceModel=ruleInfluenceModel();

            state._fsp--;

             current =iv_ruleInfluenceModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfluenceModel"


    // $ANTLR start "ruleInfluenceModel"
    // InternalInfluenceDSL.g:72:1: ruleInfluenceModel returns [EObject current=null] : ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? ) ;
    public final EObject ruleInfluenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_8=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedSRPs_3_0 = null;

        EObject lv_ownedInfluences_4_0 = null;

        EObject lv_ownedSatisfactionCriteria_5_0 = null;

        EObject lv_ownedEnvironmentalFactors_6_0 = null;

        EObject lv_ownedArtifacts_7_0 = null;

        EObject lv_ownedSRPs_9_0 = null;

        EObject lv_ownedInfluences_10_0 = null;

        EObject lv_ownedSatisfactionCriteria_11_0 = null;

        EObject lv_ownedEnvironmentalFactors_12_0 = null;

        EObject lv_ownedArtifacts_13_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:78:2: ( ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? ) )
            // InternalInfluenceDSL.g:79:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? )
            {
            // InternalInfluenceDSL.g:79:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? )
            // InternalInfluenceDSL.g:80:3: () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )?
            {
            // InternalInfluenceDSL.g:80:3: ()
            // InternalInfluenceDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInfluenceModelAccess().getInfluenceModelKeyword_1());
            		
            // InternalInfluenceDSL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:110:3: ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13||LA5_0==15||LA5_0==21||LA5_0==23||LA5_0==44||LA5_0==52) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInfluenceDSL.g:111:4: ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )?
                    {
                    // InternalInfluenceDSL.g:111:4: ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) )
                    int alt1=5;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt1=1;
                        }
                        break;
                    case 44:
                    case 52:
                        {
                        alt1=2;
                        }
                        break;
                    case 15:
                        {
                        alt1=3;
                        }
                        break;
                    case 21:
                        {
                        alt1=4;
                        }
                        break;
                    case 23:
                        {
                        alt1=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // InternalInfluenceDSL.g:112:5: ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) )
                            {
                            // InternalInfluenceDSL.g:112:5: ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) )
                            // InternalInfluenceDSL.g:113:6: (lv_ownedSRPs_3_0= ruleSystemResponseProperty )
                            {
                            // InternalInfluenceDSL.g:113:6: (lv_ownedSRPs_3_0= ruleSystemResponseProperty )
                            // InternalInfluenceDSL.g:114:7: lv_ownedSRPs_3_0= ruleSystemResponseProperty
                            {

                            							newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedSRPsSystemResponsePropertyParserRuleCall_3_0_0_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_ownedSRPs_3_0=ruleSystemResponseProperty();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                            							}
                            							add(
                            								current,
                            								"ownedSRPs",
                            								lv_ownedSRPs_3_0,
                            								"fr.inria.kairos.influence.InfluenceDSL.SystemResponseProperty");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalInfluenceDSL.g:132:5: ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) )
                            {
                            // InternalInfluenceDSL.g:132:5: ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) )
                            // InternalInfluenceDSL.g:133:6: (lv_ownedInfluences_4_0= ruleAbstractInfluence )
                            {
                            // InternalInfluenceDSL.g:133:6: (lv_ownedInfluences_4_0= ruleAbstractInfluence )
                            // InternalInfluenceDSL.g:134:7: lv_ownedInfluences_4_0= ruleAbstractInfluence
                            {

                            							newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAbstractInfluenceParserRuleCall_3_0_1_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_ownedInfluences_4_0=ruleAbstractInfluence();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                            							}
                            							add(
                            								current,
                            								"ownedInfluences",
                            								lv_ownedInfluences_4_0,
                            								"fr.inria.kairos.influence.InfluenceDSL.AbstractInfluence");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalInfluenceDSL.g:152:5: ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) )
                            {
                            // InternalInfluenceDSL.g:152:5: ( (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion ) )
                            // InternalInfluenceDSL.g:153:6: (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion )
                            {
                            // InternalInfluenceDSL.g:153:6: (lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion )
                            // InternalInfluenceDSL.g:154:7: lv_ownedSatisfactionCriteria_5_0= ruleSatisfactionCriterion
                            {

                            							newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedSatisfactionCriteriaSatisfactionCriterionParserRuleCall_3_0_2_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_ownedSatisfactionCriteria_5_0=ruleSatisfactionCriterion();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                            							}
                            							add(
                            								current,
                            								"ownedSatisfactionCriteria",
                            								lv_ownedSatisfactionCriteria_5_0,
                            								"fr.inria.kairos.influence.InfluenceDSL.SatisfactionCriterion");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalInfluenceDSL.g:172:5: ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) )
                            {
                            // InternalInfluenceDSL.g:172:5: ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) )
                            // InternalInfluenceDSL.g:173:6: (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor )
                            {
                            // InternalInfluenceDSL.g:173:6: (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor )
                            // InternalInfluenceDSL.g:174:7: lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor
                            {

                            							newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedEnvironmentalFactorsEnvironmentalFactorParserRuleCall_3_0_3_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_ownedEnvironmentalFactors_6_0=ruleEnvironmentalFactor();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                            							}
                            							add(
                            								current,
                            								"ownedEnvironmentalFactors",
                            								lv_ownedEnvironmentalFactors_6_0,
                            								"fr.inria.kairos.influence.InfluenceDSL.EnvironmentalFactor");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalInfluenceDSL.g:192:5: ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) )
                            {
                            // InternalInfluenceDSL.g:192:5: ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) )
                            // InternalInfluenceDSL.g:193:6: (lv_ownedArtifacts_7_0= ruleDesignArtifact )
                            {
                            // InternalInfluenceDSL.g:193:6: (lv_ownedArtifacts_7_0= ruleDesignArtifact )
                            // InternalInfluenceDSL.g:194:7: lv_ownedArtifacts_7_0= ruleDesignArtifact
                            {

                            							newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsDesignArtifactParserRuleCall_3_0_4_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_ownedArtifacts_7_0=ruleDesignArtifact();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                            							}
                            							add(
                            								current,
                            								"ownedArtifacts",
                            								lv_ownedArtifacts_7_0,
                            								"fr.inria.kairos.influence.InfluenceDSL.DesignArtifact");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalInfluenceDSL.g:212:4: (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==13||LA3_1==15||LA3_1==21||LA3_1==23||LA3_1==44||LA3_1==52) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:213:5: otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getInfluenceModelAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalInfluenceDSL.g:217:5: ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) )
                    	    int alt2=5;
                    	    switch ( input.LA(1) ) {
                    	    case 13:
                    	        {
                    	        alt2=1;
                    	        }
                    	        break;
                    	    case 44:
                    	    case 52:
                    	        {
                    	        alt2=2;
                    	        }
                    	        break;
                    	    case 15:
                    	        {
                    	        alt2=3;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt2=4;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt2=5;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 2, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt2) {
                    	        case 1 :
                    	            // InternalInfluenceDSL.g:218:6: ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) )
                    	            {
                    	            // InternalInfluenceDSL.g:218:6: ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) )
                    	            // InternalInfluenceDSL.g:219:7: (lv_ownedSRPs_9_0= ruleSystemResponseProperty )
                    	            {
                    	            // InternalInfluenceDSL.g:219:7: (lv_ownedSRPs_9_0= ruleSystemResponseProperty )
                    	            // InternalInfluenceDSL.g:220:8: lv_ownedSRPs_9_0= ruleSystemResponseProperty
                    	            {

                    	            								newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedSRPsSystemResponsePropertyParserRuleCall_3_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_ownedSRPs_9_0=ruleSystemResponseProperty();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"ownedSRPs",
                    	            									lv_ownedSRPs_9_0,
                    	            									"fr.inria.kairos.influence.InfluenceDSL.SystemResponseProperty");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalInfluenceDSL.g:238:6: ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) )
                    	            {
                    	            // InternalInfluenceDSL.g:238:6: ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) )
                    	            // InternalInfluenceDSL.g:239:7: (lv_ownedInfluences_10_0= ruleAbstractInfluence )
                    	            {
                    	            // InternalInfluenceDSL.g:239:7: (lv_ownedInfluences_10_0= ruleAbstractInfluence )
                    	            // InternalInfluenceDSL.g:240:8: lv_ownedInfluences_10_0= ruleAbstractInfluence
                    	            {

                    	            								newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAbstractInfluenceParserRuleCall_3_1_1_1_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_ownedInfluences_10_0=ruleAbstractInfluence();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"ownedInfluences",
                    	            									lv_ownedInfluences_10_0,
                    	            									"fr.inria.kairos.influence.InfluenceDSL.AbstractInfluence");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalInfluenceDSL.g:258:6: ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) )
                    	            {
                    	            // InternalInfluenceDSL.g:258:6: ( (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion ) )
                    	            // InternalInfluenceDSL.g:259:7: (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion )
                    	            {
                    	            // InternalInfluenceDSL.g:259:7: (lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion )
                    	            // InternalInfluenceDSL.g:260:8: lv_ownedSatisfactionCriteria_11_0= ruleSatisfactionCriterion
                    	            {

                    	            								newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedSatisfactionCriteriaSatisfactionCriterionParserRuleCall_3_1_1_2_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_ownedSatisfactionCriteria_11_0=ruleSatisfactionCriterion();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"ownedSatisfactionCriteria",
                    	            									lv_ownedSatisfactionCriteria_11_0,
                    	            									"fr.inria.kairos.influence.InfluenceDSL.SatisfactionCriterion");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalInfluenceDSL.g:278:6: ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) )
                    	            {
                    	            // InternalInfluenceDSL.g:278:6: ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) )
                    	            // InternalInfluenceDSL.g:279:7: (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor )
                    	            {
                    	            // InternalInfluenceDSL.g:279:7: (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor )
                    	            // InternalInfluenceDSL.g:280:8: lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor
                    	            {

                    	            								newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedEnvironmentalFactorsEnvironmentalFactorParserRuleCall_3_1_1_3_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_ownedEnvironmentalFactors_12_0=ruleEnvironmentalFactor();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"ownedEnvironmentalFactors",
                    	            									lv_ownedEnvironmentalFactors_12_0,
                    	            									"fr.inria.kairos.influence.InfluenceDSL.EnvironmentalFactor");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 5 :
                    	            // InternalInfluenceDSL.g:298:6: ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) )
                    	            {
                    	            // InternalInfluenceDSL.g:298:6: ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) )
                    	            // InternalInfluenceDSL.g:299:7: (lv_ownedArtifacts_13_0= ruleDesignArtifact )
                    	            {
                    	            // InternalInfluenceDSL.g:299:7: (lv_ownedArtifacts_13_0= ruleDesignArtifact )
                    	            // InternalInfluenceDSL.g:300:8: lv_ownedArtifacts_13_0= ruleDesignArtifact
                    	            {

                    	            								newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsDesignArtifactParserRuleCall_3_1_1_4_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_ownedArtifacts_13_0=ruleDesignArtifact();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"ownedArtifacts",
                    	            									lv_ownedArtifacts_13_0,
                    	            									"fr.inria.kairos.influence.InfluenceDSL.DesignArtifact");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalInfluenceDSL.g:319:4: (otherlv_14= ',' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalInfluenceDSL.g:320:5: otherlv_14= ','
                            {
                            otherlv_14=(Token)match(input,12,FOLLOW_2); 

                            					newLeafNode(otherlv_14, grammarAccess.getInfluenceModelAccess().getCommaKeyword_3_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfluenceModel"


    // $ANTLR start "entryRuleAbstractInfluence"
    // InternalInfluenceDSL.g:330:1: entryRuleAbstractInfluence returns [EObject current=null] : iv_ruleAbstractInfluence= ruleAbstractInfluence EOF ;
    public final EObject entryRuleAbstractInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInfluence = null;


        try {
            // InternalInfluenceDSL.g:330:58: (iv_ruleAbstractInfluence= ruleAbstractInfluence EOF )
            // InternalInfluenceDSL.g:331:2: iv_ruleAbstractInfluence= ruleAbstractInfluence EOF
            {
             newCompositeNode(grammarAccess.getAbstractInfluenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractInfluence=ruleAbstractInfluence();

            state._fsp--;

             current =iv_ruleAbstractInfluence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractInfluence"


    // $ANTLR start "ruleAbstractInfluence"
    // InternalInfluenceDSL.g:337:1: ruleAbstractInfluence returns [EObject current=null] : (this_CompositeInfluence_0= ruleCompositeInfluence | this_Influence_1= ruleInfluence ) ;
    public final EObject ruleAbstractInfluence() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeInfluence_0 = null;

        EObject this_Influence_1 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:343:2: ( (this_CompositeInfluence_0= ruleCompositeInfluence | this_Influence_1= ruleInfluence ) )
            // InternalInfluenceDSL.g:344:2: (this_CompositeInfluence_0= ruleCompositeInfluence | this_Influence_1= ruleInfluence )
            {
            // InternalInfluenceDSL.g:344:2: (this_CompositeInfluence_0= ruleCompositeInfluence | this_Influence_1= ruleInfluence )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==52) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalInfluenceDSL.g:345:3: this_CompositeInfluence_0= ruleCompositeInfluence
                    {

                    			newCompositeNode(grammarAccess.getAbstractInfluenceAccess().getCompositeInfluenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeInfluence_0=ruleCompositeInfluence();

                    state._fsp--;


                    			current = this_CompositeInfluence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:354:3: this_Influence_1= ruleInfluence
                    {

                    			newCompositeNode(grammarAccess.getAbstractInfluenceAccess().getInfluenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Influence_1=ruleInfluence();

                    state._fsp--;


                    			current = this_Influence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractInfluence"


    // $ANTLR start "entryRuleParticipant"
    // InternalInfluenceDSL.g:366:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // InternalInfluenceDSL.g:366:52: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalInfluenceDSL.g:367:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalInfluenceDSL.g:373:1: ruleParticipant returns [EObject current=null] : (this_SRPInputParticipant_0= ruleSRPInputParticipant | this_EnvironmentalFactorParticipant_1= ruleEnvironmentalFactorParticipant | this_ArtifactParticipant_2= ruleArtifactParticipant ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        EObject this_SRPInputParticipant_0 = null;

        EObject this_EnvironmentalFactorParticipant_1 = null;

        EObject this_ArtifactParticipant_2 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:379:2: ( (this_SRPInputParticipant_0= ruleSRPInputParticipant | this_EnvironmentalFactorParticipant_1= ruleEnvironmentalFactorParticipant | this_ArtifactParticipant_2= ruleArtifactParticipant ) )
            // InternalInfluenceDSL.g:380:2: (this_SRPInputParticipant_0= ruleSRPInputParticipant | this_EnvironmentalFactorParticipant_1= ruleEnvironmentalFactorParticipant | this_ArtifactParticipant_2= ruleArtifactParticipant )
            {
            // InternalInfluenceDSL.g:380:2: (this_SRPInputParticipant_0= ruleSRPInputParticipant | this_EnvironmentalFactorParticipant_1= ruleEnvironmentalFactorParticipant | this_ArtifactParticipant_2= ruleArtifactParticipant )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalInfluenceDSL.g:381:3: this_SRPInputParticipant_0= ruleSRPInputParticipant
                    {

                    			newCompositeNode(grammarAccess.getParticipantAccess().getSRPInputParticipantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SRPInputParticipant_0=ruleSRPInputParticipant();

                    state._fsp--;


                    			current = this_SRPInputParticipant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:390:3: this_EnvironmentalFactorParticipant_1= ruleEnvironmentalFactorParticipant
                    {

                    			newCompositeNode(grammarAccess.getParticipantAccess().getEnvironmentalFactorParticipantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvironmentalFactorParticipant_1=ruleEnvironmentalFactorParticipant();

                    state._fsp--;


                    			current = this_EnvironmentalFactorParticipant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:399:3: this_ArtifactParticipant_2= ruleArtifactParticipant
                    {

                    			newCompositeNode(grammarAccess.getParticipantAccess().getArtifactParticipantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArtifactParticipant_2=ruleArtifactParticipant();

                    state._fsp--;


                    			current = this_ArtifactParticipant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleEString"
    // InternalInfluenceDSL.g:411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInfluenceDSL.g:411:47: (iv_ruleEString= ruleEString EOF )
            // InternalInfluenceDSL.g:412:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalInfluenceDSL.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:424:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInfluenceDSL.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInfluenceDSL.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:426:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:434:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSystemResponseProperty"
    // InternalInfluenceDSL.g:445:1: entryRuleSystemResponseProperty returns [EObject current=null] : iv_ruleSystemResponseProperty= ruleSystemResponseProperty EOF ;
    public final EObject entryRuleSystemResponseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemResponseProperty = null;


        try {
            // InternalInfluenceDSL.g:445:63: (iv_ruleSystemResponseProperty= ruleSystemResponseProperty EOF )
            // InternalInfluenceDSL.g:446:2: iv_ruleSystemResponseProperty= ruleSystemResponseProperty EOF
            {
             newCompositeNode(grammarAccess.getSystemResponsePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemResponseProperty=ruleSystemResponseProperty();

            state._fsp--;

             current =iv_ruleSystemResponseProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemResponseProperty"


    // $ANTLR start "ruleSystemResponseProperty"
    // InternalInfluenceDSL.g:452:1: ruleSystemResponseProperty returns [EObject current=null] : ( () otherlv_1= 'SystemResponseProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) ) ;
    public final EObject ruleSystemResponseProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:458:2: ( ( () otherlv_1= 'SystemResponseProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) ) )
            // InternalInfluenceDSL.g:459:2: ( () otherlv_1= 'SystemResponseProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )
            {
            // InternalInfluenceDSL.g:459:2: ( () otherlv_1= 'SystemResponseProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )
            // InternalInfluenceDSL.g:460:3: () otherlv_1= 'SystemResponseProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
            {
            // InternalInfluenceDSL.g:460:3: ()
            // InternalInfluenceDSL.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemResponsePropertyAccess().getSystemResponsePropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemResponsePropertyAccess().getSystemResponsePropertyKeyword_1());
            		
            // InternalInfluenceDSL.g:471:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:472:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:472:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:473:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemResponsePropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemResponsePropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemResponsePropertyAccess().getDescriptionKeyword_3());
            		
            // InternalInfluenceDSL.g:494:3: ( (lv_description_4_0= ruleEString ) )
            // InternalInfluenceDSL.g:495:4: (lv_description_4_0= ruleEString )
            {
            // InternalInfluenceDSL.g:495:4: (lv_description_4_0= ruleEString )
            // InternalInfluenceDSL.g:496:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemResponsePropertyAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemResponsePropertyRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemResponseProperty"


    // $ANTLR start "entryRuleSatisfactionCriterion"
    // InternalInfluenceDSL.g:517:1: entryRuleSatisfactionCriterion returns [EObject current=null] : iv_ruleSatisfactionCriterion= ruleSatisfactionCriterion EOF ;
    public final EObject entryRuleSatisfactionCriterion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSatisfactionCriterion = null;


        try {
            // InternalInfluenceDSL.g:517:62: (iv_ruleSatisfactionCriterion= ruleSatisfactionCriterion EOF )
            // InternalInfluenceDSL.g:518:2: iv_ruleSatisfactionCriterion= ruleSatisfactionCriterion EOF
            {
             newCompositeNode(grammarAccess.getSatisfactionCriterionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSatisfactionCriterion=ruleSatisfactionCriterion();

            state._fsp--;

             current =iv_ruleSatisfactionCriterion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSatisfactionCriterion"


    // $ANTLR start "ruleSatisfactionCriterion"
    // InternalInfluenceDSL.g:524:1: ruleSatisfactionCriterion returns [EObject current=null] : (otherlv_0= 'SatisfactionCriterion' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) otherlv_4= 'constrains' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= 'satisfied' otherlv_9= 'when' ( (lv_marginDefinition_10_0= ruleEString ) ) otherlv_11= 'languageType' ( (lv_language_12_0= ruleLanguageType ) ) ) ;
    public final EObject ruleSatisfactionCriterion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_marginDefinition_10_0 = null;

        Enumerator lv_language_12_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:530:2: ( (otherlv_0= 'SatisfactionCriterion' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) otherlv_4= 'constrains' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= 'satisfied' otherlv_9= 'when' ( (lv_marginDefinition_10_0= ruleEString ) ) otherlv_11= 'languageType' ( (lv_language_12_0= ruleLanguageType ) ) ) )
            // InternalInfluenceDSL.g:531:2: (otherlv_0= 'SatisfactionCriterion' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) otherlv_4= 'constrains' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= 'satisfied' otherlv_9= 'when' ( (lv_marginDefinition_10_0= ruleEString ) ) otherlv_11= 'languageType' ( (lv_language_12_0= ruleLanguageType ) ) )
            {
            // InternalInfluenceDSL.g:531:2: (otherlv_0= 'SatisfactionCriterion' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) otherlv_4= 'constrains' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= 'satisfied' otherlv_9= 'when' ( (lv_marginDefinition_10_0= ruleEString ) ) otherlv_11= 'languageType' ( (lv_language_12_0= ruleLanguageType ) ) )
            // InternalInfluenceDSL.g:532:3: otherlv_0= 'SatisfactionCriterion' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) otherlv_4= 'constrains' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= 'satisfied' otherlv_9= 'when' ( (lv_marginDefinition_10_0= ruleEString ) ) otherlv_11= 'languageType' ( (lv_language_12_0= ruleLanguageType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSatisfactionCriterionAccess().getSatisfactionCriterionKeyword_0());
            		
            // InternalInfluenceDSL.g:536:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:537:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:537:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:538:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSatisfactionCriterionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSatisfactionCriterionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSatisfactionCriterionAccess().getForKeyword_2());
            		
            // InternalInfluenceDSL.g:559:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:560:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:560:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:561:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSatisfactionCriterionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSatisfactionCriterionAccess().getRequirementRefEObjectCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSatisfactionCriterionAccess().getConstrainsKeyword_4());
            		
            // InternalInfluenceDSL.g:579:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:580:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:580:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:581:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSatisfactionCriterionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSatisfactionCriterionAccess().getConstrainedSRPsSystemResponsePropertyCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:595:3: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInfluenceDSL.g:596:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSatisfactionCriterionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:600:4: ( ( ruleQualifiedName ) )
            	    // InternalInfluenceDSL.g:601:5: ( ruleQualifiedName )
            	    {
            	    // InternalInfluenceDSL.g:601:5: ( ruleQualifiedName )
            	    // InternalInfluenceDSL.g:602:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSatisfactionCriterionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSatisfactionCriterionAccess().getConstrainedSRPsSystemResponsePropertyCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getSatisfactionCriterionAccess().getSatisfiedKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSatisfactionCriterionAccess().getWhenKeyword_8());
            		
            // InternalInfluenceDSL.g:625:3: ( (lv_marginDefinition_10_0= ruleEString ) )
            // InternalInfluenceDSL.g:626:4: (lv_marginDefinition_10_0= ruleEString )
            {
            // InternalInfluenceDSL.g:626:4: (lv_marginDefinition_10_0= ruleEString )
            // InternalInfluenceDSL.g:627:5: lv_marginDefinition_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSatisfactionCriterionAccess().getMarginDefinitionEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_marginDefinition_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSatisfactionCriterionRule());
            					}
            					set(
            						current,
            						"marginDefinition",
            						lv_marginDefinition_10_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getSatisfactionCriterionAccess().getLanguageTypeKeyword_10());
            		
            // InternalInfluenceDSL.g:648:3: ( (lv_language_12_0= ruleLanguageType ) )
            // InternalInfluenceDSL.g:649:4: (lv_language_12_0= ruleLanguageType )
            {
            // InternalInfluenceDSL.g:649:4: (lv_language_12_0= ruleLanguageType )
            // InternalInfluenceDSL.g:650:5: lv_language_12_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getSatisfactionCriterionAccess().getLanguageLanguageTypeEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_language_12_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSatisfactionCriterionRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_12_0,
            						"fr.inria.kairos.influence.InfluenceDSL.LanguageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSatisfactionCriterion"


    // $ANTLR start "entryRuleEnvironmentalFactor"
    // InternalInfluenceDSL.g:671:1: entryRuleEnvironmentalFactor returns [EObject current=null] : iv_ruleEnvironmentalFactor= ruleEnvironmentalFactor EOF ;
    public final EObject entryRuleEnvironmentalFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentalFactor = null;


        try {
            // InternalInfluenceDSL.g:671:60: (iv_ruleEnvironmentalFactor= ruleEnvironmentalFactor EOF )
            // InternalInfluenceDSL.g:672:2: iv_ruleEnvironmentalFactor= ruleEnvironmentalFactor EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentalFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentalFactor=ruleEnvironmentalFactor();

            state._fsp--;

             current =iv_ruleEnvironmentalFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentalFactor"


    // $ANTLR start "ruleEnvironmentalFactor"
    // InternalInfluenceDSL.g:678:1: ruleEnvironmentalFactor returns [EObject current=null] : ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleEnvironmentalFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_flexibility_6_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:684:2: ( ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:685:2: ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:685:2: ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:686:3: () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )?
            {
            // InternalInfluenceDSL.g:686:3: ()
            // InternalInfluenceDSL.g:687:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentalFactorAccess().getEnvironmentalFactorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentalFactorAccess().getEnvironmentalFactorKeyword_1());
            		
            // InternalInfluenceDSL.g:697:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:698:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:698:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:699:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentalFactorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentalFactorAccess().getDescriptionKeyword_3());
            		
            // InternalInfluenceDSL.g:720:3: ( (lv_description_4_0= ruleEString ) )
            // InternalInfluenceDSL.g:721:4: (lv_description_4_0= ruleEString )
            {
            // InternalInfluenceDSL.g:721:4: (lv_description_4_0= ruleEString )
            // InternalInfluenceDSL.g:722:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_description_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentalFactorRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:739:3: (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalInfluenceDSL.g:740:4: otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentalFactorAccess().getFlexibilityKeyword_5_0());
                    			
                    // InternalInfluenceDSL.g:744:4: ( (lv_flexibility_6_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:745:5: (lv_flexibility_6_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:745:5: (lv_flexibility_6_0= ruleEDouble )
                    // InternalInfluenceDSL.g:746:6: lv_flexibility_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getFlexibilityEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_flexibility_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorRule());
                    						}
                    						set(
                    							current,
                    							"flexibility",
                    							lv_flexibility_6_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentalFactor"


    // $ANTLR start "entryRuleDesignArtifact"
    // InternalInfluenceDSL.g:768:1: entryRuleDesignArtifact returns [EObject current=null] : iv_ruleDesignArtifact= ruleDesignArtifact EOF ;
    public final EObject entryRuleDesignArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignArtifact = null;


        try {
            // InternalInfluenceDSL.g:768:55: (iv_ruleDesignArtifact= ruleDesignArtifact EOF )
            // InternalInfluenceDSL.g:769:2: iv_ruleDesignArtifact= ruleDesignArtifact EOF
            {
             newCompositeNode(grammarAccess.getDesignArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesignArtifact=ruleDesignArtifact();

            state._fsp--;

             current =iv_ruleDesignArtifact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesignArtifact"


    // $ANTLR start "ruleDesignArtifact"
    // InternalInfluenceDSL.g:775:1: ruleDesignArtifact returns [EObject current=null] : ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleDesignArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_changeability_6_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:781:2: ( ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:782:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:782:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:783:3: () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )?
            {
            // InternalInfluenceDSL.g:783:3: ()
            // InternalInfluenceDSL.g:784:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1());
            		
            // InternalInfluenceDSL.g:794:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:795:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:795:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:796:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesignArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalInfluenceDSL.g:817:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:818:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:818:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:819:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignArtifactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:833:3: (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalInfluenceDSL.g:834:4: otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getDesignArtifactAccess().getChangeabilityKeyword_5_0());
                    			
                    // InternalInfluenceDSL.g:838:4: ( (lv_changeability_6_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:839:5: (lv_changeability_6_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:839:5: (lv_changeability_6_0= ruleEDouble )
                    // InternalInfluenceDSL.g:840:6: lv_changeability_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getDesignArtifactAccess().getChangeabilityEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_changeability_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDesignArtifactRule());
                    						}
                    						set(
                    							current,
                    							"changeability",
                    							lv_changeability_6_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesignArtifact"


    // $ANTLR start "entryRuleArtifactParticipant"
    // InternalInfluenceDSL.g:862:1: entryRuleArtifactParticipant returns [EObject current=null] : iv_ruleArtifactParticipant= ruleArtifactParticipant EOF ;
    public final EObject entryRuleArtifactParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactParticipant = null;


        try {
            // InternalInfluenceDSL.g:862:60: (iv_ruleArtifactParticipant= ruleArtifactParticipant EOF )
            // InternalInfluenceDSL.g:863:2: iv_ruleArtifactParticipant= ruleArtifactParticipant EOF
            {
             newCompositeNode(grammarAccess.getArtifactParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifactParticipant=ruleArtifactParticipant();

            state._fsp--;

             current =iv_ruleArtifactParticipant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifactParticipant"


    // $ANTLR start "ruleArtifactParticipant"
    // InternalInfluenceDSL.g:869:1: ruleArtifactParticipant returns [EObject current=null] : (otherlv_0= 'ArtifactParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleArtifactParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:875:2: ( (otherlv_0= 'ArtifactParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:876:2: (otherlv_0= 'ArtifactParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:876:2: (otherlv_0= 'ArtifactParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:877:3: otherlv_0= 'ArtifactParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactParticipantAccess().getArtifactParticipantKeyword_0());
            		
            // InternalInfluenceDSL.g:881:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:882:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:882:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:883:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArtifactParticipantAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactParticipantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactParticipantAccess().getTargetKeyword_2());
            		
            // InternalInfluenceDSL.g:904:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:905:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:905:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:906:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArtifactParticipantAccess().getTargetDesignArtifactCrossReference_3_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:920:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInfluenceDSL.g:921:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactParticipantAccess().getConfidenceKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:925:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:926:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:926:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:927:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getArtifactParticipantAccess().getConfidenceEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactParticipantRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifactParticipant"


    // $ANTLR start "entryRuleSRPInputParticipant"
    // InternalInfluenceDSL.g:949:1: entryRuleSRPInputParticipant returns [EObject current=null] : iv_ruleSRPInputParticipant= ruleSRPInputParticipant EOF ;
    public final EObject entryRuleSRPInputParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRPInputParticipant = null;


        try {
            // InternalInfluenceDSL.g:949:60: (iv_ruleSRPInputParticipant= ruleSRPInputParticipant EOF )
            // InternalInfluenceDSL.g:950:2: iv_ruleSRPInputParticipant= ruleSRPInputParticipant EOF
            {
             newCompositeNode(grammarAccess.getSRPInputParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSRPInputParticipant=ruleSRPInputParticipant();

            state._fsp--;

             current =iv_ruleSRPInputParticipant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSRPInputParticipant"


    // $ANTLR start "ruleSRPInputParticipant"
    // InternalInfluenceDSL.g:956:1: ruleSRPInputParticipant returns [EObject current=null] : (otherlv_0= 'SRPInputParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleSRPInputParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:962:2: ( (otherlv_0= 'SRPInputParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:963:2: (otherlv_0= 'SRPInputParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:963:2: (otherlv_0= 'SRPInputParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:964:3: otherlv_0= 'SRPInputParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSRPInputParticipantAccess().getSRPInputParticipantKeyword_0());
            		
            // InternalInfluenceDSL.g:968:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:969:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:969:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:970:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSRPInputParticipantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSRPInputParticipantAccess().getTargetKeyword_2());
            		
            // InternalInfluenceDSL.g:991:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:992:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:992:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:993:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSRPInputParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getTargetSystemResponsePropertyCrossReference_3_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1007:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalInfluenceDSL.g:1008:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getSRPInputParticipantAccess().getConfidenceKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:1012:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1013:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1013:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1014:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getConfidenceEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSRPInputParticipantRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSRPInputParticipant"


    // $ANTLR start "entryRuleEnvironmentalFactorParticipant"
    // InternalInfluenceDSL.g:1036:1: entryRuleEnvironmentalFactorParticipant returns [EObject current=null] : iv_ruleEnvironmentalFactorParticipant= ruleEnvironmentalFactorParticipant EOF ;
    public final EObject entryRuleEnvironmentalFactorParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentalFactorParticipant = null;


        try {
            // InternalInfluenceDSL.g:1036:71: (iv_ruleEnvironmentalFactorParticipant= ruleEnvironmentalFactorParticipant EOF )
            // InternalInfluenceDSL.g:1037:2: iv_ruleEnvironmentalFactorParticipant= ruleEnvironmentalFactorParticipant EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentalFactorParticipant=ruleEnvironmentalFactorParticipant();

            state._fsp--;

             current =iv_ruleEnvironmentalFactorParticipant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentalFactorParticipant"


    // $ANTLR start "ruleEnvironmentalFactorParticipant"
    // InternalInfluenceDSL.g:1043:1: ruleEnvironmentalFactorParticipant returns [EObject current=null] : (otherlv_0= 'EnvironmentalFactorParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) ) )? ) ;
    public final EObject ruleEnvironmentalFactorParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;

        EObject lv_admissibleSpace_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1049:2: ( (otherlv_0= 'EnvironmentalFactorParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) ) )? ) )
            // InternalInfluenceDSL.g:1050:2: (otherlv_0= 'EnvironmentalFactorParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) ) )? )
            {
            // InternalInfluenceDSL.g:1050:2: (otherlv_0= 'EnvironmentalFactorParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) ) )? )
            // InternalInfluenceDSL.g:1051:3: otherlv_0= 'EnvironmentalFactorParticipant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'target' ( ( ruleQualifiedName ) ) (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentalFactorParticipantAccess().getEnvironmentalFactorParticipantKeyword_0());
            		
            // InternalInfluenceDSL.g:1055:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1056:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1056:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1057:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentalFactorParticipantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentalFactorParticipantAccess().getTargetKeyword_2());
            		
            // InternalInfluenceDSL.g:1078:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1079:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1079:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1080:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentalFactorParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getTargetEnvironmentalFactorCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1094:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInfluenceDSL.g:1095:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentalFactorParticipantAccess().getConfidenceKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:1099:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1100:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1100:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1101:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getConfidenceEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorParticipantRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1119:3: (otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalInfluenceDSL.g:1120:4: otherlv_6= 'admissibleSpace' ( (lv_admissibleSpace_7_0= ruleValueSpec ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentalFactorParticipantAccess().getAdmissibleSpaceKeyword_5_0());
                    			
                    // InternalInfluenceDSL.g:1124:4: ( (lv_admissibleSpace_7_0= ruleValueSpec ) )
                    // InternalInfluenceDSL.g:1125:5: (lv_admissibleSpace_7_0= ruleValueSpec )
                    {
                    // InternalInfluenceDSL.g:1125:5: (lv_admissibleSpace_7_0= ruleValueSpec )
                    // InternalInfluenceDSL.g:1126:6: lv_admissibleSpace_7_0= ruleValueSpec
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getAdmissibleSpaceValueSpecParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_admissibleSpace_7_0=ruleValueSpec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorParticipantRule());
                    						}
                    						set(
                    							current,
                    							"admissibleSpace",
                    							lv_admissibleSpace_7_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.ValueSpec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentalFactorParticipant"


    // $ANTLR start "entryRuleValueSpec"
    // InternalInfluenceDSL.g:1148:1: entryRuleValueSpec returns [EObject current=null] : iv_ruleValueSpec= ruleValueSpec EOF ;
    public final EObject entryRuleValueSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpec = null;


        try {
            // InternalInfluenceDSL.g:1148:50: (iv_ruleValueSpec= ruleValueSpec EOF )
            // InternalInfluenceDSL.g:1149:2: iv_ruleValueSpec= ruleValueSpec EOF
            {
             newCompositeNode(grammarAccess.getValueSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueSpec=ruleValueSpec();

            state._fsp--;

             current =iv_ruleValueSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueSpec"


    // $ANTLR start "ruleValueSpec"
    // InternalInfluenceDSL.g:1155:1: ruleValueSpec returns [EObject current=null] : (this_RangeValue_0= ruleRangeValue | this_ScalarValue_1= ruleScalarValue ) ;
    public final EObject ruleValueSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RangeValue_0 = null;

        EObject this_ScalarValue_1 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1161:2: ( (this_RangeValue_0= ruleRangeValue | this_ScalarValue_1= ruleScalarValue ) )
            // InternalInfluenceDSL.g:1162:2: (this_RangeValue_0= ruleRangeValue | this_ScalarValue_1= ruleScalarValue )
            {
            // InternalInfluenceDSL.g:1162:2: (this_RangeValue_0= ruleRangeValue | this_ScalarValue_1= ruleScalarValue )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalInfluenceDSL.g:1163:3: this_RangeValue_0= ruleRangeValue
                    {

                    			newCompositeNode(grammarAccess.getValueSpecAccess().getRangeValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeValue_0=ruleRangeValue();

                    state._fsp--;


                    			current = this_RangeValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:1172:3: this_ScalarValue_1= ruleScalarValue
                    {

                    			newCompositeNode(grammarAccess.getValueSpecAccess().getScalarValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarValue_1=ruleScalarValue();

                    state._fsp--;


                    			current = this_ScalarValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueSpec"


    // $ANTLR start "entryRuleScalarValue"
    // InternalInfluenceDSL.g:1184:1: entryRuleScalarValue returns [EObject current=null] : iv_ruleScalarValue= ruleScalarValue EOF ;
    public final EObject entryRuleScalarValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarValue = null;


        try {
            // InternalInfluenceDSL.g:1184:52: (iv_ruleScalarValue= ruleScalarValue EOF )
            // InternalInfluenceDSL.g:1185:2: iv_ruleScalarValue= ruleScalarValue EOF
            {
             newCompositeNode(grammarAccess.getScalarValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarValue=ruleScalarValue();

            state._fsp--;

             current =iv_ruleScalarValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarValue"


    // $ANTLR start "ruleScalarValue"
    // InternalInfluenceDSL.g:1191:1: ruleScalarValue returns [EObject current=null] : (otherlv_0= 'value' ( (lv_value_1_0= ruleEDouble ) ) (otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleScalarValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_unit_3_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1197:2: ( (otherlv_0= 'value' ( (lv_value_1_0= ruleEDouble ) ) (otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:1198:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleEDouble ) ) (otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:1198:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleEDouble ) ) (otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:1199:3: otherlv_0= 'value' ( (lv_value_1_0= ruleEDouble ) ) (otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarValueAccess().getValueKeyword_0());
            		
            // InternalInfluenceDSL.g:1203:3: ( (lv_value_1_0= ruleEDouble ) )
            // InternalInfluenceDSL.g:1204:4: (lv_value_1_0= ruleEDouble )
            {
            // InternalInfluenceDSL.g:1204:4: (lv_value_1_0= ruleEDouble )
            // InternalInfluenceDSL.g:1205:5: lv_value_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getScalarValueAccess().getValueEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1222:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInfluenceDSL.g:1223:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getScalarValueAccess().getUnitKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:1227:4: ( (lv_unit_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1228:5: (lv_unit_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1228:5: (lv_unit_3_0= ruleEString )
                    // InternalInfluenceDSL.g:1229:6: lv_unit_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScalarValueAccess().getUnitEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScalarValueRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarValue"


    // $ANTLR start "entryRuleRangeValue"
    // InternalInfluenceDSL.g:1251:1: entryRuleRangeValue returns [EObject current=null] : iv_ruleRangeValue= ruleRangeValue EOF ;
    public final EObject entryRuleRangeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeValue = null;


        try {
            // InternalInfluenceDSL.g:1251:51: (iv_ruleRangeValue= ruleRangeValue EOF )
            // InternalInfluenceDSL.g:1252:2: iv_ruleRangeValue= ruleRangeValue EOF
            {
             newCompositeNode(grammarAccess.getRangeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeValue=ruleRangeValue();

            state._fsp--;

             current =iv_ruleRangeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeValue"


    // $ANTLR start "ruleRangeValue"
    // InternalInfluenceDSL.g:1258:1: ruleRangeValue returns [EObject current=null] : (otherlv_0= 'range' otherlv_1= '[' ( (lv_lower_2_0= ruleEDouble ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleEDouble ) ) otherlv_5= ']' (otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) ) )? (otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) ) )? (otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleRangeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_lower_2_0 = null;

        AntlrDatatypeRuleToken lv_upper_4_0 = null;

        AntlrDatatypeRuleToken lv_nominal_7_0 = null;

        AntlrDatatypeRuleToken lv_step_9_0 = null;

        AntlrDatatypeRuleToken lv_unit_11_0 = null;

        AntlrDatatypeRuleToken lv_inclusiveLower_13_0 = null;

        AntlrDatatypeRuleToken lv_inclusiveUpper_15_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1264:2: ( (otherlv_0= 'range' otherlv_1= '[' ( (lv_lower_2_0= ruleEDouble ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleEDouble ) ) otherlv_5= ']' (otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) ) )? (otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) ) )? (otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) ) )? ) )
            // InternalInfluenceDSL.g:1265:2: (otherlv_0= 'range' otherlv_1= '[' ( (lv_lower_2_0= ruleEDouble ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleEDouble ) ) otherlv_5= ']' (otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) ) )? (otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) ) )? (otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) ) )? )
            {
            // InternalInfluenceDSL.g:1265:2: (otherlv_0= 'range' otherlv_1= '[' ( (lv_lower_2_0= ruleEDouble ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleEDouble ) ) otherlv_5= ']' (otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) ) )? (otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) ) )? (otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) ) )? )
            // InternalInfluenceDSL.g:1266:3: otherlv_0= 'range' otherlv_1= '[' ( (lv_lower_2_0= ruleEDouble ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleEDouble ) ) otherlv_5= ']' (otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) ) )? (otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) ) )? (otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeValueAccess().getRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalInfluenceDSL.g:1274:3: ( (lv_lower_2_0= ruleEDouble ) )
            // InternalInfluenceDSL.g:1275:4: (lv_lower_2_0= ruleEDouble )
            {
            // InternalInfluenceDSL.g:1275:4: (lv_lower_2_0= ruleEDouble )
            // InternalInfluenceDSL.g:1276:5: lv_lower_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRangeValueAccess().getLowerEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_lower_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeValueRule());
            					}
            					set(
            						current,
            						"lower",
            						lv_lower_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRangeValueAccess().getFullStopFullStopKeyword_3());
            		
            // InternalInfluenceDSL.g:1297:3: ( (lv_upper_4_0= ruleEDouble ) )
            // InternalInfluenceDSL.g:1298:4: (lv_upper_4_0= ruleEDouble )
            {
            // InternalInfluenceDSL.g:1298:4: (lv_upper_4_0= ruleEDouble )
            // InternalInfluenceDSL.g:1299:5: lv_upper_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRangeValueAccess().getUpperEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_upper_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeValueRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_4_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getRangeValueAccess().getRightSquareBracketKeyword_5());
            		
            // InternalInfluenceDSL.g:1320:3: (otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalInfluenceDSL.g:1321:4: otherlv_6= 'nominal' ( (lv_nominal_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getRangeValueAccess().getNominalKeyword_6_0());
                    			
                    // InternalInfluenceDSL.g:1325:4: ( (lv_nominal_7_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1326:5: (lv_nominal_7_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1326:5: (lv_nominal_7_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1327:6: lv_nominal_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRangeValueAccess().getNominalEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_nominal_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeValueRule());
                    						}
                    						set(
                    							current,
                    							"nominal",
                    							lv_nominal_7_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1345:3: (otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalInfluenceDSL.g:1346:4: otherlv_8= 'step' ( (lv_step_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getRangeValueAccess().getStepKeyword_7_0());
                    			
                    // InternalInfluenceDSL.g:1350:4: ( (lv_step_9_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1351:5: (lv_step_9_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1351:5: (lv_step_9_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1352:6: lv_step_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRangeValueAccess().getStepEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_step_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeValueRule());
                    						}
                    						set(
                    							current,
                    							"step",
                    							lv_step_9_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1370:3: (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:1371:4: otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRangeValueAccess().getUnitKeyword_8_0());
                    			
                    // InternalInfluenceDSL.g:1375:4: ( (lv_unit_11_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1376:5: (lv_unit_11_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1376:5: (lv_unit_11_0= ruleEString )
                    // InternalInfluenceDSL.g:1377:6: lv_unit_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRangeValueAccess().getUnitEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_unit_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeValueRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_11_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1395:3: (otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalInfluenceDSL.g:1396:4: otherlv_12= 'inclusiveLower' ( (lv_inclusiveLower_13_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_32); 

                    				newLeafNode(otherlv_12, grammarAccess.getRangeValueAccess().getInclusiveLowerKeyword_9_0());
                    			
                    // InternalInfluenceDSL.g:1400:4: ( (lv_inclusiveLower_13_0= ruleEBoolean ) )
                    // InternalInfluenceDSL.g:1401:5: (lv_inclusiveLower_13_0= ruleEBoolean )
                    {
                    // InternalInfluenceDSL.g:1401:5: (lv_inclusiveLower_13_0= ruleEBoolean )
                    // InternalInfluenceDSL.g:1402:6: lv_inclusiveLower_13_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getRangeValueAccess().getInclusiveLowerEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_inclusiveLower_13_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeValueRule());
                    						}
                    						set(
                    							current,
                    							"inclusiveLower",
                    							lv_inclusiveLower_13_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1420:3: (otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalInfluenceDSL.g:1421:4: otherlv_14= 'inclusiveUpper' ( (lv_inclusiveUpper_15_0= ruleEBoolean ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_32); 

                    				newLeafNode(otherlv_14, grammarAccess.getRangeValueAccess().getInclusiveUpperKeyword_10_0());
                    			
                    // InternalInfluenceDSL.g:1425:4: ( (lv_inclusiveUpper_15_0= ruleEBoolean ) )
                    // InternalInfluenceDSL.g:1426:5: (lv_inclusiveUpper_15_0= ruleEBoolean )
                    {
                    // InternalInfluenceDSL.g:1426:5: (lv_inclusiveUpper_15_0= ruleEBoolean )
                    // InternalInfluenceDSL.g:1427:6: lv_inclusiveUpper_15_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getRangeValueAccess().getInclusiveUpperEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inclusiveUpper_15_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeValueRule());
                    						}
                    						set(
                    							current,
                    							"inclusiveUpper",
                    							lv_inclusiveUpper_15_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeValue"


    // $ANTLR start "entryRuleParticipantRange"
    // InternalInfluenceDSL.g:1449:1: entryRuleParticipantRange returns [EObject current=null] : iv_ruleParticipantRange= ruleParticipantRange EOF ;
    public final EObject entryRuleParticipantRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantRange = null;


        try {
            // InternalInfluenceDSL.g:1449:57: (iv_ruleParticipantRange= ruleParticipantRange EOF )
            // InternalInfluenceDSL.g:1450:2: iv_ruleParticipantRange= ruleParticipantRange EOF
            {
             newCompositeNode(grammarAccess.getParticipantRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantRange=ruleParticipantRange();

            state._fsp--;

             current =iv_ruleParticipantRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantRange"


    // $ANTLR start "ruleParticipantRange"
    // InternalInfluenceDSL.g:1456:1: ruleParticipantRange returns [EObject current=null] : (otherlv_0= 'ParticipantRange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'of' ( ( ruleQualifiedName ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpec ) ) ) ;
    public final EObject ruleParticipantRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1462:2: ( (otherlv_0= 'ParticipantRange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'of' ( ( ruleQualifiedName ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpec ) ) ) )
            // InternalInfluenceDSL.g:1463:2: (otherlv_0= 'ParticipantRange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'of' ( ( ruleQualifiedName ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpec ) ) )
            {
            // InternalInfluenceDSL.g:1463:2: (otherlv_0= 'ParticipantRange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'of' ( ( ruleQualifiedName ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpec ) ) )
            // InternalInfluenceDSL.g:1464:3: otherlv_0= 'ParticipantRange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'of' ( ( ruleQualifiedName ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpec ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantRangeAccess().getParticipantRangeKeyword_0());
            		
            // InternalInfluenceDSL.g:1468:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1469:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1469:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1470:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParticipantRangeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRangeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getParticipantRangeAccess().getOfKeyword_2());
            		
            // InternalInfluenceDSL.g:1491:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1492:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1492:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1493:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantRangeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParticipantRangeAccess().getParticipantParticipantCrossReference_3_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getParticipantRangeAccess().getValueKeyword_4());
            		
            // InternalInfluenceDSL.g:1511:3: ( (lv_value_5_0= ruleValueSpec ) )
            // InternalInfluenceDSL.g:1512:4: (lv_value_5_0= ruleValueSpec )
            {
            // InternalInfluenceDSL.g:1512:4: (lv_value_5_0= ruleValueSpec )
            // InternalInfluenceDSL.g:1513:5: lv_value_5_0= ruleValueSpec
            {

            					newCompositeNode(grammarAccess.getParticipantRangeAccess().getValueValueSpecParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_5_0=ruleValueSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRangeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"fr.inria.kairos.influence.InfluenceDSL.ValueSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantRange"


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:1534:1: entryRuleInfluence returns [EObject current=null] : iv_ruleInfluence= ruleInfluence EOF ;
    public final EObject entryRuleInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluence = null;


        try {
            // InternalInfluenceDSL.g:1534:50: (iv_ruleInfluence= ruleInfluence EOF )
            // InternalInfluenceDSL.g:1535:2: iv_ruleInfluence= ruleInfluence EOF
            {
             newCompositeNode(grammarAccess.getInfluenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfluence=ruleInfluence();

            state._fsp--;

             current =iv_ruleInfluence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfluence"


    // $ANTLR start "ruleInfluence"
    // InternalInfluenceDSL.g:1541:1: ruleInfluence returns [EObject current=null] : (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#' )? otherlv_5= 'participants' otherlv_6= ':' ( (lv_ownedParticipants_7_0= ruleParticipant ) ) (otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) )* otherlv_10= ';' otherlv_11= 'influenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) otherlv_13= ';' otherlv_14= 'affects' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_ownedParticipants_7_0 = null;

        EObject lv_ownedParticipants_9_0 = null;

        EObject lv_ownedInfluenceFunction_12_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1547:2: ( (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#' )? otherlv_5= 'participants' otherlv_6= ':' ( (lv_ownedParticipants_7_0= ruleParticipant ) ) (otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) )* otherlv_10= ';' otherlv_11= 'influenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) otherlv_13= ';' otherlv_14= 'affects' ( ( ruleQualifiedName ) ) ) )
            // InternalInfluenceDSL.g:1548:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#' )? otherlv_5= 'participants' otherlv_6= ':' ( (lv_ownedParticipants_7_0= ruleParticipant ) ) (otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) )* otherlv_10= ';' otherlv_11= 'influenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) otherlv_13= ';' otherlv_14= 'affects' ( ( ruleQualifiedName ) ) )
            {
            // InternalInfluenceDSL.g:1548:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#' )? otherlv_5= 'participants' otherlv_6= ':' ( (lv_ownedParticipants_7_0= ruleParticipant ) ) (otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) )* otherlv_10= ';' otherlv_11= 'influenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) otherlv_13= ';' otherlv_14= 'affects' ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:1549:3: otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#' )? otherlv_5= 'participants' otherlv_6= ':' ( (lv_ownedParticipants_7_0= ruleParticipant ) ) (otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) )* otherlv_10= ';' otherlv_11= 'influenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) otherlv_13= ';' otherlv_14= 'affects' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluenceAccess().getInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:1553:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1554:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1554:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1555:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1572:3: (otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalInfluenceDSL.g:1573:4: otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '**#'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:1577:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1578:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1578:5: (lv_description_3_0= ruleEString )
                    // InternalInfluenceDSL.g:1579:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getInfluenceAccess().getParticipantsKeyword_3());
            		
            otherlv_6=(Token)match(input,48,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getInfluenceAccess().getColonKeyword_4());
            		
            // InternalInfluenceDSL.g:1609:3: ( (lv_ownedParticipants_7_0= ruleParticipant ) )
            // InternalInfluenceDSL.g:1610:4: (lv_ownedParticipants_7_0= ruleParticipant )
            {
            // InternalInfluenceDSL.g:1610:4: (lv_ownedParticipants_7_0= ruleParticipant )
            // InternalInfluenceDSL.g:1611:5: lv_ownedParticipants_7_0= ruleParticipant
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedParticipantsParticipantParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_41);
            lv_ownedParticipants_7_0=ruleParticipant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"ownedParticipants",
            						lv_ownedParticipants_7_0,
            						"fr.inria.kairos.influence.InfluenceDSL.Participant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1628:3: (otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==12) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1629:4: otherlv_8= ',' ( (lv_ownedParticipants_9_0= ruleParticipant ) )
            	    {
            	    otherlv_8=(Token)match(input,12,FOLLOW_40); 

            	    				newLeafNode(otherlv_8, grammarAccess.getInfluenceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:1633:4: ( (lv_ownedParticipants_9_0= ruleParticipant ) )
            	    // InternalInfluenceDSL.g:1634:5: (lv_ownedParticipants_9_0= ruleParticipant )
            	    {
            	    // InternalInfluenceDSL.g:1634:5: (lv_ownedParticipants_9_0= ruleParticipant )
            	    // InternalInfluenceDSL.g:1635:6: lv_ownedParticipants_9_0= ruleParticipant
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedParticipantsParticipantParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_ownedParticipants_9_0=ruleParticipant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedParticipants",
            	    							lv_ownedParticipants_9_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.Participant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_10=(Token)match(input,49,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getInfluenceAccess().getSemicolonKeyword_7());
            		
            otherlv_11=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getInfluenceAccess().getInfluenceFunctionKeyword_8());
            		
            // InternalInfluenceDSL.g:1661:3: ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) )
            // InternalInfluenceDSL.g:1662:4: (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction )
            {
            // InternalInfluenceDSL.g:1662:4: (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction )
            // InternalInfluenceDSL.g:1663:5: lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedInfluenceFunctionInfluenceFunctionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_43);
            lv_ownedInfluenceFunction_12_0=ruleInfluenceFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					set(
            						current,
            						"ownedInfluenceFunction",
            						lv_ownedInfluenceFunction_12_0,
            						"fr.inria.kairos.influence.InfluenceDSL.InfluenceFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,49,FOLLOW_44); 

            			newLeafNode(otherlv_13, grammarAccess.getInfluenceAccess().getSemicolonKeyword_10());
            		
            otherlv_14=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_14, grammarAccess.getInfluenceAccess().getAffectsKeyword_11());
            		
            // InternalInfluenceDSL.g:1688:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1689:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1689:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1690:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOutputSRPSystemResponsePropertyCrossReference_12_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfluence"


    // $ANTLR start "entryRuleCompositeInfluence"
    // InternalInfluenceDSL.g:1708:1: entryRuleCompositeInfluence returns [EObject current=null] : iv_ruleCompositeInfluence= ruleCompositeInfluence EOF ;
    public final EObject entryRuleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeInfluence = null;


        try {
            // InternalInfluenceDSL.g:1708:59: (iv_ruleCompositeInfluence= ruleCompositeInfluence EOF )
            // InternalInfluenceDSL.g:1709:2: iv_ruleCompositeInfluence= ruleCompositeInfluence EOF
            {
             newCompositeNode(grammarAccess.getCompositeInfluenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeInfluence=ruleCompositeInfluence();

            state._fsp--;

             current =iv_ruleCompositeInfluence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeInfluence"


    // $ANTLR start "ruleCompositeInfluence"
    // InternalInfluenceDSL.g:1715:1: ruleCompositeInfluence returns [EObject current=null] : (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'internalInfluences' otherlv_6= '(' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ')' otherlv_11= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) ) ;
    public final EObject ruleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_ownedInfluenceFunction_12_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1721:2: ( (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'internalInfluences' otherlv_6= '(' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ')' otherlv_11= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) ) )
            // InternalInfluenceDSL.g:1722:2: (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'internalInfluences' otherlv_6= '(' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ')' otherlv_11= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) )
            {
            // InternalInfluenceDSL.g:1722:2: (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'internalInfluences' otherlv_6= '(' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ')' otherlv_11= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) ) )
            // InternalInfluenceDSL.g:1723:3: otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'internalInfluences' otherlv_6= '(' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ')' otherlv_11= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeInfluenceAccess().getCompositeInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:1727:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1728:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1728:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1729:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1746:3: (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalInfluenceDSL.g:1747:4: otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_39); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositeInfluenceAccess().getDescriptionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeInfluenceAccess().getColonKeyword_2_1());
                    			
                    // InternalInfluenceDSL.g:1755:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1756:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1756:5: (lv_description_4_0= ruleEString )
                    // InternalInfluenceDSL.g:1757:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,53,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesKeyword_3());
            		
            otherlv_6=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeInfluenceAccess().getLeftParenthesisKeyword_4());
            		
            // InternalInfluenceDSL.g:1783:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1784:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1784:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1785:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_5_0());
            				
            pushFollow(FOLLOW_48);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1799:3: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1800:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_8=(Token)match(input,12,FOLLOW_9); 

            	    				newLeafNode(otherlv_8, grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:1804:4: ( ( ruleQualifiedName ) )
            	    // InternalInfluenceDSL.g:1805:5: ( ruleQualifiedName )
            	    {
            	    // InternalInfluenceDSL.g:1805:5: ( ruleQualifiedName )
            	    // InternalInfluenceDSL.g:1806:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositeInfluenceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_10=(Token)match(input,55,FOLLOW_49); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeInfluenceAccess().getRightParenthesisKeyword_7());
            		
            otherlv_11=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeInfluenceAccess().getOwnedInfluenceFunctionKeyword_8());
            		
            // InternalInfluenceDSL.g:1829:3: ( (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction ) )
            // InternalInfluenceDSL.g:1830:4: (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction )
            {
            // InternalInfluenceDSL.g:1830:4: (lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction )
            // InternalInfluenceDSL.g:1831:5: lv_ownedInfluenceFunction_12_0= ruleInfluenceFunction
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getOwnedInfluenceFunctionInfluenceFunctionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedInfluenceFunction_12_0=ruleInfluenceFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					set(
            						current,
            						"ownedInfluenceFunction",
            						lv_ownedInfluenceFunction_12_0,
            						"fr.inria.kairos.influence.InfluenceDSL.InfluenceFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeInfluence"


    // $ANTLR start "entryRuleInfluenceFunction"
    // InternalInfluenceDSL.g:1852:1: entryRuleInfluenceFunction returns [EObject current=null] : iv_ruleInfluenceFunction= ruleInfluenceFunction EOF ;
    public final EObject entryRuleInfluenceFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluenceFunction = null;


        try {
            // InternalInfluenceDSL.g:1852:58: (iv_ruleInfluenceFunction= ruleInfluenceFunction EOF )
            // InternalInfluenceDSL.g:1853:2: iv_ruleInfluenceFunction= ruleInfluenceFunction EOF
            {
             newCompositeNode(grammarAccess.getInfluenceFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfluenceFunction=ruleInfluenceFunction();

            state._fsp--;

             current =iv_ruleInfluenceFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfluenceFunction"


    // $ANTLR start "ruleInfluenceFunction"
    // InternalInfluenceDSL.g:1859:1: ruleInfluenceFunction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'representations' otherlv_4= '(' ( (lv_representations_5_0= ruleFunctionRepresentation ) ) (otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleInfluenceFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_representations_5_0 = null;

        EObject lv_representations_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1865:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'representations' otherlv_4= '(' ( (lv_representations_5_0= ruleFunctionRepresentation ) ) (otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) ) )* otherlv_8= ')' ) )
            // InternalInfluenceDSL.g:1866:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'representations' otherlv_4= '(' ( (lv_representations_5_0= ruleFunctionRepresentation ) ) (otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) ) )* otherlv_8= ')' )
            {
            // InternalInfluenceDSL.g:1866:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'representations' otherlv_4= '(' ( (lv_representations_5_0= ruleFunctionRepresentation ) ) (otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) ) )* otherlv_8= ')' )
            // InternalInfluenceDSL.g:1867:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'representations' otherlv_4= '(' ( (lv_representations_5_0= ruleFunctionRepresentation ) ) (otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) ) )* otherlv_8= ')'
            {
            // InternalInfluenceDSL.g:1867:3: ()
            // InternalInfluenceDSL.g:1868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfluenceFunctionAccess().getInfluenceFunctionAction_0(),
            					current);
            			

            }

            // InternalInfluenceDSL.g:1874:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1875:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1875:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1876:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluenceFunctionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getInfluenceFunctionAccess().getRepresentationsKeyword_3());
            		
            otherlv_4=(Token)match(input,54,FOLLOW_51); 

            			newLeafNode(otherlv_4, grammarAccess.getInfluenceFunctionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalInfluenceDSL.g:1905:3: ( (lv_representations_5_0= ruleFunctionRepresentation ) )
            // InternalInfluenceDSL.g:1906:4: (lv_representations_5_0= ruleFunctionRepresentation )
            {
            // InternalInfluenceDSL.g:1906:4: (lv_representations_5_0= ruleFunctionRepresentation )
            // InternalInfluenceDSL.g:1907:5: lv_representations_5_0= ruleFunctionRepresentation
            {

            					newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getRepresentationsFunctionRepresentationParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_representations_5_0=ruleFunctionRepresentation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            					}
            					add(
            						current,
            						"representations",
            						lv_representations_5_0,
            						"fr.inria.kairos.influence.InfluenceDSL.FunctionRepresentation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1924:3: (otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==12) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1925:4: otherlv_6= ',' ( (lv_representations_7_0= ruleFunctionRepresentation ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_51); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInfluenceFunctionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:1929:4: ( (lv_representations_7_0= ruleFunctionRepresentation ) )
            	    // InternalInfluenceDSL.g:1930:5: (lv_representations_7_0= ruleFunctionRepresentation )
            	    {
            	    // InternalInfluenceDSL.g:1930:5: (lv_representations_7_0= ruleFunctionRepresentation )
            	    // InternalInfluenceDSL.g:1931:6: lv_representations_7_0= ruleFunctionRepresentation
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getRepresentationsFunctionRepresentationParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_representations_7_0=ruleFunctionRepresentation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"representations",
            	    							lv_representations_7_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.FunctionRepresentation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInfluenceFunctionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfluenceFunction"


    // $ANTLR start "entryRuleFunctionRepresentation"
    // InternalInfluenceDSL.g:1957:1: entryRuleFunctionRepresentation returns [EObject current=null] : iv_ruleFunctionRepresentation= ruleFunctionRepresentation EOF ;
    public final EObject entryRuleFunctionRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionRepresentation = null;


        try {
            // InternalInfluenceDSL.g:1957:63: (iv_ruleFunctionRepresentation= ruleFunctionRepresentation EOF )
            // InternalInfluenceDSL.g:1958:2: iv_ruleFunctionRepresentation= ruleFunctionRepresentation EOF
            {
             newCompositeNode(grammarAccess.getFunctionRepresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionRepresentation=ruleFunctionRepresentation();

            state._fsp--;

             current =iv_ruleFunctionRepresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionRepresentation"


    // $ANTLR start "ruleFunctionRepresentation"
    // InternalInfluenceDSL.g:1964:1: ruleFunctionRepresentation returns [EObject current=null] : (this_NaturalLanguageFunction_0= ruleNaturalLanguageFunction | this_ParticipantImpactFunction_1= ruleParticipantImpactFunction | this_AnalyticExpressionFunction_2= ruleAnalyticExpressionFunction | this_MonotonicityTable_3= ruleMonotonicityTable ) ;
    public final EObject ruleFunctionRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalLanguageFunction_0 = null;

        EObject this_ParticipantImpactFunction_1 = null;

        EObject this_AnalyticExpressionFunction_2 = null;

        EObject this_MonotonicityTable_3 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1970:2: ( (this_NaturalLanguageFunction_0= ruleNaturalLanguageFunction | this_ParticipantImpactFunction_1= ruleParticipantImpactFunction | this_AnalyticExpressionFunction_2= ruleAnalyticExpressionFunction | this_MonotonicityTable_3= ruleMonotonicityTable ) )
            // InternalInfluenceDSL.g:1971:2: (this_NaturalLanguageFunction_0= ruleNaturalLanguageFunction | this_ParticipantImpactFunction_1= ruleParticipantImpactFunction | this_AnalyticExpressionFunction_2= ruleAnalyticExpressionFunction | this_MonotonicityTable_3= ruleMonotonicityTable )
            {
            // InternalInfluenceDSL.g:1971:2: (this_NaturalLanguageFunction_0= ruleNaturalLanguageFunction | this_ParticipantImpactFunction_1= ruleParticipantImpactFunction | this_AnalyticExpressionFunction_2= ruleAnalyticExpressionFunction | this_MonotonicityTable_3= ruleMonotonicityTable )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt28=1;
                }
                break;
            case 62:
                {
                alt28=2;
                }
                break;
            case 69:
                {
                alt28=3;
                }
                break;
            case 72:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalInfluenceDSL.g:1972:3: this_NaturalLanguageFunction_0= ruleNaturalLanguageFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionRepresentationAccess().getNaturalLanguageFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NaturalLanguageFunction_0=ruleNaturalLanguageFunction();

                    state._fsp--;


                    			current = this_NaturalLanguageFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:1981:3: this_ParticipantImpactFunction_1= ruleParticipantImpactFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionRepresentationAccess().getParticipantImpactFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParticipantImpactFunction_1=ruleParticipantImpactFunction();

                    state._fsp--;


                    			current = this_ParticipantImpactFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:1990:3: this_AnalyticExpressionFunction_2= ruleAnalyticExpressionFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionRepresentationAccess().getAnalyticExpressionFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalyticExpressionFunction_2=ruleAnalyticExpressionFunction();

                    state._fsp--;


                    			current = this_AnalyticExpressionFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalInfluenceDSL.g:1999:3: this_MonotonicityTable_3= ruleMonotonicityTable
                    {

                    			newCompositeNode(grammarAccess.getFunctionRepresentationAccess().getMonotonicityTableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonotonicityTable_3=ruleMonotonicityTable();

                    state._fsp--;


                    			current = this_MonotonicityTable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionRepresentation"


    // $ANTLR start "entryRuleNaturalLanguageFunction"
    // InternalInfluenceDSL.g:2011:1: entryRuleNaturalLanguageFunction returns [EObject current=null] : iv_ruleNaturalLanguageFunction= ruleNaturalLanguageFunction EOF ;
    public final EObject entryRuleNaturalLanguageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLanguageFunction = null;


        try {
            // InternalInfluenceDSL.g:2011:64: (iv_ruleNaturalLanguageFunction= ruleNaturalLanguageFunction EOF )
            // InternalInfluenceDSL.g:2012:2: iv_ruleNaturalLanguageFunction= ruleNaturalLanguageFunction EOF
            {
             newCompositeNode(grammarAccess.getNaturalLanguageFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNaturalLanguageFunction=ruleNaturalLanguageFunction();

            state._fsp--;

             current =iv_ruleNaturalLanguageFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNaturalLanguageFunction"


    // $ANTLR start "ruleNaturalLanguageFunction"
    // InternalInfluenceDSL.g:2018:1: ruleNaturalLanguageFunction returns [EObject current=null] : (otherlv_0= 'NaturalLanguageFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'definition' ( (lv_definition_13_0= ruleEString ) ) ) ;
    public final EObject ruleNaturalLanguageFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sourceUri_3_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;

        EObject lv_applicabilityDomain_8_0 = null;

        EObject lv_applicabilityDomain_10_0 = null;

        AntlrDatatypeRuleToken lv_definition_13_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:2024:2: ( (otherlv_0= 'NaturalLanguageFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'definition' ( (lv_definition_13_0= ruleEString ) ) ) )
            // InternalInfluenceDSL.g:2025:2: (otherlv_0= 'NaturalLanguageFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'definition' ( (lv_definition_13_0= ruleEString ) ) )
            {
            // InternalInfluenceDSL.g:2025:2: (otherlv_0= 'NaturalLanguageFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'definition' ( (lv_definition_13_0= ruleEString ) ) )
            // InternalInfluenceDSL.g:2026:3: otherlv_0= 'NaturalLanguageFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'definition' ( (lv_definition_13_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNaturalLanguageFunctionAccess().getNaturalLanguageFunctionKeyword_0());
            		
            // InternalInfluenceDSL.g:2030:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:2031:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:2031:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:2032:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNaturalLanguageFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNaturalLanguageFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2049:3: (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==59) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalInfluenceDSL.g:2050:4: otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNaturalLanguageFunctionAccess().getSourceUriKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:2054:4: ( (lv_sourceUri_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:2055:5: (lv_sourceUri_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:2055:5: (lv_sourceUri_3_0= ruleEString )
                    // InternalInfluenceDSL.g:2056:6: lv_sourceUri_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNaturalLanguageFunctionAccess().getSourceUriEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_sourceUri_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNaturalLanguageFunctionRule());
                    						}
                    						set(
                    							current,
                    							"sourceUri",
                    							lv_sourceUri_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2074:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalInfluenceDSL.g:2075:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getNaturalLanguageFunctionAccess().getConfidenceKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:2079:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:2080:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:2080:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:2081:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getNaturalLanguageFunctionAccess().getConfidenceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNaturalLanguageFunctionRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2099:3: (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalInfluenceDSL.g:2100:4: otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getNaturalLanguageFunctionAccess().getApplicabilityDomainKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getNaturalLanguageFunctionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:2108:4: ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) )
                    // InternalInfluenceDSL.g:2109:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    {
                    // InternalInfluenceDSL.g:2109:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    // InternalInfluenceDSL.g:2110:6: lv_applicabilityDomain_8_0= ruleParticipantRange
                    {

                    						newCompositeNode(grammarAccess.getNaturalLanguageFunctionAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_applicabilityDomain_8_0=ruleParticipantRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNaturalLanguageFunctionRule());
                    						}
                    						add(
                    							current,
                    							"applicabilityDomain",
                    							lv_applicabilityDomain_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:2127:4: (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==12) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:2128:5: otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_55); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getNaturalLanguageFunctionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:2132:5: ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    // InternalInfluenceDSL.g:2133:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    {
                    	    // InternalInfluenceDSL.g:2133:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    // InternalInfluenceDSL.g:2134:7: lv_applicabilityDomain_10_0= ruleParticipantRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getNaturalLanguageFunctionAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    lv_applicabilityDomain_10_0=ruleParticipantRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNaturalLanguageFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"applicabilityDomain",
                    	    								lv_applicabilityDomain_10_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,55,FOLLOW_56); 

                    				newLeafNode(otherlv_11, grammarAccess.getNaturalLanguageFunctionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getNaturalLanguageFunctionAccess().getDefinitionKeyword_5());
            		
            // InternalInfluenceDSL.g:2161:3: ( (lv_definition_13_0= ruleEString ) )
            // InternalInfluenceDSL.g:2162:4: (lv_definition_13_0= ruleEString )
            {
            // InternalInfluenceDSL.g:2162:4: (lv_definition_13_0= ruleEString )
            // InternalInfluenceDSL.g:2163:5: lv_definition_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNaturalLanguageFunctionAccess().getDefinitionEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNaturalLanguageFunctionRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_13_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaturalLanguageFunction"


    // $ANTLR start "entryRuleParticipantImpactFunction"
    // InternalInfluenceDSL.g:2184:1: entryRuleParticipantImpactFunction returns [EObject current=null] : iv_ruleParticipantImpactFunction= ruleParticipantImpactFunction EOF ;
    public final EObject entryRuleParticipantImpactFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantImpactFunction = null;


        try {
            // InternalInfluenceDSL.g:2184:66: (iv_ruleParticipantImpactFunction= ruleParticipantImpactFunction EOF )
            // InternalInfluenceDSL.g:2185:2: iv_ruleParticipantImpactFunction= ruleParticipantImpactFunction EOF
            {
             newCompositeNode(grammarAccess.getParticipantImpactFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantImpactFunction=ruleParticipantImpactFunction();

            state._fsp--;

             current =iv_ruleParticipantImpactFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantImpactFunction"


    // $ANTLR start "ruleParticipantImpactFunction"
    // InternalInfluenceDSL.g:2191:1: ruleParticipantImpactFunction returns [EObject current=null] : (otherlv_0= 'ParticipantImpactFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'participantContributions' otherlv_13= '(' ( (lv_participantContribution_14_0= ruleParticipantRelativeImpact ) ) (otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) ) )* otherlv_17= ')' ) ;
    public final EObject ruleParticipantImpactFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sourceUri_3_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;

        EObject lv_applicabilityDomain_8_0 = null;

        EObject lv_applicabilityDomain_10_0 = null;

        EObject lv_participantContribution_14_0 = null;

        EObject lv_participantContribution_16_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:2197:2: ( (otherlv_0= 'ParticipantImpactFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'participantContributions' otherlv_13= '(' ( (lv_participantContribution_14_0= ruleParticipantRelativeImpact ) ) (otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) ) )* otherlv_17= ')' ) )
            // InternalInfluenceDSL.g:2198:2: (otherlv_0= 'ParticipantImpactFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'participantContributions' otherlv_13= '(' ( (lv_participantContribution_14_0= ruleParticipantRelativeImpact ) ) (otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) ) )* otherlv_17= ')' )
            {
            // InternalInfluenceDSL.g:2198:2: (otherlv_0= 'ParticipantImpactFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'participantContributions' otherlv_13= '(' ( (lv_participantContribution_14_0= ruleParticipantRelativeImpact ) ) (otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) ) )* otherlv_17= ')' )
            // InternalInfluenceDSL.g:2199:3: otherlv_0= 'ParticipantImpactFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'participantContributions' otherlv_13= '(' ( (lv_participantContribution_14_0= ruleParticipantRelativeImpact ) ) (otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) ) )* otherlv_17= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantImpactFunctionAccess().getParticipantImpactFunctionKeyword_0());
            		
            // InternalInfluenceDSL.g:2203:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:2204:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:2204:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:2205:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_57);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2222:3: (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalInfluenceDSL.g:2223:4: otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getParticipantImpactFunctionAccess().getSourceUriKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:2227:4: ( (lv_sourceUri_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:2228:5: (lv_sourceUri_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:2228:5: (lv_sourceUri_3_0= ruleEString )
                    // InternalInfluenceDSL.g:2229:6: lv_sourceUri_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getSourceUriEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_sourceUri_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
                    						}
                    						set(
                    							current,
                    							"sourceUri",
                    							lv_sourceUri_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2247:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalInfluenceDSL.g:2248:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getParticipantImpactFunctionAccess().getConfidenceKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:2252:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:2253:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:2253:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:2254:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getConfidenceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2272:3: (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalInfluenceDSL.g:2273:4: otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getParticipantImpactFunctionAccess().getApplicabilityDomainKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getParticipantImpactFunctionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:2281:4: ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) )
                    // InternalInfluenceDSL.g:2282:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    {
                    // InternalInfluenceDSL.g:2282:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    // InternalInfluenceDSL.g:2283:6: lv_applicabilityDomain_8_0= ruleParticipantRange
                    {

                    						newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_applicabilityDomain_8_0=ruleParticipantRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
                    						}
                    						add(
                    							current,
                    							"applicabilityDomain",
                    							lv_applicabilityDomain_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:2300:4: (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==12) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:2301:5: otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_55); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getParticipantImpactFunctionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:2305:5: ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    // InternalInfluenceDSL.g:2306:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    {
                    	    // InternalInfluenceDSL.g:2306:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    // InternalInfluenceDSL.g:2307:7: lv_applicabilityDomain_10_0= ruleParticipantRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    lv_applicabilityDomain_10_0=ruleParticipantRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"applicabilityDomain",
                    	    								lv_applicabilityDomain_10_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,55,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getParticipantImpactFunctionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,63,FOLLOW_47); 

            			newLeafNode(otherlv_12, grammarAccess.getParticipantImpactFunctionAccess().getParticipantContributionsKeyword_5());
            		
            otherlv_13=(Token)match(input,54,FOLLOW_61); 

            			newLeafNode(otherlv_13, grammarAccess.getParticipantImpactFunctionAccess().getLeftParenthesisKeyword_6());
            		
            // InternalInfluenceDSL.g:2338:3: ( (lv_participantContribution_14_0= ruleParticipantRelativeImpact ) )
            // InternalInfluenceDSL.g:2339:4: (lv_participantContribution_14_0= ruleParticipantRelativeImpact )
            {
            // InternalInfluenceDSL.g:2339:4: (lv_participantContribution_14_0= ruleParticipantRelativeImpact )
            // InternalInfluenceDSL.g:2340:5: lv_participantContribution_14_0= ruleParticipantRelativeImpact
            {

            					newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getParticipantContributionParticipantRelativeImpactParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_48);
            lv_participantContribution_14_0=ruleParticipantRelativeImpact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
            					}
            					add(
            						current,
            						"participantContribution",
            						lv_participantContribution_14_0,
            						"fr.inria.kairos.influence.InfluenceDSL.ParticipantRelativeImpact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2357:3: (otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==12) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2358:4: otherlv_15= ',' ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) )
            	    {
            	    otherlv_15=(Token)match(input,12,FOLLOW_61); 

            	    				newLeafNode(otherlv_15, grammarAccess.getParticipantImpactFunctionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalInfluenceDSL.g:2362:4: ( (lv_participantContribution_16_0= ruleParticipantRelativeImpact ) )
            	    // InternalInfluenceDSL.g:2363:5: (lv_participantContribution_16_0= ruleParticipantRelativeImpact )
            	    {
            	    // InternalInfluenceDSL.g:2363:5: (lv_participantContribution_16_0= ruleParticipantRelativeImpact )
            	    // InternalInfluenceDSL.g:2364:6: lv_participantContribution_16_0= ruleParticipantRelativeImpact
            	    {

            	    						newCompositeNode(grammarAccess.getParticipantImpactFunctionAccess().getParticipantContributionParticipantRelativeImpactParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_participantContribution_16_0=ruleParticipantRelativeImpact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParticipantImpactFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"participantContribution",
            	    							lv_participantContribution_16_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.ParticipantRelativeImpact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_17=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getParticipantImpactFunctionAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantImpactFunction"


    // $ANTLR start "entryRuleParticipantRelativeImpact"
    // InternalInfluenceDSL.g:2390:1: entryRuleParticipantRelativeImpact returns [EObject current=null] : iv_ruleParticipantRelativeImpact= ruleParticipantRelativeImpact EOF ;
    public final EObject entryRuleParticipantRelativeImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantRelativeImpact = null;


        try {
            // InternalInfluenceDSL.g:2390:66: (iv_ruleParticipantRelativeImpact= ruleParticipantRelativeImpact EOF )
            // InternalInfluenceDSL.g:2391:2: iv_ruleParticipantRelativeImpact= ruleParticipantRelativeImpact EOF
            {
             newCompositeNode(grammarAccess.getParticipantRelativeImpactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantRelativeImpact=ruleParticipantRelativeImpact();

            state._fsp--;

             current =iv_ruleParticipantRelativeImpact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantRelativeImpact"


    // $ANTLR start "ruleParticipantRelativeImpact"
    // InternalInfluenceDSL.g:2397:1: ruleParticipantRelativeImpact returns [EObject current=null] : (otherlv_0= 'ParticipantRelativeImpact' otherlv_1= 'participant' ( ( ruleQualifiedName ) ) otherlv_3= 'importance' ( (lv_importance_4_0= ruleEDouble ) ) (otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) ) )? (otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) ) )? ) ;
    public final EObject ruleParticipantRelativeImpact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_importance_4_0 = null;

        Enumerator lv_direction_6_0 = null;

        AntlrDatatypeRuleToken lv_rationale_8_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:2403:2: ( (otherlv_0= 'ParticipantRelativeImpact' otherlv_1= 'participant' ( ( ruleQualifiedName ) ) otherlv_3= 'importance' ( (lv_importance_4_0= ruleEDouble ) ) (otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) ) )? (otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:2404:2: (otherlv_0= 'ParticipantRelativeImpact' otherlv_1= 'participant' ( ( ruleQualifiedName ) ) otherlv_3= 'importance' ( (lv_importance_4_0= ruleEDouble ) ) (otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) ) )? (otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:2404:2: (otherlv_0= 'ParticipantRelativeImpact' otherlv_1= 'participant' ( ( ruleQualifiedName ) ) otherlv_3= 'importance' ( (lv_importance_4_0= ruleEDouble ) ) (otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) ) )? (otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:2405:3: otherlv_0= 'ParticipantRelativeImpact' otherlv_1= 'participant' ( ( ruleQualifiedName ) ) otherlv_3= 'importance' ( (lv_importance_4_0= ruleEDouble ) ) (otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) ) )? (otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantRelativeImpactAccess().getParticipantRelativeImpactKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParticipantRelativeImpactAccess().getParticipantKeyword_1());
            		
            // InternalInfluenceDSL.g:2413:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:2414:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:2414:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:2415:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantRelativeImpactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParticipantRelativeImpactAccess().getParticipantParticipantCrossReference_2_0());
            				
            pushFollow(FOLLOW_63);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getParticipantRelativeImpactAccess().getImportanceKeyword_3());
            		
            // InternalInfluenceDSL.g:2433:3: ( (lv_importance_4_0= ruleEDouble ) )
            // InternalInfluenceDSL.g:2434:4: (lv_importance_4_0= ruleEDouble )
            {
            // InternalInfluenceDSL.g:2434:4: (lv_importance_4_0= ruleEDouble )
            // InternalInfluenceDSL.g:2435:5: lv_importance_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getParticipantRelativeImpactAccess().getImportanceEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_64);
            lv_importance_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRelativeImpactRule());
            					}
            					set(
            						current,
            						"importance",
            						lv_importance_4_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2452:3: (otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==67) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalInfluenceDSL.g:2453:4: otherlv_5= 'direction' ( (lv_direction_6_0= ruleTrendType ) )
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_65); 

                    				newLeafNode(otherlv_5, grammarAccess.getParticipantRelativeImpactAccess().getDirectionKeyword_5_0());
                    			
                    // InternalInfluenceDSL.g:2457:4: ( (lv_direction_6_0= ruleTrendType ) )
                    // InternalInfluenceDSL.g:2458:5: (lv_direction_6_0= ruleTrendType )
                    {
                    // InternalInfluenceDSL.g:2458:5: (lv_direction_6_0= ruleTrendType )
                    // InternalInfluenceDSL.g:2459:6: lv_direction_6_0= ruleTrendType
                    {

                    						newCompositeNode(grammarAccess.getParticipantRelativeImpactAccess().getDirectionTrendTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_direction_6_0=ruleTrendType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantRelativeImpactRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_6_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.TrendType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2477:3: (otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==68) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalInfluenceDSL.g:2478:4: otherlv_7= 'rationale' ( (lv_rationale_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getParticipantRelativeImpactAccess().getRationaleKeyword_6_0());
                    			
                    // InternalInfluenceDSL.g:2482:4: ( (lv_rationale_8_0= ruleEString ) )
                    // InternalInfluenceDSL.g:2483:5: (lv_rationale_8_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:2483:5: (lv_rationale_8_0= ruleEString )
                    // InternalInfluenceDSL.g:2484:6: lv_rationale_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParticipantRelativeImpactAccess().getRationaleEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rationale_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantRelativeImpactRule());
                    						}
                    						set(
                    							current,
                    							"rationale",
                    							lv_rationale_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantRelativeImpact"


    // $ANTLR start "entryRuleAnalyticExpressionFunction"
    // InternalInfluenceDSL.g:2506:1: entryRuleAnalyticExpressionFunction returns [EObject current=null] : iv_ruleAnalyticExpressionFunction= ruleAnalyticExpressionFunction EOF ;
    public final EObject entryRuleAnalyticExpressionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyticExpressionFunction = null;


        try {
            // InternalInfluenceDSL.g:2506:67: (iv_ruleAnalyticExpressionFunction= ruleAnalyticExpressionFunction EOF )
            // InternalInfluenceDSL.g:2507:2: iv_ruleAnalyticExpressionFunction= ruleAnalyticExpressionFunction EOF
            {
             newCompositeNode(grammarAccess.getAnalyticExpressionFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyticExpressionFunction=ruleAnalyticExpressionFunction();

            state._fsp--;

             current =iv_ruleAnalyticExpressionFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyticExpressionFunction"


    // $ANTLR start "ruleAnalyticExpressionFunction"
    // InternalInfluenceDSL.g:2513:1: ruleAnalyticExpressionFunction returns [EObject current=null] : (otherlv_0= 'AnalyticExpressionFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'expression' ( (lv_expression_13_0= ruleEString ) ) otherlv_14= 'expressionLanguage' ( (lv_expressionLanguage_15_0= ruleLanguageType ) ) ) ;
    public final EObject ruleAnalyticExpressionFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sourceUri_3_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;

        EObject lv_applicabilityDomain_8_0 = null;

        EObject lv_applicabilityDomain_10_0 = null;

        AntlrDatatypeRuleToken lv_expression_13_0 = null;

        Enumerator lv_expressionLanguage_15_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:2519:2: ( (otherlv_0= 'AnalyticExpressionFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'expression' ( (lv_expression_13_0= ruleEString ) ) otherlv_14= 'expressionLanguage' ( (lv_expressionLanguage_15_0= ruleLanguageType ) ) ) )
            // InternalInfluenceDSL.g:2520:2: (otherlv_0= 'AnalyticExpressionFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'expression' ( (lv_expression_13_0= ruleEString ) ) otherlv_14= 'expressionLanguage' ( (lv_expressionLanguage_15_0= ruleLanguageType ) ) )
            {
            // InternalInfluenceDSL.g:2520:2: (otherlv_0= 'AnalyticExpressionFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'expression' ( (lv_expression_13_0= ruleEString ) ) otherlv_14= 'expressionLanguage' ( (lv_expressionLanguage_15_0= ruleLanguageType ) ) )
            // InternalInfluenceDSL.g:2521:3: otherlv_0= 'AnalyticExpressionFunction' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'expression' ( (lv_expression_13_0= ruleEString ) ) otherlv_14= 'expressionLanguage' ( (lv_expressionLanguage_15_0= ruleLanguageType ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalyticExpressionFunctionAccess().getAnalyticExpressionFunctionKeyword_0());
            		
            // InternalInfluenceDSL.g:2525:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:2526:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:2526:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:2527:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_67);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2544:3: (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalInfluenceDSL.g:2545:4: otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getAnalyticExpressionFunctionAccess().getSourceUriKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:2549:4: ( (lv_sourceUri_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:2550:5: (lv_sourceUri_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:2550:5: (lv_sourceUri_3_0= ruleEString )
                    // InternalInfluenceDSL.g:2551:6: lv_sourceUri_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getSourceUriEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_sourceUri_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
                    						}
                    						set(
                    							current,
                    							"sourceUri",
                    							lv_sourceUri_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2569:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalInfluenceDSL.g:2570:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAnalyticExpressionFunctionAccess().getConfidenceKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:2574:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:2575:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:2575:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:2576:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getConfidenceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2594:3: (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalInfluenceDSL.g:2595:4: otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnalyticExpressionFunctionAccess().getApplicabilityDomainKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getAnalyticExpressionFunctionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:2603:4: ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) )
                    // InternalInfluenceDSL.g:2604:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    {
                    // InternalInfluenceDSL.g:2604:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    // InternalInfluenceDSL.g:2605:6: lv_applicabilityDomain_8_0= ruleParticipantRange
                    {

                    						newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_applicabilityDomain_8_0=ruleParticipantRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
                    						}
                    						add(
                    							current,
                    							"applicabilityDomain",
                    							lv_applicabilityDomain_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:2622:4: (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==12) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:2623:5: otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_55); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAnalyticExpressionFunctionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:2627:5: ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    // InternalInfluenceDSL.g:2628:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    {
                    	    // InternalInfluenceDSL.g:2628:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    // InternalInfluenceDSL.g:2629:7: lv_applicabilityDomain_10_0= ruleParticipantRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    lv_applicabilityDomain_10_0=ruleParticipantRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"applicabilityDomain",
                    	    								lv_applicabilityDomain_10_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,55,FOLLOW_70); 

                    				newLeafNode(otherlv_11, grammarAccess.getAnalyticExpressionFunctionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getAnalyticExpressionFunctionAccess().getExpressionKeyword_5());
            		
            // InternalInfluenceDSL.g:2656:3: ( (lv_expression_13_0= ruleEString ) )
            // InternalInfluenceDSL.g:2657:4: (lv_expression_13_0= ruleEString )
            {
            // InternalInfluenceDSL.g:2657:4: (lv_expression_13_0= ruleEString )
            // InternalInfluenceDSL.g:2658:5: lv_expression_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getExpressionEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_71);
            lv_expression_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_13_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,71,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getAnalyticExpressionFunctionAccess().getExpressionLanguageKeyword_7());
            		
            // InternalInfluenceDSL.g:2679:3: ( (lv_expressionLanguage_15_0= ruleLanguageType ) )
            // InternalInfluenceDSL.g:2680:4: (lv_expressionLanguage_15_0= ruleLanguageType )
            {
            // InternalInfluenceDSL.g:2680:4: (lv_expressionLanguage_15_0= ruleLanguageType )
            // InternalInfluenceDSL.g:2681:5: lv_expressionLanguage_15_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getAnalyticExpressionFunctionAccess().getExpressionLanguageLanguageTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_expressionLanguage_15_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalyticExpressionFunctionRule());
            					}
            					set(
            						current,
            						"expressionLanguage",
            						lv_expressionLanguage_15_0,
            						"fr.inria.kairos.influence.InfluenceDSL.LanguageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyticExpressionFunction"


    // $ANTLR start "entryRuleMonotonicityTable"
    // InternalInfluenceDSL.g:2702:1: entryRuleMonotonicityTable returns [EObject current=null] : iv_ruleMonotonicityTable= ruleMonotonicityTable EOF ;
    public final EObject entryRuleMonotonicityTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonotonicityTable = null;


        try {
            // InternalInfluenceDSL.g:2702:58: (iv_ruleMonotonicityTable= ruleMonotonicityTable EOF )
            // InternalInfluenceDSL.g:2703:2: iv_ruleMonotonicityTable= ruleMonotonicityTable EOF
            {
             newCompositeNode(grammarAccess.getMonotonicityTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonotonicityTable=ruleMonotonicityTable();

            state._fsp--;

             current =iv_ruleMonotonicityTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonotonicityTable"


    // $ANTLR start "ruleMonotonicityTable"
    // InternalInfluenceDSL.g:2709:1: ruleMonotonicityTable returns [EObject current=null] : (otherlv_0= 'MonotonicityTable' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'tableRows' otherlv_13= '(' ( (lv_tableRows_14_0= ruleMonotonicityRow ) ) (otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) ) )* otherlv_17= ')' ) ;
    public final EObject ruleMonotonicityTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sourceUri_3_0 = null;

        AntlrDatatypeRuleToken lv_confidence_5_0 = null;

        EObject lv_applicabilityDomain_8_0 = null;

        EObject lv_applicabilityDomain_10_0 = null;

        EObject lv_tableRows_14_0 = null;

        EObject lv_tableRows_16_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:2715:2: ( (otherlv_0= 'MonotonicityTable' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'tableRows' otherlv_13= '(' ( (lv_tableRows_14_0= ruleMonotonicityRow ) ) (otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) ) )* otherlv_17= ')' ) )
            // InternalInfluenceDSL.g:2716:2: (otherlv_0= 'MonotonicityTable' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'tableRows' otherlv_13= '(' ( (lv_tableRows_14_0= ruleMonotonicityRow ) ) (otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) ) )* otherlv_17= ')' )
            {
            // InternalInfluenceDSL.g:2716:2: (otherlv_0= 'MonotonicityTable' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'tableRows' otherlv_13= '(' ( (lv_tableRows_14_0= ruleMonotonicityRow ) ) (otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) ) )* otherlv_17= ')' )
            // InternalInfluenceDSL.g:2717:3: otherlv_0= 'MonotonicityTable' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )? (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )? (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )? otherlv_12= 'tableRows' otherlv_13= '(' ( (lv_tableRows_14_0= ruleMonotonicityRow ) ) (otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) ) )* otherlv_17= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMonotonicityTableAccess().getMonotonicityTableKeyword_0());
            		
            // InternalInfluenceDSL.g:2721:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:2722:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:2722:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:2723:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonotonicityTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_72);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2740:3: (otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==59) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalInfluenceDSL.g:2741:4: otherlv_2= 'sourceUri' ( (lv_sourceUri_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMonotonicityTableAccess().getSourceUriKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:2745:4: ( (lv_sourceUri_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:2746:5: (lv_sourceUri_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:2746:5: (lv_sourceUri_3_0= ruleEString )
                    // InternalInfluenceDSL.g:2747:6: lv_sourceUri_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMonotonicityTableAccess().getSourceUriEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_sourceUri_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
                    						}
                    						set(
                    							current,
                    							"sourceUri",
                    							lv_sourceUri_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2765:3: (otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalInfluenceDSL.g:2766:4: otherlv_4= 'confidence' ( (lv_confidence_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getMonotonicityTableAccess().getConfidenceKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:2770:4: ( (lv_confidence_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:2771:5: (lv_confidence_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:2771:5: (lv_confidence_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:2772:6: lv_confidence_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getMonotonicityTableAccess().getConfidenceEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_confidence_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:2790:3: (otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalInfluenceDSL.g:2791:4: otherlv_6= 'applicabilityDomain' otherlv_7= '(' ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) ) (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getMonotonicityTableAccess().getApplicabilityDomainKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getMonotonicityTableAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:2799:4: ( (lv_applicabilityDomain_8_0= ruleParticipantRange ) )
                    // InternalInfluenceDSL.g:2800:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    {
                    // InternalInfluenceDSL.g:2800:5: (lv_applicabilityDomain_8_0= ruleParticipantRange )
                    // InternalInfluenceDSL.g:2801:6: lv_applicabilityDomain_8_0= ruleParticipantRange
                    {

                    						newCompositeNode(grammarAccess.getMonotonicityTableAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_applicabilityDomain_8_0=ruleParticipantRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
                    						}
                    						add(
                    							current,
                    							"applicabilityDomain",
                    							lv_applicabilityDomain_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:2818:4: (otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==12) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:2819:5: otherlv_9= ',' ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_55); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMonotonicityTableAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:2823:5: ( (lv_applicabilityDomain_10_0= ruleParticipantRange ) )
                    	    // InternalInfluenceDSL.g:2824:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    {
                    	    // InternalInfluenceDSL.g:2824:6: (lv_applicabilityDomain_10_0= ruleParticipantRange )
                    	    // InternalInfluenceDSL.g:2825:7: lv_applicabilityDomain_10_0= ruleParticipantRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonotonicityTableAccess().getApplicabilityDomainParticipantRangeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    lv_applicabilityDomain_10_0=ruleParticipantRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"applicabilityDomain",
                    	    								lv_applicabilityDomain_10_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,55,FOLLOW_75); 

                    				newLeafNode(otherlv_11, grammarAccess.getMonotonicityTableAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,73,FOLLOW_47); 

            			newLeafNode(otherlv_12, grammarAccess.getMonotonicityTableAccess().getTableRowsKeyword_5());
            		
            otherlv_13=(Token)match(input,54,FOLLOW_76); 

            			newLeafNode(otherlv_13, grammarAccess.getMonotonicityTableAccess().getLeftParenthesisKeyword_6());
            		
            // InternalInfluenceDSL.g:2856:3: ( (lv_tableRows_14_0= ruleMonotonicityRow ) )
            // InternalInfluenceDSL.g:2857:4: (lv_tableRows_14_0= ruleMonotonicityRow )
            {
            // InternalInfluenceDSL.g:2857:4: (lv_tableRows_14_0= ruleMonotonicityRow )
            // InternalInfluenceDSL.g:2858:5: lv_tableRows_14_0= ruleMonotonicityRow
            {

            					newCompositeNode(grammarAccess.getMonotonicityTableAccess().getTableRowsMonotonicityRowParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_48);
            lv_tableRows_14_0=ruleMonotonicityRow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
            					}
            					add(
            						current,
            						"tableRows",
            						lv_tableRows_14_0,
            						"fr.inria.kairos.influence.InfluenceDSL.MonotonicityRow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:2875:3: (otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==12) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2876:4: otherlv_15= ',' ( (lv_tableRows_16_0= ruleMonotonicityRow ) )
            	    {
            	    otherlv_15=(Token)match(input,12,FOLLOW_76); 

            	    				newLeafNode(otherlv_15, grammarAccess.getMonotonicityTableAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalInfluenceDSL.g:2880:4: ( (lv_tableRows_16_0= ruleMonotonicityRow ) )
            	    // InternalInfluenceDSL.g:2881:5: (lv_tableRows_16_0= ruleMonotonicityRow )
            	    {
            	    // InternalInfluenceDSL.g:2881:5: (lv_tableRows_16_0= ruleMonotonicityRow )
            	    // InternalInfluenceDSL.g:2882:6: lv_tableRows_16_0= ruleMonotonicityRow
            	    {

            	    						newCompositeNode(grammarAccess.getMonotonicityTableAccess().getTableRowsMonotonicityRowParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_tableRows_16_0=ruleMonotonicityRow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMonotonicityTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tableRows",
            	    							lv_tableRows_16_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.MonotonicityRow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_17=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getMonotonicityTableAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonotonicityTable"


    // $ANTLR start "entryRuleMonotonicityRow"
    // InternalInfluenceDSL.g:2908:1: entryRuleMonotonicityRow returns [EObject current=null] : iv_ruleMonotonicityRow= ruleMonotonicityRow EOF ;
    public final EObject entryRuleMonotonicityRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonotonicityRow = null;


        try {
            // InternalInfluenceDSL.g:2908:56: (iv_ruleMonotonicityRow= ruleMonotonicityRow EOF )
            // InternalInfluenceDSL.g:2909:2: iv_ruleMonotonicityRow= ruleMonotonicityRow EOF
            {
             newCompositeNode(grammarAccess.getMonotonicityRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonotonicityRow=ruleMonotonicityRow();

            state._fsp--;

             current =iv_ruleMonotonicityRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonotonicityRow"


    // $ANTLR start "ruleMonotonicityRow"
    // InternalInfluenceDSL.g:2915:1: ruleMonotonicityRow returns [EObject current=null] : (otherlv_0= 'MonotonicityRow' (otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')' )? otherlv_7= 'variedParticipant' ( ( ruleQualifiedName ) ) otherlv_9= 'output' ( ( ruleQualifiedName ) ) otherlv_11= 'trend' ( (lv_trend_12_0= ruleTrendType ) ) ) ;
    public final EObject ruleMonotonicityRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_condition_3_0 = null;

        EObject lv_condition_5_0 = null;

        Enumerator lv_trend_12_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:2921:2: ( (otherlv_0= 'MonotonicityRow' (otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')' )? otherlv_7= 'variedParticipant' ( ( ruleQualifiedName ) ) otherlv_9= 'output' ( ( ruleQualifiedName ) ) otherlv_11= 'trend' ( (lv_trend_12_0= ruleTrendType ) ) ) )
            // InternalInfluenceDSL.g:2922:2: (otherlv_0= 'MonotonicityRow' (otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')' )? otherlv_7= 'variedParticipant' ( ( ruleQualifiedName ) ) otherlv_9= 'output' ( ( ruleQualifiedName ) ) otherlv_11= 'trend' ( (lv_trend_12_0= ruleTrendType ) ) )
            {
            // InternalInfluenceDSL.g:2922:2: (otherlv_0= 'MonotonicityRow' (otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')' )? otherlv_7= 'variedParticipant' ( ( ruleQualifiedName ) ) otherlv_9= 'output' ( ( ruleQualifiedName ) ) otherlv_11= 'trend' ( (lv_trend_12_0= ruleTrendType ) ) )
            // InternalInfluenceDSL.g:2923:3: otherlv_0= 'MonotonicityRow' (otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')' )? otherlv_7= 'variedParticipant' ( ( ruleQualifiedName ) ) otherlv_9= 'output' ( ( ruleQualifiedName ) ) otherlv_11= 'trend' ( (lv_trend_12_0= ruleTrendType ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getMonotonicityRowAccess().getMonotonicityRowKeyword_0());
            		
            // InternalInfluenceDSL.g:2927:3: (otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==75) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalInfluenceDSL.g:2928:4: otherlv_1= 'conditions' otherlv_2= '(' ( (lv_condition_3_0= ruleParticipantRange ) ) (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )* otherlv_6= ')'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_47); 

                    				newLeafNode(otherlv_1, grammarAccess.getMonotonicityRowAccess().getConditionsKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getMonotonicityRowAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInfluenceDSL.g:2936:4: ( (lv_condition_3_0= ruleParticipantRange ) )
                    // InternalInfluenceDSL.g:2937:5: (lv_condition_3_0= ruleParticipantRange )
                    {
                    // InternalInfluenceDSL.g:2937:5: (lv_condition_3_0= ruleParticipantRange )
                    // InternalInfluenceDSL.g:2938:6: lv_condition_3_0= ruleParticipantRange
                    {

                    						newCompositeNode(grammarAccess.getMonotonicityRowAccess().getConditionParticipantRangeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_condition_3_0=ruleParticipantRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonotonicityRowRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:2955:4: (otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==12) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:2956:5: otherlv_4= ',' ( (lv_condition_5_0= ruleParticipantRange ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_55); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMonotonicityRowAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:2960:5: ( (lv_condition_5_0= ruleParticipantRange ) )
                    	    // InternalInfluenceDSL.g:2961:6: (lv_condition_5_0= ruleParticipantRange )
                    	    {
                    	    // InternalInfluenceDSL.g:2961:6: (lv_condition_5_0= ruleParticipantRange )
                    	    // InternalInfluenceDSL.g:2962:7: lv_condition_5_0= ruleParticipantRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonotonicityRowAccess().getConditionParticipantRangeParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    lv_condition_5_0=ruleParticipantRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonotonicityRowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"condition",
                    	    								lv_condition_5_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.ParticipantRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,55,FOLLOW_78); 

                    				newLeafNode(otherlv_6, grammarAccess.getMonotonicityRowAccess().getRightParenthesisKeyword_1_4());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,76,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getMonotonicityRowAccess().getVariedParticipantKeyword_2());
            		
            // InternalInfluenceDSL.g:2989:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:2990:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:2990:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:2991:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonotonicityRowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMonotonicityRowAccess().getVariedParticipantParticipantCrossReference_3_0());
            				
            pushFollow(FOLLOW_79);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getMonotonicityRowAccess().getOutputKeyword_4());
            		
            // InternalInfluenceDSL.g:3009:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:3010:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:3010:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:3011:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonotonicityRowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMonotonicityRowAccess().getOutputSystemResponsePropertyCrossReference_5_0());
            				
            pushFollow(FOLLOW_80);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,78,FOLLOW_65); 

            			newLeafNode(otherlv_11, grammarAccess.getMonotonicityRowAccess().getTrendKeyword_6());
            		
            // InternalInfluenceDSL.g:3029:3: ( (lv_trend_12_0= ruleTrendType ) )
            // InternalInfluenceDSL.g:3030:4: (lv_trend_12_0= ruleTrendType )
            {
            // InternalInfluenceDSL.g:3030:4: (lv_trend_12_0= ruleTrendType )
            // InternalInfluenceDSL.g:3031:5: lv_trend_12_0= ruleTrendType
            {

            					newCompositeNode(grammarAccess.getMonotonicityRowAccess().getTrendTrendTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_trend_12_0=ruleTrendType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonotonicityRowRule());
            					}
            					set(
            						current,
            						"trend",
            						lv_trend_12_0,
            						"fr.inria.kairos.influence.InfluenceDSL.TrendType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonotonicityRow"


    // $ANTLR start "entryRuleEDouble"
    // InternalInfluenceDSL.g:3052:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalInfluenceDSL.g:3052:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalInfluenceDSL.g:3053:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalInfluenceDSL.g:3059:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? ( (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? ) | (kw= '.' this_INT_5= RULE_INT ) ) ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_5=null;
        Token this_INT_10=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:3065:2: ( ( (kw= '-' )? ( (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? ) | (kw= '.' this_INT_5= RULE_INT ) ) ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT )? ) )
            // InternalInfluenceDSL.g:3066:2: ( (kw= '-' )? ( (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? ) | (kw= '.' this_INT_5= RULE_INT ) ) ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT )? )
            {
            // InternalInfluenceDSL.g:3066:2: ( (kw= '-' )? ( (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? ) | (kw= '.' this_INT_5= RULE_INT ) ) ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT )? )
            // InternalInfluenceDSL.g:3067:3: (kw= '-' )? ( (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? ) | (kw= '.' this_INT_5= RULE_INT ) ) ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT )?
            {
            // InternalInfluenceDSL.g:3067:3: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==79) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalInfluenceDSL.g:3068:4: kw= '-'
                    {
                    kw=(Token)match(input,79,FOLLOW_81); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:3074:3: ( (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? ) | (kw= '.' this_INT_5= RULE_INT ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            else if ( (LA54_0==80) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalInfluenceDSL.g:3075:4: (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? )
                    {
                    // InternalInfluenceDSL.g:3075:4: (this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )? )
                    // InternalInfluenceDSL.g:3076:5: this_INT_1= RULE_INT (kw= '.' (this_INT_3= RULE_INT )? )?
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_82); 

                    					current.merge(this_INT_1);
                    				

                    					newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_0_0());
                    				
                    // InternalInfluenceDSL.g:3083:5: (kw= '.' (this_INT_3= RULE_INT )? )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==80) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalInfluenceDSL.g:3084:6: kw= '.' (this_INT_3= RULE_INT )?
                            {
                            kw=(Token)match(input,80,FOLLOW_83); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1_0_1_0());
                            					
                            // InternalInfluenceDSL.g:3089:6: (this_INT_3= RULE_INT )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==RULE_INT) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // InternalInfluenceDSL.g:3090:7: this_INT_3= RULE_INT
                                    {
                                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_84); 

                                    							current.merge(this_INT_3);
                                    						

                                    							newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_0_1_1());
                                    						

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:3101:4: (kw= '.' this_INT_5= RULE_INT )
                    {
                    // InternalInfluenceDSL.g:3101:4: (kw= '.' this_INT_5= RULE_INT )
                    // InternalInfluenceDSL.g:3102:5: kw= '.' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,80,FOLLOW_85); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1_1_0());
                    				
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_84); 

                    					current.merge(this_INT_5);
                    				

                    					newLeafNode(this_INT_5, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:3116:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=81 && LA57_0<=82)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalInfluenceDSL.g:3117:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_10= RULE_INT
                    {
                    // InternalInfluenceDSL.g:3117:4: (kw= 'E' | kw= 'e' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==81) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==82) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalInfluenceDSL.g:3118:5: kw= 'E'
                            {
                            kw=(Token)match(input,81,FOLLOW_86); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalInfluenceDSL.g:3124:5: kw= 'e'
                            {
                            kw=(Token)match(input,82,FOLLOW_86); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    // InternalInfluenceDSL.g:3130:4: (kw= '+' | kw= '-' )?
                    int alt56=3;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==83) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==79) ) {
                        alt56=2;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalInfluenceDSL.g:3131:5: kw= '+'
                            {
                            kw=(Token)match(input,83,FOLLOW_85); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getPlusSignKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalInfluenceDSL.g:3137:5: kw= '-'
                            {
                            kw=(Token)match(input,79,FOLLOW_85); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_10);
                    			

                    				newLeafNode(this_INT_10, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalInfluenceDSL.g:3155:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalInfluenceDSL.g:3155:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalInfluenceDSL.g:3156:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalInfluenceDSL.g:3162:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:3168:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalInfluenceDSL.g:3169:2: (kw= 'true' | kw= 'false' )
            {
            // InternalInfluenceDSL.g:3169:2: (kw= 'true' | kw= 'false' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==84) ) {
                alt58=1;
            }
            else if ( (LA58_0==85) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalInfluenceDSL.g:3170:3: kw= 'true'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:3176:3: kw= 'false'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInfluenceDSL.g:3185:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalInfluenceDSL.g:3185:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:3186:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalInfluenceDSL.g:3192:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:3198:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalInfluenceDSL.g:3199:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalInfluenceDSL.g:3199:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalInfluenceDSL.g:3200:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalInfluenceDSL.g:3207:3: (kw= '.' this_ID_2= RULE_ID )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==80) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalInfluenceDSL.g:3208:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,80,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_87); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLanguageType"
    // InternalInfluenceDSL.g:3225:1: ruleLanguageType returns [Enumerator current=null] : ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) ) ;
    public final Enumerator ruleLanguageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:3231:2: ( ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) ) )
            // InternalInfluenceDSL.g:3232:2: ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) )
            {
            // InternalInfluenceDSL.g:3232:2: ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==86) ) {
                alt60=1;
            }
            else if ( (LA60_0==87) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalInfluenceDSL.g:3233:3: (enumLiteral_0= 'NaturalLanguage' )
                    {
                    // InternalInfluenceDSL.g:3233:3: (enumLiteral_0= 'NaturalLanguage' )
                    // InternalInfluenceDSL.g:3234:4: enumLiteral_0= 'NaturalLanguage'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getNaturalLanguageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageTypeAccess().getNaturalLanguageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:3241:3: (enumLiteral_1= 'JavaNumericExpression' )
                    {
                    // InternalInfluenceDSL.g:3241:3: (enumLiteral_1= 'JavaNumericExpression' )
                    // InternalInfluenceDSL.g:3242:4: enumLiteral_1= 'JavaNumericExpression'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getJavaNumericExpressionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageTypeAccess().getJavaNumericExpressionEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageType"


    // $ANTLR start "ruleTrendType"
    // InternalInfluenceDSL.g:3252:1: ruleTrendType returns [Enumerator current=null] : ( (enumLiteral_0= 'Increasing' ) | (enumLiteral_1= 'Decreasing' ) | (enumLiteral_2= 'Flat' ) | (enumLiteral_3= 'NotMonotonic' ) ) ;
    public final Enumerator ruleTrendType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:3258:2: ( ( (enumLiteral_0= 'Increasing' ) | (enumLiteral_1= 'Decreasing' ) | (enumLiteral_2= 'Flat' ) | (enumLiteral_3= 'NotMonotonic' ) ) )
            // InternalInfluenceDSL.g:3259:2: ( (enumLiteral_0= 'Increasing' ) | (enumLiteral_1= 'Decreasing' ) | (enumLiteral_2= 'Flat' ) | (enumLiteral_3= 'NotMonotonic' ) )
            {
            // InternalInfluenceDSL.g:3259:2: ( (enumLiteral_0= 'Increasing' ) | (enumLiteral_1= 'Decreasing' ) | (enumLiteral_2= 'Flat' ) | (enumLiteral_3= 'NotMonotonic' ) )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt61=1;
                }
                break;
            case 89:
                {
                alt61=2;
                }
                break;
            case 90:
                {
                alt61=3;
                }
                break;
            case 91:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalInfluenceDSL.g:3260:3: (enumLiteral_0= 'Increasing' )
                    {
                    // InternalInfluenceDSL.g:3260:3: (enumLiteral_0= 'Increasing' )
                    // InternalInfluenceDSL.g:3261:4: enumLiteral_0= 'Increasing'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getTrendTypeAccess().getIncreasingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTrendTypeAccess().getIncreasingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:3268:3: (enumLiteral_1= 'Decreasing' )
                    {
                    // InternalInfluenceDSL.g:3268:3: (enumLiteral_1= 'Decreasing' )
                    // InternalInfluenceDSL.g:3269:4: enumLiteral_1= 'Decreasing'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getTrendTypeAccess().getDecreasingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTrendTypeAccess().getDecreasingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:3276:3: (enumLiteral_2= 'Flat' )
                    {
                    // InternalInfluenceDSL.g:3276:3: (enumLiteral_2= 'Flat' )
                    // InternalInfluenceDSL.g:3277:4: enumLiteral_2= 'Flat'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getTrendTypeAccess().getFlatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTrendTypeAccess().getFlatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalInfluenceDSL.g:3284:3: (enumLiteral_3= 'NotMonotonic' )
                    {
                    // InternalInfluenceDSL.g:3284:3: (enumLiteral_3= 'NotMonotonic' )
                    // InternalInfluenceDSL.g:3285:4: enumLiteral_3= 'NotMonotonic'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getTrendTypeAccess().getNotMonotonicEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTrendTypeAccess().getNotMonotonicEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrendType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010100000A0A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0010100000A0A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L,0x0000000000018000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003C200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000030200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000064000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000001000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4400000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x3800000010000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x3000000010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x9800000010000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x9000000010000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1800000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1800000010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x1000000010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000040L,0x0000000000010000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000042L,0x0000000000060000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000040L,0x0000000000088000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});

}