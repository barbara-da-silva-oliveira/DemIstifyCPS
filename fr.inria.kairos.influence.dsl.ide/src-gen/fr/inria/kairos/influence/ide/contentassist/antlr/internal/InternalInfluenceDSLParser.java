package fr.inria.kairos.influence.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.inria.kairos.influence.services.InfluenceDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInfluenceDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_EXP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'Composite'", "'Influence'", "'#**'", "'**#'", "'encapsulate'", "'affects'", "','", "'and'", "'originators'", "':'", "'artifact'", "'phenomena'", "'system'", "'response'", "'metadata'", "'likelihood'", "'confidence'", "'fun'", "'('", "')'", "'compositeFun'", "'Phenomenon'", "'Requirement'", "'satisfied'", "'when'", "'DesignArtifact'", "'->'", "'changeability'", "'='", "'used'", "'in'", "'.'"
    };
    public static final int RULE_EXP=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
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

    	public void setGrammarAccess(InfluenceDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInfluenceModel"
    // InternalInfluenceDSL.g:53:1: entryRuleInfluenceModel : ruleInfluenceModel EOF ;
    public final void entryRuleInfluenceModel() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:54:1: ( ruleInfluenceModel EOF )
            // InternalInfluenceDSL.g:55:1: ruleInfluenceModel EOF
            {
             before(grammarAccess.getInfluenceModelRule()); 
            pushFollow(FOLLOW_1);
            ruleInfluenceModel();

            state._fsp--;

             after(grammarAccess.getInfluenceModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfluenceModel"


    // $ANTLR start "ruleInfluenceModel"
    // InternalInfluenceDSL.g:62:1: ruleInfluenceModel : ( ( rule__InfluenceModel__Group__0 ) ) ;
    public final void ruleInfluenceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:66:2: ( ( ( rule__InfluenceModel__Group__0 ) ) )
            // InternalInfluenceDSL.g:67:2: ( ( rule__InfluenceModel__Group__0 ) )
            {
            // InternalInfluenceDSL.g:67:2: ( ( rule__InfluenceModel__Group__0 ) )
            // InternalInfluenceDSL.g:68:3: ( rule__InfluenceModel__Group__0 )
            {
             before(grammarAccess.getInfluenceModelAccess().getGroup()); 
            // InternalInfluenceDSL.g:69:3: ( rule__InfluenceModel__Group__0 )
            // InternalInfluenceDSL.g:69:4: rule__InfluenceModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InfluenceModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfluenceModel"


    // $ANTLR start "entryRuleAbstractInfluence"
    // InternalInfluenceDSL.g:78:1: entryRuleAbstractInfluence : ruleAbstractInfluence EOF ;
    public final void entryRuleAbstractInfluence() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:79:1: ( ruleAbstractInfluence EOF )
            // InternalInfluenceDSL.g:80:1: ruleAbstractInfluence EOF
            {
             before(grammarAccess.getAbstractInfluenceRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractInfluence();

            state._fsp--;

             after(grammarAccess.getAbstractInfluenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractInfluence"


    // $ANTLR start "ruleAbstractInfluence"
    // InternalInfluenceDSL.g:87:1: ruleAbstractInfluence : ( ( rule__AbstractInfluence__Alternatives ) ) ;
    public final void ruleAbstractInfluence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:91:2: ( ( ( rule__AbstractInfluence__Alternatives ) ) )
            // InternalInfluenceDSL.g:92:2: ( ( rule__AbstractInfluence__Alternatives ) )
            {
            // InternalInfluenceDSL.g:92:2: ( ( rule__AbstractInfluence__Alternatives ) )
            // InternalInfluenceDSL.g:93:3: ( rule__AbstractInfluence__Alternatives )
            {
             before(grammarAccess.getAbstractInfluenceAccess().getAlternatives()); 
            // InternalInfluenceDSL.g:94:3: ( rule__AbstractInfluence__Alternatives )
            // InternalInfluenceDSL.g:94:4: rule__AbstractInfluence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInfluence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInfluenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractInfluence"


    // $ANTLR start "entryRuleCompositeInfluence"
    // InternalInfluenceDSL.g:103:1: entryRuleCompositeInfluence : ruleCompositeInfluence EOF ;
    public final void entryRuleCompositeInfluence() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:104:1: ( ruleCompositeInfluence EOF )
            // InternalInfluenceDSL.g:105:1: ruleCompositeInfluence EOF
            {
             before(grammarAccess.getCompositeInfluenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeInfluence();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeInfluence"


    // $ANTLR start "ruleCompositeInfluence"
    // InternalInfluenceDSL.g:112:1: ruleCompositeInfluence : ( ( rule__CompositeInfluence__Group__0 ) ) ;
    public final void ruleCompositeInfluence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:116:2: ( ( ( rule__CompositeInfluence__Group__0 ) ) )
            // InternalInfluenceDSL.g:117:2: ( ( rule__CompositeInfluence__Group__0 ) )
            {
            // InternalInfluenceDSL.g:117:2: ( ( rule__CompositeInfluence__Group__0 ) )
            // InternalInfluenceDSL.g:118:3: ( rule__CompositeInfluence__Group__0 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getGroup()); 
            // InternalInfluenceDSL.g:119:3: ( rule__CompositeInfluence__Group__0 )
            // InternalInfluenceDSL.g:119:4: rule__CompositeInfluence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeInfluence"


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:128:1: entryRuleInfluence : ruleInfluence EOF ;
    public final void entryRuleInfluence() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:129:1: ( ruleInfluence EOF )
            // InternalInfluenceDSL.g:130:1: ruleInfluence EOF
            {
             before(grammarAccess.getInfluenceRule()); 
            pushFollow(FOLLOW_1);
            ruleInfluence();

            state._fsp--;

             after(grammarAccess.getInfluenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfluence"


    // $ANTLR start "ruleInfluence"
    // InternalInfluenceDSL.g:137:1: ruleInfluence : ( ( rule__Influence__Group__0 ) ) ;
    public final void ruleInfluence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:141:2: ( ( ( rule__Influence__Group__0 ) ) )
            // InternalInfluenceDSL.g:142:2: ( ( rule__Influence__Group__0 ) )
            {
            // InternalInfluenceDSL.g:142:2: ( ( rule__Influence__Group__0 ) )
            // InternalInfluenceDSL.g:143:3: ( rule__Influence__Group__0 )
            {
             before(grammarAccess.getInfluenceAccess().getGroup()); 
            // InternalInfluenceDSL.g:144:3: ( rule__Influence__Group__0 )
            // InternalInfluenceDSL.g:144:4: rule__Influence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfluence"


    // $ANTLR start "entryRuleFunction"
    // InternalInfluenceDSL.g:153:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:154:1: ( ruleFunction EOF )
            // InternalInfluenceDSL.g:155:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalInfluenceDSL.g:162:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:166:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalInfluenceDSL.g:167:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalInfluenceDSL.g:167:2: ( ( rule__Function__Group__0 ) )
            // InternalInfluenceDSL.g:168:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalInfluenceDSL.g:169:3: ( rule__Function__Group__0 )
            // InternalInfluenceDSL.g:169:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleCompositeFunction"
    // InternalInfluenceDSL.g:178:1: entryRuleCompositeFunction : ruleCompositeFunction EOF ;
    public final void entryRuleCompositeFunction() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:179:1: ( ruleCompositeFunction EOF )
            // InternalInfluenceDSL.g:180:1: ruleCompositeFunction EOF
            {
             before(grammarAccess.getCompositeFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeFunction();

            state._fsp--;

             after(grammarAccess.getCompositeFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeFunction"


    // $ANTLR start "ruleCompositeFunction"
    // InternalInfluenceDSL.g:187:1: ruleCompositeFunction : ( ( rule__CompositeFunction__Group__0 ) ) ;
    public final void ruleCompositeFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:191:2: ( ( ( rule__CompositeFunction__Group__0 ) ) )
            // InternalInfluenceDSL.g:192:2: ( ( rule__CompositeFunction__Group__0 ) )
            {
            // InternalInfluenceDSL.g:192:2: ( ( rule__CompositeFunction__Group__0 ) )
            // InternalInfluenceDSL.g:193:3: ( rule__CompositeFunction__Group__0 )
            {
             before(grammarAccess.getCompositeFunctionAccess().getGroup()); 
            // InternalInfluenceDSL.g:194:3: ( rule__CompositeFunction__Group__0 )
            // InternalInfluenceDSL.g:194:4: rule__CompositeFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeFunction"


    // $ANTLR start "entryRulePhysicalPhenomena"
    // InternalInfluenceDSL.g:203:1: entryRulePhysicalPhenomena : rulePhysicalPhenomena EOF ;
    public final void entryRulePhysicalPhenomena() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:204:1: ( rulePhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:205:1: rulePhysicalPhenomena EOF
            {
             before(grammarAccess.getPhysicalPhenomenaRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicalPhenomena();

            state._fsp--;

             after(grammarAccess.getPhysicalPhenomenaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhysicalPhenomena"


    // $ANTLR start "rulePhysicalPhenomena"
    // InternalInfluenceDSL.g:212:1: rulePhysicalPhenomena : ( ( rule__PhysicalPhenomena__Group__0 ) ) ;
    public final void rulePhysicalPhenomena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:216:2: ( ( ( rule__PhysicalPhenomena__Group__0 ) ) )
            // InternalInfluenceDSL.g:217:2: ( ( rule__PhysicalPhenomena__Group__0 ) )
            {
            // InternalInfluenceDSL.g:217:2: ( ( rule__PhysicalPhenomena__Group__0 ) )
            // InternalInfluenceDSL.g:218:3: ( rule__PhysicalPhenomena__Group__0 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getGroup()); 
            // InternalInfluenceDSL.g:219:3: ( rule__PhysicalPhenomena__Group__0 )
            // InternalInfluenceDSL.g:219:4: rule__PhysicalPhenomena__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalPhenomenaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhysicalPhenomena"


    // $ANTLR start "entryRuleRequirementSatisfaction"
    // InternalInfluenceDSL.g:228:1: entryRuleRequirementSatisfaction : ruleRequirementSatisfaction EOF ;
    public final void entryRuleRequirementSatisfaction() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:229:1: ( ruleRequirementSatisfaction EOF )
            // InternalInfluenceDSL.g:230:1: ruleRequirementSatisfaction EOF
            {
             before(grammarAccess.getRequirementSatisfactionRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirementSatisfaction();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirementSatisfaction"


    // $ANTLR start "ruleRequirementSatisfaction"
    // InternalInfluenceDSL.g:237:1: ruleRequirementSatisfaction : ( ( rule__RequirementSatisfaction__Group__0 ) ) ;
    public final void ruleRequirementSatisfaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:241:2: ( ( ( rule__RequirementSatisfaction__Group__0 ) ) )
            // InternalInfluenceDSL.g:242:2: ( ( rule__RequirementSatisfaction__Group__0 ) )
            {
            // InternalInfluenceDSL.g:242:2: ( ( rule__RequirementSatisfaction__Group__0 ) )
            // InternalInfluenceDSL.g:243:3: ( rule__RequirementSatisfaction__Group__0 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup()); 
            // InternalInfluenceDSL.g:244:3: ( rule__RequirementSatisfaction__Group__0 )
            // InternalInfluenceDSL.g:244:4: rule__RequirementSatisfaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirementSatisfaction"


    // $ANTLR start "entryRuleDesignArtifact"
    // InternalInfluenceDSL.g:253:1: entryRuleDesignArtifact : ruleDesignArtifact EOF ;
    public final void entryRuleDesignArtifact() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:254:1: ( ruleDesignArtifact EOF )
            // InternalInfluenceDSL.g:255:1: ruleDesignArtifact EOF
            {
             before(grammarAccess.getDesignArtifactRule()); 
            pushFollow(FOLLOW_1);
            ruleDesignArtifact();

            state._fsp--;

             after(grammarAccess.getDesignArtifactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDesignArtifact"


    // $ANTLR start "ruleDesignArtifact"
    // InternalInfluenceDSL.g:262:1: ruleDesignArtifact : ( ( rule__DesignArtifact__Group__0 ) ) ;
    public final void ruleDesignArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:266:2: ( ( ( rule__DesignArtifact__Group__0 ) ) )
            // InternalInfluenceDSL.g:267:2: ( ( rule__DesignArtifact__Group__0 ) )
            {
            // InternalInfluenceDSL.g:267:2: ( ( rule__DesignArtifact__Group__0 ) )
            // InternalInfluenceDSL.g:268:3: ( rule__DesignArtifact__Group__0 )
            {
             before(grammarAccess.getDesignArtifactAccess().getGroup()); 
            // InternalInfluenceDSL.g:269:3: ( rule__DesignArtifact__Group__0 )
            // InternalInfluenceDSL.g:269:4: rule__DesignArtifact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignArtifactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesignArtifact"


    // $ANTLR start "entryRuleEString"
    // InternalInfluenceDSL.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:279:1: ( ruleEString EOF )
            // InternalInfluenceDSL.g:280:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalInfluenceDSL.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalInfluenceDSL.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalInfluenceDSL.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalInfluenceDSL.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalInfluenceDSL.g:294:3: ( rule__EString__Alternatives )
            // InternalInfluenceDSL.g:294:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSystemResponse"
    // InternalInfluenceDSL.g:303:1: entryRuleSystemResponse : ruleSystemResponse EOF ;
    public final void entryRuleSystemResponse() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:304:1: ( ruleSystemResponse EOF )
            // InternalInfluenceDSL.g:305:1: ruleSystemResponse EOF
            {
             before(grammarAccess.getSystemResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getSystemResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemResponse"


    // $ANTLR start "ruleSystemResponse"
    // InternalInfluenceDSL.g:312:1: ruleSystemResponse : ( ( rule__SystemResponse__Group__0 ) ) ;
    public final void ruleSystemResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:316:2: ( ( ( rule__SystemResponse__Group__0 ) ) )
            // InternalInfluenceDSL.g:317:2: ( ( rule__SystemResponse__Group__0 ) )
            {
            // InternalInfluenceDSL.g:317:2: ( ( rule__SystemResponse__Group__0 ) )
            // InternalInfluenceDSL.g:318:3: ( rule__SystemResponse__Group__0 )
            {
             before(grammarAccess.getSystemResponseAccess().getGroup()); 
            // InternalInfluenceDSL.g:319:3: ( rule__SystemResponse__Group__0 )
            // InternalInfluenceDSL.g:319:4: rule__SystemResponse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemResponse"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInfluenceDSL.g:328:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:329:1: ( ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:330:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalInfluenceDSL.g:337:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:341:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalInfluenceDSL.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalInfluenceDSL.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalInfluenceDSL.g:343:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalInfluenceDSL.g:344:3: ( rule__QualifiedName__Group__0 )
            // InternalInfluenceDSL.g:344:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__InfluenceModel__Alternatives_3"
    // InternalInfluenceDSL.g:352:1: rule__InfluenceModel__Alternatives_3 : ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) );
    public final void rule__InfluenceModel__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:356:1: ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 14:
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalInfluenceDSL.g:357:2: ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) )
                    {
                    // InternalInfluenceDSL.g:357:2: ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) )
                    // InternalInfluenceDSL.g:358:3: ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsAssignment_3_0()); 
                    // InternalInfluenceDSL.g:359:3: ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 )
                    // InternalInfluenceDSL.g:359:4: rule__InfluenceModel__OwnedArtifactsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfluenceModel__OwnedArtifactsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:363:2: ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) )
                    {
                    // InternalInfluenceDSL.g:363:2: ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) )
                    // InternalInfluenceDSL.g:364:3: ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsAssignment_3_1()); 
                    // InternalInfluenceDSL.g:365:3: ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 )
                    // InternalInfluenceDSL.g:365:4: rule__InfluenceModel__OwnedRequirementsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfluenceModel__OwnedRequirementsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:369:2: ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) )
                    {
                    // InternalInfluenceDSL.g:369:2: ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) )
                    // InternalInfluenceDSL.g:370:3: ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedPhysicalPhenomenaAssignment_3_2()); 
                    // InternalInfluenceDSL.g:371:3: ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 )
                    // InternalInfluenceDSL.g:371:4: rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceModelAccess().getOwnedPhysicalPhenomenaAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfluenceDSL.g:375:2: ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) )
                    {
                    // InternalInfluenceDSL.g:375:2: ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) )
                    // InternalInfluenceDSL.g:376:3: ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAssignment_3_3()); 
                    // InternalInfluenceDSL.g:377:3: ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 )
                    // InternalInfluenceDSL.g:377:4: rule__InfluenceModel__OwnedInfluencesAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfluenceModel__OwnedInfluencesAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAssignment_3_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Alternatives_3"


    // $ANTLR start "rule__AbstractInfluence__Alternatives"
    // InternalInfluenceDSL.g:385:1: rule__AbstractInfluence__Alternatives : ( ( ruleInfluence ) | ( ruleCompositeInfluence ) );
    public final void rule__AbstractInfluence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:389:1: ( ( ruleInfluence ) | ( ruleCompositeInfluence ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalInfluenceDSL.g:390:2: ( ruleInfluence )
                    {
                    // InternalInfluenceDSL.g:390:2: ( ruleInfluence )
                    // InternalInfluenceDSL.g:391:3: ruleInfluence
                    {
                     before(grammarAccess.getAbstractInfluenceAccess().getInfluenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInfluence();

                    state._fsp--;

                     after(grammarAccess.getAbstractInfluenceAccess().getInfluenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:396:2: ( ruleCompositeInfluence )
                    {
                    // InternalInfluenceDSL.g:396:2: ( ruleCompositeInfluence )
                    // InternalInfluenceDSL.g:397:3: ruleCompositeInfluence
                    {
                     before(grammarAccess.getAbstractInfluenceAccess().getCompositeInfluenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeInfluence();

                    state._fsp--;

                     after(grammarAccess.getAbstractInfluenceAccess().getCompositeInfluenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInfluence__Alternatives"


    // $ANTLR start "rule__Influence__Alternatives_8"
    // InternalInfluenceDSL.g:406:1: rule__Influence__Alternatives_8 : ( ( ( rule__Influence__Group_8_0__0 ) ) | ( ( rule__Influence__Group_8_1__0 ) ) | ( ( rule__Influence__Group_8_2__0 ) ) );
    public final void rule__Influence__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:410:1: ( ( ( rule__Influence__Group_8_0__0 ) ) | ( ( rule__Influence__Group_8_1__0 ) ) | ( ( rule__Influence__Group_8_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalInfluenceDSL.g:411:2: ( ( rule__Influence__Group_8_0__0 ) )
                    {
                    // InternalInfluenceDSL.g:411:2: ( ( rule__Influence__Group_8_0__0 ) )
                    // InternalInfluenceDSL.g:412:3: ( rule__Influence__Group_8_0__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_8_0()); 
                    // InternalInfluenceDSL.g:413:3: ( rule__Influence__Group_8_0__0 )
                    // InternalInfluenceDSL.g:413:4: rule__Influence__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_8_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceAccess().getGroup_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:417:2: ( ( rule__Influence__Group_8_1__0 ) )
                    {
                    // InternalInfluenceDSL.g:417:2: ( ( rule__Influence__Group_8_1__0 ) )
                    // InternalInfluenceDSL.g:418:3: ( rule__Influence__Group_8_1__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_8_1()); 
                    // InternalInfluenceDSL.g:419:3: ( rule__Influence__Group_8_1__0 )
                    // InternalInfluenceDSL.g:419:4: rule__Influence__Group_8_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_8_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceAccess().getGroup_8_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:423:2: ( ( rule__Influence__Group_8_2__0 ) )
                    {
                    // InternalInfluenceDSL.g:423:2: ( ( rule__Influence__Group_8_2__0 ) )
                    // InternalInfluenceDSL.g:424:3: ( rule__Influence__Group_8_2__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_8_2()); 
                    // InternalInfluenceDSL.g:425:3: ( rule__Influence__Group_8_2__0 )
                    // InternalInfluenceDSL.g:425:4: rule__Influence__Group_8_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_8_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceAccess().getGroup_8_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Alternatives_8"


    // $ANTLR start "rule__Influence__Alternatives_9_1"
    // InternalInfluenceDSL.g:433:1: rule__Influence__Alternatives_9_1 : ( ( ( rule__Influence__Group_9_1_0__0 ) ) | ( ( rule__Influence__Group_9_1_1__0 ) ) | ( ( rule__Influence__Group_9_1_2__0 ) ) );
    public final void rule__Influence__Alternatives_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:437:1: ( ( ( rule__Influence__Group_9_1_0__0 ) ) | ( ( rule__Influence__Group_9_1_1__0 ) ) | ( ( rule__Influence__Group_9_1_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalInfluenceDSL.g:438:2: ( ( rule__Influence__Group_9_1_0__0 ) )
                    {
                    // InternalInfluenceDSL.g:438:2: ( ( rule__Influence__Group_9_1_0__0 ) )
                    // InternalInfluenceDSL.g:439:3: ( rule__Influence__Group_9_1_0__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_9_1_0()); 
                    // InternalInfluenceDSL.g:440:3: ( rule__Influence__Group_9_1_0__0 )
                    // InternalInfluenceDSL.g:440:4: rule__Influence__Group_9_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_9_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceAccess().getGroup_9_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:444:2: ( ( rule__Influence__Group_9_1_1__0 ) )
                    {
                    // InternalInfluenceDSL.g:444:2: ( ( rule__Influence__Group_9_1_1__0 ) )
                    // InternalInfluenceDSL.g:445:3: ( rule__Influence__Group_9_1_1__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_9_1_1()); 
                    // InternalInfluenceDSL.g:446:3: ( rule__Influence__Group_9_1_1__0 )
                    // InternalInfluenceDSL.g:446:4: rule__Influence__Group_9_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_9_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceAccess().getGroup_9_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:450:2: ( ( rule__Influence__Group_9_1_2__0 ) )
                    {
                    // InternalInfluenceDSL.g:450:2: ( ( rule__Influence__Group_9_1_2__0 ) )
                    // InternalInfluenceDSL.g:451:3: ( rule__Influence__Group_9_1_2__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_9_1_2()); 
                    // InternalInfluenceDSL.g:452:3: ( rule__Influence__Group_9_1_2__0 )
                    // InternalInfluenceDSL.g:452:4: rule__Influence__Group_9_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_9_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceAccess().getGroup_9_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Alternatives_9_1"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalInfluenceDSL.g:460:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:464:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalInfluenceDSL.g:465:2: ( RULE_STRING )
                    {
                    // InternalInfluenceDSL.g:465:2: ( RULE_STRING )
                    // InternalInfluenceDSL.g:466:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:471:2: ( RULE_ID )
                    {
                    // InternalInfluenceDSL.g:471:2: ( RULE_ID )
                    // InternalInfluenceDSL.g:472:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__InfluenceModel__Group__0"
    // InternalInfluenceDSL.g:481:1: rule__InfluenceModel__Group__0 : rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 ;
    public final void rule__InfluenceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:485:1: ( rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 )
            // InternalInfluenceDSL.g:486:2: rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InfluenceModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InfluenceModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__0"


    // $ANTLR start "rule__InfluenceModel__Group__0__Impl"
    // InternalInfluenceDSL.g:493:1: rule__InfluenceModel__Group__0__Impl : ( () ) ;
    public final void rule__InfluenceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:497:1: ( ( () ) )
            // InternalInfluenceDSL.g:498:1: ( () )
            {
            // InternalInfluenceDSL.g:498:1: ( () )
            // InternalInfluenceDSL.g:499:2: ()
            {
             before(grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0()); 
            // InternalInfluenceDSL.g:500:2: ()
            // InternalInfluenceDSL.g:500:3: 
            {
            }

             after(grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__0__Impl"


    // $ANTLR start "rule__InfluenceModel__Group__1"
    // InternalInfluenceDSL.g:508:1: rule__InfluenceModel__Group__1 : rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 ;
    public final void rule__InfluenceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:512:1: ( rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 )
            // InternalInfluenceDSL.g:513:2: rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InfluenceModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InfluenceModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__1"


    // $ANTLR start "rule__InfluenceModel__Group__1__Impl"
    // InternalInfluenceDSL.g:520:1: rule__InfluenceModel__Group__1__Impl : ( 'InfluenceModel' ) ;
    public final void rule__InfluenceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:524:1: ( ( 'InfluenceModel' ) )
            // InternalInfluenceDSL.g:525:1: ( 'InfluenceModel' )
            {
            // InternalInfluenceDSL.g:525:1: ( 'InfluenceModel' )
            // InternalInfluenceDSL.g:526:2: 'InfluenceModel'
            {
             before(grammarAccess.getInfluenceModelAccess().getInfluenceModelKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInfluenceModelAccess().getInfluenceModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__1__Impl"


    // $ANTLR start "rule__InfluenceModel__Group__2"
    // InternalInfluenceDSL.g:535:1: rule__InfluenceModel__Group__2 : rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 ;
    public final void rule__InfluenceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:539:1: ( rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 )
            // InternalInfluenceDSL.g:540:2: rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InfluenceModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InfluenceModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__2"


    // $ANTLR start "rule__InfluenceModel__Group__2__Impl"
    // InternalInfluenceDSL.g:547:1: rule__InfluenceModel__Group__2__Impl : ( ( rule__InfluenceModel__NameAssignment_2 ) ) ;
    public final void rule__InfluenceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:551:1: ( ( ( rule__InfluenceModel__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:552:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:552:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:553:2: ( rule__InfluenceModel__NameAssignment_2 )
            {
             before(grammarAccess.getInfluenceModelAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:554:2: ( rule__InfluenceModel__NameAssignment_2 )
            // InternalInfluenceDSL.g:554:3: rule__InfluenceModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InfluenceModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__2__Impl"


    // $ANTLR start "rule__InfluenceModel__Group__3"
    // InternalInfluenceDSL.g:562:1: rule__InfluenceModel__Group__3 : rule__InfluenceModel__Group__3__Impl ;
    public final void rule__InfluenceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:566:1: ( rule__InfluenceModel__Group__3__Impl )
            // InternalInfluenceDSL.g:567:2: rule__InfluenceModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfluenceModel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__3"


    // $ANTLR start "rule__InfluenceModel__Group__3__Impl"
    // InternalInfluenceDSL.g:573:1: rule__InfluenceModel__Group__3__Impl : ( ( rule__InfluenceModel__Alternatives_3 )* ) ;
    public final void rule__InfluenceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:577:1: ( ( ( rule__InfluenceModel__Alternatives_3 )* ) )
            // InternalInfluenceDSL.g:578:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            {
            // InternalInfluenceDSL.g:578:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            // InternalInfluenceDSL.g:579:2: ( rule__InfluenceModel__Alternatives_3 )*
            {
             before(grammarAccess.getInfluenceModelAccess().getAlternatives_3()); 
            // InternalInfluenceDSL.g:580:2: ( rule__InfluenceModel__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)||(LA6_0>=35 && LA6_0<=36)||LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInfluenceDSL.g:580:3: rule__InfluenceModel__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__InfluenceModel__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInfluenceModelAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__Group__3__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__0"
    // InternalInfluenceDSL.g:589:1: rule__CompositeInfluence__Group__0 : rule__CompositeInfluence__Group__0__Impl rule__CompositeInfluence__Group__1 ;
    public final void rule__CompositeInfluence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:593:1: ( rule__CompositeInfluence__Group__0__Impl rule__CompositeInfluence__Group__1 )
            // InternalInfluenceDSL.g:594:2: rule__CompositeInfluence__Group__0__Impl rule__CompositeInfluence__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CompositeInfluence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__0"


    // $ANTLR start "rule__CompositeInfluence__Group__0__Impl"
    // InternalInfluenceDSL.g:601:1: rule__CompositeInfluence__Group__0__Impl : ( 'Composite' ) ;
    public final void rule__CompositeInfluence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:605:1: ( ( 'Composite' ) )
            // InternalInfluenceDSL.g:606:1: ( 'Composite' )
            {
            // InternalInfluenceDSL.g:606:1: ( 'Composite' )
            // InternalInfluenceDSL.g:607:2: 'Composite'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getCompositeKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getCompositeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__0__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__1"
    // InternalInfluenceDSL.g:616:1: rule__CompositeInfluence__Group__1 : rule__CompositeInfluence__Group__1__Impl rule__CompositeInfluence__Group__2 ;
    public final void rule__CompositeInfluence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:620:1: ( rule__CompositeInfluence__Group__1__Impl rule__CompositeInfluence__Group__2 )
            // InternalInfluenceDSL.g:621:2: rule__CompositeInfluence__Group__1__Impl rule__CompositeInfluence__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeInfluence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__1"


    // $ANTLR start "rule__CompositeInfluence__Group__1__Impl"
    // InternalInfluenceDSL.g:628:1: rule__CompositeInfluence__Group__1__Impl : ( 'Influence' ) ;
    public final void rule__CompositeInfluence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:632:1: ( ( 'Influence' ) )
            // InternalInfluenceDSL.g:633:1: ( 'Influence' )
            {
            // InternalInfluenceDSL.g:633:1: ( 'Influence' )
            // InternalInfluenceDSL.g:634:2: 'Influence'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInfluenceKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getInfluenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__1__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__2"
    // InternalInfluenceDSL.g:643:1: rule__CompositeInfluence__Group__2 : rule__CompositeInfluence__Group__2__Impl rule__CompositeInfluence__Group__3 ;
    public final void rule__CompositeInfluence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:647:1: ( rule__CompositeInfluence__Group__2__Impl rule__CompositeInfluence__Group__3 )
            // InternalInfluenceDSL.g:648:2: rule__CompositeInfluence__Group__2__Impl rule__CompositeInfluence__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CompositeInfluence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__2"


    // $ANTLR start "rule__CompositeInfluence__Group__2__Impl"
    // InternalInfluenceDSL.g:655:1: rule__CompositeInfluence__Group__2__Impl : ( ( rule__CompositeInfluence__NameAssignment_2 ) ) ;
    public final void rule__CompositeInfluence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:659:1: ( ( ( rule__CompositeInfluence__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:660:1: ( ( rule__CompositeInfluence__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:660:1: ( ( rule__CompositeInfluence__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:661:2: ( rule__CompositeInfluence__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:662:2: ( rule__CompositeInfluence__NameAssignment_2 )
            // InternalInfluenceDSL.g:662:3: rule__CompositeInfluence__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__2__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__3"
    // InternalInfluenceDSL.g:670:1: rule__CompositeInfluence__Group__3 : rule__CompositeInfluence__Group__3__Impl rule__CompositeInfluence__Group__4 ;
    public final void rule__CompositeInfluence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:674:1: ( rule__CompositeInfluence__Group__3__Impl rule__CompositeInfluence__Group__4 )
            // InternalInfluenceDSL.g:675:2: rule__CompositeInfluence__Group__3__Impl rule__CompositeInfluence__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__CompositeInfluence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__3"


    // $ANTLR start "rule__CompositeInfluence__Group__3__Impl"
    // InternalInfluenceDSL.g:682:1: rule__CompositeInfluence__Group__3__Impl : ( '#**' ) ;
    public final void rule__CompositeInfluence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:686:1: ( ( '#**' ) )
            // InternalInfluenceDSL.g:687:1: ( '#**' )
            {
            // InternalInfluenceDSL.g:687:1: ( '#**' )
            // InternalInfluenceDSL.g:688:2: '#**'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__3__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__4"
    // InternalInfluenceDSL.g:697:1: rule__CompositeInfluence__Group__4 : rule__CompositeInfluence__Group__4__Impl rule__CompositeInfluence__Group__5 ;
    public final void rule__CompositeInfluence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:701:1: ( rule__CompositeInfluence__Group__4__Impl rule__CompositeInfluence__Group__5 )
            // InternalInfluenceDSL.g:702:2: rule__CompositeInfluence__Group__4__Impl rule__CompositeInfluence__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__CompositeInfluence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__4"


    // $ANTLR start "rule__CompositeInfluence__Group__4__Impl"
    // InternalInfluenceDSL.g:709:1: rule__CompositeInfluence__Group__4__Impl : ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) ) ;
    public final void rule__CompositeInfluence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:713:1: ( ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) ) )
            // InternalInfluenceDSL.g:714:1: ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) )
            {
            // InternalInfluenceDSL.g:714:1: ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) )
            // InternalInfluenceDSL.g:715:2: ( rule__CompositeInfluence__DescriptionAssignment_4 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getDescriptionAssignment_4()); 
            // InternalInfluenceDSL.g:716:2: ( rule__CompositeInfluence__DescriptionAssignment_4 )
            // InternalInfluenceDSL.g:716:3: rule__CompositeInfluence__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__4__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__5"
    // InternalInfluenceDSL.g:724:1: rule__CompositeInfluence__Group__5 : rule__CompositeInfluence__Group__5__Impl rule__CompositeInfluence__Group__6 ;
    public final void rule__CompositeInfluence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:728:1: ( rule__CompositeInfluence__Group__5__Impl rule__CompositeInfluence__Group__6 )
            // InternalInfluenceDSL.g:729:2: rule__CompositeInfluence__Group__5__Impl rule__CompositeInfluence__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__CompositeInfluence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__5"


    // $ANTLR start "rule__CompositeInfluence__Group__5__Impl"
    // InternalInfluenceDSL.g:736:1: rule__CompositeInfluence__Group__5__Impl : ( ( rule__CompositeInfluence__Group_5__0 )* ) ;
    public final void rule__CompositeInfluence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:740:1: ( ( ( rule__CompositeInfluence__Group_5__0 )* ) )
            // InternalInfluenceDSL.g:741:1: ( ( rule__CompositeInfluence__Group_5__0 )* )
            {
            // InternalInfluenceDSL.g:741:1: ( ( rule__CompositeInfluence__Group_5__0 )* )
            // InternalInfluenceDSL.g:742:2: ( rule__CompositeInfluence__Group_5__0 )*
            {
             before(grammarAccess.getCompositeInfluenceAccess().getGroup_5()); 
            // InternalInfluenceDSL.g:743:2: ( rule__CompositeInfluence__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInfluenceDSL.g:743:3: rule__CompositeInfluence__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeInfluence__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCompositeInfluenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__5__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__6"
    // InternalInfluenceDSL.g:751:1: rule__CompositeInfluence__Group__6 : rule__CompositeInfluence__Group__6__Impl rule__CompositeInfluence__Group__7 ;
    public final void rule__CompositeInfluence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:755:1: ( rule__CompositeInfluence__Group__6__Impl rule__CompositeInfluence__Group__7 )
            // InternalInfluenceDSL.g:756:2: rule__CompositeInfluence__Group__6__Impl rule__CompositeInfluence__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__CompositeInfluence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__6"


    // $ANTLR start "rule__CompositeInfluence__Group__6__Impl"
    // InternalInfluenceDSL.g:763:1: rule__CompositeInfluence__Group__6__Impl : ( ( '**#' )? ) ;
    public final void rule__CompositeInfluence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:767:1: ( ( ( '**#' )? ) )
            // InternalInfluenceDSL.g:768:1: ( ( '**#' )? )
            {
            // InternalInfluenceDSL.g:768:1: ( ( '**#' )? )
            // InternalInfluenceDSL.g:769:2: ( '**#' )?
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_6()); 
            // InternalInfluenceDSL.g:770:2: ( '**#' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:770:3: '**#'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCompositeInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__6__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__7"
    // InternalInfluenceDSL.g:778:1: rule__CompositeInfluence__Group__7 : rule__CompositeInfluence__Group__7__Impl rule__CompositeInfluence__Group__8 ;
    public final void rule__CompositeInfluence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:782:1: ( rule__CompositeInfluence__Group__7__Impl rule__CompositeInfluence__Group__8 )
            // InternalInfluenceDSL.g:783:2: rule__CompositeInfluence__Group__7__Impl rule__CompositeInfluence__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__CompositeInfluence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__7"


    // $ANTLR start "rule__CompositeInfluence__Group__7__Impl"
    // InternalInfluenceDSL.g:790:1: rule__CompositeInfluence__Group__7__Impl : ( 'encapsulate' ) ;
    public final void rule__CompositeInfluence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:794:1: ( ( 'encapsulate' ) )
            // InternalInfluenceDSL.g:795:1: ( 'encapsulate' )
            {
            // InternalInfluenceDSL.g:795:1: ( 'encapsulate' )
            // InternalInfluenceDSL.g:796:2: 'encapsulate'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getEncapsulateKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getEncapsulateKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__7__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__8"
    // InternalInfluenceDSL.g:805:1: rule__CompositeInfluence__Group__8 : rule__CompositeInfluence__Group__8__Impl rule__CompositeInfluence__Group__9 ;
    public final void rule__CompositeInfluence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:809:1: ( rule__CompositeInfluence__Group__8__Impl rule__CompositeInfluence__Group__9 )
            // InternalInfluenceDSL.g:810:2: rule__CompositeInfluence__Group__8__Impl rule__CompositeInfluence__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__CompositeInfluence__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__8"


    // $ANTLR start "rule__CompositeInfluence__Group__8__Impl"
    // InternalInfluenceDSL.g:817:1: rule__CompositeInfluence__Group__8__Impl : ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* ) ;
    public final void rule__CompositeInfluence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:821:1: ( ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* ) )
            // InternalInfluenceDSL.g:822:1: ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* )
            {
            // InternalInfluenceDSL.g:822:1: ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* )
            // InternalInfluenceDSL.g:823:2: ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )*
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAssignment_8()); 
            // InternalInfluenceDSL.g:824:2: ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInfluenceDSL.g:824:3: rule__CompositeInfluence__InternalInfluencesAssignment_8
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CompositeInfluence__InternalInfluencesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__8__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__9"
    // InternalInfluenceDSL.g:832:1: rule__CompositeInfluence__Group__9 : rule__CompositeInfluence__Group__9__Impl rule__CompositeInfluence__Group__10 ;
    public final void rule__CompositeInfluence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:836:1: ( rule__CompositeInfluence__Group__9__Impl rule__CompositeInfluence__Group__10 )
            // InternalInfluenceDSL.g:837:2: rule__CompositeInfluence__Group__9__Impl rule__CompositeInfluence__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__CompositeInfluence__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__9"


    // $ANTLR start "rule__CompositeInfluence__Group__9__Impl"
    // InternalInfluenceDSL.g:844:1: rule__CompositeInfluence__Group__9__Impl : ( ( rule__CompositeInfluence__OwnedFunctionAssignment_9 ) ) ;
    public final void rule__CompositeInfluence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:848:1: ( ( ( rule__CompositeInfluence__OwnedFunctionAssignment_9 ) ) )
            // InternalInfluenceDSL.g:849:1: ( ( rule__CompositeInfluence__OwnedFunctionAssignment_9 ) )
            {
            // InternalInfluenceDSL.g:849:1: ( ( rule__CompositeInfluence__OwnedFunctionAssignment_9 ) )
            // InternalInfluenceDSL.g:850:2: ( rule__CompositeInfluence__OwnedFunctionAssignment_9 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getOwnedFunctionAssignment_9()); 
            // InternalInfluenceDSL.g:851:2: ( rule__CompositeInfluence__OwnedFunctionAssignment_9 )
            // InternalInfluenceDSL.g:851:3: rule__CompositeInfluence__OwnedFunctionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__OwnedFunctionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getOwnedFunctionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__9__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__10"
    // InternalInfluenceDSL.g:859:1: rule__CompositeInfluence__Group__10 : rule__CompositeInfluence__Group__10__Impl rule__CompositeInfluence__Group__11 ;
    public final void rule__CompositeInfluence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:863:1: ( rule__CompositeInfluence__Group__10__Impl rule__CompositeInfluence__Group__11 )
            // InternalInfluenceDSL.g:864:2: rule__CompositeInfluence__Group__10__Impl rule__CompositeInfluence__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__CompositeInfluence__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__10"


    // $ANTLR start "rule__CompositeInfluence__Group__10__Impl"
    // InternalInfluenceDSL.g:871:1: rule__CompositeInfluence__Group__10__Impl : ( 'affects' ) ;
    public final void rule__CompositeInfluence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:875:1: ( ( 'affects' ) )
            // InternalInfluenceDSL.g:876:1: ( 'affects' )
            {
            // InternalInfluenceDSL.g:876:1: ( 'affects' )
            // InternalInfluenceDSL.g:877:2: 'affects'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getAffectsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__10__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__11"
    // InternalInfluenceDSL.g:886:1: rule__CompositeInfluence__Group__11 : rule__CompositeInfluence__Group__11__Impl rule__CompositeInfluence__Group__12 ;
    public final void rule__CompositeInfluence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:890:1: ( rule__CompositeInfluence__Group__11__Impl rule__CompositeInfluence__Group__12 )
            // InternalInfluenceDSL.g:891:2: rule__CompositeInfluence__Group__11__Impl rule__CompositeInfluence__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__CompositeInfluence__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__11"


    // $ANTLR start "rule__CompositeInfluence__Group__11__Impl"
    // InternalInfluenceDSL.g:898:1: rule__CompositeInfluence__Group__11__Impl : ( ( rule__CompositeInfluence__AffectsAssignment_11 ) ) ;
    public final void rule__CompositeInfluence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:902:1: ( ( ( rule__CompositeInfluence__AffectsAssignment_11 ) ) )
            // InternalInfluenceDSL.g:903:1: ( ( rule__CompositeInfluence__AffectsAssignment_11 ) )
            {
            // InternalInfluenceDSL.g:903:1: ( ( rule__CompositeInfluence__AffectsAssignment_11 ) )
            // InternalInfluenceDSL.g:904:2: ( rule__CompositeInfluence__AffectsAssignment_11 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_11()); 
            // InternalInfluenceDSL.g:905:2: ( rule__CompositeInfluence__AffectsAssignment_11 )
            // InternalInfluenceDSL.g:905:3: rule__CompositeInfluence__AffectsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__AffectsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__11__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group__12"
    // InternalInfluenceDSL.g:913:1: rule__CompositeInfluence__Group__12 : rule__CompositeInfluence__Group__12__Impl ;
    public final void rule__CompositeInfluence__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:917:1: ( rule__CompositeInfluence__Group__12__Impl )
            // InternalInfluenceDSL.g:918:2: rule__CompositeInfluence__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__12"


    // $ANTLR start "rule__CompositeInfluence__Group__12__Impl"
    // InternalInfluenceDSL.g:924:1: rule__CompositeInfluence__Group__12__Impl : ( ( rule__CompositeInfluence__Group_12__0 )* ) ;
    public final void rule__CompositeInfluence__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:928:1: ( ( ( rule__CompositeInfluence__Group_12__0 )* ) )
            // InternalInfluenceDSL.g:929:1: ( ( rule__CompositeInfluence__Group_12__0 )* )
            {
            // InternalInfluenceDSL.g:929:1: ( ( rule__CompositeInfluence__Group_12__0 )* )
            // InternalInfluenceDSL.g:930:2: ( rule__CompositeInfluence__Group_12__0 )*
            {
             before(grammarAccess.getCompositeInfluenceAccess().getGroup_12()); 
            // InternalInfluenceDSL.g:931:2: ( rule__CompositeInfluence__Group_12__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInfluenceDSL.g:931:3: rule__CompositeInfluence__Group_12__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CompositeInfluence__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompositeInfluenceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group__12__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group_5__0"
    // InternalInfluenceDSL.g:940:1: rule__CompositeInfluence__Group_5__0 : rule__CompositeInfluence__Group_5__0__Impl rule__CompositeInfluence__Group_5__1 ;
    public final void rule__CompositeInfluence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:944:1: ( rule__CompositeInfluence__Group_5__0__Impl rule__CompositeInfluence__Group_5__1 )
            // InternalInfluenceDSL.g:945:2: rule__CompositeInfluence__Group_5__0__Impl rule__CompositeInfluence__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__CompositeInfluence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_5__0"


    // $ANTLR start "rule__CompositeInfluence__Group_5__0__Impl"
    // InternalInfluenceDSL.g:952:1: rule__CompositeInfluence__Group_5__0__Impl : ( ',' ) ;
    public final void rule__CompositeInfluence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:956:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:957:1: ( ',' )
            {
            // InternalInfluenceDSL.g:957:1: ( ',' )
            // InternalInfluenceDSL.g:958:2: ','
            {
             before(grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_5__0__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group_5__1"
    // InternalInfluenceDSL.g:967:1: rule__CompositeInfluence__Group_5__1 : rule__CompositeInfluence__Group_5__1__Impl ;
    public final void rule__CompositeInfluence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:971:1: ( rule__CompositeInfluence__Group_5__1__Impl )
            // InternalInfluenceDSL.g:972:2: rule__CompositeInfluence__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_5__1"


    // $ANTLR start "rule__CompositeInfluence__Group_5__1__Impl"
    // InternalInfluenceDSL.g:978:1: rule__CompositeInfluence__Group_5__1__Impl : ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CompositeInfluence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:982:1: ( ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) ) )
            // InternalInfluenceDSL.g:983:1: ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) )
            {
            // InternalInfluenceDSL.g:983:1: ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) )
            // InternalInfluenceDSL.g:984:2: ( rule__CompositeInfluence__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getDescriptionAssignment_5_1()); 
            // InternalInfluenceDSL.g:985:2: ( rule__CompositeInfluence__DescriptionAssignment_5_1 )
            // InternalInfluenceDSL.g:985:3: rule__CompositeInfluence__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group_12__0"
    // InternalInfluenceDSL.g:994:1: rule__CompositeInfluence__Group_12__0 : rule__CompositeInfluence__Group_12__0__Impl rule__CompositeInfluence__Group_12__1 ;
    public final void rule__CompositeInfluence__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:998:1: ( rule__CompositeInfluence__Group_12__0__Impl rule__CompositeInfluence__Group_12__1 )
            // InternalInfluenceDSL.g:999:2: rule__CompositeInfluence__Group_12__0__Impl rule__CompositeInfluence__Group_12__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeInfluence__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_12__0"


    // $ANTLR start "rule__CompositeInfluence__Group_12__0__Impl"
    // InternalInfluenceDSL.g:1006:1: rule__CompositeInfluence__Group_12__0__Impl : ( 'and' ) ;
    public final void rule__CompositeInfluence__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1010:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:1011:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:1011:1: ( 'and' )
            // InternalInfluenceDSL.g:1012:2: 'and'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAndKeyword_12_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getAndKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_12__0__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group_12__1"
    // InternalInfluenceDSL.g:1021:1: rule__CompositeInfluence__Group_12__1 : rule__CompositeInfluence__Group_12__1__Impl ;
    public final void rule__CompositeInfluence__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1025:1: ( rule__CompositeInfluence__Group_12__1__Impl )
            // InternalInfluenceDSL.g:1026:2: rule__CompositeInfluence__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_12__1"


    // $ANTLR start "rule__CompositeInfluence__Group_12__1__Impl"
    // InternalInfluenceDSL.g:1032:1: rule__CompositeInfluence__Group_12__1__Impl : ( ( rule__CompositeInfluence__AffectsAssignment_12_1 ) ) ;
    public final void rule__CompositeInfluence__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1036:1: ( ( ( rule__CompositeInfluence__AffectsAssignment_12_1 ) ) )
            // InternalInfluenceDSL.g:1037:1: ( ( rule__CompositeInfluence__AffectsAssignment_12_1 ) )
            {
            // InternalInfluenceDSL.g:1037:1: ( ( rule__CompositeInfluence__AffectsAssignment_12_1 ) )
            // InternalInfluenceDSL.g:1038:2: ( rule__CompositeInfluence__AffectsAssignment_12_1 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_12_1()); 
            // InternalInfluenceDSL.g:1039:2: ( rule__CompositeInfluence__AffectsAssignment_12_1 )
            // InternalInfluenceDSL.g:1039:3: rule__CompositeInfluence__AffectsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__AffectsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__Group_12__1__Impl"


    // $ANTLR start "rule__Influence__Group__0"
    // InternalInfluenceDSL.g:1048:1: rule__Influence__Group__0 : rule__Influence__Group__0__Impl rule__Influence__Group__1 ;
    public final void rule__Influence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1052:1: ( rule__Influence__Group__0__Impl rule__Influence__Group__1 )
            // InternalInfluenceDSL.g:1053:2: rule__Influence__Group__0__Impl rule__Influence__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__0"


    // $ANTLR start "rule__Influence__Group__0__Impl"
    // InternalInfluenceDSL.g:1060:1: rule__Influence__Group__0__Impl : ( 'Influence' ) ;
    public final void rule__Influence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1064:1: ( ( 'Influence' ) )
            // InternalInfluenceDSL.g:1065:1: ( 'Influence' )
            {
            // InternalInfluenceDSL.g:1065:1: ( 'Influence' )
            // InternalInfluenceDSL.g:1066:2: 'Influence'
            {
             before(grammarAccess.getInfluenceAccess().getInfluenceKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getInfluenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__0__Impl"


    // $ANTLR start "rule__Influence__Group__1"
    // InternalInfluenceDSL.g:1075:1: rule__Influence__Group__1 : rule__Influence__Group__1__Impl rule__Influence__Group__2 ;
    public final void rule__Influence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1079:1: ( rule__Influence__Group__1__Impl rule__Influence__Group__2 )
            // InternalInfluenceDSL.g:1080:2: rule__Influence__Group__1__Impl rule__Influence__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Influence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__1"


    // $ANTLR start "rule__Influence__Group__1__Impl"
    // InternalInfluenceDSL.g:1087:1: rule__Influence__Group__1__Impl : ( ( rule__Influence__NameAssignment_1 ) ) ;
    public final void rule__Influence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1091:1: ( ( ( rule__Influence__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:1092:1: ( ( rule__Influence__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:1092:1: ( ( rule__Influence__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:1093:2: ( rule__Influence__NameAssignment_1 )
            {
             before(grammarAccess.getInfluenceAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:1094:2: ( rule__Influence__NameAssignment_1 )
            // InternalInfluenceDSL.g:1094:3: rule__Influence__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__1__Impl"


    // $ANTLR start "rule__Influence__Group__2"
    // InternalInfluenceDSL.g:1102:1: rule__Influence__Group__2 : rule__Influence__Group__2__Impl rule__Influence__Group__3 ;
    public final void rule__Influence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1106:1: ( rule__Influence__Group__2__Impl rule__Influence__Group__3 )
            // InternalInfluenceDSL.g:1107:2: rule__Influence__Group__2__Impl rule__Influence__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__2"


    // $ANTLR start "rule__Influence__Group__2__Impl"
    // InternalInfluenceDSL.g:1114:1: rule__Influence__Group__2__Impl : ( '#**' ) ;
    public final void rule__Influence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1118:1: ( ( '#**' ) )
            // InternalInfluenceDSL.g:1119:1: ( '#**' )
            {
            // InternalInfluenceDSL.g:1119:1: ( '#**' )
            // InternalInfluenceDSL.g:1120:2: '#**'
            {
             before(grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__2__Impl"


    // $ANTLR start "rule__Influence__Group__3"
    // InternalInfluenceDSL.g:1129:1: rule__Influence__Group__3 : rule__Influence__Group__3__Impl rule__Influence__Group__4 ;
    public final void rule__Influence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1133:1: ( rule__Influence__Group__3__Impl rule__Influence__Group__4 )
            // InternalInfluenceDSL.g:1134:2: rule__Influence__Group__3__Impl rule__Influence__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Influence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__3"


    // $ANTLR start "rule__Influence__Group__3__Impl"
    // InternalInfluenceDSL.g:1141:1: rule__Influence__Group__3__Impl : ( ( rule__Influence__DescriptionAssignment_3 ) ) ;
    public final void rule__Influence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1145:1: ( ( ( rule__Influence__DescriptionAssignment_3 ) ) )
            // InternalInfluenceDSL.g:1146:1: ( ( rule__Influence__DescriptionAssignment_3 ) )
            {
            // InternalInfluenceDSL.g:1146:1: ( ( rule__Influence__DescriptionAssignment_3 ) )
            // InternalInfluenceDSL.g:1147:2: ( rule__Influence__DescriptionAssignment_3 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_3()); 
            // InternalInfluenceDSL.g:1148:2: ( rule__Influence__DescriptionAssignment_3 )
            // InternalInfluenceDSL.g:1148:3: rule__Influence__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Influence__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__3__Impl"


    // $ANTLR start "rule__Influence__Group__4"
    // InternalInfluenceDSL.g:1156:1: rule__Influence__Group__4 : rule__Influence__Group__4__Impl rule__Influence__Group__5 ;
    public final void rule__Influence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1160:1: ( rule__Influence__Group__4__Impl rule__Influence__Group__5 )
            // InternalInfluenceDSL.g:1161:2: rule__Influence__Group__4__Impl rule__Influence__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Influence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__4"


    // $ANTLR start "rule__Influence__Group__4__Impl"
    // InternalInfluenceDSL.g:1168:1: rule__Influence__Group__4__Impl : ( ( rule__Influence__Group_4__0 )* ) ;
    public final void rule__Influence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1172:1: ( ( ( rule__Influence__Group_4__0 )* ) )
            // InternalInfluenceDSL.g:1173:1: ( ( rule__Influence__Group_4__0 )* )
            {
            // InternalInfluenceDSL.g:1173:1: ( ( rule__Influence__Group_4__0 )* )
            // InternalInfluenceDSL.g:1174:2: ( rule__Influence__Group_4__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:1175:2: ( rule__Influence__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1175:3: rule__Influence__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__4__Impl"


    // $ANTLR start "rule__Influence__Group__5"
    // InternalInfluenceDSL.g:1183:1: rule__Influence__Group__5 : rule__Influence__Group__5__Impl rule__Influence__Group__6 ;
    public final void rule__Influence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1187:1: ( rule__Influence__Group__5__Impl rule__Influence__Group__6 )
            // InternalInfluenceDSL.g:1188:2: rule__Influence__Group__5__Impl rule__Influence__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Influence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__5"


    // $ANTLR start "rule__Influence__Group__5__Impl"
    // InternalInfluenceDSL.g:1195:1: rule__Influence__Group__5__Impl : ( ( '**#' )? ) ;
    public final void rule__Influence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1199:1: ( ( ( '**#' )? ) )
            // InternalInfluenceDSL.g:1200:1: ( ( '**#' )? )
            {
            // InternalInfluenceDSL.g:1200:1: ( ( '**#' )? )
            // InternalInfluenceDSL.g:1201:2: ( '**#' )?
            {
             before(grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_5()); 
            // InternalInfluenceDSL.g:1202:2: ( '**#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInfluenceDSL.g:1202:3: '**#'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__5__Impl"


    // $ANTLR start "rule__Influence__Group__6"
    // InternalInfluenceDSL.g:1210:1: rule__Influence__Group__6 : rule__Influence__Group__6__Impl rule__Influence__Group__7 ;
    public final void rule__Influence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1214:1: ( rule__Influence__Group__6__Impl rule__Influence__Group__7 )
            // InternalInfluenceDSL.g:1215:2: rule__Influence__Group__6__Impl rule__Influence__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Influence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__6"


    // $ANTLR start "rule__Influence__Group__6__Impl"
    // InternalInfluenceDSL.g:1222:1: rule__Influence__Group__6__Impl : ( 'originators' ) ;
    public final void rule__Influence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1226:1: ( ( 'originators' ) )
            // InternalInfluenceDSL.g:1227:1: ( 'originators' )
            {
            // InternalInfluenceDSL.g:1227:1: ( 'originators' )
            // InternalInfluenceDSL.g:1228:2: 'originators'
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorsKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getOriginatorsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__6__Impl"


    // $ANTLR start "rule__Influence__Group__7"
    // InternalInfluenceDSL.g:1237:1: rule__Influence__Group__7 : rule__Influence__Group__7__Impl rule__Influence__Group__8 ;
    public final void rule__Influence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1241:1: ( rule__Influence__Group__7__Impl rule__Influence__Group__8 )
            // InternalInfluenceDSL.g:1242:2: rule__Influence__Group__7__Impl rule__Influence__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Influence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__7"


    // $ANTLR start "rule__Influence__Group__7__Impl"
    // InternalInfluenceDSL.g:1249:1: rule__Influence__Group__7__Impl : ( ':' ) ;
    public final void rule__Influence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1253:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:1254:1: ( ':' )
            {
            // InternalInfluenceDSL.g:1254:1: ( ':' )
            // InternalInfluenceDSL.g:1255:2: ':'
            {
             before(grammarAccess.getInfluenceAccess().getColonKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__7__Impl"


    // $ANTLR start "rule__Influence__Group__8"
    // InternalInfluenceDSL.g:1264:1: rule__Influence__Group__8 : rule__Influence__Group__8__Impl rule__Influence__Group__9 ;
    public final void rule__Influence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1268:1: ( rule__Influence__Group__8__Impl rule__Influence__Group__9 )
            // InternalInfluenceDSL.g:1269:2: rule__Influence__Group__8__Impl rule__Influence__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Influence__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__8"


    // $ANTLR start "rule__Influence__Group__8__Impl"
    // InternalInfluenceDSL.g:1276:1: rule__Influence__Group__8__Impl : ( ( rule__Influence__Alternatives_8 ) ) ;
    public final void rule__Influence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1280:1: ( ( ( rule__Influence__Alternatives_8 ) ) )
            // InternalInfluenceDSL.g:1281:1: ( ( rule__Influence__Alternatives_8 ) )
            {
            // InternalInfluenceDSL.g:1281:1: ( ( rule__Influence__Alternatives_8 ) )
            // InternalInfluenceDSL.g:1282:2: ( rule__Influence__Alternatives_8 )
            {
             before(grammarAccess.getInfluenceAccess().getAlternatives_8()); 
            // InternalInfluenceDSL.g:1283:2: ( rule__Influence__Alternatives_8 )
            // InternalInfluenceDSL.g:1283:3: rule__Influence__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__8__Impl"


    // $ANTLR start "rule__Influence__Group__9"
    // InternalInfluenceDSL.g:1291:1: rule__Influence__Group__9 : rule__Influence__Group__9__Impl rule__Influence__Group__10 ;
    public final void rule__Influence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1295:1: ( rule__Influence__Group__9__Impl rule__Influence__Group__10 )
            // InternalInfluenceDSL.g:1296:2: rule__Influence__Group__9__Impl rule__Influence__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Influence__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__9"


    // $ANTLR start "rule__Influence__Group__9__Impl"
    // InternalInfluenceDSL.g:1303:1: rule__Influence__Group__9__Impl : ( ( rule__Influence__Group_9__0 )* ) ;
    public final void rule__Influence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1307:1: ( ( ( rule__Influence__Group_9__0 )* ) )
            // InternalInfluenceDSL.g:1308:1: ( ( rule__Influence__Group_9__0 )* )
            {
            // InternalInfluenceDSL.g:1308:1: ( ( rule__Influence__Group_9__0 )* )
            // InternalInfluenceDSL.g:1309:2: ( rule__Influence__Group_9__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_9()); 
            // InternalInfluenceDSL.g:1310:2: ( rule__Influence__Group_9__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1310:3: rule__Influence__Group_9__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Influence__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__9__Impl"


    // $ANTLR start "rule__Influence__Group__10"
    // InternalInfluenceDSL.g:1318:1: rule__Influence__Group__10 : rule__Influence__Group__10__Impl rule__Influence__Group__11 ;
    public final void rule__Influence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1322:1: ( rule__Influence__Group__10__Impl rule__Influence__Group__11 )
            // InternalInfluenceDSL.g:1323:2: rule__Influence__Group__10__Impl rule__Influence__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Influence__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__10"


    // $ANTLR start "rule__Influence__Group__10__Impl"
    // InternalInfluenceDSL.g:1330:1: rule__Influence__Group__10__Impl : ( ( rule__Influence__Group_10__0 )? ) ;
    public final void rule__Influence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1334:1: ( ( ( rule__Influence__Group_10__0 )? ) )
            // InternalInfluenceDSL.g:1335:1: ( ( rule__Influence__Group_10__0 )? )
            {
            // InternalInfluenceDSL.g:1335:1: ( ( rule__Influence__Group_10__0 )? )
            // InternalInfluenceDSL.g:1336:2: ( rule__Influence__Group_10__0 )?
            {
             before(grammarAccess.getInfluenceAccess().getGroup_10()); 
            // InternalInfluenceDSL.g:1337:2: ( rule__Influence__Group_10__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInfluenceDSL.g:1337:3: rule__Influence__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInfluenceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__10__Impl"


    // $ANTLR start "rule__Influence__Group__11"
    // InternalInfluenceDSL.g:1345:1: rule__Influence__Group__11 : rule__Influence__Group__11__Impl rule__Influence__Group__12 ;
    public final void rule__Influence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1349:1: ( rule__Influence__Group__11__Impl rule__Influence__Group__12 )
            // InternalInfluenceDSL.g:1350:2: rule__Influence__Group__11__Impl rule__Influence__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Influence__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__11"


    // $ANTLR start "rule__Influence__Group__11__Impl"
    // InternalInfluenceDSL.g:1357:1: rule__Influence__Group__11__Impl : ( ( rule__Influence__OwnedFunctionAssignment_11 ) ) ;
    public final void rule__Influence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1361:1: ( ( ( rule__Influence__OwnedFunctionAssignment_11 ) ) )
            // InternalInfluenceDSL.g:1362:1: ( ( rule__Influence__OwnedFunctionAssignment_11 ) )
            {
            // InternalInfluenceDSL.g:1362:1: ( ( rule__Influence__OwnedFunctionAssignment_11 ) )
            // InternalInfluenceDSL.g:1363:2: ( rule__Influence__OwnedFunctionAssignment_11 )
            {
             before(grammarAccess.getInfluenceAccess().getOwnedFunctionAssignment_11()); 
            // InternalInfluenceDSL.g:1364:2: ( rule__Influence__OwnedFunctionAssignment_11 )
            // InternalInfluenceDSL.g:1364:3: rule__Influence__OwnedFunctionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OwnedFunctionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOwnedFunctionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__11__Impl"


    // $ANTLR start "rule__Influence__Group__12"
    // InternalInfluenceDSL.g:1372:1: rule__Influence__Group__12 : rule__Influence__Group__12__Impl rule__Influence__Group__13 ;
    public final void rule__Influence__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1376:1: ( rule__Influence__Group__12__Impl rule__Influence__Group__13 )
            // InternalInfluenceDSL.g:1377:2: rule__Influence__Group__12__Impl rule__Influence__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Influence__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__12"


    // $ANTLR start "rule__Influence__Group__12__Impl"
    // InternalInfluenceDSL.g:1384:1: rule__Influence__Group__12__Impl : ( 'affects' ) ;
    public final void rule__Influence__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1388:1: ( ( 'affects' ) )
            // InternalInfluenceDSL.g:1389:1: ( 'affects' )
            {
            // InternalInfluenceDSL.g:1389:1: ( 'affects' )
            // InternalInfluenceDSL.g:1390:2: 'affects'
            {
             before(grammarAccess.getInfluenceAccess().getAffectsKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAffectsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__12__Impl"


    // $ANTLR start "rule__Influence__Group__13"
    // InternalInfluenceDSL.g:1399:1: rule__Influence__Group__13 : rule__Influence__Group__13__Impl rule__Influence__Group__14 ;
    public final void rule__Influence__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1403:1: ( rule__Influence__Group__13__Impl rule__Influence__Group__14 )
            // InternalInfluenceDSL.g:1404:2: rule__Influence__Group__13__Impl rule__Influence__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Influence__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__13"


    // $ANTLR start "rule__Influence__Group__13__Impl"
    // InternalInfluenceDSL.g:1411:1: rule__Influence__Group__13__Impl : ( ( rule__Influence__AffectsAssignment_13 ) ) ;
    public final void rule__Influence__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1415:1: ( ( ( rule__Influence__AffectsAssignment_13 ) ) )
            // InternalInfluenceDSL.g:1416:1: ( ( rule__Influence__AffectsAssignment_13 ) )
            {
            // InternalInfluenceDSL.g:1416:1: ( ( rule__Influence__AffectsAssignment_13 ) )
            // InternalInfluenceDSL.g:1417:2: ( rule__Influence__AffectsAssignment_13 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_13()); 
            // InternalInfluenceDSL.g:1418:2: ( rule__Influence__AffectsAssignment_13 )
            // InternalInfluenceDSL.g:1418:3: rule__Influence__AffectsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Influence__AffectsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAffectsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__13__Impl"


    // $ANTLR start "rule__Influence__Group__14"
    // InternalInfluenceDSL.g:1426:1: rule__Influence__Group__14 : rule__Influence__Group__14__Impl ;
    public final void rule__Influence__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1430:1: ( rule__Influence__Group__14__Impl )
            // InternalInfluenceDSL.g:1431:2: rule__Influence__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__14"


    // $ANTLR start "rule__Influence__Group__14__Impl"
    // InternalInfluenceDSL.g:1437:1: rule__Influence__Group__14__Impl : ( ( rule__Influence__Group_14__0 )* ) ;
    public final void rule__Influence__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1441:1: ( ( ( rule__Influence__Group_14__0 )* ) )
            // InternalInfluenceDSL.g:1442:1: ( ( rule__Influence__Group_14__0 )* )
            {
            // InternalInfluenceDSL.g:1442:1: ( ( rule__Influence__Group_14__0 )* )
            // InternalInfluenceDSL.g:1443:2: ( rule__Influence__Group_14__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_14()); 
            // InternalInfluenceDSL.g:1444:2: ( rule__Influence__Group_14__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1444:3: rule__Influence__Group_14__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Influence__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__14__Impl"


    // $ANTLR start "rule__Influence__Group_4__0"
    // InternalInfluenceDSL.g:1453:1: rule__Influence__Group_4__0 : rule__Influence__Group_4__0__Impl rule__Influence__Group_4__1 ;
    public final void rule__Influence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1457:1: ( rule__Influence__Group_4__0__Impl rule__Influence__Group_4__1 )
            // InternalInfluenceDSL.g:1458:2: rule__Influence__Group_4__0__Impl rule__Influence__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_4__0"


    // $ANTLR start "rule__Influence__Group_4__0__Impl"
    // InternalInfluenceDSL.g:1465:1: rule__Influence__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1469:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:1470:1: ( ',' )
            {
            // InternalInfluenceDSL.g:1470:1: ( ',' )
            // InternalInfluenceDSL.g:1471:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_4__0__Impl"


    // $ANTLR start "rule__Influence__Group_4__1"
    // InternalInfluenceDSL.g:1480:1: rule__Influence__Group_4__1 : rule__Influence__Group_4__1__Impl ;
    public final void rule__Influence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1484:1: ( rule__Influence__Group_4__1__Impl )
            // InternalInfluenceDSL.g:1485:2: rule__Influence__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_4__1"


    // $ANTLR start "rule__Influence__Group_4__1__Impl"
    // InternalInfluenceDSL.g:1491:1: rule__Influence__Group_4__1__Impl : ( ( rule__Influence__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Influence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1495:1: ( ( ( rule__Influence__DescriptionAssignment_4_1 ) ) )
            // InternalInfluenceDSL.g:1496:1: ( ( rule__Influence__DescriptionAssignment_4_1 ) )
            {
            // InternalInfluenceDSL.g:1496:1: ( ( rule__Influence__DescriptionAssignment_4_1 ) )
            // InternalInfluenceDSL.g:1497:2: ( rule__Influence__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_4_1()); 
            // InternalInfluenceDSL.g:1498:2: ( rule__Influence__DescriptionAssignment_4_1 )
            // InternalInfluenceDSL.g:1498:3: rule__Influence__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_4__1__Impl"


    // $ANTLR start "rule__Influence__Group_8_0__0"
    // InternalInfluenceDSL.g:1507:1: rule__Influence__Group_8_0__0 : rule__Influence__Group_8_0__0__Impl rule__Influence__Group_8_0__1 ;
    public final void rule__Influence__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1511:1: ( rule__Influence__Group_8_0__0__Impl rule__Influence__Group_8_0__1 )
            // InternalInfluenceDSL.g:1512:2: rule__Influence__Group_8_0__0__Impl rule__Influence__Group_8_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_8_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_0__0"


    // $ANTLR start "rule__Influence__Group_8_0__0__Impl"
    // InternalInfluenceDSL.g:1519:1: rule__Influence__Group_8_0__0__Impl : ( 'artifact' ) ;
    public final void rule__Influence__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1523:1: ( ( 'artifact' ) )
            // InternalInfluenceDSL.g:1524:1: ( 'artifact' )
            {
            // InternalInfluenceDSL.g:1524:1: ( 'artifact' )
            // InternalInfluenceDSL.g:1525:2: 'artifact'
            {
             before(grammarAccess.getInfluenceAccess().getArtifactKeyword_8_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getArtifactKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_0__0__Impl"


    // $ANTLR start "rule__Influence__Group_8_0__1"
    // InternalInfluenceDSL.g:1534:1: rule__Influence__Group_8_0__1 : rule__Influence__Group_8_0__1__Impl ;
    public final void rule__Influence__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1538:1: ( rule__Influence__Group_8_0__1__Impl )
            // InternalInfluenceDSL.g:1539:2: rule__Influence__Group_8_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_0__1"


    // $ANTLR start "rule__Influence__Group_8_0__1__Impl"
    // InternalInfluenceDSL.g:1545:1: rule__Influence__Group_8_0__1__Impl : ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) ) ;
    public final void rule__Influence__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1549:1: ( ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) ) )
            // InternalInfluenceDSL.g:1550:1: ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) )
            {
            // InternalInfluenceDSL.g:1550:1: ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) )
            // InternalInfluenceDSL.g:1551:2: ( rule__Influence__OriginatorArtifactAssignment_8_0_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactAssignment_8_0_1()); 
            // InternalInfluenceDSL.g:1552:2: ( rule__Influence__OriginatorArtifactAssignment_8_0_1 )
            // InternalInfluenceDSL.g:1552:3: rule__Influence__OriginatorArtifactAssignment_8_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OriginatorArtifactAssignment_8_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactAssignment_8_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_0__1__Impl"


    // $ANTLR start "rule__Influence__Group_8_1__0"
    // InternalInfluenceDSL.g:1561:1: rule__Influence__Group_8_1__0 : rule__Influence__Group_8_1__0__Impl rule__Influence__Group_8_1__1 ;
    public final void rule__Influence__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1565:1: ( rule__Influence__Group_8_1__0__Impl rule__Influence__Group_8_1__1 )
            // InternalInfluenceDSL.g:1566:2: rule__Influence__Group_8_1__0__Impl rule__Influence__Group_8_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_1__0"


    // $ANTLR start "rule__Influence__Group_8_1__0__Impl"
    // InternalInfluenceDSL.g:1573:1: rule__Influence__Group_8_1__0__Impl : ( 'phenomena' ) ;
    public final void rule__Influence__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1577:1: ( ( 'phenomena' ) )
            // InternalInfluenceDSL.g:1578:1: ( 'phenomena' )
            {
            // InternalInfluenceDSL.g:1578:1: ( 'phenomena' )
            // InternalInfluenceDSL.g:1579:2: 'phenomena'
            {
             before(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_8_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_1__0__Impl"


    // $ANTLR start "rule__Influence__Group_8_1__1"
    // InternalInfluenceDSL.g:1588:1: rule__Influence__Group_8_1__1 : rule__Influence__Group_8_1__1__Impl ;
    public final void rule__Influence__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1592:1: ( rule__Influence__Group_8_1__1__Impl )
            // InternalInfluenceDSL.g:1593:2: rule__Influence__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_1__1"


    // $ANTLR start "rule__Influence__Group_8_1__1__Impl"
    // InternalInfluenceDSL.g:1599:1: rule__Influence__Group_8_1__1__Impl : ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) ) ;
    public final void rule__Influence__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1603:1: ( ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) ) )
            // InternalInfluenceDSL.g:1604:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) )
            {
            // InternalInfluenceDSL.g:1604:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) )
            // InternalInfluenceDSL.g:1605:2: ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaAssignment_8_1_1()); 
            // InternalInfluenceDSL.g:1606:2: ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 )
            // InternalInfluenceDSL.g:1606:3: rule__Influence__OriginatorPhenomenaAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OriginatorPhenomenaAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_1__1__Impl"


    // $ANTLR start "rule__Influence__Group_8_2__0"
    // InternalInfluenceDSL.g:1615:1: rule__Influence__Group_8_2__0 : rule__Influence__Group_8_2__0__Impl rule__Influence__Group_8_2__1 ;
    public final void rule__Influence__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1619:1: ( rule__Influence__Group_8_2__0__Impl rule__Influence__Group_8_2__1 )
            // InternalInfluenceDSL.g:1620:2: rule__Influence__Group_8_2__0__Impl rule__Influence__Group_8_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Influence__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_2__0"


    // $ANTLR start "rule__Influence__Group_8_2__0__Impl"
    // InternalInfluenceDSL.g:1627:1: rule__Influence__Group_8_2__0__Impl : ( 'system' ) ;
    public final void rule__Influence__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1631:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:1632:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:1632:1: ( 'system' )
            // InternalInfluenceDSL.g:1633:2: 'system'
            {
             before(grammarAccess.getInfluenceAccess().getSystemKeyword_8_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getSystemKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_2__0__Impl"


    // $ANTLR start "rule__Influence__Group_8_2__1"
    // InternalInfluenceDSL.g:1642:1: rule__Influence__Group_8_2__1 : rule__Influence__Group_8_2__1__Impl rule__Influence__Group_8_2__2 ;
    public final void rule__Influence__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1646:1: ( rule__Influence__Group_8_2__1__Impl rule__Influence__Group_8_2__2 )
            // InternalInfluenceDSL.g:1647:2: rule__Influence__Group_8_2__1__Impl rule__Influence__Group_8_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_8_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_2__1"


    // $ANTLR start "rule__Influence__Group_8_2__1__Impl"
    // InternalInfluenceDSL.g:1654:1: rule__Influence__Group_8_2__1__Impl : ( 'response' ) ;
    public final void rule__Influence__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1658:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:1659:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:1659:1: ( 'response' )
            // InternalInfluenceDSL.g:1660:2: 'response'
            {
             before(grammarAccess.getInfluenceAccess().getResponseKeyword_8_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getResponseKeyword_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_2__1__Impl"


    // $ANTLR start "rule__Influence__Group_8_2__2"
    // InternalInfluenceDSL.g:1669:1: rule__Influence__Group_8_2__2 : rule__Influence__Group_8_2__2__Impl ;
    public final void rule__Influence__Group_8_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1673:1: ( rule__Influence__Group_8_2__2__Impl )
            // InternalInfluenceDSL.g:1674:2: rule__Influence__Group_8_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_8_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_2__2"


    // $ANTLR start "rule__Influence__Group_8_2__2__Impl"
    // InternalInfluenceDSL.g:1680:1: rule__Influence__Group_8_2__2__Impl : ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) ) ;
    public final void rule__Influence__Group_8_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1684:1: ( ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) ) )
            // InternalInfluenceDSL.g:1685:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) )
            {
            // InternalInfluenceDSL.g:1685:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) )
            // InternalInfluenceDSL.g:1686:2: ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseAssignment_8_2_2()); 
            // InternalInfluenceDSL.g:1687:2: ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 )
            // InternalInfluenceDSL.g:1687:3: rule__Influence__OriginatorSystemResponseAssignment_8_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OriginatorSystemResponseAssignment_8_2_2();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseAssignment_8_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8_2__2__Impl"


    // $ANTLR start "rule__Influence__Group_9__0"
    // InternalInfluenceDSL.g:1696:1: rule__Influence__Group_9__0 : rule__Influence__Group_9__0__Impl rule__Influence__Group_9__1 ;
    public final void rule__Influence__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1700:1: ( rule__Influence__Group_9__0__Impl rule__Influence__Group_9__1 )
            // InternalInfluenceDSL.g:1701:2: rule__Influence__Group_9__0__Impl rule__Influence__Group_9__1
            {
            pushFollow(FOLLOW_19);
            rule__Influence__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9__0"


    // $ANTLR start "rule__Influence__Group_9__0__Impl"
    // InternalInfluenceDSL.g:1708:1: rule__Influence__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__Influence__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1712:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:1713:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:1713:1: ( 'and' )
            // InternalInfluenceDSL.g:1714:2: 'and'
            {
             before(grammarAccess.getInfluenceAccess().getAndKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAndKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9__0__Impl"


    // $ANTLR start "rule__Influence__Group_9__1"
    // InternalInfluenceDSL.g:1723:1: rule__Influence__Group_9__1 : rule__Influence__Group_9__1__Impl ;
    public final void rule__Influence__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1727:1: ( rule__Influence__Group_9__1__Impl )
            // InternalInfluenceDSL.g:1728:2: rule__Influence__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9__1"


    // $ANTLR start "rule__Influence__Group_9__1__Impl"
    // InternalInfluenceDSL.g:1734:1: rule__Influence__Group_9__1__Impl : ( ( rule__Influence__Alternatives_9_1 ) ) ;
    public final void rule__Influence__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1738:1: ( ( ( rule__Influence__Alternatives_9_1 ) ) )
            // InternalInfluenceDSL.g:1739:1: ( ( rule__Influence__Alternatives_9_1 ) )
            {
            // InternalInfluenceDSL.g:1739:1: ( ( rule__Influence__Alternatives_9_1 ) )
            // InternalInfluenceDSL.g:1740:2: ( rule__Influence__Alternatives_9_1 )
            {
             before(grammarAccess.getInfluenceAccess().getAlternatives_9_1()); 
            // InternalInfluenceDSL.g:1741:2: ( rule__Influence__Alternatives_9_1 )
            // InternalInfluenceDSL.g:1741:3: rule__Influence__Alternatives_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Alternatives_9_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAlternatives_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9__1__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_0__0"
    // InternalInfluenceDSL.g:1750:1: rule__Influence__Group_9_1_0__0 : rule__Influence__Group_9_1_0__0__Impl rule__Influence__Group_9_1_0__1 ;
    public final void rule__Influence__Group_9_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1754:1: ( rule__Influence__Group_9_1_0__0__Impl rule__Influence__Group_9_1_0__1 )
            // InternalInfluenceDSL.g:1755:2: rule__Influence__Group_9_1_0__0__Impl rule__Influence__Group_9_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_9_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_0__0"


    // $ANTLR start "rule__Influence__Group_9_1_0__0__Impl"
    // InternalInfluenceDSL.g:1762:1: rule__Influence__Group_9_1_0__0__Impl : ( 'artifact' ) ;
    public final void rule__Influence__Group_9_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1766:1: ( ( 'artifact' ) )
            // InternalInfluenceDSL.g:1767:1: ( 'artifact' )
            {
            // InternalInfluenceDSL.g:1767:1: ( 'artifact' )
            // InternalInfluenceDSL.g:1768:2: 'artifact'
            {
             before(grammarAccess.getInfluenceAccess().getArtifactKeyword_9_1_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getArtifactKeyword_9_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_0__0__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_0__1"
    // InternalInfluenceDSL.g:1777:1: rule__Influence__Group_9_1_0__1 : rule__Influence__Group_9_1_0__1__Impl ;
    public final void rule__Influence__Group_9_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1781:1: ( rule__Influence__Group_9_1_0__1__Impl )
            // InternalInfluenceDSL.g:1782:2: rule__Influence__Group_9_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_0__1"


    // $ANTLR start "rule__Influence__Group_9_1_0__1__Impl"
    // InternalInfluenceDSL.g:1788:1: rule__Influence__Group_9_1_0__1__Impl : ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) ) ;
    public final void rule__Influence__Group_9_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1792:1: ( ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) ) )
            // InternalInfluenceDSL.g:1793:1: ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) )
            {
            // InternalInfluenceDSL.g:1793:1: ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) )
            // InternalInfluenceDSL.g:1794:2: ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactAssignment_9_1_0_1()); 
            // InternalInfluenceDSL.g:1795:2: ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 )
            // InternalInfluenceDSL.g:1795:3: rule__Influence__OriginatorArtifactAssignment_9_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OriginatorArtifactAssignment_9_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactAssignment_9_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_0__1__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_1__0"
    // InternalInfluenceDSL.g:1804:1: rule__Influence__Group_9_1_1__0 : rule__Influence__Group_9_1_1__0__Impl rule__Influence__Group_9_1_1__1 ;
    public final void rule__Influence__Group_9_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1808:1: ( rule__Influence__Group_9_1_1__0__Impl rule__Influence__Group_9_1_1__1 )
            // InternalInfluenceDSL.g:1809:2: rule__Influence__Group_9_1_1__0__Impl rule__Influence__Group_9_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_9_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_1__0"


    // $ANTLR start "rule__Influence__Group_9_1_1__0__Impl"
    // InternalInfluenceDSL.g:1816:1: rule__Influence__Group_9_1_1__0__Impl : ( 'phenomena' ) ;
    public final void rule__Influence__Group_9_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1820:1: ( ( 'phenomena' ) )
            // InternalInfluenceDSL.g:1821:1: ( 'phenomena' )
            {
            // InternalInfluenceDSL.g:1821:1: ( 'phenomena' )
            // InternalInfluenceDSL.g:1822:2: 'phenomena'
            {
             before(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_9_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_9_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_1__0__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_1__1"
    // InternalInfluenceDSL.g:1831:1: rule__Influence__Group_9_1_1__1 : rule__Influence__Group_9_1_1__1__Impl ;
    public final void rule__Influence__Group_9_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1835:1: ( rule__Influence__Group_9_1_1__1__Impl )
            // InternalInfluenceDSL.g:1836:2: rule__Influence__Group_9_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_1__1"


    // $ANTLR start "rule__Influence__Group_9_1_1__1__Impl"
    // InternalInfluenceDSL.g:1842:1: rule__Influence__Group_9_1_1__1__Impl : ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) ) ;
    public final void rule__Influence__Group_9_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1846:1: ( ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) ) )
            // InternalInfluenceDSL.g:1847:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) )
            {
            // InternalInfluenceDSL.g:1847:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) )
            // InternalInfluenceDSL.g:1848:2: ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaAssignment_9_1_1_1()); 
            // InternalInfluenceDSL.g:1849:2: ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 )
            // InternalInfluenceDSL.g:1849:3: rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaAssignment_9_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_1__1__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_2__0"
    // InternalInfluenceDSL.g:1858:1: rule__Influence__Group_9_1_2__0 : rule__Influence__Group_9_1_2__0__Impl rule__Influence__Group_9_1_2__1 ;
    public final void rule__Influence__Group_9_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1862:1: ( rule__Influence__Group_9_1_2__0__Impl rule__Influence__Group_9_1_2__1 )
            // InternalInfluenceDSL.g:1863:2: rule__Influence__Group_9_1_2__0__Impl rule__Influence__Group_9_1_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Influence__Group_9_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_2__0"


    // $ANTLR start "rule__Influence__Group_9_1_2__0__Impl"
    // InternalInfluenceDSL.g:1870:1: rule__Influence__Group_9_1_2__0__Impl : ( 'system' ) ;
    public final void rule__Influence__Group_9_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1874:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:1875:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:1875:1: ( 'system' )
            // InternalInfluenceDSL.g:1876:2: 'system'
            {
             before(grammarAccess.getInfluenceAccess().getSystemKeyword_9_1_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getSystemKeyword_9_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_2__0__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_2__1"
    // InternalInfluenceDSL.g:1885:1: rule__Influence__Group_9_1_2__1 : rule__Influence__Group_9_1_2__1__Impl rule__Influence__Group_9_1_2__2 ;
    public final void rule__Influence__Group_9_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1889:1: ( rule__Influence__Group_9_1_2__1__Impl rule__Influence__Group_9_1_2__2 )
            // InternalInfluenceDSL.g:1890:2: rule__Influence__Group_9_1_2__1__Impl rule__Influence__Group_9_1_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_9_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_2__1"


    // $ANTLR start "rule__Influence__Group_9_1_2__1__Impl"
    // InternalInfluenceDSL.g:1897:1: rule__Influence__Group_9_1_2__1__Impl : ( 'response' ) ;
    public final void rule__Influence__Group_9_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1901:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:1902:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:1902:1: ( 'response' )
            // InternalInfluenceDSL.g:1903:2: 'response'
            {
             before(grammarAccess.getInfluenceAccess().getResponseKeyword_9_1_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getResponseKeyword_9_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_2__1__Impl"


    // $ANTLR start "rule__Influence__Group_9_1_2__2"
    // InternalInfluenceDSL.g:1912:1: rule__Influence__Group_9_1_2__2 : rule__Influence__Group_9_1_2__2__Impl ;
    public final void rule__Influence__Group_9_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1916:1: ( rule__Influence__Group_9_1_2__2__Impl )
            // InternalInfluenceDSL.g:1917:2: rule__Influence__Group_9_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_9_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_2__2"


    // $ANTLR start "rule__Influence__Group_9_1_2__2__Impl"
    // InternalInfluenceDSL.g:1923:1: rule__Influence__Group_9_1_2__2__Impl : ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) ) ;
    public final void rule__Influence__Group_9_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1927:1: ( ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) ) )
            // InternalInfluenceDSL.g:1928:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) )
            {
            // InternalInfluenceDSL.g:1928:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) )
            // InternalInfluenceDSL.g:1929:2: ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseAssignment_9_1_2_2()); 
            // InternalInfluenceDSL.g:1930:2: ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 )
            // InternalInfluenceDSL.g:1930:3: rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseAssignment_9_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_9_1_2__2__Impl"


    // $ANTLR start "rule__Influence__Group_10__0"
    // InternalInfluenceDSL.g:1939:1: rule__Influence__Group_10__0 : rule__Influence__Group_10__0__Impl rule__Influence__Group_10__1 ;
    public final void rule__Influence__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1943:1: ( rule__Influence__Group_10__0__Impl rule__Influence__Group_10__1 )
            // InternalInfluenceDSL.g:1944:2: rule__Influence__Group_10__0__Impl rule__Influence__Group_10__1
            {
            pushFollow(FOLLOW_18);
            rule__Influence__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__0"


    // $ANTLR start "rule__Influence__Group_10__0__Impl"
    // InternalInfluenceDSL.g:1951:1: rule__Influence__Group_10__0__Impl : ( 'metadata' ) ;
    public final void rule__Influence__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1955:1: ( ( 'metadata' ) )
            // InternalInfluenceDSL.g:1956:1: ( 'metadata' )
            {
            // InternalInfluenceDSL.g:1956:1: ( 'metadata' )
            // InternalInfluenceDSL.g:1957:2: 'metadata'
            {
             before(grammarAccess.getInfluenceAccess().getMetadataKeyword_10_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getMetadataKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__0__Impl"


    // $ANTLR start "rule__Influence__Group_10__1"
    // InternalInfluenceDSL.g:1966:1: rule__Influence__Group_10__1 : rule__Influence__Group_10__1__Impl rule__Influence__Group_10__2 ;
    public final void rule__Influence__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1970:1: ( rule__Influence__Group_10__1__Impl rule__Influence__Group_10__2 )
            // InternalInfluenceDSL.g:1971:2: rule__Influence__Group_10__1__Impl rule__Influence__Group_10__2
            {
            pushFollow(FOLLOW_22);
            rule__Influence__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__1"


    // $ANTLR start "rule__Influence__Group_10__1__Impl"
    // InternalInfluenceDSL.g:1978:1: rule__Influence__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Influence__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1982:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:1983:1: ( ':' )
            {
            // InternalInfluenceDSL.g:1983:1: ( ':' )
            // InternalInfluenceDSL.g:1984:2: ':'
            {
             before(grammarAccess.getInfluenceAccess().getColonKeyword_10_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__1__Impl"


    // $ANTLR start "rule__Influence__Group_10__2"
    // InternalInfluenceDSL.g:1993:1: rule__Influence__Group_10__2 : rule__Influence__Group_10__2__Impl rule__Influence__Group_10__3 ;
    public final void rule__Influence__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1997:1: ( rule__Influence__Group_10__2__Impl rule__Influence__Group_10__3 )
            // InternalInfluenceDSL.g:1998:2: rule__Influence__Group_10__2__Impl rule__Influence__Group_10__3
            {
            pushFollow(FOLLOW_22);
            rule__Influence__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__2"


    // $ANTLR start "rule__Influence__Group_10__2__Impl"
    // InternalInfluenceDSL.g:2005:1: rule__Influence__Group_10__2__Impl : ( ( rule__Influence__Group_10_2__0 )? ) ;
    public final void rule__Influence__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2009:1: ( ( ( rule__Influence__Group_10_2__0 )? ) )
            // InternalInfluenceDSL.g:2010:1: ( ( rule__Influence__Group_10_2__0 )? )
            {
            // InternalInfluenceDSL.g:2010:1: ( ( rule__Influence__Group_10_2__0 )? )
            // InternalInfluenceDSL.g:2011:2: ( rule__Influence__Group_10_2__0 )?
            {
             before(grammarAccess.getInfluenceAccess().getGroup_10_2()); 
            // InternalInfluenceDSL.g:2012:2: ( rule__Influence__Group_10_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalInfluenceDSL.g:2012:3: rule__Influence__Group_10_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_10_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInfluenceAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__2__Impl"


    // $ANTLR start "rule__Influence__Group_10__3"
    // InternalInfluenceDSL.g:2020:1: rule__Influence__Group_10__3 : rule__Influence__Group_10__3__Impl ;
    public final void rule__Influence__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2024:1: ( rule__Influence__Group_10__3__Impl )
            // InternalInfluenceDSL.g:2025:2: rule__Influence__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__3"


    // $ANTLR start "rule__Influence__Group_10__3__Impl"
    // InternalInfluenceDSL.g:2031:1: rule__Influence__Group_10__3__Impl : ( ( rule__Influence__Group_10_3__0 )? ) ;
    public final void rule__Influence__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2035:1: ( ( ( rule__Influence__Group_10_3__0 )? ) )
            // InternalInfluenceDSL.g:2036:1: ( ( rule__Influence__Group_10_3__0 )? )
            {
            // InternalInfluenceDSL.g:2036:1: ( ( rule__Influence__Group_10_3__0 )? )
            // InternalInfluenceDSL.g:2037:2: ( rule__Influence__Group_10_3__0 )?
            {
             before(grammarAccess.getInfluenceAccess().getGroup_10_3()); 
            // InternalInfluenceDSL.g:2038:2: ( rule__Influence__Group_10_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInfluenceDSL.g:2038:3: rule__Influence__Group_10_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Influence__Group_10_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInfluenceAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10__3__Impl"


    // $ANTLR start "rule__Influence__Group_10_2__0"
    // InternalInfluenceDSL.g:2047:1: rule__Influence__Group_10_2__0 : rule__Influence__Group_10_2__0__Impl rule__Influence__Group_10_2__1 ;
    public final void rule__Influence__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2051:1: ( rule__Influence__Group_10_2__0__Impl rule__Influence__Group_10_2__1 )
            // InternalInfluenceDSL.g:2052:2: rule__Influence__Group_10_2__0__Impl rule__Influence__Group_10_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Influence__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__0"


    // $ANTLR start "rule__Influence__Group_10_2__0__Impl"
    // InternalInfluenceDSL.g:2059:1: rule__Influence__Group_10_2__0__Impl : ( 'likelihood' ) ;
    public final void rule__Influence__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2063:1: ( ( 'likelihood' ) )
            // InternalInfluenceDSL.g:2064:1: ( 'likelihood' )
            {
            // InternalInfluenceDSL.g:2064:1: ( 'likelihood' )
            // InternalInfluenceDSL.g:2065:2: 'likelihood'
            {
             before(grammarAccess.getInfluenceAccess().getLikelihoodKeyword_10_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getLikelihoodKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__0__Impl"


    // $ANTLR start "rule__Influence__Group_10_2__1"
    // InternalInfluenceDSL.g:2074:1: rule__Influence__Group_10_2__1 : rule__Influence__Group_10_2__1__Impl rule__Influence__Group_10_2__2 ;
    public final void rule__Influence__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2078:1: ( rule__Influence__Group_10_2__1__Impl rule__Influence__Group_10_2__2 )
            // InternalInfluenceDSL.g:2079:2: rule__Influence__Group_10_2__1__Impl rule__Influence__Group_10_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_10_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__1"


    // $ANTLR start "rule__Influence__Group_10_2__1__Impl"
    // InternalInfluenceDSL.g:2086:1: rule__Influence__Group_10_2__1__Impl : ( ':' ) ;
    public final void rule__Influence__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2090:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:2091:1: ( ':' )
            {
            // InternalInfluenceDSL.g:2091:1: ( ':' )
            // InternalInfluenceDSL.g:2092:2: ':'
            {
             before(grammarAccess.getInfluenceAccess().getColonKeyword_10_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getColonKeyword_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__1__Impl"


    // $ANTLR start "rule__Influence__Group_10_2__2"
    // InternalInfluenceDSL.g:2101:1: rule__Influence__Group_10_2__2 : rule__Influence__Group_10_2__2__Impl rule__Influence__Group_10_2__3 ;
    public final void rule__Influence__Group_10_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2105:1: ( rule__Influence__Group_10_2__2__Impl rule__Influence__Group_10_2__3 )
            // InternalInfluenceDSL.g:2106:2: rule__Influence__Group_10_2__2__Impl rule__Influence__Group_10_2__3
            {
            pushFollow(FOLLOW_23);
            rule__Influence__Group_10_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__2"


    // $ANTLR start "rule__Influence__Group_10_2__2__Impl"
    // InternalInfluenceDSL.g:2113:1: rule__Influence__Group_10_2__2__Impl : ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_2 ) ) ;
    public final void rule__Influence__Group_10_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2117:1: ( ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_2 ) ) )
            // InternalInfluenceDSL.g:2118:1: ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_2 ) )
            {
            // InternalInfluenceDSL.g:2118:1: ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_2 ) )
            // InternalInfluenceDSL.g:2119:2: ( rule__Influence__LikelihoodPerElementAssignment_10_2_2 )
            {
             before(grammarAccess.getInfluenceAccess().getLikelihoodPerElementAssignment_10_2_2()); 
            // InternalInfluenceDSL.g:2120:2: ( rule__Influence__LikelihoodPerElementAssignment_10_2_2 )
            // InternalInfluenceDSL.g:2120:3: rule__Influence__LikelihoodPerElementAssignment_10_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Influence__LikelihoodPerElementAssignment_10_2_2();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getLikelihoodPerElementAssignment_10_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__2__Impl"


    // $ANTLR start "rule__Influence__Group_10_2__3"
    // InternalInfluenceDSL.g:2128:1: rule__Influence__Group_10_2__3 : rule__Influence__Group_10_2__3__Impl ;
    public final void rule__Influence__Group_10_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2132:1: ( rule__Influence__Group_10_2__3__Impl )
            // InternalInfluenceDSL.g:2133:2: rule__Influence__Group_10_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__3"


    // $ANTLR start "rule__Influence__Group_10_2__3__Impl"
    // InternalInfluenceDSL.g:2139:1: rule__Influence__Group_10_2__3__Impl : ( ( rule__Influence__Group_10_2_3__0 )* ) ;
    public final void rule__Influence__Group_10_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2143:1: ( ( ( rule__Influence__Group_10_2_3__0 )* ) )
            // InternalInfluenceDSL.g:2144:1: ( ( rule__Influence__Group_10_2_3__0 )* )
            {
            // InternalInfluenceDSL.g:2144:1: ( ( rule__Influence__Group_10_2_3__0 )* )
            // InternalInfluenceDSL.g:2145:2: ( rule__Influence__Group_10_2_3__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_10_2_3()); 
            // InternalInfluenceDSL.g:2146:2: ( rule__Influence__Group_10_2_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2146:3: rule__Influence__Group_10_2_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_10_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_10_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2__3__Impl"


    // $ANTLR start "rule__Influence__Group_10_2_3__0"
    // InternalInfluenceDSL.g:2155:1: rule__Influence__Group_10_2_3__0 : rule__Influence__Group_10_2_3__0__Impl rule__Influence__Group_10_2_3__1 ;
    public final void rule__Influence__Group_10_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2159:1: ( rule__Influence__Group_10_2_3__0__Impl rule__Influence__Group_10_2_3__1 )
            // InternalInfluenceDSL.g:2160:2: rule__Influence__Group_10_2_3__0__Impl rule__Influence__Group_10_2_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_10_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2_3__0"


    // $ANTLR start "rule__Influence__Group_10_2_3__0__Impl"
    // InternalInfluenceDSL.g:2167:1: rule__Influence__Group_10_2_3__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_10_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2171:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2172:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2172:1: ( ',' )
            // InternalInfluenceDSL.g:2173:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_10_2_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_10_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2_3__0__Impl"


    // $ANTLR start "rule__Influence__Group_10_2_3__1"
    // InternalInfluenceDSL.g:2182:1: rule__Influence__Group_10_2_3__1 : rule__Influence__Group_10_2_3__1__Impl ;
    public final void rule__Influence__Group_10_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2186:1: ( rule__Influence__Group_10_2_3__1__Impl )
            // InternalInfluenceDSL.g:2187:2: rule__Influence__Group_10_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2_3__1"


    // $ANTLR start "rule__Influence__Group_10_2_3__1__Impl"
    // InternalInfluenceDSL.g:2193:1: rule__Influence__Group_10_2_3__1__Impl : ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 ) ) ;
    public final void rule__Influence__Group_10_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2197:1: ( ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 ) ) )
            // InternalInfluenceDSL.g:2198:1: ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 ) )
            {
            // InternalInfluenceDSL.g:2198:1: ( ( rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 ) )
            // InternalInfluenceDSL.g:2199:2: ( rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 )
            {
             before(grammarAccess.getInfluenceAccess().getLikelihoodPerElementAssignment_10_2_3_1()); 
            // InternalInfluenceDSL.g:2200:2: ( rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 )
            // InternalInfluenceDSL.g:2200:3: rule__Influence__LikelihoodPerElementAssignment_10_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__LikelihoodPerElementAssignment_10_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getLikelihoodPerElementAssignment_10_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_2_3__1__Impl"


    // $ANTLR start "rule__Influence__Group_10_3__0"
    // InternalInfluenceDSL.g:2209:1: rule__Influence__Group_10_3__0 : rule__Influence__Group_10_3__0__Impl rule__Influence__Group_10_3__1 ;
    public final void rule__Influence__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2213:1: ( rule__Influence__Group_10_3__0__Impl rule__Influence__Group_10_3__1 )
            // InternalInfluenceDSL.g:2214:2: rule__Influence__Group_10_3__0__Impl rule__Influence__Group_10_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Influence__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__0"


    // $ANTLR start "rule__Influence__Group_10_3__0__Impl"
    // InternalInfluenceDSL.g:2221:1: rule__Influence__Group_10_3__0__Impl : ( 'confidence' ) ;
    public final void rule__Influence__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2225:1: ( ( 'confidence' ) )
            // InternalInfluenceDSL.g:2226:1: ( 'confidence' )
            {
            // InternalInfluenceDSL.g:2226:1: ( 'confidence' )
            // InternalInfluenceDSL.g:2227:2: 'confidence'
            {
             before(grammarAccess.getInfluenceAccess().getConfidenceKeyword_10_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getConfidenceKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__0__Impl"


    // $ANTLR start "rule__Influence__Group_10_3__1"
    // InternalInfluenceDSL.g:2236:1: rule__Influence__Group_10_3__1 : rule__Influence__Group_10_3__1__Impl rule__Influence__Group_10_3__2 ;
    public final void rule__Influence__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2240:1: ( rule__Influence__Group_10_3__1__Impl rule__Influence__Group_10_3__2 )
            // InternalInfluenceDSL.g:2241:2: rule__Influence__Group_10_3__1__Impl rule__Influence__Group_10_3__2
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_10_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__1"


    // $ANTLR start "rule__Influence__Group_10_3__1__Impl"
    // InternalInfluenceDSL.g:2248:1: rule__Influence__Group_10_3__1__Impl : ( ':' ) ;
    public final void rule__Influence__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2252:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:2253:1: ( ':' )
            {
            // InternalInfluenceDSL.g:2253:1: ( ':' )
            // InternalInfluenceDSL.g:2254:2: ':'
            {
             before(grammarAccess.getInfluenceAccess().getColonKeyword_10_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getColonKeyword_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__1__Impl"


    // $ANTLR start "rule__Influence__Group_10_3__2"
    // InternalInfluenceDSL.g:2263:1: rule__Influence__Group_10_3__2 : rule__Influence__Group_10_3__2__Impl rule__Influence__Group_10_3__3 ;
    public final void rule__Influence__Group_10_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2267:1: ( rule__Influence__Group_10_3__2__Impl rule__Influence__Group_10_3__3 )
            // InternalInfluenceDSL.g:2268:2: rule__Influence__Group_10_3__2__Impl rule__Influence__Group_10_3__3
            {
            pushFollow(FOLLOW_23);
            rule__Influence__Group_10_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__2"


    // $ANTLR start "rule__Influence__Group_10_3__2__Impl"
    // InternalInfluenceDSL.g:2275:1: rule__Influence__Group_10_3__2__Impl : ( ( rule__Influence__ConfidenceAssignment_10_3_2 ) ) ;
    public final void rule__Influence__Group_10_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2279:1: ( ( ( rule__Influence__ConfidenceAssignment_10_3_2 ) ) )
            // InternalInfluenceDSL.g:2280:1: ( ( rule__Influence__ConfidenceAssignment_10_3_2 ) )
            {
            // InternalInfluenceDSL.g:2280:1: ( ( rule__Influence__ConfidenceAssignment_10_3_2 ) )
            // InternalInfluenceDSL.g:2281:2: ( rule__Influence__ConfidenceAssignment_10_3_2 )
            {
             before(grammarAccess.getInfluenceAccess().getConfidenceAssignment_10_3_2()); 
            // InternalInfluenceDSL.g:2282:2: ( rule__Influence__ConfidenceAssignment_10_3_2 )
            // InternalInfluenceDSL.g:2282:3: rule__Influence__ConfidenceAssignment_10_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Influence__ConfidenceAssignment_10_3_2();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getConfidenceAssignment_10_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__2__Impl"


    // $ANTLR start "rule__Influence__Group_10_3__3"
    // InternalInfluenceDSL.g:2290:1: rule__Influence__Group_10_3__3 : rule__Influence__Group_10_3__3__Impl ;
    public final void rule__Influence__Group_10_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2294:1: ( rule__Influence__Group_10_3__3__Impl )
            // InternalInfluenceDSL.g:2295:2: rule__Influence__Group_10_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__3"


    // $ANTLR start "rule__Influence__Group_10_3__3__Impl"
    // InternalInfluenceDSL.g:2301:1: rule__Influence__Group_10_3__3__Impl : ( ( rule__Influence__Group_10_3_3__0 )* ) ;
    public final void rule__Influence__Group_10_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2305:1: ( ( ( rule__Influence__Group_10_3_3__0 )* ) )
            // InternalInfluenceDSL.g:2306:1: ( ( rule__Influence__Group_10_3_3__0 )* )
            {
            // InternalInfluenceDSL.g:2306:1: ( ( rule__Influence__Group_10_3_3__0 )* )
            // InternalInfluenceDSL.g:2307:2: ( rule__Influence__Group_10_3_3__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_10_3_3()); 
            // InternalInfluenceDSL.g:2308:2: ( rule__Influence__Group_10_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2308:3: rule__Influence__Group_10_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_10_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_10_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3__3__Impl"


    // $ANTLR start "rule__Influence__Group_10_3_3__0"
    // InternalInfluenceDSL.g:2317:1: rule__Influence__Group_10_3_3__0 : rule__Influence__Group_10_3_3__0__Impl rule__Influence__Group_10_3_3__1 ;
    public final void rule__Influence__Group_10_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2321:1: ( rule__Influence__Group_10_3_3__0__Impl rule__Influence__Group_10_3_3__1 )
            // InternalInfluenceDSL.g:2322:2: rule__Influence__Group_10_3_3__0__Impl rule__Influence__Group_10_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_10_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3_3__0"


    // $ANTLR start "rule__Influence__Group_10_3_3__0__Impl"
    // InternalInfluenceDSL.g:2329:1: rule__Influence__Group_10_3_3__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_10_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2333:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2334:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2334:1: ( ',' )
            // InternalInfluenceDSL.g:2335:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_10_3_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_10_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3_3__0__Impl"


    // $ANTLR start "rule__Influence__Group_10_3_3__1"
    // InternalInfluenceDSL.g:2344:1: rule__Influence__Group_10_3_3__1 : rule__Influence__Group_10_3_3__1__Impl ;
    public final void rule__Influence__Group_10_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2348:1: ( rule__Influence__Group_10_3_3__1__Impl )
            // InternalInfluenceDSL.g:2349:2: rule__Influence__Group_10_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_10_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3_3__1"


    // $ANTLR start "rule__Influence__Group_10_3_3__1__Impl"
    // InternalInfluenceDSL.g:2355:1: rule__Influence__Group_10_3_3__1__Impl : ( ( rule__Influence__ConfidenceAssignment_10_3_3_1 ) ) ;
    public final void rule__Influence__Group_10_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2359:1: ( ( ( rule__Influence__ConfidenceAssignment_10_3_3_1 ) ) )
            // InternalInfluenceDSL.g:2360:1: ( ( rule__Influence__ConfidenceAssignment_10_3_3_1 ) )
            {
            // InternalInfluenceDSL.g:2360:1: ( ( rule__Influence__ConfidenceAssignment_10_3_3_1 ) )
            // InternalInfluenceDSL.g:2361:2: ( rule__Influence__ConfidenceAssignment_10_3_3_1 )
            {
             before(grammarAccess.getInfluenceAccess().getConfidenceAssignment_10_3_3_1()); 
            // InternalInfluenceDSL.g:2362:2: ( rule__Influence__ConfidenceAssignment_10_3_3_1 )
            // InternalInfluenceDSL.g:2362:3: rule__Influence__ConfidenceAssignment_10_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__ConfidenceAssignment_10_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getConfidenceAssignment_10_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_10_3_3__1__Impl"


    // $ANTLR start "rule__Influence__Group_14__0"
    // InternalInfluenceDSL.g:2371:1: rule__Influence__Group_14__0 : rule__Influence__Group_14__0__Impl rule__Influence__Group_14__1 ;
    public final void rule__Influence__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2375:1: ( rule__Influence__Group_14__0__Impl rule__Influence__Group_14__1 )
            // InternalInfluenceDSL.g:2376:2: rule__Influence__Group_14__0__Impl rule__Influence__Group_14__1
            {
            pushFollow(FOLLOW_14);
            rule__Influence__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_14__0"


    // $ANTLR start "rule__Influence__Group_14__0__Impl"
    // InternalInfluenceDSL.g:2383:1: rule__Influence__Group_14__0__Impl : ( 'and' ) ;
    public final void rule__Influence__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2387:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:2388:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:2388:1: ( 'and' )
            // InternalInfluenceDSL.g:2389:2: 'and'
            {
             before(grammarAccess.getInfluenceAccess().getAndKeyword_14_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAndKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_14__0__Impl"


    // $ANTLR start "rule__Influence__Group_14__1"
    // InternalInfluenceDSL.g:2398:1: rule__Influence__Group_14__1 : rule__Influence__Group_14__1__Impl ;
    public final void rule__Influence__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2402:1: ( rule__Influence__Group_14__1__Impl )
            // InternalInfluenceDSL.g:2403:2: rule__Influence__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_14__1"


    // $ANTLR start "rule__Influence__Group_14__1__Impl"
    // InternalInfluenceDSL.g:2409:1: rule__Influence__Group_14__1__Impl : ( ( rule__Influence__AffectsAssignment_14_1 ) ) ;
    public final void rule__Influence__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2413:1: ( ( ( rule__Influence__AffectsAssignment_14_1 ) ) )
            // InternalInfluenceDSL.g:2414:1: ( ( rule__Influence__AffectsAssignment_14_1 ) )
            {
            // InternalInfluenceDSL.g:2414:1: ( ( rule__Influence__AffectsAssignment_14_1 ) )
            // InternalInfluenceDSL.g:2415:2: ( rule__Influence__AffectsAssignment_14_1 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_14_1()); 
            // InternalInfluenceDSL.g:2416:2: ( rule__Influence__AffectsAssignment_14_1 )
            // InternalInfluenceDSL.g:2416:3: rule__Influence__AffectsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__AffectsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAffectsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_14__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalInfluenceDSL.g:2425:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2429:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalInfluenceDSL.g:2430:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalInfluenceDSL.g:2437:1: rule__Function__Group__0__Impl : ( 'fun' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2441:1: ( ( 'fun' ) )
            // InternalInfluenceDSL.g:2442:1: ( 'fun' )
            {
            // InternalInfluenceDSL.g:2442:1: ( 'fun' )
            // InternalInfluenceDSL.g:2443:2: 'fun'
            {
             before(grammarAccess.getFunctionAccess().getFunKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalInfluenceDSL.g:2452:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2456:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalInfluenceDSL.g:2457:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalInfluenceDSL.g:2464:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2468:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:2469:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:2469:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:2470:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:2471:2: ( rule__Function__NameAssignment_1 )
            // InternalInfluenceDSL.g:2471:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalInfluenceDSL.g:2479:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2483:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalInfluenceDSL.g:2484:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalInfluenceDSL.g:2491:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2495:1: ( ( '(' ) )
            // InternalInfluenceDSL.g:2496:1: ( '(' )
            {
            // InternalInfluenceDSL.g:2496:1: ( '(' )
            // InternalInfluenceDSL.g:2497:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalInfluenceDSL.g:2506:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2510:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalInfluenceDSL.g:2511:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalInfluenceDSL.g:2518:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2522:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // InternalInfluenceDSL.g:2523:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // InternalInfluenceDSL.g:2523:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // InternalInfluenceDSL.g:2524:2: ( rule__Function__DefinitionAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            // InternalInfluenceDSL.g:2525:2: ( rule__Function__DefinitionAssignment_3 )
            // InternalInfluenceDSL.g:2525:3: rule__Function__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalInfluenceDSL.g:2533:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2537:1: ( rule__Function__Group__4__Impl )
            // InternalInfluenceDSL.g:2538:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalInfluenceDSL.g:2544:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2548:1: ( ( ')' ) )
            // InternalInfluenceDSL.g:2549:1: ( ')' )
            {
            // InternalInfluenceDSL.g:2549:1: ( ')' )
            // InternalInfluenceDSL.g:2550:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__CompositeFunction__Group__0"
    // InternalInfluenceDSL.g:2560:1: rule__CompositeFunction__Group__0 : rule__CompositeFunction__Group__0__Impl rule__CompositeFunction__Group__1 ;
    public final void rule__CompositeFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2564:1: ( rule__CompositeFunction__Group__0__Impl rule__CompositeFunction__Group__1 )
            // InternalInfluenceDSL.g:2565:2: rule__CompositeFunction__Group__0__Impl rule__CompositeFunction__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__CompositeFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__0"


    // $ANTLR start "rule__CompositeFunction__Group__0__Impl"
    // InternalInfluenceDSL.g:2572:1: rule__CompositeFunction__Group__0__Impl : ( 'compositeFun' ) ;
    public final void rule__CompositeFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2576:1: ( ( 'compositeFun' ) )
            // InternalInfluenceDSL.g:2577:1: ( 'compositeFun' )
            {
            // InternalInfluenceDSL.g:2577:1: ( 'compositeFun' )
            // InternalInfluenceDSL.g:2578:2: 'compositeFun'
            {
             before(grammarAccess.getCompositeFunctionAccess().getCompositeFunKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompositeFunctionAccess().getCompositeFunKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__0__Impl"


    // $ANTLR start "rule__CompositeFunction__Group__1"
    // InternalInfluenceDSL.g:2587:1: rule__CompositeFunction__Group__1 : rule__CompositeFunction__Group__1__Impl rule__CompositeFunction__Group__2 ;
    public final void rule__CompositeFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2591:1: ( rule__CompositeFunction__Group__1__Impl rule__CompositeFunction__Group__2 )
            // InternalInfluenceDSL.g:2592:2: rule__CompositeFunction__Group__1__Impl rule__CompositeFunction__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__CompositeFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__1"


    // $ANTLR start "rule__CompositeFunction__Group__1__Impl"
    // InternalInfluenceDSL.g:2599:1: rule__CompositeFunction__Group__1__Impl : ( ( rule__CompositeFunction__NameAssignment_1 ) ) ;
    public final void rule__CompositeFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2603:1: ( ( ( rule__CompositeFunction__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:2604:1: ( ( rule__CompositeFunction__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:2604:1: ( ( rule__CompositeFunction__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:2605:2: ( rule__CompositeFunction__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeFunctionAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:2606:2: ( rule__CompositeFunction__NameAssignment_1 )
            // InternalInfluenceDSL.g:2606:3: rule__CompositeFunction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFunction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__1__Impl"


    // $ANTLR start "rule__CompositeFunction__Group__2"
    // InternalInfluenceDSL.g:2614:1: rule__CompositeFunction__Group__2 : rule__CompositeFunction__Group__2__Impl rule__CompositeFunction__Group__3 ;
    public final void rule__CompositeFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2618:1: ( rule__CompositeFunction__Group__2__Impl rule__CompositeFunction__Group__3 )
            // InternalInfluenceDSL.g:2619:2: rule__CompositeFunction__Group__2__Impl rule__CompositeFunction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CompositeFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__2"


    // $ANTLR start "rule__CompositeFunction__Group__2__Impl"
    // InternalInfluenceDSL.g:2626:1: rule__CompositeFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__CompositeFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2630:1: ( ( '(' ) )
            // InternalInfluenceDSL.g:2631:1: ( '(' )
            {
            // InternalInfluenceDSL.g:2631:1: ( '(' )
            // InternalInfluenceDSL.g:2632:2: '('
            {
             before(grammarAccess.getCompositeFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__2__Impl"


    // $ANTLR start "rule__CompositeFunction__Group__3"
    // InternalInfluenceDSL.g:2641:1: rule__CompositeFunction__Group__3 : rule__CompositeFunction__Group__3__Impl rule__CompositeFunction__Group__4 ;
    public final void rule__CompositeFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2645:1: ( rule__CompositeFunction__Group__3__Impl rule__CompositeFunction__Group__4 )
            // InternalInfluenceDSL.g:2646:2: rule__CompositeFunction__Group__3__Impl rule__CompositeFunction__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__CompositeFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__3"


    // $ANTLR start "rule__CompositeFunction__Group__3__Impl"
    // InternalInfluenceDSL.g:2653:1: rule__CompositeFunction__Group__3__Impl : ( ( rule__CompositeFunction__InputsAssignment_3 ) ) ;
    public final void rule__CompositeFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2657:1: ( ( ( rule__CompositeFunction__InputsAssignment_3 ) ) )
            // InternalInfluenceDSL.g:2658:1: ( ( rule__CompositeFunction__InputsAssignment_3 ) )
            {
            // InternalInfluenceDSL.g:2658:1: ( ( rule__CompositeFunction__InputsAssignment_3 ) )
            // InternalInfluenceDSL.g:2659:2: ( rule__CompositeFunction__InputsAssignment_3 )
            {
             before(grammarAccess.getCompositeFunctionAccess().getInputsAssignment_3()); 
            // InternalInfluenceDSL.g:2660:2: ( rule__CompositeFunction__InputsAssignment_3 )
            // InternalInfluenceDSL.g:2660:3: rule__CompositeFunction__InputsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFunction__InputsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFunctionAccess().getInputsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__3__Impl"


    // $ANTLR start "rule__CompositeFunction__Group__4"
    // InternalInfluenceDSL.g:2668:1: rule__CompositeFunction__Group__4 : rule__CompositeFunction__Group__4__Impl rule__CompositeFunction__Group__5 ;
    public final void rule__CompositeFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2672:1: ( rule__CompositeFunction__Group__4__Impl rule__CompositeFunction__Group__5 )
            // InternalInfluenceDSL.g:2673:2: rule__CompositeFunction__Group__4__Impl rule__CompositeFunction__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__CompositeFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__4"


    // $ANTLR start "rule__CompositeFunction__Group__4__Impl"
    // InternalInfluenceDSL.g:2680:1: rule__CompositeFunction__Group__4__Impl : ( ( rule__CompositeFunction__Group_4__0 )* ) ;
    public final void rule__CompositeFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2684:1: ( ( ( rule__CompositeFunction__Group_4__0 )* ) )
            // InternalInfluenceDSL.g:2685:1: ( ( rule__CompositeFunction__Group_4__0 )* )
            {
            // InternalInfluenceDSL.g:2685:1: ( ( rule__CompositeFunction__Group_4__0 )* )
            // InternalInfluenceDSL.g:2686:2: ( rule__CompositeFunction__Group_4__0 )*
            {
             before(grammarAccess.getCompositeFunctionAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:2687:2: ( rule__CompositeFunction__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2687:3: rule__CompositeFunction__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeFunction__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCompositeFunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__4__Impl"


    // $ANTLR start "rule__CompositeFunction__Group__5"
    // InternalInfluenceDSL.g:2695:1: rule__CompositeFunction__Group__5 : rule__CompositeFunction__Group__5__Impl ;
    public final void rule__CompositeFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2699:1: ( rule__CompositeFunction__Group__5__Impl )
            // InternalInfluenceDSL.g:2700:2: rule__CompositeFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__5"


    // $ANTLR start "rule__CompositeFunction__Group__5__Impl"
    // InternalInfluenceDSL.g:2706:1: rule__CompositeFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__CompositeFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2710:1: ( ( ')' ) )
            // InternalInfluenceDSL.g:2711:1: ( ')' )
            {
            // InternalInfluenceDSL.g:2711:1: ( ')' )
            // InternalInfluenceDSL.g:2712:2: ')'
            {
             before(grammarAccess.getCompositeFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompositeFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group__5__Impl"


    // $ANTLR start "rule__CompositeFunction__Group_4__0"
    // InternalInfluenceDSL.g:2722:1: rule__CompositeFunction__Group_4__0 : rule__CompositeFunction__Group_4__0__Impl rule__CompositeFunction__Group_4__1 ;
    public final void rule__CompositeFunction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2726:1: ( rule__CompositeFunction__Group_4__0__Impl rule__CompositeFunction__Group_4__1 )
            // InternalInfluenceDSL.g:2727:2: rule__CompositeFunction__Group_4__0__Impl rule__CompositeFunction__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__CompositeFunction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group_4__0"


    // $ANTLR start "rule__CompositeFunction__Group_4__0__Impl"
    // InternalInfluenceDSL.g:2734:1: rule__CompositeFunction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CompositeFunction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2738:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2739:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2739:1: ( ',' )
            // InternalInfluenceDSL.g:2740:2: ','
            {
             before(grammarAccess.getCompositeFunctionAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeFunctionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeFunction__Group_4__1"
    // InternalInfluenceDSL.g:2749:1: rule__CompositeFunction__Group_4__1 : rule__CompositeFunction__Group_4__1__Impl ;
    public final void rule__CompositeFunction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2753:1: ( rule__CompositeFunction__Group_4__1__Impl )
            // InternalInfluenceDSL.g:2754:2: rule__CompositeFunction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFunction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group_4__1"


    // $ANTLR start "rule__CompositeFunction__Group_4__1__Impl"
    // InternalInfluenceDSL.g:2760:1: rule__CompositeFunction__Group_4__1__Impl : ( ( rule__CompositeFunction__InputsAssignment_4_1 ) ) ;
    public final void rule__CompositeFunction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2764:1: ( ( ( rule__CompositeFunction__InputsAssignment_4_1 ) ) )
            // InternalInfluenceDSL.g:2765:1: ( ( rule__CompositeFunction__InputsAssignment_4_1 ) )
            {
            // InternalInfluenceDSL.g:2765:1: ( ( rule__CompositeFunction__InputsAssignment_4_1 ) )
            // InternalInfluenceDSL.g:2766:2: ( rule__CompositeFunction__InputsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeFunctionAccess().getInputsAssignment_4_1()); 
            // InternalInfluenceDSL.g:2767:2: ( rule__CompositeFunction__InputsAssignment_4_1 )
            // InternalInfluenceDSL.g:2767:3: rule__CompositeFunction__InputsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFunction__InputsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFunctionAccess().getInputsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__Group_4__1__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group__0"
    // InternalInfluenceDSL.g:2776:1: rule__PhysicalPhenomena__Group__0 : rule__PhysicalPhenomena__Group__0__Impl rule__PhysicalPhenomena__Group__1 ;
    public final void rule__PhysicalPhenomena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2780:1: ( rule__PhysicalPhenomena__Group__0__Impl rule__PhysicalPhenomena__Group__1 )
            // InternalInfluenceDSL.g:2781:2: rule__PhysicalPhenomena__Group__0__Impl rule__PhysicalPhenomena__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PhysicalPhenomena__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group__0"


    // $ANTLR start "rule__PhysicalPhenomena__Group__0__Impl"
    // InternalInfluenceDSL.g:2788:1: rule__PhysicalPhenomena__Group__0__Impl : ( 'Phenomenon' ) ;
    public final void rule__PhysicalPhenomena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2792:1: ( ( 'Phenomenon' ) )
            // InternalInfluenceDSL.g:2793:1: ( 'Phenomenon' )
            {
            // InternalInfluenceDSL.g:2793:1: ( 'Phenomenon' )
            // InternalInfluenceDSL.g:2794:2: 'Phenomenon'
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getPhenomenonKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPhysicalPhenomenaAccess().getPhenomenonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group__0__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group__1"
    // InternalInfluenceDSL.g:2803:1: rule__PhysicalPhenomena__Group__1 : rule__PhysicalPhenomena__Group__1__Impl rule__PhysicalPhenomena__Group__2 ;
    public final void rule__PhysicalPhenomena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2807:1: ( rule__PhysicalPhenomena__Group__1__Impl rule__PhysicalPhenomena__Group__2 )
            // InternalInfluenceDSL.g:2808:2: rule__PhysicalPhenomena__Group__1__Impl rule__PhysicalPhenomena__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__PhysicalPhenomena__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group__1"


    // $ANTLR start "rule__PhysicalPhenomena__Group__1__Impl"
    // InternalInfluenceDSL.g:2815:1: rule__PhysicalPhenomena__Group__1__Impl : ( ( rule__PhysicalPhenomena__NameAssignment_1 ) ) ;
    public final void rule__PhysicalPhenomena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2819:1: ( ( ( rule__PhysicalPhenomena__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:2820:1: ( ( rule__PhysicalPhenomena__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:2820:1: ( ( rule__PhysicalPhenomena__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:2821:2: ( rule__PhysicalPhenomena__NameAssignment_1 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:2822:2: ( rule__PhysicalPhenomena__NameAssignment_1 )
            // InternalInfluenceDSL.g:2822:3: rule__PhysicalPhenomena__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalPhenomenaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group__1__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group__2"
    // InternalInfluenceDSL.g:2830:1: rule__PhysicalPhenomena__Group__2 : rule__PhysicalPhenomena__Group__2__Impl ;
    public final void rule__PhysicalPhenomena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2834:1: ( rule__PhysicalPhenomena__Group__2__Impl )
            // InternalInfluenceDSL.g:2835:2: rule__PhysicalPhenomena__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group__2"


    // $ANTLR start "rule__PhysicalPhenomena__Group__2__Impl"
    // InternalInfluenceDSL.g:2841:1: rule__PhysicalPhenomena__Group__2__Impl : ( ( rule__PhysicalPhenomena__Group_2__0 )? ) ;
    public final void rule__PhysicalPhenomena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2845:1: ( ( ( rule__PhysicalPhenomena__Group_2__0 )? ) )
            // InternalInfluenceDSL.g:2846:1: ( ( rule__PhysicalPhenomena__Group_2__0 )? )
            {
            // InternalInfluenceDSL.g:2846:1: ( ( rule__PhysicalPhenomena__Group_2__0 )? )
            // InternalInfluenceDSL.g:2847:2: ( rule__PhysicalPhenomena__Group_2__0 )?
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getGroup_2()); 
            // InternalInfluenceDSL.g:2848:2: ( rule__PhysicalPhenomena__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalInfluenceDSL.g:2848:3: rule__PhysicalPhenomena__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicalPhenomena__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicalPhenomenaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group__2__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2__0"
    // InternalInfluenceDSL.g:2857:1: rule__PhysicalPhenomena__Group_2__0 : rule__PhysicalPhenomena__Group_2__0__Impl rule__PhysicalPhenomena__Group_2__1 ;
    public final void rule__PhysicalPhenomena__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2861:1: ( rule__PhysicalPhenomena__Group_2__0__Impl rule__PhysicalPhenomena__Group_2__1 )
            // InternalInfluenceDSL.g:2862:2: rule__PhysicalPhenomena__Group_2__0__Impl rule__PhysicalPhenomena__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__PhysicalPhenomena__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2__0"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2__0__Impl"
    // InternalInfluenceDSL.g:2869:1: rule__PhysicalPhenomena__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PhysicalPhenomena__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2873:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:2874:1: ( ':' )
            {
            // InternalInfluenceDSL.g:2874:1: ( ':' )
            // InternalInfluenceDSL.g:2875:2: ':'
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getColonKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPhysicalPhenomenaAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2__0__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2__1"
    // InternalInfluenceDSL.g:2884:1: rule__PhysicalPhenomena__Group_2__1 : rule__PhysicalPhenomena__Group_2__1__Impl rule__PhysicalPhenomena__Group_2__2 ;
    public final void rule__PhysicalPhenomena__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2888:1: ( rule__PhysicalPhenomena__Group_2__1__Impl rule__PhysicalPhenomena__Group_2__2 )
            // InternalInfluenceDSL.g:2889:2: rule__PhysicalPhenomena__Group_2__1__Impl rule__PhysicalPhenomena__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__PhysicalPhenomena__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2__1"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2__1__Impl"
    // InternalInfluenceDSL.g:2896:1: rule__PhysicalPhenomena__Group_2__1__Impl : ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) ) ;
    public final void rule__PhysicalPhenomena__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2900:1: ( ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) ) )
            // InternalInfluenceDSL.g:2901:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) )
            {
            // InternalInfluenceDSL.g:2901:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) )
            // InternalInfluenceDSL.g:2902:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionAssignment_2_1()); 
            // InternalInfluenceDSL.g:2903:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 )
            // InternalInfluenceDSL.g:2903:3: rule__PhysicalPhenomena__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2__1__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2__2"
    // InternalInfluenceDSL.g:2911:1: rule__PhysicalPhenomena__Group_2__2 : rule__PhysicalPhenomena__Group_2__2__Impl ;
    public final void rule__PhysicalPhenomena__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2915:1: ( rule__PhysicalPhenomena__Group_2__2__Impl )
            // InternalInfluenceDSL.g:2916:2: rule__PhysicalPhenomena__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2__2"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2__2__Impl"
    // InternalInfluenceDSL.g:2922:1: rule__PhysicalPhenomena__Group_2__2__Impl : ( ( rule__PhysicalPhenomena__Group_2_2__0 )* ) ;
    public final void rule__PhysicalPhenomena__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2926:1: ( ( ( rule__PhysicalPhenomena__Group_2_2__0 )* ) )
            // InternalInfluenceDSL.g:2927:1: ( ( rule__PhysicalPhenomena__Group_2_2__0 )* )
            {
            // InternalInfluenceDSL.g:2927:1: ( ( rule__PhysicalPhenomena__Group_2_2__0 )* )
            // InternalInfluenceDSL.g:2928:2: ( rule__PhysicalPhenomena__Group_2_2__0 )*
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getGroup_2_2()); 
            // InternalInfluenceDSL.g:2929:2: ( rule__PhysicalPhenomena__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2929:3: rule__PhysicalPhenomena__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PhysicalPhenomena__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPhysicalPhenomenaAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2__2__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2_2__0"
    // InternalInfluenceDSL.g:2938:1: rule__PhysicalPhenomena__Group_2_2__0 : rule__PhysicalPhenomena__Group_2_2__0__Impl rule__PhysicalPhenomena__Group_2_2__1 ;
    public final void rule__PhysicalPhenomena__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2942:1: ( rule__PhysicalPhenomena__Group_2_2__0__Impl rule__PhysicalPhenomena__Group_2_2__1 )
            // InternalInfluenceDSL.g:2943:2: rule__PhysicalPhenomena__Group_2_2__0__Impl rule__PhysicalPhenomena__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__PhysicalPhenomena__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2_2__0"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2_2__0__Impl"
    // InternalInfluenceDSL.g:2950:1: rule__PhysicalPhenomena__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__PhysicalPhenomena__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2954:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2955:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2955:1: ( ',' )
            // InternalInfluenceDSL.g:2956:2: ','
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getCommaKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPhysicalPhenomenaAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2_2__0__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2_2__1"
    // InternalInfluenceDSL.g:2965:1: rule__PhysicalPhenomena__Group_2_2__1 : rule__PhysicalPhenomena__Group_2_2__1__Impl ;
    public final void rule__PhysicalPhenomena__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2969:1: ( rule__PhysicalPhenomena__Group_2_2__1__Impl )
            // InternalInfluenceDSL.g:2970:2: rule__PhysicalPhenomena__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2_2__1"


    // $ANTLR start "rule__PhysicalPhenomena__Group_2_2__1__Impl"
    // InternalInfluenceDSL.g:2976:1: rule__PhysicalPhenomena__Group_2_2__1__Impl : ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) ) ;
    public final void rule__PhysicalPhenomena__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2980:1: ( ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) ) )
            // InternalInfluenceDSL.g:2981:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) )
            {
            // InternalInfluenceDSL.g:2981:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) )
            // InternalInfluenceDSL.g:2982:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionAssignment_2_2_1()); 
            // InternalInfluenceDSL.g:2983:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 )
            // InternalInfluenceDSL.g:2983:3: rule__PhysicalPhenomena__DescriptionAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalPhenomena__DescriptionAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__Group_2_2__1__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__0"
    // InternalInfluenceDSL.g:2992:1: rule__RequirementSatisfaction__Group__0 : rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 ;
    public final void rule__RequirementSatisfaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2996:1: ( rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 )
            // InternalInfluenceDSL.g:2997:2: rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__0"


    // $ANTLR start "rule__RequirementSatisfaction__Group__0__Impl"
    // InternalInfluenceDSL.g:3004:1: rule__RequirementSatisfaction__Group__0__Impl : ( 'Requirement' ) ;
    public final void rule__RequirementSatisfaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3008:1: ( ( 'Requirement' ) )
            // InternalInfluenceDSL.g:3009:1: ( 'Requirement' )
            {
            // InternalInfluenceDSL.g:3009:1: ( 'Requirement' )
            // InternalInfluenceDSL.g:3010:2: 'Requirement'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__0__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__1"
    // InternalInfluenceDSL.g:3019:1: rule__RequirementSatisfaction__Group__1 : rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 ;
    public final void rule__RequirementSatisfaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3023:1: ( rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 )
            // InternalInfluenceDSL.g:3024:2: rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__RequirementSatisfaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__1"


    // $ANTLR start "rule__RequirementSatisfaction__Group__1__Impl"
    // InternalInfluenceDSL.g:3031:1: rule__RequirementSatisfaction__Group__1__Impl : ( ( rule__RequirementSatisfaction__NameAssignment_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3035:1: ( ( ( rule__RequirementSatisfaction__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:3036:1: ( ( rule__RequirementSatisfaction__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:3036:1: ( ( rule__RequirementSatisfaction__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:3037:2: ( rule__RequirementSatisfaction__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:3038:2: ( rule__RequirementSatisfaction__NameAssignment_1 )
            // InternalInfluenceDSL.g:3038:3: rule__RequirementSatisfaction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__1__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__2"
    // InternalInfluenceDSL.g:3046:1: rule__RequirementSatisfaction__Group__2 : rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 ;
    public final void rule__RequirementSatisfaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3050:1: ( rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 )
            // InternalInfluenceDSL.g:3051:2: rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__RequirementSatisfaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__2"


    // $ANTLR start "rule__RequirementSatisfaction__Group__2__Impl"
    // InternalInfluenceDSL.g:3058:1: rule__RequirementSatisfaction__Group__2__Impl : ( ':' ) ;
    public final void rule__RequirementSatisfaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3062:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:3063:1: ( ':' )
            {
            // InternalInfluenceDSL.g:3063:1: ( ':' )
            // InternalInfluenceDSL.g:3064:2: ':'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__2__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__3"
    // InternalInfluenceDSL.g:3073:1: rule__RequirementSatisfaction__Group__3 : rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 ;
    public final void rule__RequirementSatisfaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3077:1: ( rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 )
            // InternalInfluenceDSL.g:3078:2: rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__RequirementSatisfaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__3"


    // $ANTLR start "rule__RequirementSatisfaction__Group__3__Impl"
    // InternalInfluenceDSL.g:3085:1: rule__RequirementSatisfaction__Group__3__Impl : ( 'satisfied' ) ;
    public final void rule__RequirementSatisfaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3089:1: ( ( 'satisfied' ) )
            // InternalInfluenceDSL.g:3090:1: ( 'satisfied' )
            {
            // InternalInfluenceDSL.g:3090:1: ( 'satisfied' )
            // InternalInfluenceDSL.g:3091:2: 'satisfied'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__3__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__4"
    // InternalInfluenceDSL.g:3100:1: rule__RequirementSatisfaction__Group__4 : rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 ;
    public final void rule__RequirementSatisfaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3104:1: ( rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 )
            // InternalInfluenceDSL.g:3105:2: rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__4"


    // $ANTLR start "rule__RequirementSatisfaction__Group__4__Impl"
    // InternalInfluenceDSL.g:3112:1: rule__RequirementSatisfaction__Group__4__Impl : ( 'when' ) ;
    public final void rule__RequirementSatisfaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3116:1: ( ( 'when' ) )
            // InternalInfluenceDSL.g:3117:1: ( 'when' )
            {
            // InternalInfluenceDSL.g:3117:1: ( 'when' )
            // InternalInfluenceDSL.g:3118:2: 'when'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__4__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__5"
    // InternalInfluenceDSL.g:3127:1: rule__RequirementSatisfaction__Group__5 : rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 ;
    public final void rule__RequirementSatisfaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3131:1: ( rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 )
            // InternalInfluenceDSL.g:3132:2: rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__RequirementSatisfaction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__5"


    // $ANTLR start "rule__RequirementSatisfaction__Group__5__Impl"
    // InternalInfluenceDSL.g:3139:1: rule__RequirementSatisfaction__Group__5__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) ) ;
    public final void rule__RequirementSatisfaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3143:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) ) )
            // InternalInfluenceDSL.g:3144:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) )
            {
            // InternalInfluenceDSL.g:3144:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) )
            // InternalInfluenceDSL.g:3145:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_5 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_5()); 
            // InternalInfluenceDSL.g:3146:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_5 )
            // InternalInfluenceDSL.g:3146:3: rule__RequirementSatisfaction__SatisfactionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__SatisfactionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__5__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__6"
    // InternalInfluenceDSL.g:3154:1: rule__RequirementSatisfaction__Group__6 : rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7 ;
    public final void rule__RequirementSatisfaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3158:1: ( rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7 )
            // InternalInfluenceDSL.g:3159:2: rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__RequirementSatisfaction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__6"


    // $ANTLR start "rule__RequirementSatisfaction__Group__6__Impl"
    // InternalInfluenceDSL.g:3166:1: rule__RequirementSatisfaction__Group__6__Impl : ( ( rule__RequirementSatisfaction__Group_6__0 )* ) ;
    public final void rule__RequirementSatisfaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3170:1: ( ( ( rule__RequirementSatisfaction__Group_6__0 )* ) )
            // InternalInfluenceDSL.g:3171:1: ( ( rule__RequirementSatisfaction__Group_6__0 )* )
            {
            // InternalInfluenceDSL.g:3171:1: ( ( rule__RequirementSatisfaction__Group_6__0 )* )
            // InternalInfluenceDSL.g:3172:2: ( rule__RequirementSatisfaction__Group_6__0 )*
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup_6()); 
            // InternalInfluenceDSL.g:3173:2: ( rule__RequirementSatisfaction__Group_6__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalInfluenceDSL.g:3173:3: rule__RequirementSatisfaction__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RequirementSatisfaction__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRequirementSatisfactionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__6__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__7"
    // InternalInfluenceDSL.g:3181:1: rule__RequirementSatisfaction__Group__7 : rule__RequirementSatisfaction__Group__7__Impl ;
    public final void rule__RequirementSatisfaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3185:1: ( rule__RequirementSatisfaction__Group__7__Impl )
            // InternalInfluenceDSL.g:3186:2: rule__RequirementSatisfaction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__7"


    // $ANTLR start "rule__RequirementSatisfaction__Group__7__Impl"
    // InternalInfluenceDSL.g:3192:1: rule__RequirementSatisfaction__Group__7__Impl : ( ( rule__RequirementSatisfaction__Group_7__0 )? ) ;
    public final void rule__RequirementSatisfaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3196:1: ( ( ( rule__RequirementSatisfaction__Group_7__0 )? ) )
            // InternalInfluenceDSL.g:3197:1: ( ( rule__RequirementSatisfaction__Group_7__0 )? )
            {
            // InternalInfluenceDSL.g:3197:1: ( ( rule__RequirementSatisfaction__Group_7__0 )? )
            // InternalInfluenceDSL.g:3198:2: ( rule__RequirementSatisfaction__Group_7__0 )?
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup_7()); 
            // InternalInfluenceDSL.g:3199:2: ( rule__RequirementSatisfaction__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalInfluenceDSL.g:3199:3: rule__RequirementSatisfaction__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequirementSatisfaction__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementSatisfactionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__7__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_6__0"
    // InternalInfluenceDSL.g:3208:1: rule__RequirementSatisfaction__Group_6__0 : rule__RequirementSatisfaction__Group_6__0__Impl rule__RequirementSatisfaction__Group_6__1 ;
    public final void rule__RequirementSatisfaction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3212:1: ( rule__RequirementSatisfaction__Group_6__0__Impl rule__RequirementSatisfaction__Group_6__1 )
            // InternalInfluenceDSL.g:3213:2: rule__RequirementSatisfaction__Group_6__0__Impl rule__RequirementSatisfaction__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_6__0"


    // $ANTLR start "rule__RequirementSatisfaction__Group_6__0__Impl"
    // InternalInfluenceDSL.g:3220:1: rule__RequirementSatisfaction__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RequirementSatisfaction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3224:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:3225:1: ( ',' )
            {
            // InternalInfluenceDSL.g:3225:1: ( ',' )
            // InternalInfluenceDSL.g:3226:2: ','
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_6__0__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_6__1"
    // InternalInfluenceDSL.g:3235:1: rule__RequirementSatisfaction__Group_6__1 : rule__RequirementSatisfaction__Group_6__1__Impl ;
    public final void rule__RequirementSatisfaction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3239:1: ( rule__RequirementSatisfaction__Group_6__1__Impl )
            // InternalInfluenceDSL.g:3240:2: rule__RequirementSatisfaction__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_6__1"


    // $ANTLR start "rule__RequirementSatisfaction__Group_6__1__Impl"
    // InternalInfluenceDSL.g:3246:1: rule__RequirementSatisfaction__Group_6__1__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3250:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) ) )
            // InternalInfluenceDSL.g:3251:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) )
            {
            // InternalInfluenceDSL.g:3251:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) )
            // InternalInfluenceDSL.g:3252:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_6_1()); 
            // InternalInfluenceDSL.g:3253:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 )
            // InternalInfluenceDSL.g:3253:3: rule__RequirementSatisfaction__SatisfactionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__SatisfactionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_6__1__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__0"
    // InternalInfluenceDSL.g:3262:1: rule__RequirementSatisfaction__Group_7__0 : rule__RequirementSatisfaction__Group_7__0__Impl rule__RequirementSatisfaction__Group_7__1 ;
    public final void rule__RequirementSatisfaction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3266:1: ( rule__RequirementSatisfaction__Group_7__0__Impl rule__RequirementSatisfaction__Group_7__1 )
            // InternalInfluenceDSL.g:3267:2: rule__RequirementSatisfaction__Group_7__0__Impl rule__RequirementSatisfaction__Group_7__1
            {
            pushFollow(FOLLOW_18);
            rule__RequirementSatisfaction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__0"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__0__Impl"
    // InternalInfluenceDSL.g:3274:1: rule__RequirementSatisfaction__Group_7__0__Impl : ( 'metadata' ) ;
    public final void rule__RequirementSatisfaction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3278:1: ( ( 'metadata' ) )
            // InternalInfluenceDSL.g:3279:1: ( 'metadata' )
            {
            // InternalInfluenceDSL.g:3279:1: ( 'metadata' )
            // InternalInfluenceDSL.g:3280:2: 'metadata'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getMetadataKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getMetadataKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__0__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__1"
    // InternalInfluenceDSL.g:3289:1: rule__RequirementSatisfaction__Group_7__1 : rule__RequirementSatisfaction__Group_7__1__Impl rule__RequirementSatisfaction__Group_7__2 ;
    public final void rule__RequirementSatisfaction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3293:1: ( rule__RequirementSatisfaction__Group_7__1__Impl rule__RequirementSatisfaction__Group_7__2 )
            // InternalInfluenceDSL.g:3294:2: rule__RequirementSatisfaction__Group_7__1__Impl rule__RequirementSatisfaction__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__1"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__1__Impl"
    // InternalInfluenceDSL.g:3301:1: rule__RequirementSatisfaction__Group_7__1__Impl : ( ':' ) ;
    public final void rule__RequirementSatisfaction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3305:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:3306:1: ( ':' )
            {
            // InternalInfluenceDSL.g:3306:1: ( ':' )
            // InternalInfluenceDSL.g:3307:2: ':'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__1__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__2"
    // InternalInfluenceDSL.g:3316:1: rule__RequirementSatisfaction__Group_7__2 : rule__RequirementSatisfaction__Group_7__2__Impl rule__RequirementSatisfaction__Group_7__3 ;
    public final void rule__RequirementSatisfaction__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3320:1: ( rule__RequirementSatisfaction__Group_7__2__Impl rule__RequirementSatisfaction__Group_7__3 )
            // InternalInfluenceDSL.g:3321:2: rule__RequirementSatisfaction__Group_7__2__Impl rule__RequirementSatisfaction__Group_7__3
            {
            pushFollow(FOLLOW_23);
            rule__RequirementSatisfaction__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__2"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__2__Impl"
    // InternalInfluenceDSL.g:3328:1: rule__RequirementSatisfaction__Group_7__2__Impl : ( ( rule__RequirementSatisfaction__MetadataAssignment_7_2 ) ) ;
    public final void rule__RequirementSatisfaction__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3332:1: ( ( ( rule__RequirementSatisfaction__MetadataAssignment_7_2 ) ) )
            // InternalInfluenceDSL.g:3333:1: ( ( rule__RequirementSatisfaction__MetadataAssignment_7_2 ) )
            {
            // InternalInfluenceDSL.g:3333:1: ( ( rule__RequirementSatisfaction__MetadataAssignment_7_2 ) )
            // InternalInfluenceDSL.g:3334:2: ( rule__RequirementSatisfaction__MetadataAssignment_7_2 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getMetadataAssignment_7_2()); 
            // InternalInfluenceDSL.g:3335:2: ( rule__RequirementSatisfaction__MetadataAssignment_7_2 )
            // InternalInfluenceDSL.g:3335:3: rule__RequirementSatisfaction__MetadataAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__MetadataAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getMetadataAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__2__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__3"
    // InternalInfluenceDSL.g:3343:1: rule__RequirementSatisfaction__Group_7__3 : rule__RequirementSatisfaction__Group_7__3__Impl ;
    public final void rule__RequirementSatisfaction__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3347:1: ( rule__RequirementSatisfaction__Group_7__3__Impl )
            // InternalInfluenceDSL.g:3348:2: rule__RequirementSatisfaction__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__3"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7__3__Impl"
    // InternalInfluenceDSL.g:3354:1: rule__RequirementSatisfaction__Group_7__3__Impl : ( ( rule__RequirementSatisfaction__Group_7_3__0 )* ) ;
    public final void rule__RequirementSatisfaction__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3358:1: ( ( ( rule__RequirementSatisfaction__Group_7_3__0 )* ) )
            // InternalInfluenceDSL.g:3359:1: ( ( rule__RequirementSatisfaction__Group_7_3__0 )* )
            {
            // InternalInfluenceDSL.g:3359:1: ( ( rule__RequirementSatisfaction__Group_7_3__0 )* )
            // InternalInfluenceDSL.g:3360:2: ( rule__RequirementSatisfaction__Group_7_3__0 )*
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup_7_3()); 
            // InternalInfluenceDSL.g:3361:2: ( rule__RequirementSatisfaction__Group_7_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalInfluenceDSL.g:3361:3: rule__RequirementSatisfaction__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RequirementSatisfaction__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRequirementSatisfactionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7__3__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7_3__0"
    // InternalInfluenceDSL.g:3370:1: rule__RequirementSatisfaction__Group_7_3__0 : rule__RequirementSatisfaction__Group_7_3__0__Impl rule__RequirementSatisfaction__Group_7_3__1 ;
    public final void rule__RequirementSatisfaction__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3374:1: ( rule__RequirementSatisfaction__Group_7_3__0__Impl rule__RequirementSatisfaction__Group_7_3__1 )
            // InternalInfluenceDSL.g:3375:2: rule__RequirementSatisfaction__Group_7_3__0__Impl rule__RequirementSatisfaction__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7_3__0"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7_3__0__Impl"
    // InternalInfluenceDSL.g:3382:1: rule__RequirementSatisfaction__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__RequirementSatisfaction__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3386:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:3387:1: ( ',' )
            {
            // InternalInfluenceDSL.g:3387:1: ( ',' )
            // InternalInfluenceDSL.g:3388:2: ','
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7_3__0__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7_3__1"
    // InternalInfluenceDSL.g:3397:1: rule__RequirementSatisfaction__Group_7_3__1 : rule__RequirementSatisfaction__Group_7_3__1__Impl ;
    public final void rule__RequirementSatisfaction__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3401:1: ( rule__RequirementSatisfaction__Group_7_3__1__Impl )
            // InternalInfluenceDSL.g:3402:2: rule__RequirementSatisfaction__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7_3__1"


    // $ANTLR start "rule__RequirementSatisfaction__Group_7_3__1__Impl"
    // InternalInfluenceDSL.g:3408:1: rule__RequirementSatisfaction__Group_7_3__1__Impl : ( ( rule__RequirementSatisfaction__MetadataAssignment_7_3_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3412:1: ( ( ( rule__RequirementSatisfaction__MetadataAssignment_7_3_1 ) ) )
            // InternalInfluenceDSL.g:3413:1: ( ( rule__RequirementSatisfaction__MetadataAssignment_7_3_1 ) )
            {
            // InternalInfluenceDSL.g:3413:1: ( ( rule__RequirementSatisfaction__MetadataAssignment_7_3_1 ) )
            // InternalInfluenceDSL.g:3414:2: ( rule__RequirementSatisfaction__MetadataAssignment_7_3_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getMetadataAssignment_7_3_1()); 
            // InternalInfluenceDSL.g:3415:2: ( rule__RequirementSatisfaction__MetadataAssignment_7_3_1 )
            // InternalInfluenceDSL.g:3415:3: rule__RequirementSatisfaction__MetadataAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__MetadataAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getMetadataAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_7_3__1__Impl"


    // $ANTLR start "rule__DesignArtifact__Group__0"
    // InternalInfluenceDSL.g:3424:1: rule__DesignArtifact__Group__0 : rule__DesignArtifact__Group__0__Impl rule__DesignArtifact__Group__1 ;
    public final void rule__DesignArtifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3428:1: ( rule__DesignArtifact__Group__0__Impl rule__DesignArtifact__Group__1 )
            // InternalInfluenceDSL.g:3429:2: rule__DesignArtifact__Group__0__Impl rule__DesignArtifact__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__DesignArtifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__0"


    // $ANTLR start "rule__DesignArtifact__Group__0__Impl"
    // InternalInfluenceDSL.g:3436:1: rule__DesignArtifact__Group__0__Impl : ( () ) ;
    public final void rule__DesignArtifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3440:1: ( ( () ) )
            // InternalInfluenceDSL.g:3441:1: ( () )
            {
            // InternalInfluenceDSL.g:3441:1: ( () )
            // InternalInfluenceDSL.g:3442:2: ()
            {
             before(grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0()); 
            // InternalInfluenceDSL.g:3443:2: ()
            // InternalInfluenceDSL.g:3443:3: 
            {
            }

             after(grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__0__Impl"


    // $ANTLR start "rule__DesignArtifact__Group__1"
    // InternalInfluenceDSL.g:3451:1: rule__DesignArtifact__Group__1 : rule__DesignArtifact__Group__1__Impl rule__DesignArtifact__Group__2 ;
    public final void rule__DesignArtifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3455:1: ( rule__DesignArtifact__Group__1__Impl rule__DesignArtifact__Group__2 )
            // InternalInfluenceDSL.g:3456:2: rule__DesignArtifact__Group__1__Impl rule__DesignArtifact__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DesignArtifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__1"


    // $ANTLR start "rule__DesignArtifact__Group__1__Impl"
    // InternalInfluenceDSL.g:3463:1: rule__DesignArtifact__Group__1__Impl : ( 'DesignArtifact' ) ;
    public final void rule__DesignArtifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3467:1: ( ( 'DesignArtifact' ) )
            // InternalInfluenceDSL.g:3468:1: ( 'DesignArtifact' )
            {
            // InternalInfluenceDSL.g:3468:1: ( 'DesignArtifact' )
            // InternalInfluenceDSL.g:3469:2: 'DesignArtifact'
            {
             before(grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__1__Impl"


    // $ANTLR start "rule__DesignArtifact__Group__2"
    // InternalInfluenceDSL.g:3478:1: rule__DesignArtifact__Group__2 : rule__DesignArtifact__Group__2__Impl rule__DesignArtifact__Group__3 ;
    public final void rule__DesignArtifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3482:1: ( rule__DesignArtifact__Group__2__Impl rule__DesignArtifact__Group__3 )
            // InternalInfluenceDSL.g:3483:2: rule__DesignArtifact__Group__2__Impl rule__DesignArtifact__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__DesignArtifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__2"


    // $ANTLR start "rule__DesignArtifact__Group__2__Impl"
    // InternalInfluenceDSL.g:3490:1: rule__DesignArtifact__Group__2__Impl : ( ( rule__DesignArtifact__NameAssignment_2 ) ) ;
    public final void rule__DesignArtifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3494:1: ( ( ( rule__DesignArtifact__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:3495:1: ( ( rule__DesignArtifact__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:3495:1: ( ( rule__DesignArtifact__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:3496:2: ( rule__DesignArtifact__NameAssignment_2 )
            {
             before(grammarAccess.getDesignArtifactAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:3497:2: ( rule__DesignArtifact__NameAssignment_2 )
            // InternalInfluenceDSL.g:3497:3: rule__DesignArtifact__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDesignArtifactAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__2__Impl"


    // $ANTLR start "rule__DesignArtifact__Group__3"
    // InternalInfluenceDSL.g:3505:1: rule__DesignArtifact__Group__3 : rule__DesignArtifact__Group__3__Impl rule__DesignArtifact__Group__4 ;
    public final void rule__DesignArtifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3509:1: ( rule__DesignArtifact__Group__3__Impl rule__DesignArtifact__Group__4 )
            // InternalInfluenceDSL.g:3510:2: rule__DesignArtifact__Group__3__Impl rule__DesignArtifact__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__DesignArtifact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__3"


    // $ANTLR start "rule__DesignArtifact__Group__3__Impl"
    // InternalInfluenceDSL.g:3517:1: rule__DesignArtifact__Group__3__Impl : ( '->' ) ;
    public final void rule__DesignArtifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3521:1: ( ( '->' ) )
            // InternalInfluenceDSL.g:3522:1: ( '->' )
            {
            // InternalInfluenceDSL.g:3522:1: ( '->' )
            // InternalInfluenceDSL.g:3523:2: '->'
            {
             before(grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__3__Impl"


    // $ANTLR start "rule__DesignArtifact__Group__4"
    // InternalInfluenceDSL.g:3532:1: rule__DesignArtifact__Group__4 : rule__DesignArtifact__Group__4__Impl rule__DesignArtifact__Group__5 ;
    public final void rule__DesignArtifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3536:1: ( rule__DesignArtifact__Group__4__Impl rule__DesignArtifact__Group__5 )
            // InternalInfluenceDSL.g:3537:2: rule__DesignArtifact__Group__4__Impl rule__DesignArtifact__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__DesignArtifact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__4"


    // $ANTLR start "rule__DesignArtifact__Group__4__Impl"
    // InternalInfluenceDSL.g:3544:1: rule__DesignArtifact__Group__4__Impl : ( ( rule__DesignArtifact__RefAssignment_4 ) ) ;
    public final void rule__DesignArtifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3548:1: ( ( ( rule__DesignArtifact__RefAssignment_4 ) ) )
            // InternalInfluenceDSL.g:3549:1: ( ( rule__DesignArtifact__RefAssignment_4 ) )
            {
            // InternalInfluenceDSL.g:3549:1: ( ( rule__DesignArtifact__RefAssignment_4 ) )
            // InternalInfluenceDSL.g:3550:2: ( rule__DesignArtifact__RefAssignment_4 )
            {
             before(grammarAccess.getDesignArtifactAccess().getRefAssignment_4()); 
            // InternalInfluenceDSL.g:3551:2: ( rule__DesignArtifact__RefAssignment_4 )
            // InternalInfluenceDSL.g:3551:3: rule__DesignArtifact__RefAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__RefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDesignArtifactAccess().getRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__4__Impl"


    // $ANTLR start "rule__DesignArtifact__Group__5"
    // InternalInfluenceDSL.g:3559:1: rule__DesignArtifact__Group__5 : rule__DesignArtifact__Group__5__Impl ;
    public final void rule__DesignArtifact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3563:1: ( rule__DesignArtifact__Group__5__Impl )
            // InternalInfluenceDSL.g:3564:2: rule__DesignArtifact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__5"


    // $ANTLR start "rule__DesignArtifact__Group__5__Impl"
    // InternalInfluenceDSL.g:3570:1: rule__DesignArtifact__Group__5__Impl : ( ( rule__DesignArtifact__Group_5__0 )? ) ;
    public final void rule__DesignArtifact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3574:1: ( ( ( rule__DesignArtifact__Group_5__0 )? ) )
            // InternalInfluenceDSL.g:3575:1: ( ( rule__DesignArtifact__Group_5__0 )? )
            {
            // InternalInfluenceDSL.g:3575:1: ( ( rule__DesignArtifact__Group_5__0 )? )
            // InternalInfluenceDSL.g:3576:2: ( rule__DesignArtifact__Group_5__0 )?
            {
             before(grammarAccess.getDesignArtifactAccess().getGroup_5()); 
            // InternalInfluenceDSL.g:3577:2: ( rule__DesignArtifact__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalInfluenceDSL.g:3577:3: rule__DesignArtifact__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DesignArtifact__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignArtifactAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group__5__Impl"


    // $ANTLR start "rule__DesignArtifact__Group_5__0"
    // InternalInfluenceDSL.g:3586:1: rule__DesignArtifact__Group_5__0 : rule__DesignArtifact__Group_5__0__Impl rule__DesignArtifact__Group_5__1 ;
    public final void rule__DesignArtifact__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3590:1: ( rule__DesignArtifact__Group_5__0__Impl rule__DesignArtifact__Group_5__1 )
            // InternalInfluenceDSL.g:3591:2: rule__DesignArtifact__Group_5__0__Impl rule__DesignArtifact__Group_5__1
            {
            pushFollow(FOLLOW_34);
            rule__DesignArtifact__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group_5__0"


    // $ANTLR start "rule__DesignArtifact__Group_5__0__Impl"
    // InternalInfluenceDSL.g:3598:1: rule__DesignArtifact__Group_5__0__Impl : ( 'changeability' ) ;
    public final void rule__DesignArtifact__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3602:1: ( ( 'changeability' ) )
            // InternalInfluenceDSL.g:3603:1: ( 'changeability' )
            {
            // InternalInfluenceDSL.g:3603:1: ( 'changeability' )
            // InternalInfluenceDSL.g:3604:2: 'changeability'
            {
             before(grammarAccess.getDesignArtifactAccess().getChangeabilityKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDesignArtifactAccess().getChangeabilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group_5__0__Impl"


    // $ANTLR start "rule__DesignArtifact__Group_5__1"
    // InternalInfluenceDSL.g:3613:1: rule__DesignArtifact__Group_5__1 : rule__DesignArtifact__Group_5__1__Impl rule__DesignArtifact__Group_5__2 ;
    public final void rule__DesignArtifact__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3617:1: ( rule__DesignArtifact__Group_5__1__Impl rule__DesignArtifact__Group_5__2 )
            // InternalInfluenceDSL.g:3618:2: rule__DesignArtifact__Group_5__1__Impl rule__DesignArtifact__Group_5__2
            {
            pushFollow(FOLLOW_35);
            rule__DesignArtifact__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group_5__1"


    // $ANTLR start "rule__DesignArtifact__Group_5__1__Impl"
    // InternalInfluenceDSL.g:3625:1: rule__DesignArtifact__Group_5__1__Impl : ( '=' ) ;
    public final void rule__DesignArtifact__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3629:1: ( ( '=' ) )
            // InternalInfluenceDSL.g:3630:1: ( '=' )
            {
            // InternalInfluenceDSL.g:3630:1: ( '=' )
            // InternalInfluenceDSL.g:3631:2: '='
            {
             before(grammarAccess.getDesignArtifactAccess().getEqualsSignKeyword_5_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDesignArtifactAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group_5__1__Impl"


    // $ANTLR start "rule__DesignArtifact__Group_5__2"
    // InternalInfluenceDSL.g:3640:1: rule__DesignArtifact__Group_5__2 : rule__DesignArtifact__Group_5__2__Impl ;
    public final void rule__DesignArtifact__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3644:1: ( rule__DesignArtifact__Group_5__2__Impl )
            // InternalInfluenceDSL.g:3645:2: rule__DesignArtifact__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group_5__2"


    // $ANTLR start "rule__DesignArtifact__Group_5__2__Impl"
    // InternalInfluenceDSL.g:3651:1: rule__DesignArtifact__Group_5__2__Impl : ( ( rule__DesignArtifact__ChangeabilityAssignment_5_2 ) ) ;
    public final void rule__DesignArtifact__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3655:1: ( ( ( rule__DesignArtifact__ChangeabilityAssignment_5_2 ) ) )
            // InternalInfluenceDSL.g:3656:1: ( ( rule__DesignArtifact__ChangeabilityAssignment_5_2 ) )
            {
            // InternalInfluenceDSL.g:3656:1: ( ( rule__DesignArtifact__ChangeabilityAssignment_5_2 ) )
            // InternalInfluenceDSL.g:3657:2: ( rule__DesignArtifact__ChangeabilityAssignment_5_2 )
            {
             before(grammarAccess.getDesignArtifactAccess().getChangeabilityAssignment_5_2()); 
            // InternalInfluenceDSL.g:3658:2: ( rule__DesignArtifact__ChangeabilityAssignment_5_2 )
            // InternalInfluenceDSL.g:3658:3: rule__DesignArtifact__ChangeabilityAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__ChangeabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDesignArtifactAccess().getChangeabilityAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__Group_5__2__Impl"


    // $ANTLR start "rule__SystemResponse__Group__0"
    // InternalInfluenceDSL.g:3667:1: rule__SystemResponse__Group__0 : rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 ;
    public final void rule__SystemResponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3671:1: ( rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 )
            // InternalInfluenceDSL.g:3672:2: rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SystemResponse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__0"


    // $ANTLR start "rule__SystemResponse__Group__0__Impl"
    // InternalInfluenceDSL.g:3679:1: rule__SystemResponse__Group__0__Impl : ( () ) ;
    public final void rule__SystemResponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3683:1: ( ( () ) )
            // InternalInfluenceDSL.g:3684:1: ( () )
            {
            // InternalInfluenceDSL.g:3684:1: ( () )
            // InternalInfluenceDSL.g:3685:2: ()
            {
             before(grammarAccess.getSystemResponseAccess().getSystemResponseAction_0()); 
            // InternalInfluenceDSL.g:3686:2: ()
            // InternalInfluenceDSL.g:3686:3: 
            {
            }

             after(grammarAccess.getSystemResponseAccess().getSystemResponseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__0__Impl"


    // $ANTLR start "rule__SystemResponse__Group__1"
    // InternalInfluenceDSL.g:3694:1: rule__SystemResponse__Group__1 : rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 ;
    public final void rule__SystemResponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3698:1: ( rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 )
            // InternalInfluenceDSL.g:3699:2: rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__SystemResponse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__1"


    // $ANTLR start "rule__SystemResponse__Group__1__Impl"
    // InternalInfluenceDSL.g:3706:1: rule__SystemResponse__Group__1__Impl : ( 'system' ) ;
    public final void rule__SystemResponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3710:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:3711:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:3711:1: ( 'system' )
            // InternalInfluenceDSL.g:3712:2: 'system'
            {
             before(grammarAccess.getSystemResponseAccess().getSystemKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__1__Impl"


    // $ANTLR start "rule__SystemResponse__Group__2"
    // InternalInfluenceDSL.g:3721:1: rule__SystemResponse__Group__2 : rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 ;
    public final void rule__SystemResponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3725:1: ( rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 )
            // InternalInfluenceDSL.g:3726:2: rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SystemResponse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__2"


    // $ANTLR start "rule__SystemResponse__Group__2__Impl"
    // InternalInfluenceDSL.g:3733:1: rule__SystemResponse__Group__2__Impl : ( 'response' ) ;
    public final void rule__SystemResponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3737:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:3738:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:3738:1: ( 'response' )
            // InternalInfluenceDSL.g:3739:2: 'response'
            {
             before(grammarAccess.getSystemResponseAccess().getResponseKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getResponseKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__2__Impl"


    // $ANTLR start "rule__SystemResponse__Group__3"
    // InternalInfluenceDSL.g:3748:1: rule__SystemResponse__Group__3 : rule__SystemResponse__Group__3__Impl rule__SystemResponse__Group__4 ;
    public final void rule__SystemResponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3752:1: ( rule__SystemResponse__Group__3__Impl rule__SystemResponse__Group__4 )
            // InternalInfluenceDSL.g:3753:2: rule__SystemResponse__Group__3__Impl rule__SystemResponse__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__SystemResponse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__3"


    // $ANTLR start "rule__SystemResponse__Group__3__Impl"
    // InternalInfluenceDSL.g:3760:1: rule__SystemResponse__Group__3__Impl : ( ( rule__SystemResponse__NameAssignment_3 ) ) ;
    public final void rule__SystemResponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3764:1: ( ( ( rule__SystemResponse__NameAssignment_3 ) ) )
            // InternalInfluenceDSL.g:3765:1: ( ( rule__SystemResponse__NameAssignment_3 ) )
            {
            // InternalInfluenceDSL.g:3765:1: ( ( rule__SystemResponse__NameAssignment_3 ) )
            // InternalInfluenceDSL.g:3766:2: ( rule__SystemResponse__NameAssignment_3 )
            {
             before(grammarAccess.getSystemResponseAccess().getNameAssignment_3()); 
            // InternalInfluenceDSL.g:3767:2: ( rule__SystemResponse__NameAssignment_3 )
            // InternalInfluenceDSL.g:3767:3: rule__SystemResponse__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemResponseAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__3__Impl"


    // $ANTLR start "rule__SystemResponse__Group__4"
    // InternalInfluenceDSL.g:3775:1: rule__SystemResponse__Group__4 : rule__SystemResponse__Group__4__Impl ;
    public final void rule__SystemResponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3779:1: ( rule__SystemResponse__Group__4__Impl )
            // InternalInfluenceDSL.g:3780:2: rule__SystemResponse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__4"


    // $ANTLR start "rule__SystemResponse__Group__4__Impl"
    // InternalInfluenceDSL.g:3786:1: rule__SystemResponse__Group__4__Impl : ( ( rule__SystemResponse__Group_4__0 )? ) ;
    public final void rule__SystemResponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3790:1: ( ( ( rule__SystemResponse__Group_4__0 )? ) )
            // InternalInfluenceDSL.g:3791:1: ( ( rule__SystemResponse__Group_4__0 )? )
            {
            // InternalInfluenceDSL.g:3791:1: ( ( rule__SystemResponse__Group_4__0 )? )
            // InternalInfluenceDSL.g:3792:2: ( rule__SystemResponse__Group_4__0 )?
            {
             before(grammarAccess.getSystemResponseAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:3793:2: ( rule__SystemResponse__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalInfluenceDSL.g:3793:3: rule__SystemResponse__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemResponse__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemResponseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group__4__Impl"


    // $ANTLR start "rule__SystemResponse__Group_4__0"
    // InternalInfluenceDSL.g:3802:1: rule__SystemResponse__Group_4__0 : rule__SystemResponse__Group_4__0__Impl rule__SystemResponse__Group_4__1 ;
    public final void rule__SystemResponse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3806:1: ( rule__SystemResponse__Group_4__0__Impl rule__SystemResponse__Group_4__1 )
            // InternalInfluenceDSL.g:3807:2: rule__SystemResponse__Group_4__0__Impl rule__SystemResponse__Group_4__1
            {
            pushFollow(FOLLOW_37);
            rule__SystemResponse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__0"


    // $ANTLR start "rule__SystemResponse__Group_4__0__Impl"
    // InternalInfluenceDSL.g:3814:1: rule__SystemResponse__Group_4__0__Impl : ( 'used' ) ;
    public final void rule__SystemResponse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3818:1: ( ( 'used' ) )
            // InternalInfluenceDSL.g:3819:1: ( 'used' )
            {
            // InternalInfluenceDSL.g:3819:1: ( 'used' )
            // InternalInfluenceDSL.g:3820:2: 'used'
            {
             before(grammarAccess.getSystemResponseAccess().getUsedKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getUsedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__0__Impl"


    // $ANTLR start "rule__SystemResponse__Group_4__1"
    // InternalInfluenceDSL.g:3829:1: rule__SystemResponse__Group_4__1 : rule__SystemResponse__Group_4__1__Impl rule__SystemResponse__Group_4__2 ;
    public final void rule__SystemResponse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3833:1: ( rule__SystemResponse__Group_4__1__Impl rule__SystemResponse__Group_4__2 )
            // InternalInfluenceDSL.g:3834:2: rule__SystemResponse__Group_4__1__Impl rule__SystemResponse__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemResponse__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__1"


    // $ANTLR start "rule__SystemResponse__Group_4__1__Impl"
    // InternalInfluenceDSL.g:3841:1: rule__SystemResponse__Group_4__1__Impl : ( 'in' ) ;
    public final void rule__SystemResponse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3845:1: ( ( 'in' ) )
            // InternalInfluenceDSL.g:3846:1: ( 'in' )
            {
            // InternalInfluenceDSL.g:3846:1: ( 'in' )
            // InternalInfluenceDSL.g:3847:2: 'in'
            {
             before(grammarAccess.getSystemResponseAccess().getInKeyword_4_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getInKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__1__Impl"


    // $ANTLR start "rule__SystemResponse__Group_4__2"
    // InternalInfluenceDSL.g:3856:1: rule__SystemResponse__Group_4__2 : rule__SystemResponse__Group_4__2__Impl rule__SystemResponse__Group_4__3 ;
    public final void rule__SystemResponse__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3860:1: ( rule__SystemResponse__Group_4__2__Impl rule__SystemResponse__Group_4__3 )
            // InternalInfluenceDSL.g:3861:2: rule__SystemResponse__Group_4__2__Impl rule__SystemResponse__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__SystemResponse__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__2"


    // $ANTLR start "rule__SystemResponse__Group_4__2__Impl"
    // InternalInfluenceDSL.g:3868:1: rule__SystemResponse__Group_4__2__Impl : ( ( rule__SystemResponse__UsedInAssignment_4_2 ) ) ;
    public final void rule__SystemResponse__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3872:1: ( ( ( rule__SystemResponse__UsedInAssignment_4_2 ) ) )
            // InternalInfluenceDSL.g:3873:1: ( ( rule__SystemResponse__UsedInAssignment_4_2 ) )
            {
            // InternalInfluenceDSL.g:3873:1: ( ( rule__SystemResponse__UsedInAssignment_4_2 ) )
            // InternalInfluenceDSL.g:3874:2: ( rule__SystemResponse__UsedInAssignment_4_2 )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInAssignment_4_2()); 
            // InternalInfluenceDSL.g:3875:2: ( rule__SystemResponse__UsedInAssignment_4_2 )
            // InternalInfluenceDSL.g:3875:3: rule__SystemResponse__UsedInAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__UsedInAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemResponseAccess().getUsedInAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__2__Impl"


    // $ANTLR start "rule__SystemResponse__Group_4__3"
    // InternalInfluenceDSL.g:3883:1: rule__SystemResponse__Group_4__3 : rule__SystemResponse__Group_4__3__Impl ;
    public final void rule__SystemResponse__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3887:1: ( rule__SystemResponse__Group_4__3__Impl )
            // InternalInfluenceDSL.g:3888:2: rule__SystemResponse__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__3"


    // $ANTLR start "rule__SystemResponse__Group_4__3__Impl"
    // InternalInfluenceDSL.g:3894:1: rule__SystemResponse__Group_4__3__Impl : ( ( rule__SystemResponse__Group_4_3__0 )* ) ;
    public final void rule__SystemResponse__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3898:1: ( ( ( rule__SystemResponse__Group_4_3__0 )* ) )
            // InternalInfluenceDSL.g:3899:1: ( ( rule__SystemResponse__Group_4_3__0 )* )
            {
            // InternalInfluenceDSL.g:3899:1: ( ( rule__SystemResponse__Group_4_3__0 )* )
            // InternalInfluenceDSL.g:3900:2: ( rule__SystemResponse__Group_4_3__0 )*
            {
             before(grammarAccess.getSystemResponseAccess().getGroup_4_3()); 
            // InternalInfluenceDSL.g:3901:2: ( rule__SystemResponse__Group_4_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    int LA28_2 = input.LA(2);

                    if ( ((LA28_2>=RULE_STRING && LA28_2<=RULE_ID)) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalInfluenceDSL.g:3901:3: rule__SystemResponse__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SystemResponse__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSystemResponseAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4__3__Impl"


    // $ANTLR start "rule__SystemResponse__Group_4_3__0"
    // InternalInfluenceDSL.g:3910:1: rule__SystemResponse__Group_4_3__0 : rule__SystemResponse__Group_4_3__0__Impl rule__SystemResponse__Group_4_3__1 ;
    public final void rule__SystemResponse__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3914:1: ( rule__SystemResponse__Group_4_3__0__Impl rule__SystemResponse__Group_4_3__1 )
            // InternalInfluenceDSL.g:3915:2: rule__SystemResponse__Group_4_3__0__Impl rule__SystemResponse__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemResponse__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4_3__0"


    // $ANTLR start "rule__SystemResponse__Group_4_3__0__Impl"
    // InternalInfluenceDSL.g:3922:1: rule__SystemResponse__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__SystemResponse__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3926:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:3927:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:3927:1: ( 'and' )
            // InternalInfluenceDSL.g:3928:2: 'and'
            {
             before(grammarAccess.getSystemResponseAccess().getAndKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getAndKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4_3__0__Impl"


    // $ANTLR start "rule__SystemResponse__Group_4_3__1"
    // InternalInfluenceDSL.g:3937:1: rule__SystemResponse__Group_4_3__1 : rule__SystemResponse__Group_4_3__1__Impl ;
    public final void rule__SystemResponse__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3941:1: ( rule__SystemResponse__Group_4_3__1__Impl )
            // InternalInfluenceDSL.g:3942:2: rule__SystemResponse__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4_3__1"


    // $ANTLR start "rule__SystemResponse__Group_4_3__1__Impl"
    // InternalInfluenceDSL.g:3948:1: rule__SystemResponse__Group_4_3__1__Impl : ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) ) ;
    public final void rule__SystemResponse__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3952:1: ( ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) ) )
            // InternalInfluenceDSL.g:3953:1: ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) )
            {
            // InternalInfluenceDSL.g:3953:1: ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) )
            // InternalInfluenceDSL.g:3954:2: ( rule__SystemResponse__UsedInAssignment_4_3_1 )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInAssignment_4_3_1()); 
            // InternalInfluenceDSL.g:3955:2: ( rule__SystemResponse__UsedInAssignment_4_3_1 )
            // InternalInfluenceDSL.g:3955:3: rule__SystemResponse__UsedInAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__UsedInAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemResponseAccess().getUsedInAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_4_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalInfluenceDSL.g:3964:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3968:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalInfluenceDSL.g:3969:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalInfluenceDSL.g:3976:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3980:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3981:1: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:3981:1: ( RULE_ID )
            // InternalInfluenceDSL.g:3982:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalInfluenceDSL.g:3991:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3995:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalInfluenceDSL.g:3996:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalInfluenceDSL.g:4002:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4006:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalInfluenceDSL.g:4007:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalInfluenceDSL.g:4007:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalInfluenceDSL.g:4008:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalInfluenceDSL.g:4009:2: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalInfluenceDSL.g:4009:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalInfluenceDSL.g:4018:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4022:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalInfluenceDSL.g:4023:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalInfluenceDSL.g:4030:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4034:1: ( ( '.' ) )
            // InternalInfluenceDSL.g:4035:1: ( '.' )
            {
            // InternalInfluenceDSL.g:4035:1: ( '.' )
            // InternalInfluenceDSL.g:4036:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalInfluenceDSL.g:4045:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4049:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalInfluenceDSL.g:4050:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalInfluenceDSL.g:4056:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4060:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:4061:1: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:4061:1: ( RULE_ID )
            // InternalInfluenceDSL.g:4062:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__InfluenceModel__NameAssignment_2"
    // InternalInfluenceDSL.g:4072:1: rule__InfluenceModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InfluenceModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4076:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4077:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4077:2: ( ruleEString )
            // InternalInfluenceDSL.g:4078:3: ruleEString
            {
             before(grammarAccess.getInfluenceModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__NameAssignment_2"


    // $ANTLR start "rule__InfluenceModel__OwnedArtifactsAssignment_3_0"
    // InternalInfluenceDSL.g:4087:1: rule__InfluenceModel__OwnedArtifactsAssignment_3_0 : ( ruleDesignArtifact ) ;
    public final void rule__InfluenceModel__OwnedArtifactsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4091:1: ( ( ruleDesignArtifact ) )
            // InternalInfluenceDSL.g:4092:2: ( ruleDesignArtifact )
            {
            // InternalInfluenceDSL.g:4092:2: ( ruleDesignArtifact )
            // InternalInfluenceDSL.g:4093:3: ruleDesignArtifact
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsDesignArtifactParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDesignArtifact();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsDesignArtifactParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__OwnedArtifactsAssignment_3_0"


    // $ANTLR start "rule__InfluenceModel__OwnedRequirementsAssignment_3_1"
    // InternalInfluenceDSL.g:4102:1: rule__InfluenceModel__OwnedRequirementsAssignment_3_1 : ( ruleRequirementSatisfaction ) ;
    public final void rule__InfluenceModel__OwnedRequirementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4106:1: ( ( ruleRequirementSatisfaction ) )
            // InternalInfluenceDSL.g:4107:2: ( ruleRequirementSatisfaction )
            {
            // InternalInfluenceDSL.g:4107:2: ( ruleRequirementSatisfaction )
            // InternalInfluenceDSL.g:4108:3: ruleRequirementSatisfaction
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsRequirementSatisfactionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirementSatisfaction();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsRequirementSatisfactionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__OwnedRequirementsAssignment_3_1"


    // $ANTLR start "rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2"
    // InternalInfluenceDSL.g:4117:1: rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 : ( rulePhysicalPhenomena ) ;
    public final void rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4121:1: ( ( rulePhysicalPhenomena ) )
            // InternalInfluenceDSL.g:4122:2: ( rulePhysicalPhenomena )
            {
            // InternalInfluenceDSL.g:4122:2: ( rulePhysicalPhenomena )
            // InternalInfluenceDSL.g:4123:3: rulePhysicalPhenomena
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedPhysicalPhenomenaPhysicalPhenomenaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicalPhenomena();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedPhysicalPhenomenaPhysicalPhenomenaParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2"


    // $ANTLR start "rule__InfluenceModel__OwnedInfluencesAssignment_3_3"
    // InternalInfluenceDSL.g:4132:1: rule__InfluenceModel__OwnedInfluencesAssignment_3_3 : ( ruleAbstractInfluence ) ;
    public final void rule__InfluenceModel__OwnedInfluencesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4136:1: ( ( ruleAbstractInfluence ) )
            // InternalInfluenceDSL.g:4137:2: ( ruleAbstractInfluence )
            {
            // InternalInfluenceDSL.g:4137:2: ( ruleAbstractInfluence )
            // InternalInfluenceDSL.g:4138:3: ruleAbstractInfluence
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAbstractInfluenceParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractInfluence();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAbstractInfluenceParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__OwnedInfluencesAssignment_3_3"


    // $ANTLR start "rule__CompositeInfluence__NameAssignment_2"
    // InternalInfluenceDSL.g:4147:1: rule__CompositeInfluence__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeInfluence__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4151:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4152:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4152:2: ( ruleEString )
            // InternalInfluenceDSL.g:4153:3: ruleEString
            {
             before(grammarAccess.getCompositeInfluenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__NameAssignment_2"


    // $ANTLR start "rule__CompositeInfluence__DescriptionAssignment_4"
    // InternalInfluenceDSL.g:4162:1: rule__CompositeInfluence__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__CompositeInfluence__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4166:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4167:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4167:2: ( ruleEString )
            // InternalInfluenceDSL.g:4168:3: ruleEString
            {
             before(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__DescriptionAssignment_4"


    // $ANTLR start "rule__CompositeInfluence__DescriptionAssignment_5_1"
    // InternalInfluenceDSL.g:4177:1: rule__CompositeInfluence__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CompositeInfluence__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4181:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4182:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4182:2: ( ruleEString )
            // InternalInfluenceDSL.g:4183:3: ruleEString
            {
             before(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__DescriptionAssignment_5_1"


    // $ANTLR start "rule__CompositeInfluence__InternalInfluencesAssignment_8"
    // InternalInfluenceDSL.g:4192:1: rule__CompositeInfluence__InternalInfluencesAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__CompositeInfluence__InternalInfluencesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4196:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4197:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4197:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4198:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_8_0()); 
            // InternalInfluenceDSL.g:4199:3: ( ruleEString )
            // InternalInfluenceDSL.g:4200:4: ruleEString
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__InternalInfluencesAssignment_8"


    // $ANTLR start "rule__CompositeInfluence__OwnedFunctionAssignment_9"
    // InternalInfluenceDSL.g:4211:1: rule__CompositeInfluence__OwnedFunctionAssignment_9 : ( ruleCompositeFunction ) ;
    public final void rule__CompositeInfluence__OwnedFunctionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4215:1: ( ( ruleCompositeFunction ) )
            // InternalInfluenceDSL.g:4216:2: ( ruleCompositeFunction )
            {
            // InternalInfluenceDSL.g:4216:2: ( ruleCompositeFunction )
            // InternalInfluenceDSL.g:4217:3: ruleCompositeFunction
            {
             before(grammarAccess.getCompositeInfluenceAccess().getOwnedFunctionCompositeFunctionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositeFunction();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getOwnedFunctionCompositeFunctionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__OwnedFunctionAssignment_9"


    // $ANTLR start "rule__CompositeInfluence__AffectsAssignment_11"
    // InternalInfluenceDSL.g:4226:1: rule__CompositeInfluence__AffectsAssignment_11 : ( ruleSystemResponse ) ;
    public final void rule__CompositeInfluence__AffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4230:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:4231:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:4231:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:4232:3: ruleSystemResponse
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__AffectsAssignment_11"


    // $ANTLR start "rule__CompositeInfluence__AffectsAssignment_12_1"
    // InternalInfluenceDSL.g:4241:1: rule__CompositeInfluence__AffectsAssignment_12_1 : ( ruleSystemResponse ) ;
    public final void rule__CompositeInfluence__AffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4245:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:4246:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:4246:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:4247:3: ruleSystemResponse
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInfluence__AffectsAssignment_12_1"


    // $ANTLR start "rule__Influence__NameAssignment_1"
    // InternalInfluenceDSL.g:4256:1: rule__Influence__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Influence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4260:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4261:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4261:2: ( ruleEString )
            // InternalInfluenceDSL.g:4262:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__NameAssignment_1"


    // $ANTLR start "rule__Influence__DescriptionAssignment_3"
    // InternalInfluenceDSL.g:4271:1: rule__Influence__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4275:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4276:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4276:2: ( ruleEString )
            // InternalInfluenceDSL.g:4277:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__DescriptionAssignment_3"


    // $ANTLR start "rule__Influence__DescriptionAssignment_4_1"
    // InternalInfluenceDSL.g:4286:1: rule__Influence__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4290:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4291:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4291:2: ( ruleEString )
            // InternalInfluenceDSL.g:4292:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Influence__OriginatorArtifactAssignment_8_0_1"
    // InternalInfluenceDSL.g:4301:1: rule__Influence__OriginatorArtifactAssignment_8_0_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorArtifactAssignment_8_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4305:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4306:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4306:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4307:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_8_0_1_0()); 
            // InternalInfluenceDSL.g:4308:3: ( ruleEString )
            // InternalInfluenceDSL.g:4309:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactEStringParserRuleCall_8_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactEStringParserRuleCall_8_0_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_8_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OriginatorArtifactAssignment_8_0_1"


    // $ANTLR start "rule__Influence__OriginatorPhenomenaAssignment_8_1_1"
    // InternalInfluenceDSL.g:4320:1: rule__Influence__OriginatorPhenomenaAssignment_8_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorPhenomenaAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4324:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4325:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4325:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4326:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_8_1_1_0()); 
            // InternalInfluenceDSL.g:4327:3: ( ruleEString )
            // InternalInfluenceDSL.g:4328:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaEStringParserRuleCall_8_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaEStringParserRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OriginatorPhenomenaAssignment_8_1_1"


    // $ANTLR start "rule__Influence__OriginatorSystemResponseAssignment_8_2_2"
    // InternalInfluenceDSL.g:4339:1: rule__Influence__OriginatorSystemResponseAssignment_8_2_2 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorSystemResponseAssignment_8_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4343:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4344:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4344:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4345:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_8_2_2_0()); 
            // InternalInfluenceDSL.g:4346:3: ( ruleEString )
            // InternalInfluenceDSL.g:4347:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseEStringParserRuleCall_8_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseEStringParserRuleCall_8_2_2_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_8_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OriginatorSystemResponseAssignment_8_2_2"


    // $ANTLR start "rule__Influence__OriginatorArtifactAssignment_9_1_0_1"
    // InternalInfluenceDSL.g:4358:1: rule__Influence__OriginatorArtifactAssignment_9_1_0_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorArtifactAssignment_9_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4362:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4363:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4363:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4364:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_9_1_0_1_0()); 
            // InternalInfluenceDSL.g:4365:3: ( ruleEString )
            // InternalInfluenceDSL.g:4366:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactEStringParserRuleCall_9_1_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactEStringParserRuleCall_9_1_0_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_9_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OriginatorArtifactAssignment_9_1_0_1"


    // $ANTLR start "rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1"
    // InternalInfluenceDSL.g:4377:1: rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4381:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4382:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4382:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4383:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_9_1_1_1_0()); 
            // InternalInfluenceDSL.g:4384:3: ( ruleEString )
            // InternalInfluenceDSL.g:4385:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaEStringParserRuleCall_9_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaEStringParserRuleCall_9_1_1_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_9_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1"


    // $ANTLR start "rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2"
    // InternalInfluenceDSL.g:4396:1: rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4400:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4401:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4401:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4402:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_9_1_2_2_0()); 
            // InternalInfluenceDSL.g:4403:3: ( ruleEString )
            // InternalInfluenceDSL.g:4404:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseEStringParserRuleCall_9_1_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseEStringParserRuleCall_9_1_2_2_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_9_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2"


    // $ANTLR start "rule__Influence__LikelihoodPerElementAssignment_10_2_2"
    // InternalInfluenceDSL.g:4415:1: rule__Influence__LikelihoodPerElementAssignment_10_2_2 : ( ruleEString ) ;
    public final void rule__Influence__LikelihoodPerElementAssignment_10_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4419:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4420:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4420:2: ( ruleEString )
            // InternalInfluenceDSL.g:4421:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getLikelihoodPerElementEStringParserRuleCall_10_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getLikelihoodPerElementEStringParserRuleCall_10_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__LikelihoodPerElementAssignment_10_2_2"


    // $ANTLR start "rule__Influence__LikelihoodPerElementAssignment_10_2_3_1"
    // InternalInfluenceDSL.g:4430:1: rule__Influence__LikelihoodPerElementAssignment_10_2_3_1 : ( ruleEString ) ;
    public final void rule__Influence__LikelihoodPerElementAssignment_10_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4434:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4435:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4435:2: ( ruleEString )
            // InternalInfluenceDSL.g:4436:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getLikelihoodPerElementEStringParserRuleCall_10_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getLikelihoodPerElementEStringParserRuleCall_10_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__LikelihoodPerElementAssignment_10_2_3_1"


    // $ANTLR start "rule__Influence__ConfidenceAssignment_10_3_2"
    // InternalInfluenceDSL.g:4445:1: rule__Influence__ConfidenceAssignment_10_3_2 : ( ruleEString ) ;
    public final void rule__Influence__ConfidenceAssignment_10_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4449:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4450:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4450:2: ( ruleEString )
            // InternalInfluenceDSL.g:4451:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getConfidenceEStringParserRuleCall_10_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getConfidenceEStringParserRuleCall_10_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__ConfidenceAssignment_10_3_2"


    // $ANTLR start "rule__Influence__ConfidenceAssignment_10_3_3_1"
    // InternalInfluenceDSL.g:4460:1: rule__Influence__ConfidenceAssignment_10_3_3_1 : ( ruleEString ) ;
    public final void rule__Influence__ConfidenceAssignment_10_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4464:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4465:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4465:2: ( ruleEString )
            // InternalInfluenceDSL.g:4466:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getConfidenceEStringParserRuleCall_10_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getConfidenceEStringParserRuleCall_10_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__ConfidenceAssignment_10_3_3_1"


    // $ANTLR start "rule__Influence__OwnedFunctionAssignment_11"
    // InternalInfluenceDSL.g:4475:1: rule__Influence__OwnedFunctionAssignment_11 : ( ruleFunction ) ;
    public final void rule__Influence__OwnedFunctionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4479:1: ( ( ruleFunction ) )
            // InternalInfluenceDSL.g:4480:2: ( ruleFunction )
            {
            // InternalInfluenceDSL.g:4480:2: ( ruleFunction )
            // InternalInfluenceDSL.g:4481:3: ruleFunction
            {
             before(grammarAccess.getInfluenceAccess().getOwnedFunctionFunctionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getOwnedFunctionFunctionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__OwnedFunctionAssignment_11"


    // $ANTLR start "rule__Influence__AffectsAssignment_13"
    // InternalInfluenceDSL.g:4490:1: rule__Influence__AffectsAssignment_13 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4494:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:4495:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:4495:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:4496:3: ruleSystemResponse
            {
             before(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__AffectsAssignment_13"


    // $ANTLR start "rule__Influence__AffectsAssignment_14_1"
    // InternalInfluenceDSL.g:4505:1: rule__Influence__AffectsAssignment_14_1 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4509:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:4510:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:4510:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:4511:3: ruleSystemResponse
            {
             before(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__AffectsAssignment_14_1"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalInfluenceDSL.g:4520:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4524:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:4525:2: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:4525:2: ( RULE_ID )
            // InternalInfluenceDSL.g:4526:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__DefinitionAssignment_3"
    // InternalInfluenceDSL.g:4535:1: rule__Function__DefinitionAssignment_3 : ( ruleEString ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4539:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4540:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4540:2: ( ruleEString )
            // InternalInfluenceDSL.g:4541:3: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getDefinitionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDefinitionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DefinitionAssignment_3"


    // $ANTLR start "rule__CompositeFunction__NameAssignment_1"
    // InternalInfluenceDSL.g:4550:1: rule__CompositeFunction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeFunction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4554:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:4555:2: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:4555:2: ( RULE_ID )
            // InternalInfluenceDSL.g:4556:3: RULE_ID
            {
             before(grammarAccess.getCompositeFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__NameAssignment_1"


    // $ANTLR start "rule__CompositeFunction__InputsAssignment_3"
    // InternalInfluenceDSL.g:4565:1: rule__CompositeFunction__InputsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CompositeFunction__InputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4569:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4570:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4570:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4571:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseCrossReference_3_0()); 
            // InternalInfluenceDSL.g:4572:3: ( ruleEString )
            // InternalInfluenceDSL.g:4573:4: ruleEString
            {
             before(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__InputsAssignment_3"


    // $ANTLR start "rule__CompositeFunction__InputsAssignment_4_1"
    // InternalInfluenceDSL.g:4584:1: rule__CompositeFunction__InputsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeFunction__InputsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4588:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4589:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4589:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4590:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseCrossReference_4_1_0()); 
            // InternalInfluenceDSL.g:4591:3: ( ruleEString )
            // InternalInfluenceDSL.g:4592:4: ruleEString
            {
             before(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCompositeFunctionAccess().getInputsSystemResponseCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFunction__InputsAssignment_4_1"


    // $ANTLR start "rule__PhysicalPhenomena__NameAssignment_1"
    // InternalInfluenceDSL.g:4603:1: rule__PhysicalPhenomena__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PhysicalPhenomena__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4607:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4608:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4608:2: ( ruleEString )
            // InternalInfluenceDSL.g:4609:3: ruleEString
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicalPhenomenaAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__NameAssignment_1"


    // $ANTLR start "rule__PhysicalPhenomena__DescriptionAssignment_2_1"
    // InternalInfluenceDSL.g:4618:1: rule__PhysicalPhenomena__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__PhysicalPhenomena__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4622:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4623:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4623:2: ( ruleEString )
            // InternalInfluenceDSL.g:4624:3: ruleEString
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__DescriptionAssignment_2_1"


    // $ANTLR start "rule__PhysicalPhenomena__DescriptionAssignment_2_2_1"
    // InternalInfluenceDSL.g:4633:1: rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__PhysicalPhenomena__DescriptionAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4637:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4638:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4638:2: ( ruleEString )
            // InternalInfluenceDSL.g:4639:3: ruleEString
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionEStringParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalPhenomena__DescriptionAssignment_2_2_1"


    // $ANTLR start "rule__RequirementSatisfaction__NameAssignment_1"
    // InternalInfluenceDSL.g:4648:1: rule__RequirementSatisfaction__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4652:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4653:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4653:2: ( ruleEString )
            // InternalInfluenceDSL.g:4654:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__NameAssignment_1"


    // $ANTLR start "rule__RequirementSatisfaction__SatisfactionAssignment_5"
    // InternalInfluenceDSL.g:4663:1: rule__RequirementSatisfaction__SatisfactionAssignment_5 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4667:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4668:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4668:2: ( ruleEString )
            // InternalInfluenceDSL.g:4669:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__SatisfactionAssignment_5"


    // $ANTLR start "rule__RequirementSatisfaction__SatisfactionAssignment_6_1"
    // InternalInfluenceDSL.g:4678:1: rule__RequirementSatisfaction__SatisfactionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4682:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4683:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4683:2: ( ruleEString )
            // InternalInfluenceDSL.g:4684:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__SatisfactionAssignment_6_1"


    // $ANTLR start "rule__RequirementSatisfaction__MetadataAssignment_7_2"
    // InternalInfluenceDSL.g:4693:1: rule__RequirementSatisfaction__MetadataAssignment_7_2 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__MetadataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4697:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4698:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4698:2: ( ruleEString )
            // InternalInfluenceDSL.g:4699:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getMetadataEStringParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getMetadataEStringParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__MetadataAssignment_7_2"


    // $ANTLR start "rule__RequirementSatisfaction__MetadataAssignment_7_3_1"
    // InternalInfluenceDSL.g:4708:1: rule__RequirementSatisfaction__MetadataAssignment_7_3_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__MetadataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4712:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4713:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4713:2: ( ruleEString )
            // InternalInfluenceDSL.g:4714:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getMetadataEStringParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getMetadataEStringParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__MetadataAssignment_7_3_1"


    // $ANTLR start "rule__DesignArtifact__NameAssignment_2"
    // InternalInfluenceDSL.g:4723:1: rule__DesignArtifact__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DesignArtifact__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4727:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4728:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4728:2: ( ruleEString )
            // InternalInfluenceDSL.g:4729:3: ruleEString
            {
             before(grammarAccess.getDesignArtifactAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDesignArtifactAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__NameAssignment_2"


    // $ANTLR start "rule__DesignArtifact__RefAssignment_4"
    // InternalInfluenceDSL.g:4738:1: rule__DesignArtifact__RefAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DesignArtifact__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4742:1: ( ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:4743:2: ( ( ruleQualifiedName ) )
            {
            // InternalInfluenceDSL.g:4743:2: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:4744:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0()); 
            // InternalInfluenceDSL.g:4745:3: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:4746:4: ruleQualifiedName
            {
             before(grammarAccess.getDesignArtifactAccess().getRefEObjectQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDesignArtifactAccess().getRefEObjectQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__RefAssignment_4"


    // $ANTLR start "rule__DesignArtifact__ChangeabilityAssignment_5_2"
    // InternalInfluenceDSL.g:4757:1: rule__DesignArtifact__ChangeabilityAssignment_5_2 : ( RULE_DOUBLE ) ;
    public final void rule__DesignArtifact__ChangeabilityAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4761:1: ( ( RULE_DOUBLE ) )
            // InternalInfluenceDSL.g:4762:2: ( RULE_DOUBLE )
            {
            // InternalInfluenceDSL.g:4762:2: ( RULE_DOUBLE )
            // InternalInfluenceDSL.g:4763:3: RULE_DOUBLE
            {
             before(grammarAccess.getDesignArtifactAccess().getChangeabilityDOUBLETerminalRuleCall_5_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDesignArtifactAccess().getChangeabilityDOUBLETerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignArtifact__ChangeabilityAssignment_5_2"


    // $ANTLR start "rule__SystemResponse__NameAssignment_3"
    // InternalInfluenceDSL.g:4772:1: rule__SystemResponse__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SystemResponse__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4776:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4777:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4777:2: ( ruleEString )
            // InternalInfluenceDSL.g:4778:3: ruleEString
            {
             before(grammarAccess.getSystemResponseAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemResponseAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__NameAssignment_3"


    // $ANTLR start "rule__SystemResponse__UsedInAssignment_4_2"
    // InternalInfluenceDSL.g:4787:1: rule__SystemResponse__UsedInAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__SystemResponse__UsedInAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4791:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4792:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4792:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4793:3: ( ruleEString )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_2_0()); 
            // InternalInfluenceDSL.g:4794:3: ( ruleEString )
            // InternalInfluenceDSL.g:4795:4: ruleEString
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInRequirementEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemResponseAccess().getUsedInRequirementEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__UsedInAssignment_4_2"


    // $ANTLR start "rule__SystemResponse__UsedInAssignment_4_3_1"
    // InternalInfluenceDSL.g:4806:1: rule__SystemResponse__UsedInAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SystemResponse__UsedInAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:4810:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:4811:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:4811:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4812:3: ( ruleEString )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_3_1_0()); 
            // InternalInfluenceDSL.g:4813:3: ( ruleEString )
            // InternalInfluenceDSL.g:4814:4: ruleEString
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInRequirementEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemResponseAccess().getUsedInRequirementEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__UsedInAssignment_4_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000980000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000980000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000520000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000090200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000002L});

}