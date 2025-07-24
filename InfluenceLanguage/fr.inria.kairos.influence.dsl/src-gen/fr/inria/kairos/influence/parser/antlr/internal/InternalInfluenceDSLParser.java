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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'Composite'", "'Influence'", "'#**'", "','", "'**#'", "'encapsulate'", "'affects'", "'and'", "'originators'", "':'", "'artifact'", "'phenomena'", "'system'", "'response'", "'Phenomenon'", "'Requirement'", "'satisfied'", "'when'", "'DesignArtifact'", "'->'", "'used'", "'in'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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
                case 30:
                    {
                    alt1=1;
                    }
                    break;
                case 27:
                    {
                    alt1=2;
                    }
                    break;
                case 26:
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
    // InternalInfluenceDSL.g:237:1: ruleCompositeInfluence returns [EObject current=null] : (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* otherlv_10= 'affects' ( (lv_affects_11_0= ruleSystemResponse ) ) (otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) ) )* ) ;
    public final EObject ruleCompositeInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_affects_11_0 = null;

        EObject lv_affects_13_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:243:2: ( (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* otherlv_10= 'affects' ( (lv_affects_11_0= ruleSystemResponse ) ) (otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) ) )* ) )
            // InternalInfluenceDSL.g:244:2: (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* otherlv_10= 'affects' ( (lv_affects_11_0= ruleSystemResponse ) ) (otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) ) )* )
            {
            // InternalInfluenceDSL.g:244:2: (otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* otherlv_10= 'affects' ( (lv_affects_11_0= ruleSystemResponse ) ) (otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) ) )* )
            // InternalInfluenceDSL.g:245:3: otherlv_0= 'Composite' otherlv_1= 'Influence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#**' ( (lv_description_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_description_6_0= ruleEString ) ) )* (otherlv_7= '**#' )? otherlv_8= 'encapsulate' ( ( ruleEString ) )* otherlv_10= 'affects' ( (lv_affects_11_0= ruleSystemResponse ) ) (otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) ) )*
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

            otherlv_10=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeInfluenceAccess().getAffectsKeyword_9());
            		
            // InternalInfluenceDSL.g:350:3: ( (lv_affects_11_0= ruleSystemResponse ) )
            // InternalInfluenceDSL.g:351:4: (lv_affects_11_0= ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:351:4: (lv_affects_11_0= ruleSystemResponse )
            // InternalInfluenceDSL.g:352:5: lv_affects_11_0= ruleSystemResponse
            {

            					newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_affects_11_0=ruleSystemResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            					}
            					add(
            						current,
            						"affects",
            						lv_affects_11_0,
            						"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:369:3: (otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInfluenceDSL.g:370:4: otherlv_12= 'and' ( (lv_affects_13_0= ruleSystemResponse ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeInfluenceAccess().getAndKeyword_11_0());
            	    			
            	    // InternalInfluenceDSL.g:374:4: ( (lv_affects_13_0= ruleSystemResponse ) )
            	    // InternalInfluenceDSL.g:375:5: (lv_affects_13_0= ruleSystemResponse )
            	    {
            	    // InternalInfluenceDSL.g:375:5: (lv_affects_13_0= ruleSystemResponse )
            	    // InternalInfluenceDSL.g:376:6: lv_affects_13_0= ruleSystemResponse
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_affects_13_0=ruleSystemResponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"affects",
            	    							lv_affects_13_0,
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
    // InternalInfluenceDSL.g:398:1: entryRuleInfluence returns [EObject current=null] : iv_ruleInfluence= ruleInfluence EOF ;
    public final EObject entryRuleInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluence = null;


        try {
            // InternalInfluenceDSL.g:398:50: (iv_ruleInfluence= ruleInfluence EOF )
            // InternalInfluenceDSL.g:399:2: iv_ruleInfluence= ruleInfluence EOF
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
    // InternalInfluenceDSL.g:405:1: ruleInfluence returns [EObject current=null] : (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* otherlv_24= 'affects' ( (lv_affects_25_0= ruleSystemResponse ) ) (otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) ) )* ) ;
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
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_affects_25_0 = null;

        EObject lv_affects_27_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:411:2: ( (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* otherlv_24= 'affects' ( (lv_affects_25_0= ruleSystemResponse ) ) (otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) ) )* ) )
            // InternalInfluenceDSL.g:412:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* otherlv_24= 'affects' ( (lv_affects_25_0= ruleSystemResponse ) ) (otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) ) )* )
            {
            // InternalInfluenceDSL.g:412:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* otherlv_24= 'affects' ( (lv_affects_25_0= ruleSystemResponse ) ) (otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) ) )* )
            // InternalInfluenceDSL.g:413:3: otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '#**' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* (otherlv_6= '**#' )? otherlv_7= 'originators' otherlv_8= ':' ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) ) (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )* otherlv_24= 'affects' ( (lv_affects_25_0= ruleSystemResponse ) ) (otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluenceAccess().getInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:417:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:418:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:418:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:419:5: lv_name_1_0= ruleEString
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
            		
            // InternalInfluenceDSL.g:440:3: ( (lv_description_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:441:4: (lv_description_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:441:4: (lv_description_3_0= ruleEString )
            // InternalInfluenceDSL.g:442:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalInfluenceDSL.g:459:3: (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInfluenceDSL.g:460:4: otherlv_4= ',' ( (lv_description_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInfluenceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInfluenceDSL.g:464:4: ( (lv_description_5_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:465:5: (lv_description_5_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:465:5: (lv_description_5_0= ruleEString )
            	    // InternalInfluenceDSL.g:466:6: lv_description_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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

            // InternalInfluenceDSL.g:484:3: (otherlv_6= '**#' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:485:4: otherlv_6= '**#'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getInfluenceAccess().getOriginatorsKeyword_6());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getInfluenceAccess().getColonKeyword_7());
            		
            // InternalInfluenceDSL.g:498:3: ( (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) ) )
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
                    // InternalInfluenceDSL.g:499:4: (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalInfluenceDSL.g:499:4: (otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) ) )
                    // InternalInfluenceDSL.g:500:5: otherlv_9= 'artifact' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_16); 

                    					newLeafNode(otherlv_9, grammarAccess.getInfluenceAccess().getArtifactKeyword_8_0_0());
                    				
                    // InternalInfluenceDSL.g:504:5: ( (otherlv_10= RULE_ID ) )
                    // InternalInfluenceDSL.g:505:6: (otherlv_10= RULE_ID )
                    {
                    // InternalInfluenceDSL.g:505:6: (otherlv_10= RULE_ID )
                    // InternalInfluenceDSL.g:506:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInfluenceRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_17); 

                    							newLeafNode(otherlv_10, grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_8_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:519:4: (otherlv_11= 'phenomena' ( ( ruleEString ) ) )
                    {
                    // InternalInfluenceDSL.g:519:4: (otherlv_11= 'phenomena' ( ( ruleEString ) ) )
                    // InternalInfluenceDSL.g:520:5: otherlv_11= 'phenomena' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getInfluenceAccess().getPhenomenaKeyword_8_1_0());
                    				
                    // InternalInfluenceDSL.g:524:5: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:525:6: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:525:6: ( ruleEString )
                    // InternalInfluenceDSL.g:526:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInfluenceRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_8_1_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:542:4: (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) )
                    {
                    // InternalInfluenceDSL.g:542:4: (otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) ) )
                    // InternalInfluenceDSL.g:543:5: otherlv_13= 'system' otherlv_14= 'response' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_18); 

                    					newLeafNode(otherlv_13, grammarAccess.getInfluenceAccess().getSystemKeyword_8_2_0());
                    				
                    otherlv_14=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_14, grammarAccess.getInfluenceAccess().getResponseKeyword_8_2_1());
                    				
                    // InternalInfluenceDSL.g:551:5: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:552:6: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:552:6: ( ruleEString )
                    // InternalInfluenceDSL.g:553:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInfluenceRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_8_2_2_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalInfluenceDSL.g:569:3: (otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:570:4: otherlv_16= 'and' ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_15); 

            	    				newLeafNode(otherlv_16, grammarAccess.getInfluenceAccess().getAndKeyword_9_0());
            	    			
            	    // InternalInfluenceDSL.g:574:4: ( (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) ) | (otherlv_19= 'phenomena' ( ( ruleEString ) ) ) | (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) ) )
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
            	            // InternalInfluenceDSL.g:575:5: (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) )
            	            {
            	            // InternalInfluenceDSL.g:575:5: (otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) ) )
            	            // InternalInfluenceDSL.g:576:6: otherlv_17= 'artifact' ( (otherlv_18= RULE_ID ) )
            	            {
            	            otherlv_17=(Token)match(input,22,FOLLOW_16); 

            	            						newLeafNode(otherlv_17, grammarAccess.getInfluenceAccess().getArtifactKeyword_9_1_0_0());
            	            					
            	            // InternalInfluenceDSL.g:580:6: ( (otherlv_18= RULE_ID ) )
            	            // InternalInfluenceDSL.g:581:7: (otherlv_18= RULE_ID )
            	            {
            	            // InternalInfluenceDSL.g:581:7: (otherlv_18= RULE_ID )
            	            // InternalInfluenceDSL.g:582:8: otherlv_18= RULE_ID
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInfluenceRule());
            	            								}
            	            							
            	            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_17); 

            	            								newLeafNode(otherlv_18, grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_9_1_0_1_0());
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalInfluenceDSL.g:595:5: (otherlv_19= 'phenomena' ( ( ruleEString ) ) )
            	            {
            	            // InternalInfluenceDSL.g:595:5: (otherlv_19= 'phenomena' ( ( ruleEString ) ) )
            	            // InternalInfluenceDSL.g:596:6: otherlv_19= 'phenomena' ( ( ruleEString ) )
            	            {
            	            otherlv_19=(Token)match(input,23,FOLLOW_3); 

            	            						newLeafNode(otherlv_19, grammarAccess.getInfluenceAccess().getPhenomenaKeyword_9_1_1_0());
            	            					
            	            // InternalInfluenceDSL.g:600:6: ( ( ruleEString ) )
            	            // InternalInfluenceDSL.g:601:7: ( ruleEString )
            	            {
            	            // InternalInfluenceDSL.g:601:7: ( ruleEString )
            	            // InternalInfluenceDSL.g:602:8: ruleEString
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInfluenceRule());
            	            								}
            	            							

            	            								newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_9_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_17);
            	            ruleEString();

            	            state._fsp--;


            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalInfluenceDSL.g:618:5: (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) )
            	            {
            	            // InternalInfluenceDSL.g:618:5: (otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) ) )
            	            // InternalInfluenceDSL.g:619:6: otherlv_21= 'system' otherlv_22= 'response' ( ( ruleEString ) )
            	            {
            	            otherlv_21=(Token)match(input,24,FOLLOW_18); 

            	            						newLeafNode(otherlv_21, grammarAccess.getInfluenceAccess().getSystemKeyword_9_1_2_0());
            	            					
            	            otherlv_22=(Token)match(input,25,FOLLOW_3); 

            	            						newLeafNode(otherlv_22, grammarAccess.getInfluenceAccess().getResponseKeyword_9_1_2_1());
            	            					
            	            // InternalInfluenceDSL.g:627:6: ( ( ruleEString ) )
            	            // InternalInfluenceDSL.g:628:7: ( ruleEString )
            	            {
            	            // InternalInfluenceDSL.g:628:7: ( ruleEString )
            	            // InternalInfluenceDSL.g:629:8: ruleEString
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInfluenceRule());
            	            								}
            	            							

            	            								newCompositeNode(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_9_1_2_2_0());
            	            							
            	            pushFollow(FOLLOW_17);
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

            otherlv_24=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_24, grammarAccess.getInfluenceAccess().getAffectsKeyword_10());
            		
            // InternalInfluenceDSL.g:650:3: ( (lv_affects_25_0= ruleSystemResponse ) )
            // InternalInfluenceDSL.g:651:4: (lv_affects_25_0= ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:651:4: (lv_affects_25_0= ruleSystemResponse )
            // InternalInfluenceDSL.g:652:5: lv_affects_25_0= ruleSystemResponse
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_affects_25_0=ruleSystemResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"affects",
            						lv_affects_25_0,
            						"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:669:3: (otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInfluenceDSL.g:670:4: otherlv_26= 'and' ( (lv_affects_27_0= ruleSystemResponse ) )
            	    {
            	    otherlv_26=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_26, grammarAccess.getInfluenceAccess().getAndKeyword_12_0());
            	    			
            	    // InternalInfluenceDSL.g:674:4: ( (lv_affects_27_0= ruleSystemResponse ) )
            	    // InternalInfluenceDSL.g:675:5: (lv_affects_27_0= ruleSystemResponse )
            	    {
            	    // InternalInfluenceDSL.g:675:5: (lv_affects_27_0= ruleSystemResponse )
            	    // InternalInfluenceDSL.g:676:6: lv_affects_27_0= ruleSystemResponse
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_affects_27_0=ruleSystemResponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"affects",
            	    							lv_affects_27_0,
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


    // $ANTLR start "entryRulePhysicalPhenomena"
    // InternalInfluenceDSL.g:698:1: entryRulePhysicalPhenomena returns [EObject current=null] : iv_rulePhysicalPhenomena= rulePhysicalPhenomena EOF ;
    public final EObject entryRulePhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalPhenomena = null;


        try {
            // InternalInfluenceDSL.g:698:58: (iv_rulePhysicalPhenomena= rulePhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:699:2: iv_rulePhysicalPhenomena= rulePhysicalPhenomena EOF
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
    // InternalInfluenceDSL.g:705:1: rulePhysicalPhenomena returns [EObject current=null] : (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? ) ;
    public final EObject rulePhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:711:2: ( (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? ) )
            // InternalInfluenceDSL.g:712:2: (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? )
            {
            // InternalInfluenceDSL.g:712:2: (otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )? )
            // InternalInfluenceDSL.g:713:3: otherlv_0= 'Phenomenon' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicalPhenomenaAccess().getPhenomenonKeyword_0());
            		
            // InternalInfluenceDSL.g:717:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:718:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:718:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:719:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalInfluenceDSL.g:736:3: (otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInfluenceDSL.g:737:4: otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhysicalPhenomenaAccess().getColonKeyword_2_0());
                    			
                    // InternalInfluenceDSL.g:741:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalInfluenceDSL.g:742:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:742:5: (lv_description_3_0= ruleEString )
                    // InternalInfluenceDSL.g:743:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalInfluenceDSL.g:760:4: (otherlv_4= ',' ( (lv_description_5_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:761:5: otherlv_4= ',' ( (lv_description_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPhysicalPhenomenaAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalInfluenceDSL.g:765:5: ( (lv_description_5_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:766:6: (lv_description_5_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:766:6: (lv_description_5_0= ruleEString )
                    	    // InternalInfluenceDSL.g:767:7: lv_description_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop13;
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
    // $ANTLR end "rulePhysicalPhenomena"


    // $ANTLR start "entryRuleRequirementSatisfaction"
    // InternalInfluenceDSL.g:790:1: entryRuleRequirementSatisfaction returns [EObject current=null] : iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF ;
    public final EObject entryRuleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementSatisfaction = null;


        try {
            // InternalInfluenceDSL.g:790:64: (iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF )
            // InternalInfluenceDSL.g:791:2: iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF
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
    // InternalInfluenceDSL.g:797:1: ruleRequirementSatisfaction returns [EObject current=null] : (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* ) ;
    public final EObject ruleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_5_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_7_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:803:2: ( (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* ) )
            // InternalInfluenceDSL.g:804:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* )
            {
            // InternalInfluenceDSL.g:804:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )* )
            // InternalInfluenceDSL.g:805:3: otherlv_0= 'Requirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'satisfied' otherlv_4= 'when' ( (lv_satisfaction_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0());
            		
            // InternalInfluenceDSL.g:809:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:810:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:810:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:811:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_4());
            		
            // InternalInfluenceDSL.g:840:3: ( (lv_satisfaction_5_0= ruleEString ) )
            // InternalInfluenceDSL.g:841:4: (lv_satisfaction_5_0= ruleEString )
            {
            // InternalInfluenceDSL.g:841:4: (lv_satisfaction_5_0= ruleEString )
            // InternalInfluenceDSL.g:842:5: lv_satisfaction_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalInfluenceDSL.g:859:3: (otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfluenceDSL.g:860:4: otherlv_6= ',' ( (lv_satisfaction_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:864:4: ( (lv_satisfaction_7_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:865:5: (lv_satisfaction_7_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:865:5: (lv_satisfaction_7_0= ruleEString )
            	    // InternalInfluenceDSL.g:866:6: lv_satisfaction_7_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop15;
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
    // $ANTLR end "ruleRequirementSatisfaction"


    // $ANTLR start "entryRuleDesignArtifact"
    // InternalInfluenceDSL.g:888:1: entryRuleDesignArtifact returns [EObject current=null] : iv_ruleDesignArtifact= ruleDesignArtifact EOF ;
    public final EObject entryRuleDesignArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignArtifact = null;


        try {
            // InternalInfluenceDSL.g:888:55: (iv_ruleDesignArtifact= ruleDesignArtifact EOF )
            // InternalInfluenceDSL.g:889:2: iv_ruleDesignArtifact= ruleDesignArtifact EOF
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
    // InternalInfluenceDSL.g:895:1: ruleDesignArtifact returns [EObject current=null] : ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDesignArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:901:2: ( ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) ) )
            // InternalInfluenceDSL.g:902:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) )
            {
            // InternalInfluenceDSL.g:902:2: ( () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:903:3: () otherlv_1= 'DesignArtifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleQualifiedName ) )
            {
            // InternalInfluenceDSL.g:903:3: ()
            // InternalInfluenceDSL.g:904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1());
            		
            // InternalInfluenceDSL.g:914:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:915:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:915:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:916:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalInfluenceDSL.g:937:3: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:938:4: ( ruleQualifiedName )
            {
            // InternalInfluenceDSL.g:938:4: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:939:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignArtifactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0());
            				
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
    // $ANTLR end "ruleDesignArtifact"


    // $ANTLR start "entryRuleEString"
    // InternalInfluenceDSL.g:957:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInfluenceDSL.g:957:47: (iv_ruleEString= ruleEString EOF )
            // InternalInfluenceDSL.g:958:2: iv_ruleEString= ruleEString EOF
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
    // InternalInfluenceDSL.g:964:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:970:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInfluenceDSL.g:971:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInfluenceDSL.g:971:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalInfluenceDSL.g:972:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:980:3: this_ID_1= RULE_ID
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
    // InternalInfluenceDSL.g:991:1: entryRuleSystemResponse returns [EObject current=null] : iv_ruleSystemResponse= ruleSystemResponse EOF ;
    public final EObject entryRuleSystemResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemResponse = null;


        try {
            // InternalInfluenceDSL.g:991:55: (iv_ruleSystemResponse= ruleSystemResponse EOF )
            // InternalInfluenceDSL.g:992:2: iv_ruleSystemResponse= ruleSystemResponse EOF
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
    // InternalInfluenceDSL.g:998:1: ruleSystemResponse returns [EObject current=null] : ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? ) ;
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
            // InternalInfluenceDSL.g:1004:2: ( ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? ) )
            // InternalInfluenceDSL.g:1005:2: ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? )
            {
            // InternalInfluenceDSL.g:1005:2: ( () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? )
            // InternalInfluenceDSL.g:1006:3: () otherlv_1= 'system' otherlv_2= 'response' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )?
            {
            // InternalInfluenceDSL.g:1006:3: ()
            // InternalInfluenceDSL.g:1007:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemResponseAccess().getSystemResponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemResponseAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemResponseAccess().getResponseKeyword_2());
            		
            // InternalInfluenceDSL.g:1021:3: ( (lv_name_3_0= ruleEString ) )
            // InternalInfluenceDSL.g:1022:4: (lv_name_3_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1022:4: (lv_name_3_0= ruleEString )
            // InternalInfluenceDSL.g:1023:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemResponseAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalInfluenceDSL.g:1040:3: (otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalInfluenceDSL.g:1041:4: otherlv_4= 'used' otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemResponseAccess().getUsedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSystemResponseAccess().getInKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:1049:4: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:1050:5: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:1050:5: ( ruleEString )
                    // InternalInfluenceDSL.g:1051:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemResponseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:1065:4: (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            int LA17_1 = input.LA(2);

                            if ( ((LA17_1>=RULE_ID && LA17_1<=RULE_STRING)) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1066:5: otherlv_7= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSystemResponseAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1070:5: ( ( ruleEString ) )
                    	    // InternalInfluenceDSL.g:1071:6: ( ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:1071:6: ( ruleEString )
                    	    // InternalInfluenceDSL.g:1072:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemResponseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
    // InternalInfluenceDSL.g:1092:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalInfluenceDSL.g:1092:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:1093:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalInfluenceDSL.g:1099:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1105:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalInfluenceDSL.g:1106:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalInfluenceDSL.g:1106:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalInfluenceDSL.g:1107:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalInfluenceDSL.g:1114:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1115:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000004C003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000118000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000002L});

}