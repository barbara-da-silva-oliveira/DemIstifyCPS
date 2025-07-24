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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'Composite'", "'Influence'", "'#**'", "'**#'", "'encapsulate'", "'affects'", "','", "'and'", "'originators'", "':'", "'artifact'", "'phenomena'", "'system'", "'response'", "'Phenomenon'", "'Requirement'", "'satisfied'", "'when'", "'DesignArtifact'", "'->'", "'used'", "'in'", "'.'"
    };
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRulePhysicalPhenomena"
    // InternalInfluenceDSL.g:153:1: entryRulePhysicalPhenomena : rulePhysicalPhenomena EOF ;
    public final void entryRulePhysicalPhenomena() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:154:1: ( rulePhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:155:1: rulePhysicalPhenomena EOF
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
    // InternalInfluenceDSL.g:162:1: rulePhysicalPhenomena : ( ( rule__PhysicalPhenomena__Group__0 ) ) ;
    public final void rulePhysicalPhenomena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:166:2: ( ( ( rule__PhysicalPhenomena__Group__0 ) ) )
            // InternalInfluenceDSL.g:167:2: ( ( rule__PhysicalPhenomena__Group__0 ) )
            {
            // InternalInfluenceDSL.g:167:2: ( ( rule__PhysicalPhenomena__Group__0 ) )
            // InternalInfluenceDSL.g:168:3: ( rule__PhysicalPhenomena__Group__0 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getGroup()); 
            // InternalInfluenceDSL.g:169:3: ( rule__PhysicalPhenomena__Group__0 )
            // InternalInfluenceDSL.g:169:4: rule__PhysicalPhenomena__Group__0
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
    // InternalInfluenceDSL.g:178:1: entryRuleRequirementSatisfaction : ruleRequirementSatisfaction EOF ;
    public final void entryRuleRequirementSatisfaction() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:179:1: ( ruleRequirementSatisfaction EOF )
            // InternalInfluenceDSL.g:180:1: ruleRequirementSatisfaction EOF
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
    // InternalInfluenceDSL.g:187:1: ruleRequirementSatisfaction : ( ( rule__RequirementSatisfaction__Group__0 ) ) ;
    public final void ruleRequirementSatisfaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:191:2: ( ( ( rule__RequirementSatisfaction__Group__0 ) ) )
            // InternalInfluenceDSL.g:192:2: ( ( rule__RequirementSatisfaction__Group__0 ) )
            {
            // InternalInfluenceDSL.g:192:2: ( ( rule__RequirementSatisfaction__Group__0 ) )
            // InternalInfluenceDSL.g:193:3: ( rule__RequirementSatisfaction__Group__0 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup()); 
            // InternalInfluenceDSL.g:194:3: ( rule__RequirementSatisfaction__Group__0 )
            // InternalInfluenceDSL.g:194:4: rule__RequirementSatisfaction__Group__0
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
    // InternalInfluenceDSL.g:203:1: entryRuleDesignArtifact : ruleDesignArtifact EOF ;
    public final void entryRuleDesignArtifact() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:204:1: ( ruleDesignArtifact EOF )
            // InternalInfluenceDSL.g:205:1: ruleDesignArtifact EOF
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
    // InternalInfluenceDSL.g:212:1: ruleDesignArtifact : ( ( rule__DesignArtifact__Group__0 ) ) ;
    public final void ruleDesignArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:216:2: ( ( ( rule__DesignArtifact__Group__0 ) ) )
            // InternalInfluenceDSL.g:217:2: ( ( rule__DesignArtifact__Group__0 ) )
            {
            // InternalInfluenceDSL.g:217:2: ( ( rule__DesignArtifact__Group__0 ) )
            // InternalInfluenceDSL.g:218:3: ( rule__DesignArtifact__Group__0 )
            {
             before(grammarAccess.getDesignArtifactAccess().getGroup()); 
            // InternalInfluenceDSL.g:219:3: ( rule__DesignArtifact__Group__0 )
            // InternalInfluenceDSL.g:219:4: rule__DesignArtifact__Group__0
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
    // InternalInfluenceDSL.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:229:1: ( ruleEString EOF )
            // InternalInfluenceDSL.g:230:1: ruleEString EOF
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
    // InternalInfluenceDSL.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalInfluenceDSL.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalInfluenceDSL.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalInfluenceDSL.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalInfluenceDSL.g:244:3: ( rule__EString__Alternatives )
            // InternalInfluenceDSL.g:244:4: rule__EString__Alternatives
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
    // InternalInfluenceDSL.g:253:1: entryRuleSystemResponse : ruleSystemResponse EOF ;
    public final void entryRuleSystemResponse() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:254:1: ( ruleSystemResponse EOF )
            // InternalInfluenceDSL.g:255:1: ruleSystemResponse EOF
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
    // InternalInfluenceDSL.g:262:1: ruleSystemResponse : ( ( rule__SystemResponse__Group__0 ) ) ;
    public final void ruleSystemResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:266:2: ( ( ( rule__SystemResponse__Group__0 ) ) )
            // InternalInfluenceDSL.g:267:2: ( ( rule__SystemResponse__Group__0 ) )
            {
            // InternalInfluenceDSL.g:267:2: ( ( rule__SystemResponse__Group__0 ) )
            // InternalInfluenceDSL.g:268:3: ( rule__SystemResponse__Group__0 )
            {
             before(grammarAccess.getSystemResponseAccess().getGroup()); 
            // InternalInfluenceDSL.g:269:3: ( rule__SystemResponse__Group__0 )
            // InternalInfluenceDSL.g:269:4: rule__SystemResponse__Group__0
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
    // InternalInfluenceDSL.g:278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:279:1: ( ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:280:1: ruleQualifiedName EOF
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
    // InternalInfluenceDSL.g:287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalInfluenceDSL.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalInfluenceDSL.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalInfluenceDSL.g:293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalInfluenceDSL.g:294:3: ( rule__QualifiedName__Group__0 )
            // InternalInfluenceDSL.g:294:4: rule__QualifiedName__Group__0
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
    // InternalInfluenceDSL.g:302:1: rule__InfluenceModel__Alternatives_3 : ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) );
    public final void rule__InfluenceModel__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:306:1: ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalInfluenceDSL.g:307:2: ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) )
                    {
                    // InternalInfluenceDSL.g:307:2: ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) )
                    // InternalInfluenceDSL.g:308:3: ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsAssignment_3_0()); 
                    // InternalInfluenceDSL.g:309:3: ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 )
                    // InternalInfluenceDSL.g:309:4: rule__InfluenceModel__OwnedArtifactsAssignment_3_0
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
                    // InternalInfluenceDSL.g:313:2: ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) )
                    {
                    // InternalInfluenceDSL.g:313:2: ( ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 ) )
                    // InternalInfluenceDSL.g:314:3: ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedRequirementsAssignment_3_1()); 
                    // InternalInfluenceDSL.g:315:3: ( rule__InfluenceModel__OwnedRequirementsAssignment_3_1 )
                    // InternalInfluenceDSL.g:315:4: rule__InfluenceModel__OwnedRequirementsAssignment_3_1
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
                    // InternalInfluenceDSL.g:319:2: ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) )
                    {
                    // InternalInfluenceDSL.g:319:2: ( ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 ) )
                    // InternalInfluenceDSL.g:320:3: ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedPhysicalPhenomenaAssignment_3_2()); 
                    // InternalInfluenceDSL.g:321:3: ( rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 )
                    // InternalInfluenceDSL.g:321:4: rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2
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
                    // InternalInfluenceDSL.g:325:2: ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) )
                    {
                    // InternalInfluenceDSL.g:325:2: ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) )
                    // InternalInfluenceDSL.g:326:3: ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAssignment_3_3()); 
                    // InternalInfluenceDSL.g:327:3: ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 )
                    // InternalInfluenceDSL.g:327:4: rule__InfluenceModel__OwnedInfluencesAssignment_3_3
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
    // InternalInfluenceDSL.g:335:1: rule__AbstractInfluence__Alternatives : ( ( ruleInfluence ) | ( ruleCompositeInfluence ) );
    public final void rule__AbstractInfluence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:339:1: ( ( ruleInfluence ) | ( ruleCompositeInfluence ) )
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
                    // InternalInfluenceDSL.g:340:2: ( ruleInfluence )
                    {
                    // InternalInfluenceDSL.g:340:2: ( ruleInfluence )
                    // InternalInfluenceDSL.g:341:3: ruleInfluence
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
                    // InternalInfluenceDSL.g:346:2: ( ruleCompositeInfluence )
                    {
                    // InternalInfluenceDSL.g:346:2: ( ruleCompositeInfluence )
                    // InternalInfluenceDSL.g:347:3: ruleCompositeInfluence
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
    // InternalInfluenceDSL.g:356:1: rule__Influence__Alternatives_8 : ( ( ( rule__Influence__Group_8_0__0 ) ) | ( ( rule__Influence__Group_8_1__0 ) ) | ( ( rule__Influence__Group_8_2__0 ) ) );
    public final void rule__Influence__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:360:1: ( ( ( rule__Influence__Group_8_0__0 ) ) | ( ( rule__Influence__Group_8_1__0 ) ) | ( ( rule__Influence__Group_8_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
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
                    // InternalInfluenceDSL.g:361:2: ( ( rule__Influence__Group_8_0__0 ) )
                    {
                    // InternalInfluenceDSL.g:361:2: ( ( rule__Influence__Group_8_0__0 ) )
                    // InternalInfluenceDSL.g:362:3: ( rule__Influence__Group_8_0__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_8_0()); 
                    // InternalInfluenceDSL.g:363:3: ( rule__Influence__Group_8_0__0 )
                    // InternalInfluenceDSL.g:363:4: rule__Influence__Group_8_0__0
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
                    // InternalInfluenceDSL.g:367:2: ( ( rule__Influence__Group_8_1__0 ) )
                    {
                    // InternalInfluenceDSL.g:367:2: ( ( rule__Influence__Group_8_1__0 ) )
                    // InternalInfluenceDSL.g:368:3: ( rule__Influence__Group_8_1__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_8_1()); 
                    // InternalInfluenceDSL.g:369:3: ( rule__Influence__Group_8_1__0 )
                    // InternalInfluenceDSL.g:369:4: rule__Influence__Group_8_1__0
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
                    // InternalInfluenceDSL.g:373:2: ( ( rule__Influence__Group_8_2__0 ) )
                    {
                    // InternalInfluenceDSL.g:373:2: ( ( rule__Influence__Group_8_2__0 ) )
                    // InternalInfluenceDSL.g:374:3: ( rule__Influence__Group_8_2__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_8_2()); 
                    // InternalInfluenceDSL.g:375:3: ( rule__Influence__Group_8_2__0 )
                    // InternalInfluenceDSL.g:375:4: rule__Influence__Group_8_2__0
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
    // InternalInfluenceDSL.g:383:1: rule__Influence__Alternatives_9_1 : ( ( ( rule__Influence__Group_9_1_0__0 ) ) | ( ( rule__Influence__Group_9_1_1__0 ) ) | ( ( rule__Influence__Group_9_1_2__0 ) ) );
    public final void rule__Influence__Alternatives_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:387:1: ( ( ( rule__Influence__Group_9_1_0__0 ) ) | ( ( rule__Influence__Group_9_1_1__0 ) ) | ( ( rule__Influence__Group_9_1_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
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
                    // InternalInfluenceDSL.g:388:2: ( ( rule__Influence__Group_9_1_0__0 ) )
                    {
                    // InternalInfluenceDSL.g:388:2: ( ( rule__Influence__Group_9_1_0__0 ) )
                    // InternalInfluenceDSL.g:389:3: ( rule__Influence__Group_9_1_0__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_9_1_0()); 
                    // InternalInfluenceDSL.g:390:3: ( rule__Influence__Group_9_1_0__0 )
                    // InternalInfluenceDSL.g:390:4: rule__Influence__Group_9_1_0__0
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
                    // InternalInfluenceDSL.g:394:2: ( ( rule__Influence__Group_9_1_1__0 ) )
                    {
                    // InternalInfluenceDSL.g:394:2: ( ( rule__Influence__Group_9_1_1__0 ) )
                    // InternalInfluenceDSL.g:395:3: ( rule__Influence__Group_9_1_1__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_9_1_1()); 
                    // InternalInfluenceDSL.g:396:3: ( rule__Influence__Group_9_1_1__0 )
                    // InternalInfluenceDSL.g:396:4: rule__Influence__Group_9_1_1__0
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
                    // InternalInfluenceDSL.g:400:2: ( ( rule__Influence__Group_9_1_2__0 ) )
                    {
                    // InternalInfluenceDSL.g:400:2: ( ( rule__Influence__Group_9_1_2__0 ) )
                    // InternalInfluenceDSL.g:401:3: ( rule__Influence__Group_9_1_2__0 )
                    {
                     before(grammarAccess.getInfluenceAccess().getGroup_9_1_2()); 
                    // InternalInfluenceDSL.g:402:3: ( rule__Influence__Group_9_1_2__0 )
                    // InternalInfluenceDSL.g:402:4: rule__Influence__Group_9_1_2__0
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
    // InternalInfluenceDSL.g:410:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:414:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalInfluenceDSL.g:415:2: ( RULE_STRING )
                    {
                    // InternalInfluenceDSL.g:415:2: ( RULE_STRING )
                    // InternalInfluenceDSL.g:416:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:421:2: ( RULE_ID )
                    {
                    // InternalInfluenceDSL.g:421:2: ( RULE_ID )
                    // InternalInfluenceDSL.g:422:3: RULE_ID
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
    // InternalInfluenceDSL.g:431:1: rule__InfluenceModel__Group__0 : rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 ;
    public final void rule__InfluenceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:435:1: ( rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 )
            // InternalInfluenceDSL.g:436:2: rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1
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
    // InternalInfluenceDSL.g:443:1: rule__InfluenceModel__Group__0__Impl : ( () ) ;
    public final void rule__InfluenceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:447:1: ( ( () ) )
            // InternalInfluenceDSL.g:448:1: ( () )
            {
            // InternalInfluenceDSL.g:448:1: ( () )
            // InternalInfluenceDSL.g:449:2: ()
            {
             before(grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0()); 
            // InternalInfluenceDSL.g:450:2: ()
            // InternalInfluenceDSL.g:450:3: 
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
    // InternalInfluenceDSL.g:458:1: rule__InfluenceModel__Group__1 : rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 ;
    public final void rule__InfluenceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:462:1: ( rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 )
            // InternalInfluenceDSL.g:463:2: rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2
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
    // InternalInfluenceDSL.g:470:1: rule__InfluenceModel__Group__1__Impl : ( 'InfluenceModel' ) ;
    public final void rule__InfluenceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:474:1: ( ( 'InfluenceModel' ) )
            // InternalInfluenceDSL.g:475:1: ( 'InfluenceModel' )
            {
            // InternalInfluenceDSL.g:475:1: ( 'InfluenceModel' )
            // InternalInfluenceDSL.g:476:2: 'InfluenceModel'
            {
             before(grammarAccess.getInfluenceModelAccess().getInfluenceModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:485:1: rule__InfluenceModel__Group__2 : rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 ;
    public final void rule__InfluenceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:489:1: ( rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 )
            // InternalInfluenceDSL.g:490:2: rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3
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
    // InternalInfluenceDSL.g:497:1: rule__InfluenceModel__Group__2__Impl : ( ( rule__InfluenceModel__NameAssignment_2 ) ) ;
    public final void rule__InfluenceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:501:1: ( ( ( rule__InfluenceModel__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:502:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:502:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:503:2: ( rule__InfluenceModel__NameAssignment_2 )
            {
             before(grammarAccess.getInfluenceModelAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:504:2: ( rule__InfluenceModel__NameAssignment_2 )
            // InternalInfluenceDSL.g:504:3: rule__InfluenceModel__NameAssignment_2
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
    // InternalInfluenceDSL.g:512:1: rule__InfluenceModel__Group__3 : rule__InfluenceModel__Group__3__Impl ;
    public final void rule__InfluenceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:516:1: ( rule__InfluenceModel__Group__3__Impl )
            // InternalInfluenceDSL.g:517:2: rule__InfluenceModel__Group__3__Impl
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
    // InternalInfluenceDSL.g:523:1: rule__InfluenceModel__Group__3__Impl : ( ( rule__InfluenceModel__Alternatives_3 )* ) ;
    public final void rule__InfluenceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:527:1: ( ( ( rule__InfluenceModel__Alternatives_3 )* ) )
            // InternalInfluenceDSL.g:528:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            {
            // InternalInfluenceDSL.g:528:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            // InternalInfluenceDSL.g:529:2: ( rule__InfluenceModel__Alternatives_3 )*
            {
             before(grammarAccess.getInfluenceModelAccess().getAlternatives_3()); 
            // InternalInfluenceDSL.g:530:2: ( rule__InfluenceModel__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=13)||(LA6_0>=26 && LA6_0<=27)||LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInfluenceDSL.g:530:3: rule__InfluenceModel__Alternatives_3
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
    // InternalInfluenceDSL.g:539:1: rule__CompositeInfluence__Group__0 : rule__CompositeInfluence__Group__0__Impl rule__CompositeInfluence__Group__1 ;
    public final void rule__CompositeInfluence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:543:1: ( rule__CompositeInfluence__Group__0__Impl rule__CompositeInfluence__Group__1 )
            // InternalInfluenceDSL.g:544:2: rule__CompositeInfluence__Group__0__Impl rule__CompositeInfluence__Group__1
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
    // InternalInfluenceDSL.g:551:1: rule__CompositeInfluence__Group__0__Impl : ( 'Composite' ) ;
    public final void rule__CompositeInfluence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:555:1: ( ( 'Composite' ) )
            // InternalInfluenceDSL.g:556:1: ( 'Composite' )
            {
            // InternalInfluenceDSL.g:556:1: ( 'Composite' )
            // InternalInfluenceDSL.g:557:2: 'Composite'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getCompositeKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:566:1: rule__CompositeInfluence__Group__1 : rule__CompositeInfluence__Group__1__Impl rule__CompositeInfluence__Group__2 ;
    public final void rule__CompositeInfluence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:570:1: ( rule__CompositeInfluence__Group__1__Impl rule__CompositeInfluence__Group__2 )
            // InternalInfluenceDSL.g:571:2: rule__CompositeInfluence__Group__1__Impl rule__CompositeInfluence__Group__2
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
    // InternalInfluenceDSL.g:578:1: rule__CompositeInfluence__Group__1__Impl : ( 'Influence' ) ;
    public final void rule__CompositeInfluence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:582:1: ( ( 'Influence' ) )
            // InternalInfluenceDSL.g:583:1: ( 'Influence' )
            {
            // InternalInfluenceDSL.g:583:1: ( 'Influence' )
            // InternalInfluenceDSL.g:584:2: 'Influence'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInfluenceKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:593:1: rule__CompositeInfluence__Group__2 : rule__CompositeInfluence__Group__2__Impl rule__CompositeInfluence__Group__3 ;
    public final void rule__CompositeInfluence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:597:1: ( rule__CompositeInfluence__Group__2__Impl rule__CompositeInfluence__Group__3 )
            // InternalInfluenceDSL.g:598:2: rule__CompositeInfluence__Group__2__Impl rule__CompositeInfluence__Group__3
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
    // InternalInfluenceDSL.g:605:1: rule__CompositeInfluence__Group__2__Impl : ( ( rule__CompositeInfluence__NameAssignment_2 ) ) ;
    public final void rule__CompositeInfluence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:609:1: ( ( ( rule__CompositeInfluence__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:610:1: ( ( rule__CompositeInfluence__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:610:1: ( ( rule__CompositeInfluence__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:611:2: ( rule__CompositeInfluence__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:612:2: ( rule__CompositeInfluence__NameAssignment_2 )
            // InternalInfluenceDSL.g:612:3: rule__CompositeInfluence__NameAssignment_2
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
    // InternalInfluenceDSL.g:620:1: rule__CompositeInfluence__Group__3 : rule__CompositeInfluence__Group__3__Impl rule__CompositeInfluence__Group__4 ;
    public final void rule__CompositeInfluence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:624:1: ( rule__CompositeInfluence__Group__3__Impl rule__CompositeInfluence__Group__4 )
            // InternalInfluenceDSL.g:625:2: rule__CompositeInfluence__Group__3__Impl rule__CompositeInfluence__Group__4
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
    // InternalInfluenceDSL.g:632:1: rule__CompositeInfluence__Group__3__Impl : ( '#**' ) ;
    public final void rule__CompositeInfluence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:636:1: ( ( '#**' ) )
            // InternalInfluenceDSL.g:637:1: ( '#**' )
            {
            // InternalInfluenceDSL.g:637:1: ( '#**' )
            // InternalInfluenceDSL.g:638:2: '#**'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:647:1: rule__CompositeInfluence__Group__4 : rule__CompositeInfluence__Group__4__Impl rule__CompositeInfluence__Group__5 ;
    public final void rule__CompositeInfluence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:651:1: ( rule__CompositeInfluence__Group__4__Impl rule__CompositeInfluence__Group__5 )
            // InternalInfluenceDSL.g:652:2: rule__CompositeInfluence__Group__4__Impl rule__CompositeInfluence__Group__5
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
    // InternalInfluenceDSL.g:659:1: rule__CompositeInfluence__Group__4__Impl : ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) ) ;
    public final void rule__CompositeInfluence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:663:1: ( ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) ) )
            // InternalInfluenceDSL.g:664:1: ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) )
            {
            // InternalInfluenceDSL.g:664:1: ( ( rule__CompositeInfluence__DescriptionAssignment_4 ) )
            // InternalInfluenceDSL.g:665:2: ( rule__CompositeInfluence__DescriptionAssignment_4 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getDescriptionAssignment_4()); 
            // InternalInfluenceDSL.g:666:2: ( rule__CompositeInfluence__DescriptionAssignment_4 )
            // InternalInfluenceDSL.g:666:3: rule__CompositeInfluence__DescriptionAssignment_4
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
    // InternalInfluenceDSL.g:674:1: rule__CompositeInfluence__Group__5 : rule__CompositeInfluence__Group__5__Impl rule__CompositeInfluence__Group__6 ;
    public final void rule__CompositeInfluence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:678:1: ( rule__CompositeInfluence__Group__5__Impl rule__CompositeInfluence__Group__6 )
            // InternalInfluenceDSL.g:679:2: rule__CompositeInfluence__Group__5__Impl rule__CompositeInfluence__Group__6
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
    // InternalInfluenceDSL.g:686:1: rule__CompositeInfluence__Group__5__Impl : ( ( rule__CompositeInfluence__Group_5__0 )* ) ;
    public final void rule__CompositeInfluence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:690:1: ( ( ( rule__CompositeInfluence__Group_5__0 )* ) )
            // InternalInfluenceDSL.g:691:1: ( ( rule__CompositeInfluence__Group_5__0 )* )
            {
            // InternalInfluenceDSL.g:691:1: ( ( rule__CompositeInfluence__Group_5__0 )* )
            // InternalInfluenceDSL.g:692:2: ( rule__CompositeInfluence__Group_5__0 )*
            {
             before(grammarAccess.getCompositeInfluenceAccess().getGroup_5()); 
            // InternalInfluenceDSL.g:693:2: ( rule__CompositeInfluence__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInfluenceDSL.g:693:3: rule__CompositeInfluence__Group_5__0
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
    // InternalInfluenceDSL.g:701:1: rule__CompositeInfluence__Group__6 : rule__CompositeInfluence__Group__6__Impl rule__CompositeInfluence__Group__7 ;
    public final void rule__CompositeInfluence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:705:1: ( rule__CompositeInfluence__Group__6__Impl rule__CompositeInfluence__Group__7 )
            // InternalInfluenceDSL.g:706:2: rule__CompositeInfluence__Group__6__Impl rule__CompositeInfluence__Group__7
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
    // InternalInfluenceDSL.g:713:1: rule__CompositeInfluence__Group__6__Impl : ( ( '**#' )? ) ;
    public final void rule__CompositeInfluence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:717:1: ( ( ( '**#' )? ) )
            // InternalInfluenceDSL.g:718:1: ( ( '**#' )? )
            {
            // InternalInfluenceDSL.g:718:1: ( ( '**#' )? )
            // InternalInfluenceDSL.g:719:2: ( '**#' )?
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_6()); 
            // InternalInfluenceDSL.g:720:2: ( '**#' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInfluenceDSL.g:720:3: '**#'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalInfluenceDSL.g:728:1: rule__CompositeInfluence__Group__7 : rule__CompositeInfluence__Group__7__Impl rule__CompositeInfluence__Group__8 ;
    public final void rule__CompositeInfluence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:732:1: ( rule__CompositeInfluence__Group__7__Impl rule__CompositeInfluence__Group__8 )
            // InternalInfluenceDSL.g:733:2: rule__CompositeInfluence__Group__7__Impl rule__CompositeInfluence__Group__8
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
    // InternalInfluenceDSL.g:740:1: rule__CompositeInfluence__Group__7__Impl : ( 'encapsulate' ) ;
    public final void rule__CompositeInfluence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:744:1: ( ( 'encapsulate' ) )
            // InternalInfluenceDSL.g:745:1: ( 'encapsulate' )
            {
            // InternalInfluenceDSL.g:745:1: ( 'encapsulate' )
            // InternalInfluenceDSL.g:746:2: 'encapsulate'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getEncapsulateKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:755:1: rule__CompositeInfluence__Group__8 : rule__CompositeInfluence__Group__8__Impl rule__CompositeInfluence__Group__9 ;
    public final void rule__CompositeInfluence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:759:1: ( rule__CompositeInfluence__Group__8__Impl rule__CompositeInfluence__Group__9 )
            // InternalInfluenceDSL.g:760:2: rule__CompositeInfluence__Group__8__Impl rule__CompositeInfluence__Group__9
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
    // InternalInfluenceDSL.g:767:1: rule__CompositeInfluence__Group__8__Impl : ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* ) ;
    public final void rule__CompositeInfluence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:771:1: ( ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* ) )
            // InternalInfluenceDSL.g:772:1: ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* )
            {
            // InternalInfluenceDSL.g:772:1: ( ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )* )
            // InternalInfluenceDSL.g:773:2: ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )*
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAssignment_8()); 
            // InternalInfluenceDSL.g:774:2: ( rule__CompositeInfluence__InternalInfluencesAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInfluenceDSL.g:774:3: rule__CompositeInfluence__InternalInfluencesAssignment_8
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
    // InternalInfluenceDSL.g:782:1: rule__CompositeInfluence__Group__9 : rule__CompositeInfluence__Group__9__Impl rule__CompositeInfluence__Group__10 ;
    public final void rule__CompositeInfluence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:786:1: ( rule__CompositeInfluence__Group__9__Impl rule__CompositeInfluence__Group__10 )
            // InternalInfluenceDSL.g:787:2: rule__CompositeInfluence__Group__9__Impl rule__CompositeInfluence__Group__10
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
    // InternalInfluenceDSL.g:794:1: rule__CompositeInfluence__Group__9__Impl : ( 'affects' ) ;
    public final void rule__CompositeInfluence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:798:1: ( ( 'affects' ) )
            // InternalInfluenceDSL.g:799:1: ( 'affects' )
            {
            // InternalInfluenceDSL.g:799:1: ( 'affects' )
            // InternalInfluenceDSL.g:800:2: 'affects'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getAffectsKeyword_9()); 

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
    // InternalInfluenceDSL.g:809:1: rule__CompositeInfluence__Group__10 : rule__CompositeInfluence__Group__10__Impl rule__CompositeInfluence__Group__11 ;
    public final void rule__CompositeInfluence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:813:1: ( rule__CompositeInfluence__Group__10__Impl rule__CompositeInfluence__Group__11 )
            // InternalInfluenceDSL.g:814:2: rule__CompositeInfluence__Group__10__Impl rule__CompositeInfluence__Group__11
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
    // InternalInfluenceDSL.g:821:1: rule__CompositeInfluence__Group__10__Impl : ( ( rule__CompositeInfluence__AffectsAssignment_10 ) ) ;
    public final void rule__CompositeInfluence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:825:1: ( ( ( rule__CompositeInfluence__AffectsAssignment_10 ) ) )
            // InternalInfluenceDSL.g:826:1: ( ( rule__CompositeInfluence__AffectsAssignment_10 ) )
            {
            // InternalInfluenceDSL.g:826:1: ( ( rule__CompositeInfluence__AffectsAssignment_10 ) )
            // InternalInfluenceDSL.g:827:2: ( rule__CompositeInfluence__AffectsAssignment_10 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_10()); 
            // InternalInfluenceDSL.g:828:2: ( rule__CompositeInfluence__AffectsAssignment_10 )
            // InternalInfluenceDSL.g:828:3: rule__CompositeInfluence__AffectsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__AffectsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_10()); 

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
    // InternalInfluenceDSL.g:836:1: rule__CompositeInfluence__Group__11 : rule__CompositeInfluence__Group__11__Impl ;
    public final void rule__CompositeInfluence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:840:1: ( rule__CompositeInfluence__Group__11__Impl )
            // InternalInfluenceDSL.g:841:2: rule__CompositeInfluence__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group__11__Impl();

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
    // InternalInfluenceDSL.g:847:1: rule__CompositeInfluence__Group__11__Impl : ( ( rule__CompositeInfluence__Group_11__0 )* ) ;
    public final void rule__CompositeInfluence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:851:1: ( ( ( rule__CompositeInfluence__Group_11__0 )* ) )
            // InternalInfluenceDSL.g:852:1: ( ( rule__CompositeInfluence__Group_11__0 )* )
            {
            // InternalInfluenceDSL.g:852:1: ( ( rule__CompositeInfluence__Group_11__0 )* )
            // InternalInfluenceDSL.g:853:2: ( rule__CompositeInfluence__Group_11__0 )*
            {
             before(grammarAccess.getCompositeInfluenceAccess().getGroup_11()); 
            // InternalInfluenceDSL.g:854:2: ( rule__CompositeInfluence__Group_11__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInfluenceDSL.g:854:3: rule__CompositeInfluence__Group_11__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CompositeInfluence__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompositeInfluenceAccess().getGroup_11()); 

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


    // $ANTLR start "rule__CompositeInfluence__Group_5__0"
    // InternalInfluenceDSL.g:863:1: rule__CompositeInfluence__Group_5__0 : rule__CompositeInfluence__Group_5__0__Impl rule__CompositeInfluence__Group_5__1 ;
    public final void rule__CompositeInfluence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:867:1: ( rule__CompositeInfluence__Group_5__0__Impl rule__CompositeInfluence__Group_5__1 )
            // InternalInfluenceDSL.g:868:2: rule__CompositeInfluence__Group_5__0__Impl rule__CompositeInfluence__Group_5__1
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
    // InternalInfluenceDSL.g:875:1: rule__CompositeInfluence__Group_5__0__Impl : ( ',' ) ;
    public final void rule__CompositeInfluence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:879:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:880:1: ( ',' )
            {
            // InternalInfluenceDSL.g:880:1: ( ',' )
            // InternalInfluenceDSL.g:881:2: ','
            {
             before(grammarAccess.getCompositeInfluenceAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:890:1: rule__CompositeInfluence__Group_5__1 : rule__CompositeInfluence__Group_5__1__Impl ;
    public final void rule__CompositeInfluence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:894:1: ( rule__CompositeInfluence__Group_5__1__Impl )
            // InternalInfluenceDSL.g:895:2: rule__CompositeInfluence__Group_5__1__Impl
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
    // InternalInfluenceDSL.g:901:1: rule__CompositeInfluence__Group_5__1__Impl : ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CompositeInfluence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:905:1: ( ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) ) )
            // InternalInfluenceDSL.g:906:1: ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) )
            {
            // InternalInfluenceDSL.g:906:1: ( ( rule__CompositeInfluence__DescriptionAssignment_5_1 ) )
            // InternalInfluenceDSL.g:907:2: ( rule__CompositeInfluence__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getDescriptionAssignment_5_1()); 
            // InternalInfluenceDSL.g:908:2: ( rule__CompositeInfluence__DescriptionAssignment_5_1 )
            // InternalInfluenceDSL.g:908:3: rule__CompositeInfluence__DescriptionAssignment_5_1
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


    // $ANTLR start "rule__CompositeInfluence__Group_11__0"
    // InternalInfluenceDSL.g:917:1: rule__CompositeInfluence__Group_11__0 : rule__CompositeInfluence__Group_11__0__Impl rule__CompositeInfluence__Group_11__1 ;
    public final void rule__CompositeInfluence__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:921:1: ( rule__CompositeInfluence__Group_11__0__Impl rule__CompositeInfluence__Group_11__1 )
            // InternalInfluenceDSL.g:922:2: rule__CompositeInfluence__Group_11__0__Impl rule__CompositeInfluence__Group_11__1
            {
            pushFollow(FOLLOW_13);
            rule__CompositeInfluence__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group_11__1();

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
    // $ANTLR end "rule__CompositeInfluence__Group_11__0"


    // $ANTLR start "rule__CompositeInfluence__Group_11__0__Impl"
    // InternalInfluenceDSL.g:929:1: rule__CompositeInfluence__Group_11__0__Impl : ( 'and' ) ;
    public final void rule__CompositeInfluence__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:933:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:934:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:934:1: ( 'and' )
            // InternalInfluenceDSL.g:935:2: 'and'
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAndKeyword_11_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompositeInfluenceAccess().getAndKeyword_11_0()); 

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
    // $ANTLR end "rule__CompositeInfluence__Group_11__0__Impl"


    // $ANTLR start "rule__CompositeInfluence__Group_11__1"
    // InternalInfluenceDSL.g:944:1: rule__CompositeInfluence__Group_11__1 : rule__CompositeInfluence__Group_11__1__Impl ;
    public final void rule__CompositeInfluence__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:948:1: ( rule__CompositeInfluence__Group_11__1__Impl )
            // InternalInfluenceDSL.g:949:2: rule__CompositeInfluence__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__Group_11__1__Impl();

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
    // $ANTLR end "rule__CompositeInfluence__Group_11__1"


    // $ANTLR start "rule__CompositeInfluence__Group_11__1__Impl"
    // InternalInfluenceDSL.g:955:1: rule__CompositeInfluence__Group_11__1__Impl : ( ( rule__CompositeInfluence__AffectsAssignment_11_1 ) ) ;
    public final void rule__CompositeInfluence__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:959:1: ( ( ( rule__CompositeInfluence__AffectsAssignment_11_1 ) ) )
            // InternalInfluenceDSL.g:960:1: ( ( rule__CompositeInfluence__AffectsAssignment_11_1 ) )
            {
            // InternalInfluenceDSL.g:960:1: ( ( rule__CompositeInfluence__AffectsAssignment_11_1 ) )
            // InternalInfluenceDSL.g:961:2: ( rule__CompositeInfluence__AffectsAssignment_11_1 )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_11_1()); 
            // InternalInfluenceDSL.g:962:2: ( rule__CompositeInfluence__AffectsAssignment_11_1 )
            // InternalInfluenceDSL.g:962:3: rule__CompositeInfluence__AffectsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInfluence__AffectsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsAssignment_11_1()); 

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
    // $ANTLR end "rule__CompositeInfluence__Group_11__1__Impl"


    // $ANTLR start "rule__Influence__Group__0"
    // InternalInfluenceDSL.g:971:1: rule__Influence__Group__0 : rule__Influence__Group__0__Impl rule__Influence__Group__1 ;
    public final void rule__Influence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:975:1: ( rule__Influence__Group__0__Impl rule__Influence__Group__1 )
            // InternalInfluenceDSL.g:976:2: rule__Influence__Group__0__Impl rule__Influence__Group__1
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
    // InternalInfluenceDSL.g:983:1: rule__Influence__Group__0__Impl : ( 'Influence' ) ;
    public final void rule__Influence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:987:1: ( ( 'Influence' ) )
            // InternalInfluenceDSL.g:988:1: ( 'Influence' )
            {
            // InternalInfluenceDSL.g:988:1: ( 'Influence' )
            // InternalInfluenceDSL.g:989:2: 'Influence'
            {
             before(grammarAccess.getInfluenceAccess().getInfluenceKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:998:1: rule__Influence__Group__1 : rule__Influence__Group__1__Impl rule__Influence__Group__2 ;
    public final void rule__Influence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1002:1: ( rule__Influence__Group__1__Impl rule__Influence__Group__2 )
            // InternalInfluenceDSL.g:1003:2: rule__Influence__Group__1__Impl rule__Influence__Group__2
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
    // InternalInfluenceDSL.g:1010:1: rule__Influence__Group__1__Impl : ( ( rule__Influence__NameAssignment_1 ) ) ;
    public final void rule__Influence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1014:1: ( ( ( rule__Influence__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:1015:1: ( ( rule__Influence__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:1015:1: ( ( rule__Influence__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:1016:2: ( rule__Influence__NameAssignment_1 )
            {
             before(grammarAccess.getInfluenceAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:1017:2: ( rule__Influence__NameAssignment_1 )
            // InternalInfluenceDSL.g:1017:3: rule__Influence__NameAssignment_1
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
    // InternalInfluenceDSL.g:1025:1: rule__Influence__Group__2 : rule__Influence__Group__2__Impl rule__Influence__Group__3 ;
    public final void rule__Influence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1029:1: ( rule__Influence__Group__2__Impl rule__Influence__Group__3 )
            // InternalInfluenceDSL.g:1030:2: rule__Influence__Group__2__Impl rule__Influence__Group__3
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
    // InternalInfluenceDSL.g:1037:1: rule__Influence__Group__2__Impl : ( '#**' ) ;
    public final void rule__Influence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1041:1: ( ( '#**' ) )
            // InternalInfluenceDSL.g:1042:1: ( '#**' )
            {
            // InternalInfluenceDSL.g:1042:1: ( '#**' )
            // InternalInfluenceDSL.g:1043:2: '#**'
            {
             before(grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1052:1: rule__Influence__Group__3 : rule__Influence__Group__3__Impl rule__Influence__Group__4 ;
    public final void rule__Influence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1056:1: ( rule__Influence__Group__3__Impl rule__Influence__Group__4 )
            // InternalInfluenceDSL.g:1057:2: rule__Influence__Group__3__Impl rule__Influence__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalInfluenceDSL.g:1064:1: rule__Influence__Group__3__Impl : ( ( rule__Influence__DescriptionAssignment_3 ) ) ;
    public final void rule__Influence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1068:1: ( ( ( rule__Influence__DescriptionAssignment_3 ) ) )
            // InternalInfluenceDSL.g:1069:1: ( ( rule__Influence__DescriptionAssignment_3 ) )
            {
            // InternalInfluenceDSL.g:1069:1: ( ( rule__Influence__DescriptionAssignment_3 ) )
            // InternalInfluenceDSL.g:1070:2: ( rule__Influence__DescriptionAssignment_3 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_3()); 
            // InternalInfluenceDSL.g:1071:2: ( rule__Influence__DescriptionAssignment_3 )
            // InternalInfluenceDSL.g:1071:3: rule__Influence__DescriptionAssignment_3
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
    // InternalInfluenceDSL.g:1079:1: rule__Influence__Group__4 : rule__Influence__Group__4__Impl rule__Influence__Group__5 ;
    public final void rule__Influence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1083:1: ( rule__Influence__Group__4__Impl rule__Influence__Group__5 )
            // InternalInfluenceDSL.g:1084:2: rule__Influence__Group__4__Impl rule__Influence__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalInfluenceDSL.g:1091:1: rule__Influence__Group__4__Impl : ( ( rule__Influence__Group_4__0 )* ) ;
    public final void rule__Influence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1095:1: ( ( ( rule__Influence__Group_4__0 )* ) )
            // InternalInfluenceDSL.g:1096:1: ( ( rule__Influence__Group_4__0 )* )
            {
            // InternalInfluenceDSL.g:1096:1: ( ( rule__Influence__Group_4__0 )* )
            // InternalInfluenceDSL.g:1097:2: ( rule__Influence__Group_4__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:1098:2: ( rule__Influence__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1098:3: rule__Influence__Group_4__0
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
    // InternalInfluenceDSL.g:1106:1: rule__Influence__Group__5 : rule__Influence__Group__5__Impl rule__Influence__Group__6 ;
    public final void rule__Influence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1110:1: ( rule__Influence__Group__5__Impl rule__Influence__Group__6 )
            // InternalInfluenceDSL.g:1111:2: rule__Influence__Group__5__Impl rule__Influence__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalInfluenceDSL.g:1118:1: rule__Influence__Group__5__Impl : ( ( '**#' )? ) ;
    public final void rule__Influence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1122:1: ( ( ( '**#' )? ) )
            // InternalInfluenceDSL.g:1123:1: ( ( '**#' )? )
            {
            // InternalInfluenceDSL.g:1123:1: ( ( '**#' )? )
            // InternalInfluenceDSL.g:1124:2: ( '**#' )?
            {
             before(grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_5()); 
            // InternalInfluenceDSL.g:1125:2: ( '**#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInfluenceDSL.g:1125:3: '**#'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalInfluenceDSL.g:1133:1: rule__Influence__Group__6 : rule__Influence__Group__6__Impl rule__Influence__Group__7 ;
    public final void rule__Influence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1137:1: ( rule__Influence__Group__6__Impl rule__Influence__Group__7 )
            // InternalInfluenceDSL.g:1138:2: rule__Influence__Group__6__Impl rule__Influence__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalInfluenceDSL.g:1145:1: rule__Influence__Group__6__Impl : ( 'originators' ) ;
    public final void rule__Influence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1149:1: ( ( 'originators' ) )
            // InternalInfluenceDSL.g:1150:1: ( 'originators' )
            {
            // InternalInfluenceDSL.g:1150:1: ( 'originators' )
            // InternalInfluenceDSL.g:1151:2: 'originators'
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorsKeyword_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1160:1: rule__Influence__Group__7 : rule__Influence__Group__7__Impl rule__Influence__Group__8 ;
    public final void rule__Influence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1164:1: ( rule__Influence__Group__7__Impl rule__Influence__Group__8 )
            // InternalInfluenceDSL.g:1165:2: rule__Influence__Group__7__Impl rule__Influence__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalInfluenceDSL.g:1172:1: rule__Influence__Group__7__Impl : ( ':' ) ;
    public final void rule__Influence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1176:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:1177:1: ( ':' )
            {
            // InternalInfluenceDSL.g:1177:1: ( ':' )
            // InternalInfluenceDSL.g:1178:2: ':'
            {
             before(grammarAccess.getInfluenceAccess().getColonKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1187:1: rule__Influence__Group__8 : rule__Influence__Group__8__Impl rule__Influence__Group__9 ;
    public final void rule__Influence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1191:1: ( rule__Influence__Group__8__Impl rule__Influence__Group__9 )
            // InternalInfluenceDSL.g:1192:2: rule__Influence__Group__8__Impl rule__Influence__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalInfluenceDSL.g:1199:1: rule__Influence__Group__8__Impl : ( ( rule__Influence__Alternatives_8 ) ) ;
    public final void rule__Influence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1203:1: ( ( ( rule__Influence__Alternatives_8 ) ) )
            // InternalInfluenceDSL.g:1204:1: ( ( rule__Influence__Alternatives_8 ) )
            {
            // InternalInfluenceDSL.g:1204:1: ( ( rule__Influence__Alternatives_8 ) )
            // InternalInfluenceDSL.g:1205:2: ( rule__Influence__Alternatives_8 )
            {
             before(grammarAccess.getInfluenceAccess().getAlternatives_8()); 
            // InternalInfluenceDSL.g:1206:2: ( rule__Influence__Alternatives_8 )
            // InternalInfluenceDSL.g:1206:3: rule__Influence__Alternatives_8
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
    // InternalInfluenceDSL.g:1214:1: rule__Influence__Group__9 : rule__Influence__Group__9__Impl rule__Influence__Group__10 ;
    public final void rule__Influence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1218:1: ( rule__Influence__Group__9__Impl rule__Influence__Group__10 )
            // InternalInfluenceDSL.g:1219:2: rule__Influence__Group__9__Impl rule__Influence__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalInfluenceDSL.g:1226:1: rule__Influence__Group__9__Impl : ( ( rule__Influence__Group_9__0 )* ) ;
    public final void rule__Influence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1230:1: ( ( ( rule__Influence__Group_9__0 )* ) )
            // InternalInfluenceDSL.g:1231:1: ( ( rule__Influence__Group_9__0 )* )
            {
            // InternalInfluenceDSL.g:1231:1: ( ( rule__Influence__Group_9__0 )* )
            // InternalInfluenceDSL.g:1232:2: ( rule__Influence__Group_9__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_9()); 
            // InternalInfluenceDSL.g:1233:2: ( rule__Influence__Group_9__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1233:3: rule__Influence__Group_9__0
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalInfluenceDSL.g:1241:1: rule__Influence__Group__10 : rule__Influence__Group__10__Impl rule__Influence__Group__11 ;
    public final void rule__Influence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1245:1: ( rule__Influence__Group__10__Impl rule__Influence__Group__11 )
            // InternalInfluenceDSL.g:1246:2: rule__Influence__Group__10__Impl rule__Influence__Group__11
            {
            pushFollow(FOLLOW_13);
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
    // InternalInfluenceDSL.g:1253:1: rule__Influence__Group__10__Impl : ( 'affects' ) ;
    public final void rule__Influence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1257:1: ( ( 'affects' ) )
            // InternalInfluenceDSL.g:1258:1: ( 'affects' )
            {
            // InternalInfluenceDSL.g:1258:1: ( 'affects' )
            // InternalInfluenceDSL.g:1259:2: 'affects'
            {
             before(grammarAccess.getInfluenceAccess().getAffectsKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAffectsKeyword_10()); 

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
    // InternalInfluenceDSL.g:1268:1: rule__Influence__Group__11 : rule__Influence__Group__11__Impl rule__Influence__Group__12 ;
    public final void rule__Influence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1272:1: ( rule__Influence__Group__11__Impl rule__Influence__Group__12 )
            // InternalInfluenceDSL.g:1273:2: rule__Influence__Group__11__Impl rule__Influence__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalInfluenceDSL.g:1280:1: rule__Influence__Group__11__Impl : ( ( rule__Influence__AffectsAssignment_11 ) ) ;
    public final void rule__Influence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1284:1: ( ( ( rule__Influence__AffectsAssignment_11 ) ) )
            // InternalInfluenceDSL.g:1285:1: ( ( rule__Influence__AffectsAssignment_11 ) )
            {
            // InternalInfluenceDSL.g:1285:1: ( ( rule__Influence__AffectsAssignment_11 ) )
            // InternalInfluenceDSL.g:1286:2: ( rule__Influence__AffectsAssignment_11 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_11()); 
            // InternalInfluenceDSL.g:1287:2: ( rule__Influence__AffectsAssignment_11 )
            // InternalInfluenceDSL.g:1287:3: rule__Influence__AffectsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Influence__AffectsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAffectsAssignment_11()); 

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
    // InternalInfluenceDSL.g:1295:1: rule__Influence__Group__12 : rule__Influence__Group__12__Impl ;
    public final void rule__Influence__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1299:1: ( rule__Influence__Group__12__Impl )
            // InternalInfluenceDSL.g:1300:2: rule__Influence__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group__12__Impl();

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
    // InternalInfluenceDSL.g:1306:1: rule__Influence__Group__12__Impl : ( ( rule__Influence__Group_12__0 )* ) ;
    public final void rule__Influence__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1310:1: ( ( ( rule__Influence__Group_12__0 )* ) )
            // InternalInfluenceDSL.g:1311:1: ( ( rule__Influence__Group_12__0 )* )
            {
            // InternalInfluenceDSL.g:1311:1: ( ( rule__Influence__Group_12__0 )* )
            // InternalInfluenceDSL.g:1312:2: ( rule__Influence__Group_12__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_12()); 
            // InternalInfluenceDSL.g:1313:2: ( rule__Influence__Group_12__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1313:3: rule__Influence__Group_12__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Influence__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_12()); 

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


    // $ANTLR start "rule__Influence__Group_4__0"
    // InternalInfluenceDSL.g:1322:1: rule__Influence__Group_4__0 : rule__Influence__Group_4__0__Impl rule__Influence__Group_4__1 ;
    public final void rule__Influence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1326:1: ( rule__Influence__Group_4__0__Impl rule__Influence__Group_4__1 )
            // InternalInfluenceDSL.g:1327:2: rule__Influence__Group_4__0__Impl rule__Influence__Group_4__1
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
    // InternalInfluenceDSL.g:1334:1: rule__Influence__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1338:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:1339:1: ( ',' )
            {
            // InternalInfluenceDSL.g:1339:1: ( ',' )
            // InternalInfluenceDSL.g:1340:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1349:1: rule__Influence__Group_4__1 : rule__Influence__Group_4__1__Impl ;
    public final void rule__Influence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1353:1: ( rule__Influence__Group_4__1__Impl )
            // InternalInfluenceDSL.g:1354:2: rule__Influence__Group_4__1__Impl
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
    // InternalInfluenceDSL.g:1360:1: rule__Influence__Group_4__1__Impl : ( ( rule__Influence__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Influence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1364:1: ( ( ( rule__Influence__DescriptionAssignment_4_1 ) ) )
            // InternalInfluenceDSL.g:1365:1: ( ( rule__Influence__DescriptionAssignment_4_1 ) )
            {
            // InternalInfluenceDSL.g:1365:1: ( ( rule__Influence__DescriptionAssignment_4_1 ) )
            // InternalInfluenceDSL.g:1366:2: ( rule__Influence__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_4_1()); 
            // InternalInfluenceDSL.g:1367:2: ( rule__Influence__DescriptionAssignment_4_1 )
            // InternalInfluenceDSL.g:1367:3: rule__Influence__DescriptionAssignment_4_1
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
    // InternalInfluenceDSL.g:1376:1: rule__Influence__Group_8_0__0 : rule__Influence__Group_8_0__0__Impl rule__Influence__Group_8_0__1 ;
    public final void rule__Influence__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1380:1: ( rule__Influence__Group_8_0__0__Impl rule__Influence__Group_8_0__1 )
            // InternalInfluenceDSL.g:1381:2: rule__Influence__Group_8_0__0__Impl rule__Influence__Group_8_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalInfluenceDSL.g:1388:1: rule__Influence__Group_8_0__0__Impl : ( 'artifact' ) ;
    public final void rule__Influence__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1392:1: ( ( 'artifact' ) )
            // InternalInfluenceDSL.g:1393:1: ( 'artifact' )
            {
            // InternalInfluenceDSL.g:1393:1: ( 'artifact' )
            // InternalInfluenceDSL.g:1394:2: 'artifact'
            {
             before(grammarAccess.getInfluenceAccess().getArtifactKeyword_8_0_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1403:1: rule__Influence__Group_8_0__1 : rule__Influence__Group_8_0__1__Impl ;
    public final void rule__Influence__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1407:1: ( rule__Influence__Group_8_0__1__Impl )
            // InternalInfluenceDSL.g:1408:2: rule__Influence__Group_8_0__1__Impl
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
    // InternalInfluenceDSL.g:1414:1: rule__Influence__Group_8_0__1__Impl : ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) ) ;
    public final void rule__Influence__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1418:1: ( ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) ) )
            // InternalInfluenceDSL.g:1419:1: ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) )
            {
            // InternalInfluenceDSL.g:1419:1: ( ( rule__Influence__OriginatorArtifactAssignment_8_0_1 ) )
            // InternalInfluenceDSL.g:1420:2: ( rule__Influence__OriginatorArtifactAssignment_8_0_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactAssignment_8_0_1()); 
            // InternalInfluenceDSL.g:1421:2: ( rule__Influence__OriginatorArtifactAssignment_8_0_1 )
            // InternalInfluenceDSL.g:1421:3: rule__Influence__OriginatorArtifactAssignment_8_0_1
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
    // InternalInfluenceDSL.g:1430:1: rule__Influence__Group_8_1__0 : rule__Influence__Group_8_1__0__Impl rule__Influence__Group_8_1__1 ;
    public final void rule__Influence__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1434:1: ( rule__Influence__Group_8_1__0__Impl rule__Influence__Group_8_1__1 )
            // InternalInfluenceDSL.g:1435:2: rule__Influence__Group_8_1__0__Impl rule__Influence__Group_8_1__1
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
    // InternalInfluenceDSL.g:1442:1: rule__Influence__Group_8_1__0__Impl : ( 'phenomena' ) ;
    public final void rule__Influence__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1446:1: ( ( 'phenomena' ) )
            // InternalInfluenceDSL.g:1447:1: ( 'phenomena' )
            {
            // InternalInfluenceDSL.g:1447:1: ( 'phenomena' )
            // InternalInfluenceDSL.g:1448:2: 'phenomena'
            {
             before(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_8_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1457:1: rule__Influence__Group_8_1__1 : rule__Influence__Group_8_1__1__Impl ;
    public final void rule__Influence__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1461:1: ( rule__Influence__Group_8_1__1__Impl )
            // InternalInfluenceDSL.g:1462:2: rule__Influence__Group_8_1__1__Impl
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
    // InternalInfluenceDSL.g:1468:1: rule__Influence__Group_8_1__1__Impl : ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) ) ;
    public final void rule__Influence__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1472:1: ( ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) ) )
            // InternalInfluenceDSL.g:1473:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) )
            {
            // InternalInfluenceDSL.g:1473:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 ) )
            // InternalInfluenceDSL.g:1474:2: ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaAssignment_8_1_1()); 
            // InternalInfluenceDSL.g:1475:2: ( rule__Influence__OriginatorPhenomenaAssignment_8_1_1 )
            // InternalInfluenceDSL.g:1475:3: rule__Influence__OriginatorPhenomenaAssignment_8_1_1
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
    // InternalInfluenceDSL.g:1484:1: rule__Influence__Group_8_2__0 : rule__Influence__Group_8_2__0__Impl rule__Influence__Group_8_2__1 ;
    public final void rule__Influence__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1488:1: ( rule__Influence__Group_8_2__0__Impl rule__Influence__Group_8_2__1 )
            // InternalInfluenceDSL.g:1489:2: rule__Influence__Group_8_2__0__Impl rule__Influence__Group_8_2__1
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
    // InternalInfluenceDSL.g:1496:1: rule__Influence__Group_8_2__0__Impl : ( 'system' ) ;
    public final void rule__Influence__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1500:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:1501:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:1501:1: ( 'system' )
            // InternalInfluenceDSL.g:1502:2: 'system'
            {
             before(grammarAccess.getInfluenceAccess().getSystemKeyword_8_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1511:1: rule__Influence__Group_8_2__1 : rule__Influence__Group_8_2__1__Impl rule__Influence__Group_8_2__2 ;
    public final void rule__Influence__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1515:1: ( rule__Influence__Group_8_2__1__Impl rule__Influence__Group_8_2__2 )
            // InternalInfluenceDSL.g:1516:2: rule__Influence__Group_8_2__1__Impl rule__Influence__Group_8_2__2
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
    // InternalInfluenceDSL.g:1523:1: rule__Influence__Group_8_2__1__Impl : ( 'response' ) ;
    public final void rule__Influence__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1527:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:1528:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:1528:1: ( 'response' )
            // InternalInfluenceDSL.g:1529:2: 'response'
            {
             before(grammarAccess.getInfluenceAccess().getResponseKeyword_8_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1538:1: rule__Influence__Group_8_2__2 : rule__Influence__Group_8_2__2__Impl ;
    public final void rule__Influence__Group_8_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1542:1: ( rule__Influence__Group_8_2__2__Impl )
            // InternalInfluenceDSL.g:1543:2: rule__Influence__Group_8_2__2__Impl
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
    // InternalInfluenceDSL.g:1549:1: rule__Influence__Group_8_2__2__Impl : ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) ) ;
    public final void rule__Influence__Group_8_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1553:1: ( ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) ) )
            // InternalInfluenceDSL.g:1554:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) )
            {
            // InternalInfluenceDSL.g:1554:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 ) )
            // InternalInfluenceDSL.g:1555:2: ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseAssignment_8_2_2()); 
            // InternalInfluenceDSL.g:1556:2: ( rule__Influence__OriginatorSystemResponseAssignment_8_2_2 )
            // InternalInfluenceDSL.g:1556:3: rule__Influence__OriginatorSystemResponseAssignment_8_2_2
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
    // InternalInfluenceDSL.g:1565:1: rule__Influence__Group_9__0 : rule__Influence__Group_9__0__Impl rule__Influence__Group_9__1 ;
    public final void rule__Influence__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1569:1: ( rule__Influence__Group_9__0__Impl rule__Influence__Group_9__1 )
            // InternalInfluenceDSL.g:1570:2: rule__Influence__Group_9__0__Impl rule__Influence__Group_9__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalInfluenceDSL.g:1577:1: rule__Influence__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__Influence__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1581:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:1582:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:1582:1: ( 'and' )
            // InternalInfluenceDSL.g:1583:2: 'and'
            {
             before(grammarAccess.getInfluenceAccess().getAndKeyword_9_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1592:1: rule__Influence__Group_9__1 : rule__Influence__Group_9__1__Impl ;
    public final void rule__Influence__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1596:1: ( rule__Influence__Group_9__1__Impl )
            // InternalInfluenceDSL.g:1597:2: rule__Influence__Group_9__1__Impl
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
    // InternalInfluenceDSL.g:1603:1: rule__Influence__Group_9__1__Impl : ( ( rule__Influence__Alternatives_9_1 ) ) ;
    public final void rule__Influence__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1607:1: ( ( ( rule__Influence__Alternatives_9_1 ) ) )
            // InternalInfluenceDSL.g:1608:1: ( ( rule__Influence__Alternatives_9_1 ) )
            {
            // InternalInfluenceDSL.g:1608:1: ( ( rule__Influence__Alternatives_9_1 ) )
            // InternalInfluenceDSL.g:1609:2: ( rule__Influence__Alternatives_9_1 )
            {
             before(grammarAccess.getInfluenceAccess().getAlternatives_9_1()); 
            // InternalInfluenceDSL.g:1610:2: ( rule__Influence__Alternatives_9_1 )
            // InternalInfluenceDSL.g:1610:3: rule__Influence__Alternatives_9_1
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
    // InternalInfluenceDSL.g:1619:1: rule__Influence__Group_9_1_0__0 : rule__Influence__Group_9_1_0__0__Impl rule__Influence__Group_9_1_0__1 ;
    public final void rule__Influence__Group_9_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1623:1: ( rule__Influence__Group_9_1_0__0__Impl rule__Influence__Group_9_1_0__1 )
            // InternalInfluenceDSL.g:1624:2: rule__Influence__Group_9_1_0__0__Impl rule__Influence__Group_9_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalInfluenceDSL.g:1631:1: rule__Influence__Group_9_1_0__0__Impl : ( 'artifact' ) ;
    public final void rule__Influence__Group_9_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1635:1: ( ( 'artifact' ) )
            // InternalInfluenceDSL.g:1636:1: ( 'artifact' )
            {
            // InternalInfluenceDSL.g:1636:1: ( 'artifact' )
            // InternalInfluenceDSL.g:1637:2: 'artifact'
            {
             before(grammarAccess.getInfluenceAccess().getArtifactKeyword_9_1_0_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1646:1: rule__Influence__Group_9_1_0__1 : rule__Influence__Group_9_1_0__1__Impl ;
    public final void rule__Influence__Group_9_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1650:1: ( rule__Influence__Group_9_1_0__1__Impl )
            // InternalInfluenceDSL.g:1651:2: rule__Influence__Group_9_1_0__1__Impl
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
    // InternalInfluenceDSL.g:1657:1: rule__Influence__Group_9_1_0__1__Impl : ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) ) ;
    public final void rule__Influence__Group_9_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1661:1: ( ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) ) )
            // InternalInfluenceDSL.g:1662:1: ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) )
            {
            // InternalInfluenceDSL.g:1662:1: ( ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 ) )
            // InternalInfluenceDSL.g:1663:2: ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactAssignment_9_1_0_1()); 
            // InternalInfluenceDSL.g:1664:2: ( rule__Influence__OriginatorArtifactAssignment_9_1_0_1 )
            // InternalInfluenceDSL.g:1664:3: rule__Influence__OriginatorArtifactAssignment_9_1_0_1
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
    // InternalInfluenceDSL.g:1673:1: rule__Influence__Group_9_1_1__0 : rule__Influence__Group_9_1_1__0__Impl rule__Influence__Group_9_1_1__1 ;
    public final void rule__Influence__Group_9_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1677:1: ( rule__Influence__Group_9_1_1__0__Impl rule__Influence__Group_9_1_1__1 )
            // InternalInfluenceDSL.g:1678:2: rule__Influence__Group_9_1_1__0__Impl rule__Influence__Group_9_1_1__1
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
    // InternalInfluenceDSL.g:1685:1: rule__Influence__Group_9_1_1__0__Impl : ( 'phenomena' ) ;
    public final void rule__Influence__Group_9_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1689:1: ( ( 'phenomena' ) )
            // InternalInfluenceDSL.g:1690:1: ( 'phenomena' )
            {
            // InternalInfluenceDSL.g:1690:1: ( 'phenomena' )
            // InternalInfluenceDSL.g:1691:2: 'phenomena'
            {
             before(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_9_1_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1700:1: rule__Influence__Group_9_1_1__1 : rule__Influence__Group_9_1_1__1__Impl ;
    public final void rule__Influence__Group_9_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1704:1: ( rule__Influence__Group_9_1_1__1__Impl )
            // InternalInfluenceDSL.g:1705:2: rule__Influence__Group_9_1_1__1__Impl
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
    // InternalInfluenceDSL.g:1711:1: rule__Influence__Group_9_1_1__1__Impl : ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) ) ;
    public final void rule__Influence__Group_9_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1715:1: ( ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) ) )
            // InternalInfluenceDSL.g:1716:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) )
            {
            // InternalInfluenceDSL.g:1716:1: ( ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 ) )
            // InternalInfluenceDSL.g:1717:2: ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaAssignment_9_1_1_1()); 
            // InternalInfluenceDSL.g:1718:2: ( rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 )
            // InternalInfluenceDSL.g:1718:3: rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1
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
    // InternalInfluenceDSL.g:1727:1: rule__Influence__Group_9_1_2__0 : rule__Influence__Group_9_1_2__0__Impl rule__Influence__Group_9_1_2__1 ;
    public final void rule__Influence__Group_9_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1731:1: ( rule__Influence__Group_9_1_2__0__Impl rule__Influence__Group_9_1_2__1 )
            // InternalInfluenceDSL.g:1732:2: rule__Influence__Group_9_1_2__0__Impl rule__Influence__Group_9_1_2__1
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
    // InternalInfluenceDSL.g:1739:1: rule__Influence__Group_9_1_2__0__Impl : ( 'system' ) ;
    public final void rule__Influence__Group_9_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1743:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:1744:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:1744:1: ( 'system' )
            // InternalInfluenceDSL.g:1745:2: 'system'
            {
             before(grammarAccess.getInfluenceAccess().getSystemKeyword_9_1_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1754:1: rule__Influence__Group_9_1_2__1 : rule__Influence__Group_9_1_2__1__Impl rule__Influence__Group_9_1_2__2 ;
    public final void rule__Influence__Group_9_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1758:1: ( rule__Influence__Group_9_1_2__1__Impl rule__Influence__Group_9_1_2__2 )
            // InternalInfluenceDSL.g:1759:2: rule__Influence__Group_9_1_2__1__Impl rule__Influence__Group_9_1_2__2
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
    // InternalInfluenceDSL.g:1766:1: rule__Influence__Group_9_1_2__1__Impl : ( 'response' ) ;
    public final void rule__Influence__Group_9_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1770:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:1771:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:1771:1: ( 'response' )
            // InternalInfluenceDSL.g:1772:2: 'response'
            {
             before(grammarAccess.getInfluenceAccess().getResponseKeyword_9_1_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1781:1: rule__Influence__Group_9_1_2__2 : rule__Influence__Group_9_1_2__2__Impl ;
    public final void rule__Influence__Group_9_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1785:1: ( rule__Influence__Group_9_1_2__2__Impl )
            // InternalInfluenceDSL.g:1786:2: rule__Influence__Group_9_1_2__2__Impl
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
    // InternalInfluenceDSL.g:1792:1: rule__Influence__Group_9_1_2__2__Impl : ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) ) ;
    public final void rule__Influence__Group_9_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1796:1: ( ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) ) )
            // InternalInfluenceDSL.g:1797:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) )
            {
            // InternalInfluenceDSL.g:1797:1: ( ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 ) )
            // InternalInfluenceDSL.g:1798:2: ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseAssignment_9_1_2_2()); 
            // InternalInfluenceDSL.g:1799:2: ( rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 )
            // InternalInfluenceDSL.g:1799:3: rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2
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


    // $ANTLR start "rule__Influence__Group_12__0"
    // InternalInfluenceDSL.g:1808:1: rule__Influence__Group_12__0 : rule__Influence__Group_12__0__Impl rule__Influence__Group_12__1 ;
    public final void rule__Influence__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1812:1: ( rule__Influence__Group_12__0__Impl rule__Influence__Group_12__1 )
            // InternalInfluenceDSL.g:1813:2: rule__Influence__Group_12__0__Impl rule__Influence__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__Influence__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_12__1();

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
    // $ANTLR end "rule__Influence__Group_12__0"


    // $ANTLR start "rule__Influence__Group_12__0__Impl"
    // InternalInfluenceDSL.g:1820:1: rule__Influence__Group_12__0__Impl : ( 'and' ) ;
    public final void rule__Influence__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1824:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:1825:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:1825:1: ( 'and' )
            // InternalInfluenceDSL.g:1826:2: 'and'
            {
             before(grammarAccess.getInfluenceAccess().getAndKeyword_12_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAndKeyword_12_0()); 

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
    // $ANTLR end "rule__Influence__Group_12__0__Impl"


    // $ANTLR start "rule__Influence__Group_12__1"
    // InternalInfluenceDSL.g:1835:1: rule__Influence__Group_12__1 : rule__Influence__Group_12__1__Impl ;
    public final void rule__Influence__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1839:1: ( rule__Influence__Group_12__1__Impl )
            // InternalInfluenceDSL.g:1840:2: rule__Influence__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_12__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_12__1"


    // $ANTLR start "rule__Influence__Group_12__1__Impl"
    // InternalInfluenceDSL.g:1846:1: rule__Influence__Group_12__1__Impl : ( ( rule__Influence__AffectsAssignment_12_1 ) ) ;
    public final void rule__Influence__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1850:1: ( ( ( rule__Influence__AffectsAssignment_12_1 ) ) )
            // InternalInfluenceDSL.g:1851:1: ( ( rule__Influence__AffectsAssignment_12_1 ) )
            {
            // InternalInfluenceDSL.g:1851:1: ( ( rule__Influence__AffectsAssignment_12_1 ) )
            // InternalInfluenceDSL.g:1852:2: ( rule__Influence__AffectsAssignment_12_1 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_12_1()); 
            // InternalInfluenceDSL.g:1853:2: ( rule__Influence__AffectsAssignment_12_1 )
            // InternalInfluenceDSL.g:1853:3: rule__Influence__AffectsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__AffectsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAffectsAssignment_12_1()); 

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
    // $ANTLR end "rule__Influence__Group_12__1__Impl"


    // $ANTLR start "rule__PhysicalPhenomena__Group__0"
    // InternalInfluenceDSL.g:1862:1: rule__PhysicalPhenomena__Group__0 : rule__PhysicalPhenomena__Group__0__Impl rule__PhysicalPhenomena__Group__1 ;
    public final void rule__PhysicalPhenomena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1866:1: ( rule__PhysicalPhenomena__Group__0__Impl rule__PhysicalPhenomena__Group__1 )
            // InternalInfluenceDSL.g:1867:2: rule__PhysicalPhenomena__Group__0__Impl rule__PhysicalPhenomena__Group__1
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
    // InternalInfluenceDSL.g:1874:1: rule__PhysicalPhenomena__Group__0__Impl : ( 'Phenomenon' ) ;
    public final void rule__PhysicalPhenomena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1878:1: ( ( 'Phenomenon' ) )
            // InternalInfluenceDSL.g:1879:1: ( 'Phenomenon' )
            {
            // InternalInfluenceDSL.g:1879:1: ( 'Phenomenon' )
            // InternalInfluenceDSL.g:1880:2: 'Phenomenon'
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getPhenomenonKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1889:1: rule__PhysicalPhenomena__Group__1 : rule__PhysicalPhenomena__Group__1__Impl rule__PhysicalPhenomena__Group__2 ;
    public final void rule__PhysicalPhenomena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1893:1: ( rule__PhysicalPhenomena__Group__1__Impl rule__PhysicalPhenomena__Group__2 )
            // InternalInfluenceDSL.g:1894:2: rule__PhysicalPhenomena__Group__1__Impl rule__PhysicalPhenomena__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalInfluenceDSL.g:1901:1: rule__PhysicalPhenomena__Group__1__Impl : ( ( rule__PhysicalPhenomena__NameAssignment_1 ) ) ;
    public final void rule__PhysicalPhenomena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1905:1: ( ( ( rule__PhysicalPhenomena__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:1906:1: ( ( rule__PhysicalPhenomena__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:1906:1: ( ( rule__PhysicalPhenomena__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:1907:2: ( rule__PhysicalPhenomena__NameAssignment_1 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:1908:2: ( rule__PhysicalPhenomena__NameAssignment_1 )
            // InternalInfluenceDSL.g:1908:3: rule__PhysicalPhenomena__NameAssignment_1
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
    // InternalInfluenceDSL.g:1916:1: rule__PhysicalPhenomena__Group__2 : rule__PhysicalPhenomena__Group__2__Impl ;
    public final void rule__PhysicalPhenomena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1920:1: ( rule__PhysicalPhenomena__Group__2__Impl )
            // InternalInfluenceDSL.g:1921:2: rule__PhysicalPhenomena__Group__2__Impl
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
    // InternalInfluenceDSL.g:1927:1: rule__PhysicalPhenomena__Group__2__Impl : ( ( rule__PhysicalPhenomena__Group_2__0 )? ) ;
    public final void rule__PhysicalPhenomena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1931:1: ( ( ( rule__PhysicalPhenomena__Group_2__0 )? ) )
            // InternalInfluenceDSL.g:1932:1: ( ( rule__PhysicalPhenomena__Group_2__0 )? )
            {
            // InternalInfluenceDSL.g:1932:1: ( ( rule__PhysicalPhenomena__Group_2__0 )? )
            // InternalInfluenceDSL.g:1933:2: ( rule__PhysicalPhenomena__Group_2__0 )?
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getGroup_2()); 
            // InternalInfluenceDSL.g:1934:2: ( rule__PhysicalPhenomena__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalInfluenceDSL.g:1934:3: rule__PhysicalPhenomena__Group_2__0
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
    // InternalInfluenceDSL.g:1943:1: rule__PhysicalPhenomena__Group_2__0 : rule__PhysicalPhenomena__Group_2__0__Impl rule__PhysicalPhenomena__Group_2__1 ;
    public final void rule__PhysicalPhenomena__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1947:1: ( rule__PhysicalPhenomena__Group_2__0__Impl rule__PhysicalPhenomena__Group_2__1 )
            // InternalInfluenceDSL.g:1948:2: rule__PhysicalPhenomena__Group_2__0__Impl rule__PhysicalPhenomena__Group_2__1
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
    // InternalInfluenceDSL.g:1955:1: rule__PhysicalPhenomena__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PhysicalPhenomena__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1959:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:1960:1: ( ':' )
            {
            // InternalInfluenceDSL.g:1960:1: ( ':' )
            // InternalInfluenceDSL.g:1961:2: ':'
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getColonKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:1970:1: rule__PhysicalPhenomena__Group_2__1 : rule__PhysicalPhenomena__Group_2__1__Impl rule__PhysicalPhenomena__Group_2__2 ;
    public final void rule__PhysicalPhenomena__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1974:1: ( rule__PhysicalPhenomena__Group_2__1__Impl rule__PhysicalPhenomena__Group_2__2 )
            // InternalInfluenceDSL.g:1975:2: rule__PhysicalPhenomena__Group_2__1__Impl rule__PhysicalPhenomena__Group_2__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalInfluenceDSL.g:1982:1: rule__PhysicalPhenomena__Group_2__1__Impl : ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) ) ;
    public final void rule__PhysicalPhenomena__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1986:1: ( ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) ) )
            // InternalInfluenceDSL.g:1987:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) )
            {
            // InternalInfluenceDSL.g:1987:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 ) )
            // InternalInfluenceDSL.g:1988:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionAssignment_2_1()); 
            // InternalInfluenceDSL.g:1989:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_1 )
            // InternalInfluenceDSL.g:1989:3: rule__PhysicalPhenomena__DescriptionAssignment_2_1
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
    // InternalInfluenceDSL.g:1997:1: rule__PhysicalPhenomena__Group_2__2 : rule__PhysicalPhenomena__Group_2__2__Impl ;
    public final void rule__PhysicalPhenomena__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2001:1: ( rule__PhysicalPhenomena__Group_2__2__Impl )
            // InternalInfluenceDSL.g:2002:2: rule__PhysicalPhenomena__Group_2__2__Impl
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
    // InternalInfluenceDSL.g:2008:1: rule__PhysicalPhenomena__Group_2__2__Impl : ( ( rule__PhysicalPhenomena__Group_2_2__0 )* ) ;
    public final void rule__PhysicalPhenomena__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2012:1: ( ( ( rule__PhysicalPhenomena__Group_2_2__0 )* ) )
            // InternalInfluenceDSL.g:2013:1: ( ( rule__PhysicalPhenomena__Group_2_2__0 )* )
            {
            // InternalInfluenceDSL.g:2013:1: ( ( rule__PhysicalPhenomena__Group_2_2__0 )* )
            // InternalInfluenceDSL.g:2014:2: ( rule__PhysicalPhenomena__Group_2_2__0 )*
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getGroup_2_2()); 
            // InternalInfluenceDSL.g:2015:2: ( rule__PhysicalPhenomena__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2015:3: rule__PhysicalPhenomena__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PhysicalPhenomena__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalInfluenceDSL.g:2024:1: rule__PhysicalPhenomena__Group_2_2__0 : rule__PhysicalPhenomena__Group_2_2__0__Impl rule__PhysicalPhenomena__Group_2_2__1 ;
    public final void rule__PhysicalPhenomena__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2028:1: ( rule__PhysicalPhenomena__Group_2_2__0__Impl rule__PhysicalPhenomena__Group_2_2__1 )
            // InternalInfluenceDSL.g:2029:2: rule__PhysicalPhenomena__Group_2_2__0__Impl rule__PhysicalPhenomena__Group_2_2__1
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
    // InternalInfluenceDSL.g:2036:1: rule__PhysicalPhenomena__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__PhysicalPhenomena__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2040:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2041:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2041:1: ( ',' )
            // InternalInfluenceDSL.g:2042:2: ','
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getCommaKeyword_2_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2051:1: rule__PhysicalPhenomena__Group_2_2__1 : rule__PhysicalPhenomena__Group_2_2__1__Impl ;
    public final void rule__PhysicalPhenomena__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2055:1: ( rule__PhysicalPhenomena__Group_2_2__1__Impl )
            // InternalInfluenceDSL.g:2056:2: rule__PhysicalPhenomena__Group_2_2__1__Impl
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
    // InternalInfluenceDSL.g:2062:1: rule__PhysicalPhenomena__Group_2_2__1__Impl : ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) ) ;
    public final void rule__PhysicalPhenomena__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2066:1: ( ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) ) )
            // InternalInfluenceDSL.g:2067:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) )
            {
            // InternalInfluenceDSL.g:2067:1: ( ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 ) )
            // InternalInfluenceDSL.g:2068:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 )
            {
             before(grammarAccess.getPhysicalPhenomenaAccess().getDescriptionAssignment_2_2_1()); 
            // InternalInfluenceDSL.g:2069:2: ( rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 )
            // InternalInfluenceDSL.g:2069:3: rule__PhysicalPhenomena__DescriptionAssignment_2_2_1
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
    // InternalInfluenceDSL.g:2078:1: rule__RequirementSatisfaction__Group__0 : rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 ;
    public final void rule__RequirementSatisfaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2082:1: ( rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 )
            // InternalInfluenceDSL.g:2083:2: rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1
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
    // InternalInfluenceDSL.g:2090:1: rule__RequirementSatisfaction__Group__0__Impl : ( 'Requirement' ) ;
    public final void rule__RequirementSatisfaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2094:1: ( ( 'Requirement' ) )
            // InternalInfluenceDSL.g:2095:1: ( 'Requirement' )
            {
            // InternalInfluenceDSL.g:2095:1: ( 'Requirement' )
            // InternalInfluenceDSL.g:2096:2: 'Requirement'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2105:1: rule__RequirementSatisfaction__Group__1 : rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 ;
    public final void rule__RequirementSatisfaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2109:1: ( rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 )
            // InternalInfluenceDSL.g:2110:2: rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalInfluenceDSL.g:2117:1: rule__RequirementSatisfaction__Group__1__Impl : ( ( rule__RequirementSatisfaction__NameAssignment_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2121:1: ( ( ( rule__RequirementSatisfaction__NameAssignment_1 ) ) )
            // InternalInfluenceDSL.g:2122:1: ( ( rule__RequirementSatisfaction__NameAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:2122:1: ( ( rule__RequirementSatisfaction__NameAssignment_1 ) )
            // InternalInfluenceDSL.g:2123:2: ( rule__RequirementSatisfaction__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getNameAssignment_1()); 
            // InternalInfluenceDSL.g:2124:2: ( rule__RequirementSatisfaction__NameAssignment_1 )
            // InternalInfluenceDSL.g:2124:3: rule__RequirementSatisfaction__NameAssignment_1
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
    // InternalInfluenceDSL.g:2132:1: rule__RequirementSatisfaction__Group__2 : rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 ;
    public final void rule__RequirementSatisfaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2136:1: ( rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 )
            // InternalInfluenceDSL.g:2137:2: rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalInfluenceDSL.g:2144:1: rule__RequirementSatisfaction__Group__2__Impl : ( ':' ) ;
    public final void rule__RequirementSatisfaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2148:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:2149:1: ( ':' )
            {
            // InternalInfluenceDSL.g:2149:1: ( ':' )
            // InternalInfluenceDSL.g:2150:2: ':'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2159:1: rule__RequirementSatisfaction__Group__3 : rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 ;
    public final void rule__RequirementSatisfaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2163:1: ( rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 )
            // InternalInfluenceDSL.g:2164:2: rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalInfluenceDSL.g:2171:1: rule__RequirementSatisfaction__Group__3__Impl : ( 'satisfied' ) ;
    public final void rule__RequirementSatisfaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2175:1: ( ( 'satisfied' ) )
            // InternalInfluenceDSL.g:2176:1: ( 'satisfied' )
            {
            // InternalInfluenceDSL.g:2176:1: ( 'satisfied' )
            // InternalInfluenceDSL.g:2177:2: 'satisfied'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2186:1: rule__RequirementSatisfaction__Group__4 : rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 ;
    public final void rule__RequirementSatisfaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2190:1: ( rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 )
            // InternalInfluenceDSL.g:2191:2: rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5
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
    // InternalInfluenceDSL.g:2198:1: rule__RequirementSatisfaction__Group__4__Impl : ( 'when' ) ;
    public final void rule__RequirementSatisfaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2202:1: ( ( 'when' ) )
            // InternalInfluenceDSL.g:2203:1: ( 'when' )
            {
            // InternalInfluenceDSL.g:2203:1: ( 'when' )
            // InternalInfluenceDSL.g:2204:2: 'when'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2213:1: rule__RequirementSatisfaction__Group__5 : rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 ;
    public final void rule__RequirementSatisfaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2217:1: ( rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 )
            // InternalInfluenceDSL.g:2218:2: rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalInfluenceDSL.g:2225:1: rule__RequirementSatisfaction__Group__5__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) ) ;
    public final void rule__RequirementSatisfaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2229:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) ) )
            // InternalInfluenceDSL.g:2230:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) )
            {
            // InternalInfluenceDSL.g:2230:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_5 ) )
            // InternalInfluenceDSL.g:2231:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_5 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_5()); 
            // InternalInfluenceDSL.g:2232:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_5 )
            // InternalInfluenceDSL.g:2232:3: rule__RequirementSatisfaction__SatisfactionAssignment_5
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
    // InternalInfluenceDSL.g:2240:1: rule__RequirementSatisfaction__Group__6 : rule__RequirementSatisfaction__Group__6__Impl ;
    public final void rule__RequirementSatisfaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2244:1: ( rule__RequirementSatisfaction__Group__6__Impl )
            // InternalInfluenceDSL.g:2245:2: rule__RequirementSatisfaction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__6__Impl();

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
    // InternalInfluenceDSL.g:2251:1: rule__RequirementSatisfaction__Group__6__Impl : ( ( rule__RequirementSatisfaction__Group_6__0 )* ) ;
    public final void rule__RequirementSatisfaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2255:1: ( ( ( rule__RequirementSatisfaction__Group_6__0 )* ) )
            // InternalInfluenceDSL.g:2256:1: ( ( rule__RequirementSatisfaction__Group_6__0 )* )
            {
            // InternalInfluenceDSL.g:2256:1: ( ( rule__RequirementSatisfaction__Group_6__0 )* )
            // InternalInfluenceDSL.g:2257:2: ( rule__RequirementSatisfaction__Group_6__0 )*
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup_6()); 
            // InternalInfluenceDSL.g:2258:2: ( rule__RequirementSatisfaction__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2258:3: rule__RequirementSatisfaction__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RequirementSatisfaction__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "rule__RequirementSatisfaction__Group_6__0"
    // InternalInfluenceDSL.g:2267:1: rule__RequirementSatisfaction__Group_6__0 : rule__RequirementSatisfaction__Group_6__0__Impl rule__RequirementSatisfaction__Group_6__1 ;
    public final void rule__RequirementSatisfaction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2271:1: ( rule__RequirementSatisfaction__Group_6__0__Impl rule__RequirementSatisfaction__Group_6__1 )
            // InternalInfluenceDSL.g:2272:2: rule__RequirementSatisfaction__Group_6__0__Impl rule__RequirementSatisfaction__Group_6__1
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
    // InternalInfluenceDSL.g:2279:1: rule__RequirementSatisfaction__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RequirementSatisfaction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2283:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2284:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2284:1: ( ',' )
            // InternalInfluenceDSL.g:2285:2: ','
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2294:1: rule__RequirementSatisfaction__Group_6__1 : rule__RequirementSatisfaction__Group_6__1__Impl ;
    public final void rule__RequirementSatisfaction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2298:1: ( rule__RequirementSatisfaction__Group_6__1__Impl )
            // InternalInfluenceDSL.g:2299:2: rule__RequirementSatisfaction__Group_6__1__Impl
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
    // InternalInfluenceDSL.g:2305:1: rule__RequirementSatisfaction__Group_6__1__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2309:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) ) )
            // InternalInfluenceDSL.g:2310:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) )
            {
            // InternalInfluenceDSL.g:2310:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 ) )
            // InternalInfluenceDSL.g:2311:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_6_1()); 
            // InternalInfluenceDSL.g:2312:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_6_1 )
            // InternalInfluenceDSL.g:2312:3: rule__RequirementSatisfaction__SatisfactionAssignment_6_1
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


    // $ANTLR start "rule__DesignArtifact__Group__0"
    // InternalInfluenceDSL.g:2321:1: rule__DesignArtifact__Group__0 : rule__DesignArtifact__Group__0__Impl rule__DesignArtifact__Group__1 ;
    public final void rule__DesignArtifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2325:1: ( rule__DesignArtifact__Group__0__Impl rule__DesignArtifact__Group__1 )
            // InternalInfluenceDSL.g:2326:2: rule__DesignArtifact__Group__0__Impl rule__DesignArtifact__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalInfluenceDSL.g:2333:1: rule__DesignArtifact__Group__0__Impl : ( () ) ;
    public final void rule__DesignArtifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2337:1: ( ( () ) )
            // InternalInfluenceDSL.g:2338:1: ( () )
            {
            // InternalInfluenceDSL.g:2338:1: ( () )
            // InternalInfluenceDSL.g:2339:2: ()
            {
             before(grammarAccess.getDesignArtifactAccess().getDesignArtifactAction_0()); 
            // InternalInfluenceDSL.g:2340:2: ()
            // InternalInfluenceDSL.g:2340:3: 
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
    // InternalInfluenceDSL.g:2348:1: rule__DesignArtifact__Group__1 : rule__DesignArtifact__Group__1__Impl rule__DesignArtifact__Group__2 ;
    public final void rule__DesignArtifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2352:1: ( rule__DesignArtifact__Group__1__Impl rule__DesignArtifact__Group__2 )
            // InternalInfluenceDSL.g:2353:2: rule__DesignArtifact__Group__1__Impl rule__DesignArtifact__Group__2
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
    // InternalInfluenceDSL.g:2360:1: rule__DesignArtifact__Group__1__Impl : ( 'DesignArtifact' ) ;
    public final void rule__DesignArtifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2364:1: ( ( 'DesignArtifact' ) )
            // InternalInfluenceDSL.g:2365:1: ( 'DesignArtifact' )
            {
            // InternalInfluenceDSL.g:2365:1: ( 'DesignArtifact' )
            // InternalInfluenceDSL.g:2366:2: 'DesignArtifact'
            {
             before(grammarAccess.getDesignArtifactAccess().getDesignArtifactKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2375:1: rule__DesignArtifact__Group__2 : rule__DesignArtifact__Group__2__Impl rule__DesignArtifact__Group__3 ;
    public final void rule__DesignArtifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2379:1: ( rule__DesignArtifact__Group__2__Impl rule__DesignArtifact__Group__3 )
            // InternalInfluenceDSL.g:2380:2: rule__DesignArtifact__Group__2__Impl rule__DesignArtifact__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalInfluenceDSL.g:2387:1: rule__DesignArtifact__Group__2__Impl : ( ( rule__DesignArtifact__NameAssignment_2 ) ) ;
    public final void rule__DesignArtifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2391:1: ( ( ( rule__DesignArtifact__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:2392:1: ( ( rule__DesignArtifact__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:2392:1: ( ( rule__DesignArtifact__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:2393:2: ( rule__DesignArtifact__NameAssignment_2 )
            {
             before(grammarAccess.getDesignArtifactAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:2394:2: ( rule__DesignArtifact__NameAssignment_2 )
            // InternalInfluenceDSL.g:2394:3: rule__DesignArtifact__NameAssignment_2
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
    // InternalInfluenceDSL.g:2402:1: rule__DesignArtifact__Group__3 : rule__DesignArtifact__Group__3__Impl rule__DesignArtifact__Group__4 ;
    public final void rule__DesignArtifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2406:1: ( rule__DesignArtifact__Group__3__Impl rule__DesignArtifact__Group__4 )
            // InternalInfluenceDSL.g:2407:2: rule__DesignArtifact__Group__3__Impl rule__DesignArtifact__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalInfluenceDSL.g:2414:1: rule__DesignArtifact__Group__3__Impl : ( '->' ) ;
    public final void rule__DesignArtifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2418:1: ( ( '->' ) )
            // InternalInfluenceDSL.g:2419:1: ( '->' )
            {
            // InternalInfluenceDSL.g:2419:1: ( '->' )
            // InternalInfluenceDSL.g:2420:2: '->'
            {
             before(grammarAccess.getDesignArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2429:1: rule__DesignArtifact__Group__4 : rule__DesignArtifact__Group__4__Impl ;
    public final void rule__DesignArtifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2433:1: ( rule__DesignArtifact__Group__4__Impl )
            // InternalInfluenceDSL.g:2434:2: rule__DesignArtifact__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DesignArtifact__Group__4__Impl();

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
    // InternalInfluenceDSL.g:2440:1: rule__DesignArtifact__Group__4__Impl : ( ( rule__DesignArtifact__RefAssignment_4 ) ) ;
    public final void rule__DesignArtifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2444:1: ( ( ( rule__DesignArtifact__RefAssignment_4 ) ) )
            // InternalInfluenceDSL.g:2445:1: ( ( rule__DesignArtifact__RefAssignment_4 ) )
            {
            // InternalInfluenceDSL.g:2445:1: ( ( rule__DesignArtifact__RefAssignment_4 ) )
            // InternalInfluenceDSL.g:2446:2: ( rule__DesignArtifact__RefAssignment_4 )
            {
             before(grammarAccess.getDesignArtifactAccess().getRefAssignment_4()); 
            // InternalInfluenceDSL.g:2447:2: ( rule__DesignArtifact__RefAssignment_4 )
            // InternalInfluenceDSL.g:2447:3: rule__DesignArtifact__RefAssignment_4
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


    // $ANTLR start "rule__SystemResponse__Group__0"
    // InternalInfluenceDSL.g:2456:1: rule__SystemResponse__Group__0 : rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 ;
    public final void rule__SystemResponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2460:1: ( rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 )
            // InternalInfluenceDSL.g:2461:2: rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalInfluenceDSL.g:2468:1: rule__SystemResponse__Group__0__Impl : ( () ) ;
    public final void rule__SystemResponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2472:1: ( ( () ) )
            // InternalInfluenceDSL.g:2473:1: ( () )
            {
            // InternalInfluenceDSL.g:2473:1: ( () )
            // InternalInfluenceDSL.g:2474:2: ()
            {
             before(grammarAccess.getSystemResponseAccess().getSystemResponseAction_0()); 
            // InternalInfluenceDSL.g:2475:2: ()
            // InternalInfluenceDSL.g:2475:3: 
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
    // InternalInfluenceDSL.g:2483:1: rule__SystemResponse__Group__1 : rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 ;
    public final void rule__SystemResponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2487:1: ( rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 )
            // InternalInfluenceDSL.g:2488:2: rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2
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
    // InternalInfluenceDSL.g:2495:1: rule__SystemResponse__Group__1__Impl : ( 'system' ) ;
    public final void rule__SystemResponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2499:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:2500:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:2500:1: ( 'system' )
            // InternalInfluenceDSL.g:2501:2: 'system'
            {
             before(grammarAccess.getSystemResponseAccess().getSystemKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2510:1: rule__SystemResponse__Group__2 : rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 ;
    public final void rule__SystemResponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2514:1: ( rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 )
            // InternalInfluenceDSL.g:2515:2: rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3
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
    // InternalInfluenceDSL.g:2522:1: rule__SystemResponse__Group__2__Impl : ( 'response' ) ;
    public final void rule__SystemResponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2526:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:2527:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:2527:1: ( 'response' )
            // InternalInfluenceDSL.g:2528:2: 'response'
            {
             before(grammarAccess.getSystemResponseAccess().getResponseKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2537:1: rule__SystemResponse__Group__3 : rule__SystemResponse__Group__3__Impl rule__SystemResponse__Group__4 ;
    public final void rule__SystemResponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2541:1: ( rule__SystemResponse__Group__3__Impl rule__SystemResponse__Group__4 )
            // InternalInfluenceDSL.g:2542:2: rule__SystemResponse__Group__3__Impl rule__SystemResponse__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalInfluenceDSL.g:2549:1: rule__SystemResponse__Group__3__Impl : ( ( rule__SystemResponse__NameAssignment_3 ) ) ;
    public final void rule__SystemResponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2553:1: ( ( ( rule__SystemResponse__NameAssignment_3 ) ) )
            // InternalInfluenceDSL.g:2554:1: ( ( rule__SystemResponse__NameAssignment_3 ) )
            {
            // InternalInfluenceDSL.g:2554:1: ( ( rule__SystemResponse__NameAssignment_3 ) )
            // InternalInfluenceDSL.g:2555:2: ( rule__SystemResponse__NameAssignment_3 )
            {
             before(grammarAccess.getSystemResponseAccess().getNameAssignment_3()); 
            // InternalInfluenceDSL.g:2556:2: ( rule__SystemResponse__NameAssignment_3 )
            // InternalInfluenceDSL.g:2556:3: rule__SystemResponse__NameAssignment_3
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
    // InternalInfluenceDSL.g:2564:1: rule__SystemResponse__Group__4 : rule__SystemResponse__Group__4__Impl ;
    public final void rule__SystemResponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2568:1: ( rule__SystemResponse__Group__4__Impl )
            // InternalInfluenceDSL.g:2569:2: rule__SystemResponse__Group__4__Impl
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
    // InternalInfluenceDSL.g:2575:1: rule__SystemResponse__Group__4__Impl : ( ( rule__SystemResponse__Group_4__0 )? ) ;
    public final void rule__SystemResponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2579:1: ( ( ( rule__SystemResponse__Group_4__0 )? ) )
            // InternalInfluenceDSL.g:2580:1: ( ( rule__SystemResponse__Group_4__0 )? )
            {
            // InternalInfluenceDSL.g:2580:1: ( ( rule__SystemResponse__Group_4__0 )? )
            // InternalInfluenceDSL.g:2581:2: ( rule__SystemResponse__Group_4__0 )?
            {
             before(grammarAccess.getSystemResponseAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:2582:2: ( rule__SystemResponse__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalInfluenceDSL.g:2582:3: rule__SystemResponse__Group_4__0
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
    // InternalInfluenceDSL.g:2591:1: rule__SystemResponse__Group_4__0 : rule__SystemResponse__Group_4__0__Impl rule__SystemResponse__Group_4__1 ;
    public final void rule__SystemResponse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2595:1: ( rule__SystemResponse__Group_4__0__Impl rule__SystemResponse__Group_4__1 )
            // InternalInfluenceDSL.g:2596:2: rule__SystemResponse__Group_4__0__Impl rule__SystemResponse__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalInfluenceDSL.g:2603:1: rule__SystemResponse__Group_4__0__Impl : ( 'used' ) ;
    public final void rule__SystemResponse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2607:1: ( ( 'used' ) )
            // InternalInfluenceDSL.g:2608:1: ( 'used' )
            {
            // InternalInfluenceDSL.g:2608:1: ( 'used' )
            // InternalInfluenceDSL.g:2609:2: 'used'
            {
             before(grammarAccess.getSystemResponseAccess().getUsedKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2618:1: rule__SystemResponse__Group_4__1 : rule__SystemResponse__Group_4__1__Impl rule__SystemResponse__Group_4__2 ;
    public final void rule__SystemResponse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2622:1: ( rule__SystemResponse__Group_4__1__Impl rule__SystemResponse__Group_4__2 )
            // InternalInfluenceDSL.g:2623:2: rule__SystemResponse__Group_4__1__Impl rule__SystemResponse__Group_4__2
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
    // InternalInfluenceDSL.g:2630:1: rule__SystemResponse__Group_4__1__Impl : ( 'in' ) ;
    public final void rule__SystemResponse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2634:1: ( ( 'in' ) )
            // InternalInfluenceDSL.g:2635:1: ( 'in' )
            {
            // InternalInfluenceDSL.g:2635:1: ( 'in' )
            // InternalInfluenceDSL.g:2636:2: 'in'
            {
             before(grammarAccess.getSystemResponseAccess().getInKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2645:1: rule__SystemResponse__Group_4__2 : rule__SystemResponse__Group_4__2__Impl rule__SystemResponse__Group_4__3 ;
    public final void rule__SystemResponse__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2649:1: ( rule__SystemResponse__Group_4__2__Impl rule__SystemResponse__Group_4__3 )
            // InternalInfluenceDSL.g:2650:2: rule__SystemResponse__Group_4__2__Impl rule__SystemResponse__Group_4__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalInfluenceDSL.g:2657:1: rule__SystemResponse__Group_4__2__Impl : ( ( rule__SystemResponse__UsedInAssignment_4_2 ) ) ;
    public final void rule__SystemResponse__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2661:1: ( ( ( rule__SystemResponse__UsedInAssignment_4_2 ) ) )
            // InternalInfluenceDSL.g:2662:1: ( ( rule__SystemResponse__UsedInAssignment_4_2 ) )
            {
            // InternalInfluenceDSL.g:2662:1: ( ( rule__SystemResponse__UsedInAssignment_4_2 ) )
            // InternalInfluenceDSL.g:2663:2: ( rule__SystemResponse__UsedInAssignment_4_2 )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInAssignment_4_2()); 
            // InternalInfluenceDSL.g:2664:2: ( rule__SystemResponse__UsedInAssignment_4_2 )
            // InternalInfluenceDSL.g:2664:3: rule__SystemResponse__UsedInAssignment_4_2
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
    // InternalInfluenceDSL.g:2672:1: rule__SystemResponse__Group_4__3 : rule__SystemResponse__Group_4__3__Impl ;
    public final void rule__SystemResponse__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2676:1: ( rule__SystemResponse__Group_4__3__Impl )
            // InternalInfluenceDSL.g:2677:2: rule__SystemResponse__Group_4__3__Impl
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
    // InternalInfluenceDSL.g:2683:1: rule__SystemResponse__Group_4__3__Impl : ( ( rule__SystemResponse__Group_4_3__0 )* ) ;
    public final void rule__SystemResponse__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2687:1: ( ( ( rule__SystemResponse__Group_4_3__0 )* ) )
            // InternalInfluenceDSL.g:2688:1: ( ( rule__SystemResponse__Group_4_3__0 )* )
            {
            // InternalInfluenceDSL.g:2688:1: ( ( rule__SystemResponse__Group_4_3__0 )* )
            // InternalInfluenceDSL.g:2689:2: ( rule__SystemResponse__Group_4_3__0 )*
            {
             before(grammarAccess.getSystemResponseAccess().getGroup_4_3()); 
            // InternalInfluenceDSL.g:2690:2: ( rule__SystemResponse__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    int LA19_2 = input.LA(2);

                    if ( ((LA19_2>=RULE_STRING && LA19_2<=RULE_ID)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2690:3: rule__SystemResponse__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SystemResponse__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalInfluenceDSL.g:2699:1: rule__SystemResponse__Group_4_3__0 : rule__SystemResponse__Group_4_3__0__Impl rule__SystemResponse__Group_4_3__1 ;
    public final void rule__SystemResponse__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2703:1: ( rule__SystemResponse__Group_4_3__0__Impl rule__SystemResponse__Group_4_3__1 )
            // InternalInfluenceDSL.g:2704:2: rule__SystemResponse__Group_4_3__0__Impl rule__SystemResponse__Group_4_3__1
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
    // InternalInfluenceDSL.g:2711:1: rule__SystemResponse__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__SystemResponse__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2715:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:2716:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:2716:1: ( 'and' )
            // InternalInfluenceDSL.g:2717:2: 'and'
            {
             before(grammarAccess.getSystemResponseAccess().getAndKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2726:1: rule__SystemResponse__Group_4_3__1 : rule__SystemResponse__Group_4_3__1__Impl ;
    public final void rule__SystemResponse__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2730:1: ( rule__SystemResponse__Group_4_3__1__Impl )
            // InternalInfluenceDSL.g:2731:2: rule__SystemResponse__Group_4_3__1__Impl
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
    // InternalInfluenceDSL.g:2737:1: rule__SystemResponse__Group_4_3__1__Impl : ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) ) ;
    public final void rule__SystemResponse__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2741:1: ( ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) ) )
            // InternalInfluenceDSL.g:2742:1: ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) )
            {
            // InternalInfluenceDSL.g:2742:1: ( ( rule__SystemResponse__UsedInAssignment_4_3_1 ) )
            // InternalInfluenceDSL.g:2743:2: ( rule__SystemResponse__UsedInAssignment_4_3_1 )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInAssignment_4_3_1()); 
            // InternalInfluenceDSL.g:2744:2: ( rule__SystemResponse__UsedInAssignment_4_3_1 )
            // InternalInfluenceDSL.g:2744:3: rule__SystemResponse__UsedInAssignment_4_3_1
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
    // InternalInfluenceDSL.g:2753:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2757:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalInfluenceDSL.g:2758:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalInfluenceDSL.g:2765:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2769:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:2770:1: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:2770:1: ( RULE_ID )
            // InternalInfluenceDSL.g:2771:2: RULE_ID
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
    // InternalInfluenceDSL.g:2780:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2784:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalInfluenceDSL.g:2785:2: rule__QualifiedName__Group__1__Impl
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
    // InternalInfluenceDSL.g:2791:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2795:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalInfluenceDSL.g:2796:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalInfluenceDSL.g:2796:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalInfluenceDSL.g:2797:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalInfluenceDSL.g:2798:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2798:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalInfluenceDSL.g:2807:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2811:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalInfluenceDSL.g:2812:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalInfluenceDSL.g:2819:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2823:1: ( ( '.' ) )
            // InternalInfluenceDSL.g:2824:1: ( '.' )
            {
            // InternalInfluenceDSL.g:2824:1: ( '.' )
            // InternalInfluenceDSL.g:2825:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2834:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2838:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalInfluenceDSL.g:2839:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalInfluenceDSL.g:2845:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2849:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:2850:1: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:2850:1: ( RULE_ID )
            // InternalInfluenceDSL.g:2851:2: RULE_ID
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
    // InternalInfluenceDSL.g:2861:1: rule__InfluenceModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InfluenceModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2865:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:2866:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:2866:2: ( ruleEString )
            // InternalInfluenceDSL.g:2867:3: ruleEString
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
    // InternalInfluenceDSL.g:2876:1: rule__InfluenceModel__OwnedArtifactsAssignment_3_0 : ( ruleDesignArtifact ) ;
    public final void rule__InfluenceModel__OwnedArtifactsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2880:1: ( ( ruleDesignArtifact ) )
            // InternalInfluenceDSL.g:2881:2: ( ruleDesignArtifact )
            {
            // InternalInfluenceDSL.g:2881:2: ( ruleDesignArtifact )
            // InternalInfluenceDSL.g:2882:3: ruleDesignArtifact
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
    // InternalInfluenceDSL.g:2891:1: rule__InfluenceModel__OwnedRequirementsAssignment_3_1 : ( ruleRequirementSatisfaction ) ;
    public final void rule__InfluenceModel__OwnedRequirementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2895:1: ( ( ruleRequirementSatisfaction ) )
            // InternalInfluenceDSL.g:2896:2: ( ruleRequirementSatisfaction )
            {
            // InternalInfluenceDSL.g:2896:2: ( ruleRequirementSatisfaction )
            // InternalInfluenceDSL.g:2897:3: ruleRequirementSatisfaction
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
    // InternalInfluenceDSL.g:2906:1: rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2 : ( rulePhysicalPhenomena ) ;
    public final void rule__InfluenceModel__OwnedPhysicalPhenomenaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2910:1: ( ( rulePhysicalPhenomena ) )
            // InternalInfluenceDSL.g:2911:2: ( rulePhysicalPhenomena )
            {
            // InternalInfluenceDSL.g:2911:2: ( rulePhysicalPhenomena )
            // InternalInfluenceDSL.g:2912:3: rulePhysicalPhenomena
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
    // InternalInfluenceDSL.g:2921:1: rule__InfluenceModel__OwnedInfluencesAssignment_3_3 : ( ruleAbstractInfluence ) ;
    public final void rule__InfluenceModel__OwnedInfluencesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2925:1: ( ( ruleAbstractInfluence ) )
            // InternalInfluenceDSL.g:2926:2: ( ruleAbstractInfluence )
            {
            // InternalInfluenceDSL.g:2926:2: ( ruleAbstractInfluence )
            // InternalInfluenceDSL.g:2927:3: ruleAbstractInfluence
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
    // InternalInfluenceDSL.g:2936:1: rule__CompositeInfluence__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeInfluence__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2940:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:2941:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:2941:2: ( ruleEString )
            // InternalInfluenceDSL.g:2942:3: ruleEString
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
    // InternalInfluenceDSL.g:2951:1: rule__CompositeInfluence__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__CompositeInfluence__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2955:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:2956:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:2956:2: ( ruleEString )
            // InternalInfluenceDSL.g:2957:3: ruleEString
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
    // InternalInfluenceDSL.g:2966:1: rule__CompositeInfluence__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CompositeInfluence__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2970:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:2971:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:2971:2: ( ruleEString )
            // InternalInfluenceDSL.g:2972:3: ruleEString
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
    // InternalInfluenceDSL.g:2981:1: rule__CompositeInfluence__InternalInfluencesAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__CompositeInfluence__InternalInfluencesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2985:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:2986:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:2986:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:2987:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeInfluenceAccess().getInternalInfluencesAbstractInfluenceCrossReference_8_0()); 
            // InternalInfluenceDSL.g:2988:3: ( ruleEString )
            // InternalInfluenceDSL.g:2989:4: ruleEString
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


    // $ANTLR start "rule__CompositeInfluence__AffectsAssignment_10"
    // InternalInfluenceDSL.g:3000:1: rule__CompositeInfluence__AffectsAssignment_10 : ( ruleSystemResponse ) ;
    public final void rule__CompositeInfluence__AffectsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3004:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3005:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3005:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3006:3: ruleSystemResponse
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__CompositeInfluence__AffectsAssignment_10"


    // $ANTLR start "rule__CompositeInfluence__AffectsAssignment_11_1"
    // InternalInfluenceDSL.g:3015:1: rule__CompositeInfluence__AffectsAssignment_11_1 : ( ruleSystemResponse ) ;
    public final void rule__CompositeInfluence__AffectsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3019:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3020:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3020:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3021:3: ruleSystemResponse
            {
             before(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getCompositeInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__CompositeInfluence__AffectsAssignment_11_1"


    // $ANTLR start "rule__Influence__NameAssignment_1"
    // InternalInfluenceDSL.g:3030:1: rule__Influence__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Influence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3034:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3035:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3035:2: ( ruleEString )
            // InternalInfluenceDSL.g:3036:3: ruleEString
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
    // InternalInfluenceDSL.g:3045:1: rule__Influence__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3049:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3050:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3050:2: ( ruleEString )
            // InternalInfluenceDSL.g:3051:3: ruleEString
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
    // InternalInfluenceDSL.g:3060:1: rule__Influence__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3064:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3065:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3065:2: ( ruleEString )
            // InternalInfluenceDSL.g:3066:3: ruleEString
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
    // InternalInfluenceDSL.g:3075:1: rule__Influence__OriginatorArtifactAssignment_8_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__OriginatorArtifactAssignment_8_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3079:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3080:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3080:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3081:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_8_0_1_0()); 
            // InternalInfluenceDSL.g:3082:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3083:4: RULE_ID
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactIDTerminalRuleCall_8_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactIDTerminalRuleCall_8_0_1_0_1()); 

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
    // InternalInfluenceDSL.g:3094:1: rule__Influence__OriginatorPhenomenaAssignment_8_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorPhenomenaAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3098:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3099:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3099:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3100:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_8_1_1_0()); 
            // InternalInfluenceDSL.g:3101:3: ( ruleEString )
            // InternalInfluenceDSL.g:3102:4: ruleEString
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
    // InternalInfluenceDSL.g:3113:1: rule__Influence__OriginatorSystemResponseAssignment_8_2_2 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorSystemResponseAssignment_8_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3117:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3118:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3118:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3119:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_8_2_2_0()); 
            // InternalInfluenceDSL.g:3120:3: ( ruleEString )
            // InternalInfluenceDSL.g:3121:4: ruleEString
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
    // InternalInfluenceDSL.g:3132:1: rule__Influence__OriginatorArtifactAssignment_9_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__OriginatorArtifactAssignment_9_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3136:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3137:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3137:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3138:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactCrossReference_9_1_0_1_0()); 
            // InternalInfluenceDSL.g:3139:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3140:4: RULE_ID
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactIDTerminalRuleCall_9_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getOriginatorArtifactDesignArtifactIDTerminalRuleCall_9_1_0_1_0_1()); 

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
    // InternalInfluenceDSL.g:3151:1: rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorPhenomenaAssignment_9_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3155:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3156:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3156:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3157:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorPhenomenaPhysicalPhenomenaCrossReference_9_1_1_1_0()); 
            // InternalInfluenceDSL.g:3158:3: ( ruleEString )
            // InternalInfluenceDSL.g:3159:4: ruleEString
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
    // InternalInfluenceDSL.g:3170:1: rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2 : ( ( ruleEString ) ) ;
    public final void rule__Influence__OriginatorSystemResponseAssignment_9_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3174:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3175:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3175:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3176:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getOriginatorSystemResponseSystemResponseCrossReference_9_1_2_2_0()); 
            // InternalInfluenceDSL.g:3177:3: ( ruleEString )
            // InternalInfluenceDSL.g:3178:4: ruleEString
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


    // $ANTLR start "rule__Influence__AffectsAssignment_11"
    // InternalInfluenceDSL.g:3189:1: rule__Influence__AffectsAssignment_11 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3193:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3194:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3194:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3195:3: ruleSystemResponse
            {
             before(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Influence__AffectsAssignment_11"


    // $ANTLR start "rule__Influence__AffectsAssignment_12_1"
    // InternalInfluenceDSL.g:3204:1: rule__Influence__AffectsAssignment_12_1 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3208:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3209:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3209:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3210:3: ruleSystemResponse
            {
             before(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Influence__AffectsAssignment_12_1"


    // $ANTLR start "rule__PhysicalPhenomena__NameAssignment_1"
    // InternalInfluenceDSL.g:3219:1: rule__PhysicalPhenomena__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PhysicalPhenomena__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3223:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3224:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3224:2: ( ruleEString )
            // InternalInfluenceDSL.g:3225:3: ruleEString
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
    // InternalInfluenceDSL.g:3234:1: rule__PhysicalPhenomena__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__PhysicalPhenomena__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3238:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3239:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3239:2: ( ruleEString )
            // InternalInfluenceDSL.g:3240:3: ruleEString
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
    // InternalInfluenceDSL.g:3249:1: rule__PhysicalPhenomena__DescriptionAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__PhysicalPhenomena__DescriptionAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3253:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3254:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3254:2: ( ruleEString )
            // InternalInfluenceDSL.g:3255:3: ruleEString
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
    // InternalInfluenceDSL.g:3264:1: rule__RequirementSatisfaction__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3268:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3269:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3269:2: ( ruleEString )
            // InternalInfluenceDSL.g:3270:3: ruleEString
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
    // InternalInfluenceDSL.g:3279:1: rule__RequirementSatisfaction__SatisfactionAssignment_5 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3283:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3284:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3284:2: ( ruleEString )
            // InternalInfluenceDSL.g:3285:3: ruleEString
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
    // InternalInfluenceDSL.g:3294:1: rule__RequirementSatisfaction__SatisfactionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3298:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3299:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3299:2: ( ruleEString )
            // InternalInfluenceDSL.g:3300:3: ruleEString
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


    // $ANTLR start "rule__DesignArtifact__NameAssignment_2"
    // InternalInfluenceDSL.g:3309:1: rule__DesignArtifact__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DesignArtifact__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3313:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3314:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3314:2: ( ruleEString )
            // InternalInfluenceDSL.g:3315:3: ruleEString
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
    // InternalInfluenceDSL.g:3324:1: rule__DesignArtifact__RefAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DesignArtifact__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3328:1: ( ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:3329:2: ( ( ruleQualifiedName ) )
            {
            // InternalInfluenceDSL.g:3329:2: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:3330:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDesignArtifactAccess().getRefEObjectCrossReference_4_0()); 
            // InternalInfluenceDSL.g:3331:3: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:3332:4: ruleQualifiedName
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


    // $ANTLR start "rule__SystemResponse__NameAssignment_3"
    // InternalInfluenceDSL.g:3343:1: rule__SystemResponse__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SystemResponse__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3347:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3348:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3348:2: ( ruleEString )
            // InternalInfluenceDSL.g:3349:3: ruleEString
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
    // InternalInfluenceDSL.g:3358:1: rule__SystemResponse__UsedInAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__SystemResponse__UsedInAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3362:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3363:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3363:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3364:3: ( ruleEString )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_2_0()); 
            // InternalInfluenceDSL.g:3365:3: ( ruleEString )
            // InternalInfluenceDSL.g:3366:4: ruleEString
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
    // InternalInfluenceDSL.g:3377:1: rule__SystemResponse__UsedInAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SystemResponse__UsedInAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3381:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3382:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3382:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3383:3: ( ruleEString )
            {
             before(grammarAccess.getSystemResponseAccess().getUsedInRequirementCrossReference_4_3_1_0()); 
            // InternalInfluenceDSL.g:3384:3: ( ruleEString )
            // InternalInfluenceDSL.g:3385:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000004C003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000004C003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000148000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});

}