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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "','", "'Requirement'", "'description'", "'satisfied'", "'when'", "'languageType'", "'EnvironmentalFactor'", "'flexibility'", "'value'", "'unit'", "'ArtifactParticipant'", "'weight'", "'likelihood'", "'confidence'", "'SystemResponseProperty'", "'constrainedBy'", "'CompositeInfluence'", "':'", "'internalInfluences'", "'('", "')'", "'ownedInfluenceFunction'", "'Influence'", "'#**'", "'**#'", "'participants'", "';'", "'influenceFunction'", "'affects'", "'definition'", "'returnType'", "'-'", "'.'", "'E'", "'e'", "'SRPInputParticipant'", "'EnvironmentalFactorParticipant'", "'DesignArtifact'", "'->'", "'changeability'", "'Real'", "'Text'", "'NaturalLanguage'", "'JavaNumericExpression'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalInfluenceDSL.g:72:1: ruleInfluenceModel returns [EObject current=null] : ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? ) ;
    public final EObject ruleInfluenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_8=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedSRPs_3_0 = null;

        EObject lv_ownedInfluences_4_0 = null;

        EObject lv_ownedRequirements_5_0 = null;

        EObject lv_ownedEnvironmentalFactors_6_0 = null;

        EObject lv_ownedArtifacts_7_0 = null;

        EObject lv_ownedSRPs_9_0 = null;

        EObject lv_ownedInfluences_10_0 = null;

        EObject lv_ownedRequirements_11_0 = null;

        EObject lv_ownedEnvironmentalFactors_12_0 = null;

        EObject lv_ownedArtifacts_13_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:78:2: ( ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? ) )
            // InternalInfluenceDSL.g:79:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? )
            {
            // InternalInfluenceDSL.g:79:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )? )
            // InternalInfluenceDSL.g:80:3: () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )?
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

            // InternalInfluenceDSL.g:110:3: ( ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13||LA5_0==18||LA5_0==26||LA5_0==28||LA5_0==34||LA5_0==49) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInfluenceDSL.g:111:4: ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) ) (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )* (otherlv_14= ',' )?
                    {
                    // InternalInfluenceDSL.g:111:4: ( ( (lv_ownedSRPs_3_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_4_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_5_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_6_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_7_0= ruleDesignArtifact ) ) )
                    int alt1=5;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt1=1;
                        }
                        break;
                    case 28:
                    case 34:
                        {
                        alt1=2;
                        }
                        break;
                    case 13:
                        {
                        alt1=3;
                        }
                        break;
                    case 18:
                        {
                        alt1=4;
                        }
                        break;
                    case 49:
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
                            // InternalInfluenceDSL.g:152:5: ( (lv_ownedRequirements_5_0= ruleRequirement ) )
                            {
                            // InternalInfluenceDSL.g:152:5: ( (lv_ownedRequirements_5_0= ruleRequirement ) )
                            // InternalInfluenceDSL.g:153:6: (lv_ownedRequirements_5_0= ruleRequirement )
                            {
                            // InternalInfluenceDSL.g:153:6: (lv_ownedRequirements_5_0= ruleRequirement )
                            // InternalInfluenceDSL.g:154:7: lv_ownedRequirements_5_0= ruleRequirement
                            {

                            							newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsRequirementParserRuleCall_3_0_2_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_ownedRequirements_5_0=ruleRequirement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                            							}
                            							add(
                            								current,
                            								"ownedRequirements",
                            								lv_ownedRequirements_5_0,
                            								"fr.inria.kairos.influence.InfluenceDSL.Requirement");
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

                    // InternalInfluenceDSL.g:212:4: (otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==13||LA3_1==18||LA3_1==26||LA3_1==28||LA3_1==34||LA3_1==49) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:213:5: otherlv_8= ',' ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getInfluenceModelAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalInfluenceDSL.g:217:5: ( ( (lv_ownedSRPs_9_0= ruleSystemResponseProperty ) ) | ( (lv_ownedInfluences_10_0= ruleAbstractInfluence ) ) | ( (lv_ownedRequirements_11_0= ruleRequirement ) ) | ( (lv_ownedEnvironmentalFactors_12_0= ruleEnvironmentalFactor ) ) | ( (lv_ownedArtifacts_13_0= ruleDesignArtifact ) ) )
                    	    int alt2=5;
                    	    switch ( input.LA(1) ) {
                    	    case 26:
                    	        {
                    	        alt2=1;
                    	        }
                    	        break;
                    	    case 28:
                    	    case 34:
                    	        {
                    	        alt2=2;
                    	        }
                    	        break;
                    	    case 13:
                    	        {
                    	        alt2=3;
                    	        }
                    	        break;
                    	    case 18:
                    	        {
                    	        alt2=4;
                    	        }
                    	        break;
                    	    case 49:
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
                    	            // InternalInfluenceDSL.g:258:6: ( (lv_ownedRequirements_11_0= ruleRequirement ) )
                    	            {
                    	            // InternalInfluenceDSL.g:258:6: ( (lv_ownedRequirements_11_0= ruleRequirement ) )
                    	            // InternalInfluenceDSL.g:259:7: (lv_ownedRequirements_11_0= ruleRequirement )
                    	            {
                    	            // InternalInfluenceDSL.g:259:7: (lv_ownedRequirements_11_0= ruleRequirement )
                    	            // InternalInfluenceDSL.g:260:8: lv_ownedRequirements_11_0= ruleRequirement
                    	            {

                    	            								newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsRequirementParserRuleCall_3_1_1_2_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_ownedRequirements_11_0=ruleRequirement();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"ownedRequirements",
                    	            									lv_ownedRequirements_11_0,
                    	            									"fr.inria.kairos.influence.InfluenceDSL.Requirement");
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

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
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
            case 47:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 22:
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


    // $ANTLR start "entryRuleRequirement"
    // InternalInfluenceDSL.g:445:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalInfluenceDSL.g:445:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalInfluenceDSL.g:446:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalInfluenceDSL.g:452:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'satisfied' otherlv_5= 'when' ( (lv_satisfaction_6_0= ruleEString ) ) otherlv_7= 'languageType' ( (lv_language_8_0= ruleLanguageType ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_6_0 = null;

        Enumerator lv_language_8_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:458:2: ( (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'satisfied' otherlv_5= 'when' ( (lv_satisfaction_6_0= ruleEString ) ) otherlv_7= 'languageType' ( (lv_language_8_0= ruleLanguageType ) ) ) )
            // InternalInfluenceDSL.g:459:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'satisfied' otherlv_5= 'when' ( (lv_satisfaction_6_0= ruleEString ) ) otherlv_7= 'languageType' ( (lv_language_8_0= ruleLanguageType ) ) )
            {
            // InternalInfluenceDSL.g:459:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'satisfied' otherlv_5= 'when' ( (lv_satisfaction_6_0= ruleEString ) ) otherlv_7= 'languageType' ( (lv_language_8_0= ruleLanguageType ) ) )
            // InternalInfluenceDSL.g:460:3: otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'satisfied' otherlv_5= 'when' ( (lv_satisfaction_6_0= ruleEString ) ) otherlv_7= 'languageType' ( (lv_language_8_0= ruleLanguageType ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalInfluenceDSL.g:464:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:465:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:465:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:466:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getDescriptionKeyword_2());
            		
            // InternalInfluenceDSL.g:487:3: ( (lv_description_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:488:4: (lv_description_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:488:4: (lv_description_3_0= ruleEString )
            // InternalInfluenceDSL.g:489:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getSatisfiedKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getWhenKeyword_5());
            		
            // InternalInfluenceDSL.g:514:3: ( (lv_satisfaction_6_0= ruleEString ) )
            // InternalInfluenceDSL.g:515:4: (lv_satisfaction_6_0= ruleEString )
            {
            // InternalInfluenceDSL.g:515:4: (lv_satisfaction_6_0= ruleEString )
            // InternalInfluenceDSL.g:516:5: lv_satisfaction_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getSatisfactionEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_satisfaction_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"satisfaction",
            						lv_satisfaction_6_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getLanguageTypeKeyword_7());
            		
            // InternalInfluenceDSL.g:537:3: ( (lv_language_8_0= ruleLanguageType ) )
            // InternalInfluenceDSL.g:538:4: (lv_language_8_0= ruleLanguageType )
            {
            // InternalInfluenceDSL.g:538:4: (lv_language_8_0= ruleLanguageType )
            // InternalInfluenceDSL.g:539:5: lv_language_8_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getLanguageLanguageTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_language_8_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_8_0,
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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleEnvironmentalFactor"
    // InternalInfluenceDSL.g:560:1: entryRuleEnvironmentalFactor returns [EObject current=null] : iv_ruleEnvironmentalFactor= ruleEnvironmentalFactor EOF ;
    public final EObject entryRuleEnvironmentalFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentalFactor = null;


        try {
            // InternalInfluenceDSL.g:560:60: (iv_ruleEnvironmentalFactor= ruleEnvironmentalFactor EOF )
            // InternalInfluenceDSL.g:561:2: iv_ruleEnvironmentalFactor= ruleEnvironmentalFactor EOF
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
    // InternalInfluenceDSL.g:567:1: ruleEnvironmentalFactor returns [EObject current=null] : ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? ) ;
    public final EObject ruleEnvironmentalFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_flexibility_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_unit_10_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:573:2: ( ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:574:2: ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:574:2: ( () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:575:3: () otherlv_1= 'EnvironmentalFactor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )?
            {
            // InternalInfluenceDSL.g:575:3: ()
            // InternalInfluenceDSL.g:576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentalFactorAccess().getEnvironmentalFactorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentalFactorAccess().getEnvironmentalFactorKeyword_1());
            		
            // InternalInfluenceDSL.g:586:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:587:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:587:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:588:5: lv_name_2_0= ruleEString
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
            		
            // InternalInfluenceDSL.g:609:3: ( (lv_description_4_0= ruleEString ) )
            // InternalInfluenceDSL.g:610:4: (lv_description_4_0= ruleEString )
            {
            // InternalInfluenceDSL.g:610:4: (lv_description_4_0= ruleEString )
            // InternalInfluenceDSL.g:611:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalInfluenceDSL.g:628:3: (otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInfluenceDSL.g:629:4: otherlv_5= 'flexibility' ( (lv_flexibility_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentalFactorAccess().getFlexibilityKeyword_5_0());
                    			
                    // InternalInfluenceDSL.g:633:4: ( (lv_flexibility_6_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:634:5: (lv_flexibility_6_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:634:5: (lv_flexibility_6_0= ruleEDouble )
                    // InternalInfluenceDSL.g:635:6: lv_flexibility_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getFlexibilityEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            // InternalInfluenceDSL.g:653:3: (otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalInfluenceDSL.g:654:4: otherlv_7= 'value' ( (lv_value_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getEnvironmentalFactorAccess().getValueKeyword_6_0());
                    			
                    // InternalInfluenceDSL.g:658:4: ( (lv_value_8_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:659:5: (lv_value_8_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:659:5: (lv_value_8_0= ruleEDouble )
                    // InternalInfluenceDSL.g:660:6: lv_value_8_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getValueEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_8_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:678:3: (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalInfluenceDSL.g:679:4: otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentalFactorAccess().getUnitKeyword_7_0());
                    			
                    // InternalInfluenceDSL.g:683:4: ( (lv_unit_10_0= ruleEString ) )
                    // InternalInfluenceDSL.g:684:5: (lv_unit_10_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:684:5: (lv_unit_10_0= ruleEString )
                    // InternalInfluenceDSL.g:685:6: lv_unit_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorAccess().getUnitEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_10_0,
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
    // $ANTLR end "ruleEnvironmentalFactor"


    // $ANTLR start "entryRuleArtifactParticipant"
    // InternalInfluenceDSL.g:707:1: entryRuleArtifactParticipant returns [EObject current=null] : iv_ruleArtifactParticipant= ruleArtifactParticipant EOF ;
    public final EObject entryRuleArtifactParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactParticipant = null;


        try {
            // InternalInfluenceDSL.g:707:60: (iv_ruleArtifactParticipant= ruleArtifactParticipant EOF )
            // InternalInfluenceDSL.g:708:2: iv_ruleArtifactParticipant= ruleArtifactParticipant EOF
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
    // InternalInfluenceDSL.g:714:1: ruleArtifactParticipant returns [EObject current=null] : (otherlv_0= 'ArtifactParticipant' ( ( ruleEString ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleArtifactParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_weight_3_0 = null;

        AntlrDatatypeRuleToken lv_likelihood_5_0 = null;

        AntlrDatatypeRuleToken lv_confidence_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:720:2: ( (otherlv_0= 'ArtifactParticipant' ( ( ruleEString ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:721:2: (otherlv_0= 'ArtifactParticipant' ( ( ruleEString ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:721:2: (otherlv_0= 'ArtifactParticipant' ( ( ruleEString ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:722:3: otherlv_0= 'ArtifactParticipant' ( ( ruleEString ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactParticipantAccess().getArtifactParticipantKeyword_0());
            		
            // InternalInfluenceDSL.g:726:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:727:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:727:4: ( ruleEString )
            // InternalInfluenceDSL.g:728:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArtifactParticipantAccess().getTargetDesignArtifactCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:742:3: (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInfluenceDSL.g:743:4: otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getArtifactParticipantAccess().getWeightKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:747:4: ( (lv_weight_3_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:748:5: (lv_weight_3_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:748:5: (lv_weight_3_0= ruleEDouble )
                    // InternalInfluenceDSL.g:749:6: lv_weight_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getArtifactParticipantAccess().getWeightEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_weight_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactParticipantRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:767:3: (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalInfluenceDSL.g:768:4: otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactParticipantAccess().getLikelihoodKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:772:4: ( (lv_likelihood_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:773:5: (lv_likelihood_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:773:5: (lv_likelihood_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:774:6: lv_likelihood_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getArtifactParticipantAccess().getLikelihoodEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_likelihood_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactParticipantRule());
                    						}
                    						set(
                    							current,
                    							"likelihood",
                    							lv_likelihood_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:792:3: (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInfluenceDSL.g:793:4: otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getArtifactParticipantAccess().getConfidenceKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:797:4: ( (lv_confidence_7_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:798:5: (lv_confidence_7_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:798:5: (lv_confidence_7_0= ruleEDouble )
                    // InternalInfluenceDSL.g:799:6: lv_confidence_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getArtifactParticipantAccess().getConfidenceEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_confidence_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactParticipantRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_7_0,
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


    // $ANTLR start "entryRuleSystemResponseProperty"
    // InternalInfluenceDSL.g:821:1: entryRuleSystemResponseProperty returns [EObject current=null] : iv_ruleSystemResponseProperty= ruleSystemResponseProperty EOF ;
    public final EObject entryRuleSystemResponseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemResponseProperty = null;


        try {
            // InternalInfluenceDSL.g:821:63: (iv_ruleSystemResponseProperty= ruleSystemResponseProperty EOF )
            // InternalInfluenceDSL.g:822:2: iv_ruleSystemResponseProperty= ruleSystemResponseProperty EOF
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
    // InternalInfluenceDSL.g:828:1: ruleSystemResponseProperty returns [EObject current=null] : (otherlv_0= 'SystemResponseProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleSystemResponseProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:834:2: ( (otherlv_0= 'SystemResponseProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalInfluenceDSL.g:835:2: (otherlv_0= 'SystemResponseProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalInfluenceDSL.g:835:2: (otherlv_0= 'SystemResponseProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalInfluenceDSL.g:836:3: otherlv_0= 'SystemResponseProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemResponsePropertyAccess().getSystemResponsePropertyKeyword_0());
            		
            // InternalInfluenceDSL.g:840:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:841:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:841:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:842:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemResponsePropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemResponsePropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemResponsePropertyAccess().getDescriptionKeyword_2());
            		
            // InternalInfluenceDSL.g:863:3: ( (lv_description_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:864:4: (lv_description_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:864:4: (lv_description_3_0= ruleEString )
            // InternalInfluenceDSL.g:865:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemResponsePropertyAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemResponsePropertyRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:882:3: (otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalInfluenceDSL.g:883:4: otherlv_4= 'constrainedBy' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemResponsePropertyAccess().getConstrainedByKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:887:4: ( ( ruleQualifiedName ) )
                    // InternalInfluenceDSL.g:888:5: ( ruleQualifiedName )
                    {
                    // InternalInfluenceDSL.g:888:5: ( ruleQualifiedName )
                    // InternalInfluenceDSL.g:889:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemResponsePropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemResponsePropertyAccess().getConstrainedByRequirementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:903:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==12) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==RULE_ID) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:904:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_20); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemResponsePropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalInfluenceDSL.g:908:5: ( ( ruleQualifiedName ) )
                    	    // InternalInfluenceDSL.g:909:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalInfluenceDSL.g:909:6: ( ruleQualifiedName )
                    	    // InternalInfluenceDSL.g:910:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemResponsePropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemResponsePropertyAccess().getConstrainedByRequirementCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


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
    // $ANTLR end "ruleSystemResponseProperty"


    // $ANTLR start "entryRuleCompositeInfluence"
    // InternalInfluenceDSL.g:930:1: entryRuleCompositeInfluence returns [EObject current=null] : iv_ruleCompositeInfluence= ruleCompositeInfluence EOF ;
    public final EObject entryRuleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeInfluence = null;


        try {
            // InternalInfluenceDSL.g:930:59: (iv_ruleCompositeInfluence= ruleCompositeInfluence EOF )
            // InternalInfluenceDSL.g:931:2: iv_ruleCompositeInfluence= ruleCompositeInfluence EOF
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
    // InternalInfluenceDSL.g:937:1: ruleCompositeInfluence returns [EObject current=null] : (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* otherlv_7= 'internalInfluences' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) ) ;
    public final EObject ruleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_ownedInfluenceFunction_14_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:943:2: ( (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* otherlv_7= 'internalInfluences' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) ) )
            // InternalInfluenceDSL.g:944:2: (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* otherlv_7= 'internalInfluences' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) )
            {
            // InternalInfluenceDSL.g:944:2: (otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* otherlv_7= 'internalInfluences' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) )
            // InternalInfluenceDSL.g:945:3: otherlv_0= 'CompositeInfluence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* otherlv_7= 'internalInfluences' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= 'ownedInfluenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeInfluenceAccess().getCompositeInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:949:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:950:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:950:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:951:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeInfluenceAccess().getDescriptionKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeInfluenceAccess().getColonKeyword_3());
            		
            // InternalInfluenceDSL.g:976:3: ( (lv_description_4_0= ruleEString ) )
            // InternalInfluenceDSL.g:977:4: (lv_description_4_0= ruleEString )
            {
            // InternalInfluenceDSL.g:977:4: (lv_description_4_0= ruleEString )
            // InternalInfluenceDSL.g:978:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_description_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_4_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:995:3: (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfluenceDSL.g:996:4: otherlv_5= ',' ( (lv_description_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalInfluenceDSL.g:1000:4: ( (lv_description_6_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:1001:5: (lv_description_6_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:1001:5: (lv_description_6_0= ruleEString )
            	    // InternalInfluenceDSL.g:1002:6: lv_description_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_description_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"description",
            	    							lv_description_6_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesKeyword_6());
            		
            otherlv_8=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositeInfluenceAccess().getLeftParenthesisKeyword_7());
            		
            // InternalInfluenceDSL.g:1028:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:1029:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:1029:4: ( ruleEString )
            // InternalInfluenceDSL.g:1030:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_8_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1044:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1045:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalInfluenceDSL.g:1049:4: ( ( ruleEString ) )
            	    // InternalInfluenceDSL.g:1050:5: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:1050:5: ( ruleEString )
            	    // InternalInfluenceDSL.g:1051:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositeInfluenceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_12=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_12, grammarAccess.getCompositeInfluenceAccess().getRightParenthesisKeyword_10());
            		
            otherlv_13=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getCompositeInfluenceAccess().getOwnedInfluenceFunctionKeyword_11());
            		
            // InternalInfluenceDSL.g:1074:3: ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) )
            // InternalInfluenceDSL.g:1075:4: (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction )
            {
            // InternalInfluenceDSL.g:1075:4: (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction )
            // InternalInfluenceDSL.g:1076:5: lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getOwnedInfluenceFunctionInfluenceFunctionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedInfluenceFunction_14_0=ruleInfluenceFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					set(
            						current,
            						"ownedInfluenceFunction",
            						lv_ownedInfluenceFunction_14_0,
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


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:1097:1: entryRuleInfluence returns [EObject current=null] : iv_ruleInfluence= ruleInfluence EOF ;
    public final EObject entryRuleInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluence = null;


        try {
            // InternalInfluenceDSL.g:1097:50: (iv_ruleInfluence= ruleInfluence EOF )
            // InternalInfluenceDSL.g:1098:2: iv_ruleInfluence= ruleInfluence EOF
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
    // InternalInfluenceDSL.g:1104:1: ruleInfluence returns [EObject current=null] : (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'participants' otherlv_8= ':' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) (otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) ) )* otherlv_12= ';' otherlv_13= 'influenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) otherlv_15= ';' otherlv_16= 'affects' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_ownedParticipants_9_0 = null;

        EObject lv_ownedParticipants_11_0 = null;

        EObject lv_ownedInfluenceFunction_14_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1110:2: ( (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'participants' otherlv_8= ':' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) (otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) ) )* otherlv_12= ';' otherlv_13= 'influenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) otherlv_15= ';' otherlv_16= 'affects' ( ( ruleQualifiedName ) ) ) )
            // InternalInfluenceDSL.g:1111:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'participants' otherlv_8= ':' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) (otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) ) )* otherlv_12= ';' otherlv_13= 'influenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) otherlv_15= ';' otherlv_16= 'affects' ( ( ruleQualifiedName ) ) )
            {
            // InternalInfluenceDSL.g:1111:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'participants' otherlv_8= ':' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) (otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) ) )* otherlv_12= ';' otherlv_13= 'influenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) otherlv_15= ';' otherlv_16= 'affects' ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:1112:3: otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'participants' otherlv_8= ':' ( (lv_ownedParticipants_9_0= ruleParticipant ) ) (otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) ) )* otherlv_12= ';' otherlv_13= 'influenceFunction' ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) ) otherlv_15= ';' otherlv_16= 'affects' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluenceAccess().getInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:1116:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1117:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1117:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1118:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_2());
            		
            // InternalInfluenceDSL.g:1139:3: ( (lv_description_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:1140:4: (lv_description_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1140:4: (lv_description_3_0= ruleEString )
            // InternalInfluenceDSL.g:1141:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_3_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1158:3: (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1159:4: otherlv_4= ',' ( (lv_description_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInfluenceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInfluenceDSL.g:1163:4: ( (lv_description_5_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:1164:5: (lv_description_5_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:1164:5: (lv_description_5_0= ruleEString )
            	    // InternalInfluenceDSL.g:1165:6: lv_description_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_description_5_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"description",
            	    							lv_description_5_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalInfluenceDSL.g:1183:3: (otherlv_6= '**#' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:1184:4: otherlv_6= '**#'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getInfluenceAccess().getParticipantsKeyword_6());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getInfluenceAccess().getColonKeyword_7());
            		
            // InternalInfluenceDSL.g:1197:3: ( (lv_ownedParticipants_9_0= ruleParticipant ) )
            // InternalInfluenceDSL.g:1198:4: (lv_ownedParticipants_9_0= ruleParticipant )
            {
            // InternalInfluenceDSL.g:1198:4: (lv_ownedParticipants_9_0= ruleParticipant )
            // InternalInfluenceDSL.g:1199:5: lv_ownedParticipants_9_0= ruleParticipant
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedParticipantsParticipantParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalInfluenceDSL.g:1216:3: (otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1217:4: otherlv_10= ',' ( (lv_ownedParticipants_11_0= ruleParticipant ) )
            	    {
            	    otherlv_10=(Token)match(input,12,FOLLOW_29); 

            	    				newLeafNode(otherlv_10, grammarAccess.getInfluenceAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalInfluenceDSL.g:1221:4: ( (lv_ownedParticipants_11_0= ruleParticipant ) )
            	    // InternalInfluenceDSL.g:1222:5: (lv_ownedParticipants_11_0= ruleParticipant )
            	    {
            	    // InternalInfluenceDSL.g:1222:5: (lv_ownedParticipants_11_0= ruleParticipant )
            	    // InternalInfluenceDSL.g:1223:6: lv_ownedParticipants_11_0= ruleParticipant
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedParticipantsParticipantParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_ownedParticipants_11_0=ruleParticipant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedParticipants",
            	    							lv_ownedParticipants_11_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.Participant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_12=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_12, grammarAccess.getInfluenceAccess().getSemicolonKeyword_10());
            		
            otherlv_13=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getInfluenceAccess().getInfluenceFunctionKeyword_11());
            		
            // InternalInfluenceDSL.g:1249:3: ( (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction ) )
            // InternalInfluenceDSL.g:1250:4: (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction )
            {
            // InternalInfluenceDSL.g:1250:4: (lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction )
            // InternalInfluenceDSL.g:1251:5: lv_ownedInfluenceFunction_14_0= ruleInfluenceFunction
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedInfluenceFunctionInfluenceFunctionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_32);
            lv_ownedInfluenceFunction_14_0=ruleInfluenceFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					set(
            						current,
            						"ownedInfluenceFunction",
            						lv_ownedInfluenceFunction_14_0,
            						"fr.inria.kairos.influence.InfluenceDSL.InfluenceFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_15, grammarAccess.getInfluenceAccess().getSemicolonKeyword_13());
            		
            otherlv_16=(Token)match(input,40,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getInfluenceAccess().getAffectsKeyword_14());
            		
            // InternalInfluenceDSL.g:1276:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1277:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1277:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1278:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOutputSRPSystemResponsePropertyCrossReference_15_0());
            				
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


    // $ANTLR start "entryRuleInfluenceFunction"
    // InternalInfluenceDSL.g:1296:1: entryRuleInfluenceFunction returns [EObject current=null] : iv_ruleInfluenceFunction= ruleInfluenceFunction EOF ;
    public final EObject entryRuleInfluenceFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluenceFunction = null;


        try {
            // InternalInfluenceDSL.g:1296:58: (iv_ruleInfluenceFunction= ruleInfluenceFunction EOF )
            // InternalInfluenceDSL.g:1297:2: iv_ruleInfluenceFunction= ruleInfluenceFunction EOF
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
    // InternalInfluenceDSL.g:1303:1: ruleInfluenceFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'definition' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= 'languageType' ( (lv_language_7_0= ruleLanguageType ) ) ) ;
    public final EObject ruleInfluenceFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_definition_3_0 = null;

        Enumerator lv_returnType_5_0 = null;

        Enumerator lv_language_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1309:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'definition' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= 'languageType' ( (lv_language_7_0= ruleLanguageType ) ) ) )
            // InternalInfluenceDSL.g:1310:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'definition' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= 'languageType' ( (lv_language_7_0= ruleLanguageType ) ) )
            {
            // InternalInfluenceDSL.g:1310:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'definition' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= 'languageType' ( (lv_language_7_0= ruleLanguageType ) ) )
            // InternalInfluenceDSL.g:1311:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'definition' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= 'languageType' ( (lv_language_7_0= ruleLanguageType ) )
            {
            // InternalInfluenceDSL.g:1311:3: ( (lv_name_0_0= ruleEString ) )
            // InternalInfluenceDSL.g:1312:4: (lv_name_0_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1312:4: (lv_name_0_0= ruleEString )
            // InternalInfluenceDSL.g:1313:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getInfluenceFunctionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluenceFunctionAccess().getDefinitionKeyword_2());
            		
            // InternalInfluenceDSL.g:1338:3: ( (lv_definition_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:1339:4: (lv_definition_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1339:4: (lv_definition_3_0= ruleEString )
            // InternalInfluenceDSL.g:1340:5: lv_definition_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getDefinitionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_definition_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_3_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getInfluenceFunctionAccess().getReturnTypeKeyword_4());
            		
            // InternalInfluenceDSL.g:1361:3: ( (lv_returnType_5_0= ruleValueType ) )
            // InternalInfluenceDSL.g:1362:4: (lv_returnType_5_0= ruleValueType )
            {
            // InternalInfluenceDSL.g:1362:4: (lv_returnType_5_0= ruleValueType )
            // InternalInfluenceDSL.g:1363:5: lv_returnType_5_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getReturnTypeValueTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_returnType_5_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_5_0,
            						"fr.inria.kairos.influence.InfluenceDSL.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getInfluenceFunctionAccess().getLanguageTypeKeyword_6());
            		
            // InternalInfluenceDSL.g:1384:3: ( (lv_language_7_0= ruleLanguageType ) )
            // InternalInfluenceDSL.g:1385:4: (lv_language_7_0= ruleLanguageType )
            {
            // InternalInfluenceDSL.g:1385:4: (lv_language_7_0= ruleLanguageType )
            // InternalInfluenceDSL.g:1386:5: lv_language_7_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getInfluenceFunctionAccess().getLanguageLanguageTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_language_7_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceFunctionRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_7_0,
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
    // $ANTLR end "ruleInfluenceFunction"


    // $ANTLR start "entryRuleEDouble"
    // InternalInfluenceDSL.g:1407:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalInfluenceDSL.g:1407:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalInfluenceDSL.g:1408:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalInfluenceDSL.g:1414:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1420:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalInfluenceDSL.g:1421:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalInfluenceDSL.g:1421:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalInfluenceDSL.g:1422:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalInfluenceDSL.g:1422:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalInfluenceDSL.g:1423:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:1429:3: (this_INT_1= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalInfluenceDSL.g:1430:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_38); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_40); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalInfluenceDSL.g:1450:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=45 && LA26_0<=46)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalInfluenceDSL.g:1451:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalInfluenceDSL.g:1451:4: (kw= 'E' | kw= 'e' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==45) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==46) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalInfluenceDSL.g:1452:5: kw= 'E'
                            {
                            kw=(Token)match(input,45,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalInfluenceDSL.g:1458:5: kw= 'e'
                            {
                            kw=(Token)match(input,46,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalInfluenceDSL.g:1464:4: (kw= '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==43) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalInfluenceDSL.g:1465:5: kw= '-'
                            {
                            kw=(Token)match(input,43,FOLLOW_39); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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


    // $ANTLR start "entryRuleSRPInputParticipant"
    // InternalInfluenceDSL.g:1483:1: entryRuleSRPInputParticipant returns [EObject current=null] : iv_ruleSRPInputParticipant= ruleSRPInputParticipant EOF ;
    public final EObject entryRuleSRPInputParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRPInputParticipant = null;


        try {
            // InternalInfluenceDSL.g:1483:60: (iv_ruleSRPInputParticipant= ruleSRPInputParticipant EOF )
            // InternalInfluenceDSL.g:1484:2: iv_ruleSRPInputParticipant= ruleSRPInputParticipant EOF
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
    // InternalInfluenceDSL.g:1490:1: ruleSRPInputParticipant returns [EObject current=null] : (otherlv_0= 'SRPInputParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleSRPInputParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_weight_3_0 = null;

        AntlrDatatypeRuleToken lv_likelihood_5_0 = null;

        AntlrDatatypeRuleToken lv_confidence_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1496:2: ( (otherlv_0= 'SRPInputParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:1497:2: (otherlv_0= 'SRPInputParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:1497:2: (otherlv_0= 'SRPInputParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:1498:3: otherlv_0= 'SRPInputParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSRPInputParticipantAccess().getSRPInputParticipantKeyword_0());
            		
            // InternalInfluenceDSL.g:1502:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1503:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1503:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1504:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSRPInputParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getTargetSystemResponsePropertyCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1518:3: (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalInfluenceDSL.g:1519:4: otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getSRPInputParticipantAccess().getWeightKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:1523:4: ( (lv_weight_3_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1524:5: (lv_weight_3_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1524:5: (lv_weight_3_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1525:6: lv_weight_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getWeightEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_weight_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSRPInputParticipantRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1543:3: (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalInfluenceDSL.g:1544:4: otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getSRPInputParticipantAccess().getLikelihoodKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:1548:4: ( (lv_likelihood_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1549:5: (lv_likelihood_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1549:5: (lv_likelihood_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1550:6: lv_likelihood_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getLikelihoodEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_likelihood_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSRPInputParticipantRule());
                    						}
                    						set(
                    							current,
                    							"likelihood",
                    							lv_likelihood_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1568:3: (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalInfluenceDSL.g:1569:4: otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSRPInputParticipantAccess().getConfidenceKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:1573:4: ( (lv_confidence_7_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1574:5: (lv_confidence_7_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1574:5: (lv_confidence_7_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1575:6: lv_confidence_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSRPInputParticipantAccess().getConfidenceEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_confidence_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSRPInputParticipantRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_7_0,
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
    // InternalInfluenceDSL.g:1597:1: entryRuleEnvironmentalFactorParticipant returns [EObject current=null] : iv_ruleEnvironmentalFactorParticipant= ruleEnvironmentalFactorParticipant EOF ;
    public final EObject entryRuleEnvironmentalFactorParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentalFactorParticipant = null;


        try {
            // InternalInfluenceDSL.g:1597:71: (iv_ruleEnvironmentalFactorParticipant= ruleEnvironmentalFactorParticipant EOF )
            // InternalInfluenceDSL.g:1598:2: iv_ruleEnvironmentalFactorParticipant= ruleEnvironmentalFactorParticipant EOF
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
    // InternalInfluenceDSL.g:1604:1: ruleEnvironmentalFactorParticipant returns [EObject current=null] : (otherlv_0= 'EnvironmentalFactorParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleEnvironmentalFactorParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_weight_3_0 = null;

        AntlrDatatypeRuleToken lv_likelihood_5_0 = null;

        AntlrDatatypeRuleToken lv_confidence_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1610:2: ( (otherlv_0= 'EnvironmentalFactorParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:1611:2: (otherlv_0= 'EnvironmentalFactorParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:1611:2: (otherlv_0= 'EnvironmentalFactorParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:1612:3: otherlv_0= 'EnvironmentalFactorParticipant' ( ( ruleQualifiedName ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )? (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )? (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentalFactorParticipantAccess().getEnvironmentalFactorParticipantKeyword_0());
            		
            // InternalInfluenceDSL.g:1616:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1617:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1617:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1618:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentalFactorParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getTargetEnvironmentalFactorCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1632:3: (otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalInfluenceDSL.g:1633:4: otherlv_2= 'weight' ( (lv_weight_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentalFactorParticipantAccess().getWeightKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:1637:4: ( (lv_weight_3_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1638:5: (lv_weight_3_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1638:5: (lv_weight_3_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1639:6: lv_weight_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getWeightEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_weight_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorParticipantRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1657:3: (otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalInfluenceDSL.g:1658:4: otherlv_4= 'likelihood' ( (lv_likelihood_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentalFactorParticipantAccess().getLikelihoodKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:1662:4: ( (lv_likelihood_5_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1663:5: (lv_likelihood_5_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1663:5: (lv_likelihood_5_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1664:6: lv_likelihood_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getLikelihoodEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_likelihood_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorParticipantRule());
                    						}
                    						set(
                    							current,
                    							"likelihood",
                    							lv_likelihood_5_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:1682:3: (otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalInfluenceDSL.g:1683:4: otherlv_6= 'confidence' ( (lv_confidence_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentalFactorParticipantAccess().getConfidenceKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:1687:4: ( (lv_confidence_7_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1688:5: (lv_confidence_7_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1688:5: (lv_confidence_7_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1689:6: lv_confidence_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalFactorParticipantAccess().getConfidenceEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_confidence_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalFactorParticipantRule());
                    						}
                    						set(
                    							current,
                    							"confidence",
                    							lv_confidence_7_0,
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
    // $ANTLR end "ruleEnvironmentalFactorParticipant"


    // $ANTLR start "entryRuleDesignArtifact"
    // InternalInfluenceDSL.g:1711:1: entryRuleDesignArtifact returns [EObject current=null] : iv_ruleDesignArtifact= ruleDesignArtifact EOF ;
    public final EObject entryRuleDesignArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignArtifact = null;


        try {
            // InternalInfluenceDSL.g:1711:55: (iv_ruleDesignArtifact= ruleDesignArtifact EOF )
            // InternalInfluenceDSL.g:1712:2: iv_ruleDesignArtifact= ruleDesignArtifact EOF
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
    // InternalInfluenceDSL.g:1718:1: ruleDesignArtifact returns [EObject current=null] : ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleDesignArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_changeability_6_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1724:2: ( ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? ) )
            // InternalInfluenceDSL.g:1725:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? )
            {
            // InternalInfluenceDSL.g:1725:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )? )
            // InternalInfluenceDSL.g:1726:3: () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )?
            {
            // InternalInfluenceDSL.g:1726:3: ()
            // InternalInfluenceDSL.g:1727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1());
            		
            // InternalInfluenceDSL.g:1737:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:1738:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1738:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:1739:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalInfluenceDSL.g:1760:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:1761:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:1761:4: ( ruleEString )
            // InternalInfluenceDSL.g:1762:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignArtifactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1776:3: (otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalInfluenceDSL.g:1777:4: otherlv_5= 'changeability' ( (lv_changeability_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getDesignArtifactAccess().getChangeabilityKeyword_5_0());
                    			
                    // InternalInfluenceDSL.g:1781:4: ( (lv_changeability_6_0= ruleEDouble ) )
                    // InternalInfluenceDSL.g:1782:5: (lv_changeability_6_0= ruleEDouble )
                    {
                    // InternalInfluenceDSL.g:1782:5: (lv_changeability_6_0= ruleEDouble )
                    // InternalInfluenceDSL.g:1783:6: lv_changeability_6_0= ruleEDouble
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInfluenceDSL.g:1805:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalInfluenceDSL.g:1805:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:1806:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalInfluenceDSL.g:1812:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1818:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalInfluenceDSL.g:1819:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalInfluenceDSL.g:1819:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalInfluenceDSL.g:1820:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalInfluenceDSL.g:1827:3: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1828:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
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


    // $ANTLR start "ruleValueType"
    // InternalInfluenceDSL.g:1845:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'Real' ) | (enumLiteral_1= 'Text' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1851:2: ( ( (enumLiteral_0= 'Real' ) | (enumLiteral_1= 'Text' ) ) )
            // InternalInfluenceDSL.g:1852:2: ( (enumLiteral_0= 'Real' ) | (enumLiteral_1= 'Text' ) )
            {
            // InternalInfluenceDSL.g:1852:2: ( (enumLiteral_0= 'Real' ) | (enumLiteral_1= 'Text' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            else if ( (LA35_0==53) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalInfluenceDSL.g:1853:3: (enumLiteral_0= 'Real' )
                    {
                    // InternalInfluenceDSL.g:1853:3: (enumLiteral_0= 'Real' )
                    // InternalInfluenceDSL.g:1854:4: enumLiteral_0= 'Real'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getRealEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getRealEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:1861:3: (enumLiteral_1= 'Text' )
                    {
                    // InternalInfluenceDSL.g:1861:3: (enumLiteral_1= 'Text' )
                    // InternalInfluenceDSL.g:1862:4: enumLiteral_1= 'Text'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getTextEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleLanguageType"
    // InternalInfluenceDSL.g:1872:1: ruleLanguageType returns [Enumerator current=null] : ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) ) ;
    public final Enumerator ruleLanguageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1878:2: ( ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) ) )
            // InternalInfluenceDSL.g:1879:2: ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) )
            {
            // InternalInfluenceDSL.g:1879:2: ( (enumLiteral_0= 'NaturalLanguage' ) | (enumLiteral_1= 'JavaNumericExpression' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            else if ( (LA36_0==55) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalInfluenceDSL.g:1880:3: (enumLiteral_0= 'NaturalLanguage' )
                    {
                    // InternalInfluenceDSL.g:1880:3: (enumLiteral_0= 'NaturalLanguage' )
                    // InternalInfluenceDSL.g:1881:4: enumLiteral_0= 'NaturalLanguage'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getNaturalLanguageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageTypeAccess().getNaturalLanguageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:1888:3: (enumLiteral_1= 'JavaNumericExpression' )
                    {
                    // InternalInfluenceDSL.g:1888:3: (enumLiteral_1= 'JavaNumericExpression' )
                    // InternalInfluenceDSL.g:1889:4: enumLiteral_1= 'JavaNumericExpression'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002000414042002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000414042000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000180000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000002L});

}