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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'{'", "'Requirements'", "'}'", "'CyberPhysicalPhenomena'", "'Artifacts'", "'Influences'", "'Influence'", "'sourceArtifact'", "','", "'targetArtifact'", "'description'", "'sourcePhenomena'", "'('", "')'", "'produces'", "'affects'", "'evaluatedBy'", "'Artifact'", "'RequirementSatisfaction'", "'concerningRequirement'", "'satisfaction'", "'SystemResponse'", "'observation'", "'EmergentBehavior'", "'configuration'", "'MultiPhenomenon'", "'compositionOf'", "'aggregationOf'", "'SimplePhenomenon'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int RULE_ID=5;
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
    public static final int T__40=40;
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
        	return "InfluenceMetamodel";
       	}

       	@Override
       	protected InfluenceDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfluenceMetamodel"
    // InternalInfluenceDSL.g:64:1: entryRuleInfluenceMetamodel returns [EObject current=null] : iv_ruleInfluenceMetamodel= ruleInfluenceMetamodel EOF ;
    public final EObject entryRuleInfluenceMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluenceMetamodel = null;


        try {
            // InternalInfluenceDSL.g:64:59: (iv_ruleInfluenceMetamodel= ruleInfluenceMetamodel EOF )
            // InternalInfluenceDSL.g:65:2: iv_ruleInfluenceMetamodel= ruleInfluenceMetamodel EOF
            {
             newCompositeNode(grammarAccess.getInfluenceMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfluenceMetamodel=ruleInfluenceMetamodel();

            state._fsp--;

             current =iv_ruleInfluenceMetamodel; 
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
    // $ANTLR end "entryRuleInfluenceMetamodel"


    // $ANTLR start "ruleInfluenceMetamodel"
    // InternalInfluenceDSL.g:71:1: ruleInfluenceMetamodel returns [EObject current=null] : ( () otherlv_1= 'InfluenceModel' otherlv_2= '{' (otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}' )? (otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}' )? (otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}' )? (otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleInfluenceMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_ownedRequirementSatisfaction_5_0 = null;

        EObject lv_ownedCyberPhysicalPhenomena_9_0 = null;

        EObject lv_ownedArtifacts_13_0 = null;

        EObject lv_ownedInfluences_17_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:77:2: ( ( () otherlv_1= 'InfluenceModel' otherlv_2= '{' (otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}' )? (otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}' )? (otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}' )? (otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalInfluenceDSL.g:78:2: ( () otherlv_1= 'InfluenceModel' otherlv_2= '{' (otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}' )? (otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}' )? (otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}' )? (otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalInfluenceDSL.g:78:2: ( () otherlv_1= 'InfluenceModel' otherlv_2= '{' (otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}' )? (otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}' )? (otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}' )? (otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalInfluenceDSL.g:79:3: () otherlv_1= 'InfluenceModel' otherlv_2= '{' (otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}' )? (otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}' )? (otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}' )? (otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // InternalInfluenceDSL.g:79:3: ()
            // InternalInfluenceDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfluenceMetamodelAccess().getInfluenceMetamodelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInfluenceMetamodelAccess().getInfluenceModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluenceMetamodelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalInfluenceDSL.g:94:3: (otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalInfluenceDSL.g:95:4: otherlv_3= 'Requirements' otherlv_4= '{' ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getInfluenceMetamodelAccess().getRequirementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getInfluenceMetamodelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalInfluenceDSL.g:103:4: ( (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==30) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:104:5: (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction )
                    	    {
                    	    // InternalInfluenceDSL.g:104:5: (lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction )
                    	    // InternalInfluenceDSL.g:105:6: lv_ownedRequirementSatisfaction_5_0= ruleRequirementSatisfaction
                    	    {

                    	    						newCompositeNode(grammarAccess.getInfluenceMetamodelAccess().getOwnedRequirementSatisfactionRequirementSatisfactionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_ownedRequirementSatisfaction_5_0=ruleRequirementSatisfaction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInfluenceMetamodelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedRequirementSatisfaction",
                    	    							lv_ownedRequirementSatisfaction_5_0,
                    	    							"fr.inria.kairos.influence.InfluenceDSL.RequirementSatisfaction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getInfluenceMetamodelAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:127:3: (otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInfluenceDSL.g:128:4: otherlv_7= 'CyberPhysicalPhenomena' otherlv_8= '{' ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getInfluenceMetamodelAccess().getCyberPhysicalPhenomenaKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getInfluenceMetamodelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:136:4: ( (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15||LA3_0==37||LA3_0==40) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:137:5: (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena )
                    	    {
                    	    // InternalInfluenceDSL.g:137:5: (lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena )
                    	    // InternalInfluenceDSL.g:138:6: lv_ownedCyberPhysicalPhenomena_9_0= ruleCyberPhysicalPhenomena
                    	    {

                    	    						newCompositeNode(grammarAccess.getInfluenceMetamodelAccess().getOwnedCyberPhysicalPhenomenaCyberPhysicalPhenomenaParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_ownedCyberPhysicalPhenomena_9_0=ruleCyberPhysicalPhenomena();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInfluenceMetamodelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedCyberPhysicalPhenomena",
                    	    							lv_ownedCyberPhysicalPhenomena_9_0,
                    	    							"fr.inria.kairos.influence.InfluenceDSL.CyberPhysicalPhenomena");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getInfluenceMetamodelAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:160:3: (otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInfluenceDSL.g:161:4: otherlv_11= 'Artifacts' otherlv_12= '{' ( (lv_ownedArtifacts_13_0= ruleArtifact ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getInfluenceMetamodelAccess().getArtifactsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getInfluenceMetamodelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalInfluenceDSL.g:169:4: ( (lv_ownedArtifacts_13_0= ruleArtifact ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:170:5: (lv_ownedArtifacts_13_0= ruleArtifact )
                    	    {
                    	    // InternalInfluenceDSL.g:170:5: (lv_ownedArtifacts_13_0= ruleArtifact )
                    	    // InternalInfluenceDSL.g:171:6: lv_ownedArtifacts_13_0= ruleArtifact
                    	    {

                    	    						newCompositeNode(grammarAccess.getInfluenceMetamodelAccess().getOwnedArtifactsArtifactParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_ownedArtifacts_13_0=ruleArtifact();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInfluenceMetamodelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedArtifacts",
                    	    							lv_ownedArtifacts_13_0,
                    	    							"fr.inria.kairos.influence.InfluenceDSL.Artifact");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getInfluenceMetamodelAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:193:3: (otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:194:4: otherlv_15= 'Influences' otherlv_16= '{' ( (lv_ownedInfluences_17_0= ruleInfluence ) )* otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getInfluenceMetamodelAccess().getInfluencesKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getInfluenceMetamodelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalInfluenceDSL.g:202:4: ( (lv_ownedInfluences_17_0= ruleInfluence ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:203:5: (lv_ownedInfluences_17_0= ruleInfluence )
                    	    {
                    	    // InternalInfluenceDSL.g:203:5: (lv_ownedInfluences_17_0= ruleInfluence )
                    	    // InternalInfluenceDSL.g:204:6: lv_ownedInfluences_17_0= ruleInfluence
                    	    {

                    	    						newCompositeNode(grammarAccess.getInfluenceMetamodelAccess().getOwnedInfluencesInfluenceParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_ownedInfluences_17_0=ruleInfluence();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInfluenceMetamodelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedInfluences",
                    	    							lv_ownedInfluences_17_0,
                    	    							"fr.inria.kairos.influence.InfluenceDSL.Influence");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getInfluenceMetamodelAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getInfluenceMetamodelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInfluenceMetamodel"


    // $ANTLR start "entryRuleCyberPhysicalPhenomena"
    // InternalInfluenceDSL.g:234:1: entryRuleCyberPhysicalPhenomena returns [EObject current=null] : iv_ruleCyberPhysicalPhenomena= ruleCyberPhysicalPhenomena EOF ;
    public final EObject entryRuleCyberPhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyberPhysicalPhenomena = null;


        try {
            // InternalInfluenceDSL.g:234:63: (iv_ruleCyberPhysicalPhenomena= ruleCyberPhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:235:2: iv_ruleCyberPhysicalPhenomena= ruleCyberPhysicalPhenomena EOF
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
    // InternalInfluenceDSL.g:241:1: ruleCyberPhysicalPhenomena returns [EObject current=null] : (this_CyberPhysicalPhenomena_Impl_0= ruleCyberPhysicalPhenomena_Impl | this_MultiPhenomenon_1= ruleMultiPhenomenon | this_SimplePhenomenon_2= ruleSimplePhenomenon ) ;
    public final EObject ruleCyberPhysicalPhenomena() throws RecognitionException {
        EObject current = null;

        EObject this_CyberPhysicalPhenomena_Impl_0 = null;

        EObject this_MultiPhenomenon_1 = null;

        EObject this_SimplePhenomenon_2 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:247:2: ( (this_CyberPhysicalPhenomena_Impl_0= ruleCyberPhysicalPhenomena_Impl | this_MultiPhenomenon_1= ruleMultiPhenomenon | this_SimplePhenomenon_2= ruleSimplePhenomenon ) )
            // InternalInfluenceDSL.g:248:2: (this_CyberPhysicalPhenomena_Impl_0= ruleCyberPhysicalPhenomena_Impl | this_MultiPhenomenon_1= ruleMultiPhenomenon | this_SimplePhenomenon_2= ruleSimplePhenomenon )
            {
            // InternalInfluenceDSL.g:248:2: (this_CyberPhysicalPhenomena_Impl_0= ruleCyberPhysicalPhenomena_Impl | this_MultiPhenomenon_1= ruleMultiPhenomenon | this_SimplePhenomenon_2= ruleSimplePhenomenon )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 40:
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
                    // InternalInfluenceDSL.g:249:3: this_CyberPhysicalPhenomena_Impl_0= ruleCyberPhysicalPhenomena_Impl
                    {

                    			newCompositeNode(grammarAccess.getCyberPhysicalPhenomenaAccess().getCyberPhysicalPhenomena_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CyberPhysicalPhenomena_Impl_0=ruleCyberPhysicalPhenomena_Impl();

                    state._fsp--;


                    			current = this_CyberPhysicalPhenomena_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:258:3: this_MultiPhenomenon_1= ruleMultiPhenomenon
                    {

                    			newCompositeNode(grammarAccess.getCyberPhysicalPhenomenaAccess().getMultiPhenomenonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiPhenomenon_1=ruleMultiPhenomenon();

                    state._fsp--;


                    			current = this_MultiPhenomenon_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:267:3: this_SimplePhenomenon_2= ruleSimplePhenomenon
                    {

                    			newCompositeNode(grammarAccess.getCyberPhysicalPhenomenaAccess().getSimplePhenomenonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimplePhenomenon_2=ruleSimplePhenomenon();

                    state._fsp--;


                    			current = this_SimplePhenomenon_2;
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


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:279:1: entryRuleInfluence returns [EObject current=null] : iv_ruleInfluence= ruleInfluence EOF ;
    public final EObject entryRuleInfluence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluence = null;


        try {
            // InternalInfluenceDSL.g:279:50: (iv_ruleInfluence= ruleInfluence EOF )
            // InternalInfluenceDSL.g:280:2: iv_ruleInfluence= ruleInfluence EOF
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
    // InternalInfluenceDSL.g:286:1: ruleInfluence returns [EObject current=null] : (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sourceArtifact' otherlv_4= '{' ( (lv_sourceArtifact_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= 'targetArtifact' otherlv_10= '{' ( (lv_targetArtifact_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) ) )* otherlv_14= '}' otherlv_15= 'description' otherlv_16= '{' ( (lv_description_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_description_19_0= ruleEString ) ) )* otherlv_20= '}' otherlv_21= 'sourcePhenomena' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' otherlv_27= 'produces' otherlv_28= '{' ( (lv_produces_29_0= ruleEmergentBehavior ) ) (otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) ) )* otherlv_32= '}' otherlv_33= 'affects' otherlv_34= '{' ( (lv_affects_35_0= ruleSystemResponse ) ) (otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) ) )* otherlv_38= '}' otherlv_39= 'evaluatedBy' otherlv_40= '(' ( ( ruleEString ) ) (otherlv_42= ',' ( ( ruleEString ) ) )* otherlv_44= ')' otherlv_45= '}' ) ;
    public final EObject ruleInfluence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
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
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sourceArtifact_5_0 = null;

        AntlrDatatypeRuleToken lv_sourceArtifact_7_0 = null;

        AntlrDatatypeRuleToken lv_targetArtifact_11_0 = null;

        AntlrDatatypeRuleToken lv_targetArtifact_13_0 = null;

        AntlrDatatypeRuleToken lv_description_17_0 = null;

        AntlrDatatypeRuleToken lv_description_19_0 = null;

        EObject lv_produces_29_0 = null;

        EObject lv_produces_31_0 = null;

        EObject lv_affects_35_0 = null;

        EObject lv_affects_37_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:292:2: ( (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sourceArtifact' otherlv_4= '{' ( (lv_sourceArtifact_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= 'targetArtifact' otherlv_10= '{' ( (lv_targetArtifact_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) ) )* otherlv_14= '}' otherlv_15= 'description' otherlv_16= '{' ( (lv_description_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_description_19_0= ruleEString ) ) )* otherlv_20= '}' otherlv_21= 'sourcePhenomena' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' otherlv_27= 'produces' otherlv_28= '{' ( (lv_produces_29_0= ruleEmergentBehavior ) ) (otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) ) )* otherlv_32= '}' otherlv_33= 'affects' otherlv_34= '{' ( (lv_affects_35_0= ruleSystemResponse ) ) (otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) ) )* otherlv_38= '}' otherlv_39= 'evaluatedBy' otherlv_40= '(' ( ( ruleEString ) ) (otherlv_42= ',' ( ( ruleEString ) ) )* otherlv_44= ')' otherlv_45= '}' ) )
            // InternalInfluenceDSL.g:293:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sourceArtifact' otherlv_4= '{' ( (lv_sourceArtifact_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= 'targetArtifact' otherlv_10= '{' ( (lv_targetArtifact_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) ) )* otherlv_14= '}' otherlv_15= 'description' otherlv_16= '{' ( (lv_description_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_description_19_0= ruleEString ) ) )* otherlv_20= '}' otherlv_21= 'sourcePhenomena' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' otherlv_27= 'produces' otherlv_28= '{' ( (lv_produces_29_0= ruleEmergentBehavior ) ) (otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) ) )* otherlv_32= '}' otherlv_33= 'affects' otherlv_34= '{' ( (lv_affects_35_0= ruleSystemResponse ) ) (otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) ) )* otherlv_38= '}' otherlv_39= 'evaluatedBy' otherlv_40= '(' ( ( ruleEString ) ) (otherlv_42= ',' ( ( ruleEString ) ) )* otherlv_44= ')' otherlv_45= '}' )
            {
            // InternalInfluenceDSL.g:293:2: (otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sourceArtifact' otherlv_4= '{' ( (lv_sourceArtifact_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= 'targetArtifact' otherlv_10= '{' ( (lv_targetArtifact_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) ) )* otherlv_14= '}' otherlv_15= 'description' otherlv_16= '{' ( (lv_description_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_description_19_0= ruleEString ) ) )* otherlv_20= '}' otherlv_21= 'sourcePhenomena' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' otherlv_27= 'produces' otherlv_28= '{' ( (lv_produces_29_0= ruleEmergentBehavior ) ) (otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) ) )* otherlv_32= '}' otherlv_33= 'affects' otherlv_34= '{' ( (lv_affects_35_0= ruleSystemResponse ) ) (otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) ) )* otherlv_38= '}' otherlv_39= 'evaluatedBy' otherlv_40= '(' ( ( ruleEString ) ) (otherlv_42= ',' ( ( ruleEString ) ) )* otherlv_44= ')' otherlv_45= '}' )
            // InternalInfluenceDSL.g:294:3: otherlv_0= 'Influence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sourceArtifact' otherlv_4= '{' ( (lv_sourceArtifact_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= 'targetArtifact' otherlv_10= '{' ( (lv_targetArtifact_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) ) )* otherlv_14= '}' otherlv_15= 'description' otherlv_16= '{' ( (lv_description_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_description_19_0= ruleEString ) ) )* otherlv_20= '}' otherlv_21= 'sourcePhenomena' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' otherlv_27= 'produces' otherlv_28= '{' ( (lv_produces_29_0= ruleEmergentBehavior ) ) (otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) ) )* otherlv_32= '}' otherlv_33= 'affects' otherlv_34= '{' ( (lv_affects_35_0= ruleSystemResponse ) ) (otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) ) )* otherlv_38= '}' otherlv_39= 'evaluatedBy' otherlv_40= '(' ( ( ruleEString ) ) (otherlv_42= ',' ( ( ruleEString ) ) )* otherlv_44= ')' otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluenceAccess().getInfluenceKeyword_0());
            		
            // InternalInfluenceDSL.g:298:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInfluenceDSL.g:299:4: (lv_name_1_0= ruleEString )
            {
            // InternalInfluenceDSL.g:299:4: (lv_name_1_0= ruleEString )
            // InternalInfluenceDSL.g:300:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluenceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getInfluenceAccess().getSourceArtifactKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getInfluenceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalInfluenceDSL.g:329:3: ( (lv_sourceArtifact_5_0= ruleEString ) )
            // InternalInfluenceDSL.g:330:4: (lv_sourceArtifact_5_0= ruleEString )
            {
            // InternalInfluenceDSL.g:330:4: (lv_sourceArtifact_5_0= ruleEString )
            // InternalInfluenceDSL.g:331:5: lv_sourceArtifact_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getSourceArtifactEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_sourceArtifact_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"sourceArtifact",
            						lv_sourceArtifact_5_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:348:3: (otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInfluenceDSL.g:349:4: otherlv_6= ',' ( (lv_sourceArtifact_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInfluenceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalInfluenceDSL.g:353:4: ( (lv_sourceArtifact_7_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:354:5: (lv_sourceArtifact_7_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:354:5: (lv_sourceArtifact_7_0= ruleEString )
            	    // InternalInfluenceDSL.g:355:6: lv_sourceArtifact_7_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getSourceArtifactEStringParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_sourceArtifact_7_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceArtifact",
            	    							lv_sourceArtifact_7_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getInfluenceAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getInfluenceAccess().getTargetArtifactKeyword_8());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getInfluenceAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalInfluenceDSL.g:385:3: ( (lv_targetArtifact_11_0= ruleEString ) )
            // InternalInfluenceDSL.g:386:4: (lv_targetArtifact_11_0= ruleEString )
            {
            // InternalInfluenceDSL.g:386:4: (lv_targetArtifact_11_0= ruleEString )
            // InternalInfluenceDSL.g:387:5: lv_targetArtifact_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getTargetArtifactEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_targetArtifact_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"targetArtifact",
            						lv_targetArtifact_11_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:404:3: (otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:405:4: otherlv_12= ',' ( (lv_targetArtifact_13_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_12, grammarAccess.getInfluenceAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalInfluenceDSL.g:409:4: ( (lv_targetArtifact_13_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:410:5: (lv_targetArtifact_13_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:410:5: (lv_targetArtifact_13_0= ruleEString )
            	    // InternalInfluenceDSL.g:411:6: lv_targetArtifact_13_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getTargetArtifactEStringParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_targetArtifact_13_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetArtifact",
            	    							lv_targetArtifact_13_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getInfluenceAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_15=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getInfluenceAccess().getDescriptionKeyword_13());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getInfluenceAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalInfluenceDSL.g:441:3: ( (lv_description_17_0= ruleEString ) )
            // InternalInfluenceDSL.g:442:4: (lv_description_17_0= ruleEString )
            {
            // InternalInfluenceDSL.g:442:4: (lv_description_17_0= ruleEString )
            // InternalInfluenceDSL.g:443:5: lv_description_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_15);
            lv_description_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_17_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:460:3: (otherlv_18= ',' ( (lv_description_19_0= ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInfluenceDSL.g:461:4: otherlv_18= ',' ( (lv_description_19_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_18, grammarAccess.getInfluenceAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalInfluenceDSL.g:465:4: ( (lv_description_19_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:466:5: (lv_description_19_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:466:5: (lv_description_19_0= ruleEString )
            	    // InternalInfluenceDSL.g:467:6: lv_description_19_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_description_19_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"description",
            	    							lv_description_19_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_20=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_20, grammarAccess.getInfluenceAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_21=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getInfluenceAccess().getSourcePhenomenaKeyword_18());
            		
            otherlv_22=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getInfluenceAccess().getLeftParenthesisKeyword_19());
            		
            // InternalInfluenceDSL.g:497:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:498:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:498:4: ( ruleEString )
            // InternalInfluenceDSL.g:499:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_20_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:513:3: (otherlv_24= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:514:4: otherlv_24= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_24, grammarAccess.getInfluenceAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalInfluenceDSL.g:518:4: ( ( ruleEString ) )
            	    // InternalInfluenceDSL.g:519:5: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:519:5: ( ruleEString )
            	    // InternalInfluenceDSL.g:520:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluenceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_21_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            otherlv_26=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_26, grammarAccess.getInfluenceAccess().getRightParenthesisKeyword_22());
            		
            otherlv_27=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getInfluenceAccess().getProducesKeyword_23());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_28, grammarAccess.getInfluenceAccess().getLeftCurlyBracketKeyword_24());
            		
            // InternalInfluenceDSL.g:547:3: ( (lv_produces_29_0= ruleEmergentBehavior ) )
            // InternalInfluenceDSL.g:548:4: (lv_produces_29_0= ruleEmergentBehavior )
            {
            // InternalInfluenceDSL.g:548:4: (lv_produces_29_0= ruleEmergentBehavior )
            // InternalInfluenceDSL.g:549:5: lv_produces_29_0= ruleEmergentBehavior
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_15);
            lv_produces_29_0=ruleEmergentBehavior();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"produces",
            						lv_produces_29_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EmergentBehavior");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:566:3: (otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalInfluenceDSL.g:567:4: otherlv_30= ',' ( (lv_produces_31_0= ruleEmergentBehavior ) )
            	    {
            	    otherlv_30=(Token)match(input,20,FOLLOW_22); 

            	    				newLeafNode(otherlv_30, grammarAccess.getInfluenceAccess().getCommaKeyword_26_0());
            	    			
            	    // InternalInfluenceDSL.g:571:4: ( (lv_produces_31_0= ruleEmergentBehavior ) )
            	    // InternalInfluenceDSL.g:572:5: (lv_produces_31_0= ruleEmergentBehavior )
            	    {
            	    // InternalInfluenceDSL.g:572:5: (lv_produces_31_0= ruleEmergentBehavior )
            	    // InternalInfluenceDSL.g:573:6: lv_produces_31_0= ruleEmergentBehavior
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_26_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_produces_31_0=ruleEmergentBehavior();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"produces",
            	    							lv_produces_31_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EmergentBehavior");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_32=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_32, grammarAccess.getInfluenceAccess().getRightCurlyBracketKeyword_27());
            		
            otherlv_33=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_33, grammarAccess.getInfluenceAccess().getAffectsKeyword_28());
            		
            otherlv_34=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_34, grammarAccess.getInfluenceAccess().getLeftCurlyBracketKeyword_29());
            		
            // InternalInfluenceDSL.g:603:3: ( (lv_affects_35_0= ruleSystemResponse ) )
            // InternalInfluenceDSL.g:604:4: (lv_affects_35_0= ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:604:4: (lv_affects_35_0= ruleSystemResponse )
            // InternalInfluenceDSL.g:605:5: lv_affects_35_0= ruleSystemResponse
            {

            					newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_30_0());
            				
            pushFollow(FOLLOW_15);
            lv_affects_35_0=ruleSystemResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfluenceRule());
            					}
            					add(
            						current,
            						"affects",
            						lv_affects_35_0,
            						"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:622:3: (otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfluenceDSL.g:623:4: otherlv_36= ',' ( (lv_affects_37_0= ruleSystemResponse ) )
            	    {
            	    otherlv_36=(Token)match(input,20,FOLLOW_24); 

            	    				newLeafNode(otherlv_36, grammarAccess.getInfluenceAccess().getCommaKeyword_31_0());
            	    			
            	    // InternalInfluenceDSL.g:627:4: ( (lv_affects_37_0= ruleSystemResponse ) )
            	    // InternalInfluenceDSL.g:628:5: (lv_affects_37_0= ruleSystemResponse )
            	    {
            	    // InternalInfluenceDSL.g:628:5: (lv_affects_37_0= ruleSystemResponse )
            	    // InternalInfluenceDSL.g:629:6: lv_affects_37_0= ruleSystemResponse
            	    {

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_31_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_affects_37_0=ruleSystemResponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfluenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"affects",
            	    							lv_affects_37_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.SystemResponse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_38=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_38, grammarAccess.getInfluenceAccess().getRightCurlyBracketKeyword_32());
            		
            otherlv_39=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_39, grammarAccess.getInfluenceAccess().getEvaluatedByKeyword_33());
            		
            otherlv_40=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_40, grammarAccess.getInfluenceAccess().getLeftParenthesisKeyword_34());
            		
            // InternalInfluenceDSL.g:659:3: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:660:4: ( ruleEString )
            {
            // InternalInfluenceDSL.g:660:4: ( ruleEString )
            // InternalInfluenceDSL.g:661:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_35_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:675:3: (otherlv_42= ',' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfluenceDSL.g:676:4: otherlv_42= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_42=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_42, grammarAccess.getInfluenceAccess().getCommaKeyword_36_0());
            	    			
            	    // InternalInfluenceDSL.g:680:4: ( ( ruleEString ) )
            	    // InternalInfluenceDSL.g:681:5: ( ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:681:5: ( ruleEString )
            	    // InternalInfluenceDSL.g:682:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluenceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_36_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_44=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_44, grammarAccess.getInfluenceAccess().getRightParenthesisKeyword_37());
            		
            otherlv_45=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_45, grammarAccess.getInfluenceAccess().getRightCurlyBracketKeyword_38());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalInfluenceDSL.g:709:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInfluenceDSL.g:709:47: (iv_ruleEString= ruleEString EOF )
            // InternalInfluenceDSL.g:710:2: iv_ruleEString= ruleEString EOF
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
    // InternalInfluenceDSL.g:716:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInfluenceDSL.g:722:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInfluenceDSL.g:723:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInfluenceDSL.g:723:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalInfluenceDSL.g:724:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:732:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleArtifact"
    // InternalInfluenceDSL.g:743:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalInfluenceDSL.g:743:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalInfluenceDSL.g:744:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalInfluenceDSL.g:750:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:756:2: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalInfluenceDSL.g:757:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalInfluenceDSL.g:757:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalInfluenceDSL.g:758:3: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalInfluenceDSL.g:758:3: ()
            // InternalInfluenceDSL.g:759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalInfluenceDSL.g:769:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:770:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:770:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:771:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleRequirementSatisfaction"
    // InternalInfluenceDSL.g:800:1: entryRuleRequirementSatisfaction returns [EObject current=null] : iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF ;
    public final EObject entryRuleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementSatisfaction = null;


        try {
            // InternalInfluenceDSL.g:800:64: (iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF )
            // InternalInfluenceDSL.g:801:2: iv_ruleRequirementSatisfaction= ruleRequirementSatisfaction EOF
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
    // InternalInfluenceDSL.g:807:1: ruleRequirementSatisfaction returns [EObject current=null] : ( () otherlv_1= 'RequirementSatisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'concerningRequirement' ( (lv_concerningRequirement_5_0= ruleEString ) ) otherlv_6= 'satisfaction' otherlv_7= '{' ( (lv_satisfaction_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleRequirementSatisfaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_concerningRequirement_5_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_8_0 = null;

        AntlrDatatypeRuleToken lv_satisfaction_10_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:813:2: ( ( () otherlv_1= 'RequirementSatisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'concerningRequirement' ( (lv_concerningRequirement_5_0= ruleEString ) ) otherlv_6= 'satisfaction' otherlv_7= '{' ( (lv_satisfaction_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalInfluenceDSL.g:814:2: ( () otherlv_1= 'RequirementSatisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'concerningRequirement' ( (lv_concerningRequirement_5_0= ruleEString ) ) otherlv_6= 'satisfaction' otherlv_7= '{' ( (lv_satisfaction_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalInfluenceDSL.g:814:2: ( () otherlv_1= 'RequirementSatisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'concerningRequirement' ( (lv_concerningRequirement_5_0= ruleEString ) ) otherlv_6= 'satisfaction' otherlv_7= '{' ( (lv_satisfaction_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalInfluenceDSL.g:815:3: () otherlv_1= 'RequirementSatisfaction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'concerningRequirement' ( (lv_concerningRequirement_5_0= ruleEString ) ) otherlv_6= 'satisfaction' otherlv_7= '{' ( (lv_satisfaction_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            // InternalInfluenceDSL.g:815:3: ()
            // InternalInfluenceDSL.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementSatisfactionAccess().getRequirementSatisfactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementSatisfactionAccess().getRequirementSatisfactionKeyword_1());
            		
            // InternalInfluenceDSL.g:826:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:827:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:827:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:828:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementSatisfactionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementKeyword_4());
            		
            // InternalInfluenceDSL.g:853:3: ( (lv_concerningRequirement_5_0= ruleEString ) )
            // InternalInfluenceDSL.g:854:4: (lv_concerningRequirement_5_0= ruleEString )
            {
            // InternalInfluenceDSL.g:854:4: (lv_concerningRequirement_5_0= ruleEString )
            // InternalInfluenceDSL.g:855:5: lv_concerningRequirement_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_concerningRequirement_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					set(
            						current,
            						"concerningRequirement",
            						lv_concerningRequirement_5_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementSatisfactionAccess().getSatisfactionKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementSatisfactionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalInfluenceDSL.g:880:3: ( (lv_satisfaction_8_0= ruleEString ) )
            // InternalInfluenceDSL.g:881:4: (lv_satisfaction_8_0= ruleEString )
            {
            // InternalInfluenceDSL.g:881:4: (lv_satisfaction_8_0= ruleEString )
            // InternalInfluenceDSL.g:882:5: lv_satisfaction_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_satisfaction_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            					}
            					add(
            						current,
            						"satisfaction",
            						lv_satisfaction_8_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfluenceDSL.g:899:3: (otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfluenceDSL.g:900:4: otherlv_9= ',' ( (lv_satisfaction_10_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_9, grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalInfluenceDSL.g:904:4: ( (lv_satisfaction_10_0= ruleEString ) )
            	    // InternalInfluenceDSL.g:905:5: (lv_satisfaction_10_0= ruleEString )
            	    {
            	    // InternalInfluenceDSL.g:905:5: (lv_satisfaction_10_0= ruleEString )
            	    // InternalInfluenceDSL.g:906:6: lv_satisfaction_10_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_satisfaction_10_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementSatisfactionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"satisfaction",
            	    							lv_satisfaction_10_0,
            	    							"fr.inria.kairos.influence.InfluenceDSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getRequirementSatisfactionAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRequirementSatisfactionAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleSystemResponse"
    // InternalInfluenceDSL.g:936:1: entryRuleSystemResponse returns [EObject current=null] : iv_ruleSystemResponse= ruleSystemResponse EOF ;
    public final EObject entryRuleSystemResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemResponse = null;


        try {
            // InternalInfluenceDSL.g:936:55: (iv_ruleSystemResponse= ruleSystemResponse EOF )
            // InternalInfluenceDSL.g:937:2: iv_ruleSystemResponse= ruleSystemResponse EOF
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
    // InternalInfluenceDSL.g:943:1: ruleSystemResponse returns [EObject current=null] : ( () otherlv_1= 'SystemResponse' otherlv_2= '{' (otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSystemResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_observation_4_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:949:2: ( ( () otherlv_1= 'SystemResponse' otherlv_2= '{' (otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalInfluenceDSL.g:950:2: ( () otherlv_1= 'SystemResponse' otherlv_2= '{' (otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalInfluenceDSL.g:950:2: ( () otherlv_1= 'SystemResponse' otherlv_2= '{' (otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalInfluenceDSL.g:951:3: () otherlv_1= 'SystemResponse' otherlv_2= '{' (otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalInfluenceDSL.g:951:3: ()
            // InternalInfluenceDSL.g:952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemResponseAccess().getSystemResponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemResponseAccess().getSystemResponseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemResponseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalInfluenceDSL.g:966:3: (otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalInfluenceDSL.g:967:4: otherlv_3= 'observation' ( (lv_observation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemResponseAccess().getObservationKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:971:4: ( (lv_observation_4_0= ruleEString ) )
                    // InternalInfluenceDSL.g:972:5: (lv_observation_4_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:972:5: (lv_observation_4_0= ruleEString )
                    // InternalInfluenceDSL.g:973:6: lv_observation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSystemResponseAccess().getObservationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_observation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemResponseRule());
                    						}
                    						set(
                    							current,
                    							"observation",
                    							lv_observation_4_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemResponseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalInfluenceDSL.g:999:1: entryRuleEmergentBehavior returns [EObject current=null] : iv_ruleEmergentBehavior= ruleEmergentBehavior EOF ;
    public final EObject entryRuleEmergentBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergentBehavior = null;


        try {
            // InternalInfluenceDSL.g:999:57: (iv_ruleEmergentBehavior= ruleEmergentBehavior EOF )
            // InternalInfluenceDSL.g:1000:2: iv_ruleEmergentBehavior= ruleEmergentBehavior EOF
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
    // InternalInfluenceDSL.g:1006:1: ruleEmergentBehavior returns [EObject current=null] : ( () otherlv_1= 'EmergentBehavior' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEmergentBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1012:2: ( ( () otherlv_1= 'EmergentBehavior' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalInfluenceDSL.g:1013:2: ( () otherlv_1= 'EmergentBehavior' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalInfluenceDSL.g:1013:2: ( () otherlv_1= 'EmergentBehavior' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalInfluenceDSL.g:1014:3: () otherlv_1= 'EmergentBehavior' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalInfluenceDSL.g:1014:3: ()
            // InternalInfluenceDSL.g:1015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmergentBehaviorAccess().getEmergentBehaviorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEmergentBehaviorAccess().getEmergentBehaviorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getEmergentBehaviorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalInfluenceDSL.g:1029:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:1030:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmergentBehaviorAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalInfluenceDSL.g:1034:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1035:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1035:5: (lv_description_4_0= ruleEString )
                    // InternalInfluenceDSL.g:1036:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmergentBehaviorAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmergentBehaviorRule());
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEmergentBehaviorAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleCyberPhysicalPhenomena_Impl"
    // InternalInfluenceDSL.g:1062:1: entryRuleCyberPhysicalPhenomena_Impl returns [EObject current=null] : iv_ruleCyberPhysicalPhenomena_Impl= ruleCyberPhysicalPhenomena_Impl EOF ;
    public final EObject entryRuleCyberPhysicalPhenomena_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyberPhysicalPhenomena_Impl = null;


        try {
            // InternalInfluenceDSL.g:1062:68: (iv_ruleCyberPhysicalPhenomena_Impl= ruleCyberPhysicalPhenomena_Impl EOF )
            // InternalInfluenceDSL.g:1063:2: iv_ruleCyberPhysicalPhenomena_Impl= ruleCyberPhysicalPhenomena_Impl EOF
            {
             newCompositeNode(grammarAccess.getCyberPhysicalPhenomena_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCyberPhysicalPhenomena_Impl=ruleCyberPhysicalPhenomena_Impl();

            state._fsp--;

             current =iv_ruleCyberPhysicalPhenomena_Impl; 
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
    // $ANTLR end "entryRuleCyberPhysicalPhenomena_Impl"


    // $ANTLR start "ruleCyberPhysicalPhenomena_Impl"
    // InternalInfluenceDSL.g:1069:1: ruleCyberPhysicalPhenomena_Impl returns [EObject current=null] : ( () otherlv_1= 'CyberPhysicalPhenomena' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleCyberPhysicalPhenomena_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_configuration_6_0 = null;

        AntlrDatatypeRuleToken lv_configuration_8_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1075:2: ( ( () otherlv_1= 'CyberPhysicalPhenomena' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalInfluenceDSL.g:1076:2: ( () otherlv_1= 'CyberPhysicalPhenomena' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalInfluenceDSL.g:1076:2: ( () otherlv_1= 'CyberPhysicalPhenomena' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalInfluenceDSL.g:1077:3: () otherlv_1= 'CyberPhysicalPhenomena' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalInfluenceDSL.g:1077:3: ()
            // InternalInfluenceDSL.g:1078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getCyberPhysicalPhenomenaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getCyberPhysicalPhenomenaKeyword_1());
            		
            // InternalInfluenceDSL.g:1088:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:1089:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1089:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:1090:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCyberPhysicalPhenomena_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.influence.InfluenceDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInfluenceDSL.g:1111:3: (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalInfluenceDSL.g:1112:4: otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getConfigurationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:1120:4: ( (lv_configuration_6_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1121:5: (lv_configuration_6_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1121:5: (lv_configuration_6_0= ruleEString )
                    // InternalInfluenceDSL.g:1122:6: lv_configuration_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getConfigurationEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_configuration_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCyberPhysicalPhenomena_ImplRule());
                    						}
                    						add(
                    							current,
                    							"configuration",
                    							lv_configuration_6_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:1139:4: (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==20) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1140:5: otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1144:5: ( (lv_configuration_8_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:1145:6: (lv_configuration_8_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:1145:6: (lv_configuration_8_0= ruleEString )
                    	    // InternalInfluenceDSL.g:1146:7: lv_configuration_8_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getConfigurationEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_configuration_8_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCyberPhysicalPhenomena_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"configuration",
                    	    								lv_configuration_8_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCyberPhysicalPhenomena_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCyberPhysicalPhenomena_Impl"


    // $ANTLR start "entryRuleMultiPhenomenon"
    // InternalInfluenceDSL.g:1177:1: entryRuleMultiPhenomenon returns [EObject current=null] : iv_ruleMultiPhenomenon= ruleMultiPhenomenon EOF ;
    public final EObject entryRuleMultiPhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiPhenomenon = null;


        try {
            // InternalInfluenceDSL.g:1177:56: (iv_ruleMultiPhenomenon= ruleMultiPhenomenon EOF )
            // InternalInfluenceDSL.g:1178:2: iv_ruleMultiPhenomenon= ruleMultiPhenomenon EOF
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
    // InternalInfluenceDSL.g:1184:1: ruleMultiPhenomenon returns [EObject current=null] : ( () otherlv_1= 'MultiPhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}' )? (otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleMultiPhenomenon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_configuration_6_0 = null;

        AntlrDatatypeRuleToken lv_configuration_8_0 = null;

        EObject lv_compositionOf_12_0 = null;

        EObject lv_compositionOf_14_0 = null;

        EObject lv_aggregationOf_18_0 = null;

        EObject lv_aggregationOf_20_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1190:2: ( ( () otherlv_1= 'MultiPhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}' )? (otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalInfluenceDSL.g:1191:2: ( () otherlv_1= 'MultiPhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}' )? (otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalInfluenceDSL.g:1191:2: ( () otherlv_1= 'MultiPhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}' )? (otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalInfluenceDSL.g:1192:3: () otherlv_1= 'MultiPhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}' )? (otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalInfluenceDSL.g:1192:3: ()
            // InternalInfluenceDSL.g:1193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiPhenomenonAccess().getMultiPhenomenonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiPhenomenonAccess().getMultiPhenomenonKeyword_1());
            		
            // InternalInfluenceDSL.g:1203:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:1204:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1204:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:1205:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiPhenomenonAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInfluenceDSL.g:1226:3: (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalInfluenceDSL.g:1227:4: otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultiPhenomenonAccess().getConfigurationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getMultiPhenomenonAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:1235:4: ( (lv_configuration_6_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1236:5: (lv_configuration_6_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1236:5: (lv_configuration_6_0= ruleEString )
                    // InternalInfluenceDSL.g:1237:6: lv_configuration_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_configuration_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    						}
                    						add(
                    							current,
                    							"configuration",
                    							lv_configuration_6_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:1254:4: (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==20) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1255:5: otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1259:5: ( (lv_configuration_8_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:1260:6: (lv_configuration_8_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:1260:6: (lv_configuration_8_0= ruleEString )
                    	    // InternalInfluenceDSL.g:1261:7: lv_configuration_8_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getMultiPhenomenonAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:1284:3: (otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalInfluenceDSL.g:1285:4: otherlv_10= 'compositionOf' otherlv_11= '{' ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) ) (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMultiPhenomenonAccess().getCompositionOfKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getMultiPhenomenonAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalInfluenceDSL.g:1293:4: ( (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena ) )
                    // InternalInfluenceDSL.g:1294:5: (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena )
                    {
                    // InternalInfluenceDSL.g:1294:5: (lv_compositionOf_12_0= ruleCyberPhysicalPhenomena )
                    // InternalInfluenceDSL.g:1295:6: lv_compositionOf_12_0= ruleCyberPhysicalPhenomena
                    {

                    						newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getCompositionOfCyberPhysicalPhenomenaParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_compositionOf_12_0=ruleCyberPhysicalPhenomena();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    						}
                    						add(
                    							current,
                    							"compositionOf",
                    							lv_compositionOf_12_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.CyberPhysicalPhenomena");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:1312:4: (otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1313:5: otherlv_13= ',' ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_33); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1317:5: ( (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena ) )
                    	    // InternalInfluenceDSL.g:1318:6: (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena )
                    	    {
                    	    // InternalInfluenceDSL.g:1318:6: (lv_compositionOf_14_0= ruleCyberPhysicalPhenomena )
                    	    // InternalInfluenceDSL.g:1319:7: lv_compositionOf_14_0= ruleCyberPhysicalPhenomena
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getCompositionOfCyberPhysicalPhenomenaParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_compositionOf_14_0=ruleCyberPhysicalPhenomena();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"compositionOf",
                    	    								lv_compositionOf_14_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.CyberPhysicalPhenomena");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getMultiPhenomenonAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalInfluenceDSL.g:1342:3: (otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalInfluenceDSL.g:1343:4: otherlv_16= 'aggregationOf' otherlv_17= '{' ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) ) (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getMultiPhenomenonAccess().getAggregationOfKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_17, grammarAccess.getMultiPhenomenonAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalInfluenceDSL.g:1351:4: ( (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena ) )
                    // InternalInfluenceDSL.g:1352:5: (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena )
                    {
                    // InternalInfluenceDSL.g:1352:5: (lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena )
                    // InternalInfluenceDSL.g:1353:6: lv_aggregationOf_18_0= ruleCyberPhysicalPhenomena
                    {

                    						newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_aggregationOf_18_0=ruleCyberPhysicalPhenomena();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    						}
                    						add(
                    							current,
                    							"aggregationOf",
                    							lv_aggregationOf_18_0,
                    							"fr.inria.kairos.influence.InfluenceDSL.CyberPhysicalPhenomena");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInfluenceDSL.g:1370:4: (otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1371:5: otherlv_19= ',' ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) )
                    	    {
                    	    otherlv_19=(Token)match(input,20,FOLLOW_33); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1375:5: ( (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena ) )
                    	    // InternalInfluenceDSL.g:1376:6: (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena )
                    	    {
                    	    // InternalInfluenceDSL.g:1376:6: (lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena )
                    	    // InternalInfluenceDSL.g:1377:7: lv_aggregationOf_20_0= ruleCyberPhysicalPhenomena
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_aggregationOf_20_0=ruleCyberPhysicalPhenomena();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMultiPhenomenonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"aggregationOf",
                    	    								lv_aggregationOf_20_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.CyberPhysicalPhenomena");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getMultiPhenomenonAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getMultiPhenomenonAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalInfluenceDSL.g:1408:1: entryRuleSimplePhenomenon returns [EObject current=null] : iv_ruleSimplePhenomenon= ruleSimplePhenomenon EOF ;
    public final EObject entryRuleSimplePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePhenomenon = null;


        try {
            // InternalInfluenceDSL.g:1408:57: (iv_ruleSimplePhenomenon= ruleSimplePhenomenon EOF )
            // InternalInfluenceDSL.g:1409:2: iv_ruleSimplePhenomenon= ruleSimplePhenomenon EOF
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
    // InternalInfluenceDSL.g:1415:1: ruleSimplePhenomenon returns [EObject current=null] : ( () otherlv_1= 'SimplePhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleSimplePhenomenon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_configuration_6_0 = null;

        AntlrDatatypeRuleToken lv_configuration_8_0 = null;



        	enterRule();

        try {
            // InternalInfluenceDSL.g:1421:2: ( ( () otherlv_1= 'SimplePhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalInfluenceDSL.g:1422:2: ( () otherlv_1= 'SimplePhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalInfluenceDSL.g:1422:2: ( () otherlv_1= 'SimplePhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalInfluenceDSL.g:1423:3: () otherlv_1= 'SimplePhenomenon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalInfluenceDSL.g:1423:3: ()
            // InternalInfluenceDSL.g:1424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimplePhenomenonAccess().getSimplePhenomenonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSimplePhenomenonAccess().getSimplePhenomenonKeyword_1());
            		
            // InternalInfluenceDSL.g:1434:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInfluenceDSL.g:1435:4: (lv_name_2_0= ruleEString )
            {
            // InternalInfluenceDSL.g:1435:4: (lv_name_2_0= ruleEString )
            // InternalInfluenceDSL.g:1436:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimplePhenomenonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getSimplePhenomenonAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInfluenceDSL.g:1457:3: (otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalInfluenceDSL.g:1458:4: otherlv_4= 'configuration' otherlv_5= '{' ( (lv_configuration_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimplePhenomenonAccess().getConfigurationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimplePhenomenonAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalInfluenceDSL.g:1466:4: ( (lv_configuration_6_0= ruleEString ) )
                    // InternalInfluenceDSL.g:1467:5: (lv_configuration_6_0= ruleEString )
                    {
                    // InternalInfluenceDSL.g:1467:5: (lv_configuration_6_0= ruleEString )
                    // InternalInfluenceDSL.g:1468:6: lv_configuration_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalInfluenceDSL.g:1485:4: (otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalInfluenceDSL.g:1486:5: otherlv_7= ',' ( (lv_configuration_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSimplePhenomenonAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalInfluenceDSL.g:1490:5: ( (lv_configuration_8_0= ruleEString ) )
                    	    // InternalInfluenceDSL.g:1491:6: (lv_configuration_8_0= ruleEString )
                    	    {
                    	    // InternalInfluenceDSL.g:1491:6: (lv_configuration_8_0= ruleEString )
                    	    // InternalInfluenceDSL.g:1492:7: lv_configuration_8_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_configuration_8_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSimplePhenomenonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"configuration",
                    	    								lv_configuration_8_0,
                    	    								"fr.inria.kairos.influence.InfluenceDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getSimplePhenomenonAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSimplePhenomenonAccess().getRightCurlyBracketKeyword_5());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001200000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000D000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000C000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000012000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000004000L});

}