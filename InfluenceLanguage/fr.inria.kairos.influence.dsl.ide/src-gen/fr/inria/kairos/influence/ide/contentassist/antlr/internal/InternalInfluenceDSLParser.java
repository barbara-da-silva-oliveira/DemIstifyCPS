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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'CompositeCyberPhysicalPhenomenon'", "'definedBy'", "','", "'configuration'", "'AtomicPhenomenon'", "'#**'", "'**#'", "'Influence'", "'from'", "'and'", "'phenomena'", "'emerges'", "'that'", "'implies'", "'which'", "'may'", "'violate'", "'it'", "'can'", "'be'", "'compensated'", "'by'", "'modifying'", "'Requirement'", "'Satisfaction'", "':'", "'satisfied'", "'when'", "'Artifact'", "'->'", "'system'", "'response'", "'resulting'", "'in'", "'Emergent'", "'Behavior'", "'characterized'", "'.'"
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


    // $ANTLR start "entryRuleCyberPhysicalPhenomena"
    // InternalInfluenceDSL.g:78:1: entryRuleCyberPhysicalPhenomena : ruleCyberPhysicalPhenomena EOF ;
    public final void entryRuleCyberPhysicalPhenomena() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:79:1: ( ruleCyberPhysicalPhenomena EOF )
            // InternalInfluenceDSL.g:80:1: ruleCyberPhysicalPhenomena EOF
            {
             before(grammarAccess.getCyberPhysicalPhenomenaRule()); 
            pushFollow(FOLLOW_1);
            ruleCyberPhysicalPhenomena();

            state._fsp--;

             after(grammarAccess.getCyberPhysicalPhenomenaRule()); 
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
    // $ANTLR end "entryRuleCyberPhysicalPhenomena"


    // $ANTLR start "ruleCyberPhysicalPhenomena"
    // InternalInfluenceDSL.g:87:1: ruleCyberPhysicalPhenomena : ( ( rule__CyberPhysicalPhenomena__Alternatives ) ) ;
    public final void ruleCyberPhysicalPhenomena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:91:2: ( ( ( rule__CyberPhysicalPhenomena__Alternatives ) ) )
            // InternalInfluenceDSL.g:92:2: ( ( rule__CyberPhysicalPhenomena__Alternatives ) )
            {
            // InternalInfluenceDSL.g:92:2: ( ( rule__CyberPhysicalPhenomena__Alternatives ) )
            // InternalInfluenceDSL.g:93:3: ( rule__CyberPhysicalPhenomena__Alternatives )
            {
             before(grammarAccess.getCyberPhysicalPhenomenaAccess().getAlternatives()); 
            // InternalInfluenceDSL.g:94:3: ( rule__CyberPhysicalPhenomena__Alternatives )
            // InternalInfluenceDSL.g:94:4: rule__CyberPhysicalPhenomena__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CyberPhysicalPhenomena__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCyberPhysicalPhenomenaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCyberPhysicalPhenomena"


    // $ANTLR start "entryRuleMultiPhenomenon"
    // InternalInfluenceDSL.g:103:1: entryRuleMultiPhenomenon : ruleMultiPhenomenon EOF ;
    public final void entryRuleMultiPhenomenon() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:104:1: ( ruleMultiPhenomenon EOF )
            // InternalInfluenceDSL.g:105:1: ruleMultiPhenomenon EOF
            {
             before(grammarAccess.getMultiPhenomenonRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiPhenomenon();

            state._fsp--;

             after(grammarAccess.getMultiPhenomenonRule()); 
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
    // $ANTLR end "entryRuleMultiPhenomenon"


    // $ANTLR start "ruleMultiPhenomenon"
    // InternalInfluenceDSL.g:112:1: ruleMultiPhenomenon : ( ( rule__MultiPhenomenon__Group__0 ) ) ;
    public final void ruleMultiPhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:116:2: ( ( ( rule__MultiPhenomenon__Group__0 ) ) )
            // InternalInfluenceDSL.g:117:2: ( ( rule__MultiPhenomenon__Group__0 ) )
            {
            // InternalInfluenceDSL.g:117:2: ( ( rule__MultiPhenomenon__Group__0 ) )
            // InternalInfluenceDSL.g:118:3: ( rule__MultiPhenomenon__Group__0 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup()); 
            // InternalInfluenceDSL.g:119:3: ( rule__MultiPhenomenon__Group__0 )
            // InternalInfluenceDSL.g:119:4: rule__MultiPhenomenon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiPhenomenonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiPhenomenon"


    // $ANTLR start "entryRuleSimplePhenomenon"
    // InternalInfluenceDSL.g:128:1: entryRuleSimplePhenomenon : ruleSimplePhenomenon EOF ;
    public final void entryRuleSimplePhenomenon() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:129:1: ( ruleSimplePhenomenon EOF )
            // InternalInfluenceDSL.g:130:1: ruleSimplePhenomenon EOF
            {
             before(grammarAccess.getSimplePhenomenonRule()); 
            pushFollow(FOLLOW_1);
            ruleSimplePhenomenon();

            state._fsp--;

             after(grammarAccess.getSimplePhenomenonRule()); 
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
    // $ANTLR end "entryRuleSimplePhenomenon"


    // $ANTLR start "ruleSimplePhenomenon"
    // InternalInfluenceDSL.g:137:1: ruleSimplePhenomenon : ( ( rule__SimplePhenomenon__Group__0 ) ) ;
    public final void ruleSimplePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:141:2: ( ( ( rule__SimplePhenomenon__Group__0 ) ) )
            // InternalInfluenceDSL.g:142:2: ( ( rule__SimplePhenomenon__Group__0 ) )
            {
            // InternalInfluenceDSL.g:142:2: ( ( rule__SimplePhenomenon__Group__0 ) )
            // InternalInfluenceDSL.g:143:3: ( rule__SimplePhenomenon__Group__0 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getGroup()); 
            // InternalInfluenceDSL.g:144:3: ( rule__SimplePhenomenon__Group__0 )
            // InternalInfluenceDSL.g:144:4: rule__SimplePhenomenon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimplePhenomenonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimplePhenomenon"


    // $ANTLR start "entryRuleInfluence"
    // InternalInfluenceDSL.g:153:1: entryRuleInfluence : ruleInfluence EOF ;
    public final void entryRuleInfluence() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:154:1: ( ruleInfluence EOF )
            // InternalInfluenceDSL.g:155:1: ruleInfluence EOF
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
    // InternalInfluenceDSL.g:162:1: ruleInfluence : ( ( rule__Influence__Group__0 ) ) ;
    public final void ruleInfluence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:166:2: ( ( ( rule__Influence__Group__0 ) ) )
            // InternalInfluenceDSL.g:167:2: ( ( rule__Influence__Group__0 ) )
            {
            // InternalInfluenceDSL.g:167:2: ( ( rule__Influence__Group__0 ) )
            // InternalInfluenceDSL.g:168:3: ( rule__Influence__Group__0 )
            {
             before(grammarAccess.getInfluenceAccess().getGroup()); 
            // InternalInfluenceDSL.g:169:3: ( rule__Influence__Group__0 )
            // InternalInfluenceDSL.g:169:4: rule__Influence__Group__0
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


    // $ANTLR start "entryRuleArtifact"
    // InternalInfluenceDSL.g:203:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:204:1: ( ruleArtifact EOF )
            // InternalInfluenceDSL.g:205:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalInfluenceDSL.g:212:1: ruleArtifact : ( ( rule__Artifact__Group__0 ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:216:2: ( ( ( rule__Artifact__Group__0 ) ) )
            // InternalInfluenceDSL.g:217:2: ( ( rule__Artifact__Group__0 ) )
            {
            // InternalInfluenceDSL.g:217:2: ( ( rule__Artifact__Group__0 ) )
            // InternalInfluenceDSL.g:218:3: ( rule__Artifact__Group__0 )
            {
             before(grammarAccess.getArtifactAccess().getGroup()); 
            // InternalInfluenceDSL.g:219:3: ( rule__Artifact__Group__0 )
            // InternalInfluenceDSL.g:219:4: rule__Artifact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtifact"


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


    // $ANTLR start "entryRuleEmergentBehavior"
    // InternalInfluenceDSL.g:278:1: entryRuleEmergentBehavior : ruleEmergentBehavior EOF ;
    public final void entryRuleEmergentBehavior() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:279:1: ( ruleEmergentBehavior EOF )
            // InternalInfluenceDSL.g:280:1: ruleEmergentBehavior EOF
            {
             before(grammarAccess.getEmergentBehaviorRule()); 
            pushFollow(FOLLOW_1);
            ruleEmergentBehavior();

            state._fsp--;

             after(grammarAccess.getEmergentBehaviorRule()); 
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
    // $ANTLR end "entryRuleEmergentBehavior"


    // $ANTLR start "ruleEmergentBehavior"
    // InternalInfluenceDSL.g:287:1: ruleEmergentBehavior : ( ( rule__EmergentBehavior__Group__0 ) ) ;
    public final void ruleEmergentBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:291:2: ( ( ( rule__EmergentBehavior__Group__0 ) ) )
            // InternalInfluenceDSL.g:292:2: ( ( rule__EmergentBehavior__Group__0 ) )
            {
            // InternalInfluenceDSL.g:292:2: ( ( rule__EmergentBehavior__Group__0 ) )
            // InternalInfluenceDSL.g:293:3: ( rule__EmergentBehavior__Group__0 )
            {
             before(grammarAccess.getEmergentBehaviorAccess().getGroup()); 
            // InternalInfluenceDSL.g:294:3: ( rule__EmergentBehavior__Group__0 )
            // InternalInfluenceDSL.g:294:4: rule__EmergentBehavior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmergentBehaviorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmergentBehavior"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInfluenceDSL.g:303:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalInfluenceDSL.g:304:1: ( ruleQualifiedName EOF )
            // InternalInfluenceDSL.g:305:1: ruleQualifiedName EOF
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
    // InternalInfluenceDSL.g:312:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:316:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalInfluenceDSL.g:317:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalInfluenceDSL.g:317:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalInfluenceDSL.g:318:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalInfluenceDSL.g:319:3: ( rule__QualifiedName__Group__0 )
            // InternalInfluenceDSL.g:319:4: rule__QualifiedName__Group__0
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
    // InternalInfluenceDSL.g:327:1: rule__InfluenceModel__Alternatives_3 : ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) );
    public final void rule__InfluenceModel__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:331:1: ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalInfluenceDSL.g:332:2: ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) )
                    {
                    // InternalInfluenceDSL.g:332:2: ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) )
                    // InternalInfluenceDSL.g:333:3: ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsAssignment_3_0()); 
                    // InternalInfluenceDSL.g:334:3: ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 )
                    // InternalInfluenceDSL.g:334:4: rule__InfluenceModel__OwnedArtifactsAssignment_3_0
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
                    // InternalInfluenceDSL.g:338:2: ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) )
                    {
                    // InternalInfluenceDSL.g:338:2: ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) )
                    // InternalInfluenceDSL.g:339:3: ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedRequirementSatisfactionAssignment_3_1()); 
                    // InternalInfluenceDSL.g:340:3: ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 )
                    // InternalInfluenceDSL.g:340:4: rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceModelAccess().getOwnedRequirementSatisfactionAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfluenceDSL.g:344:2: ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) )
                    {
                    // InternalInfluenceDSL.g:344:2: ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) )
                    // InternalInfluenceDSL.g:345:3: ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedCyberPhysicalPhenomenaAssignment_3_2()); 
                    // InternalInfluenceDSL.g:346:3: ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 )
                    // InternalInfluenceDSL.g:346:4: rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfluenceModelAccess().getOwnedCyberPhysicalPhenomenaAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfluenceDSL.g:350:2: ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) )
                    {
                    // InternalInfluenceDSL.g:350:2: ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) )
                    // InternalInfluenceDSL.g:351:3: ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesAssignment_3_3()); 
                    // InternalInfluenceDSL.g:352:3: ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 )
                    // InternalInfluenceDSL.g:352:4: rule__InfluenceModel__OwnedInfluencesAssignment_3_3
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


    // $ANTLR start "rule__CyberPhysicalPhenomena__Alternatives"
    // InternalInfluenceDSL.g:360:1: rule__CyberPhysicalPhenomena__Alternatives : ( ( ruleMultiPhenomenon ) | ( ruleSimplePhenomenon ) );
    public final void rule__CyberPhysicalPhenomena__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:364:1: ( ( ruleMultiPhenomenon ) | ( ruleSimplePhenomenon ) )
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
                    // InternalInfluenceDSL.g:365:2: ( ruleMultiPhenomenon )
                    {
                    // InternalInfluenceDSL.g:365:2: ( ruleMultiPhenomenon )
                    // InternalInfluenceDSL.g:366:3: ruleMultiPhenomenon
                    {
                     before(grammarAccess.getCyberPhysicalPhenomenaAccess().getMultiPhenomenonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiPhenomenon();

                    state._fsp--;

                     after(grammarAccess.getCyberPhysicalPhenomenaAccess().getMultiPhenomenonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:371:2: ( ruleSimplePhenomenon )
                    {
                    // InternalInfluenceDSL.g:371:2: ( ruleSimplePhenomenon )
                    // InternalInfluenceDSL.g:372:3: ruleSimplePhenomenon
                    {
                     before(grammarAccess.getCyberPhysicalPhenomenaAccess().getSimplePhenomenonParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimplePhenomenon();

                    state._fsp--;

                     after(grammarAccess.getCyberPhysicalPhenomenaAccess().getSimplePhenomenonParserRuleCall_1()); 

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
    // $ANTLR end "rule__CyberPhysicalPhenomena__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalInfluenceDSL.g:381:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:385:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalInfluenceDSL.g:386:2: ( RULE_STRING )
                    {
                    // InternalInfluenceDSL.g:386:2: ( RULE_STRING )
                    // InternalInfluenceDSL.g:387:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:392:2: ( RULE_ID )
                    {
                    // InternalInfluenceDSL.g:392:2: ( RULE_ID )
                    // InternalInfluenceDSL.g:393:3: RULE_ID
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
    // InternalInfluenceDSL.g:402:1: rule__InfluenceModel__Group__0 : rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 ;
    public final void rule__InfluenceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:406:1: ( rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 )
            // InternalInfluenceDSL.g:407:2: rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1
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
    // InternalInfluenceDSL.g:414:1: rule__InfluenceModel__Group__0__Impl : ( () ) ;
    public final void rule__InfluenceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:418:1: ( ( () ) )
            // InternalInfluenceDSL.g:419:1: ( () )
            {
            // InternalInfluenceDSL.g:419:1: ( () )
            // InternalInfluenceDSL.g:420:2: ()
            {
             before(grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0()); 
            // InternalInfluenceDSL.g:421:2: ()
            // InternalInfluenceDSL.g:421:3: 
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
    // InternalInfluenceDSL.g:429:1: rule__InfluenceModel__Group__1 : rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 ;
    public final void rule__InfluenceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:433:1: ( rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 )
            // InternalInfluenceDSL.g:434:2: rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2
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
    // InternalInfluenceDSL.g:441:1: rule__InfluenceModel__Group__1__Impl : ( 'InfluenceModel' ) ;
    public final void rule__InfluenceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:445:1: ( ( 'InfluenceModel' ) )
            // InternalInfluenceDSL.g:446:1: ( 'InfluenceModel' )
            {
            // InternalInfluenceDSL.g:446:1: ( 'InfluenceModel' )
            // InternalInfluenceDSL.g:447:2: 'InfluenceModel'
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
    // InternalInfluenceDSL.g:456:1: rule__InfluenceModel__Group__2 : rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 ;
    public final void rule__InfluenceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:460:1: ( rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 )
            // InternalInfluenceDSL.g:461:2: rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3
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
    // InternalInfluenceDSL.g:468:1: rule__InfluenceModel__Group__2__Impl : ( ( rule__InfluenceModel__NameAssignment_2 ) ) ;
    public final void rule__InfluenceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:472:1: ( ( ( rule__InfluenceModel__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:473:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:473:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:474:2: ( rule__InfluenceModel__NameAssignment_2 )
            {
             before(grammarAccess.getInfluenceModelAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:475:2: ( rule__InfluenceModel__NameAssignment_2 )
            // InternalInfluenceDSL.g:475:3: rule__InfluenceModel__NameAssignment_2
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
    // InternalInfluenceDSL.g:483:1: rule__InfluenceModel__Group__3 : rule__InfluenceModel__Group__3__Impl ;
    public final void rule__InfluenceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:487:1: ( rule__InfluenceModel__Group__3__Impl )
            // InternalInfluenceDSL.g:488:2: rule__InfluenceModel__Group__3__Impl
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
    // InternalInfluenceDSL.g:494:1: rule__InfluenceModel__Group__3__Impl : ( ( rule__InfluenceModel__Alternatives_3 )* ) ;
    public final void rule__InfluenceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:498:1: ( ( ( rule__InfluenceModel__Alternatives_3 )* ) )
            // InternalInfluenceDSL.g:499:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            {
            // InternalInfluenceDSL.g:499:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            // InternalInfluenceDSL.g:500:2: ( rule__InfluenceModel__Alternatives_3 )*
            {
             before(grammarAccess.getInfluenceModelAccess().getAlternatives_3()); 
            // InternalInfluenceDSL.g:501:2: ( rule__InfluenceModel__Alternatives_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||(LA4_0>=16 && LA4_0<=17)||LA4_0==35||LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalInfluenceDSL.g:501:3: rule__InfluenceModel__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__InfluenceModel__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "rule__MultiPhenomenon__Group__0"
    // InternalInfluenceDSL.g:510:1: rule__MultiPhenomenon__Group__0 : rule__MultiPhenomenon__Group__0__Impl rule__MultiPhenomenon__Group__1 ;
    public final void rule__MultiPhenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:514:1: ( rule__MultiPhenomenon__Group__0__Impl rule__MultiPhenomenon__Group__1 )
            // InternalInfluenceDSL.g:515:2: rule__MultiPhenomenon__Group__0__Impl rule__MultiPhenomenon__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MultiPhenomenon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group__1();

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
    // $ANTLR end "rule__MultiPhenomenon__Group__0"


    // $ANTLR start "rule__MultiPhenomenon__Group__0__Impl"
    // InternalInfluenceDSL.g:522:1: rule__MultiPhenomenon__Group__0__Impl : ( () ) ;
    public final void rule__MultiPhenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:526:1: ( ( () ) )
            // InternalInfluenceDSL.g:527:1: ( () )
            {
            // InternalInfluenceDSL.g:527:1: ( () )
            // InternalInfluenceDSL.g:528:2: ()
            {
             before(grammarAccess.getMultiPhenomenonAccess().getMultiPhenomenonAction_0()); 
            // InternalInfluenceDSL.g:529:2: ()
            // InternalInfluenceDSL.g:529:3: 
            {
            }

             after(grammarAccess.getMultiPhenomenonAccess().getMultiPhenomenonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group__0__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group__1"
    // InternalInfluenceDSL.g:537:1: rule__MultiPhenomenon__Group__1 : rule__MultiPhenomenon__Group__1__Impl rule__MultiPhenomenon__Group__2 ;
    public final void rule__MultiPhenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:541:1: ( rule__MultiPhenomenon__Group__1__Impl rule__MultiPhenomenon__Group__2 )
            // InternalInfluenceDSL.g:542:2: rule__MultiPhenomenon__Group__1__Impl rule__MultiPhenomenon__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MultiPhenomenon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group__2();

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
    // $ANTLR end "rule__MultiPhenomenon__Group__1"


    // $ANTLR start "rule__MultiPhenomenon__Group__1__Impl"
    // InternalInfluenceDSL.g:549:1: rule__MultiPhenomenon__Group__1__Impl : ( 'CompositeCyberPhysicalPhenomenon' ) ;
    public final void rule__MultiPhenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:553:1: ( ( 'CompositeCyberPhysicalPhenomenon' ) )
            // InternalInfluenceDSL.g:554:1: ( 'CompositeCyberPhysicalPhenomenon' )
            {
            // InternalInfluenceDSL.g:554:1: ( 'CompositeCyberPhysicalPhenomenon' )
            // InternalInfluenceDSL.g:555:2: 'CompositeCyberPhysicalPhenomenon'
            {
             before(grammarAccess.getMultiPhenomenonAccess().getCompositeCyberPhysicalPhenomenonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMultiPhenomenonAccess().getCompositeCyberPhysicalPhenomenonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group__1__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group__2"
    // InternalInfluenceDSL.g:564:1: rule__MultiPhenomenon__Group__2 : rule__MultiPhenomenon__Group__2__Impl rule__MultiPhenomenon__Group__3 ;
    public final void rule__MultiPhenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:568:1: ( rule__MultiPhenomenon__Group__2__Impl rule__MultiPhenomenon__Group__3 )
            // InternalInfluenceDSL.g:569:2: rule__MultiPhenomenon__Group__2__Impl rule__MultiPhenomenon__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__MultiPhenomenon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group__3();

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
    // $ANTLR end "rule__MultiPhenomenon__Group__2"


    // $ANTLR start "rule__MultiPhenomenon__Group__2__Impl"
    // InternalInfluenceDSL.g:576:1: rule__MultiPhenomenon__Group__2__Impl : ( ( rule__MultiPhenomenon__NameAssignment_2 ) ) ;
    public final void rule__MultiPhenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:580:1: ( ( ( rule__MultiPhenomenon__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:581:1: ( ( rule__MultiPhenomenon__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:581:1: ( ( rule__MultiPhenomenon__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:582:2: ( rule__MultiPhenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:583:2: ( rule__MultiPhenomenon__NameAssignment_2 )
            // InternalInfluenceDSL.g:583:3: rule__MultiPhenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiPhenomenonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group__2__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group__3"
    // InternalInfluenceDSL.g:591:1: rule__MultiPhenomenon__Group__3 : rule__MultiPhenomenon__Group__3__Impl rule__MultiPhenomenon__Group__4 ;
    public final void rule__MultiPhenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:595:1: ( rule__MultiPhenomenon__Group__3__Impl rule__MultiPhenomenon__Group__4 )
            // InternalInfluenceDSL.g:596:2: rule__MultiPhenomenon__Group__3__Impl rule__MultiPhenomenon__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__MultiPhenomenon__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group__4();

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
    // $ANTLR end "rule__MultiPhenomenon__Group__3"


    // $ANTLR start "rule__MultiPhenomenon__Group__3__Impl"
    // InternalInfluenceDSL.g:603:1: rule__MultiPhenomenon__Group__3__Impl : ( ( rule__MultiPhenomenon__Group_3__0 )? ) ;
    public final void rule__MultiPhenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:607:1: ( ( ( rule__MultiPhenomenon__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:608:1: ( ( rule__MultiPhenomenon__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:608:1: ( ( rule__MultiPhenomenon__Group_3__0 )? )
            // InternalInfluenceDSL.g:609:2: ( rule__MultiPhenomenon__Group_3__0 )?
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:610:2: ( rule__MultiPhenomenon__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInfluenceDSL.g:610:3: rule__MultiPhenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiPhenomenon__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiPhenomenonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group__3__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group__4"
    // InternalInfluenceDSL.g:618:1: rule__MultiPhenomenon__Group__4 : rule__MultiPhenomenon__Group__4__Impl ;
    public final void rule__MultiPhenomenon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:622:1: ( rule__MultiPhenomenon__Group__4__Impl )
            // InternalInfluenceDSL.g:623:2: rule__MultiPhenomenon__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group__4__Impl();

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
    // $ANTLR end "rule__MultiPhenomenon__Group__4"


    // $ANTLR start "rule__MultiPhenomenon__Group__4__Impl"
    // InternalInfluenceDSL.g:629:1: rule__MultiPhenomenon__Group__4__Impl : ( ( rule__MultiPhenomenon__Group_4__0 )? ) ;
    public final void rule__MultiPhenomenon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:633:1: ( ( ( rule__MultiPhenomenon__Group_4__0 )? ) )
            // InternalInfluenceDSL.g:634:1: ( ( rule__MultiPhenomenon__Group_4__0 )? )
            {
            // InternalInfluenceDSL.g:634:1: ( ( rule__MultiPhenomenon__Group_4__0 )? )
            // InternalInfluenceDSL.g:635:2: ( rule__MultiPhenomenon__Group_4__0 )?
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:636:2: ( rule__MultiPhenomenon__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInfluenceDSL.g:636:3: rule__MultiPhenomenon__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiPhenomenon__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiPhenomenonAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group__4__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_3__0"
    // InternalInfluenceDSL.g:645:1: rule__MultiPhenomenon__Group_3__0 : rule__MultiPhenomenon__Group_3__0__Impl rule__MultiPhenomenon__Group_3__1 ;
    public final void rule__MultiPhenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:649:1: ( rule__MultiPhenomenon__Group_3__0__Impl rule__MultiPhenomenon__Group_3__1 )
            // InternalInfluenceDSL.g:650:2: rule__MultiPhenomenon__Group_3__0__Impl rule__MultiPhenomenon__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MultiPhenomenon__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_3__1();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_3__0"


    // $ANTLR start "rule__MultiPhenomenon__Group_3__0__Impl"
    // InternalInfluenceDSL.g:657:1: rule__MultiPhenomenon__Group_3__0__Impl : ( 'definedBy' ) ;
    public final void rule__MultiPhenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:661:1: ( ( 'definedBy' ) )
            // InternalInfluenceDSL.g:662:1: ( 'definedBy' )
            {
            // InternalInfluenceDSL.g:662:1: ( 'definedBy' )
            // InternalInfluenceDSL.g:663:2: 'definedBy'
            {
             before(grammarAccess.getMultiPhenomenonAccess().getDefinedByKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMultiPhenomenonAccess().getDefinedByKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_3__0__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_3__1"
    // InternalInfluenceDSL.g:672:1: rule__MultiPhenomenon__Group_3__1 : rule__MultiPhenomenon__Group_3__1__Impl rule__MultiPhenomenon__Group_3__2 ;
    public final void rule__MultiPhenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:676:1: ( rule__MultiPhenomenon__Group_3__1__Impl rule__MultiPhenomenon__Group_3__2 )
            // InternalInfluenceDSL.g:677:2: rule__MultiPhenomenon__Group_3__1__Impl rule__MultiPhenomenon__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__MultiPhenomenon__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_3__2();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_3__1"


    // $ANTLR start "rule__MultiPhenomenon__Group_3__1__Impl"
    // InternalInfluenceDSL.g:684:1: rule__MultiPhenomenon__Group_3__1__Impl : ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:688:1: ( ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) ) )
            // InternalInfluenceDSL.g:689:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) )
            {
            // InternalInfluenceDSL.g:689:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) )
            // InternalInfluenceDSL.g:690:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfAssignment_3_1()); 
            // InternalInfluenceDSL.g:691:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 )
            // InternalInfluenceDSL.g:691:3: rule__MultiPhenomenon__AggregationOfAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__AggregationOfAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiPhenomenonAccess().getAggregationOfAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_3__1__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_3__2"
    // InternalInfluenceDSL.g:699:1: rule__MultiPhenomenon__Group_3__2 : rule__MultiPhenomenon__Group_3__2__Impl ;
    public final void rule__MultiPhenomenon__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:703:1: ( rule__MultiPhenomenon__Group_3__2__Impl )
            // InternalInfluenceDSL.g:704:2: rule__MultiPhenomenon__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_3__2__Impl();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_3__2"


    // $ANTLR start "rule__MultiPhenomenon__Group_3__2__Impl"
    // InternalInfluenceDSL.g:710:1: rule__MultiPhenomenon__Group_3__2__Impl : ( ( rule__MultiPhenomenon__Group_3_2__0 )* ) ;
    public final void rule__MultiPhenomenon__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:714:1: ( ( ( rule__MultiPhenomenon__Group_3_2__0 )* ) )
            // InternalInfluenceDSL.g:715:1: ( ( rule__MultiPhenomenon__Group_3_2__0 )* )
            {
            // InternalInfluenceDSL.g:715:1: ( ( rule__MultiPhenomenon__Group_3_2__0 )* )
            // InternalInfluenceDSL.g:716:2: ( rule__MultiPhenomenon__Group_3_2__0 )*
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_3_2()); 
            // InternalInfluenceDSL.g:717:2: ( rule__MultiPhenomenon__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInfluenceDSL.g:717:3: rule__MultiPhenomenon__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultiPhenomenon__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMultiPhenomenonAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_3__2__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_3_2__0"
    // InternalInfluenceDSL.g:726:1: rule__MultiPhenomenon__Group_3_2__0 : rule__MultiPhenomenon__Group_3_2__0__Impl rule__MultiPhenomenon__Group_3_2__1 ;
    public final void rule__MultiPhenomenon__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:730:1: ( rule__MultiPhenomenon__Group_3_2__0__Impl rule__MultiPhenomenon__Group_3_2__1 )
            // InternalInfluenceDSL.g:731:2: rule__MultiPhenomenon__Group_3_2__0__Impl rule__MultiPhenomenon__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__MultiPhenomenon__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_3_2__1();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_3_2__0"


    // $ANTLR start "rule__MultiPhenomenon__Group_3_2__0__Impl"
    // InternalInfluenceDSL.g:738:1: rule__MultiPhenomenon__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MultiPhenomenon__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:742:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:743:1: ( ',' )
            {
            // InternalInfluenceDSL.g:743:1: ( ',' )
            // InternalInfluenceDSL.g:744:2: ','
            {
             before(grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_3_2__0__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_3_2__1"
    // InternalInfluenceDSL.g:753:1: rule__MultiPhenomenon__Group_3_2__1 : rule__MultiPhenomenon__Group_3_2__1__Impl ;
    public final void rule__MultiPhenomenon__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:757:1: ( rule__MultiPhenomenon__Group_3_2__1__Impl )
            // InternalInfluenceDSL.g:758:2: rule__MultiPhenomenon__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_3_2__1"


    // $ANTLR start "rule__MultiPhenomenon__Group_3_2__1__Impl"
    // InternalInfluenceDSL.g:764:1: rule__MultiPhenomenon__Group_3_2__1__Impl : ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:768:1: ( ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) ) )
            // InternalInfluenceDSL.g:769:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) )
            {
            // InternalInfluenceDSL.g:769:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) )
            // InternalInfluenceDSL.g:770:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfAssignment_3_2_1()); 
            // InternalInfluenceDSL.g:771:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 )
            // InternalInfluenceDSL.g:771:3: rule__MultiPhenomenon__AggregationOfAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__AggregationOfAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiPhenomenonAccess().getAggregationOfAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_3_2__1__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_4__0"
    // InternalInfluenceDSL.g:780:1: rule__MultiPhenomenon__Group_4__0 : rule__MultiPhenomenon__Group_4__0__Impl rule__MultiPhenomenon__Group_4__1 ;
    public final void rule__MultiPhenomenon__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:784:1: ( rule__MultiPhenomenon__Group_4__0__Impl rule__MultiPhenomenon__Group_4__1 )
            // InternalInfluenceDSL.g:785:2: rule__MultiPhenomenon__Group_4__0__Impl rule__MultiPhenomenon__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__MultiPhenomenon__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_4__1();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_4__0"


    // $ANTLR start "rule__MultiPhenomenon__Group_4__0__Impl"
    // InternalInfluenceDSL.g:792:1: rule__MultiPhenomenon__Group_4__0__Impl : ( 'configuration' ) ;
    public final void rule__MultiPhenomenon__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:796:1: ( ( 'configuration' ) )
            // InternalInfluenceDSL.g:797:1: ( 'configuration' )
            {
            // InternalInfluenceDSL.g:797:1: ( 'configuration' )
            // InternalInfluenceDSL.g:798:2: 'configuration'
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMultiPhenomenonAccess().getConfigurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_4__0__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_4__1"
    // InternalInfluenceDSL.g:807:1: rule__MultiPhenomenon__Group_4__1 : rule__MultiPhenomenon__Group_4__1__Impl rule__MultiPhenomenon__Group_4__2 ;
    public final void rule__MultiPhenomenon__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:811:1: ( rule__MultiPhenomenon__Group_4__1__Impl rule__MultiPhenomenon__Group_4__2 )
            // InternalInfluenceDSL.g:812:2: rule__MultiPhenomenon__Group_4__1__Impl rule__MultiPhenomenon__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__MultiPhenomenon__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_4__2();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_4__1"


    // $ANTLR start "rule__MultiPhenomenon__Group_4__1__Impl"
    // InternalInfluenceDSL.g:819:1: rule__MultiPhenomenon__Group_4__1__Impl : ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:823:1: ( ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) ) )
            // InternalInfluenceDSL.g:824:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) )
            {
            // InternalInfluenceDSL.g:824:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) )
            // InternalInfluenceDSL.g:825:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationAssignment_4_1()); 
            // InternalInfluenceDSL.g:826:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 )
            // InternalInfluenceDSL.g:826:3: rule__MultiPhenomenon__ConfigurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__ConfigurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiPhenomenonAccess().getConfigurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_4__1__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_4__2"
    // InternalInfluenceDSL.g:834:1: rule__MultiPhenomenon__Group_4__2 : rule__MultiPhenomenon__Group_4__2__Impl ;
    public final void rule__MultiPhenomenon__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:838:1: ( rule__MultiPhenomenon__Group_4__2__Impl )
            // InternalInfluenceDSL.g:839:2: rule__MultiPhenomenon__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_4__2__Impl();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_4__2"


    // $ANTLR start "rule__MultiPhenomenon__Group_4__2__Impl"
    // InternalInfluenceDSL.g:845:1: rule__MultiPhenomenon__Group_4__2__Impl : ( ( rule__MultiPhenomenon__Group_4_2__0 )* ) ;
    public final void rule__MultiPhenomenon__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:849:1: ( ( ( rule__MultiPhenomenon__Group_4_2__0 )* ) )
            // InternalInfluenceDSL.g:850:1: ( ( rule__MultiPhenomenon__Group_4_2__0 )* )
            {
            // InternalInfluenceDSL.g:850:1: ( ( rule__MultiPhenomenon__Group_4_2__0 )* )
            // InternalInfluenceDSL.g:851:2: ( rule__MultiPhenomenon__Group_4_2__0 )*
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_4_2()); 
            // InternalInfluenceDSL.g:852:2: ( rule__MultiPhenomenon__Group_4_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalInfluenceDSL.g:852:3: rule__MultiPhenomenon__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultiPhenomenon__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMultiPhenomenonAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_4__2__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_4_2__0"
    // InternalInfluenceDSL.g:861:1: rule__MultiPhenomenon__Group_4_2__0 : rule__MultiPhenomenon__Group_4_2__0__Impl rule__MultiPhenomenon__Group_4_2__1 ;
    public final void rule__MultiPhenomenon__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:865:1: ( rule__MultiPhenomenon__Group_4_2__0__Impl rule__MultiPhenomenon__Group_4_2__1 )
            // InternalInfluenceDSL.g:866:2: rule__MultiPhenomenon__Group_4_2__0__Impl rule__MultiPhenomenon__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__MultiPhenomenon__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_4_2__1();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_4_2__0"


    // $ANTLR start "rule__MultiPhenomenon__Group_4_2__0__Impl"
    // InternalInfluenceDSL.g:873:1: rule__MultiPhenomenon__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__MultiPhenomenon__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:877:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:878:1: ( ',' )
            {
            // InternalInfluenceDSL.g:878:1: ( ',' )
            // InternalInfluenceDSL.g:879:2: ','
            {
             before(grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_4_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultiPhenomenonAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_4_2__0__Impl"


    // $ANTLR start "rule__MultiPhenomenon__Group_4_2__1"
    // InternalInfluenceDSL.g:888:1: rule__MultiPhenomenon__Group_4_2__1 : rule__MultiPhenomenon__Group_4_2__1__Impl ;
    public final void rule__MultiPhenomenon__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:892:1: ( rule__MultiPhenomenon__Group_4_2__1__Impl )
            // InternalInfluenceDSL.g:893:2: rule__MultiPhenomenon__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__MultiPhenomenon__Group_4_2__1"


    // $ANTLR start "rule__MultiPhenomenon__Group_4_2__1__Impl"
    // InternalInfluenceDSL.g:899:1: rule__MultiPhenomenon__Group_4_2__1__Impl : ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:903:1: ( ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) ) )
            // InternalInfluenceDSL.g:904:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) )
            {
            // InternalInfluenceDSL.g:904:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) )
            // InternalInfluenceDSL.g:905:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationAssignment_4_2_1()); 
            // InternalInfluenceDSL.g:906:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 )
            // InternalInfluenceDSL.g:906:3: rule__MultiPhenomenon__ConfigurationAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiPhenomenon__ConfigurationAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiPhenomenonAccess().getConfigurationAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__Group_4_2__1__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group__0"
    // InternalInfluenceDSL.g:915:1: rule__SimplePhenomenon__Group__0 : rule__SimplePhenomenon__Group__0__Impl rule__SimplePhenomenon__Group__1 ;
    public final void rule__SimplePhenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:919:1: ( rule__SimplePhenomenon__Group__0__Impl rule__SimplePhenomenon__Group__1 )
            // InternalInfluenceDSL.g:920:2: rule__SimplePhenomenon__Group__0__Impl rule__SimplePhenomenon__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SimplePhenomenon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group__1();

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
    // $ANTLR end "rule__SimplePhenomenon__Group__0"


    // $ANTLR start "rule__SimplePhenomenon__Group__0__Impl"
    // InternalInfluenceDSL.g:927:1: rule__SimplePhenomenon__Group__0__Impl : ( () ) ;
    public final void rule__SimplePhenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:931:1: ( ( () ) )
            // InternalInfluenceDSL.g:932:1: ( () )
            {
            // InternalInfluenceDSL.g:932:1: ( () )
            // InternalInfluenceDSL.g:933:2: ()
            {
             before(grammarAccess.getSimplePhenomenonAccess().getSimplePhenomenonAction_0()); 
            // InternalInfluenceDSL.g:934:2: ()
            // InternalInfluenceDSL.g:934:3: 
            {
            }

             after(grammarAccess.getSimplePhenomenonAccess().getSimplePhenomenonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group__0__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group__1"
    // InternalInfluenceDSL.g:942:1: rule__SimplePhenomenon__Group__1 : rule__SimplePhenomenon__Group__1__Impl rule__SimplePhenomenon__Group__2 ;
    public final void rule__SimplePhenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:946:1: ( rule__SimplePhenomenon__Group__1__Impl rule__SimplePhenomenon__Group__2 )
            // InternalInfluenceDSL.g:947:2: rule__SimplePhenomenon__Group__1__Impl rule__SimplePhenomenon__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SimplePhenomenon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group__2();

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
    // $ANTLR end "rule__SimplePhenomenon__Group__1"


    // $ANTLR start "rule__SimplePhenomenon__Group__1__Impl"
    // InternalInfluenceDSL.g:954:1: rule__SimplePhenomenon__Group__1__Impl : ( 'AtomicPhenomenon' ) ;
    public final void rule__SimplePhenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:958:1: ( ( 'AtomicPhenomenon' ) )
            // InternalInfluenceDSL.g:959:1: ( 'AtomicPhenomenon' )
            {
            // InternalInfluenceDSL.g:959:1: ( 'AtomicPhenomenon' )
            // InternalInfluenceDSL.g:960:2: 'AtomicPhenomenon'
            {
             before(grammarAccess.getSimplePhenomenonAccess().getAtomicPhenomenonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSimplePhenomenonAccess().getAtomicPhenomenonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group__1__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group__2"
    // InternalInfluenceDSL.g:969:1: rule__SimplePhenomenon__Group__2 : rule__SimplePhenomenon__Group__2__Impl rule__SimplePhenomenon__Group__3 ;
    public final void rule__SimplePhenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:973:1: ( rule__SimplePhenomenon__Group__2__Impl rule__SimplePhenomenon__Group__3 )
            // InternalInfluenceDSL.g:974:2: rule__SimplePhenomenon__Group__2__Impl rule__SimplePhenomenon__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SimplePhenomenon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group__3();

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
    // $ANTLR end "rule__SimplePhenomenon__Group__2"


    // $ANTLR start "rule__SimplePhenomenon__Group__2__Impl"
    // InternalInfluenceDSL.g:981:1: rule__SimplePhenomenon__Group__2__Impl : ( ( rule__SimplePhenomenon__NameAssignment_2 ) ) ;
    public final void rule__SimplePhenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:985:1: ( ( ( rule__SimplePhenomenon__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:986:1: ( ( rule__SimplePhenomenon__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:986:1: ( ( rule__SimplePhenomenon__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:987:2: ( rule__SimplePhenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:988:2: ( rule__SimplePhenomenon__NameAssignment_2 )
            // InternalInfluenceDSL.g:988:3: rule__SimplePhenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimplePhenomenonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group__2__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group__3"
    // InternalInfluenceDSL.g:996:1: rule__SimplePhenomenon__Group__3 : rule__SimplePhenomenon__Group__3__Impl ;
    public final void rule__SimplePhenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1000:1: ( rule__SimplePhenomenon__Group__3__Impl )
            // InternalInfluenceDSL.g:1001:2: rule__SimplePhenomenon__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group__3__Impl();

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
    // $ANTLR end "rule__SimplePhenomenon__Group__3"


    // $ANTLR start "rule__SimplePhenomenon__Group__3__Impl"
    // InternalInfluenceDSL.g:1007:1: rule__SimplePhenomenon__Group__3__Impl : ( ( rule__SimplePhenomenon__Group_3__0 )? ) ;
    public final void rule__SimplePhenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1011:1: ( ( ( rule__SimplePhenomenon__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:1012:1: ( ( rule__SimplePhenomenon__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:1012:1: ( ( rule__SimplePhenomenon__Group_3__0 )? )
            // InternalInfluenceDSL.g:1013:2: ( rule__SimplePhenomenon__Group_3__0 )?
            {
             before(grammarAccess.getSimplePhenomenonAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:1014:2: ( rule__SimplePhenomenon__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInfluenceDSL.g:1014:3: rule__SimplePhenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimplePhenomenon__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimplePhenomenonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group__3__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group_3__0"
    // InternalInfluenceDSL.g:1023:1: rule__SimplePhenomenon__Group_3__0 : rule__SimplePhenomenon__Group_3__0__Impl rule__SimplePhenomenon__Group_3__1 ;
    public final void rule__SimplePhenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1027:1: ( rule__SimplePhenomenon__Group_3__0__Impl rule__SimplePhenomenon__Group_3__1 )
            // InternalInfluenceDSL.g:1028:2: rule__SimplePhenomenon__Group_3__0__Impl rule__SimplePhenomenon__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SimplePhenomenon__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group_3__1();

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
    // $ANTLR end "rule__SimplePhenomenon__Group_3__0"


    // $ANTLR start "rule__SimplePhenomenon__Group_3__0__Impl"
    // InternalInfluenceDSL.g:1035:1: rule__SimplePhenomenon__Group_3__0__Impl : ( 'configuration' ) ;
    public final void rule__SimplePhenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1039:1: ( ( 'configuration' ) )
            // InternalInfluenceDSL.g:1040:1: ( 'configuration' )
            {
            // InternalInfluenceDSL.g:1040:1: ( 'configuration' )
            // InternalInfluenceDSL.g:1041:2: 'configuration'
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSimplePhenomenonAccess().getConfigurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group_3__0__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group_3__1"
    // InternalInfluenceDSL.g:1050:1: rule__SimplePhenomenon__Group_3__1 : rule__SimplePhenomenon__Group_3__1__Impl rule__SimplePhenomenon__Group_3__2 ;
    public final void rule__SimplePhenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1054:1: ( rule__SimplePhenomenon__Group_3__1__Impl rule__SimplePhenomenon__Group_3__2 )
            // InternalInfluenceDSL.g:1055:2: rule__SimplePhenomenon__Group_3__1__Impl rule__SimplePhenomenon__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__SimplePhenomenon__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group_3__2();

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
    // $ANTLR end "rule__SimplePhenomenon__Group_3__1"


    // $ANTLR start "rule__SimplePhenomenon__Group_3__1__Impl"
    // InternalInfluenceDSL.g:1062:1: rule__SimplePhenomenon__Group_3__1__Impl : ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) ) ;
    public final void rule__SimplePhenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1066:1: ( ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) ) )
            // InternalInfluenceDSL.g:1067:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) )
            {
            // InternalInfluenceDSL.g:1067:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) )
            // InternalInfluenceDSL.g:1068:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationAssignment_3_1()); 
            // InternalInfluenceDSL.g:1069:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 )
            // InternalInfluenceDSL.g:1069:3: rule__SimplePhenomenon__ConfigurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__ConfigurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimplePhenomenonAccess().getConfigurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group_3__1__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group_3__2"
    // InternalInfluenceDSL.g:1077:1: rule__SimplePhenomenon__Group_3__2 : rule__SimplePhenomenon__Group_3__2__Impl ;
    public final void rule__SimplePhenomenon__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1081:1: ( rule__SimplePhenomenon__Group_3__2__Impl )
            // InternalInfluenceDSL.g:1082:2: rule__SimplePhenomenon__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group_3__2__Impl();

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
    // $ANTLR end "rule__SimplePhenomenon__Group_3__2"


    // $ANTLR start "rule__SimplePhenomenon__Group_3__2__Impl"
    // InternalInfluenceDSL.g:1088:1: rule__SimplePhenomenon__Group_3__2__Impl : ( ( rule__SimplePhenomenon__Group_3_2__0 )* ) ;
    public final void rule__SimplePhenomenon__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1092:1: ( ( ( rule__SimplePhenomenon__Group_3_2__0 )* ) )
            // InternalInfluenceDSL.g:1093:1: ( ( rule__SimplePhenomenon__Group_3_2__0 )* )
            {
            // InternalInfluenceDSL.g:1093:1: ( ( rule__SimplePhenomenon__Group_3_2__0 )* )
            // InternalInfluenceDSL.g:1094:2: ( rule__SimplePhenomenon__Group_3_2__0 )*
            {
             before(grammarAccess.getSimplePhenomenonAccess().getGroup_3_2()); 
            // InternalInfluenceDSL.g:1095:2: ( rule__SimplePhenomenon__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1095:3: rule__SimplePhenomenon__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SimplePhenomenon__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSimplePhenomenonAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group_3__2__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group_3_2__0"
    // InternalInfluenceDSL.g:1104:1: rule__SimplePhenomenon__Group_3_2__0 : rule__SimplePhenomenon__Group_3_2__0__Impl rule__SimplePhenomenon__Group_3_2__1 ;
    public final void rule__SimplePhenomenon__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1108:1: ( rule__SimplePhenomenon__Group_3_2__0__Impl rule__SimplePhenomenon__Group_3_2__1 )
            // InternalInfluenceDSL.g:1109:2: rule__SimplePhenomenon__Group_3_2__0__Impl rule__SimplePhenomenon__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SimplePhenomenon__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group_3_2__1();

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
    // $ANTLR end "rule__SimplePhenomenon__Group_3_2__0"


    // $ANTLR start "rule__SimplePhenomenon__Group_3_2__0__Impl"
    // InternalInfluenceDSL.g:1116:1: rule__SimplePhenomenon__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SimplePhenomenon__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1120:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:1121:1: ( ',' )
            {
            // InternalInfluenceDSL.g:1121:1: ( ',' )
            // InternalInfluenceDSL.g:1122:2: ','
            {
             before(grammarAccess.getSimplePhenomenonAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSimplePhenomenonAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group_3_2__0__Impl"


    // $ANTLR start "rule__SimplePhenomenon__Group_3_2__1"
    // InternalInfluenceDSL.g:1131:1: rule__SimplePhenomenon__Group_3_2__1 : rule__SimplePhenomenon__Group_3_2__1__Impl ;
    public final void rule__SimplePhenomenon__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1135:1: ( rule__SimplePhenomenon__Group_3_2__1__Impl )
            // InternalInfluenceDSL.g:1136:2: rule__SimplePhenomenon__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__SimplePhenomenon__Group_3_2__1"


    // $ANTLR start "rule__SimplePhenomenon__Group_3_2__1__Impl"
    // InternalInfluenceDSL.g:1142:1: rule__SimplePhenomenon__Group_3_2__1__Impl : ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) ) ;
    public final void rule__SimplePhenomenon__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1146:1: ( ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) ) )
            // InternalInfluenceDSL.g:1147:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) )
            {
            // InternalInfluenceDSL.g:1147:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) )
            // InternalInfluenceDSL.g:1148:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationAssignment_3_2_1()); 
            // InternalInfluenceDSL.g:1149:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 )
            // InternalInfluenceDSL.g:1149:3: rule__SimplePhenomenon__ConfigurationAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SimplePhenomenon__ConfigurationAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimplePhenomenonAccess().getConfigurationAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__Group_3_2__1__Impl"


    // $ANTLR start "rule__Influence__Group__0"
    // InternalInfluenceDSL.g:1158:1: rule__Influence__Group__0 : rule__Influence__Group__0__Impl rule__Influence__Group__1 ;
    public final void rule__Influence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1162:1: ( rule__Influence__Group__0__Impl rule__Influence__Group__1 )
            // InternalInfluenceDSL.g:1163:2: rule__Influence__Group__0__Impl rule__Influence__Group__1
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
    // InternalInfluenceDSL.g:1170:1: rule__Influence__Group__0__Impl : ( '#**' ) ;
    public final void rule__Influence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1174:1: ( ( '#**' ) )
            // InternalInfluenceDSL.g:1175:1: ( '#**' )
            {
            // InternalInfluenceDSL.g:1175:1: ( '#**' )
            // InternalInfluenceDSL.g:1176:2: '#**'
            {
             before(grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getNumberSignAsteriskAsteriskKeyword_0()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1185:1: rule__Influence__Group__1 : rule__Influence__Group__1__Impl rule__Influence__Group__2 ;
    public final void rule__Influence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1189:1: ( rule__Influence__Group__1__Impl rule__Influence__Group__2 )
            // InternalInfluenceDSL.g:1190:2: rule__Influence__Group__1__Impl rule__Influence__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalInfluenceDSL.g:1197:1: rule__Influence__Group__1__Impl : ( ( rule__Influence__DescriptionAssignment_1 ) ) ;
    public final void rule__Influence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1201:1: ( ( ( rule__Influence__DescriptionAssignment_1 ) ) )
            // InternalInfluenceDSL.g:1202:1: ( ( rule__Influence__DescriptionAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:1202:1: ( ( rule__Influence__DescriptionAssignment_1 ) )
            // InternalInfluenceDSL.g:1203:2: ( rule__Influence__DescriptionAssignment_1 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_1()); 
            // InternalInfluenceDSL.g:1204:2: ( rule__Influence__DescriptionAssignment_1 )
            // InternalInfluenceDSL.g:1204:3: rule__Influence__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getDescriptionAssignment_1()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1212:1: rule__Influence__Group__2 : rule__Influence__Group__2__Impl rule__Influence__Group__3 ;
    public final void rule__Influence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1216:1: ( rule__Influence__Group__2__Impl rule__Influence__Group__3 )
            // InternalInfluenceDSL.g:1217:2: rule__Influence__Group__2__Impl rule__Influence__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalInfluenceDSL.g:1224:1: rule__Influence__Group__2__Impl : ( ( rule__Influence__Group_2__0 )* ) ;
    public final void rule__Influence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1228:1: ( ( ( rule__Influence__Group_2__0 )* ) )
            // InternalInfluenceDSL.g:1229:1: ( ( rule__Influence__Group_2__0 )* )
            {
            // InternalInfluenceDSL.g:1229:1: ( ( rule__Influence__Group_2__0 )* )
            // InternalInfluenceDSL.g:1230:2: ( rule__Influence__Group_2__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_2()); 
            // InternalInfluenceDSL.g:1231:2: ( rule__Influence__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1231:3: rule__Influence__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1239:1: rule__Influence__Group__3 : rule__Influence__Group__3__Impl rule__Influence__Group__4 ;
    public final void rule__Influence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1243:1: ( rule__Influence__Group__3__Impl rule__Influence__Group__4 )
            // InternalInfluenceDSL.g:1244:2: rule__Influence__Group__3__Impl rule__Influence__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalInfluenceDSL.g:1251:1: rule__Influence__Group__3__Impl : ( ( '**#' )? ) ;
    public final void rule__Influence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1255:1: ( ( ( '**#' )? ) )
            // InternalInfluenceDSL.g:1256:1: ( ( '**#' )? )
            {
            // InternalInfluenceDSL.g:1256:1: ( ( '**#' )? )
            // InternalInfluenceDSL.g:1257:2: ( '**#' )?
            {
             before(grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_3()); 
            // InternalInfluenceDSL.g:1258:2: ( '**#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInfluenceDSL.g:1258:3: '**#'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_3()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1266:1: rule__Influence__Group__4 : rule__Influence__Group__4__Impl rule__Influence__Group__5 ;
    public final void rule__Influence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1270:1: ( rule__Influence__Group__4__Impl rule__Influence__Group__5 )
            // InternalInfluenceDSL.g:1271:2: rule__Influence__Group__4__Impl rule__Influence__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalInfluenceDSL.g:1278:1: rule__Influence__Group__4__Impl : ( 'Influence' ) ;
    public final void rule__Influence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1282:1: ( ( 'Influence' ) )
            // InternalInfluenceDSL.g:1283:1: ( 'Influence' )
            {
            // InternalInfluenceDSL.g:1283:1: ( 'Influence' )
            // InternalInfluenceDSL.g:1284:2: 'Influence'
            {
             before(grammarAccess.getInfluenceAccess().getInfluenceKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getInfluenceKeyword_4()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1293:1: rule__Influence__Group__5 : rule__Influence__Group__5__Impl rule__Influence__Group__6 ;
    public final void rule__Influence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1297:1: ( rule__Influence__Group__5__Impl rule__Influence__Group__6 )
            // InternalInfluenceDSL.g:1298:2: rule__Influence__Group__5__Impl rule__Influence__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalInfluenceDSL.g:1305:1: rule__Influence__Group__5__Impl : ( ( rule__Influence__NameAssignment_5 ) ) ;
    public final void rule__Influence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1309:1: ( ( ( rule__Influence__NameAssignment_5 ) ) )
            // InternalInfluenceDSL.g:1310:1: ( ( rule__Influence__NameAssignment_5 ) )
            {
            // InternalInfluenceDSL.g:1310:1: ( ( rule__Influence__NameAssignment_5 ) )
            // InternalInfluenceDSL.g:1311:2: ( rule__Influence__NameAssignment_5 )
            {
             before(grammarAccess.getInfluenceAccess().getNameAssignment_5()); 
            // InternalInfluenceDSL.g:1312:2: ( rule__Influence__NameAssignment_5 )
            // InternalInfluenceDSL.g:1312:3: rule__Influence__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Influence__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getNameAssignment_5()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1320:1: rule__Influence__Group__6 : rule__Influence__Group__6__Impl rule__Influence__Group__7 ;
    public final void rule__Influence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1324:1: ( rule__Influence__Group__6__Impl rule__Influence__Group__7 )
            // InternalInfluenceDSL.g:1325:2: rule__Influence__Group__6__Impl rule__Influence__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalInfluenceDSL.g:1332:1: rule__Influence__Group__6__Impl : ( 'from' ) ;
    public final void rule__Influence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1336:1: ( ( 'from' ) )
            // InternalInfluenceDSL.g:1337:1: ( 'from' )
            {
            // InternalInfluenceDSL.g:1337:1: ( 'from' )
            // InternalInfluenceDSL.g:1338:2: 'from'
            {
             before(grammarAccess.getInfluenceAccess().getFromKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getFromKeyword_6()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1347:1: rule__Influence__Group__7 : rule__Influence__Group__7__Impl rule__Influence__Group__8 ;
    public final void rule__Influence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1351:1: ( rule__Influence__Group__7__Impl rule__Influence__Group__8 )
            // InternalInfluenceDSL.g:1352:2: rule__Influence__Group__7__Impl rule__Influence__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalInfluenceDSL.g:1359:1: rule__Influence__Group__7__Impl : ( ( rule__Influence__SourceArtifactAssignment_7 ) ) ;
    public final void rule__Influence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1363:1: ( ( ( rule__Influence__SourceArtifactAssignment_7 ) ) )
            // InternalInfluenceDSL.g:1364:1: ( ( rule__Influence__SourceArtifactAssignment_7 ) )
            {
            // InternalInfluenceDSL.g:1364:1: ( ( rule__Influence__SourceArtifactAssignment_7 ) )
            // InternalInfluenceDSL.g:1365:2: ( rule__Influence__SourceArtifactAssignment_7 )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactAssignment_7()); 
            // InternalInfluenceDSL.g:1366:2: ( rule__Influence__SourceArtifactAssignment_7 )
            // InternalInfluenceDSL.g:1366:3: rule__Influence__SourceArtifactAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Influence__SourceArtifactAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getSourceArtifactAssignment_7()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1374:1: rule__Influence__Group__8 : rule__Influence__Group__8__Impl rule__Influence__Group__9 ;
    public final void rule__Influence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1378:1: ( rule__Influence__Group__8__Impl rule__Influence__Group__9 )
            // InternalInfluenceDSL.g:1379:2: rule__Influence__Group__8__Impl rule__Influence__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalInfluenceDSL.g:1386:1: rule__Influence__Group__8__Impl : ( ( rule__Influence__Group_8__0 )* ) ;
    public final void rule__Influence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1390:1: ( ( ( rule__Influence__Group_8__0 )* ) )
            // InternalInfluenceDSL.g:1391:1: ( ( rule__Influence__Group_8__0 )* )
            {
            // InternalInfluenceDSL.g:1391:1: ( ( rule__Influence__Group_8__0 )* )
            // InternalInfluenceDSL.g:1392:2: ( rule__Influence__Group_8__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_8()); 
            // InternalInfluenceDSL.g:1393:2: ( rule__Influence__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1393:3: rule__Influence__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1401:1: rule__Influence__Group__9 : rule__Influence__Group__9__Impl rule__Influence__Group__10 ;
    public final void rule__Influence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1405:1: ( rule__Influence__Group__9__Impl rule__Influence__Group__10 )
            // InternalInfluenceDSL.g:1406:2: rule__Influence__Group__9__Impl rule__Influence__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalInfluenceDSL.g:1413:1: rule__Influence__Group__9__Impl : ( 'and' ) ;
    public final void rule__Influence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1417:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:1418:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:1418:1: ( 'and' )
            // InternalInfluenceDSL.g:1419:2: 'and'
            {
             before(grammarAccess.getInfluenceAccess().getAndKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAndKeyword_9()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1428:1: rule__Influence__Group__10 : rule__Influence__Group__10__Impl rule__Influence__Group__11 ;
    public final void rule__Influence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1432:1: ( rule__Influence__Group__10__Impl rule__Influence__Group__11 )
            // InternalInfluenceDSL.g:1433:2: rule__Influence__Group__10__Impl rule__Influence__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalInfluenceDSL.g:1440:1: rule__Influence__Group__10__Impl : ( 'from' ) ;
    public final void rule__Influence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1444:1: ( ( 'from' ) )
            // InternalInfluenceDSL.g:1445:1: ( 'from' )
            {
            // InternalInfluenceDSL.g:1445:1: ( 'from' )
            // InternalInfluenceDSL.g:1446:2: 'from'
            {
             before(grammarAccess.getInfluenceAccess().getFromKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getFromKeyword_10()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1455:1: rule__Influence__Group__11 : rule__Influence__Group__11__Impl rule__Influence__Group__12 ;
    public final void rule__Influence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1459:1: ( rule__Influence__Group__11__Impl rule__Influence__Group__12 )
            // InternalInfluenceDSL.g:1460:2: rule__Influence__Group__11__Impl rule__Influence__Group__12
            {
            pushFollow(FOLLOW_4);
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
    // InternalInfluenceDSL.g:1467:1: rule__Influence__Group__11__Impl : ( 'phenomena' ) ;
    public final void rule__Influence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1471:1: ( ( 'phenomena' ) )
            // InternalInfluenceDSL.g:1472:1: ( 'phenomena' )
            {
            // InternalInfluenceDSL.g:1472:1: ( 'phenomena' )
            // InternalInfluenceDSL.g:1473:2: 'phenomena'
            {
             before(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getPhenomenaKeyword_11()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1482:1: rule__Influence__Group__12 : rule__Influence__Group__12__Impl rule__Influence__Group__13 ;
    public final void rule__Influence__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1486:1: ( rule__Influence__Group__12__Impl rule__Influence__Group__13 )
            // InternalInfluenceDSL.g:1487:2: rule__Influence__Group__12__Impl rule__Influence__Group__13
            {
            pushFollow(FOLLOW_18);
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
    // InternalInfluenceDSL.g:1494:1: rule__Influence__Group__12__Impl : ( ( rule__Influence__SourcePhenomenaAssignment_12 ) ) ;
    public final void rule__Influence__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1498:1: ( ( ( rule__Influence__SourcePhenomenaAssignment_12 ) ) )
            // InternalInfluenceDSL.g:1499:1: ( ( rule__Influence__SourcePhenomenaAssignment_12 ) )
            {
            // InternalInfluenceDSL.g:1499:1: ( ( rule__Influence__SourcePhenomenaAssignment_12 ) )
            // InternalInfluenceDSL.g:1500:2: ( rule__Influence__SourcePhenomenaAssignment_12 )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaAssignment_12()); 
            // InternalInfluenceDSL.g:1501:2: ( rule__Influence__SourcePhenomenaAssignment_12 )
            // InternalInfluenceDSL.g:1501:3: rule__Influence__SourcePhenomenaAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Influence__SourcePhenomenaAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getSourcePhenomenaAssignment_12()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1509:1: rule__Influence__Group__13 : rule__Influence__Group__13__Impl rule__Influence__Group__14 ;
    public final void rule__Influence__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1513:1: ( rule__Influence__Group__13__Impl rule__Influence__Group__14 )
            // InternalInfluenceDSL.g:1514:2: rule__Influence__Group__13__Impl rule__Influence__Group__14
            {
            pushFollow(FOLLOW_18);
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
    // InternalInfluenceDSL.g:1521:1: rule__Influence__Group__13__Impl : ( ( rule__Influence__Group_13__0 )* ) ;
    public final void rule__Influence__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1525:1: ( ( ( rule__Influence__Group_13__0 )* ) )
            // InternalInfluenceDSL.g:1526:1: ( ( rule__Influence__Group_13__0 )* )
            {
            // InternalInfluenceDSL.g:1526:1: ( ( rule__Influence__Group_13__0 )* )
            // InternalInfluenceDSL.g:1527:2: ( rule__Influence__Group_13__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_13()); 
            // InternalInfluenceDSL.g:1528:2: ( rule__Influence__Group_13__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1528:3: rule__Influence__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_13()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:1536:1: rule__Influence__Group__14 : rule__Influence__Group__14__Impl rule__Influence__Group__15 ;
    public final void rule__Influence__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1540:1: ( rule__Influence__Group__14__Impl rule__Influence__Group__15 )
            // InternalInfluenceDSL.g:1541:2: rule__Influence__Group__14__Impl rule__Influence__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Influence__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__15();

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
    // InternalInfluenceDSL.g:1548:1: rule__Influence__Group__14__Impl : ( 'emerges' ) ;
    public final void rule__Influence__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1552:1: ( ( 'emerges' ) )
            // InternalInfluenceDSL.g:1553:1: ( 'emerges' )
            {
            // InternalInfluenceDSL.g:1553:1: ( 'emerges' )
            // InternalInfluenceDSL.g:1554:2: 'emerges'
            {
             before(grammarAccess.getInfluenceAccess().getEmergesKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getEmergesKeyword_14()); 

            }


            }

        }
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


    // $ANTLR start "rule__Influence__Group__15"
    // InternalInfluenceDSL.g:1563:1: rule__Influence__Group__15 : rule__Influence__Group__15__Impl rule__Influence__Group__16 ;
    public final void rule__Influence__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1567:1: ( rule__Influence__Group__15__Impl rule__Influence__Group__16 )
            // InternalInfluenceDSL.g:1568:2: rule__Influence__Group__15__Impl rule__Influence__Group__16
            {
            pushFollow(FOLLOW_20);
            rule__Influence__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__16();

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
    // $ANTLR end "rule__Influence__Group__15"


    // $ANTLR start "rule__Influence__Group__15__Impl"
    // InternalInfluenceDSL.g:1575:1: rule__Influence__Group__15__Impl : ( ( rule__Influence__ProducesAssignment_15 ) ) ;
    public final void rule__Influence__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1579:1: ( ( ( rule__Influence__ProducesAssignment_15 ) ) )
            // InternalInfluenceDSL.g:1580:1: ( ( rule__Influence__ProducesAssignment_15 ) )
            {
            // InternalInfluenceDSL.g:1580:1: ( ( rule__Influence__ProducesAssignment_15 ) )
            // InternalInfluenceDSL.g:1581:2: ( rule__Influence__ProducesAssignment_15 )
            {
             before(grammarAccess.getInfluenceAccess().getProducesAssignment_15()); 
            // InternalInfluenceDSL.g:1582:2: ( rule__Influence__ProducesAssignment_15 )
            // InternalInfluenceDSL.g:1582:3: rule__Influence__ProducesAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Influence__ProducesAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getProducesAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__15__Impl"


    // $ANTLR start "rule__Influence__Group__16"
    // InternalInfluenceDSL.g:1590:1: rule__Influence__Group__16 : rule__Influence__Group__16__Impl rule__Influence__Group__17 ;
    public final void rule__Influence__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1594:1: ( rule__Influence__Group__16__Impl rule__Influence__Group__17 )
            // InternalInfluenceDSL.g:1595:2: rule__Influence__Group__16__Impl rule__Influence__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__Influence__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__17();

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
    // $ANTLR end "rule__Influence__Group__16"


    // $ANTLR start "rule__Influence__Group__16__Impl"
    // InternalInfluenceDSL.g:1602:1: rule__Influence__Group__16__Impl : ( ( rule__Influence__Group_16__0 )* ) ;
    public final void rule__Influence__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1606:1: ( ( ( rule__Influence__Group_16__0 )* ) )
            // InternalInfluenceDSL.g:1607:1: ( ( rule__Influence__Group_16__0 )* )
            {
            // InternalInfluenceDSL.g:1607:1: ( ( rule__Influence__Group_16__0 )* )
            // InternalInfluenceDSL.g:1608:2: ( rule__Influence__Group_16__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_16()); 
            // InternalInfluenceDSL.g:1609:2: ( rule__Influence__Group_16__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1609:3: rule__Influence__Group_16__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__16__Impl"


    // $ANTLR start "rule__Influence__Group__17"
    // InternalInfluenceDSL.g:1617:1: rule__Influence__Group__17 : rule__Influence__Group__17__Impl rule__Influence__Group__18 ;
    public final void rule__Influence__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1621:1: ( rule__Influence__Group__17__Impl rule__Influence__Group__18 )
            // InternalInfluenceDSL.g:1622:2: rule__Influence__Group__17__Impl rule__Influence__Group__18
            {
            pushFollow(FOLLOW_21);
            rule__Influence__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__18();

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
    // $ANTLR end "rule__Influence__Group__17"


    // $ANTLR start "rule__Influence__Group__17__Impl"
    // InternalInfluenceDSL.g:1629:1: rule__Influence__Group__17__Impl : ( 'that' ) ;
    public final void rule__Influence__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1633:1: ( ( 'that' ) )
            // InternalInfluenceDSL.g:1634:1: ( 'that' )
            {
            // InternalInfluenceDSL.g:1634:1: ( 'that' )
            // InternalInfluenceDSL.g:1635:2: 'that'
            {
             before(grammarAccess.getInfluenceAccess().getThatKeyword_17()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getThatKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__17__Impl"


    // $ANTLR start "rule__Influence__Group__18"
    // InternalInfluenceDSL.g:1644:1: rule__Influence__Group__18 : rule__Influence__Group__18__Impl rule__Influence__Group__19 ;
    public final void rule__Influence__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1648:1: ( rule__Influence__Group__18__Impl rule__Influence__Group__19 )
            // InternalInfluenceDSL.g:1649:2: rule__Influence__Group__18__Impl rule__Influence__Group__19
            {
            pushFollow(FOLLOW_22);
            rule__Influence__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__19();

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
    // $ANTLR end "rule__Influence__Group__18"


    // $ANTLR start "rule__Influence__Group__18__Impl"
    // InternalInfluenceDSL.g:1656:1: rule__Influence__Group__18__Impl : ( 'implies' ) ;
    public final void rule__Influence__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1660:1: ( ( 'implies' ) )
            // InternalInfluenceDSL.g:1661:1: ( 'implies' )
            {
            // InternalInfluenceDSL.g:1661:1: ( 'implies' )
            // InternalInfluenceDSL.g:1662:2: 'implies'
            {
             before(grammarAccess.getInfluenceAccess().getImpliesKeyword_18()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getImpliesKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__18__Impl"


    // $ANTLR start "rule__Influence__Group__19"
    // InternalInfluenceDSL.g:1671:1: rule__Influence__Group__19 : rule__Influence__Group__19__Impl rule__Influence__Group__20 ;
    public final void rule__Influence__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1675:1: ( rule__Influence__Group__19__Impl rule__Influence__Group__20 )
            // InternalInfluenceDSL.g:1676:2: rule__Influence__Group__19__Impl rule__Influence__Group__20
            {
            pushFollow(FOLLOW_23);
            rule__Influence__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__20();

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
    // $ANTLR end "rule__Influence__Group__19"


    // $ANTLR start "rule__Influence__Group__19__Impl"
    // InternalInfluenceDSL.g:1683:1: rule__Influence__Group__19__Impl : ( ( rule__Influence__AffectsAssignment_19 ) ) ;
    public final void rule__Influence__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1687:1: ( ( ( rule__Influence__AffectsAssignment_19 ) ) )
            // InternalInfluenceDSL.g:1688:1: ( ( rule__Influence__AffectsAssignment_19 ) )
            {
            // InternalInfluenceDSL.g:1688:1: ( ( rule__Influence__AffectsAssignment_19 ) )
            // InternalInfluenceDSL.g:1689:2: ( rule__Influence__AffectsAssignment_19 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_19()); 
            // InternalInfluenceDSL.g:1690:2: ( rule__Influence__AffectsAssignment_19 )
            // InternalInfluenceDSL.g:1690:3: rule__Influence__AffectsAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Influence__AffectsAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAffectsAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__19__Impl"


    // $ANTLR start "rule__Influence__Group__20"
    // InternalInfluenceDSL.g:1698:1: rule__Influence__Group__20 : rule__Influence__Group__20__Impl rule__Influence__Group__21 ;
    public final void rule__Influence__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1702:1: ( rule__Influence__Group__20__Impl rule__Influence__Group__21 )
            // InternalInfluenceDSL.g:1703:2: rule__Influence__Group__20__Impl rule__Influence__Group__21
            {
            pushFollow(FOLLOW_23);
            rule__Influence__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__21();

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
    // $ANTLR end "rule__Influence__Group__20"


    // $ANTLR start "rule__Influence__Group__20__Impl"
    // InternalInfluenceDSL.g:1710:1: rule__Influence__Group__20__Impl : ( ( rule__Influence__Group_20__0 )* ) ;
    public final void rule__Influence__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1714:1: ( ( ( rule__Influence__Group_20__0 )* ) )
            // InternalInfluenceDSL.g:1715:1: ( ( rule__Influence__Group_20__0 )* )
            {
            // InternalInfluenceDSL.g:1715:1: ( ( rule__Influence__Group_20__0 )* )
            // InternalInfluenceDSL.g:1716:2: ( rule__Influence__Group_20__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_20()); 
            // InternalInfluenceDSL.g:1717:2: ( rule__Influence__Group_20__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1717:3: rule__Influence__Group_20__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__20__Impl"


    // $ANTLR start "rule__Influence__Group__21"
    // InternalInfluenceDSL.g:1725:1: rule__Influence__Group__21 : rule__Influence__Group__21__Impl rule__Influence__Group__22 ;
    public final void rule__Influence__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1729:1: ( rule__Influence__Group__21__Impl rule__Influence__Group__22 )
            // InternalInfluenceDSL.g:1730:2: rule__Influence__Group__21__Impl rule__Influence__Group__22
            {
            pushFollow(FOLLOW_24);
            rule__Influence__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__22();

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
    // $ANTLR end "rule__Influence__Group__21"


    // $ANTLR start "rule__Influence__Group__21__Impl"
    // InternalInfluenceDSL.g:1737:1: rule__Influence__Group__21__Impl : ( 'which' ) ;
    public final void rule__Influence__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1741:1: ( ( 'which' ) )
            // InternalInfluenceDSL.g:1742:1: ( 'which' )
            {
            // InternalInfluenceDSL.g:1742:1: ( 'which' )
            // InternalInfluenceDSL.g:1743:2: 'which'
            {
             before(grammarAccess.getInfluenceAccess().getWhichKeyword_21()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getWhichKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__21__Impl"


    // $ANTLR start "rule__Influence__Group__22"
    // InternalInfluenceDSL.g:1752:1: rule__Influence__Group__22 : rule__Influence__Group__22__Impl rule__Influence__Group__23 ;
    public final void rule__Influence__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1756:1: ( rule__Influence__Group__22__Impl rule__Influence__Group__23 )
            // InternalInfluenceDSL.g:1757:2: rule__Influence__Group__22__Impl rule__Influence__Group__23
            {
            pushFollow(FOLLOW_25);
            rule__Influence__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__23();

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
    // $ANTLR end "rule__Influence__Group__22"


    // $ANTLR start "rule__Influence__Group__22__Impl"
    // InternalInfluenceDSL.g:1764:1: rule__Influence__Group__22__Impl : ( 'may' ) ;
    public final void rule__Influence__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1768:1: ( ( 'may' ) )
            // InternalInfluenceDSL.g:1769:1: ( 'may' )
            {
            // InternalInfluenceDSL.g:1769:1: ( 'may' )
            // InternalInfluenceDSL.g:1770:2: 'may'
            {
             before(grammarAccess.getInfluenceAccess().getMayKeyword_22()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getMayKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__22__Impl"


    // $ANTLR start "rule__Influence__Group__23"
    // InternalInfluenceDSL.g:1779:1: rule__Influence__Group__23 : rule__Influence__Group__23__Impl rule__Influence__Group__24 ;
    public final void rule__Influence__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1783:1: ( rule__Influence__Group__23__Impl rule__Influence__Group__24 )
            // InternalInfluenceDSL.g:1784:2: rule__Influence__Group__23__Impl rule__Influence__Group__24
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__24();

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
    // $ANTLR end "rule__Influence__Group__23"


    // $ANTLR start "rule__Influence__Group__23__Impl"
    // InternalInfluenceDSL.g:1791:1: rule__Influence__Group__23__Impl : ( 'violate' ) ;
    public final void rule__Influence__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1795:1: ( ( 'violate' ) )
            // InternalInfluenceDSL.g:1796:1: ( 'violate' )
            {
            // InternalInfluenceDSL.g:1796:1: ( 'violate' )
            // InternalInfluenceDSL.g:1797:2: 'violate'
            {
             before(grammarAccess.getInfluenceAccess().getViolateKeyword_23()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getViolateKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__23__Impl"


    // $ANTLR start "rule__Influence__Group__24"
    // InternalInfluenceDSL.g:1806:1: rule__Influence__Group__24 : rule__Influence__Group__24__Impl rule__Influence__Group__25 ;
    public final void rule__Influence__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1810:1: ( rule__Influence__Group__24__Impl rule__Influence__Group__25 )
            // InternalInfluenceDSL.g:1811:2: rule__Influence__Group__24__Impl rule__Influence__Group__25
            {
            pushFollow(FOLLOW_26);
            rule__Influence__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__25();

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
    // $ANTLR end "rule__Influence__Group__24"


    // $ANTLR start "rule__Influence__Group__24__Impl"
    // InternalInfluenceDSL.g:1818:1: rule__Influence__Group__24__Impl : ( ( rule__Influence__EvaluatedByAssignment_24 ) ) ;
    public final void rule__Influence__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1822:1: ( ( ( rule__Influence__EvaluatedByAssignment_24 ) ) )
            // InternalInfluenceDSL.g:1823:1: ( ( rule__Influence__EvaluatedByAssignment_24 ) )
            {
            // InternalInfluenceDSL.g:1823:1: ( ( rule__Influence__EvaluatedByAssignment_24 ) )
            // InternalInfluenceDSL.g:1824:2: ( rule__Influence__EvaluatedByAssignment_24 )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByAssignment_24()); 
            // InternalInfluenceDSL.g:1825:2: ( rule__Influence__EvaluatedByAssignment_24 )
            // InternalInfluenceDSL.g:1825:3: rule__Influence__EvaluatedByAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Influence__EvaluatedByAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getEvaluatedByAssignment_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__24__Impl"


    // $ANTLR start "rule__Influence__Group__25"
    // InternalInfluenceDSL.g:1833:1: rule__Influence__Group__25 : rule__Influence__Group__25__Impl rule__Influence__Group__26 ;
    public final void rule__Influence__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1837:1: ( rule__Influence__Group__25__Impl rule__Influence__Group__26 )
            // InternalInfluenceDSL.g:1838:2: rule__Influence__Group__25__Impl rule__Influence__Group__26
            {
            pushFollow(FOLLOW_26);
            rule__Influence__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__26();

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
    // $ANTLR end "rule__Influence__Group__25"


    // $ANTLR start "rule__Influence__Group__25__Impl"
    // InternalInfluenceDSL.g:1845:1: rule__Influence__Group__25__Impl : ( ( rule__Influence__Group_25__0 )* ) ;
    public final void rule__Influence__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1849:1: ( ( ( rule__Influence__Group_25__0 )* ) )
            // InternalInfluenceDSL.g:1850:1: ( ( rule__Influence__Group_25__0 )* )
            {
            // InternalInfluenceDSL.g:1850:1: ( ( rule__Influence__Group_25__0 )* )
            // InternalInfluenceDSL.g:1851:2: ( rule__Influence__Group_25__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_25()); 
            // InternalInfluenceDSL.g:1852:2: ( rule__Influence__Group_25__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1852:3: rule__Influence__Group_25__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_25__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__25__Impl"


    // $ANTLR start "rule__Influence__Group__26"
    // InternalInfluenceDSL.g:1860:1: rule__Influence__Group__26 : rule__Influence__Group__26__Impl rule__Influence__Group__27 ;
    public final void rule__Influence__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1864:1: ( rule__Influence__Group__26__Impl rule__Influence__Group__27 )
            // InternalInfluenceDSL.g:1865:2: rule__Influence__Group__26__Impl rule__Influence__Group__27
            {
            pushFollow(FOLLOW_27);
            rule__Influence__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__27();

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
    // $ANTLR end "rule__Influence__Group__26"


    // $ANTLR start "rule__Influence__Group__26__Impl"
    // InternalInfluenceDSL.g:1872:1: rule__Influence__Group__26__Impl : ( 'it' ) ;
    public final void rule__Influence__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1876:1: ( ( 'it' ) )
            // InternalInfluenceDSL.g:1877:1: ( 'it' )
            {
            // InternalInfluenceDSL.g:1877:1: ( 'it' )
            // InternalInfluenceDSL.g:1878:2: 'it'
            {
             before(grammarAccess.getInfluenceAccess().getItKeyword_26()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getItKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__26__Impl"


    // $ANTLR start "rule__Influence__Group__27"
    // InternalInfluenceDSL.g:1887:1: rule__Influence__Group__27 : rule__Influence__Group__27__Impl rule__Influence__Group__28 ;
    public final void rule__Influence__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1891:1: ( rule__Influence__Group__27__Impl rule__Influence__Group__28 )
            // InternalInfluenceDSL.g:1892:2: rule__Influence__Group__27__Impl rule__Influence__Group__28
            {
            pushFollow(FOLLOW_28);
            rule__Influence__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__28();

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
    // $ANTLR end "rule__Influence__Group__27"


    // $ANTLR start "rule__Influence__Group__27__Impl"
    // InternalInfluenceDSL.g:1899:1: rule__Influence__Group__27__Impl : ( 'can' ) ;
    public final void rule__Influence__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1903:1: ( ( 'can' ) )
            // InternalInfluenceDSL.g:1904:1: ( 'can' )
            {
            // InternalInfluenceDSL.g:1904:1: ( 'can' )
            // InternalInfluenceDSL.g:1905:2: 'can'
            {
             before(grammarAccess.getInfluenceAccess().getCanKeyword_27()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCanKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__27__Impl"


    // $ANTLR start "rule__Influence__Group__28"
    // InternalInfluenceDSL.g:1914:1: rule__Influence__Group__28 : rule__Influence__Group__28__Impl rule__Influence__Group__29 ;
    public final void rule__Influence__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1918:1: ( rule__Influence__Group__28__Impl rule__Influence__Group__29 )
            // InternalInfluenceDSL.g:1919:2: rule__Influence__Group__28__Impl rule__Influence__Group__29
            {
            pushFollow(FOLLOW_29);
            rule__Influence__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__29();

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
    // $ANTLR end "rule__Influence__Group__28"


    // $ANTLR start "rule__Influence__Group__28__Impl"
    // InternalInfluenceDSL.g:1926:1: rule__Influence__Group__28__Impl : ( 'be' ) ;
    public final void rule__Influence__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1930:1: ( ( 'be' ) )
            // InternalInfluenceDSL.g:1931:1: ( 'be' )
            {
            // InternalInfluenceDSL.g:1931:1: ( 'be' )
            // InternalInfluenceDSL.g:1932:2: 'be'
            {
             before(grammarAccess.getInfluenceAccess().getBeKeyword_28()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getBeKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__28__Impl"


    // $ANTLR start "rule__Influence__Group__29"
    // InternalInfluenceDSL.g:1941:1: rule__Influence__Group__29 : rule__Influence__Group__29__Impl rule__Influence__Group__30 ;
    public final void rule__Influence__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1945:1: ( rule__Influence__Group__29__Impl rule__Influence__Group__30 )
            // InternalInfluenceDSL.g:1946:2: rule__Influence__Group__29__Impl rule__Influence__Group__30
            {
            pushFollow(FOLLOW_30);
            rule__Influence__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__30();

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
    // $ANTLR end "rule__Influence__Group__29"


    // $ANTLR start "rule__Influence__Group__29__Impl"
    // InternalInfluenceDSL.g:1953:1: rule__Influence__Group__29__Impl : ( 'compensated' ) ;
    public final void rule__Influence__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1957:1: ( ( 'compensated' ) )
            // InternalInfluenceDSL.g:1958:1: ( 'compensated' )
            {
            // InternalInfluenceDSL.g:1958:1: ( 'compensated' )
            // InternalInfluenceDSL.g:1959:2: 'compensated'
            {
             before(grammarAccess.getInfluenceAccess().getCompensatedKeyword_29()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCompensatedKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__29__Impl"


    // $ANTLR start "rule__Influence__Group__30"
    // InternalInfluenceDSL.g:1968:1: rule__Influence__Group__30 : rule__Influence__Group__30__Impl rule__Influence__Group__31 ;
    public final void rule__Influence__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1972:1: ( rule__Influence__Group__30__Impl rule__Influence__Group__31 )
            // InternalInfluenceDSL.g:1973:2: rule__Influence__Group__30__Impl rule__Influence__Group__31
            {
            pushFollow(FOLLOW_31);
            rule__Influence__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__31();

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
    // $ANTLR end "rule__Influence__Group__30"


    // $ANTLR start "rule__Influence__Group__30__Impl"
    // InternalInfluenceDSL.g:1980:1: rule__Influence__Group__30__Impl : ( 'by' ) ;
    public final void rule__Influence__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1984:1: ( ( 'by' ) )
            // InternalInfluenceDSL.g:1985:1: ( 'by' )
            {
            // InternalInfluenceDSL.g:1985:1: ( 'by' )
            // InternalInfluenceDSL.g:1986:2: 'by'
            {
             before(grammarAccess.getInfluenceAccess().getByKeyword_30()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getByKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__30__Impl"


    // $ANTLR start "rule__Influence__Group__31"
    // InternalInfluenceDSL.g:1995:1: rule__Influence__Group__31 : rule__Influence__Group__31__Impl rule__Influence__Group__32 ;
    public final void rule__Influence__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1999:1: ( rule__Influence__Group__31__Impl rule__Influence__Group__32 )
            // InternalInfluenceDSL.g:2000:2: rule__Influence__Group__31__Impl rule__Influence__Group__32
            {
            pushFollow(FOLLOW_15);
            rule__Influence__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__32();

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
    // $ANTLR end "rule__Influence__Group__31"


    // $ANTLR start "rule__Influence__Group__31__Impl"
    // InternalInfluenceDSL.g:2007:1: rule__Influence__Group__31__Impl : ( 'modifying' ) ;
    public final void rule__Influence__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2011:1: ( ( 'modifying' ) )
            // InternalInfluenceDSL.g:2012:1: ( 'modifying' )
            {
            // InternalInfluenceDSL.g:2012:1: ( 'modifying' )
            // InternalInfluenceDSL.g:2013:2: 'modifying'
            {
             before(grammarAccess.getInfluenceAccess().getModifyingKeyword_31()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getModifyingKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__31__Impl"


    // $ANTLR start "rule__Influence__Group__32"
    // InternalInfluenceDSL.g:2022:1: rule__Influence__Group__32 : rule__Influence__Group__32__Impl rule__Influence__Group__33 ;
    public final void rule__Influence__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2026:1: ( rule__Influence__Group__32__Impl rule__Influence__Group__33 )
            // InternalInfluenceDSL.g:2027:2: rule__Influence__Group__32__Impl rule__Influence__Group__33
            {
            pushFollow(FOLLOW_9);
            rule__Influence__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group__33();

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
    // $ANTLR end "rule__Influence__Group__32"


    // $ANTLR start "rule__Influence__Group__32__Impl"
    // InternalInfluenceDSL.g:2034:1: rule__Influence__Group__32__Impl : ( ( rule__Influence__TargetArtifactAssignment_32 ) ) ;
    public final void rule__Influence__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2038:1: ( ( ( rule__Influence__TargetArtifactAssignment_32 ) ) )
            // InternalInfluenceDSL.g:2039:1: ( ( rule__Influence__TargetArtifactAssignment_32 ) )
            {
            // InternalInfluenceDSL.g:2039:1: ( ( rule__Influence__TargetArtifactAssignment_32 ) )
            // InternalInfluenceDSL.g:2040:2: ( rule__Influence__TargetArtifactAssignment_32 )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactAssignment_32()); 
            // InternalInfluenceDSL.g:2041:2: ( rule__Influence__TargetArtifactAssignment_32 )
            // InternalInfluenceDSL.g:2041:3: rule__Influence__TargetArtifactAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Influence__TargetArtifactAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getTargetArtifactAssignment_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__32__Impl"


    // $ANTLR start "rule__Influence__Group__33"
    // InternalInfluenceDSL.g:2049:1: rule__Influence__Group__33 : rule__Influence__Group__33__Impl ;
    public final void rule__Influence__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2053:1: ( rule__Influence__Group__33__Impl )
            // InternalInfluenceDSL.g:2054:2: rule__Influence__Group__33__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group__33__Impl();

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
    // $ANTLR end "rule__Influence__Group__33"


    // $ANTLR start "rule__Influence__Group__33__Impl"
    // InternalInfluenceDSL.g:2060:1: rule__Influence__Group__33__Impl : ( ( rule__Influence__Group_33__0 )* ) ;
    public final void rule__Influence__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2064:1: ( ( ( rule__Influence__Group_33__0 )* ) )
            // InternalInfluenceDSL.g:2065:1: ( ( rule__Influence__Group_33__0 )* )
            {
            // InternalInfluenceDSL.g:2065:1: ( ( rule__Influence__Group_33__0 )* )
            // InternalInfluenceDSL.g:2066:2: ( rule__Influence__Group_33__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_33()); 
            // InternalInfluenceDSL.g:2067:2: ( rule__Influence__Group_33__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2067:3: rule__Influence__Group_33__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Influence__Group_33__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInfluenceAccess().getGroup_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group__33__Impl"


    // $ANTLR start "rule__Influence__Group_2__0"
    // InternalInfluenceDSL.g:2076:1: rule__Influence__Group_2__0 : rule__Influence__Group_2__0__Impl rule__Influence__Group_2__1 ;
    public final void rule__Influence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2080:1: ( rule__Influence__Group_2__0__Impl rule__Influence__Group_2__1 )
            // InternalInfluenceDSL.g:2081:2: rule__Influence__Group_2__0__Impl rule__Influence__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_2__1();

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
    // $ANTLR end "rule__Influence__Group_2__0"


    // $ANTLR start "rule__Influence__Group_2__0__Impl"
    // InternalInfluenceDSL.g:2088:1: rule__Influence__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2092:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2093:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2093:1: ( ',' )
            // InternalInfluenceDSL.g:2094:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_2__0__Impl"


    // $ANTLR start "rule__Influence__Group_2__1"
    // InternalInfluenceDSL.g:2103:1: rule__Influence__Group_2__1 : rule__Influence__Group_2__1__Impl ;
    public final void rule__Influence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2107:1: ( rule__Influence__Group_2__1__Impl )
            // InternalInfluenceDSL.g:2108:2: rule__Influence__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_2__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_2__1"


    // $ANTLR start "rule__Influence__Group_2__1__Impl"
    // InternalInfluenceDSL.g:2114:1: rule__Influence__Group_2__1__Impl : ( ( rule__Influence__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Influence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2118:1: ( ( ( rule__Influence__DescriptionAssignment_2_1 ) ) )
            // InternalInfluenceDSL.g:2119:1: ( ( rule__Influence__DescriptionAssignment_2_1 ) )
            {
            // InternalInfluenceDSL.g:2119:1: ( ( rule__Influence__DescriptionAssignment_2_1 ) )
            // InternalInfluenceDSL.g:2120:2: ( rule__Influence__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_2_1()); 
            // InternalInfluenceDSL.g:2121:2: ( rule__Influence__DescriptionAssignment_2_1 )
            // InternalInfluenceDSL.g:2121:3: rule__Influence__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_2__1__Impl"


    // $ANTLR start "rule__Influence__Group_8__0"
    // InternalInfluenceDSL.g:2130:1: rule__Influence__Group_8__0 : rule__Influence__Group_8__0__Impl rule__Influence__Group_8__1 ;
    public final void rule__Influence__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2134:1: ( rule__Influence__Group_8__0__Impl rule__Influence__Group_8__1 )
            // InternalInfluenceDSL.g:2135:2: rule__Influence__Group_8__0__Impl rule__Influence__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Influence__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_8__1();

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
    // $ANTLR end "rule__Influence__Group_8__0"


    // $ANTLR start "rule__Influence__Group_8__0__Impl"
    // InternalInfluenceDSL.g:2142:1: rule__Influence__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2146:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2147:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2147:1: ( ',' )
            // InternalInfluenceDSL.g:2148:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_8_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8__0__Impl"


    // $ANTLR start "rule__Influence__Group_8__1"
    // InternalInfluenceDSL.g:2157:1: rule__Influence__Group_8__1 : rule__Influence__Group_8__1__Impl ;
    public final void rule__Influence__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2161:1: ( rule__Influence__Group_8__1__Impl )
            // InternalInfluenceDSL.g:2162:2: rule__Influence__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_8__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_8__1"


    // $ANTLR start "rule__Influence__Group_8__1__Impl"
    // InternalInfluenceDSL.g:2168:1: rule__Influence__Group_8__1__Impl : ( ( rule__Influence__SourceArtifactAssignment_8_1 ) ) ;
    public final void rule__Influence__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2172:1: ( ( ( rule__Influence__SourceArtifactAssignment_8_1 ) ) )
            // InternalInfluenceDSL.g:2173:1: ( ( rule__Influence__SourceArtifactAssignment_8_1 ) )
            {
            // InternalInfluenceDSL.g:2173:1: ( ( rule__Influence__SourceArtifactAssignment_8_1 ) )
            // InternalInfluenceDSL.g:2174:2: ( rule__Influence__SourceArtifactAssignment_8_1 )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactAssignment_8_1()); 
            // InternalInfluenceDSL.g:2175:2: ( rule__Influence__SourceArtifactAssignment_8_1 )
            // InternalInfluenceDSL.g:2175:3: rule__Influence__SourceArtifactAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__SourceArtifactAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getSourceArtifactAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_8__1__Impl"


    // $ANTLR start "rule__Influence__Group_13__0"
    // InternalInfluenceDSL.g:2184:1: rule__Influence__Group_13__0 : rule__Influence__Group_13__0__Impl rule__Influence__Group_13__1 ;
    public final void rule__Influence__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2188:1: ( rule__Influence__Group_13__0__Impl rule__Influence__Group_13__1 )
            // InternalInfluenceDSL.g:2189:2: rule__Influence__Group_13__0__Impl rule__Influence__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_13__1();

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
    // $ANTLR end "rule__Influence__Group_13__0"


    // $ANTLR start "rule__Influence__Group_13__0__Impl"
    // InternalInfluenceDSL.g:2196:1: rule__Influence__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2200:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2201:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2201:1: ( ',' )
            // InternalInfluenceDSL.g:2202:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_13_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_13__0__Impl"


    // $ANTLR start "rule__Influence__Group_13__1"
    // InternalInfluenceDSL.g:2211:1: rule__Influence__Group_13__1 : rule__Influence__Group_13__1__Impl ;
    public final void rule__Influence__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2215:1: ( rule__Influence__Group_13__1__Impl )
            // InternalInfluenceDSL.g:2216:2: rule__Influence__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_13__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_13__1"


    // $ANTLR start "rule__Influence__Group_13__1__Impl"
    // InternalInfluenceDSL.g:2222:1: rule__Influence__Group_13__1__Impl : ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) ) ;
    public final void rule__Influence__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2226:1: ( ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) ) )
            // InternalInfluenceDSL.g:2227:1: ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) )
            {
            // InternalInfluenceDSL.g:2227:1: ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) )
            // InternalInfluenceDSL.g:2228:2: ( rule__Influence__SourcePhenomenaAssignment_13_1 )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaAssignment_13_1()); 
            // InternalInfluenceDSL.g:2229:2: ( rule__Influence__SourcePhenomenaAssignment_13_1 )
            // InternalInfluenceDSL.g:2229:3: rule__Influence__SourcePhenomenaAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__SourcePhenomenaAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getSourcePhenomenaAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_13__1__Impl"


    // $ANTLR start "rule__Influence__Group_16__0"
    // InternalInfluenceDSL.g:2238:1: rule__Influence__Group_16__0 : rule__Influence__Group_16__0__Impl rule__Influence__Group_16__1 ;
    public final void rule__Influence__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2242:1: ( rule__Influence__Group_16__0__Impl rule__Influence__Group_16__1 )
            // InternalInfluenceDSL.g:2243:2: rule__Influence__Group_16__0__Impl rule__Influence__Group_16__1
            {
            pushFollow(FOLLOW_19);
            rule__Influence__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_16__1();

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
    // $ANTLR end "rule__Influence__Group_16__0"


    // $ANTLR start "rule__Influence__Group_16__0__Impl"
    // InternalInfluenceDSL.g:2250:1: rule__Influence__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2254:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2255:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2255:1: ( ',' )
            // InternalInfluenceDSL.g:2256:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_16_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_16__0__Impl"


    // $ANTLR start "rule__Influence__Group_16__1"
    // InternalInfluenceDSL.g:2265:1: rule__Influence__Group_16__1 : rule__Influence__Group_16__1__Impl ;
    public final void rule__Influence__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2269:1: ( rule__Influence__Group_16__1__Impl )
            // InternalInfluenceDSL.g:2270:2: rule__Influence__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_16__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_16__1"


    // $ANTLR start "rule__Influence__Group_16__1__Impl"
    // InternalInfluenceDSL.g:2276:1: rule__Influence__Group_16__1__Impl : ( ( rule__Influence__ProducesAssignment_16_1 ) ) ;
    public final void rule__Influence__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2280:1: ( ( ( rule__Influence__ProducesAssignment_16_1 ) ) )
            // InternalInfluenceDSL.g:2281:1: ( ( rule__Influence__ProducesAssignment_16_1 ) )
            {
            // InternalInfluenceDSL.g:2281:1: ( ( rule__Influence__ProducesAssignment_16_1 ) )
            // InternalInfluenceDSL.g:2282:2: ( rule__Influence__ProducesAssignment_16_1 )
            {
             before(grammarAccess.getInfluenceAccess().getProducesAssignment_16_1()); 
            // InternalInfluenceDSL.g:2283:2: ( rule__Influence__ProducesAssignment_16_1 )
            // InternalInfluenceDSL.g:2283:3: rule__Influence__ProducesAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__ProducesAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getProducesAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_16__1__Impl"


    // $ANTLR start "rule__Influence__Group_20__0"
    // InternalInfluenceDSL.g:2292:1: rule__Influence__Group_20__0 : rule__Influence__Group_20__0__Impl rule__Influence__Group_20__1 ;
    public final void rule__Influence__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2296:1: ( rule__Influence__Group_20__0__Impl rule__Influence__Group_20__1 )
            // InternalInfluenceDSL.g:2297:2: rule__Influence__Group_20__0__Impl rule__Influence__Group_20__1
            {
            pushFollow(FOLLOW_22);
            rule__Influence__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_20__1();

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
    // $ANTLR end "rule__Influence__Group_20__0"


    // $ANTLR start "rule__Influence__Group_20__0__Impl"
    // InternalInfluenceDSL.g:2304:1: rule__Influence__Group_20__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2308:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2309:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2309:1: ( ',' )
            // InternalInfluenceDSL.g:2310:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_20_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_20__0__Impl"


    // $ANTLR start "rule__Influence__Group_20__1"
    // InternalInfluenceDSL.g:2319:1: rule__Influence__Group_20__1 : rule__Influence__Group_20__1__Impl ;
    public final void rule__Influence__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2323:1: ( rule__Influence__Group_20__1__Impl )
            // InternalInfluenceDSL.g:2324:2: rule__Influence__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_20__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_20__1"


    // $ANTLR start "rule__Influence__Group_20__1__Impl"
    // InternalInfluenceDSL.g:2330:1: rule__Influence__Group_20__1__Impl : ( ( rule__Influence__AffectsAssignment_20_1 ) ) ;
    public final void rule__Influence__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2334:1: ( ( ( rule__Influence__AffectsAssignment_20_1 ) ) )
            // InternalInfluenceDSL.g:2335:1: ( ( rule__Influence__AffectsAssignment_20_1 ) )
            {
            // InternalInfluenceDSL.g:2335:1: ( ( rule__Influence__AffectsAssignment_20_1 ) )
            // InternalInfluenceDSL.g:2336:2: ( rule__Influence__AffectsAssignment_20_1 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_20_1()); 
            // InternalInfluenceDSL.g:2337:2: ( rule__Influence__AffectsAssignment_20_1 )
            // InternalInfluenceDSL.g:2337:3: rule__Influence__AffectsAssignment_20_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__AffectsAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getAffectsAssignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_20__1__Impl"


    // $ANTLR start "rule__Influence__Group_25__0"
    // InternalInfluenceDSL.g:2346:1: rule__Influence__Group_25__0 : rule__Influence__Group_25__0__Impl rule__Influence__Group_25__1 ;
    public final void rule__Influence__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2350:1: ( rule__Influence__Group_25__0__Impl rule__Influence__Group_25__1 )
            // InternalInfluenceDSL.g:2351:2: rule__Influence__Group_25__0__Impl rule__Influence__Group_25__1
            {
            pushFollow(FOLLOW_4);
            rule__Influence__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_25__1();

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
    // $ANTLR end "rule__Influence__Group_25__0"


    // $ANTLR start "rule__Influence__Group_25__0__Impl"
    // InternalInfluenceDSL.g:2358:1: rule__Influence__Group_25__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2362:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2363:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2363:1: ( ',' )
            // InternalInfluenceDSL.g:2364:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_25_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_25__0__Impl"


    // $ANTLR start "rule__Influence__Group_25__1"
    // InternalInfluenceDSL.g:2373:1: rule__Influence__Group_25__1 : rule__Influence__Group_25__1__Impl ;
    public final void rule__Influence__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2377:1: ( rule__Influence__Group_25__1__Impl )
            // InternalInfluenceDSL.g:2378:2: rule__Influence__Group_25__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_25__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_25__1"


    // $ANTLR start "rule__Influence__Group_25__1__Impl"
    // InternalInfluenceDSL.g:2384:1: rule__Influence__Group_25__1__Impl : ( ( rule__Influence__EvaluatedByAssignment_25_1 ) ) ;
    public final void rule__Influence__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2388:1: ( ( ( rule__Influence__EvaluatedByAssignment_25_1 ) ) )
            // InternalInfluenceDSL.g:2389:1: ( ( rule__Influence__EvaluatedByAssignment_25_1 ) )
            {
            // InternalInfluenceDSL.g:2389:1: ( ( rule__Influence__EvaluatedByAssignment_25_1 ) )
            // InternalInfluenceDSL.g:2390:2: ( rule__Influence__EvaluatedByAssignment_25_1 )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByAssignment_25_1()); 
            // InternalInfluenceDSL.g:2391:2: ( rule__Influence__EvaluatedByAssignment_25_1 )
            // InternalInfluenceDSL.g:2391:3: rule__Influence__EvaluatedByAssignment_25_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__EvaluatedByAssignment_25_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getEvaluatedByAssignment_25_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_25__1__Impl"


    // $ANTLR start "rule__Influence__Group_33__0"
    // InternalInfluenceDSL.g:2400:1: rule__Influence__Group_33__0 : rule__Influence__Group_33__0__Impl rule__Influence__Group_33__1 ;
    public final void rule__Influence__Group_33__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2404:1: ( rule__Influence__Group_33__0__Impl rule__Influence__Group_33__1 )
            // InternalInfluenceDSL.g:2405:2: rule__Influence__Group_33__0__Impl rule__Influence__Group_33__1
            {
            pushFollow(FOLLOW_15);
            rule__Influence__Group_33__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Influence__Group_33__1();

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
    // $ANTLR end "rule__Influence__Group_33__0"


    // $ANTLR start "rule__Influence__Group_33__0__Impl"
    // InternalInfluenceDSL.g:2412:1: rule__Influence__Group_33__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_33__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2416:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2417:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2417:1: ( ',' )
            // InternalInfluenceDSL.g:2418:2: ','
            {
             before(grammarAccess.getInfluenceAccess().getCommaKeyword_33_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getCommaKeyword_33_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_33__0__Impl"


    // $ANTLR start "rule__Influence__Group_33__1"
    // InternalInfluenceDSL.g:2427:1: rule__Influence__Group_33__1 : rule__Influence__Group_33__1__Impl ;
    public final void rule__Influence__Group_33__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2431:1: ( rule__Influence__Group_33__1__Impl )
            // InternalInfluenceDSL.g:2432:2: rule__Influence__Group_33__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Influence__Group_33__1__Impl();

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
    // $ANTLR end "rule__Influence__Group_33__1"


    // $ANTLR start "rule__Influence__Group_33__1__Impl"
    // InternalInfluenceDSL.g:2438:1: rule__Influence__Group_33__1__Impl : ( ( rule__Influence__TargetArtifactAssignment_33_1 ) ) ;
    public final void rule__Influence__Group_33__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2442:1: ( ( ( rule__Influence__TargetArtifactAssignment_33_1 ) ) )
            // InternalInfluenceDSL.g:2443:1: ( ( rule__Influence__TargetArtifactAssignment_33_1 ) )
            {
            // InternalInfluenceDSL.g:2443:1: ( ( rule__Influence__TargetArtifactAssignment_33_1 ) )
            // InternalInfluenceDSL.g:2444:2: ( rule__Influence__TargetArtifactAssignment_33_1 )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactAssignment_33_1()); 
            // InternalInfluenceDSL.g:2445:2: ( rule__Influence__TargetArtifactAssignment_33_1 )
            // InternalInfluenceDSL.g:2445:3: rule__Influence__TargetArtifactAssignment_33_1
            {
            pushFollow(FOLLOW_2);
            rule__Influence__TargetArtifactAssignment_33_1();

            state._fsp--;


            }

             after(grammarAccess.getInfluenceAccess().getTargetArtifactAssignment_33_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__Group_33__1__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__0"
    // InternalInfluenceDSL.g:2454:1: rule__RequirementSatisfaction__Group__0 : rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 ;
    public final void rule__RequirementSatisfaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2458:1: ( rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 )
            // InternalInfluenceDSL.g:2459:2: rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalInfluenceDSL.g:2466:1: rule__RequirementSatisfaction__Group__0__Impl : ( 'Requirement' ) ;
    public final void rule__RequirementSatisfaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2470:1: ( ( 'Requirement' ) )
            // InternalInfluenceDSL.g:2471:1: ( 'Requirement' )
            {
            // InternalInfluenceDSL.g:2471:1: ( 'Requirement' )
            // InternalInfluenceDSL.g:2472:2: 'Requirement'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2481:1: rule__RequirementSatisfaction__Group__1 : rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 ;
    public final void rule__RequirementSatisfaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2485:1: ( rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 )
            // InternalInfluenceDSL.g:2486:2: rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalInfluenceDSL.g:2493:1: rule__RequirementSatisfaction__Group__1__Impl : ( 'Satisfaction' ) ;
    public final void rule__RequirementSatisfaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2497:1: ( ( 'Satisfaction' ) )
            // InternalInfluenceDSL.g:2498:1: ( 'Satisfaction' )
            {
            // InternalInfluenceDSL.g:2498:1: ( 'Satisfaction' )
            // InternalInfluenceDSL.g:2499:2: 'Satisfaction'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionKeyword_1()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2508:1: rule__RequirementSatisfaction__Group__2 : rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 ;
    public final void rule__RequirementSatisfaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2512:1: ( rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 )
            // InternalInfluenceDSL.g:2513:2: rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalInfluenceDSL.g:2520:1: rule__RequirementSatisfaction__Group__2__Impl : ( ( rule__RequirementSatisfaction__NameAssignment_2 ) ) ;
    public final void rule__RequirementSatisfaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2524:1: ( ( ( rule__RequirementSatisfaction__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:2525:1: ( ( rule__RequirementSatisfaction__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:2525:1: ( ( rule__RequirementSatisfaction__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:2526:2: ( rule__RequirementSatisfaction__NameAssignment_2 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:2527:2: ( rule__RequirementSatisfaction__NameAssignment_2 )
            // InternalInfluenceDSL.g:2527:3: rule__RequirementSatisfaction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2535:1: rule__RequirementSatisfaction__Group__3 : rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 ;
    public final void rule__RequirementSatisfaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2539:1: ( rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 )
            // InternalInfluenceDSL.g:2540:2: rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalInfluenceDSL.g:2547:1: rule__RequirementSatisfaction__Group__3__Impl : ( ':' ) ;
    public final void rule__RequirementSatisfaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2551:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:2552:1: ( ':' )
            {
            // InternalInfluenceDSL.g:2552:1: ( ':' )
            // InternalInfluenceDSL.g:2553:2: ':'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2562:1: rule__RequirementSatisfaction__Group__4 : rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 ;
    public final void rule__RequirementSatisfaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2566:1: ( rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 )
            // InternalInfluenceDSL.g:2567:2: rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalInfluenceDSL.g:2574:1: rule__RequirementSatisfaction__Group__4__Impl : ( 'from' ) ;
    public final void rule__RequirementSatisfaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2578:1: ( ( 'from' ) )
            // InternalInfluenceDSL.g:2579:1: ( 'from' )
            {
            // InternalInfluenceDSL.g:2579:1: ( 'from' )
            // InternalInfluenceDSL.g:2580:2: 'from'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getFromKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getFromKeyword_4()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2589:1: rule__RequirementSatisfaction__Group__5 : rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 ;
    public final void rule__RequirementSatisfaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2593:1: ( rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 )
            // InternalInfluenceDSL.g:2594:2: rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalInfluenceDSL.g:2601:1: rule__RequirementSatisfaction__Group__5__Impl : ( 'Requirement' ) ;
    public final void rule__RequirementSatisfaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2605:1: ( ( 'Requirement' ) )
            // InternalInfluenceDSL.g:2606:1: ( 'Requirement' )
            {
            // InternalInfluenceDSL.g:2606:1: ( 'Requirement' )
            // InternalInfluenceDSL.g:2607:2: 'Requirement'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getRequirementKeyword_5()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2616:1: rule__RequirementSatisfaction__Group__6 : rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7 ;
    public final void rule__RequirementSatisfaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2620:1: ( rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7 )
            // InternalInfluenceDSL.g:2621:2: rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalInfluenceDSL.g:2628:1: rule__RequirementSatisfaction__Group__6__Impl : ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) ) ;
    public final void rule__RequirementSatisfaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2632:1: ( ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) ) )
            // InternalInfluenceDSL.g:2633:1: ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) )
            {
            // InternalInfluenceDSL.g:2633:1: ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) )
            // InternalInfluenceDSL.g:2634:2: ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementAssignment_6()); 
            // InternalInfluenceDSL.g:2635:2: ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 )
            // InternalInfluenceDSL.g:2635:3: rule__RequirementSatisfaction__ConcerningRequirementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__ConcerningRequirementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementAssignment_6()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2643:1: rule__RequirementSatisfaction__Group__7 : rule__RequirementSatisfaction__Group__7__Impl rule__RequirementSatisfaction__Group__8 ;
    public final void rule__RequirementSatisfaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2647:1: ( rule__RequirementSatisfaction__Group__7__Impl rule__RequirementSatisfaction__Group__8 )
            // InternalInfluenceDSL.g:2648:2: rule__RequirementSatisfaction__Group__7__Impl rule__RequirementSatisfaction__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__RequirementSatisfaction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__8();

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
    // InternalInfluenceDSL.g:2655:1: rule__RequirementSatisfaction__Group__7__Impl : ( 'satisfied' ) ;
    public final void rule__RequirementSatisfaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2659:1: ( ( 'satisfied' ) )
            // InternalInfluenceDSL.g:2660:1: ( 'satisfied' )
            {
            // InternalInfluenceDSL.g:2660:1: ( 'satisfied' )
            // InternalInfluenceDSL.g:2661:2: 'satisfied'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfiedKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__RequirementSatisfaction__Group__8"
    // InternalInfluenceDSL.g:2670:1: rule__RequirementSatisfaction__Group__8 : rule__RequirementSatisfaction__Group__8__Impl rule__RequirementSatisfaction__Group__9 ;
    public final void rule__RequirementSatisfaction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2674:1: ( rule__RequirementSatisfaction__Group__8__Impl rule__RequirementSatisfaction__Group__9 )
            // InternalInfluenceDSL.g:2675:2: rule__RequirementSatisfaction__Group__8__Impl rule__RequirementSatisfaction__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__9();

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
    // $ANTLR end "rule__RequirementSatisfaction__Group__8"


    // $ANTLR start "rule__RequirementSatisfaction__Group__8__Impl"
    // InternalInfluenceDSL.g:2682:1: rule__RequirementSatisfaction__Group__8__Impl : ( 'when' ) ;
    public final void rule__RequirementSatisfaction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2686:1: ( ( 'when' ) )
            // InternalInfluenceDSL.g:2687:1: ( 'when' )
            {
            // InternalInfluenceDSL.g:2687:1: ( 'when' )
            // InternalInfluenceDSL.g:2688:2: 'when'
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getWhenKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__8__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__9"
    // InternalInfluenceDSL.g:2697:1: rule__RequirementSatisfaction__Group__9 : rule__RequirementSatisfaction__Group__9__Impl rule__RequirementSatisfaction__Group__10 ;
    public final void rule__RequirementSatisfaction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2701:1: ( rule__RequirementSatisfaction__Group__9__Impl rule__RequirementSatisfaction__Group__10 )
            // InternalInfluenceDSL.g:2702:2: rule__RequirementSatisfaction__Group__9__Impl rule__RequirementSatisfaction__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__RequirementSatisfaction__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__10();

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
    // $ANTLR end "rule__RequirementSatisfaction__Group__9"


    // $ANTLR start "rule__RequirementSatisfaction__Group__9__Impl"
    // InternalInfluenceDSL.g:2709:1: rule__RequirementSatisfaction__Group__9__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) ) ;
    public final void rule__RequirementSatisfaction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2713:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) ) )
            // InternalInfluenceDSL.g:2714:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) )
            {
            // InternalInfluenceDSL.g:2714:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) )
            // InternalInfluenceDSL.g:2715:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_9 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_9()); 
            // InternalInfluenceDSL.g:2716:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_9 )
            // InternalInfluenceDSL.g:2716:3: rule__RequirementSatisfaction__SatisfactionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__SatisfactionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__9__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group__10"
    // InternalInfluenceDSL.g:2724:1: rule__RequirementSatisfaction__Group__10 : rule__RequirementSatisfaction__Group__10__Impl ;
    public final void rule__RequirementSatisfaction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2728:1: ( rule__RequirementSatisfaction__Group__10__Impl )
            // InternalInfluenceDSL.g:2729:2: rule__RequirementSatisfaction__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group__10__Impl();

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
    // $ANTLR end "rule__RequirementSatisfaction__Group__10"


    // $ANTLR start "rule__RequirementSatisfaction__Group__10__Impl"
    // InternalInfluenceDSL.g:2735:1: rule__RequirementSatisfaction__Group__10__Impl : ( ( rule__RequirementSatisfaction__Group_10__0 )* ) ;
    public final void rule__RequirementSatisfaction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2739:1: ( ( ( rule__RequirementSatisfaction__Group_10__0 )* ) )
            // InternalInfluenceDSL.g:2740:1: ( ( rule__RequirementSatisfaction__Group_10__0 )* )
            {
            // InternalInfluenceDSL.g:2740:1: ( ( rule__RequirementSatisfaction__Group_10__0 )* )
            // InternalInfluenceDSL.g:2741:2: ( rule__RequirementSatisfaction__Group_10__0 )*
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup_10()); 
            // InternalInfluenceDSL.g:2742:2: ( rule__RequirementSatisfaction__Group_10__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2742:3: rule__RequirementSatisfaction__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RequirementSatisfaction__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRequirementSatisfactionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group__10__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_10__0"
    // InternalInfluenceDSL.g:2751:1: rule__RequirementSatisfaction__Group_10__0 : rule__RequirementSatisfaction__Group_10__0__Impl rule__RequirementSatisfaction__Group_10__1 ;
    public final void rule__RequirementSatisfaction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2755:1: ( rule__RequirementSatisfaction__Group_10__0__Impl rule__RequirementSatisfaction__Group_10__1 )
            // InternalInfluenceDSL.g:2756:2: rule__RequirementSatisfaction__Group_10__0__Impl rule__RequirementSatisfaction__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__RequirementSatisfaction__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_10__1();

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
    // $ANTLR end "rule__RequirementSatisfaction__Group_10__0"


    // $ANTLR start "rule__RequirementSatisfaction__Group_10__0__Impl"
    // InternalInfluenceDSL.g:2763:1: rule__RequirementSatisfaction__Group_10__0__Impl : ( ',' ) ;
    public final void rule__RequirementSatisfaction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2767:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2768:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2768:1: ( ',' )
            // InternalInfluenceDSL.g:2769:2: ','
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_10_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRequirementSatisfactionAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_10__0__Impl"


    // $ANTLR start "rule__RequirementSatisfaction__Group_10__1"
    // InternalInfluenceDSL.g:2778:1: rule__RequirementSatisfaction__Group_10__1 : rule__RequirementSatisfaction__Group_10__1__Impl ;
    public final void rule__RequirementSatisfaction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2782:1: ( rule__RequirementSatisfaction__Group_10__1__Impl )
            // InternalInfluenceDSL.g:2783:2: rule__RequirementSatisfaction__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__Group_10__1__Impl();

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
    // $ANTLR end "rule__RequirementSatisfaction__Group_10__1"


    // $ANTLR start "rule__RequirementSatisfaction__Group_10__1__Impl"
    // InternalInfluenceDSL.g:2789:1: rule__RequirementSatisfaction__Group_10__1__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2793:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) ) )
            // InternalInfluenceDSL.g:2794:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) )
            {
            // InternalInfluenceDSL.g:2794:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) )
            // InternalInfluenceDSL.g:2795:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_10_1()); 
            // InternalInfluenceDSL.g:2796:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 )
            // InternalInfluenceDSL.g:2796:3: rule__RequirementSatisfaction__SatisfactionAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementSatisfaction__SatisfactionAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__Group_10__1__Impl"


    // $ANTLR start "rule__Artifact__Group__0"
    // InternalInfluenceDSL.g:2805:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2809:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // InternalInfluenceDSL.g:2810:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Artifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__1();

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
    // $ANTLR end "rule__Artifact__Group__0"


    // $ANTLR start "rule__Artifact__Group__0__Impl"
    // InternalInfluenceDSL.g:2817:1: rule__Artifact__Group__0__Impl : ( () ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2821:1: ( ( () ) )
            // InternalInfluenceDSL.g:2822:1: ( () )
            {
            // InternalInfluenceDSL.g:2822:1: ( () )
            // InternalInfluenceDSL.g:2823:2: ()
            {
             before(grammarAccess.getArtifactAccess().getArtifactAction_0()); 
            // InternalInfluenceDSL.g:2824:2: ()
            // InternalInfluenceDSL.g:2824:3: 
            {
            }

             after(grammarAccess.getArtifactAccess().getArtifactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__0__Impl"


    // $ANTLR start "rule__Artifact__Group__1"
    // InternalInfluenceDSL.g:2832:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2836:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // InternalInfluenceDSL.g:2837:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__2();

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
    // $ANTLR end "rule__Artifact__Group__1"


    // $ANTLR start "rule__Artifact__Group__1__Impl"
    // InternalInfluenceDSL.g:2844:1: rule__Artifact__Group__1__Impl : ( 'Artifact' ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2848:1: ( ( 'Artifact' ) )
            // InternalInfluenceDSL.g:2849:1: ( 'Artifact' )
            {
            // InternalInfluenceDSL.g:2849:1: ( 'Artifact' )
            // InternalInfluenceDSL.g:2850:2: 'Artifact'
            {
             before(grammarAccess.getArtifactAccess().getArtifactKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getArtifactKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__1__Impl"


    // $ANTLR start "rule__Artifact__Group__2"
    // InternalInfluenceDSL.g:2859:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2863:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // InternalInfluenceDSL.g:2864:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__3();

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
    // $ANTLR end "rule__Artifact__Group__2"


    // $ANTLR start "rule__Artifact__Group__2__Impl"
    // InternalInfluenceDSL.g:2871:1: rule__Artifact__Group__2__Impl : ( ( rule__Artifact__NameAssignment_2 ) ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2875:1: ( ( ( rule__Artifact__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:2876:1: ( ( rule__Artifact__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:2876:1: ( ( rule__Artifact__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:2877:2: ( rule__Artifact__NameAssignment_2 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:2878:2: ( rule__Artifact__NameAssignment_2 )
            // InternalInfluenceDSL.g:2878:3: rule__Artifact__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__2__Impl"


    // $ANTLR start "rule__Artifact__Group__3"
    // InternalInfluenceDSL.g:2886:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2890:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // InternalInfluenceDSL.g:2891:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Artifact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__4();

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
    // $ANTLR end "rule__Artifact__Group__3"


    // $ANTLR start "rule__Artifact__Group__3__Impl"
    // InternalInfluenceDSL.g:2898:1: rule__Artifact__Group__3__Impl : ( '->' ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2902:1: ( ( '->' ) )
            // InternalInfluenceDSL.g:2903:1: ( '->' )
            {
            // InternalInfluenceDSL.g:2903:1: ( '->' )
            // InternalInfluenceDSL.g:2904:2: '->'
            {
             before(grammarAccess.getArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__3__Impl"


    // $ANTLR start "rule__Artifact__Group__4"
    // InternalInfluenceDSL.g:2913:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2917:1: ( rule__Artifact__Group__4__Impl )
            // InternalInfluenceDSL.g:2918:2: rule__Artifact__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__Group__4__Impl();

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
    // $ANTLR end "rule__Artifact__Group__4"


    // $ANTLR start "rule__Artifact__Group__4__Impl"
    // InternalInfluenceDSL.g:2924:1: rule__Artifact__Group__4__Impl : ( ( rule__Artifact__RefAssignment_4 ) ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2928:1: ( ( ( rule__Artifact__RefAssignment_4 ) ) )
            // InternalInfluenceDSL.g:2929:1: ( ( rule__Artifact__RefAssignment_4 ) )
            {
            // InternalInfluenceDSL.g:2929:1: ( ( rule__Artifact__RefAssignment_4 ) )
            // InternalInfluenceDSL.g:2930:2: ( rule__Artifact__RefAssignment_4 )
            {
             before(grammarAccess.getArtifactAccess().getRefAssignment_4()); 
            // InternalInfluenceDSL.g:2931:2: ( rule__Artifact__RefAssignment_4 )
            // InternalInfluenceDSL.g:2931:3: rule__Artifact__RefAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__RefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__4__Impl"


    // $ANTLR start "rule__SystemResponse__Group__0"
    // InternalInfluenceDSL.g:2940:1: rule__SystemResponse__Group__0 : rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 ;
    public final void rule__SystemResponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2944:1: ( rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 )
            // InternalInfluenceDSL.g:2945:2: rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalInfluenceDSL.g:2952:1: rule__SystemResponse__Group__0__Impl : ( () ) ;
    public final void rule__SystemResponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2956:1: ( ( () ) )
            // InternalInfluenceDSL.g:2957:1: ( () )
            {
            // InternalInfluenceDSL.g:2957:1: ( () )
            // InternalInfluenceDSL.g:2958:2: ()
            {
             before(grammarAccess.getSystemResponseAccess().getSystemResponseAction_0()); 
            // InternalInfluenceDSL.g:2959:2: ()
            // InternalInfluenceDSL.g:2959:3: 
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
    // InternalInfluenceDSL.g:2967:1: rule__SystemResponse__Group__1 : rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 ;
    public final void rule__SystemResponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2971:1: ( rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 )
            // InternalInfluenceDSL.g:2972:2: rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalInfluenceDSL.g:2979:1: rule__SystemResponse__Group__1__Impl : ( 'system' ) ;
    public final void rule__SystemResponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2983:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:2984:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:2984:1: ( 'system' )
            // InternalInfluenceDSL.g:2985:2: 'system'
            {
             before(grammarAccess.getSystemResponseAccess().getSystemKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:2994:1: rule__SystemResponse__Group__2 : rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 ;
    public final void rule__SystemResponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2998:1: ( rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 )
            // InternalInfluenceDSL.g:2999:2: rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalInfluenceDSL.g:3006:1: rule__SystemResponse__Group__2__Impl : ( 'response' ) ;
    public final void rule__SystemResponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3010:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:3011:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:3011:1: ( 'response' )
            // InternalInfluenceDSL.g:3012:2: 'response'
            {
             before(grammarAccess.getSystemResponseAccess().getResponseKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:3021:1: rule__SystemResponse__Group__3 : rule__SystemResponse__Group__3__Impl ;
    public final void rule__SystemResponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3025:1: ( rule__SystemResponse__Group__3__Impl )
            // InternalInfluenceDSL.g:3026:2: rule__SystemResponse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group__3__Impl();

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
    // InternalInfluenceDSL.g:3032:1: rule__SystemResponse__Group__3__Impl : ( ( rule__SystemResponse__Group_3__0 )? ) ;
    public final void rule__SystemResponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3036:1: ( ( ( rule__SystemResponse__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:3037:1: ( ( rule__SystemResponse__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:3037:1: ( ( rule__SystemResponse__Group_3__0 )? )
            // InternalInfluenceDSL.g:3038:2: ( rule__SystemResponse__Group_3__0 )?
            {
             before(grammarAccess.getSystemResponseAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:3039:2: ( rule__SystemResponse__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:3039:3: rule__SystemResponse__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemResponse__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemResponseAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SystemResponse__Group_3__0"
    // InternalInfluenceDSL.g:3048:1: rule__SystemResponse__Group_3__0 : rule__SystemResponse__Group_3__0__Impl rule__SystemResponse__Group_3__1 ;
    public final void rule__SystemResponse__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3052:1: ( rule__SystemResponse__Group_3__0__Impl rule__SystemResponse__Group_3__1 )
            // InternalInfluenceDSL.g:3053:2: rule__SystemResponse__Group_3__0__Impl rule__SystemResponse__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__SystemResponse__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_3__1();

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
    // $ANTLR end "rule__SystemResponse__Group_3__0"


    // $ANTLR start "rule__SystemResponse__Group_3__0__Impl"
    // InternalInfluenceDSL.g:3060:1: rule__SystemResponse__Group_3__0__Impl : ( 'resulting' ) ;
    public final void rule__SystemResponse__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3064:1: ( ( 'resulting' ) )
            // InternalInfluenceDSL.g:3065:1: ( 'resulting' )
            {
            // InternalInfluenceDSL.g:3065:1: ( 'resulting' )
            // InternalInfluenceDSL.g:3066:2: 'resulting'
            {
             before(grammarAccess.getSystemResponseAccess().getResultingKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getResultingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_3__0__Impl"


    // $ANTLR start "rule__SystemResponse__Group_3__1"
    // InternalInfluenceDSL.g:3075:1: rule__SystemResponse__Group_3__1 : rule__SystemResponse__Group_3__1__Impl rule__SystemResponse__Group_3__2 ;
    public final void rule__SystemResponse__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3079:1: ( rule__SystemResponse__Group_3__1__Impl rule__SystemResponse__Group_3__2 )
            // InternalInfluenceDSL.g:3080:2: rule__SystemResponse__Group_3__1__Impl rule__SystemResponse__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemResponse__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_3__2();

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
    // $ANTLR end "rule__SystemResponse__Group_3__1"


    // $ANTLR start "rule__SystemResponse__Group_3__1__Impl"
    // InternalInfluenceDSL.g:3087:1: rule__SystemResponse__Group_3__1__Impl : ( 'in' ) ;
    public final void rule__SystemResponse__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3091:1: ( ( 'in' ) )
            // InternalInfluenceDSL.g:3092:1: ( 'in' )
            {
            // InternalInfluenceDSL.g:3092:1: ( 'in' )
            // InternalInfluenceDSL.g:3093:2: 'in'
            {
             before(grammarAccess.getSystemResponseAccess().getInKeyword_3_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSystemResponseAccess().getInKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_3__1__Impl"


    // $ANTLR start "rule__SystemResponse__Group_3__2"
    // InternalInfluenceDSL.g:3102:1: rule__SystemResponse__Group_3__2 : rule__SystemResponse__Group_3__2__Impl ;
    public final void rule__SystemResponse__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3106:1: ( rule__SystemResponse__Group_3__2__Impl )
            // InternalInfluenceDSL.g:3107:2: rule__SystemResponse__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__Group_3__2__Impl();

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
    // $ANTLR end "rule__SystemResponse__Group_3__2"


    // $ANTLR start "rule__SystemResponse__Group_3__2__Impl"
    // InternalInfluenceDSL.g:3113:1: rule__SystemResponse__Group_3__2__Impl : ( ( rule__SystemResponse__ObservationAssignment_3_2 ) ) ;
    public final void rule__SystemResponse__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3117:1: ( ( ( rule__SystemResponse__ObservationAssignment_3_2 ) ) )
            // InternalInfluenceDSL.g:3118:1: ( ( rule__SystemResponse__ObservationAssignment_3_2 ) )
            {
            // InternalInfluenceDSL.g:3118:1: ( ( rule__SystemResponse__ObservationAssignment_3_2 ) )
            // InternalInfluenceDSL.g:3119:2: ( rule__SystemResponse__ObservationAssignment_3_2 )
            {
             before(grammarAccess.getSystemResponseAccess().getObservationAssignment_3_2()); 
            // InternalInfluenceDSL.g:3120:2: ( rule__SystemResponse__ObservationAssignment_3_2 )
            // InternalInfluenceDSL.g:3120:3: rule__SystemResponse__ObservationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemResponse__ObservationAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemResponseAccess().getObservationAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__Group_3__2__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group__0"
    // InternalInfluenceDSL.g:3129:1: rule__EmergentBehavior__Group__0 : rule__EmergentBehavior__Group__0__Impl rule__EmergentBehavior__Group__1 ;
    public final void rule__EmergentBehavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3133:1: ( rule__EmergentBehavior__Group__0__Impl rule__EmergentBehavior__Group__1 )
            // InternalInfluenceDSL.g:3134:2: rule__EmergentBehavior__Group__0__Impl rule__EmergentBehavior__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EmergentBehavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group__1();

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
    // $ANTLR end "rule__EmergentBehavior__Group__0"


    // $ANTLR start "rule__EmergentBehavior__Group__0__Impl"
    // InternalInfluenceDSL.g:3141:1: rule__EmergentBehavior__Group__0__Impl : ( () ) ;
    public final void rule__EmergentBehavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3145:1: ( ( () ) )
            // InternalInfluenceDSL.g:3146:1: ( () )
            {
            // InternalInfluenceDSL.g:3146:1: ( () )
            // InternalInfluenceDSL.g:3147:2: ()
            {
             before(grammarAccess.getEmergentBehaviorAccess().getEmergentBehaviorAction_0()); 
            // InternalInfluenceDSL.g:3148:2: ()
            // InternalInfluenceDSL.g:3148:3: 
            {
            }

             after(grammarAccess.getEmergentBehaviorAccess().getEmergentBehaviorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group__0__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group__1"
    // InternalInfluenceDSL.g:3156:1: rule__EmergentBehavior__Group__1 : rule__EmergentBehavior__Group__1__Impl rule__EmergentBehavior__Group__2 ;
    public final void rule__EmergentBehavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3160:1: ( rule__EmergentBehavior__Group__1__Impl rule__EmergentBehavior__Group__2 )
            // InternalInfluenceDSL.g:3161:2: rule__EmergentBehavior__Group__1__Impl rule__EmergentBehavior__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__EmergentBehavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group__2();

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
    // $ANTLR end "rule__EmergentBehavior__Group__1"


    // $ANTLR start "rule__EmergentBehavior__Group__1__Impl"
    // InternalInfluenceDSL.g:3168:1: rule__EmergentBehavior__Group__1__Impl : ( 'Emergent' ) ;
    public final void rule__EmergentBehavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3172:1: ( ( 'Emergent' ) )
            // InternalInfluenceDSL.g:3173:1: ( 'Emergent' )
            {
            // InternalInfluenceDSL.g:3173:1: ( 'Emergent' )
            // InternalInfluenceDSL.g:3174:2: 'Emergent'
            {
             before(grammarAccess.getEmergentBehaviorAccess().getEmergentKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEmergentBehaviorAccess().getEmergentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group__1__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group__2"
    // InternalInfluenceDSL.g:3183:1: rule__EmergentBehavior__Group__2 : rule__EmergentBehavior__Group__2__Impl rule__EmergentBehavior__Group__3 ;
    public final void rule__EmergentBehavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3187:1: ( rule__EmergentBehavior__Group__2__Impl rule__EmergentBehavior__Group__3 )
            // InternalInfluenceDSL.g:3188:2: rule__EmergentBehavior__Group__2__Impl rule__EmergentBehavior__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__EmergentBehavior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group__3();

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
    // $ANTLR end "rule__EmergentBehavior__Group__2"


    // $ANTLR start "rule__EmergentBehavior__Group__2__Impl"
    // InternalInfluenceDSL.g:3195:1: rule__EmergentBehavior__Group__2__Impl : ( 'Behavior' ) ;
    public final void rule__EmergentBehavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3199:1: ( ( 'Behavior' ) )
            // InternalInfluenceDSL.g:3200:1: ( 'Behavior' )
            {
            // InternalInfluenceDSL.g:3200:1: ( 'Behavior' )
            // InternalInfluenceDSL.g:3201:2: 'Behavior'
            {
             before(grammarAccess.getEmergentBehaviorAccess().getBehaviorKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEmergentBehaviorAccess().getBehaviorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group__2__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group__3"
    // InternalInfluenceDSL.g:3210:1: rule__EmergentBehavior__Group__3 : rule__EmergentBehavior__Group__3__Impl ;
    public final void rule__EmergentBehavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3214:1: ( rule__EmergentBehavior__Group__3__Impl )
            // InternalInfluenceDSL.g:3215:2: rule__EmergentBehavior__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group__3__Impl();

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
    // $ANTLR end "rule__EmergentBehavior__Group__3"


    // $ANTLR start "rule__EmergentBehavior__Group__3__Impl"
    // InternalInfluenceDSL.g:3221:1: rule__EmergentBehavior__Group__3__Impl : ( ( rule__EmergentBehavior__Group_3__0 )? ) ;
    public final void rule__EmergentBehavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3225:1: ( ( ( rule__EmergentBehavior__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:3226:1: ( ( rule__EmergentBehavior__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:3226:1: ( ( rule__EmergentBehavior__Group_3__0 )? )
            // InternalInfluenceDSL.g:3227:2: ( rule__EmergentBehavior__Group_3__0 )?
            {
             before(grammarAccess.getEmergentBehaviorAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:3228:2: ( rule__EmergentBehavior__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalInfluenceDSL.g:3228:3: rule__EmergentBehavior__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmergentBehavior__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmergentBehaviorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group__3__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group_3__0"
    // InternalInfluenceDSL.g:3237:1: rule__EmergentBehavior__Group_3__0 : rule__EmergentBehavior__Group_3__0__Impl rule__EmergentBehavior__Group_3__1 ;
    public final void rule__EmergentBehavior__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3241:1: ( rule__EmergentBehavior__Group_3__0__Impl rule__EmergentBehavior__Group_3__1 )
            // InternalInfluenceDSL.g:3242:2: rule__EmergentBehavior__Group_3__0__Impl rule__EmergentBehavior__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__EmergentBehavior__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group_3__1();

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
    // $ANTLR end "rule__EmergentBehavior__Group_3__0"


    // $ANTLR start "rule__EmergentBehavior__Group_3__0__Impl"
    // InternalInfluenceDSL.g:3249:1: rule__EmergentBehavior__Group_3__0__Impl : ( 'characterized' ) ;
    public final void rule__EmergentBehavior__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3253:1: ( ( 'characterized' ) )
            // InternalInfluenceDSL.g:3254:1: ( 'characterized' )
            {
            // InternalInfluenceDSL.g:3254:1: ( 'characterized' )
            // InternalInfluenceDSL.g:3255:2: 'characterized'
            {
             before(grammarAccess.getEmergentBehaviorAccess().getCharacterizedKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEmergentBehaviorAccess().getCharacterizedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group_3__0__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group_3__1"
    // InternalInfluenceDSL.g:3264:1: rule__EmergentBehavior__Group_3__1 : rule__EmergentBehavior__Group_3__1__Impl rule__EmergentBehavior__Group_3__2 ;
    public final void rule__EmergentBehavior__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3268:1: ( rule__EmergentBehavior__Group_3__1__Impl rule__EmergentBehavior__Group_3__2 )
            // InternalInfluenceDSL.g:3269:2: rule__EmergentBehavior__Group_3__1__Impl rule__EmergentBehavior__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__EmergentBehavior__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group_3__2();

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
    // $ANTLR end "rule__EmergentBehavior__Group_3__1"


    // $ANTLR start "rule__EmergentBehavior__Group_3__1__Impl"
    // InternalInfluenceDSL.g:3276:1: rule__EmergentBehavior__Group_3__1__Impl : ( 'by' ) ;
    public final void rule__EmergentBehavior__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3280:1: ( ( 'by' ) )
            // InternalInfluenceDSL.g:3281:1: ( 'by' )
            {
            // InternalInfluenceDSL.g:3281:1: ( 'by' )
            // InternalInfluenceDSL.g:3282:2: 'by'
            {
             before(grammarAccess.getEmergentBehaviorAccess().getByKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEmergentBehaviorAccess().getByKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group_3__1__Impl"


    // $ANTLR start "rule__EmergentBehavior__Group_3__2"
    // InternalInfluenceDSL.g:3291:1: rule__EmergentBehavior__Group_3__2 : rule__EmergentBehavior__Group_3__2__Impl ;
    public final void rule__EmergentBehavior__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3295:1: ( rule__EmergentBehavior__Group_3__2__Impl )
            // InternalInfluenceDSL.g:3296:2: rule__EmergentBehavior__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__Group_3__2__Impl();

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
    // $ANTLR end "rule__EmergentBehavior__Group_3__2"


    // $ANTLR start "rule__EmergentBehavior__Group_3__2__Impl"
    // InternalInfluenceDSL.g:3302:1: rule__EmergentBehavior__Group_3__2__Impl : ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) ) ;
    public final void rule__EmergentBehavior__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3306:1: ( ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) ) )
            // InternalInfluenceDSL.g:3307:1: ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) )
            {
            // InternalInfluenceDSL.g:3307:1: ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) )
            // InternalInfluenceDSL.g:3308:2: ( rule__EmergentBehavior__DescriptionAssignment_3_2 )
            {
             before(grammarAccess.getEmergentBehaviorAccess().getDescriptionAssignment_3_2()); 
            // InternalInfluenceDSL.g:3309:2: ( rule__EmergentBehavior__DescriptionAssignment_3_2 )
            // InternalInfluenceDSL.g:3309:3: rule__EmergentBehavior__DescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__EmergentBehavior__DescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEmergentBehaviorAccess().getDescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalInfluenceDSL.g:3318:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3322:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalInfluenceDSL.g:3323:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalInfluenceDSL.g:3330:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3334:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3335:1: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:3335:1: ( RULE_ID )
            // InternalInfluenceDSL.g:3336:2: RULE_ID
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
    // InternalInfluenceDSL.g:3345:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3349:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalInfluenceDSL.g:3350:2: rule__QualifiedName__Group__1__Impl
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
    // InternalInfluenceDSL.g:3356:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3360:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalInfluenceDSL.g:3361:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalInfluenceDSL.g:3361:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalInfluenceDSL.g:3362:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalInfluenceDSL.g:3363:2: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==49) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalInfluenceDSL.g:3363:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalInfluenceDSL.g:3372:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3376:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalInfluenceDSL.g:3377:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalInfluenceDSL.g:3384:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3388:1: ( ( '.' ) )
            // InternalInfluenceDSL.g:3389:1: ( '.' )
            {
            // InternalInfluenceDSL.g:3389:1: ( '.' )
            // InternalInfluenceDSL.g:3390:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalInfluenceDSL.g:3399:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3403:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalInfluenceDSL.g:3404:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalInfluenceDSL.g:3410:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3414:1: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3415:1: ( RULE_ID )
            {
            // InternalInfluenceDSL.g:3415:1: ( RULE_ID )
            // InternalInfluenceDSL.g:3416:2: RULE_ID
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
    // InternalInfluenceDSL.g:3426:1: rule__InfluenceModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InfluenceModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3430:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3431:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3431:2: ( ruleEString )
            // InternalInfluenceDSL.g:3432:3: ruleEString
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
    // InternalInfluenceDSL.g:3441:1: rule__InfluenceModel__OwnedArtifactsAssignment_3_0 : ( ruleArtifact ) ;
    public final void rule__InfluenceModel__OwnedArtifactsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3445:1: ( ( ruleArtifact ) )
            // InternalInfluenceDSL.g:3446:2: ( ruleArtifact )
            {
            // InternalInfluenceDSL.g:3446:2: ( ruleArtifact )
            // InternalInfluenceDSL.g:3447:3: ruleArtifact
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsArtifactParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedArtifactsArtifactParserRuleCall_3_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1"
    // InternalInfluenceDSL.g:3456:1: rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 : ( ruleRequirementSatisfaction ) ;
    public final void rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3460:1: ( ( ruleRequirementSatisfaction ) )
            // InternalInfluenceDSL.g:3461:2: ( ruleRequirementSatisfaction )
            {
            // InternalInfluenceDSL.g:3461:2: ( ruleRequirementSatisfaction )
            // InternalInfluenceDSL.g:3462:3: ruleRequirementSatisfaction
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedRequirementSatisfactionRequirementSatisfactionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirementSatisfaction();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedRequirementSatisfactionRequirementSatisfactionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1"


    // $ANTLR start "rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2"
    // InternalInfluenceDSL.g:3471:1: rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 : ( ruleCyberPhysicalPhenomena ) ;
    public final void rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3475:1: ( ( ruleCyberPhysicalPhenomena ) )
            // InternalInfluenceDSL.g:3476:2: ( ruleCyberPhysicalPhenomena )
            {
            // InternalInfluenceDSL.g:3476:2: ( ruleCyberPhysicalPhenomena )
            // InternalInfluenceDSL.g:3477:3: ruleCyberPhysicalPhenomena
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedCyberPhysicalPhenomenaCyberPhysicalPhenomenaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCyberPhysicalPhenomena();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedCyberPhysicalPhenomenaCyberPhysicalPhenomenaParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2"


    // $ANTLR start "rule__InfluenceModel__OwnedInfluencesAssignment_3_3"
    // InternalInfluenceDSL.g:3486:1: rule__InfluenceModel__OwnedInfluencesAssignment_3_3 : ( ruleInfluence ) ;
    public final void rule__InfluenceModel__OwnedInfluencesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3490:1: ( ( ruleInfluence ) )
            // InternalInfluenceDSL.g:3491:2: ( ruleInfluence )
            {
            // InternalInfluenceDSL.g:3491:2: ( ruleInfluence )
            // InternalInfluenceDSL.g:3492:3: ruleInfluence
            {
             before(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesInfluenceParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInfluence();

            state._fsp--;

             after(grammarAccess.getInfluenceModelAccess().getOwnedInfluencesInfluenceParserRuleCall_3_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MultiPhenomenon__NameAssignment_2"
    // InternalInfluenceDSL.g:3501:1: rule__MultiPhenomenon__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MultiPhenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3505:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3506:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3506:2: ( ruleEString )
            // InternalInfluenceDSL.g:3507:3: ruleEString
            {
             before(grammarAccess.getMultiPhenomenonAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiPhenomenonAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__NameAssignment_2"


    // $ANTLR start "rule__MultiPhenomenon__AggregationOfAssignment_3_1"
    // InternalInfluenceDSL.g:3516:1: rule__MultiPhenomenon__AggregationOfAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiPhenomenon__AggregationOfAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3520:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3521:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3521:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3522:3: ( ruleEString )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_1_0()); 
            // InternalInfluenceDSL.g:3523:3: ( ruleEString )
            // InternalInfluenceDSL.g:3524:4: ruleEString
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__AggregationOfAssignment_3_1"


    // $ANTLR start "rule__MultiPhenomenon__AggregationOfAssignment_3_2_1"
    // InternalInfluenceDSL.g:3535:1: rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiPhenomenon__AggregationOfAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3539:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3540:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3540:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3541:3: ( ruleEString )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_2_1_0()); 
            // InternalInfluenceDSL.g:3542:3: ( ruleEString )
            // InternalInfluenceDSL.g:3543:4: ruleEString
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__AggregationOfAssignment_3_2_1"


    // $ANTLR start "rule__MultiPhenomenon__ConfigurationAssignment_4_1"
    // InternalInfluenceDSL.g:3554:1: rule__MultiPhenomenon__ConfigurationAssignment_4_1 : ( ruleEString ) ;
    public final void rule__MultiPhenomenon__ConfigurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3558:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3559:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3559:2: ( ruleEString )
            // InternalInfluenceDSL.g:3560:3: ruleEString
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__ConfigurationAssignment_4_1"


    // $ANTLR start "rule__MultiPhenomenon__ConfigurationAssignment_4_2_1"
    // InternalInfluenceDSL.g:3569:1: rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 : ( ruleEString ) ;
    public final void rule__MultiPhenomenon__ConfigurationAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3573:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3574:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3574:2: ( ruleEString )
            // InternalInfluenceDSL.g:3575:3: ruleEString
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiPhenomenonAccess().getConfigurationEStringParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiPhenomenon__ConfigurationAssignment_4_2_1"


    // $ANTLR start "rule__SimplePhenomenon__NameAssignment_2"
    // InternalInfluenceDSL.g:3584:1: rule__SimplePhenomenon__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimplePhenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3588:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3589:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3589:2: ( ruleEString )
            // InternalInfluenceDSL.g:3590:3: ruleEString
            {
             before(grammarAccess.getSimplePhenomenonAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimplePhenomenonAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__NameAssignment_2"


    // $ANTLR start "rule__SimplePhenomenon__ConfigurationAssignment_3_1"
    // InternalInfluenceDSL.g:3599:1: rule__SimplePhenomenon__ConfigurationAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SimplePhenomenon__ConfigurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3603:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3604:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3604:2: ( ruleEString )
            // InternalInfluenceDSL.g:3605:3: ruleEString
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__ConfigurationAssignment_3_1"


    // $ANTLR start "rule__SimplePhenomenon__ConfigurationAssignment_3_2_1"
    // InternalInfluenceDSL.g:3614:1: rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 : ( ruleEString ) ;
    public final void rule__SimplePhenomenon__ConfigurationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3618:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3619:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3619:2: ( ruleEString )
            // InternalInfluenceDSL.g:3620:3: ruleEString
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimplePhenomenonAccess().getConfigurationEStringParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePhenomenon__ConfigurationAssignment_3_2_1"


    // $ANTLR start "rule__Influence__DescriptionAssignment_1"
    // InternalInfluenceDSL.g:3629:1: rule__Influence__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3633:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3634:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3634:2: ( ruleEString )
            // InternalInfluenceDSL.g:3635:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__DescriptionAssignment_1"


    // $ANTLR start "rule__Influence__DescriptionAssignment_2_1"
    // InternalInfluenceDSL.g:3644:1: rule__Influence__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3648:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3649:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3649:2: ( ruleEString )
            // InternalInfluenceDSL.g:3650:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Influence__NameAssignment_5"
    // InternalInfluenceDSL.g:3659:1: rule__Influence__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__Influence__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3663:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3664:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3664:2: ( ruleEString )
            // InternalInfluenceDSL.g:3665:3: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__NameAssignment_5"


    // $ANTLR start "rule__Influence__SourceArtifactAssignment_7"
    // InternalInfluenceDSL.g:3674:1: rule__Influence__SourceArtifactAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__SourceArtifactAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3678:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3679:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3679:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3680:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_7_0()); 
            // InternalInfluenceDSL.g:3681:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3682:4: RULE_ID
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__SourceArtifactAssignment_7"


    // $ANTLR start "rule__Influence__SourceArtifactAssignment_8_1"
    // InternalInfluenceDSL.g:3693:1: rule__Influence__SourceArtifactAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__SourceArtifactAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3697:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3698:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3698:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3699:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_8_1_0()); 
            // InternalInfluenceDSL.g:3700:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3701:4: RULE_ID
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__SourceArtifactAssignment_8_1"


    // $ANTLR start "rule__Influence__SourcePhenomenaAssignment_12"
    // InternalInfluenceDSL.g:3712:1: rule__Influence__SourcePhenomenaAssignment_12 : ( ( ruleEString ) ) ;
    public final void rule__Influence__SourcePhenomenaAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3716:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3717:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3717:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3718:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_12_0()); 
            // InternalInfluenceDSL.g:3719:3: ( ruleEString )
            // InternalInfluenceDSL.g:3720:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaEStringParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaEStringParserRuleCall_12_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__SourcePhenomenaAssignment_12"


    // $ANTLR start "rule__Influence__SourcePhenomenaAssignment_13_1"
    // InternalInfluenceDSL.g:3731:1: rule__Influence__SourcePhenomenaAssignment_13_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__SourcePhenomenaAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3735:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3736:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3736:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3737:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_13_1_0()); 
            // InternalInfluenceDSL.g:3738:3: ( ruleEString )
            // InternalInfluenceDSL.g:3739:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaEStringParserRuleCall_13_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaEStringParserRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__SourcePhenomenaAssignment_13_1"


    // $ANTLR start "rule__Influence__ProducesAssignment_15"
    // InternalInfluenceDSL.g:3750:1: rule__Influence__ProducesAssignment_15 : ( ruleEmergentBehavior ) ;
    public final void rule__Influence__ProducesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3754:1: ( ( ruleEmergentBehavior ) )
            // InternalInfluenceDSL.g:3755:2: ( ruleEmergentBehavior )
            {
            // InternalInfluenceDSL.g:3755:2: ( ruleEmergentBehavior )
            // InternalInfluenceDSL.g:3756:3: ruleEmergentBehavior
            {
             before(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleEmergentBehavior();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__ProducesAssignment_15"


    // $ANTLR start "rule__Influence__ProducesAssignment_16_1"
    // InternalInfluenceDSL.g:3765:1: rule__Influence__ProducesAssignment_16_1 : ( ruleEmergentBehavior ) ;
    public final void rule__Influence__ProducesAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3769:1: ( ( ruleEmergentBehavior ) )
            // InternalInfluenceDSL.g:3770:2: ( ruleEmergentBehavior )
            {
            // InternalInfluenceDSL.g:3770:2: ( ruleEmergentBehavior )
            // InternalInfluenceDSL.g:3771:3: ruleEmergentBehavior
            {
             before(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmergentBehavior();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getProducesEmergentBehaviorParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__ProducesAssignment_16_1"


    // $ANTLR start "rule__Influence__AffectsAssignment_19"
    // InternalInfluenceDSL.g:3780:1: rule__Influence__AffectsAssignment_19 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3784:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3785:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3785:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3786:3: ruleSystemResponse
            {
             before(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__AffectsAssignment_19"


    // $ANTLR start "rule__Influence__AffectsAssignment_20_1"
    // InternalInfluenceDSL.g:3795:1: rule__Influence__AffectsAssignment_20_1 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3799:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3800:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3800:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3801:3: ruleSystemResponse
            {
             before(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_20_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemResponse();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getAffectsSystemResponseParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__AffectsAssignment_20_1"


    // $ANTLR start "rule__Influence__EvaluatedByAssignment_24"
    // InternalInfluenceDSL.g:3810:1: rule__Influence__EvaluatedByAssignment_24 : ( ( ruleEString ) ) ;
    public final void rule__Influence__EvaluatedByAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3814:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3815:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3815:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3816:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_24_0()); 
            // InternalInfluenceDSL.g:3817:3: ( ruleEString )
            // InternalInfluenceDSL.g:3818:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionEStringParserRuleCall_24_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionEStringParserRuleCall_24_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__EvaluatedByAssignment_24"


    // $ANTLR start "rule__Influence__EvaluatedByAssignment_25_1"
    // InternalInfluenceDSL.g:3829:1: rule__Influence__EvaluatedByAssignment_25_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__EvaluatedByAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3833:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3834:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3834:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3835:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_25_1_0()); 
            // InternalInfluenceDSL.g:3836:3: ( ruleEString )
            // InternalInfluenceDSL.g:3837:4: ruleEString
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionEStringParserRuleCall_25_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionEStringParserRuleCall_25_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_25_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__EvaluatedByAssignment_25_1"


    // $ANTLR start "rule__Influence__TargetArtifactAssignment_32"
    // InternalInfluenceDSL.g:3848:1: rule__Influence__TargetArtifactAssignment_32 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Influence__TargetArtifactAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3852:1: ( ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:3853:2: ( ( ruleQualifiedName ) )
            {
            // InternalInfluenceDSL.g:3853:2: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:3854:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_32_0()); 
            // InternalInfluenceDSL.g:3855:3: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:3856:4: ruleQualifiedName
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactQualifiedNameParserRuleCall_32_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactQualifiedNameParserRuleCall_32_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__TargetArtifactAssignment_32"


    // $ANTLR start "rule__Influence__TargetArtifactAssignment_33_1"
    // InternalInfluenceDSL.g:3867:1: rule__Influence__TargetArtifactAssignment_33_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Influence__TargetArtifactAssignment_33_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3871:1: ( ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:3872:2: ( ( ruleQualifiedName ) )
            {
            // InternalInfluenceDSL.g:3872:2: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:3873:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_33_1_0()); 
            // InternalInfluenceDSL.g:3874:3: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:3875:4: ruleQualifiedName
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactQualifiedNameParserRuleCall_33_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactQualifiedNameParserRuleCall_33_1_0_1()); 

            }

             after(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_33_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Influence__TargetArtifactAssignment_33_1"


    // $ANTLR start "rule__RequirementSatisfaction__NameAssignment_2"
    // InternalInfluenceDSL.g:3886:1: rule__RequirementSatisfaction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3890:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3891:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3891:2: ( ruleEString )
            // InternalInfluenceDSL.g:3892:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__NameAssignment_2"


    // $ANTLR start "rule__RequirementSatisfaction__ConcerningRequirementAssignment_6"
    // InternalInfluenceDSL.g:3901:1: rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__ConcerningRequirementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3905:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3906:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3906:2: ( ruleEString )
            // InternalInfluenceDSL.g:3907:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__ConcerningRequirementAssignment_6"


    // $ANTLR start "rule__RequirementSatisfaction__SatisfactionAssignment_9"
    // InternalInfluenceDSL.g:3916:1: rule__RequirementSatisfaction__SatisfactionAssignment_9 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3920:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3921:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3921:2: ( ruleEString )
            // InternalInfluenceDSL.g:3922:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__SatisfactionAssignment_9"


    // $ANTLR start "rule__RequirementSatisfaction__SatisfactionAssignment_10_1"
    // InternalInfluenceDSL.g:3931:1: rule__RequirementSatisfaction__SatisfactionAssignment_10_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3935:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3936:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3936:2: ( ruleEString )
            // InternalInfluenceDSL.g:3937:3: ruleEString
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementSatisfaction__SatisfactionAssignment_10_1"


    // $ANTLR start "rule__Artifact__NameAssignment_2"
    // InternalInfluenceDSL.g:3946:1: rule__Artifact__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Artifact__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3950:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3951:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3951:2: ( ruleEString )
            // InternalInfluenceDSL.g:3952:3: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__NameAssignment_2"


    // $ANTLR start "rule__Artifact__RefAssignment_4"
    // InternalInfluenceDSL.g:3961:1: rule__Artifact__RefAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Artifact__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3965:1: ( ( ( ruleQualifiedName ) ) )
            // InternalInfluenceDSL.g:3966:2: ( ( ruleQualifiedName ) )
            {
            // InternalInfluenceDSL.g:3966:2: ( ( ruleQualifiedName ) )
            // InternalInfluenceDSL.g:3967:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getArtifactAccess().getRefEObjectCrossReference_4_0()); 
            // InternalInfluenceDSL.g:3968:3: ( ruleQualifiedName )
            // InternalInfluenceDSL.g:3969:4: ruleQualifiedName
            {
             before(grammarAccess.getArtifactAccess().getRefEObjectQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getRefEObjectQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArtifactAccess().getRefEObjectCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__RefAssignment_4"


    // $ANTLR start "rule__SystemResponse__ObservationAssignment_3_2"
    // InternalInfluenceDSL.g:3980:1: rule__SystemResponse__ObservationAssignment_3_2 : ( ruleEString ) ;
    public final void rule__SystemResponse__ObservationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3984:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3985:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3985:2: ( ruleEString )
            // InternalInfluenceDSL.g:3986:3: ruleEString
            {
             before(grammarAccess.getSystemResponseAccess().getObservationEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemResponseAccess().getObservationEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemResponse__ObservationAssignment_3_2"


    // $ANTLR start "rule__EmergentBehavior__DescriptionAssignment_3_2"
    // InternalInfluenceDSL.g:3995:1: rule__EmergentBehavior__DescriptionAssignment_3_2 : ( ruleEString ) ;
    public final void rule__EmergentBehavior__DescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3999:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:4000:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:4000:2: ( ruleEString )
            // InternalInfluenceDSL.g:4001:3: ruleEString
            {
             before(grammarAccess.getEmergentBehaviorAccess().getDescriptionEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmergentBehaviorAccess().getDescriptionEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergentBehavior__DescriptionAssignment_3_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010800031000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010800031002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000002L});

}