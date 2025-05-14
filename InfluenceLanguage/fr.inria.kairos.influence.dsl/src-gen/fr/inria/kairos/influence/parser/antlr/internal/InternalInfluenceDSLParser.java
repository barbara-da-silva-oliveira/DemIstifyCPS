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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'CompositeCyberPhysicalPhenomenon'", "'definedBy'", "','", "'configuration'", "'AtomicPhenomenon'", "'#**'", "'**#'", "'Influence'", "'from'", "'and'", "'phenomena'", "'emerges'", "'that'", "'implies'", "'which'", "'may'", "'violate'", "'it'", "'can'", "'be'", "'compensated'", "'by'", "'modifying'", "'Requirement'", "'Satisfaction'", "':'", "'satisfied'", "'when'", "'Artifact'", "'->'", "'system'", "'response'", "'resulting'", "'in'", "'Emergent'", "'Behavior'", "'characterized'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    // InternalInfluenceDSL.g:71:1: ruleInfluenceModel returns [EObject current=null] : ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleArtifact ) ) | ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleInfluence ) ) )* ) ;
    public final EObject ruleInfluenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedArtifacts_3_0 = null;

        EObject lv_ownedRequirementSatisfaction_4_0 = null;

        EObject lv_ownedCyberPhysicalPhenomena_5_0 = null;

        EObject lv_ownedInfluences_6_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:77:2: ( ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleArtifact ) ) | ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleInfluence ) ) )* ) )
            // InternalInfluenceDSL.g:78:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleArtifact ) ) | ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleInfluence ) ) )* )
            {
            // InternalInfluenceDSL.g:78:2: ( () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleArtifact ) ) | ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleInfluence ) ) )* )
            // InternalInfluenceDSL.g:79:3: () otherlv_1= 'InfluenceModel' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_ownedArtifacts_3_0= ruleArtifact ) ) | ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleInfluence ) ) )*
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

            // InternalInfluenceDSL.g:109:3: ( ( (lv_ownedArtifacts_3_0= ruleArtifact ) ) | ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) ) | ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) ) | ( (lv_ownedInfluences_6_0= ruleInfluence ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt1=1;
                    }
                    break;
                case 35:
                    {
                    alt1=2;
                    }
                    break;
                case 12:
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 17:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalInfluenceDSL.g:110:4: ( (lv_ownedArtifacts_3_0= ruleArtifact ) )
            	    {
            	    // InternalInfluenceDSL.g:110:4: ( (lv_ownedArtifacts_3_0= ruleArtifact ) )
            	    // InternalInfluenceDSL.g:111:5: (lv_ownedArtifacts_3_0= ruleArtifact )
            	    {
            	    // InternalInfluenceDSL.g:111:5: (lv_ownedArtifacts_3_0= ruleArtifact )
            	    // InternalInfluenceDSL.g:112:6: lv_ownedArtifacts_3_0= ruleArtifact
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsArtifactParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedArtifacts_3_0=ruleArtifact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedArtifacts",
            	    							lv_ownedArtifacts_3_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.Artifact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalInfluenceDSL.g:130:4: ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) )
            	    {
            	    // InternalInfluenceDSL.g:130:4: ( (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction ) )
            	    // InternalInfluenceDSL.g:131:5: (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction )
            	    {
            	    // InternalInfluenceDSL.g:131:5: (lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction )
            	    // InternalInfluenceDSL.g:132:6: lv_ownedRequirementSatisfaction_4_0= ruleRequirementSatisfaction
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedRequirementSatisfactionRequirementSatisfactionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedRequirementSatisfaction_4_0=ruleRequirementSatisfaction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRequirementSatisfaction",
            	    							lv_ownedRequirementSatisfaction_4_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.RequirementSatisfaction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalInfluenceDSL.g:150:4: ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) )
            	    {
            	    // InternalInfluenceDSL.g:150:4: ( (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena ) )
            	    // InternalInfluenceDSL.g:151:5: (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena )
            	    {
            	    // InternalInfluenceDSL.g:151:5: (lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena )
            	    // InternalInfluenceDSL.g:152:6: lv_ownedCyberPhysicalPhenomena_5_0= ruleCyberPhysicalPhenomena
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedCyberPhysicalPhenomenaCyberPhysicalPhenomenaParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedCyberPhysicalPhenomena_5_0=ruleCyberPhysicalPhenomena();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedCyberPhysicalPhenomena",
            	    							lv_ownedCyberPhysicalPhenomena_5_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.CyberPhysicalPhenomena");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalInfluenceDSL.g:170:4: ( (lv_ownedInfluences_6_0= ruleInfluence ) )
            	    {
            	    // InternalInfluenceDSL.g:170:4: ( (lv_ownedInfluences_6_0= ruleInfluence ) )
            	    // InternalInfluenceDSL.g:171:5: (lv_ownedInfluences_6_0= ruleInfluence )
            	    {
            	    // InternalInfluenceDSL.g:171:5: (lv_ownedInfluences_6_0= ruleInfluence )
            	    // InternalInfluenceDSL.g:172:6: lv_ownedInfluences_6_0= ruleInfluence
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesInfluenceParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedInfluences_6_0=ruleInfluence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedInfluences",
            	    							lv_ownedInfluences_6_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.Influence");
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


    // $ANTLR start "entryRuleCyberPhysicalPhenomena"
    // InternalInfluenceDSL.g:194:1: entryRuleCyberPhysicalPhenomena returns [EObject current=null] : iv_ruleCyberPhysicalPhenomena= ruleCyberPhysicalPhenomena EOF ;
    public final EObject entryRuleCyberPhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyberPhysicalPhenomena = null;


        try {
            // InternalInfluenceDSL.g:194:63: (iv_ruleCyberPhysicalPhenomena= ruleCyberPhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:195:2: iv_ruleCyberPhysicalPhenomena= ruleCyberPhysicalPhenomena EOF
            {
             newCompositeNode(grammarAccess.getCyberPhysicalPhenomenaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCyberPhysicalPhenomena=ruleCyberPhysicalPhenomena();

            state._fsp--;

             current =iv_ruleCyberPhysicalPhenomena; 
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
    // $ANTLR end "entryRuleCyberPhysicalPhenomena"


    // $ANTLR start "ruleCyberPhysicalPhenomena"
    // InternalInfluenceDSL.g:201:1: ruleCyberPhysicalPhenomena returns [EObject current=null] : (this_MultiPhenomenon_0= ruleMultiPhenomenon | this_SimplePhenomenon_1= ruleSimplePhenomenon ) ;
    public final EObject ruleCyberPhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        EObject this_MultiPhenomenon_0 = null;

        EObject this_SimplePhenomenon_1 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:207:2: ( (this_MultiPhenomenon_0= ruleMultiPhenomenon | this_SimplePhenomenon_1= ruleSimplePhenomenon ) )
            // InternalInfluenceDSL.g:208:2: (this_MultiPhenomenon_0= ruleMultiPhenomenon | this_SimplePhenomenon_1= ruleSimplePhenomenon )
            {
            // InternalInfluenceDSL.g:208:2: (this_MultiPhenomenon_0= ruleMultiPhenomenon | this_SimplePhenomenon_1= ruleSimplePhenomenon )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalInfluenceDSL.g:209:3: this_MultiPhenomenon_0= ruleMultiPhenomenon
                    {

                    			newCompositeNode(grammarAccess.getCyberPhysicalPhenomenaAccess().getMultiPhenomenonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiPhenomenon_0=ruleMultiPhenomenon();

                    state._fsp--;


                    			current = this_MultiPhenomenon_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:218:3: this_SimplePhenomenon_1= ruleSimplePhenomenon
                    {

                    			newCompositeNode(grammarAccess.getCyberPhysicalPhenomenaAccess().getSimplePhenomenonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimplePhenomenon_1=ruleSimplePhenomenon();

                    state._fsp--;


                    			current = this_SimplePhenomenon_1;
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
    // $ANTLR end "ruleCyberPhysicalPhenomena"


    // $ANTLR start "entryRuleMultiPhenomenon"
    // InternalInfluenceDSL.g:230:1: entryRuleMultiPhenomenon returns [EObject current=null] : iv_ruleMultiPhenomenon= ruleMultiPhenomenon EOF ;
    public final EObject entryRuleMultiPhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiPhenomenon = null;


        try {
            // InternalInfluenceDSL.g:230:56: (iv_ruleMultiPhenomenon= ruleMultiPhenomenon EOF )
            // InternalInfluenceDSL.g:231:2: iv_ruleMultiPhenomenon= ruleMultiPhenomenon EOF
            {
             newCompositeNode(grammarAccess.getMultiPhenomenonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiPhenomenon=ruleMultiPhenomenon();

            state._fsp--;

             current =iv_ruleMultiPhenomenon; 
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
    // $ANTLR end "entryRuleMultiPhenomenon"


    // $ANTLR start "ruleMultiPhenomenon"
    // InternalInfluenceDSL.g:237:1: ruleMultiPhenomenon returns [EObject current=null] : ( () otherlv_1= 'CompositeCyberPhysicalPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )* )? ) ;
    public final EObject ruleMultiPhenomenon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_configuration_8_0 = null;

        AntlrDatatypeRuleToken lv_configuration_10_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:243:2: ( ( () otherlv_1= 'CompositeCyberPhysicalPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )* )? ) )
            // InternalInfluenceDSL.g:244:2: ( () otherlv_1= 'CompositeCyberPhysicalPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )* )? )
            {
            // InternalInfluenceDSL.g:244:2: ( () otherlv_1= 'CompositeCyberPhysicalPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )* )? )
            // InternalInfluenceDSL.g:245:3: () otherlv_1= 'CompositeCyberPhysicalPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )* )?
            {
            // InternalInfluenceDSL.g:245:3: ()
            // InternalInfluenceDSL.g:246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiPhenomenonAccess().getMultiPhenomenonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiPhenomenonAccess().getCompositeCyberPhysicalPhenomenonKeyword_1());
            		
            // InternalInfluenceDSL.g:256:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:257:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:257:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:258:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:275:3: (otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInfluenceDSL.g:276:4: otherlv_3= 'definedBy' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMultiPhenomenonAccess().getDefinedByKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:280:4: ( ( ruleEString ) )
                    // InternalInfluenceDSL.g:281:5: ( ruleEString )
                    {
                    // InternalInfluenceDSL.g:281:5: ( ruleEString )
                    // InternalInfluenceDSL.g:282:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiPhenomenonRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:296:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:297:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalInfluenceDSL.g:301:5: ( ( ruleEString ) )
                    	    // InternalInfluenceDSL.g:302:6: ( ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:302:6: ( ruleEString )
                    	    // InternalInfluenceDSL.g:303:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMultiPhenomenonRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalInfluenceDSL.g:319:3: (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInfluenceDSL.g:320:4: otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getMultiPhenomenonAccess().getConfigurationKeyword_4_0());
                    			
                    // InternalInfluenceDSL.g:324:4: ( (lv_configuration_8_0= ruleEString ) )
                    // InternalInfluenceDSL.g:325:5: (lv_configuration_8_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:325:5: (lv_configuration_8_0= ruleEString )
                    // InternalInfluenceDSL.g:326:6: lv_configuration_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_configuration_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    						}
                    						add(
                    							current,
                    							"configuration",
                    							lv_configuration_8_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:343:4: (otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:344:5: otherlv_9= ',' ( (lv_configuration_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalInfluenceDSL.g:348:5: ( (lv_configuration_10_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:349:6: (lv_configuration_10_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:349:6: (lv_configuration_10_0= ruleEString )
                    	    // InternalInfluenceDSL.g:350:7: lv_configuration_10_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_configuration_10_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"configuration",
                    	    								lv_configuration_10_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
    // $ANTLR end "ruleMultiPhenomenon"


    // $ANTLR start "entryRuleSimplePhenomenon"
    // InternalInfluenceDSL.g:373:1: entryRuleSimplePhenomenon returns [EObject current=null] : iv_ruleSimplePhenomenon= ruleSimplePhenomenon EOF ;
    public final EObject entryRuleSimplePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePhenomenon = null;


        try {
            // InternalInfluenceDSL.g:373:57: (iv_ruleSimplePhenomenon= ruleSimplePhenomenon EOF )
            // InternalInfluenceDSL.g:374:2: iv_ruleSimplePhenomenon= ruleSimplePhenomenon EOF
            {
             newCompositeNode(grammarAccess.getSimplePhenomenonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimplePhenomenon=ruleSimplePhenomenon();

            state._fsp--;

             current =iv_ruleSimplePhenomenon; 
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
    // $ANTLR end "entryRuleSimplePhenomenon"


    // $ANTLR start "ruleSimplePhenomenon"
    // InternalInfluenceDSL.g:380:1: ruleSimplePhenomenon returns [EObject current=null] : ( () otherlv_1= 'AtomicPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )* )? ) ;
    public final EObject ruleSimplePhenomenon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_configuration_4_0 = null;

        AntlrDatatypeRuleToken lv_configuration_6_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:386:2: ( ( () otherlv_1= 'AtomicPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )* )? ) )
            // InternalInfluenceDSL.g:387:2: ( () otherlv_1= 'AtomicPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )* )? )
            {
            // InternalInfluenceDSL.g:387:2: ( () otherlv_1= 'AtomicPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )* )? )
            // InternalInfluenceDSL.g:388:3: () otherlv_1= 'AtomicPhenomenon' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )* )?
            {
            // InternalInfluenceDSL.g:388:3: ()
            // InternalInfluenceDSL.g:389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimplePhenomenonAccess().getSimplePhenomenonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSimplePhenomenonAccess().getAtomicPhenomenonKeyword_1());
            		
            // InternalInfluenceDSL.g:399:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:400:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:400:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:401:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimplePhenomenonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimplePhenomenonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:418:3: (otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:419:4: otherlv_3= 'configuration' ( (lv_configuration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimplePhenomenonAccess().getConfigurationKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:423:4: ( (lv_configuration_4_0= ruleEString ) )
                    // InternalInfluenceDSL.g:424:5: (lv_configuration_4_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:424:5: (lv_configuration_4_0= ruleEString )
                    // InternalInfluenceDSL.g:425:6: lv_configuration_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_configuration_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimplePhenomenonRule());
                    						}
                    						add(
                    							current,
                    							"configuration",
                    							lv_configuration_4_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:442:4: (otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:443:5: otherlv_5= ',' ( (lv_configuration_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSimplePhenomenonAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalInfluenceDSL.g:447:5: ( (lv_configuration_6_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:448:6: (lv_configuration_6_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:448:6: (lv_configuration_6_0= ruleEString )
                    	    // InternalInfluenceDSL.g:449:7: lv_configuration_6_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_configuration_6_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSimplePhenomenonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"configuration",
                    	    								lv_configuration_6_0,
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
    // $ANTLR end "ruleSimplePhenomenon"


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:472:1: entryRuleInfluence returns [EObject current=null] : iv_ruleInfluence= ruleInfluence EOF ;
    public final EObject entryRuleInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluence = null;


        try {
            // InternalInfluenceDSL.g:472:50: (iv_ruleInfluence= ruleInfluence EOF )
            // InternalInfluenceDSL.g:473:2: iv_ruleInfluence= ruleInfluence EOF
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
    // InternalInfluenceDSL.g:479:1: ruleInfluence returns [EObject current=null] : (otherlv_0= '#**' ( (lv_description_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_description_3_0= ruleEString ) ) )* (otherlv_4= '**#' )? otherlv_5= 'Influence' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'from' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= 'and' otherlv_12= 'from' otherlv_13= 'phenomena' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= 'emerges' ( (lv_produces_18_0= ruleEmergentBehavior ) ) (otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) ) )* otherlv_21= 'that' otherlv_22= 'implies' ( (lv_affects_23_0= ruleSystemResponse ) ) (otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) ) )* otherlv_26= 'which' otherlv_27= 'may' otherlv_28= 'violate' ( ( ruleEString ) ) (otherlv_30= 'and' ( ( ruleEString ) ) )* otherlv_32= 'it' otherlv_33= 'can' otherlv_34= 'be' otherlv_35= 'compensated' otherlv_36= 'by' otherlv_37= 'modifying' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* ) ;
    public final EObject ruleInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_produces_18_0 = null;

        EObject lv_produces_20_0 = null;

        EObject lv_affects_23_0 = null;

        EObject lv_affects_25_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:485:2: ( (otherlv_0= '#**' ( (lv_description_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_description_3_0= ruleEString ) ) )* (otherlv_4= '**#' )? otherlv_5= 'Influence' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'from' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= 'and' otherlv_12= 'from' otherlv_13= 'phenomena' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= 'emerges' ( (lv_produces_18_0= ruleEmergentBehavior ) ) (otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) ) )* otherlv_21= 'that' otherlv_22= 'implies' ( (lv_affects_23_0= ruleSystemResponse ) ) (otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) ) )* otherlv_26= 'which' otherlv_27= 'may' otherlv_28= 'violate' ( ( ruleEString ) ) (otherlv_30= 'and' ( ( ruleEString ) ) )* otherlv_32= 'it' otherlv_33= 'can' otherlv_34= 'be' otherlv_35= 'compensated' otherlv_36= 'by' otherlv_37= 'modifying' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* ) )
            // InternalInfluenceDSL.g:486:2: (otherlv_0= '#**' ( (lv_description_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_description_3_0= ruleEString ) ) )* (otherlv_4= '**#' )? otherlv_5= 'Influence' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'from' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= 'and' otherlv_12= 'from' otherlv_13= 'phenomena' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= 'emerges' ( (lv_produces_18_0= ruleEmergentBehavior ) ) (otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) ) )* otherlv_21= 'that' otherlv_22= 'implies' ( (lv_affects_23_0= ruleSystemResponse ) ) (otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) ) )* otherlv_26= 'which' otherlv_27= 'may' otherlv_28= 'violate' ( ( ruleEString ) ) (otherlv_30= 'and' ( ( ruleEString ) ) )* otherlv_32= 'it' otherlv_33= 'can' otherlv_34= 'be' otherlv_35= 'compensated' otherlv_36= 'by' otherlv_37= 'modifying' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* )
            {
            // InternalInfluenceDSL.g:486:2: (otherlv_0= '#**' ( (lv_description_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_description_3_0= ruleEString ) ) )* (otherlv_4= '**#' )? otherlv_5= 'Influence' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'from' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= 'and' otherlv_12= 'from' otherlv_13= 'phenomena' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= 'emerges' ( (lv_produces_18_0= ruleEmergentBehavior ) ) (otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) ) )* otherlv_21= 'that' otherlv_22= 'implies' ( (lv_affects_23_0= ruleSystemResponse ) ) (otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) ) )* otherlv_26= 'which' otherlv_27= 'may' otherlv_28= 'violate' ( ( ruleEString ) ) (otherlv_30= 'and' ( ( ruleEString ) ) )* otherlv_32= 'it' otherlv_33= 'can' otherlv_34= 'be' otherlv_35= 'compensated' otherlv_36= 'by' otherlv_37= 'modifying' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* )
            // InternalInfluenceDSL.g:487:3: otherlv_0= '#**' ( (lv_description_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_description_3_0= ruleEString ) ) )* (otherlv_4= '**#' )? otherlv_5= 'Influence' ( (lv_name_6_0= ruleEString ) ) otherlv_7= 'from' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= 'and' otherlv_12= 'from' otherlv_13= 'phenomena' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= 'emerges' ( (lv_produces_18_0= ruleEmergentBehavior ) ) (otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) ) )* otherlv_21= 'that' otherlv_22= 'implies' ( (lv_affects_23_0= ruleSystemResponse ) ) (otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) ) )* otherlv_26= 'which' otherlv_27= 'may' otherlv_28= 'violate' ( ( ruleEString ) ) (otherlv_30= 'and' ( ( ruleEString ) ) )* otherlv_32= 'it' otherlv_33= 'can' otherlv_34= 'be' otherlv_35= 'compensated' otherlv_36= 'by' otherlv_37= 'modifying' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_0());
            		
            // InternalInfluenceDSL.g:491:3: ( (lv_description_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:492:4: (lv_description_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:492:4: (lv_description_1_0= ruleEString )
            // InternalInfluenceDSL.g:493:5: lv_description_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_description_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_1_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:510:3: (otherlv_2= ',' ( (lv_description_3_0= ruleEString ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInfluenceDSL.g:511:4: otherlv_2= ',' ( (lv_description_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInfluenceAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalInfluenceDSL.g:515:4: ( (lv_description_3_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:516:5: (lv_description_3_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:516:5: (lv_description_3_0= ruleEString )
            	    // InternalInfluenceDSL.g:517:6: lv_description_3_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalInfluenceDSL.g:535:3: (otherlv_4= '**#' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalInfluenceDSL.g:536:4: otherlv_4= '**#'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getInfluenceAccess().getInfluenceKeyword_4());
            		
            // InternalInfluenceDSL.g:545:3: ( (lv_name_6_0= ruleEString ) )
            // InternalInfluenceDSL.g:546:4: (lv_name_6_0= ruleEString )
            {
            // InternalInfluenceDSL.g:546:4: (lv_name_6_0= ruleEString )
            // InternalInfluenceDSL.g:547:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getInfluenceAccess().getFromKeyword_6());
            		
            // InternalInfluenceDSL.g:568:3: ( (otherlv_8= RULE_ID ) )
            // InternalInfluenceDSL.g:569:4: (otherlv_8= RULE_ID )
            {
            // InternalInfluenceDSL.g:569:4: (otherlv_8= RULE_ID )
            // InternalInfluenceDSL.g:570:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_8, grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_7_0());
            				

            }


            }

            // InternalInfluenceDSL.g:581:3: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:582:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_9, grammarAccess.getInfluenceAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalInfluenceDSL.g:586:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalInfluenceDSL.g:587:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalInfluenceDSL.g:587:5: (otherlv_10= RULE_ID )
            	    // InternalInfluenceDSL.g:588:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluenceRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_10, grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getInfluenceAccess().getAndKeyword_9());
            		
            otherlv_12=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getInfluenceAccess().getFromKeyword_10());
            		
            otherlv_13=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getInfluenceAccess().getPhenomenaKeyword_11());
            		
            // InternalInfluenceDSL.g:612:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:613:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:613:4: ( ruleEString )
            // InternalInfluenceDSL.g:614:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_12_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:628:3: (otherlv_15= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInfluenceDSL.g:629:4: otherlv_15= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_15, grammarAccess.getInfluenceAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalInfluenceDSL.g:633:4: ( ( ruleEString ) )
            	    // InternalInfluenceDSL.g:634:5: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:634:5: ( ruleEString )
            	    // InternalInfluenceDSL.g:635:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluenceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_13_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_17=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_17, grammarAccess.getInfluenceAccess().getEmergesKeyword_14());
            		
            // InternalInfluenceDSL.g:654:3: ( (lv_produces_18_0= ruleEmergentBehavior ) )
            // InternalInfluenceDSL.g:655:4: (lv_produces_18_0= ruleEmergentBehavior )
            {
            // InternalInfluenceDSL.g:655:4: (lv_produces_18_0= ruleEmergentBehavior )
            // InternalInfluenceDSL.g:656:5: lv_produces_18_0= ruleEmergentBehavior
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_17);
            lv_produces_18_0=ruleEmergentBehavior();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"produces",
            						lv_produces_18_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EmergentBehavior");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:673:3: (otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:674:4: otherlv_19= ',' ( (lv_produces_20_0= ruleEmergentBehavior ) )
            	    {
            	    otherlv_19=(Token)match(input,14,FOLLOW_16); 

            	    				newLeafNode(otherlv_19, grammarAccess.getInfluenceAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalInfluenceDSL.g:678:4: ( (lv_produces_20_0= ruleEmergentBehavior ) )
            	    // InternalInfluenceDSL.g:679:5: (lv_produces_20_0= ruleEmergentBehavior )
            	    {
            	    // InternalInfluenceDSL.g:679:5: (lv_produces_20_0= ruleEmergentBehavior )
            	    // InternalInfluenceDSL.g:680:6: lv_produces_20_0= ruleEmergentBehavior
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_produces_20_0=ruleEmergentBehavior();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"produces",
            	    							lv_produces_20_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EmergentBehavior");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_21=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_21, grammarAccess.getInfluenceAccess().getThatKeyword_17());
            		
            otherlv_22=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_22, grammarAccess.getInfluenceAccess().getImpliesKeyword_18());
            		
            // InternalInfluenceDSL.g:706:3: ( (lv_affects_23_0= ruleSystemResponse ) )
            // InternalInfluenceDSL.g:707:4: (lv_affects_23_0= ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:707:4: (lv_affects_23_0= ruleSystemResponse )
            // InternalInfluenceDSL.g:708:5: lv_affects_23_0= ruleSystemResponse
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_20);
            lv_affects_23_0=ruleSystemResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"affects",
            						lv_affects_23_0,
            						"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:725:3: (otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalInfluenceDSL.g:726:4: otherlv_24= ',' ( (lv_affects_25_0= ruleSystemResponse ) )
            	    {
            	    otherlv_24=(Token)match(input,14,FOLLOW_19); 

            	    				newLeafNode(otherlv_24, grammarAccess.getInfluenceAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalInfluenceDSL.g:730:4: ( (lv_affects_25_0= ruleSystemResponse ) )
            	    // InternalInfluenceDSL.g:731:5: (lv_affects_25_0= ruleSystemResponse )
            	    {
            	    // InternalInfluenceDSL.g:731:5: (lv_affects_25_0= ruleSystemResponse )
            	    // InternalInfluenceDSL.g:732:6: lv_affects_25_0= ruleSystemResponse
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_26=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_26, grammarAccess.getInfluenceAccess().getWhichKeyword_21());
            		
            otherlv_27=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_27, grammarAccess.getInfluenceAccess().getMayKeyword_22());
            		
            otherlv_28=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getInfluenceAccess().getViolateKeyword_23());
            		
            // InternalInfluenceDSL.g:762:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:763:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:763:4: ( ruleEString )
            // InternalInfluenceDSL.g:764:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_24_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:778:3: (otherlv_30= 'and' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfluenceDSL.g:779:4: otherlv_30= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_30, grammarAccess.getInfluenceAccess().getAndKeyword_25_0());
            	    			
            	    // InternalInfluenceDSL.g:783:4: ( ( ruleEString ) )
            	    // InternalInfluenceDSL.g:784:5: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:784:5: ( ruleEString )
            	    // InternalInfluenceDSL.g:785:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluenceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_25_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

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

            otherlv_32=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_32, grammarAccess.getInfluenceAccess().getItKeyword_26());
            		
            otherlv_33=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_33, grammarAccess.getInfluenceAccess().getCanKeyword_27());
            		
            otherlv_34=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_34, grammarAccess.getInfluenceAccess().getBeKeyword_28());
            		
            otherlv_35=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_35, grammarAccess.getInfluenceAccess().getCompensatedKeyword_29());
            		
            otherlv_36=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_36, grammarAccess.getInfluenceAccess().getByKeyword_30());
            		
            otherlv_37=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_37, grammarAccess.getInfluenceAccess().getModifyingKeyword_31());
            		
            // InternalInfluenceDSL.g:824:3: ( (otherlv_38= RULE_ID ) )
            // InternalInfluenceDSL.g:825:4: (otherlv_38= RULE_ID )
            {
            // InternalInfluenceDSL.g:825:4: (otherlv_38= RULE_ID )
            // InternalInfluenceDSL.g:826:5: otherlv_38= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				
            otherlv_38=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_38, grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_32_0());
            				

            }


            }

            // InternalInfluenceDSL.g:837:3: (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfluenceDSL.g:838:4: otherlv_39= ',' ( (otherlv_40= RULE_ID ) )
            	    {
            	    otherlv_39=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_39, grammarAccess.getInfluenceAccess().getCommaKeyword_33_0());
            	    			
            	    // InternalInfluenceDSL.g:842:4: ( (otherlv_40= RULE_ID ) )
            	    // InternalInfluenceDSL.g:843:5: (otherlv_40= RULE_ID )
            	    {
            	    // InternalInfluenceDSL.g:843:5: (otherlv_40= RULE_ID )
            	    // InternalInfluenceDSL.g:844:6: otherlv_40= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluenceRule());
            	    						}
            	    					
            	    otherlv_40=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(otherlv_40, grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_33_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "entryRuleRequirementSatisfaction"
    // InternalInfluenceDSL.g:860:1: entryRuleRequirementSatisfaction returns [EObject current=null] : iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF ;
    public final EObject entryRuleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementSatisfaction = null;


        try {
            // InternalInfluenceDSL.g:860:64: (iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF )
            // InternalInfluenceDSL.g:861:2: iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF
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
    // InternalInfluenceDSL.g:867:1: ruleRequirementSatisfaction returns [EObject current=null] : (otherlv_0= 'Requirement' otherlv_1= 'Satisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'from' otherlv_5= 'Requirement' ( (lv_concerningRequirement_6_0= ruleEString ) ) otherlv_7= 'satisfied' otherlv_8= 'when' ( (lv_satisfaction_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) ) )* ) ;
    public final EObject ruleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_concerningRequirement_6_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_9_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_11_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:873:2: ( (otherlv_0= 'Requirement' otherlv_1= 'Satisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'from' otherlv_5= 'Requirement' ( (lv_concerningRequirement_6_0= ruleEString ) ) otherlv_7= 'satisfied' otherlv_8= 'when' ( (lv_satisfaction_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) ) )* ) )
            // InternalInfluenceDSL.g:874:2: (otherlv_0= 'Requirement' otherlv_1= 'Satisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'from' otherlv_5= 'Requirement' ( (lv_concerningRequirement_6_0= ruleEString ) ) otherlv_7= 'satisfied' otherlv_8= 'when' ( (lv_satisfaction_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) ) )* )
            {
            // InternalInfluenceDSL.g:874:2: (otherlv_0= 'Requirement' otherlv_1= 'Satisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'from' otherlv_5= 'Requirement' ( (lv_concerningRequirement_6_0= ruleEString ) ) otherlv_7= 'satisfied' otherlv_8= 'when' ( (lv_satisfaction_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) ) )* )
            // InternalInfluenceDSL.g:875:3: otherlv_0= 'Requirement' otherlv_1= 'Satisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'from' otherlv_5= 'Requirement' ( (lv_concerningRequirement_6_0= ruleEString ) ) otherlv_7= 'satisfied' otherlv_8= 'when' ( (lv_satisfaction_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementSatisfactionAccess().getSatisfactionKeyword_1());
            		
            // InternalInfluenceDSL.g:883:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:884:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:884:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:885:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementSatisfactionAccess().getFromKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_5());
            		
            // InternalInfluenceDSL.g:914:3: ( (lv_concerningRequirement_6_0= ruleEString ) )
            // InternalInfluenceDSL.g:915:4: (lv_concerningRequirement_6_0= ruleEString )
            {
            // InternalInfluenceDSL.g:915:4: (lv_concerningRequirement_6_0= ruleEString )
            // InternalInfluenceDSL.g:916:5: lv_concerningRequirement_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_concerningRequirement_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					set(
            						current,
            						"concerningRequirement",
            						lv_concerningRequirement_6_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_7());
            		
            otherlv_8=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_8());
            		
            // InternalInfluenceDSL.g:941:3: ( (lv_satisfaction_9_0= ruleEString ) )
            // InternalInfluenceDSL.g:942:4: (lv_satisfaction_9_0= ruleEString )
            {
            // InternalInfluenceDSL.g:942:4: (lv_satisfaction_9_0= ruleEString )
            // InternalInfluenceDSL.g:943:5: lv_satisfaction_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_satisfaction_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					add(
            						current,
            						"satisfaction",
            						lv_satisfaction_9_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:960:3: (otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfluenceDSL.g:961:4: otherlv_10= ',' ( (lv_satisfaction_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalInfluenceDSL.g:965:4: ( (lv_satisfaction_11_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:966:5: (lv_satisfaction_11_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:966:5: (lv_satisfaction_11_0= ruleEString )
            	    // InternalInfluenceDSL.g:967:6: lv_satisfaction_11_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_satisfaction_11_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"satisfaction",
            	    							lv_satisfaction_11_0,
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


    // $ANTLR start "entryRuleArtifact"
    // InternalInfluenceDSL.g:989:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalInfluenceDSL.g:989:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalInfluenceDSL.g:990:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalInfluenceDSL.g:996:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1002:2: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalInfluenceDSL.g:1003:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalInfluenceDSL.g:1003:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalInfluenceDSL.g:1004:3: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            // InternalInfluenceDSL.g:1004:3: ()
            // InternalInfluenceDSL.g:1005:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalInfluenceDSL.g:1015:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:1016:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1016:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:1017:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalInfluenceDSL.g:1038:3: ( (otherlv_4= RULE_ID ) )
            // InternalInfluenceDSL.g:1039:4: (otherlv_4= RULE_ID )
            {
            // InternalInfluenceDSL.g:1039:4: (otherlv_4= RULE_ID )
            // InternalInfluenceDSL.g:1040:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getRefEObjectCrossReference_4_0());
            				

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleEString"
    // InternalInfluenceDSL.g:1055:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInfluenceDSL.g:1055:47: (iv_ruleEString= ruleEString EOF )
            // InternalInfluenceDSL.g:1056:2: iv_ruleEString= ruleEString EOF
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
    // InternalInfluenceDSL.g:1062:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:1068:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInfluenceDSL.g:1069:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInfluenceDSL.g:1069:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalInfluenceDSL.g:1070:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:1078:3: this_ID_1= RULE_ID
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
    // InternalInfluenceDSL.g:1089:1: entryRuleSystemResponse returns [EObject current=null] : iv_ruleSystemResponse= ruleSystemResponse EOF ;
    public final EObject entryRuleSystemResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemResponse = null;


        try {
            // InternalInfluenceDSL.g:1089:55: (iv_ruleSystemResponse= ruleSystemResponse EOF )
            // InternalInfluenceDSL.g:1090:2: iv_ruleSystemResponse= ruleSystemResponse EOF
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
    // InternalInfluenceDSL.g:1096:1: ruleSystemResponse returns [EObject current=null] : ( () otherlv_1= 'system' otherlv_2= 'response' (otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleSystemResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_observation_5_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1102:2: ( ( () otherlv_1= 'system' otherlv_2= 'response' (otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:1103:2: ( () otherlv_1= 'system' otherlv_2= 'response' (otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:1103:2: ( () otherlv_1= 'system' otherlv_2= 'response' (otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:1104:3: () otherlv_1= 'system' otherlv_2= 'response' (otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) ) )?
            {
            // InternalInfluenceDSL.g:1104:3: ()
            // InternalInfluenceDSL.g:1105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemResponseAccess().getSystemResponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemResponseAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemResponseAccess().getResponseKeyword_2());
            		
            // InternalInfluenceDSL.g:1119:3: (otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalInfluenceDSL.g:1120:4: otherlv_3= 'resulting' otherlv_4= 'in' ( (lv_observation_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemResponseAccess().getResultingKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemResponseAccess().getInKeyword_3_1());
                    			
                    // InternalInfluenceDSL.g:1128:4: ( (lv_observation_5_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1129:5: (lv_observation_5_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1129:5: (lv_observation_5_0= ruleEString )
                    // InternalInfluenceDSL.g:1130:6: lv_observation_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSystemResponseAccess().getObservationEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_observation_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemResponseRule());
                    						}
                    						set(
                    							current,
                    							"observation",
                    							lv_observation_5_0,
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
    // $ANTLR end "ruleSystemResponse"


    // $ANTLR start "entryRuleEmergentBehavior"
    // InternalInfluenceDSL.g:1152:1: entryRuleEmergentBehavior returns [EObject current=null] : iv_ruleEmergentBehavior= ruleEmergentBehavior EOF ;
    public final EObject entryRuleEmergentBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergentBehavior = null;


        try {
            // InternalInfluenceDSL.g:1152:57: (iv_ruleEmergentBehavior= ruleEmergentBehavior EOF )
            // InternalInfluenceDSL.g:1153:2: iv_ruleEmergentBehavior= ruleEmergentBehavior EOF
            {
             newCompositeNode(grammarAccess.getEmergentBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmergentBehavior=ruleEmergentBehavior();

            state._fsp--;

             current =iv_ruleEmergentBehavior; 
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
    // $ANTLR end "entryRuleEmergentBehavior"


    // $ANTLR start "ruleEmergentBehavior"
    // InternalInfluenceDSL.g:1159:1: ruleEmergentBehavior returns [EObject current=null] : ( () otherlv_1= 'Emergent' otherlv_2= 'Behavior' (otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleEmergentBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1165:2: ( ( () otherlv_1= 'Emergent' otherlv_2= 'Behavior' (otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) ) )? ) )
            // InternalInfluenceDSL.g:1166:2: ( () otherlv_1= 'Emergent' otherlv_2= 'Behavior' (otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) ) )? )
            {
            // InternalInfluenceDSL.g:1166:2: ( () otherlv_1= 'Emergent' otherlv_2= 'Behavior' (otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) ) )? )
            // InternalInfluenceDSL.g:1167:3: () otherlv_1= 'Emergent' otherlv_2= 'Behavior' (otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) ) )?
            {
            // InternalInfluenceDSL.g:1167:3: ()
            // InternalInfluenceDSL.g:1168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmergentBehaviorAccess().getEmergentBehaviorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getEmergentBehaviorAccess().getEmergentKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getEmergentBehaviorAccess().getBehaviorKeyword_2());
            		
            // InternalInfluenceDSL.g:1182:3: (otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:1183:4: otherlv_3= 'characterized' otherlv_4= 'by' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmergentBehaviorAccess().getCharacterizedKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEmergentBehaviorAccess().getByKeyword_3_1());
                    			
                    // InternalInfluenceDSL.g:1191:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1192:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1192:5: (lv_description_5_0= ruleEString )
                    // InternalInfluenceDSL.g:1193:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmergentBehaviorAccess().getDescriptionEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmergentBehaviorRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
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
    // $ANTLR end "ruleEmergentBehavior"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010800031002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000002L});

}