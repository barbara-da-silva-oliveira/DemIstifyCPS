package fr.inria.kairos.influence.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'Composite'", "'Influence'", "'#**'", "','", "'**#'", "'encapsulate'", "'affects'", "'and'", "'originators'", "':'", "'artifact'", "'phenomena'", "'system'", "'response'", "'fun'", "'('", "')'", "'Phenomenon'", "'metadata'", "'Requirement'", "'satisfied'", "'when'", "'DesignArtifact'", "'->'", "'used'", "'in'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalInfluenceDSL.g:64:1: entryRuleInfluenceModel returns [EObject current=null] : iv_ruleInfluenceModel= ruleInfluenceModel EOF ;
    public final EObject entryRuleInfluenceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluenceModel = null;


        try {
            // InternalInfluenceDSL.g:64:55: (iv_ruleInfluenceModel= ruleInfluenceModel EOF )
            // InternalInfluenceDSL.g:65:2: iv_ruleInfluenceModel= ruleInfluenceModel EOF
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
    // InternalInfluenceDSL.g:71:1: ruleInfluenceModel returns [EObject current=null] : ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) ) | ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) ) )* ) ;
    public final EObject ruleInfluenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedArtifacts_3_0 = null;

        EObject lv_ownedRequirements_4_0 = null;

        EObject lv_ownedPhysicalPhenomena_5_0 = null;

        EObject lv_ownedInfluences_6_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:77:2: ( ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) ) | ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) ) )* ) )
            // InternalInfluenceDSL.g:78:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) ) | ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) ) )* )
            {
            // InternalInfluenceDSL.g:78:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) ) | ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) ) )* )
            // InternalInfluenceDSL.g:79:3: () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) ) | ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) ) )*
            {
            // InternalInfluenceDSL.g:79:3: ()
            // InternalInfluenceDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInfluenceModelAccess().getInfluenceModelKeyword_1());
            		
            // InternalInfluenceDSL.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:91:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:92:5: lv_name_2_0= ruleEString
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

            // InternalInfluenceDSL.g:109:3: ( ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) ) | ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    alt1=1;
                    }
                    break;
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 29:
                    {
                    alt1=3;
                    }
                    break;
                case 12:
                case 13:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalInfluenceDSL.g:110:4: ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) )
            	    {
            	    // InternalInfluenceDSL.g:110:4: ( (lv_ownedArtifacts_3_0= ruleDesignArtifact ) )
            	    // InternalInfluenceDSL.g:111:5: (lv_ownedArtifacts_3_0= ruleDesignArtifact )
            	    {
            	    // InternalInfluenceDSL.g:111:5: (lv_ownedArtifacts_3_0= ruleDesignArtifact )
            	    // InternalInfluenceDSL.g:112:6: lv_ownedArtifacts_3_0= ruleDesignArtifact
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsDesignArtifactParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedArtifacts_3_0=ruleDesignArtifact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedArtifacts",
            	    							lv_ownedArtifacts_3_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.DesignArtifact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalInfluenceDSL.g:130:4: ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) )
            	    {
            	    // InternalInfluenceDSL.g:130:4: ( (lv_ownedRequirements_4_0= ruleRequirementSatisfaction ) )
            	    // InternalInfluenceDSL.g:131:5: (lv_ownedRequirements_4_0= ruleRequirementSatisfaction )
            	    {
            	    // InternalInfluenceDSL.g:131:5: (lv_ownedRequirements_4_0= ruleRequirementSatisfaction )
            	    // InternalInfluenceDSL.g:132:6: lv_ownedRequirements_4_0= ruleRequirementSatisfaction
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsRequirementSatisfactionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedRequirements_4_0=ruleRequirementSatisfaction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRequirements",
            	    							lv_ownedRequirements_4_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.RequirementSatisfaction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalInfluenceDSL.g:150:4: ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) )
            	    {
            	    // InternalInfluenceDSL.g:150:4: ( (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena ) )
            	    // InternalInfluenceDSL.g:151:5: (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena )
            	    {
            	    // InternalInfluenceDSL.g:151:5: (lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena )
            	    // InternalInfluenceDSL.g:152:6: lv_ownedPhysicalPhenomena_5_0= rulePhysicalPhenomena
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedPhysicalPhenomenaPhysicalPhenomenaParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedPhysicalPhenomena_5_0=rulePhysicalPhenomena();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedPhysicalPhenomena",
            	    							lv_ownedPhysicalPhenomena_5_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.PhysicalPhenomena");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalInfluenceDSL.g:170:4: ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) )
            	    {
            	    // InternalInfluenceDSL.g:170:4: ( (lv_ownedInfluences_6_0= ruleAbstractInfluence ) )
            	    // InternalInfluenceDSL.g:171:5: (lv_ownedInfluences_6_0= ruleAbstractInfluence )
            	    {
            	    // InternalInfluenceDSL.g:171:5: (lv_ownedInfluences_6_0= ruleAbstractInfluence )
            	    // InternalInfluenceDSL.g:172:6: lv_ownedInfluences_6_0= ruleAbstractInfluence
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAbstractInfluenceParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedInfluences_6_0=ruleAbstractInfluence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedInfluences",
            	    							lv_ownedInfluences_6_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.AbstractInfluence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleInfluenceModel"


    // $ANTLR start "entryRuleAbstractInfluence"
    // InternalInfluenceDSL.g:194:1: entryRuleAbstractInfluence returns [EObject current=null] : iv_ruleAbstractInfluence= ruleAbstractInfluence EOF ;
    public final EObject entryRuleAbstractInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInfluence = null;


        try {
            // InternalInfluenceDSL.g:194:58: (iv_ruleAbstractInfluence= ruleAbstractInfluence EOF )
            // InternalInfluenceDSL.g:195:2: iv_ruleAbstractInfluence= ruleAbstractInfluence EOF
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
    // InternalInfluenceDSL.g:201:1: ruleAbstractInfluence returns [EObject current=null] : (this_Influence_0= ruleInfluence | this_CompositeInfluence_1= ruleCompositeInfluence ) ;
    public final EObject ruleAbstractInfluence() throws RecognitionException {
        EObject current = null;

        EObject this_Influence_0 = null;

        EObject this_CompositeInfluence_1 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:207:2: ( (this_Influence_0= ruleInfluence | this_CompositeInfluence_1= ruleCompositeInfluence ) )
            // InternalInfluenceDSL.g:208:2: (this_Influence_0= ruleInfluence | this_CompositeInfluence_1= ruleCompositeInfluence )
            {
            // InternalInfluenceDSL.g:208:2: (this_Influence_0= ruleInfluence | this_CompositeInfluence_1= ruleCompositeInfluence )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalInfluenceDSL.g:209:3: this_Influence_0= ruleInfluence
                    {

                    			newCompositeNode(grammarAccess.getAbstractInfluenceAccess().getInfluenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Influence_0=ruleInfluence();

                    state._fsp--;


                    			current = this_Influence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:218:3: this_CompositeInfluence_1= ruleCompositeInfluence
                    {

                    			newCompositeNode(grammarAccess.getAbstractInfluenceAccess().getCompositeInfluenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeInfluence_1=ruleCompositeInfluence();

                    state._fsp--;


                    			current = this_CompositeInfluence_1;
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


    // $ANTLR start "entryRuleCompositeInfluence"
    // InternalInfluenceDSL.g:230:1: entryRuleCompositeInfluence returns [EObject current=null] : iv_ruleCompositeInfluence= ruleCompositeInfluence EOF ;
    public final EObject entryRuleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeInfluence = null;


        try {
            // InternalInfluenceDSL.g:230:59: (iv_ruleCompositeInfluence= ruleCompositeInfluence EOF )
            // InternalInfluenceDSL.g:231:2: iv_ruleCompositeInfluence= ruleCompositeInfluence EOF
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
    // InternalInfluenceDSL.g:237:1: ruleCompositeInfluence returns [EObject current=null] : (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* ( (lv_ownedFunction_10_0= ruleCompositeFunction ) ) otherlv_11= 'affects' ( (lv_affects_12_0= ruleSystemResponse ) ) (otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) ) )* ) ;
    public final EObject ruleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_ownedFunction_10_0 = null;

        EObject lv_affects_12_0 = null;

        EObject lv_affects_14_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:243:2: ( (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* ( (lv_ownedFunction_10_0= ruleCompositeFunction ) ) otherlv_11= 'affects' ( (lv_affects_12_0= ruleSystemResponse ) ) (otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) ) )* ) )
            // InternalInfluenceDSL.g:244:2: (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* ( (lv_ownedFunction_10_0= ruleCompositeFunction ) ) otherlv_11= 'affects' ( (lv_affects_12_0= ruleSystemResponse ) ) (otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) ) )* )
            {
            // InternalInfluenceDSL.g:244:2: (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* ( (lv_ownedFunction_10_0= ruleCompositeFunction ) ) otherlv_11= 'affects' ( (lv_affects_12_0= ruleSystemResponse ) ) (otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) ) )* )
            // InternalInfluenceDSL.g:245:3: otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* ( (lv_ownedFunction_10_0= ruleCompositeFunction ) ) otherlv_11= 'affects' ( (lv_affects_12_0= ruleSystemResponse ) ) (otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeInfluenceAccess().getCompositeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeInfluenceAccess().getInfluenceKeyword_1());
            		
            // InternalInfluenceDSL.g:253:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:254:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:254:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:255:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getCompositeInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_3());
            		
            // InternalInfluenceDSL.g:276:3: ( (lv_description_4_0= ruleEString ) )
            // InternalInfluenceDSL.g:277:4: (lv_description_4_0= ruleEString )
            {
            // InternalInfluenceDSL.g:277:4: (lv_description_4_0= ruleEString )
            // InternalInfluenceDSL.g:278:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalInfluenceDSL.g:295:3: (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalInfluenceDSL.g:296:4: otherlv_5= ',' ( (lv_description_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalInfluenceDSL.g:300:4: ( (lv_description_6_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:301:5: (lv_description_6_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:301:5: (lv_description_6_0= ruleEString )
            	    // InternalInfluenceDSL.g:302:6: lv_description_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop3;
                }
            } while (true);

            // InternalInfluenceDSL.g:320:3: (otherlv_7= '**#' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInfluenceDSL.g:321:4: otherlv_7= '**#'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompositeInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_6());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositeInfluenceAccess().getEncapsulateKeyword_7());
            		
            // InternalInfluenceDSL.g:330:3: ( ( ruleEString ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInfluenceDSL.g:331:4: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:331:4: ( ruleEString )
            	    // InternalInfluenceDSL.g:332:5: ruleEString
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCompositeInfluenceRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalInfluenceDSL.g:346:3: ( (lv_ownedFunction_10_0= ruleCompositeFunction ) )
            // InternalInfluenceDSL.g:347:4: (lv_ownedFunction_10_0= ruleCompositeFunction )
            {
            // InternalInfluenceDSL.g:347:4: (lv_ownedFunction_10_0= ruleCompositeFunction )
            // InternalInfluenceDSL.g:348:5: lv_ownedFunction_10_0= ruleCompositeFunction
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getOwnedFunctionCompositeFunctionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_ownedFunction_10_0=ruleCompositeFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					set(
            						current,
            						"ownedFunction",
            						lv_ownedFunction_10_0,
            						"fr.inria.kairos.influence.InfluenceDSL.CompositeFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeInfluenceAccess().getAffectsKeyword_10());
            		
            // InternalInfluenceDSL.g:369:3: ( (lv_affects_12_0= ruleSystemResponse ) )
            // InternalInfluenceDSL.g:370:4: (lv_affects_12_0= ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:370:4: (lv_affects_12_0= ruleSystemResponse )
            // InternalInfluenceDSL.g:371:5: lv_affects_12_0= ruleSystemResponse
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_affects_12_0=ruleSystemResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					add(
            						current,
            						"affects",
            						lv_affects_12_0,
            						"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:388:3: (otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInfluenceDSL.g:389:4: otherlv_13= 'and' ( (lv_affects_14_0= ruleSystemResponse ) )
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_13, grammarAccess.getCompositeInfluenceAccess().getAndKeyword_12_0());
            	    			
            	    // InternalInfluenceDSL.g:393:4: ( (lv_affects_14_0= ruleSystemResponse ) )
            	    // InternalInfluenceDSL.g:394:5: (lv_affects_14_0= ruleSystemResponse )
            	    {
            	    // InternalInfluenceDSL.g:394:5: (lv_affects_14_0= ruleSystemResponse )
            	    // InternalInfluenceDSL.g:395:6: lv_affects_14_0= ruleSystemResponse
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_affects_14_0=ruleSystemResponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"affects",
            	    							lv_affects_14_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleCompositeInfluence"


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:417:1: entryRuleInfluence returns [EObject current=null] : iv_ruleInfluence= ruleInfluence EOF ;
    public final EObject entryRuleInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluence = null;


        try {
            // InternalInfluenceDSL.g:417:50: (iv_ruleInfluence= ruleInfluence EOF )
            // InternalInfluenceDSL.g:418:2: iv_ruleInfluence= ruleInfluence EOF
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
    // InternalInfluenceDSL.g:424:1: ruleInfluence returns [EObject current=null] : (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* ( (lv_ownedFunction_24_0= ruleFunction ) ) otherlv_25= 'affects' ( (lv_affects_26_0= ruleSystemResponse ) ) (otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) ) )* ) ;
    public final EObject ruleInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_ownedFunction_24_0 = null;

        EObject lv_affects_26_0 = null;

        EObject lv_affects_28_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:430:2: ( (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* ( (lv_ownedFunction_24_0= ruleFunction ) ) otherlv_25= 'affects' ( (lv_affects_26_0= ruleSystemResponse ) ) (otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) ) )* ) )
            // InternalInfluenceDSL.g:431:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* ( (lv_ownedFunction_24_0= ruleFunction ) ) otherlv_25= 'affects' ( (lv_affects_26_0= ruleSystemResponse ) ) (otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) ) )* )
            {
            // InternalInfluenceDSL.g:431:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* ( (lv_ownedFunction_24_0= ruleFunction ) ) otherlv_25= 'affects' ( (lv_affects_26_0= ruleSystemResponse ) ) (otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) ) )* )
            // InternalInfluenceDSL.g:432:3: otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* ( (lv_ownedFunction_24_0= ruleFunction ) ) otherlv_25= 'affects' ( (lv_affects_26_0= ruleSystemResponse ) ) (otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluenceAccess().getInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:436:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:437:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:437:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:438:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_2());
            		
            // InternalInfluenceDSL.g:459:3: ( (lv_description_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:460:4: (lv_description_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:460:4: (lv_description_3_0= ruleEString )
            // InternalInfluenceDSL.g:461:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalInfluenceDSL.g:478:3: (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInfluenceDSL.g:479:4: otherlv_4= ',' ( (lv_description_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInfluenceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInfluenceDSL.g:483:4: ( (lv_description_5_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:484:5: (lv_description_5_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:484:5: (lv_description_5_0= ruleEString )
            	    // InternalInfluenceDSL.g:485:6: lv_description_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop7;
                }
            } while (true);

            // InternalInfluenceDSL.g:503:3: (otherlv_6= '**#' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:504:4: otherlv_6= '**#'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getInfluenceAccess().getOriginatorsKeyword_6());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getInfluenceAccess().getColonKeyword_7());
            		
            // InternalInfluenceDSL.g:517:3: ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalInfluenceDSL.g:518:4: (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalInfluenceDSL.g:518:4: (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) )
                    // InternalInfluenceDSL.g:519:5: otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_17); 

                    					newLeafNode(otherlv_9, grammarAccess.getInfluenceAccess().getArtifactKeyword_8_0_0());
                    				
                    // InternalInfluenceDSL.g:523:5: ( (otherlv_10= RULE_ID ) )
                    // InternalInfluenceDSL.g:524:6: (otherlv_10= RULE_ID )
                    {
                    // InternalInfluenceDSL.g:524:6: (otherlv_10= RULE_ID )
                    // InternalInfluenceDSL.g:525:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInfluenceRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_18); 

                    							newLeafNode(otherlv_10, grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_8_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:538:4: (otherlv_11= 'phenomena' ( ( ruleEString ) ) )
                    {
                    // InternalInfluenceDSL.g:538:4: (otherlv_11= 'phenomena' ( ( ruleEString ) ) )
                    // InternalInfluenceDSL.g:539:5: otherlv_11= 'phenomena' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getInfluenceAccess().getPhenomenaKeyword_8_1_0());
                    				
                    // InternalInfluenceDSL.g:543:5: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:544:6: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:544:6: ( ruleEString )
                    // InternalInfluenceDSL.g:545:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInfluenceRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_8_1_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:561:4: (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) )
                    {
                    // InternalInfluenceDSL.g:561:4: (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) )
                    // InternalInfluenceDSL.g:562:5: otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_19); 

                    					newLeafNode(otherlv_13, grammarAccess.getInfluenceAccess().getSystemKeyword_8_2_0());
                    				
                    otherlv_14=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_14, grammarAccess.getInfluenceAccess().getResponseKeyword_8_2_1());
                    				
                    // InternalInfluenceDSL.g:570:5: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:571:6: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:571:6: ( ruleEString )
                    // InternalInfluenceDSL.g:572:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInfluenceRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_8_2_2_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:588:3: (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:589:4: otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_16, grammarAccess.getInfluenceAccess().getAndKeyword_9_0());
            	    			
            	    // InternalInfluenceDSL.g:593:4: ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) )
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // InternalInfluenceDSL.g:594:5: (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) )
            	            {
            	            // InternalInfluenceDSL.g:594:5: (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) )
            	            // InternalInfluenceDSL.g:595:6: otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) )
            	            {
            	            otherlv_17=(Token)match(input,22,FOLLOW_17); 

            	            						newLeafNode(otherlv_17, grammarAccess.getInfluenceAccess().getArtifactKeyword_9_1_0_0());
            	            					
            	            // InternalInfluenceDSL.g:599:6: ( (otherlv_18= RULE_ID ) )
            	            // InternalInfluenceDSL.g:600:7: (otherlv_18= RULE_ID )
            	            {
            	            // InternalInfluenceDSL.g:600:7: (otherlv_18= RULE_ID )
            	            // InternalInfluenceDSL.g:601:8: otherlv_18= RULE_ID
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInfluenceRule());
            	            								}
            	            							
            	            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_18); 

            	            								newLeafNode(otherlv_18, grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_9_1_0_1_0());
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalInfluenceDSL.g:614:5: (otherlv_19= 'phenomena' ( ( ruleEString ) ) )
            	            {
            	            // InternalInfluenceDSL.g:614:5: (otherlv_19= 'phenomena' ( ( ruleEString ) ) )
            	            // InternalInfluenceDSL.g:615:6: otherlv_19= 'phenomena' ( ( ruleEString ) )
            	            {
            	            otherlv_19=(Token)match(input,23,FOLLOW_3); 

            	            						newLeafNode(otherlv_19, grammarAccess.getInfluenceAccess().getPhenomenaKeyword_9_1_1_0());
            	            					
            	            // InternalInfluenceDSL.g:619:6: ( ( ruleEString ) )
            	            // InternalInfluenceDSL.g:620:7: ( ruleEString )
            	            {
            	            // InternalInfluenceDSL.g:620:7: ( ruleEString )
            	            // InternalInfluenceDSL.g:621:8: ruleEString
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInfluenceRule());
            	            								}
            	            							

            	            								newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_9_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_18);
            	            ruleEString();

            	            state._fsp--;


            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalInfluenceDSL.g:637:5: (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) )
            	            {
            	            // InternalInfluenceDSL.g:637:5: (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) )
            	            // InternalInfluenceDSL.g:638:6: otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) )
            	            {
            	            otherlv_21=(Token)match(input,24,FOLLOW_19); 

            	            						newLeafNode(otherlv_21, grammarAccess.getInfluenceAccess().getSystemKeyword_9_1_2_0());
            	            					
            	            otherlv_22=(Token)match(input,25,FOLLOW_3); 

            	            						newLeafNode(otherlv_22, grammarAccess.getInfluenceAccess().getResponseKeyword_9_1_2_1());
            	            					
            	            // InternalInfluenceDSL.g:646:6: ( ( ruleEString ) )
            	            // InternalInfluenceDSL.g:647:7: ( ruleEString )
            	            {
            	            // InternalInfluenceDSL.g:647:7: ( ruleEString )
            	            // InternalInfluenceDSL.g:648:8: ruleEString
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInfluenceRule());
            	            								}
            	            							

            	            								newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_9_1_2_2_0());
            	            							
            	            pushFollow(FOLLOW_18);
            	            ruleEString();

            	            state._fsp--;


            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalInfluenceDSL.g:665:3: ( (lv_ownedFunction_24_0= ruleFunction ) )
            // InternalInfluenceDSL.g:666:4: (lv_ownedFunction_24_0= ruleFunction )
            {
            // InternalInfluenceDSL.g:666:4: (lv_ownedFunction_24_0= ruleFunction )
            // InternalInfluenceDSL.g:667:5: lv_ownedFunction_24_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getOwnedFunctionFunctionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_ownedFunction_24_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					set(
            						current,
            						"ownedFunction",
            						lv_ownedFunction_24_0,
            						"fr.inria.kairos.influence.InfluenceDSL.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_25, grammarAccess.getInfluenceAccess().getAffectsKeyword_11());
            		
            // InternalInfluenceDSL.g:688:3: ( (lv_affects_26_0= ruleSystemResponse ) )
            // InternalInfluenceDSL.g:689:4: (lv_affects_26_0= ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:689:4: (lv_affects_26_0= ruleSystemResponse )
            // InternalInfluenceDSL.g:690:5: lv_affects_26_0= ruleSystemResponse
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_affects_26_0=ruleSystemResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"affects",
            						lv_affects_26_0,
            						"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:707:3: (otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInfluenceDSL.g:708:4: otherlv_27= 'and' ( (lv_affects_28_0= ruleSystemResponse ) )
            	    {
            	    otherlv_27=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_27, grammarAccess.getInfluenceAccess().getAndKeyword_13_0());
            	    			
            	    // InternalInfluenceDSL.g:712:4: ( (lv_affects_28_0= ruleSystemResponse ) )
            	    // InternalInfluenceDSL.g:713:5: (lv_affects_28_0= ruleSystemResponse )
            	    {
            	    // InternalInfluenceDSL.g:713:5: (lv_affects_28_0= ruleSystemResponse )
            	    // InternalInfluenceDSL.g:714:6: lv_affects_28_0= ruleSystemResponse
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_affects_28_0=ruleSystemResponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"affects",
            	    							lv_affects_28_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleInfluence"


    // $ANTLR start "entryRuleFunction"
    // InternalInfluenceDSL.g:736:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalInfluenceDSL.g:736:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalInfluenceDSL.g:737:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalInfluenceDSL.g:743:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:749:2: ( (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // InternalInfluenceDSL.g:750:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // InternalInfluenceDSL.g:750:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= ')' )
            // InternalInfluenceDSL.g:751:3: otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_definition_3_0= ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunKeyword_0());
            		
            // InternalInfluenceDSL.g:755:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfluenceDSL.g:756:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfluenceDSL.g:756:4: (lv_name_1_0= RULE_ID )
            // InternalInfluenceDSL.g:757:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalInfluenceDSL.g:777:3: ( (lv_definition_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:778:4: (lv_definition_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:778:4: (lv_definition_3_0= ruleEString )
            // InternalInfluenceDSL.g:779:5: lv_definition_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_definition_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_3_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleCompositeFunction"
    // InternalInfluenceDSL.g:804:1: entryRuleCompositeFunction returns [EObject current=null] : iv_ruleCompositeFunction= ruleCompositeFunction EOF ;
    public final EObject entryRuleCompositeFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeFunction = null;


        try {
            // InternalInfluenceDSL.g:804:58: (iv_ruleCompositeFunction= ruleCompositeFunction EOF )
            // InternalInfluenceDSL.g:805:2: iv_ruleCompositeFunction= ruleCompositeFunction EOF
            {
             newCompositeNode(grammarAccess.getCompositeFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeFunction=ruleCompositeFunction();

            state._fsp--;

             current =iv_ruleCompositeFunction; 
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
    // $ANTLR end "entryRuleCompositeFunction"


    // $ANTLR start "ruleCompositeFunction"
    // InternalInfluenceDSL.g:811:1: ruleCompositeFunction returns [EObject current=null] : (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleCompositeFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:817:2: ( (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' ) )
            // InternalInfluenceDSL.g:818:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )
            {
            // InternalInfluenceDSL.g:818:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )
            // InternalInfluenceDSL.g:819:3: otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeFunctionAccess().getFunKeyword_0());
            		
            // InternalInfluenceDSL.g:823:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfluenceDSL.g:824:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfluenceDSL.g:824:4: (lv_name_1_0= RULE_ID )
            // InternalInfluenceDSL.g:825:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalInfluenceDSL.g:845:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:846:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:846:4: ( ruleEString )
            // InternalInfluenceDSL.g:847:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeFunctionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:861:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:862:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCompositeFunctionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInfluenceDSL.g:866:4: ( ( ruleEString ) )
            	    // InternalInfluenceDSL.g:867:5: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:867:5: ( ruleEString )
            	    // InternalInfluenceDSL.g:868:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositeFunctionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeFunctionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleCompositeFunction"


    // $ANTLR start "entryRulePhysicalPhenomena"
    // InternalInfluenceDSL.g:891:1: entryRulePhysicalPhenomena returns [EObject current=null] : iv_rulePhysicalPhenomena= rulePhysicalPhenomena EOF ;
    public final EObject entryRulePhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalPhenomena = null;


        try {
            // InternalInfluenceDSL.g:891:58: (iv_rulePhysicalPhenomena= rulePhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:892:2: iv_rulePhysicalPhenomena= rulePhysicalPhenomena EOF
            {
             newCompositeNode(grammarAccess.getPhysicalPhenomenaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicalPhenomena=rulePhysicalPhenomena();

            state._fsp--;

             current =iv_rulePhysicalPhenomena; 
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
    // $ANTLR end "entryRulePhysicalPhenomena"


    // $ANTLR start "rulePhysicalPhenomena"
    // InternalInfluenceDSL.g:898:1: rulePhysicalPhenomena returns [EObject current=null] : (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? (otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) ) )? ) ;
    public final EObject rulePhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_metadata_8_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:904:2: ( (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? (otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:905:2: (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? (otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:905:2: (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? (otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:906:3: otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? (otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicalPhenomenaAccess().getPhenomenonKeyword_0());
            		
            // InternalInfluenceDSL.g:910:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:911:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:911:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:912:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicalPhenomenaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:929:3: (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalInfluenceDSL.g:930:4: otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhysicalPhenomenaAccess().getColonKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:934:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:935:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:935:5: (lv_description_3_0= ruleEString )
                    // InternalInfluenceDSL.g:936:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicalPhenomenaRule());
                    						}
                    						add(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:953:4: (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:954:5: otherlv_4= ',' ( (lv_description_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPhysicalPhenomenaAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalInfluenceDSL.g:958:5: ( (lv_description_5_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:959:6: (lv_description_5_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:959:6: (lv_description_5_0= ruleEString )
                    	    // InternalInfluenceDSL.g:960:7: lv_description_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_description_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPhysicalPhenomenaRule());
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalInfluenceDSL.g:979:3: (otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalInfluenceDSL.g:980:4: otherlv_6= 'metadata' otherlv_7= ':' ( (lv_metadata_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicalPhenomenaAccess().getMetadataKeyword_3_0());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPhysicalPhenomenaAccess().getColonKeyword_3_1());
                    			
                    // InternalInfluenceDSL.g:988:4: ( (lv_metadata_8_0= ruleEString ) )
                    // InternalInfluenceDSL.g:989:5: (lv_metadata_8_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:989:5: (lv_metadata_8_0= ruleEString )
                    // InternalInfluenceDSL.g:990:6: lv_metadata_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getMetadataEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_metadata_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicalPhenomenaRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_8_0,
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
    // $ANTLR end "rulePhysicalPhenomena"


    // $ANTLR start "entryRuleRequirementSatisfaction"
    // InternalInfluenceDSL.g:1012:1: entryRuleRequirementSatisfaction returns [EObject current=null] : iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF ;
    public final EObject entryRuleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementSatisfaction = null;


        try {
            // InternalInfluenceDSL.g:1012:64: (iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF )
            // InternalInfluenceDSL.g:1013:2: iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF
            {
             newCompositeNode(grammarAccess.getRequirementSatisfactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementSatisfaction=ruleRequirementSatisfaction();

            state._fsp--;

             current =iv_ruleRequirementSatisfaction; 
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
    // $ANTLR end "entryRuleRequirementSatisfaction"


    // $ANTLR start "ruleRequirementSatisfaction"
    // InternalInfluenceDSL.g:1019:1: ruleRequirementSatisfaction returns [EObject current=null] : (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* (otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) ) )? ) ;
    public final EObject ruleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_5_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_7_0 = null;

        AntlrDatatypeRuleToken lv_metadata_10_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1025:2: ( (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* (otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:1026:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* (otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:1026:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* (otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:1027:3: otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* (otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0());
            		
            // InternalInfluenceDSL.g:1031:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:1032:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1032:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:1033:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_4());
            		
            // InternalInfluenceDSL.g:1062:3: ( (lv_satisfaction_5_0= ruleEString ) )
            // InternalInfluenceDSL.g:1063:4: (lv_satisfaction_5_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1063:4: (lv_satisfaction_5_0= ruleEString )
            // InternalInfluenceDSL.g:1064:5: lv_satisfaction_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_satisfaction_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					add(
            						current,
            						"satisfaction",
            						lv_satisfaction_5_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1081:3: (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1082:4: otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:1086:4: ( (lv_satisfaction_7_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:1087:5: (lv_satisfaction_7_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:1087:5: (lv_satisfaction_7_0= ruleEString )
            	    // InternalInfluenceDSL.g:1088:6: lv_satisfaction_7_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_satisfaction_7_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"satisfaction",
            	    							lv_satisfaction_7_0,
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

            // InternalInfluenceDSL.g:1106:3: (otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalInfluenceDSL.g:1107:4: otherlv_8= 'metadata' otherlv_9= ':' ( (lv_metadata_10_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementSatisfactionAccess().getMetadataKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_7_1());
                    			
                    // InternalInfluenceDSL.g:1115:4: ( (lv_metadata_10_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1116:5: (lv_metadata_10_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1116:5: (lv_metadata_10_0= ruleEString )
                    // InternalInfluenceDSL.g:1117:6: lv_metadata_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getMetadataEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_metadata_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_10_0,
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
    // $ANTLR end "ruleRequirementSatisfaction"


    // $ANTLR start "entryRuleDesignArtifact"
    // InternalInfluenceDSL.g:1139:1: entryRuleDesignArtifact returns [EObject current=null] : iv_ruleDesignArtifact= ruleDesignArtifact EOF ;
    public final EObject entryRuleDesignArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignArtifact = null;


        try {
            // InternalInfluenceDSL.g:1139:55: (iv_ruleDesignArtifact= ruleDesignArtifact EOF )
            // InternalInfluenceDSL.g:1140:2: iv_ruleDesignArtifact= ruleDesignArtifact EOF
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
    // InternalInfluenceDSL.g:1146:1: ruleDesignArtifact returns [EObject current=null] : ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleDesignArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_metadata_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1152:2: ( ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:1153:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:1153:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:1154:3: () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) (otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) ) )?
            {
            // InternalInfluenceDSL.g:1154:3: ()
            // InternalInfluenceDSL.g:1155:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1());
            		
            // InternalInfluenceDSL.g:1165:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:1166:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1166:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:1167:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalInfluenceDSL.g:1188:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:1189:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:1189:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:1190:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignArtifactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1204:3: (otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalInfluenceDSL.g:1205:4: otherlv_5= 'metadata' otherlv_6= ':' ( (lv_metadata_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getDesignArtifactAccess().getMetadataKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDesignArtifactAccess().getColonKeyword_5_1());
                    			
                    // InternalInfluenceDSL.g:1213:4: ( (lv_metadata_7_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1214:5: (lv_metadata_7_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1214:5: (lv_metadata_7_0= ruleEString )
                    // InternalInfluenceDSL.g:1215:6: lv_metadata_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDesignArtifactAccess().getMetadataEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_metadata_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDesignArtifactRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_7_0,
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
    // $ANTLR end "ruleDesignArtifact"


    // $ANTLR start "entryRuleEString"
    // InternalInfluenceDSL.g:1237:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInfluenceDSL.g:1237:47: (iv_ruleEString= ruleEString EOF )
            // InternalInfluenceDSL.g:1238:2: iv_ruleEString= ruleEString EOF
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
    // InternalInfluenceDSL.g:1244:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1250:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInfluenceDSL.g:1251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInfluenceDSL.g:1251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:1252:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:1260:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSystemResponse"
    // InternalInfluenceDSL.g:1271:1: entryRuleSystemResponse returns [EObject current=null] : iv_ruleSystemResponse= ruleSystemResponse EOF ;
    public final EObject entryRuleSystemResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemResponse = null;


        try {
            // InternalInfluenceDSL.g:1271:55: (iv_ruleSystemResponse= ruleSystemResponse EOF )
            // InternalInfluenceDSL.g:1272:2: iv_ruleSystemResponse= ruleSystemResponse EOF
            {
             newCompositeNode(grammarAccess.getSystemResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemResponse=ruleSystemResponse();

            state._fsp--;

             current =iv_ruleSystemResponse; 
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
    // $ANTLR end "entryRuleSystemResponse"


    // $ANTLR start "ruleSystemResponse"
    // InternalInfluenceDSL.g:1278:1: ruleSystemResponse returns [EObject current=null] : ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleSystemResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1284:2: ( ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? ) )
            // InternalInfluenceDSL.g:1285:2: ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? )
            {
            // InternalInfluenceDSL.g:1285:2: ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? )
            // InternalInfluenceDSL.g:1286:3: () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )?
            {
            // InternalInfluenceDSL.g:1286:3: ()
            // InternalInfluenceDSL.g:1287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemResponseAccess().getSystemResponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemResponseAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemResponseAccess().getResponseKeyword_2());
            		
            // InternalInfluenceDSL.g:1301:3: ( (lv_name_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:1302:4: (lv_name_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1302:4: (lv_name_3_0= ruleEString )
            // InternalInfluenceDSL.g:1303:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemResponseAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemResponseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:1320:3: (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalInfluenceDSL.g:1321:4: otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemResponseAccess().getUsedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSystemResponseAccess().getInKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:1329:4: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:1330:5: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:1330:5: ( ruleEString )
                    // InternalInfluenceDSL.g:1331:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemResponseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:1345:4: (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==19) ) {
                            int LA21_1 = input.LA(2);

                            if ( ((LA21_1>=RULE_ID && LA21_1<=RULE_STRING)) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1346:5: otherlv_7= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSystemResponseAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1350:5: ( ( ruleEString ) )
                    	    // InternalInfluenceDSL.g:1351:6: ( ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:1351:6: ( ruleEString )
                    	    // InternalInfluenceDSL.g:1352:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemResponseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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
    // $ANTLR end "ruleSystemResponse"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInfluenceDSL.g:1372:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalInfluenceDSL.g:1372:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:1373:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalInfluenceDSL.g:1379:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1385:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalInfluenceDSL.g:1386:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalInfluenceDSL.g:1386:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalInfluenceDSL.g:1387:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalInfluenceDSL.g:1394:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1395:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000004A0003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000118000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000002L});

}