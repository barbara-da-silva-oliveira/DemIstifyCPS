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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InfluenceModel'", "'CompositeCyberPhysicalPhenomenon'", "'definedBy'", "','", "'configuration'", "'AtomicPhenomenon'", "'#**'", "'**#'", "'Influence'", "'from'", "'and'", "'phenomena'", "'emerges'", "'that'", "'implies'", "'which'", "'may'", "'violate'", "'it'", "'can'", "'be'", "'compensated'", "'by'", "'modifying'", "'Requirement'", "'Satisfaction'", "':'", "'satisfied'", "'when'", "'Artifact'", "'->'", "'system'", "'response'", "'resulting'", "'in'", "'Emergent'", "'Behavior'", "'characterized'"
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


    // $ANTLR start "rule__InfluenceModel__Alternatives_3"
    // InternalInfluenceDSL.g:302:1: rule__InfluenceModel__Alternatives_3 : ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) );
    public final void rule__InfluenceModel__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:306:1: ( ( ( rule__InfluenceModel__OwnedArtifactsAssignment_3_0 ) ) | ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) ) | ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) ) | ( ( rule__InfluenceModel__OwnedInfluencesAssignment_3_3 ) ) )
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
                    // InternalInfluenceDSL.g:313:2: ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) )
                    {
                    // InternalInfluenceDSL.g:313:2: ( ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 ) )
                    // InternalInfluenceDSL.g:314:3: ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedRequirementSatisfactionAssignment_3_1()); 
                    // InternalInfluenceDSL.g:315:3: ( rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 )
                    // InternalInfluenceDSL.g:315:4: rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1
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
                    // InternalInfluenceDSL.g:319:2: ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) )
                    {
                    // InternalInfluenceDSL.g:319:2: ( ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 ) )
                    // InternalInfluenceDSL.g:320:3: ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 )
                    {
                     before(grammarAccess.getInfluenceModelAccess().getOwnedCyberPhysicalPhenomenaAssignment_3_2()); 
                    // InternalInfluenceDSL.g:321:3: ( rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 )
                    // InternalInfluenceDSL.g:321:4: rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2
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


    // $ANTLR start "rule__CyberPhysicalPhenomena__Alternatives"
    // InternalInfluenceDSL.g:335:1: rule__CyberPhysicalPhenomena__Alternatives : ( ( ruleMultiPhenomenon ) | ( ruleSimplePhenomenon ) );
    public final void rule__CyberPhysicalPhenomena__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:339:1: ( ( ruleMultiPhenomenon ) | ( ruleSimplePhenomenon ) )
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
                    // InternalInfluenceDSL.g:340:2: ( ruleMultiPhenomenon )
                    {
                    // InternalInfluenceDSL.g:340:2: ( ruleMultiPhenomenon )
                    // InternalInfluenceDSL.g:341:3: ruleMultiPhenomenon
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
                    // InternalInfluenceDSL.g:346:2: ( ruleSimplePhenomenon )
                    {
                    // InternalInfluenceDSL.g:346:2: ( ruleSimplePhenomenon )
                    // InternalInfluenceDSL.g:347:3: ruleSimplePhenomenon
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
    // InternalInfluenceDSL.g:356:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:360:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalInfluenceDSL.g:361:2: ( RULE_STRING )
                    {
                    // InternalInfluenceDSL.g:361:2: ( RULE_STRING )
                    // InternalInfluenceDSL.g:362:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfluenceDSL.g:367:2: ( RULE_ID )
                    {
                    // InternalInfluenceDSL.g:367:2: ( RULE_ID )
                    // InternalInfluenceDSL.g:368:3: RULE_ID
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
    // InternalInfluenceDSL.g:377:1: rule__InfluenceModel__Group__0 : rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 ;
    public final void rule__InfluenceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:381:1: ( rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1 )
            // InternalInfluenceDSL.g:382:2: rule__InfluenceModel__Group__0__Impl rule__InfluenceModel__Group__1
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
    // InternalInfluenceDSL.g:389:1: rule__InfluenceModel__Group__0__Impl : ( () ) ;
    public final void rule__InfluenceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:393:1: ( ( () ) )
            // InternalInfluenceDSL.g:394:1: ( () )
            {
            // InternalInfluenceDSL.g:394:1: ( () )
            // InternalInfluenceDSL.g:395:2: ()
            {
             before(grammarAccess.getInfluenceModelAccess().getInfluenceModelAction_0()); 
            // InternalInfluenceDSL.g:396:2: ()
            // InternalInfluenceDSL.g:396:3: 
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
    // InternalInfluenceDSL.g:404:1: rule__InfluenceModel__Group__1 : rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 ;
    public final void rule__InfluenceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:408:1: ( rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2 )
            // InternalInfluenceDSL.g:409:2: rule__InfluenceModel__Group__1__Impl rule__InfluenceModel__Group__2
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
    // InternalInfluenceDSL.g:416:1: rule__InfluenceModel__Group__1__Impl : ( 'InfluenceModel' ) ;
    public final void rule__InfluenceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:420:1: ( ( 'InfluenceModel' ) )
            // InternalInfluenceDSL.g:421:1: ( 'InfluenceModel' )
            {
            // InternalInfluenceDSL.g:421:1: ( 'InfluenceModel' )
            // InternalInfluenceDSL.g:422:2: 'InfluenceModel'
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
    // InternalInfluenceDSL.g:431:1: rule__InfluenceModel__Group__2 : rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 ;
    public final void rule__InfluenceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:435:1: ( rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3 )
            // InternalInfluenceDSL.g:436:2: rule__InfluenceModel__Group__2__Impl rule__InfluenceModel__Group__3
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
    // InternalInfluenceDSL.g:443:1: rule__InfluenceModel__Group__2__Impl : ( ( rule__InfluenceModel__NameAssignment_2 ) ) ;
    public final void rule__InfluenceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:447:1: ( ( ( rule__InfluenceModel__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:448:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:448:1: ( ( rule__InfluenceModel__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:449:2: ( rule__InfluenceModel__NameAssignment_2 )
            {
             before(grammarAccess.getInfluenceModelAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:450:2: ( rule__InfluenceModel__NameAssignment_2 )
            // InternalInfluenceDSL.g:450:3: rule__InfluenceModel__NameAssignment_2
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
    // InternalInfluenceDSL.g:458:1: rule__InfluenceModel__Group__3 : rule__InfluenceModel__Group__3__Impl ;
    public final void rule__InfluenceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:462:1: ( rule__InfluenceModel__Group__3__Impl )
            // InternalInfluenceDSL.g:463:2: rule__InfluenceModel__Group__3__Impl
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
    // InternalInfluenceDSL.g:469:1: rule__InfluenceModel__Group__3__Impl : ( ( rule__InfluenceModel__Alternatives_3 )* ) ;
    public final void rule__InfluenceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:473:1: ( ( ( rule__InfluenceModel__Alternatives_3 )* ) )
            // InternalInfluenceDSL.g:474:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            {
            // InternalInfluenceDSL.g:474:1: ( ( rule__InfluenceModel__Alternatives_3 )* )
            // InternalInfluenceDSL.g:475:2: ( rule__InfluenceModel__Alternatives_3 )*
            {
             before(grammarAccess.getInfluenceModelAccess().getAlternatives_3()); 
            // InternalInfluenceDSL.g:476:2: ( rule__InfluenceModel__Alternatives_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||(LA4_0>=16 && LA4_0<=17)||LA4_0==35||LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalInfluenceDSL.g:476:3: rule__InfluenceModel__Alternatives_3
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
    // InternalInfluenceDSL.g:485:1: rule__MultiPhenomenon__Group__0 : rule__MultiPhenomenon__Group__0__Impl rule__MultiPhenomenon__Group__1 ;
    public final void rule__MultiPhenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:489:1: ( rule__MultiPhenomenon__Group__0__Impl rule__MultiPhenomenon__Group__1 )
            // InternalInfluenceDSL.g:490:2: rule__MultiPhenomenon__Group__0__Impl rule__MultiPhenomenon__Group__1
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
    // InternalInfluenceDSL.g:497:1: rule__MultiPhenomenon__Group__0__Impl : ( () ) ;
    public final void rule__MultiPhenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:501:1: ( ( () ) )
            // InternalInfluenceDSL.g:502:1: ( () )
            {
            // InternalInfluenceDSL.g:502:1: ( () )
            // InternalInfluenceDSL.g:503:2: ()
            {
             before(grammarAccess.getMultiPhenomenonAccess().getMultiPhenomenonAction_0()); 
            // InternalInfluenceDSL.g:504:2: ()
            // InternalInfluenceDSL.g:504:3: 
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
    // InternalInfluenceDSL.g:512:1: rule__MultiPhenomenon__Group__1 : rule__MultiPhenomenon__Group__1__Impl rule__MultiPhenomenon__Group__2 ;
    public final void rule__MultiPhenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:516:1: ( rule__MultiPhenomenon__Group__1__Impl rule__MultiPhenomenon__Group__2 )
            // InternalInfluenceDSL.g:517:2: rule__MultiPhenomenon__Group__1__Impl rule__MultiPhenomenon__Group__2
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
    // InternalInfluenceDSL.g:524:1: rule__MultiPhenomenon__Group__1__Impl : ( 'CompositeCyberPhysicalPhenomenon' ) ;
    public final void rule__MultiPhenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:528:1: ( ( 'CompositeCyberPhysicalPhenomenon' ) )
            // InternalInfluenceDSL.g:529:1: ( 'CompositeCyberPhysicalPhenomenon' )
            {
            // InternalInfluenceDSL.g:529:1: ( 'CompositeCyberPhysicalPhenomenon' )
            // InternalInfluenceDSL.g:530:2: 'CompositeCyberPhysicalPhenomenon'
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
    // InternalInfluenceDSL.g:539:1: rule__MultiPhenomenon__Group__2 : rule__MultiPhenomenon__Group__2__Impl rule__MultiPhenomenon__Group__3 ;
    public final void rule__MultiPhenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:543:1: ( rule__MultiPhenomenon__Group__2__Impl rule__MultiPhenomenon__Group__3 )
            // InternalInfluenceDSL.g:544:2: rule__MultiPhenomenon__Group__2__Impl rule__MultiPhenomenon__Group__3
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
    // InternalInfluenceDSL.g:551:1: rule__MultiPhenomenon__Group__2__Impl : ( ( rule__MultiPhenomenon__NameAssignment_2 ) ) ;
    public final void rule__MultiPhenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:555:1: ( ( ( rule__MultiPhenomenon__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:556:1: ( ( rule__MultiPhenomenon__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:556:1: ( ( rule__MultiPhenomenon__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:557:2: ( rule__MultiPhenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:558:2: ( rule__MultiPhenomenon__NameAssignment_2 )
            // InternalInfluenceDSL.g:558:3: rule__MultiPhenomenon__NameAssignment_2
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
    // InternalInfluenceDSL.g:566:1: rule__MultiPhenomenon__Group__3 : rule__MultiPhenomenon__Group__3__Impl rule__MultiPhenomenon__Group__4 ;
    public final void rule__MultiPhenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:570:1: ( rule__MultiPhenomenon__Group__3__Impl rule__MultiPhenomenon__Group__4 )
            // InternalInfluenceDSL.g:571:2: rule__MultiPhenomenon__Group__3__Impl rule__MultiPhenomenon__Group__4
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
    // InternalInfluenceDSL.g:578:1: rule__MultiPhenomenon__Group__3__Impl : ( ( rule__MultiPhenomenon__Group_3__0 )? ) ;
    public final void rule__MultiPhenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:582:1: ( ( ( rule__MultiPhenomenon__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:583:1: ( ( rule__MultiPhenomenon__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:583:1: ( ( rule__MultiPhenomenon__Group_3__0 )? )
            // InternalInfluenceDSL.g:584:2: ( rule__MultiPhenomenon__Group_3__0 )?
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:585:2: ( rule__MultiPhenomenon__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInfluenceDSL.g:585:3: rule__MultiPhenomenon__Group_3__0
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
    // InternalInfluenceDSL.g:593:1: rule__MultiPhenomenon__Group__4 : rule__MultiPhenomenon__Group__4__Impl ;
    public final void rule__MultiPhenomenon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:597:1: ( rule__MultiPhenomenon__Group__4__Impl )
            // InternalInfluenceDSL.g:598:2: rule__MultiPhenomenon__Group__4__Impl
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
    // InternalInfluenceDSL.g:604:1: rule__MultiPhenomenon__Group__4__Impl : ( ( rule__MultiPhenomenon__Group_4__0 )? ) ;
    public final void rule__MultiPhenomenon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:608:1: ( ( ( rule__MultiPhenomenon__Group_4__0 )? ) )
            // InternalInfluenceDSL.g:609:1: ( ( rule__MultiPhenomenon__Group_4__0 )? )
            {
            // InternalInfluenceDSL.g:609:1: ( ( rule__MultiPhenomenon__Group_4__0 )? )
            // InternalInfluenceDSL.g:610:2: ( rule__MultiPhenomenon__Group_4__0 )?
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_4()); 
            // InternalInfluenceDSL.g:611:2: ( rule__MultiPhenomenon__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInfluenceDSL.g:611:3: rule__MultiPhenomenon__Group_4__0
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
    // InternalInfluenceDSL.g:620:1: rule__MultiPhenomenon__Group_3__0 : rule__MultiPhenomenon__Group_3__0__Impl rule__MultiPhenomenon__Group_3__1 ;
    public final void rule__MultiPhenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:624:1: ( rule__MultiPhenomenon__Group_3__0__Impl rule__MultiPhenomenon__Group_3__1 )
            // InternalInfluenceDSL.g:625:2: rule__MultiPhenomenon__Group_3__0__Impl rule__MultiPhenomenon__Group_3__1
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
    // InternalInfluenceDSL.g:632:1: rule__MultiPhenomenon__Group_3__0__Impl : ( 'definedBy' ) ;
    public final void rule__MultiPhenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:636:1: ( ( 'definedBy' ) )
            // InternalInfluenceDSL.g:637:1: ( 'definedBy' )
            {
            // InternalInfluenceDSL.g:637:1: ( 'definedBy' )
            // InternalInfluenceDSL.g:638:2: 'definedBy'
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
    // InternalInfluenceDSL.g:647:1: rule__MultiPhenomenon__Group_3__1 : rule__MultiPhenomenon__Group_3__1__Impl rule__MultiPhenomenon__Group_3__2 ;
    public final void rule__MultiPhenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:651:1: ( rule__MultiPhenomenon__Group_3__1__Impl rule__MultiPhenomenon__Group_3__2 )
            // InternalInfluenceDSL.g:652:2: rule__MultiPhenomenon__Group_3__1__Impl rule__MultiPhenomenon__Group_3__2
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
    // InternalInfluenceDSL.g:659:1: rule__MultiPhenomenon__Group_3__1__Impl : ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:663:1: ( ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) ) )
            // InternalInfluenceDSL.g:664:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) )
            {
            // InternalInfluenceDSL.g:664:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 ) )
            // InternalInfluenceDSL.g:665:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfAssignment_3_1()); 
            // InternalInfluenceDSL.g:666:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_1 )
            // InternalInfluenceDSL.g:666:3: rule__MultiPhenomenon__AggregationOfAssignment_3_1
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
    // InternalInfluenceDSL.g:674:1: rule__MultiPhenomenon__Group_3__2 : rule__MultiPhenomenon__Group_3__2__Impl ;
    public final void rule__MultiPhenomenon__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:678:1: ( rule__MultiPhenomenon__Group_3__2__Impl )
            // InternalInfluenceDSL.g:679:2: rule__MultiPhenomenon__Group_3__2__Impl
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
    // InternalInfluenceDSL.g:685:1: rule__MultiPhenomenon__Group_3__2__Impl : ( ( rule__MultiPhenomenon__Group_3_2__0 )* ) ;
    public final void rule__MultiPhenomenon__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:689:1: ( ( ( rule__MultiPhenomenon__Group_3_2__0 )* ) )
            // InternalInfluenceDSL.g:690:1: ( ( rule__MultiPhenomenon__Group_3_2__0 )* )
            {
            // InternalInfluenceDSL.g:690:1: ( ( rule__MultiPhenomenon__Group_3_2__0 )* )
            // InternalInfluenceDSL.g:691:2: ( rule__MultiPhenomenon__Group_3_2__0 )*
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_3_2()); 
            // InternalInfluenceDSL.g:692:2: ( rule__MultiPhenomenon__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInfluenceDSL.g:692:3: rule__MultiPhenomenon__Group_3_2__0
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
    // InternalInfluenceDSL.g:701:1: rule__MultiPhenomenon__Group_3_2__0 : rule__MultiPhenomenon__Group_3_2__0__Impl rule__MultiPhenomenon__Group_3_2__1 ;
    public final void rule__MultiPhenomenon__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:705:1: ( rule__MultiPhenomenon__Group_3_2__0__Impl rule__MultiPhenomenon__Group_3_2__1 )
            // InternalInfluenceDSL.g:706:2: rule__MultiPhenomenon__Group_3_2__0__Impl rule__MultiPhenomenon__Group_3_2__1
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
    // InternalInfluenceDSL.g:713:1: rule__MultiPhenomenon__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MultiPhenomenon__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:717:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:718:1: ( ',' )
            {
            // InternalInfluenceDSL.g:718:1: ( ',' )
            // InternalInfluenceDSL.g:719:2: ','
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
    // InternalInfluenceDSL.g:728:1: rule__MultiPhenomenon__Group_3_2__1 : rule__MultiPhenomenon__Group_3_2__1__Impl ;
    public final void rule__MultiPhenomenon__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:732:1: ( rule__MultiPhenomenon__Group_3_2__1__Impl )
            // InternalInfluenceDSL.g:733:2: rule__MultiPhenomenon__Group_3_2__1__Impl
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
    // InternalInfluenceDSL.g:739:1: rule__MultiPhenomenon__Group_3_2__1__Impl : ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:743:1: ( ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) ) )
            // InternalInfluenceDSL.g:744:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) )
            {
            // InternalInfluenceDSL.g:744:1: ( ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 ) )
            // InternalInfluenceDSL.g:745:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfAssignment_3_2_1()); 
            // InternalInfluenceDSL.g:746:2: ( rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 )
            // InternalInfluenceDSL.g:746:3: rule__MultiPhenomenon__AggregationOfAssignment_3_2_1
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
    // InternalInfluenceDSL.g:755:1: rule__MultiPhenomenon__Group_4__0 : rule__MultiPhenomenon__Group_4__0__Impl rule__MultiPhenomenon__Group_4__1 ;
    public final void rule__MultiPhenomenon__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:759:1: ( rule__MultiPhenomenon__Group_4__0__Impl rule__MultiPhenomenon__Group_4__1 )
            // InternalInfluenceDSL.g:760:2: rule__MultiPhenomenon__Group_4__0__Impl rule__MultiPhenomenon__Group_4__1
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
    // InternalInfluenceDSL.g:767:1: rule__MultiPhenomenon__Group_4__0__Impl : ( 'configuration' ) ;
    public final void rule__MultiPhenomenon__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:771:1: ( ( 'configuration' ) )
            // InternalInfluenceDSL.g:772:1: ( 'configuration' )
            {
            // InternalInfluenceDSL.g:772:1: ( 'configuration' )
            // InternalInfluenceDSL.g:773:2: 'configuration'
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
    // InternalInfluenceDSL.g:782:1: rule__MultiPhenomenon__Group_4__1 : rule__MultiPhenomenon__Group_4__1__Impl rule__MultiPhenomenon__Group_4__2 ;
    public final void rule__MultiPhenomenon__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:786:1: ( rule__MultiPhenomenon__Group_4__1__Impl rule__MultiPhenomenon__Group_4__2 )
            // InternalInfluenceDSL.g:787:2: rule__MultiPhenomenon__Group_4__1__Impl rule__MultiPhenomenon__Group_4__2
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
    // InternalInfluenceDSL.g:794:1: rule__MultiPhenomenon__Group_4__1__Impl : ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:798:1: ( ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) ) )
            // InternalInfluenceDSL.g:799:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) )
            {
            // InternalInfluenceDSL.g:799:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 ) )
            // InternalInfluenceDSL.g:800:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationAssignment_4_1()); 
            // InternalInfluenceDSL.g:801:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_1 )
            // InternalInfluenceDSL.g:801:3: rule__MultiPhenomenon__ConfigurationAssignment_4_1
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
    // InternalInfluenceDSL.g:809:1: rule__MultiPhenomenon__Group_4__2 : rule__MultiPhenomenon__Group_4__2__Impl ;
    public final void rule__MultiPhenomenon__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:813:1: ( rule__MultiPhenomenon__Group_4__2__Impl )
            // InternalInfluenceDSL.g:814:2: rule__MultiPhenomenon__Group_4__2__Impl
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
    // InternalInfluenceDSL.g:820:1: rule__MultiPhenomenon__Group_4__2__Impl : ( ( rule__MultiPhenomenon__Group_4_2__0 )* ) ;
    public final void rule__MultiPhenomenon__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:824:1: ( ( ( rule__MultiPhenomenon__Group_4_2__0 )* ) )
            // InternalInfluenceDSL.g:825:1: ( ( rule__MultiPhenomenon__Group_4_2__0 )* )
            {
            // InternalInfluenceDSL.g:825:1: ( ( rule__MultiPhenomenon__Group_4_2__0 )* )
            // InternalInfluenceDSL.g:826:2: ( rule__MultiPhenomenon__Group_4_2__0 )*
            {
             before(grammarAccess.getMultiPhenomenonAccess().getGroup_4_2()); 
            // InternalInfluenceDSL.g:827:2: ( rule__MultiPhenomenon__Group_4_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalInfluenceDSL.g:827:3: rule__MultiPhenomenon__Group_4_2__0
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
    // InternalInfluenceDSL.g:836:1: rule__MultiPhenomenon__Group_4_2__0 : rule__MultiPhenomenon__Group_4_2__0__Impl rule__MultiPhenomenon__Group_4_2__1 ;
    public final void rule__MultiPhenomenon__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:840:1: ( rule__MultiPhenomenon__Group_4_2__0__Impl rule__MultiPhenomenon__Group_4_2__1 )
            // InternalInfluenceDSL.g:841:2: rule__MultiPhenomenon__Group_4_2__0__Impl rule__MultiPhenomenon__Group_4_2__1
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
    // InternalInfluenceDSL.g:848:1: rule__MultiPhenomenon__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__MultiPhenomenon__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:852:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:853:1: ( ',' )
            {
            // InternalInfluenceDSL.g:853:1: ( ',' )
            // InternalInfluenceDSL.g:854:2: ','
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
    // InternalInfluenceDSL.g:863:1: rule__MultiPhenomenon__Group_4_2__1 : rule__MultiPhenomenon__Group_4_2__1__Impl ;
    public final void rule__MultiPhenomenon__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:867:1: ( rule__MultiPhenomenon__Group_4_2__1__Impl )
            // InternalInfluenceDSL.g:868:2: rule__MultiPhenomenon__Group_4_2__1__Impl
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
    // InternalInfluenceDSL.g:874:1: rule__MultiPhenomenon__Group_4_2__1__Impl : ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) ) ;
    public final void rule__MultiPhenomenon__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:878:1: ( ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) ) )
            // InternalInfluenceDSL.g:879:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) )
            {
            // InternalInfluenceDSL.g:879:1: ( ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 ) )
            // InternalInfluenceDSL.g:880:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getConfigurationAssignment_4_2_1()); 
            // InternalInfluenceDSL.g:881:2: ( rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 )
            // InternalInfluenceDSL.g:881:3: rule__MultiPhenomenon__ConfigurationAssignment_4_2_1
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
    // InternalInfluenceDSL.g:890:1: rule__SimplePhenomenon__Group__0 : rule__SimplePhenomenon__Group__0__Impl rule__SimplePhenomenon__Group__1 ;
    public final void rule__SimplePhenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:894:1: ( rule__SimplePhenomenon__Group__0__Impl rule__SimplePhenomenon__Group__1 )
            // InternalInfluenceDSL.g:895:2: rule__SimplePhenomenon__Group__0__Impl rule__SimplePhenomenon__Group__1
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
    // InternalInfluenceDSL.g:902:1: rule__SimplePhenomenon__Group__0__Impl : ( () ) ;
    public final void rule__SimplePhenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:906:1: ( ( () ) )
            // InternalInfluenceDSL.g:907:1: ( () )
            {
            // InternalInfluenceDSL.g:907:1: ( () )
            // InternalInfluenceDSL.g:908:2: ()
            {
             before(grammarAccess.getSimplePhenomenonAccess().getSimplePhenomenonAction_0()); 
            // InternalInfluenceDSL.g:909:2: ()
            // InternalInfluenceDSL.g:909:3: 
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
    // InternalInfluenceDSL.g:917:1: rule__SimplePhenomenon__Group__1 : rule__SimplePhenomenon__Group__1__Impl rule__SimplePhenomenon__Group__2 ;
    public final void rule__SimplePhenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:921:1: ( rule__SimplePhenomenon__Group__1__Impl rule__SimplePhenomenon__Group__2 )
            // InternalInfluenceDSL.g:922:2: rule__SimplePhenomenon__Group__1__Impl rule__SimplePhenomenon__Group__2
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
    // InternalInfluenceDSL.g:929:1: rule__SimplePhenomenon__Group__1__Impl : ( 'AtomicPhenomenon' ) ;
    public final void rule__SimplePhenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:933:1: ( ( 'AtomicPhenomenon' ) )
            // InternalInfluenceDSL.g:934:1: ( 'AtomicPhenomenon' )
            {
            // InternalInfluenceDSL.g:934:1: ( 'AtomicPhenomenon' )
            // InternalInfluenceDSL.g:935:2: 'AtomicPhenomenon'
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
    // InternalInfluenceDSL.g:944:1: rule__SimplePhenomenon__Group__2 : rule__SimplePhenomenon__Group__2__Impl rule__SimplePhenomenon__Group__3 ;
    public final void rule__SimplePhenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:948:1: ( rule__SimplePhenomenon__Group__2__Impl rule__SimplePhenomenon__Group__3 )
            // InternalInfluenceDSL.g:949:2: rule__SimplePhenomenon__Group__2__Impl rule__SimplePhenomenon__Group__3
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
    // InternalInfluenceDSL.g:956:1: rule__SimplePhenomenon__Group__2__Impl : ( ( rule__SimplePhenomenon__NameAssignment_2 ) ) ;
    public final void rule__SimplePhenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:960:1: ( ( ( rule__SimplePhenomenon__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:961:1: ( ( rule__SimplePhenomenon__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:961:1: ( ( rule__SimplePhenomenon__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:962:2: ( rule__SimplePhenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:963:2: ( rule__SimplePhenomenon__NameAssignment_2 )
            // InternalInfluenceDSL.g:963:3: rule__SimplePhenomenon__NameAssignment_2
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
    // InternalInfluenceDSL.g:971:1: rule__SimplePhenomenon__Group__3 : rule__SimplePhenomenon__Group__3__Impl ;
    public final void rule__SimplePhenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:975:1: ( rule__SimplePhenomenon__Group__3__Impl )
            // InternalInfluenceDSL.g:976:2: rule__SimplePhenomenon__Group__3__Impl
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
    // InternalInfluenceDSL.g:982:1: rule__SimplePhenomenon__Group__3__Impl : ( ( rule__SimplePhenomenon__Group_3__0 )? ) ;
    public final void rule__SimplePhenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:986:1: ( ( ( rule__SimplePhenomenon__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:987:1: ( ( rule__SimplePhenomenon__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:987:1: ( ( rule__SimplePhenomenon__Group_3__0 )? )
            // InternalInfluenceDSL.g:988:2: ( rule__SimplePhenomenon__Group_3__0 )?
            {
             before(grammarAccess.getSimplePhenomenonAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:989:2: ( rule__SimplePhenomenon__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInfluenceDSL.g:989:3: rule__SimplePhenomenon__Group_3__0
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
    // InternalInfluenceDSL.g:998:1: rule__SimplePhenomenon__Group_3__0 : rule__SimplePhenomenon__Group_3__0__Impl rule__SimplePhenomenon__Group_3__1 ;
    public final void rule__SimplePhenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1002:1: ( rule__SimplePhenomenon__Group_3__0__Impl rule__SimplePhenomenon__Group_3__1 )
            // InternalInfluenceDSL.g:1003:2: rule__SimplePhenomenon__Group_3__0__Impl rule__SimplePhenomenon__Group_3__1
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
    // InternalInfluenceDSL.g:1010:1: rule__SimplePhenomenon__Group_3__0__Impl : ( 'configuration' ) ;
    public final void rule__SimplePhenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1014:1: ( ( 'configuration' ) )
            // InternalInfluenceDSL.g:1015:1: ( 'configuration' )
            {
            // InternalInfluenceDSL.g:1015:1: ( 'configuration' )
            // InternalInfluenceDSL.g:1016:2: 'configuration'
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
    // InternalInfluenceDSL.g:1025:1: rule__SimplePhenomenon__Group_3__1 : rule__SimplePhenomenon__Group_3__1__Impl rule__SimplePhenomenon__Group_3__2 ;
    public final void rule__SimplePhenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1029:1: ( rule__SimplePhenomenon__Group_3__1__Impl rule__SimplePhenomenon__Group_3__2 )
            // InternalInfluenceDSL.g:1030:2: rule__SimplePhenomenon__Group_3__1__Impl rule__SimplePhenomenon__Group_3__2
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
    // InternalInfluenceDSL.g:1037:1: rule__SimplePhenomenon__Group_3__1__Impl : ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) ) ;
    public final void rule__SimplePhenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1041:1: ( ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) ) )
            // InternalInfluenceDSL.g:1042:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) )
            {
            // InternalInfluenceDSL.g:1042:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 ) )
            // InternalInfluenceDSL.g:1043:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationAssignment_3_1()); 
            // InternalInfluenceDSL.g:1044:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_1 )
            // InternalInfluenceDSL.g:1044:3: rule__SimplePhenomenon__ConfigurationAssignment_3_1
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
    // InternalInfluenceDSL.g:1052:1: rule__SimplePhenomenon__Group_3__2 : rule__SimplePhenomenon__Group_3__2__Impl ;
    public final void rule__SimplePhenomenon__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1056:1: ( rule__SimplePhenomenon__Group_3__2__Impl )
            // InternalInfluenceDSL.g:1057:2: rule__SimplePhenomenon__Group_3__2__Impl
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
    // InternalInfluenceDSL.g:1063:1: rule__SimplePhenomenon__Group_3__2__Impl : ( ( rule__SimplePhenomenon__Group_3_2__0 )* ) ;
    public final void rule__SimplePhenomenon__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1067:1: ( ( ( rule__SimplePhenomenon__Group_3_2__0 )* ) )
            // InternalInfluenceDSL.g:1068:1: ( ( rule__SimplePhenomenon__Group_3_2__0 )* )
            {
            // InternalInfluenceDSL.g:1068:1: ( ( rule__SimplePhenomenon__Group_3_2__0 )* )
            // InternalInfluenceDSL.g:1069:2: ( rule__SimplePhenomenon__Group_3_2__0 )*
            {
             before(grammarAccess.getSimplePhenomenonAccess().getGroup_3_2()); 
            // InternalInfluenceDSL.g:1070:2: ( rule__SimplePhenomenon__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1070:3: rule__SimplePhenomenon__Group_3_2__0
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
    // InternalInfluenceDSL.g:1079:1: rule__SimplePhenomenon__Group_3_2__0 : rule__SimplePhenomenon__Group_3_2__0__Impl rule__SimplePhenomenon__Group_3_2__1 ;
    public final void rule__SimplePhenomenon__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1083:1: ( rule__SimplePhenomenon__Group_3_2__0__Impl rule__SimplePhenomenon__Group_3_2__1 )
            // InternalInfluenceDSL.g:1084:2: rule__SimplePhenomenon__Group_3_2__0__Impl rule__SimplePhenomenon__Group_3_2__1
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
    // InternalInfluenceDSL.g:1091:1: rule__SimplePhenomenon__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SimplePhenomenon__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1095:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:1096:1: ( ',' )
            {
            // InternalInfluenceDSL.g:1096:1: ( ',' )
            // InternalInfluenceDSL.g:1097:2: ','
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
    // InternalInfluenceDSL.g:1106:1: rule__SimplePhenomenon__Group_3_2__1 : rule__SimplePhenomenon__Group_3_2__1__Impl ;
    public final void rule__SimplePhenomenon__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1110:1: ( rule__SimplePhenomenon__Group_3_2__1__Impl )
            // InternalInfluenceDSL.g:1111:2: rule__SimplePhenomenon__Group_3_2__1__Impl
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
    // InternalInfluenceDSL.g:1117:1: rule__SimplePhenomenon__Group_3_2__1__Impl : ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) ) ;
    public final void rule__SimplePhenomenon__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1121:1: ( ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) ) )
            // InternalInfluenceDSL.g:1122:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) )
            {
            // InternalInfluenceDSL.g:1122:1: ( ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 ) )
            // InternalInfluenceDSL.g:1123:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 )
            {
             before(grammarAccess.getSimplePhenomenonAccess().getConfigurationAssignment_3_2_1()); 
            // InternalInfluenceDSL.g:1124:2: ( rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 )
            // InternalInfluenceDSL.g:1124:3: rule__SimplePhenomenon__ConfigurationAssignment_3_2_1
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
    // InternalInfluenceDSL.g:1133:1: rule__Influence__Group__0 : rule__Influence__Group__0__Impl rule__Influence__Group__1 ;
    public final void rule__Influence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1137:1: ( rule__Influence__Group__0__Impl rule__Influence__Group__1 )
            // InternalInfluenceDSL.g:1138:2: rule__Influence__Group__0__Impl rule__Influence__Group__1
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
    // InternalInfluenceDSL.g:1145:1: rule__Influence__Group__0__Impl : ( '#**' ) ;
    public final void rule__Influence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1149:1: ( ( '#**' ) )
            // InternalInfluenceDSL.g:1150:1: ( '#**' )
            {
            // InternalInfluenceDSL.g:1150:1: ( '#**' )
            // InternalInfluenceDSL.g:1151:2: '#**'
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
    // InternalInfluenceDSL.g:1160:1: rule__Influence__Group__1 : rule__Influence__Group__1__Impl rule__Influence__Group__2 ;
    public final void rule__Influence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1164:1: ( rule__Influence__Group__1__Impl rule__Influence__Group__2 )
            // InternalInfluenceDSL.g:1165:2: rule__Influence__Group__1__Impl rule__Influence__Group__2
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
    // InternalInfluenceDSL.g:1172:1: rule__Influence__Group__1__Impl : ( ( rule__Influence__DescriptionAssignment_1 ) ) ;
    public final void rule__Influence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1176:1: ( ( ( rule__Influence__DescriptionAssignment_1 ) ) )
            // InternalInfluenceDSL.g:1177:1: ( ( rule__Influence__DescriptionAssignment_1 ) )
            {
            // InternalInfluenceDSL.g:1177:1: ( ( rule__Influence__DescriptionAssignment_1 ) )
            // InternalInfluenceDSL.g:1178:2: ( rule__Influence__DescriptionAssignment_1 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_1()); 
            // InternalInfluenceDSL.g:1179:2: ( rule__Influence__DescriptionAssignment_1 )
            // InternalInfluenceDSL.g:1179:3: rule__Influence__DescriptionAssignment_1
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
    // InternalInfluenceDSL.g:1187:1: rule__Influence__Group__2 : rule__Influence__Group__2__Impl rule__Influence__Group__3 ;
    public final void rule__Influence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1191:1: ( rule__Influence__Group__2__Impl rule__Influence__Group__3 )
            // InternalInfluenceDSL.g:1192:2: rule__Influence__Group__2__Impl rule__Influence__Group__3
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
    // InternalInfluenceDSL.g:1199:1: rule__Influence__Group__2__Impl : ( ( rule__Influence__Group_2__0 )* ) ;
    public final void rule__Influence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1203:1: ( ( ( rule__Influence__Group_2__0 )* ) )
            // InternalInfluenceDSL.g:1204:1: ( ( rule__Influence__Group_2__0 )* )
            {
            // InternalInfluenceDSL.g:1204:1: ( ( rule__Influence__Group_2__0 )* )
            // InternalInfluenceDSL.g:1205:2: ( rule__Influence__Group_2__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_2()); 
            // InternalInfluenceDSL.g:1206:2: ( rule__Influence__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1206:3: rule__Influence__Group_2__0
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
    // InternalInfluenceDSL.g:1214:1: rule__Influence__Group__3 : rule__Influence__Group__3__Impl rule__Influence__Group__4 ;
    public final void rule__Influence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1218:1: ( rule__Influence__Group__3__Impl rule__Influence__Group__4 )
            // InternalInfluenceDSL.g:1219:2: rule__Influence__Group__3__Impl rule__Influence__Group__4
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
    // InternalInfluenceDSL.g:1226:1: rule__Influence__Group__3__Impl : ( ( '**#' )? ) ;
    public final void rule__Influence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1230:1: ( ( ( '**#' )? ) )
            // InternalInfluenceDSL.g:1231:1: ( ( '**#' )? )
            {
            // InternalInfluenceDSL.g:1231:1: ( ( '**#' )? )
            // InternalInfluenceDSL.g:1232:2: ( '**#' )?
            {
             before(grammarAccess.getInfluenceAccess().getAsteriskAsteriskNumberSignKeyword_3()); 
            // InternalInfluenceDSL.g:1233:2: ( '**#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInfluenceDSL.g:1233:3: '**#'
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
    // InternalInfluenceDSL.g:1241:1: rule__Influence__Group__4 : rule__Influence__Group__4__Impl rule__Influence__Group__5 ;
    public final void rule__Influence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1245:1: ( rule__Influence__Group__4__Impl rule__Influence__Group__5 )
            // InternalInfluenceDSL.g:1246:2: rule__Influence__Group__4__Impl rule__Influence__Group__5
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
    // InternalInfluenceDSL.g:1253:1: rule__Influence__Group__4__Impl : ( 'Influence' ) ;
    public final void rule__Influence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1257:1: ( ( 'Influence' ) )
            // InternalInfluenceDSL.g:1258:1: ( 'Influence' )
            {
            // InternalInfluenceDSL.g:1258:1: ( 'Influence' )
            // InternalInfluenceDSL.g:1259:2: 'Influence'
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
    // InternalInfluenceDSL.g:1268:1: rule__Influence__Group__5 : rule__Influence__Group__5__Impl rule__Influence__Group__6 ;
    public final void rule__Influence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1272:1: ( rule__Influence__Group__5__Impl rule__Influence__Group__6 )
            // InternalInfluenceDSL.g:1273:2: rule__Influence__Group__5__Impl rule__Influence__Group__6
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
    // InternalInfluenceDSL.g:1280:1: rule__Influence__Group__5__Impl : ( ( rule__Influence__NameAssignment_5 ) ) ;
    public final void rule__Influence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1284:1: ( ( ( rule__Influence__NameAssignment_5 ) ) )
            // InternalInfluenceDSL.g:1285:1: ( ( rule__Influence__NameAssignment_5 ) )
            {
            // InternalInfluenceDSL.g:1285:1: ( ( rule__Influence__NameAssignment_5 ) )
            // InternalInfluenceDSL.g:1286:2: ( rule__Influence__NameAssignment_5 )
            {
             before(grammarAccess.getInfluenceAccess().getNameAssignment_5()); 
            // InternalInfluenceDSL.g:1287:2: ( rule__Influence__NameAssignment_5 )
            // InternalInfluenceDSL.g:1287:3: rule__Influence__NameAssignment_5
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
    // InternalInfluenceDSL.g:1295:1: rule__Influence__Group__6 : rule__Influence__Group__6__Impl rule__Influence__Group__7 ;
    public final void rule__Influence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1299:1: ( rule__Influence__Group__6__Impl rule__Influence__Group__7 )
            // InternalInfluenceDSL.g:1300:2: rule__Influence__Group__6__Impl rule__Influence__Group__7
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
    // InternalInfluenceDSL.g:1307:1: rule__Influence__Group__6__Impl : ( 'from' ) ;
    public final void rule__Influence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1311:1: ( ( 'from' ) )
            // InternalInfluenceDSL.g:1312:1: ( 'from' )
            {
            // InternalInfluenceDSL.g:1312:1: ( 'from' )
            // InternalInfluenceDSL.g:1313:2: 'from'
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
    // InternalInfluenceDSL.g:1322:1: rule__Influence__Group__7 : rule__Influence__Group__7__Impl rule__Influence__Group__8 ;
    public final void rule__Influence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1326:1: ( rule__Influence__Group__7__Impl rule__Influence__Group__8 )
            // InternalInfluenceDSL.g:1327:2: rule__Influence__Group__7__Impl rule__Influence__Group__8
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
    // InternalInfluenceDSL.g:1334:1: rule__Influence__Group__7__Impl : ( ( rule__Influence__SourceArtifactAssignment_7 ) ) ;
    public final void rule__Influence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1338:1: ( ( ( rule__Influence__SourceArtifactAssignment_7 ) ) )
            // InternalInfluenceDSL.g:1339:1: ( ( rule__Influence__SourceArtifactAssignment_7 ) )
            {
            // InternalInfluenceDSL.g:1339:1: ( ( rule__Influence__SourceArtifactAssignment_7 ) )
            // InternalInfluenceDSL.g:1340:2: ( rule__Influence__SourceArtifactAssignment_7 )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactAssignment_7()); 
            // InternalInfluenceDSL.g:1341:2: ( rule__Influence__SourceArtifactAssignment_7 )
            // InternalInfluenceDSL.g:1341:3: rule__Influence__SourceArtifactAssignment_7
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
    // InternalInfluenceDSL.g:1349:1: rule__Influence__Group__8 : rule__Influence__Group__8__Impl rule__Influence__Group__9 ;
    public final void rule__Influence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1353:1: ( rule__Influence__Group__8__Impl rule__Influence__Group__9 )
            // InternalInfluenceDSL.g:1354:2: rule__Influence__Group__8__Impl rule__Influence__Group__9
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
    // InternalInfluenceDSL.g:1361:1: rule__Influence__Group__8__Impl : ( ( rule__Influence__Group_8__0 )* ) ;
    public final void rule__Influence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1365:1: ( ( ( rule__Influence__Group_8__0 )* ) )
            // InternalInfluenceDSL.g:1366:1: ( ( rule__Influence__Group_8__0 )* )
            {
            // InternalInfluenceDSL.g:1366:1: ( ( rule__Influence__Group_8__0 )* )
            // InternalInfluenceDSL.g:1367:2: ( rule__Influence__Group_8__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_8()); 
            // InternalInfluenceDSL.g:1368:2: ( rule__Influence__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1368:3: rule__Influence__Group_8__0
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
    // InternalInfluenceDSL.g:1376:1: rule__Influence__Group__9 : rule__Influence__Group__9__Impl rule__Influence__Group__10 ;
    public final void rule__Influence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1380:1: ( rule__Influence__Group__9__Impl rule__Influence__Group__10 )
            // InternalInfluenceDSL.g:1381:2: rule__Influence__Group__9__Impl rule__Influence__Group__10
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
    // InternalInfluenceDSL.g:1388:1: rule__Influence__Group__9__Impl : ( 'and' ) ;
    public final void rule__Influence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1392:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:1393:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:1393:1: ( 'and' )
            // InternalInfluenceDSL.g:1394:2: 'and'
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
    // InternalInfluenceDSL.g:1403:1: rule__Influence__Group__10 : rule__Influence__Group__10__Impl rule__Influence__Group__11 ;
    public final void rule__Influence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1407:1: ( rule__Influence__Group__10__Impl rule__Influence__Group__11 )
            // InternalInfluenceDSL.g:1408:2: rule__Influence__Group__10__Impl rule__Influence__Group__11
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
    // InternalInfluenceDSL.g:1415:1: rule__Influence__Group__10__Impl : ( 'from' ) ;
    public final void rule__Influence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1419:1: ( ( 'from' ) )
            // InternalInfluenceDSL.g:1420:1: ( 'from' )
            {
            // InternalInfluenceDSL.g:1420:1: ( 'from' )
            // InternalInfluenceDSL.g:1421:2: 'from'
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
    // InternalInfluenceDSL.g:1430:1: rule__Influence__Group__11 : rule__Influence__Group__11__Impl rule__Influence__Group__12 ;
    public final void rule__Influence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1434:1: ( rule__Influence__Group__11__Impl rule__Influence__Group__12 )
            // InternalInfluenceDSL.g:1435:2: rule__Influence__Group__11__Impl rule__Influence__Group__12
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
    // InternalInfluenceDSL.g:1442:1: rule__Influence__Group__11__Impl : ( 'phenomena' ) ;
    public final void rule__Influence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1446:1: ( ( 'phenomena' ) )
            // InternalInfluenceDSL.g:1447:1: ( 'phenomena' )
            {
            // InternalInfluenceDSL.g:1447:1: ( 'phenomena' )
            // InternalInfluenceDSL.g:1448:2: 'phenomena'
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
    // InternalInfluenceDSL.g:1457:1: rule__Influence__Group__12 : rule__Influence__Group__12__Impl rule__Influence__Group__13 ;
    public final void rule__Influence__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1461:1: ( rule__Influence__Group__12__Impl rule__Influence__Group__13 )
            // InternalInfluenceDSL.g:1462:2: rule__Influence__Group__12__Impl rule__Influence__Group__13
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
    // InternalInfluenceDSL.g:1469:1: rule__Influence__Group__12__Impl : ( ( rule__Influence__SourcePhenomenaAssignment_12 ) ) ;
    public final void rule__Influence__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1473:1: ( ( ( rule__Influence__SourcePhenomenaAssignment_12 ) ) )
            // InternalInfluenceDSL.g:1474:1: ( ( rule__Influence__SourcePhenomenaAssignment_12 ) )
            {
            // InternalInfluenceDSL.g:1474:1: ( ( rule__Influence__SourcePhenomenaAssignment_12 ) )
            // InternalInfluenceDSL.g:1475:2: ( rule__Influence__SourcePhenomenaAssignment_12 )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaAssignment_12()); 
            // InternalInfluenceDSL.g:1476:2: ( rule__Influence__SourcePhenomenaAssignment_12 )
            // InternalInfluenceDSL.g:1476:3: rule__Influence__SourcePhenomenaAssignment_12
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
    // InternalInfluenceDSL.g:1484:1: rule__Influence__Group__13 : rule__Influence__Group__13__Impl rule__Influence__Group__14 ;
    public final void rule__Influence__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1488:1: ( rule__Influence__Group__13__Impl rule__Influence__Group__14 )
            // InternalInfluenceDSL.g:1489:2: rule__Influence__Group__13__Impl rule__Influence__Group__14
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
    // InternalInfluenceDSL.g:1496:1: rule__Influence__Group__13__Impl : ( ( rule__Influence__Group_13__0 )* ) ;
    public final void rule__Influence__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1500:1: ( ( ( rule__Influence__Group_13__0 )* ) )
            // InternalInfluenceDSL.g:1501:1: ( ( rule__Influence__Group_13__0 )* )
            {
            // InternalInfluenceDSL.g:1501:1: ( ( rule__Influence__Group_13__0 )* )
            // InternalInfluenceDSL.g:1502:2: ( rule__Influence__Group_13__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_13()); 
            // InternalInfluenceDSL.g:1503:2: ( rule__Influence__Group_13__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1503:3: rule__Influence__Group_13__0
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
    // InternalInfluenceDSL.g:1511:1: rule__Influence__Group__14 : rule__Influence__Group__14__Impl rule__Influence__Group__15 ;
    public final void rule__Influence__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1515:1: ( rule__Influence__Group__14__Impl rule__Influence__Group__15 )
            // InternalInfluenceDSL.g:1516:2: rule__Influence__Group__14__Impl rule__Influence__Group__15
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
    // InternalInfluenceDSL.g:1523:1: rule__Influence__Group__14__Impl : ( 'emerges' ) ;
    public final void rule__Influence__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1527:1: ( ( 'emerges' ) )
            // InternalInfluenceDSL.g:1528:1: ( 'emerges' )
            {
            // InternalInfluenceDSL.g:1528:1: ( 'emerges' )
            // InternalInfluenceDSL.g:1529:2: 'emerges'
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
    // InternalInfluenceDSL.g:1538:1: rule__Influence__Group__15 : rule__Influence__Group__15__Impl rule__Influence__Group__16 ;
    public final void rule__Influence__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1542:1: ( rule__Influence__Group__15__Impl rule__Influence__Group__16 )
            // InternalInfluenceDSL.g:1543:2: rule__Influence__Group__15__Impl rule__Influence__Group__16
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
    // InternalInfluenceDSL.g:1550:1: rule__Influence__Group__15__Impl : ( ( rule__Influence__ProducesAssignment_15 ) ) ;
    public final void rule__Influence__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1554:1: ( ( ( rule__Influence__ProducesAssignment_15 ) ) )
            // InternalInfluenceDSL.g:1555:1: ( ( rule__Influence__ProducesAssignment_15 ) )
            {
            // InternalInfluenceDSL.g:1555:1: ( ( rule__Influence__ProducesAssignment_15 ) )
            // InternalInfluenceDSL.g:1556:2: ( rule__Influence__ProducesAssignment_15 )
            {
             before(grammarAccess.getInfluenceAccess().getProducesAssignment_15()); 
            // InternalInfluenceDSL.g:1557:2: ( rule__Influence__ProducesAssignment_15 )
            // InternalInfluenceDSL.g:1557:3: rule__Influence__ProducesAssignment_15
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
    // InternalInfluenceDSL.g:1565:1: rule__Influence__Group__16 : rule__Influence__Group__16__Impl rule__Influence__Group__17 ;
    public final void rule__Influence__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1569:1: ( rule__Influence__Group__16__Impl rule__Influence__Group__17 )
            // InternalInfluenceDSL.g:1570:2: rule__Influence__Group__16__Impl rule__Influence__Group__17
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
    // InternalInfluenceDSL.g:1577:1: rule__Influence__Group__16__Impl : ( ( rule__Influence__Group_16__0 )* ) ;
    public final void rule__Influence__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1581:1: ( ( ( rule__Influence__Group_16__0 )* ) )
            // InternalInfluenceDSL.g:1582:1: ( ( rule__Influence__Group_16__0 )* )
            {
            // InternalInfluenceDSL.g:1582:1: ( ( rule__Influence__Group_16__0 )* )
            // InternalInfluenceDSL.g:1583:2: ( rule__Influence__Group_16__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_16()); 
            // InternalInfluenceDSL.g:1584:2: ( rule__Influence__Group_16__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1584:3: rule__Influence__Group_16__0
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
    // InternalInfluenceDSL.g:1592:1: rule__Influence__Group__17 : rule__Influence__Group__17__Impl rule__Influence__Group__18 ;
    public final void rule__Influence__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1596:1: ( rule__Influence__Group__17__Impl rule__Influence__Group__18 )
            // InternalInfluenceDSL.g:1597:2: rule__Influence__Group__17__Impl rule__Influence__Group__18
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
    // InternalInfluenceDSL.g:1604:1: rule__Influence__Group__17__Impl : ( 'that' ) ;
    public final void rule__Influence__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1608:1: ( ( 'that' ) )
            // InternalInfluenceDSL.g:1609:1: ( 'that' )
            {
            // InternalInfluenceDSL.g:1609:1: ( 'that' )
            // InternalInfluenceDSL.g:1610:2: 'that'
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
    // InternalInfluenceDSL.g:1619:1: rule__Influence__Group__18 : rule__Influence__Group__18__Impl rule__Influence__Group__19 ;
    public final void rule__Influence__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1623:1: ( rule__Influence__Group__18__Impl rule__Influence__Group__19 )
            // InternalInfluenceDSL.g:1624:2: rule__Influence__Group__18__Impl rule__Influence__Group__19
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
    // InternalInfluenceDSL.g:1631:1: rule__Influence__Group__18__Impl : ( 'implies' ) ;
    public final void rule__Influence__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1635:1: ( ( 'implies' ) )
            // InternalInfluenceDSL.g:1636:1: ( 'implies' )
            {
            // InternalInfluenceDSL.g:1636:1: ( 'implies' )
            // InternalInfluenceDSL.g:1637:2: 'implies'
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
    // InternalInfluenceDSL.g:1646:1: rule__Influence__Group__19 : rule__Influence__Group__19__Impl rule__Influence__Group__20 ;
    public final void rule__Influence__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1650:1: ( rule__Influence__Group__19__Impl rule__Influence__Group__20 )
            // InternalInfluenceDSL.g:1651:2: rule__Influence__Group__19__Impl rule__Influence__Group__20
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
    // InternalInfluenceDSL.g:1658:1: rule__Influence__Group__19__Impl : ( ( rule__Influence__AffectsAssignment_19 ) ) ;
    public final void rule__Influence__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1662:1: ( ( ( rule__Influence__AffectsAssignment_19 ) ) )
            // InternalInfluenceDSL.g:1663:1: ( ( rule__Influence__AffectsAssignment_19 ) )
            {
            // InternalInfluenceDSL.g:1663:1: ( ( rule__Influence__AffectsAssignment_19 ) )
            // InternalInfluenceDSL.g:1664:2: ( rule__Influence__AffectsAssignment_19 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_19()); 
            // InternalInfluenceDSL.g:1665:2: ( rule__Influence__AffectsAssignment_19 )
            // InternalInfluenceDSL.g:1665:3: rule__Influence__AffectsAssignment_19
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
    // InternalInfluenceDSL.g:1673:1: rule__Influence__Group__20 : rule__Influence__Group__20__Impl rule__Influence__Group__21 ;
    public final void rule__Influence__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1677:1: ( rule__Influence__Group__20__Impl rule__Influence__Group__21 )
            // InternalInfluenceDSL.g:1678:2: rule__Influence__Group__20__Impl rule__Influence__Group__21
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
    // InternalInfluenceDSL.g:1685:1: rule__Influence__Group__20__Impl : ( ( rule__Influence__Group_20__0 )* ) ;
    public final void rule__Influence__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1689:1: ( ( ( rule__Influence__Group_20__0 )* ) )
            // InternalInfluenceDSL.g:1690:1: ( ( rule__Influence__Group_20__0 )* )
            {
            // InternalInfluenceDSL.g:1690:1: ( ( rule__Influence__Group_20__0 )* )
            // InternalInfluenceDSL.g:1691:2: ( rule__Influence__Group_20__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_20()); 
            // InternalInfluenceDSL.g:1692:2: ( rule__Influence__Group_20__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1692:3: rule__Influence__Group_20__0
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
    // InternalInfluenceDSL.g:1700:1: rule__Influence__Group__21 : rule__Influence__Group__21__Impl rule__Influence__Group__22 ;
    public final void rule__Influence__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1704:1: ( rule__Influence__Group__21__Impl rule__Influence__Group__22 )
            // InternalInfluenceDSL.g:1705:2: rule__Influence__Group__21__Impl rule__Influence__Group__22
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
    // InternalInfluenceDSL.g:1712:1: rule__Influence__Group__21__Impl : ( 'which' ) ;
    public final void rule__Influence__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1716:1: ( ( 'which' ) )
            // InternalInfluenceDSL.g:1717:1: ( 'which' )
            {
            // InternalInfluenceDSL.g:1717:1: ( 'which' )
            // InternalInfluenceDSL.g:1718:2: 'which'
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
    // InternalInfluenceDSL.g:1727:1: rule__Influence__Group__22 : rule__Influence__Group__22__Impl rule__Influence__Group__23 ;
    public final void rule__Influence__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1731:1: ( rule__Influence__Group__22__Impl rule__Influence__Group__23 )
            // InternalInfluenceDSL.g:1732:2: rule__Influence__Group__22__Impl rule__Influence__Group__23
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
    // InternalInfluenceDSL.g:1739:1: rule__Influence__Group__22__Impl : ( 'may' ) ;
    public final void rule__Influence__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1743:1: ( ( 'may' ) )
            // InternalInfluenceDSL.g:1744:1: ( 'may' )
            {
            // InternalInfluenceDSL.g:1744:1: ( 'may' )
            // InternalInfluenceDSL.g:1745:2: 'may'
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
    // InternalInfluenceDSL.g:1754:1: rule__Influence__Group__23 : rule__Influence__Group__23__Impl rule__Influence__Group__24 ;
    public final void rule__Influence__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1758:1: ( rule__Influence__Group__23__Impl rule__Influence__Group__24 )
            // InternalInfluenceDSL.g:1759:2: rule__Influence__Group__23__Impl rule__Influence__Group__24
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
    // InternalInfluenceDSL.g:1766:1: rule__Influence__Group__23__Impl : ( 'violate' ) ;
    public final void rule__Influence__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1770:1: ( ( 'violate' ) )
            // InternalInfluenceDSL.g:1771:1: ( 'violate' )
            {
            // InternalInfluenceDSL.g:1771:1: ( 'violate' )
            // InternalInfluenceDSL.g:1772:2: 'violate'
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
    // InternalInfluenceDSL.g:1781:1: rule__Influence__Group__24 : rule__Influence__Group__24__Impl rule__Influence__Group__25 ;
    public final void rule__Influence__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1785:1: ( rule__Influence__Group__24__Impl rule__Influence__Group__25 )
            // InternalInfluenceDSL.g:1786:2: rule__Influence__Group__24__Impl rule__Influence__Group__25
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
    // InternalInfluenceDSL.g:1793:1: rule__Influence__Group__24__Impl : ( ( rule__Influence__EvaluatedByAssignment_24 ) ) ;
    public final void rule__Influence__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1797:1: ( ( ( rule__Influence__EvaluatedByAssignment_24 ) ) )
            // InternalInfluenceDSL.g:1798:1: ( ( rule__Influence__EvaluatedByAssignment_24 ) )
            {
            // InternalInfluenceDSL.g:1798:1: ( ( rule__Influence__EvaluatedByAssignment_24 ) )
            // InternalInfluenceDSL.g:1799:2: ( rule__Influence__EvaluatedByAssignment_24 )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByAssignment_24()); 
            // InternalInfluenceDSL.g:1800:2: ( rule__Influence__EvaluatedByAssignment_24 )
            // InternalInfluenceDSL.g:1800:3: rule__Influence__EvaluatedByAssignment_24
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
    // InternalInfluenceDSL.g:1808:1: rule__Influence__Group__25 : rule__Influence__Group__25__Impl rule__Influence__Group__26 ;
    public final void rule__Influence__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1812:1: ( rule__Influence__Group__25__Impl rule__Influence__Group__26 )
            // InternalInfluenceDSL.g:1813:2: rule__Influence__Group__25__Impl rule__Influence__Group__26
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
    // InternalInfluenceDSL.g:1820:1: rule__Influence__Group__25__Impl : ( ( rule__Influence__Group_25__0 )* ) ;
    public final void rule__Influence__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1824:1: ( ( ( rule__Influence__Group_25__0 )* ) )
            // InternalInfluenceDSL.g:1825:1: ( ( rule__Influence__Group_25__0 )* )
            {
            // InternalInfluenceDSL.g:1825:1: ( ( rule__Influence__Group_25__0 )* )
            // InternalInfluenceDSL.g:1826:2: ( rule__Influence__Group_25__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_25()); 
            // InternalInfluenceDSL.g:1827:2: ( rule__Influence__Group_25__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfluenceDSL.g:1827:3: rule__Influence__Group_25__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalInfluenceDSL.g:1835:1: rule__Influence__Group__26 : rule__Influence__Group__26__Impl rule__Influence__Group__27 ;
    public final void rule__Influence__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1839:1: ( rule__Influence__Group__26__Impl rule__Influence__Group__27 )
            // InternalInfluenceDSL.g:1840:2: rule__Influence__Group__26__Impl rule__Influence__Group__27
            {
            pushFollow(FOLLOW_28);
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
    // InternalInfluenceDSL.g:1847:1: rule__Influence__Group__26__Impl : ( 'it' ) ;
    public final void rule__Influence__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1851:1: ( ( 'it' ) )
            // InternalInfluenceDSL.g:1852:1: ( 'it' )
            {
            // InternalInfluenceDSL.g:1852:1: ( 'it' )
            // InternalInfluenceDSL.g:1853:2: 'it'
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
    // InternalInfluenceDSL.g:1862:1: rule__Influence__Group__27 : rule__Influence__Group__27__Impl rule__Influence__Group__28 ;
    public final void rule__Influence__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1866:1: ( rule__Influence__Group__27__Impl rule__Influence__Group__28 )
            // InternalInfluenceDSL.g:1867:2: rule__Influence__Group__27__Impl rule__Influence__Group__28
            {
            pushFollow(FOLLOW_29);
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
    // InternalInfluenceDSL.g:1874:1: rule__Influence__Group__27__Impl : ( 'can' ) ;
    public final void rule__Influence__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1878:1: ( ( 'can' ) )
            // InternalInfluenceDSL.g:1879:1: ( 'can' )
            {
            // InternalInfluenceDSL.g:1879:1: ( 'can' )
            // InternalInfluenceDSL.g:1880:2: 'can'
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
    // InternalInfluenceDSL.g:1889:1: rule__Influence__Group__28 : rule__Influence__Group__28__Impl rule__Influence__Group__29 ;
    public final void rule__Influence__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1893:1: ( rule__Influence__Group__28__Impl rule__Influence__Group__29 )
            // InternalInfluenceDSL.g:1894:2: rule__Influence__Group__28__Impl rule__Influence__Group__29
            {
            pushFollow(FOLLOW_30);
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
    // InternalInfluenceDSL.g:1901:1: rule__Influence__Group__28__Impl : ( 'be' ) ;
    public final void rule__Influence__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1905:1: ( ( 'be' ) )
            // InternalInfluenceDSL.g:1906:1: ( 'be' )
            {
            // InternalInfluenceDSL.g:1906:1: ( 'be' )
            // InternalInfluenceDSL.g:1907:2: 'be'
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
    // InternalInfluenceDSL.g:1916:1: rule__Influence__Group__29 : rule__Influence__Group__29__Impl rule__Influence__Group__30 ;
    public final void rule__Influence__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1920:1: ( rule__Influence__Group__29__Impl rule__Influence__Group__30 )
            // InternalInfluenceDSL.g:1921:2: rule__Influence__Group__29__Impl rule__Influence__Group__30
            {
            pushFollow(FOLLOW_31);
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
    // InternalInfluenceDSL.g:1928:1: rule__Influence__Group__29__Impl : ( 'compensated' ) ;
    public final void rule__Influence__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1932:1: ( ( 'compensated' ) )
            // InternalInfluenceDSL.g:1933:1: ( 'compensated' )
            {
            // InternalInfluenceDSL.g:1933:1: ( 'compensated' )
            // InternalInfluenceDSL.g:1934:2: 'compensated'
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
    // InternalInfluenceDSL.g:1943:1: rule__Influence__Group__30 : rule__Influence__Group__30__Impl rule__Influence__Group__31 ;
    public final void rule__Influence__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1947:1: ( rule__Influence__Group__30__Impl rule__Influence__Group__31 )
            // InternalInfluenceDSL.g:1948:2: rule__Influence__Group__30__Impl rule__Influence__Group__31
            {
            pushFollow(FOLLOW_32);
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
    // InternalInfluenceDSL.g:1955:1: rule__Influence__Group__30__Impl : ( 'by' ) ;
    public final void rule__Influence__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1959:1: ( ( 'by' ) )
            // InternalInfluenceDSL.g:1960:1: ( 'by' )
            {
            // InternalInfluenceDSL.g:1960:1: ( 'by' )
            // InternalInfluenceDSL.g:1961:2: 'by'
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
    // InternalInfluenceDSL.g:1970:1: rule__Influence__Group__31 : rule__Influence__Group__31__Impl rule__Influence__Group__32 ;
    public final void rule__Influence__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1974:1: ( rule__Influence__Group__31__Impl rule__Influence__Group__32 )
            // InternalInfluenceDSL.g:1975:2: rule__Influence__Group__31__Impl rule__Influence__Group__32
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
    // InternalInfluenceDSL.g:1982:1: rule__Influence__Group__31__Impl : ( 'modifying' ) ;
    public final void rule__Influence__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:1986:1: ( ( 'modifying' ) )
            // InternalInfluenceDSL.g:1987:1: ( 'modifying' )
            {
            // InternalInfluenceDSL.g:1987:1: ( 'modifying' )
            // InternalInfluenceDSL.g:1988:2: 'modifying'
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
    // InternalInfluenceDSL.g:1997:1: rule__Influence__Group__32 : rule__Influence__Group__32__Impl rule__Influence__Group__33 ;
    public final void rule__Influence__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2001:1: ( rule__Influence__Group__32__Impl rule__Influence__Group__33 )
            // InternalInfluenceDSL.g:2002:2: rule__Influence__Group__32__Impl rule__Influence__Group__33
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
    // InternalInfluenceDSL.g:2009:1: rule__Influence__Group__32__Impl : ( ( rule__Influence__TargetArtifactAssignment_32 ) ) ;
    public final void rule__Influence__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2013:1: ( ( ( rule__Influence__TargetArtifactAssignment_32 ) ) )
            // InternalInfluenceDSL.g:2014:1: ( ( rule__Influence__TargetArtifactAssignment_32 ) )
            {
            // InternalInfluenceDSL.g:2014:1: ( ( rule__Influence__TargetArtifactAssignment_32 ) )
            // InternalInfluenceDSL.g:2015:2: ( rule__Influence__TargetArtifactAssignment_32 )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactAssignment_32()); 
            // InternalInfluenceDSL.g:2016:2: ( rule__Influence__TargetArtifactAssignment_32 )
            // InternalInfluenceDSL.g:2016:3: rule__Influence__TargetArtifactAssignment_32
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
    // InternalInfluenceDSL.g:2024:1: rule__Influence__Group__33 : rule__Influence__Group__33__Impl ;
    public final void rule__Influence__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2028:1: ( rule__Influence__Group__33__Impl )
            // InternalInfluenceDSL.g:2029:2: rule__Influence__Group__33__Impl
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
    // InternalInfluenceDSL.g:2035:1: rule__Influence__Group__33__Impl : ( ( rule__Influence__Group_33__0 )* ) ;
    public final void rule__Influence__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2039:1: ( ( ( rule__Influence__Group_33__0 )* ) )
            // InternalInfluenceDSL.g:2040:1: ( ( rule__Influence__Group_33__0 )* )
            {
            // InternalInfluenceDSL.g:2040:1: ( ( rule__Influence__Group_33__0 )* )
            // InternalInfluenceDSL.g:2041:2: ( rule__Influence__Group_33__0 )*
            {
             before(grammarAccess.getInfluenceAccess().getGroup_33()); 
            // InternalInfluenceDSL.g:2042:2: ( rule__Influence__Group_33__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2042:3: rule__Influence__Group_33__0
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
    // InternalInfluenceDSL.g:2051:1: rule__Influence__Group_2__0 : rule__Influence__Group_2__0__Impl rule__Influence__Group_2__1 ;
    public final void rule__Influence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2055:1: ( rule__Influence__Group_2__0__Impl rule__Influence__Group_2__1 )
            // InternalInfluenceDSL.g:2056:2: rule__Influence__Group_2__0__Impl rule__Influence__Group_2__1
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
    // InternalInfluenceDSL.g:2063:1: rule__Influence__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2067:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2068:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2068:1: ( ',' )
            // InternalInfluenceDSL.g:2069:2: ','
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
    // InternalInfluenceDSL.g:2078:1: rule__Influence__Group_2__1 : rule__Influence__Group_2__1__Impl ;
    public final void rule__Influence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2082:1: ( rule__Influence__Group_2__1__Impl )
            // InternalInfluenceDSL.g:2083:2: rule__Influence__Group_2__1__Impl
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
    // InternalInfluenceDSL.g:2089:1: rule__Influence__Group_2__1__Impl : ( ( rule__Influence__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Influence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2093:1: ( ( ( rule__Influence__DescriptionAssignment_2_1 ) ) )
            // InternalInfluenceDSL.g:2094:1: ( ( rule__Influence__DescriptionAssignment_2_1 ) )
            {
            // InternalInfluenceDSL.g:2094:1: ( ( rule__Influence__DescriptionAssignment_2_1 ) )
            // InternalInfluenceDSL.g:2095:2: ( rule__Influence__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getInfluenceAccess().getDescriptionAssignment_2_1()); 
            // InternalInfluenceDSL.g:2096:2: ( rule__Influence__DescriptionAssignment_2_1 )
            // InternalInfluenceDSL.g:2096:3: rule__Influence__DescriptionAssignment_2_1
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
    // InternalInfluenceDSL.g:2105:1: rule__Influence__Group_8__0 : rule__Influence__Group_8__0__Impl rule__Influence__Group_8__1 ;
    public final void rule__Influence__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2109:1: ( rule__Influence__Group_8__0__Impl rule__Influence__Group_8__1 )
            // InternalInfluenceDSL.g:2110:2: rule__Influence__Group_8__0__Impl rule__Influence__Group_8__1
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
    // InternalInfluenceDSL.g:2117:1: rule__Influence__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2121:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2122:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2122:1: ( ',' )
            // InternalInfluenceDSL.g:2123:2: ','
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
    // InternalInfluenceDSL.g:2132:1: rule__Influence__Group_8__1 : rule__Influence__Group_8__1__Impl ;
    public final void rule__Influence__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2136:1: ( rule__Influence__Group_8__1__Impl )
            // InternalInfluenceDSL.g:2137:2: rule__Influence__Group_8__1__Impl
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
    // InternalInfluenceDSL.g:2143:1: rule__Influence__Group_8__1__Impl : ( ( rule__Influence__SourceArtifactAssignment_8_1 ) ) ;
    public final void rule__Influence__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2147:1: ( ( ( rule__Influence__SourceArtifactAssignment_8_1 ) ) )
            // InternalInfluenceDSL.g:2148:1: ( ( rule__Influence__SourceArtifactAssignment_8_1 ) )
            {
            // InternalInfluenceDSL.g:2148:1: ( ( rule__Influence__SourceArtifactAssignment_8_1 ) )
            // InternalInfluenceDSL.g:2149:2: ( rule__Influence__SourceArtifactAssignment_8_1 )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactAssignment_8_1()); 
            // InternalInfluenceDSL.g:2150:2: ( rule__Influence__SourceArtifactAssignment_8_1 )
            // InternalInfluenceDSL.g:2150:3: rule__Influence__SourceArtifactAssignment_8_1
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
    // InternalInfluenceDSL.g:2159:1: rule__Influence__Group_13__0 : rule__Influence__Group_13__0__Impl rule__Influence__Group_13__1 ;
    public final void rule__Influence__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2163:1: ( rule__Influence__Group_13__0__Impl rule__Influence__Group_13__1 )
            // InternalInfluenceDSL.g:2164:2: rule__Influence__Group_13__0__Impl rule__Influence__Group_13__1
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
    // InternalInfluenceDSL.g:2171:1: rule__Influence__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2175:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2176:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2176:1: ( ',' )
            // InternalInfluenceDSL.g:2177:2: ','
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
    // InternalInfluenceDSL.g:2186:1: rule__Influence__Group_13__1 : rule__Influence__Group_13__1__Impl ;
    public final void rule__Influence__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2190:1: ( rule__Influence__Group_13__1__Impl )
            // InternalInfluenceDSL.g:2191:2: rule__Influence__Group_13__1__Impl
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
    // InternalInfluenceDSL.g:2197:1: rule__Influence__Group_13__1__Impl : ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) ) ;
    public final void rule__Influence__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2201:1: ( ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) ) )
            // InternalInfluenceDSL.g:2202:1: ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) )
            {
            // InternalInfluenceDSL.g:2202:1: ( ( rule__Influence__SourcePhenomenaAssignment_13_1 ) )
            // InternalInfluenceDSL.g:2203:2: ( rule__Influence__SourcePhenomenaAssignment_13_1 )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaAssignment_13_1()); 
            // InternalInfluenceDSL.g:2204:2: ( rule__Influence__SourcePhenomenaAssignment_13_1 )
            // InternalInfluenceDSL.g:2204:3: rule__Influence__SourcePhenomenaAssignment_13_1
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
    // InternalInfluenceDSL.g:2213:1: rule__Influence__Group_16__0 : rule__Influence__Group_16__0__Impl rule__Influence__Group_16__1 ;
    public final void rule__Influence__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2217:1: ( rule__Influence__Group_16__0__Impl rule__Influence__Group_16__1 )
            // InternalInfluenceDSL.g:2218:2: rule__Influence__Group_16__0__Impl rule__Influence__Group_16__1
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
    // InternalInfluenceDSL.g:2225:1: rule__Influence__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2229:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2230:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2230:1: ( ',' )
            // InternalInfluenceDSL.g:2231:2: ','
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
    // InternalInfluenceDSL.g:2240:1: rule__Influence__Group_16__1 : rule__Influence__Group_16__1__Impl ;
    public final void rule__Influence__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2244:1: ( rule__Influence__Group_16__1__Impl )
            // InternalInfluenceDSL.g:2245:2: rule__Influence__Group_16__1__Impl
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
    // InternalInfluenceDSL.g:2251:1: rule__Influence__Group_16__1__Impl : ( ( rule__Influence__ProducesAssignment_16_1 ) ) ;
    public final void rule__Influence__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2255:1: ( ( ( rule__Influence__ProducesAssignment_16_1 ) ) )
            // InternalInfluenceDSL.g:2256:1: ( ( rule__Influence__ProducesAssignment_16_1 ) )
            {
            // InternalInfluenceDSL.g:2256:1: ( ( rule__Influence__ProducesAssignment_16_1 ) )
            // InternalInfluenceDSL.g:2257:2: ( rule__Influence__ProducesAssignment_16_1 )
            {
             before(grammarAccess.getInfluenceAccess().getProducesAssignment_16_1()); 
            // InternalInfluenceDSL.g:2258:2: ( rule__Influence__ProducesAssignment_16_1 )
            // InternalInfluenceDSL.g:2258:3: rule__Influence__ProducesAssignment_16_1
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
    // InternalInfluenceDSL.g:2267:1: rule__Influence__Group_20__0 : rule__Influence__Group_20__0__Impl rule__Influence__Group_20__1 ;
    public final void rule__Influence__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2271:1: ( rule__Influence__Group_20__0__Impl rule__Influence__Group_20__1 )
            // InternalInfluenceDSL.g:2272:2: rule__Influence__Group_20__0__Impl rule__Influence__Group_20__1
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
    // InternalInfluenceDSL.g:2279:1: rule__Influence__Group_20__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2283:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2284:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2284:1: ( ',' )
            // InternalInfluenceDSL.g:2285:2: ','
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
    // InternalInfluenceDSL.g:2294:1: rule__Influence__Group_20__1 : rule__Influence__Group_20__1__Impl ;
    public final void rule__Influence__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2298:1: ( rule__Influence__Group_20__1__Impl )
            // InternalInfluenceDSL.g:2299:2: rule__Influence__Group_20__1__Impl
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
    // InternalInfluenceDSL.g:2305:1: rule__Influence__Group_20__1__Impl : ( ( rule__Influence__AffectsAssignment_20_1 ) ) ;
    public final void rule__Influence__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2309:1: ( ( ( rule__Influence__AffectsAssignment_20_1 ) ) )
            // InternalInfluenceDSL.g:2310:1: ( ( rule__Influence__AffectsAssignment_20_1 ) )
            {
            // InternalInfluenceDSL.g:2310:1: ( ( rule__Influence__AffectsAssignment_20_1 ) )
            // InternalInfluenceDSL.g:2311:2: ( rule__Influence__AffectsAssignment_20_1 )
            {
             before(grammarAccess.getInfluenceAccess().getAffectsAssignment_20_1()); 
            // InternalInfluenceDSL.g:2312:2: ( rule__Influence__AffectsAssignment_20_1 )
            // InternalInfluenceDSL.g:2312:3: rule__Influence__AffectsAssignment_20_1
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
    // InternalInfluenceDSL.g:2321:1: rule__Influence__Group_25__0 : rule__Influence__Group_25__0__Impl rule__Influence__Group_25__1 ;
    public final void rule__Influence__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2325:1: ( rule__Influence__Group_25__0__Impl rule__Influence__Group_25__1 )
            // InternalInfluenceDSL.g:2326:2: rule__Influence__Group_25__0__Impl rule__Influence__Group_25__1
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
    // InternalInfluenceDSL.g:2333:1: rule__Influence__Group_25__0__Impl : ( 'and' ) ;
    public final void rule__Influence__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2337:1: ( ( 'and' ) )
            // InternalInfluenceDSL.g:2338:1: ( 'and' )
            {
            // InternalInfluenceDSL.g:2338:1: ( 'and' )
            // InternalInfluenceDSL.g:2339:2: 'and'
            {
             before(grammarAccess.getInfluenceAccess().getAndKeyword_25_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getAndKeyword_25_0()); 

            }


            }

        }
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
    // InternalInfluenceDSL.g:2348:1: rule__Influence__Group_25__1 : rule__Influence__Group_25__1__Impl ;
    public final void rule__Influence__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2352:1: ( rule__Influence__Group_25__1__Impl )
            // InternalInfluenceDSL.g:2353:2: rule__Influence__Group_25__1__Impl
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
    // InternalInfluenceDSL.g:2359:1: rule__Influence__Group_25__1__Impl : ( ( rule__Influence__EvaluatedByAssignment_25_1 ) ) ;
    public final void rule__Influence__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2363:1: ( ( ( rule__Influence__EvaluatedByAssignment_25_1 ) ) )
            // InternalInfluenceDSL.g:2364:1: ( ( rule__Influence__EvaluatedByAssignment_25_1 ) )
            {
            // InternalInfluenceDSL.g:2364:1: ( ( rule__Influence__EvaluatedByAssignment_25_1 ) )
            // InternalInfluenceDSL.g:2365:2: ( rule__Influence__EvaluatedByAssignment_25_1 )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByAssignment_25_1()); 
            // InternalInfluenceDSL.g:2366:2: ( rule__Influence__EvaluatedByAssignment_25_1 )
            // InternalInfluenceDSL.g:2366:3: rule__Influence__EvaluatedByAssignment_25_1
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
    // InternalInfluenceDSL.g:2375:1: rule__Influence__Group_33__0 : rule__Influence__Group_33__0__Impl rule__Influence__Group_33__1 ;
    public final void rule__Influence__Group_33__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2379:1: ( rule__Influence__Group_33__0__Impl rule__Influence__Group_33__1 )
            // InternalInfluenceDSL.g:2380:2: rule__Influence__Group_33__0__Impl rule__Influence__Group_33__1
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
    // InternalInfluenceDSL.g:2387:1: rule__Influence__Group_33__0__Impl : ( ',' ) ;
    public final void rule__Influence__Group_33__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2391:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2392:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2392:1: ( ',' )
            // InternalInfluenceDSL.g:2393:2: ','
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
    // InternalInfluenceDSL.g:2402:1: rule__Influence__Group_33__1 : rule__Influence__Group_33__1__Impl ;
    public final void rule__Influence__Group_33__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2406:1: ( rule__Influence__Group_33__1__Impl )
            // InternalInfluenceDSL.g:2407:2: rule__Influence__Group_33__1__Impl
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
    // InternalInfluenceDSL.g:2413:1: rule__Influence__Group_33__1__Impl : ( ( rule__Influence__TargetArtifactAssignment_33_1 ) ) ;
    public final void rule__Influence__Group_33__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2417:1: ( ( ( rule__Influence__TargetArtifactAssignment_33_1 ) ) )
            // InternalInfluenceDSL.g:2418:1: ( ( rule__Influence__TargetArtifactAssignment_33_1 ) )
            {
            // InternalInfluenceDSL.g:2418:1: ( ( rule__Influence__TargetArtifactAssignment_33_1 ) )
            // InternalInfluenceDSL.g:2419:2: ( rule__Influence__TargetArtifactAssignment_33_1 )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactAssignment_33_1()); 
            // InternalInfluenceDSL.g:2420:2: ( rule__Influence__TargetArtifactAssignment_33_1 )
            // InternalInfluenceDSL.g:2420:3: rule__Influence__TargetArtifactAssignment_33_1
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
    // InternalInfluenceDSL.g:2429:1: rule__RequirementSatisfaction__Group__0 : rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 ;
    public final void rule__RequirementSatisfaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2433:1: ( rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1 )
            // InternalInfluenceDSL.g:2434:2: rule__RequirementSatisfaction__Group__0__Impl rule__RequirementSatisfaction__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalInfluenceDSL.g:2441:1: rule__RequirementSatisfaction__Group__0__Impl : ( 'Requirement' ) ;
    public final void rule__RequirementSatisfaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2445:1: ( ( 'Requirement' ) )
            // InternalInfluenceDSL.g:2446:1: ( 'Requirement' )
            {
            // InternalInfluenceDSL.g:2446:1: ( 'Requirement' )
            // InternalInfluenceDSL.g:2447:2: 'Requirement'
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
    // InternalInfluenceDSL.g:2456:1: rule__RequirementSatisfaction__Group__1 : rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 ;
    public final void rule__RequirementSatisfaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2460:1: ( rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2 )
            // InternalInfluenceDSL.g:2461:2: rule__RequirementSatisfaction__Group__1__Impl rule__RequirementSatisfaction__Group__2
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
    // InternalInfluenceDSL.g:2468:1: rule__RequirementSatisfaction__Group__1__Impl : ( 'Satisfaction' ) ;
    public final void rule__RequirementSatisfaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2472:1: ( ( 'Satisfaction' ) )
            // InternalInfluenceDSL.g:2473:1: ( 'Satisfaction' )
            {
            // InternalInfluenceDSL.g:2473:1: ( 'Satisfaction' )
            // InternalInfluenceDSL.g:2474:2: 'Satisfaction'
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
    // InternalInfluenceDSL.g:2483:1: rule__RequirementSatisfaction__Group__2 : rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 ;
    public final void rule__RequirementSatisfaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2487:1: ( rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3 )
            // InternalInfluenceDSL.g:2488:2: rule__RequirementSatisfaction__Group__2__Impl rule__RequirementSatisfaction__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalInfluenceDSL.g:2495:1: rule__RequirementSatisfaction__Group__2__Impl : ( ( rule__RequirementSatisfaction__NameAssignment_2 ) ) ;
    public final void rule__RequirementSatisfaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2499:1: ( ( ( rule__RequirementSatisfaction__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:2500:1: ( ( rule__RequirementSatisfaction__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:2500:1: ( ( rule__RequirementSatisfaction__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:2501:2: ( rule__RequirementSatisfaction__NameAssignment_2 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:2502:2: ( rule__RequirementSatisfaction__NameAssignment_2 )
            // InternalInfluenceDSL.g:2502:3: rule__RequirementSatisfaction__NameAssignment_2
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
    // InternalInfluenceDSL.g:2510:1: rule__RequirementSatisfaction__Group__3 : rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 ;
    public final void rule__RequirementSatisfaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2514:1: ( rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4 )
            // InternalInfluenceDSL.g:2515:2: rule__RequirementSatisfaction__Group__3__Impl rule__RequirementSatisfaction__Group__4
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
    // InternalInfluenceDSL.g:2522:1: rule__RequirementSatisfaction__Group__3__Impl : ( ':' ) ;
    public final void rule__RequirementSatisfaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2526:1: ( ( ':' ) )
            // InternalInfluenceDSL.g:2527:1: ( ':' )
            {
            // InternalInfluenceDSL.g:2527:1: ( ':' )
            // InternalInfluenceDSL.g:2528:2: ':'
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
    // InternalInfluenceDSL.g:2537:1: rule__RequirementSatisfaction__Group__4 : rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 ;
    public final void rule__RequirementSatisfaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2541:1: ( rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5 )
            // InternalInfluenceDSL.g:2542:2: rule__RequirementSatisfaction__Group__4__Impl rule__RequirementSatisfaction__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalInfluenceDSL.g:2549:1: rule__RequirementSatisfaction__Group__4__Impl : ( 'from' ) ;
    public final void rule__RequirementSatisfaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2553:1: ( ( 'from' ) )
            // InternalInfluenceDSL.g:2554:1: ( 'from' )
            {
            // InternalInfluenceDSL.g:2554:1: ( 'from' )
            // InternalInfluenceDSL.g:2555:2: 'from'
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
    // InternalInfluenceDSL.g:2564:1: rule__RequirementSatisfaction__Group__5 : rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 ;
    public final void rule__RequirementSatisfaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2568:1: ( rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6 )
            // InternalInfluenceDSL.g:2569:2: rule__RequirementSatisfaction__Group__5__Impl rule__RequirementSatisfaction__Group__6
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
    // InternalInfluenceDSL.g:2576:1: rule__RequirementSatisfaction__Group__5__Impl : ( 'Requirement' ) ;
    public final void rule__RequirementSatisfaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2580:1: ( ( 'Requirement' ) )
            // InternalInfluenceDSL.g:2581:1: ( 'Requirement' )
            {
            // InternalInfluenceDSL.g:2581:1: ( 'Requirement' )
            // InternalInfluenceDSL.g:2582:2: 'Requirement'
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
    // InternalInfluenceDSL.g:2591:1: rule__RequirementSatisfaction__Group__6 : rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7 ;
    public final void rule__RequirementSatisfaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2595:1: ( rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7 )
            // InternalInfluenceDSL.g:2596:2: rule__RequirementSatisfaction__Group__6__Impl rule__RequirementSatisfaction__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalInfluenceDSL.g:2603:1: rule__RequirementSatisfaction__Group__6__Impl : ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) ) ;
    public final void rule__RequirementSatisfaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2607:1: ( ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) ) )
            // InternalInfluenceDSL.g:2608:1: ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) )
            {
            // InternalInfluenceDSL.g:2608:1: ( ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 ) )
            // InternalInfluenceDSL.g:2609:2: ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getConcerningRequirementAssignment_6()); 
            // InternalInfluenceDSL.g:2610:2: ( rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 )
            // InternalInfluenceDSL.g:2610:3: rule__RequirementSatisfaction__ConcerningRequirementAssignment_6
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
    // InternalInfluenceDSL.g:2618:1: rule__RequirementSatisfaction__Group__7 : rule__RequirementSatisfaction__Group__7__Impl rule__RequirementSatisfaction__Group__8 ;
    public final void rule__RequirementSatisfaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2622:1: ( rule__RequirementSatisfaction__Group__7__Impl rule__RequirementSatisfaction__Group__8 )
            // InternalInfluenceDSL.g:2623:2: rule__RequirementSatisfaction__Group__7__Impl rule__RequirementSatisfaction__Group__8
            {
            pushFollow(FOLLOW_37);
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
    // InternalInfluenceDSL.g:2630:1: rule__RequirementSatisfaction__Group__7__Impl : ( 'satisfied' ) ;
    public final void rule__RequirementSatisfaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2634:1: ( ( 'satisfied' ) )
            // InternalInfluenceDSL.g:2635:1: ( 'satisfied' )
            {
            // InternalInfluenceDSL.g:2635:1: ( 'satisfied' )
            // InternalInfluenceDSL.g:2636:2: 'satisfied'
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
    // InternalInfluenceDSL.g:2645:1: rule__RequirementSatisfaction__Group__8 : rule__RequirementSatisfaction__Group__8__Impl rule__RequirementSatisfaction__Group__9 ;
    public final void rule__RequirementSatisfaction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2649:1: ( rule__RequirementSatisfaction__Group__8__Impl rule__RequirementSatisfaction__Group__9 )
            // InternalInfluenceDSL.g:2650:2: rule__RequirementSatisfaction__Group__8__Impl rule__RequirementSatisfaction__Group__9
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
    // InternalInfluenceDSL.g:2657:1: rule__RequirementSatisfaction__Group__8__Impl : ( 'when' ) ;
    public final void rule__RequirementSatisfaction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2661:1: ( ( 'when' ) )
            // InternalInfluenceDSL.g:2662:1: ( 'when' )
            {
            // InternalInfluenceDSL.g:2662:1: ( 'when' )
            // InternalInfluenceDSL.g:2663:2: 'when'
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
    // InternalInfluenceDSL.g:2672:1: rule__RequirementSatisfaction__Group__9 : rule__RequirementSatisfaction__Group__9__Impl rule__RequirementSatisfaction__Group__10 ;
    public final void rule__RequirementSatisfaction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2676:1: ( rule__RequirementSatisfaction__Group__9__Impl rule__RequirementSatisfaction__Group__10 )
            // InternalInfluenceDSL.g:2677:2: rule__RequirementSatisfaction__Group__9__Impl rule__RequirementSatisfaction__Group__10
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
    // InternalInfluenceDSL.g:2684:1: rule__RequirementSatisfaction__Group__9__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) ) ;
    public final void rule__RequirementSatisfaction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2688:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) ) )
            // InternalInfluenceDSL.g:2689:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) )
            {
            // InternalInfluenceDSL.g:2689:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_9 ) )
            // InternalInfluenceDSL.g:2690:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_9 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_9()); 
            // InternalInfluenceDSL.g:2691:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_9 )
            // InternalInfluenceDSL.g:2691:3: rule__RequirementSatisfaction__SatisfactionAssignment_9
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
    // InternalInfluenceDSL.g:2699:1: rule__RequirementSatisfaction__Group__10 : rule__RequirementSatisfaction__Group__10__Impl ;
    public final void rule__RequirementSatisfaction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2703:1: ( rule__RequirementSatisfaction__Group__10__Impl )
            // InternalInfluenceDSL.g:2704:2: rule__RequirementSatisfaction__Group__10__Impl
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
    // InternalInfluenceDSL.g:2710:1: rule__RequirementSatisfaction__Group__10__Impl : ( ( rule__RequirementSatisfaction__Group_10__0 )* ) ;
    public final void rule__RequirementSatisfaction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2714:1: ( ( ( rule__RequirementSatisfaction__Group_10__0 )* ) )
            // InternalInfluenceDSL.g:2715:1: ( ( rule__RequirementSatisfaction__Group_10__0 )* )
            {
            // InternalInfluenceDSL.g:2715:1: ( ( rule__RequirementSatisfaction__Group_10__0 )* )
            // InternalInfluenceDSL.g:2716:2: ( rule__RequirementSatisfaction__Group_10__0 )*
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getGroup_10()); 
            // InternalInfluenceDSL.g:2717:2: ( rule__RequirementSatisfaction__Group_10__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalInfluenceDSL.g:2717:3: rule__RequirementSatisfaction__Group_10__0
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
    // InternalInfluenceDSL.g:2726:1: rule__RequirementSatisfaction__Group_10__0 : rule__RequirementSatisfaction__Group_10__0__Impl rule__RequirementSatisfaction__Group_10__1 ;
    public final void rule__RequirementSatisfaction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2730:1: ( rule__RequirementSatisfaction__Group_10__0__Impl rule__RequirementSatisfaction__Group_10__1 )
            // InternalInfluenceDSL.g:2731:2: rule__RequirementSatisfaction__Group_10__0__Impl rule__RequirementSatisfaction__Group_10__1
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
    // InternalInfluenceDSL.g:2738:1: rule__RequirementSatisfaction__Group_10__0__Impl : ( ',' ) ;
    public final void rule__RequirementSatisfaction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2742:1: ( ( ',' ) )
            // InternalInfluenceDSL.g:2743:1: ( ',' )
            {
            // InternalInfluenceDSL.g:2743:1: ( ',' )
            // InternalInfluenceDSL.g:2744:2: ','
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
    // InternalInfluenceDSL.g:2753:1: rule__RequirementSatisfaction__Group_10__1 : rule__RequirementSatisfaction__Group_10__1__Impl ;
    public final void rule__RequirementSatisfaction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2757:1: ( rule__RequirementSatisfaction__Group_10__1__Impl )
            // InternalInfluenceDSL.g:2758:2: rule__RequirementSatisfaction__Group_10__1__Impl
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
    // InternalInfluenceDSL.g:2764:1: rule__RequirementSatisfaction__Group_10__1__Impl : ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) ) ;
    public final void rule__RequirementSatisfaction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2768:1: ( ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) ) )
            // InternalInfluenceDSL.g:2769:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) )
            {
            // InternalInfluenceDSL.g:2769:1: ( ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 ) )
            // InternalInfluenceDSL.g:2770:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 )
            {
             before(grammarAccess.getRequirementSatisfactionAccess().getSatisfactionAssignment_10_1()); 
            // InternalInfluenceDSL.g:2771:2: ( rule__RequirementSatisfaction__SatisfactionAssignment_10_1 )
            // InternalInfluenceDSL.g:2771:3: rule__RequirementSatisfaction__SatisfactionAssignment_10_1
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
    // InternalInfluenceDSL.g:2780:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2784:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // InternalInfluenceDSL.g:2785:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalInfluenceDSL.g:2792:1: rule__Artifact__Group__0__Impl : ( () ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2796:1: ( ( () ) )
            // InternalInfluenceDSL.g:2797:1: ( () )
            {
            // InternalInfluenceDSL.g:2797:1: ( () )
            // InternalInfluenceDSL.g:2798:2: ()
            {
             before(grammarAccess.getArtifactAccess().getArtifactAction_0()); 
            // InternalInfluenceDSL.g:2799:2: ()
            // InternalInfluenceDSL.g:2799:3: 
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
    // InternalInfluenceDSL.g:2807:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2811:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // InternalInfluenceDSL.g:2812:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
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
    // InternalInfluenceDSL.g:2819:1: rule__Artifact__Group__1__Impl : ( 'Artifact' ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2823:1: ( ( 'Artifact' ) )
            // InternalInfluenceDSL.g:2824:1: ( 'Artifact' )
            {
            // InternalInfluenceDSL.g:2824:1: ( 'Artifact' )
            // InternalInfluenceDSL.g:2825:2: 'Artifact'
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
    // InternalInfluenceDSL.g:2834:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2838:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // InternalInfluenceDSL.g:2839:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalInfluenceDSL.g:2846:1: rule__Artifact__Group__2__Impl : ( ( rule__Artifact__NameAssignment_2 ) ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2850:1: ( ( ( rule__Artifact__NameAssignment_2 ) ) )
            // InternalInfluenceDSL.g:2851:1: ( ( rule__Artifact__NameAssignment_2 ) )
            {
            // InternalInfluenceDSL.g:2851:1: ( ( rule__Artifact__NameAssignment_2 ) )
            // InternalInfluenceDSL.g:2852:2: ( rule__Artifact__NameAssignment_2 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_2()); 
            // InternalInfluenceDSL.g:2853:2: ( rule__Artifact__NameAssignment_2 )
            // InternalInfluenceDSL.g:2853:3: rule__Artifact__NameAssignment_2
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
    // InternalInfluenceDSL.g:2861:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2865:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // InternalInfluenceDSL.g:2866:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
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
    // InternalInfluenceDSL.g:2873:1: rule__Artifact__Group__3__Impl : ( '->' ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2877:1: ( ( '->' ) )
            // InternalInfluenceDSL.g:2878:1: ( '->' )
            {
            // InternalInfluenceDSL.g:2878:1: ( '->' )
            // InternalInfluenceDSL.g:2879:2: '->'
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
    // InternalInfluenceDSL.g:2888:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2892:1: ( rule__Artifact__Group__4__Impl )
            // InternalInfluenceDSL.g:2893:2: rule__Artifact__Group__4__Impl
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
    // InternalInfluenceDSL.g:2899:1: rule__Artifact__Group__4__Impl : ( ( rule__Artifact__RefAssignment_4 ) ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2903:1: ( ( ( rule__Artifact__RefAssignment_4 ) ) )
            // InternalInfluenceDSL.g:2904:1: ( ( rule__Artifact__RefAssignment_4 ) )
            {
            // InternalInfluenceDSL.g:2904:1: ( ( rule__Artifact__RefAssignment_4 ) )
            // InternalInfluenceDSL.g:2905:2: ( rule__Artifact__RefAssignment_4 )
            {
             before(grammarAccess.getArtifactAccess().getRefAssignment_4()); 
            // InternalInfluenceDSL.g:2906:2: ( rule__Artifact__RefAssignment_4 )
            // InternalInfluenceDSL.g:2906:3: rule__Artifact__RefAssignment_4
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
    // InternalInfluenceDSL.g:2915:1: rule__SystemResponse__Group__0 : rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 ;
    public final void rule__SystemResponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2919:1: ( rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1 )
            // InternalInfluenceDSL.g:2920:2: rule__SystemResponse__Group__0__Impl rule__SystemResponse__Group__1
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
    // InternalInfluenceDSL.g:2927:1: rule__SystemResponse__Group__0__Impl : ( () ) ;
    public final void rule__SystemResponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2931:1: ( ( () ) )
            // InternalInfluenceDSL.g:2932:1: ( () )
            {
            // InternalInfluenceDSL.g:2932:1: ( () )
            // InternalInfluenceDSL.g:2933:2: ()
            {
             before(grammarAccess.getSystemResponseAccess().getSystemResponseAction_0()); 
            // InternalInfluenceDSL.g:2934:2: ()
            // InternalInfluenceDSL.g:2934:3: 
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
    // InternalInfluenceDSL.g:2942:1: rule__SystemResponse__Group__1 : rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 ;
    public final void rule__SystemResponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2946:1: ( rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2 )
            // InternalInfluenceDSL.g:2947:2: rule__SystemResponse__Group__1__Impl rule__SystemResponse__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalInfluenceDSL.g:2954:1: rule__SystemResponse__Group__1__Impl : ( 'system' ) ;
    public final void rule__SystemResponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2958:1: ( ( 'system' ) )
            // InternalInfluenceDSL.g:2959:1: ( 'system' )
            {
            // InternalInfluenceDSL.g:2959:1: ( 'system' )
            // InternalInfluenceDSL.g:2960:2: 'system'
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
    // InternalInfluenceDSL.g:2969:1: rule__SystemResponse__Group__2 : rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 ;
    public final void rule__SystemResponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2973:1: ( rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3 )
            // InternalInfluenceDSL.g:2974:2: rule__SystemResponse__Group__2__Impl rule__SystemResponse__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalInfluenceDSL.g:2981:1: rule__SystemResponse__Group__2__Impl : ( 'response' ) ;
    public final void rule__SystemResponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:2985:1: ( ( 'response' ) )
            // InternalInfluenceDSL.g:2986:1: ( 'response' )
            {
            // InternalInfluenceDSL.g:2986:1: ( 'response' )
            // InternalInfluenceDSL.g:2987:2: 'response'
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
    // InternalInfluenceDSL.g:2996:1: rule__SystemResponse__Group__3 : rule__SystemResponse__Group__3__Impl ;
    public final void rule__SystemResponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3000:1: ( rule__SystemResponse__Group__3__Impl )
            // InternalInfluenceDSL.g:3001:2: rule__SystemResponse__Group__3__Impl
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
    // InternalInfluenceDSL.g:3007:1: rule__SystemResponse__Group__3__Impl : ( ( rule__SystemResponse__Group_3__0 )? ) ;
    public final void rule__SystemResponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3011:1: ( ( ( rule__SystemResponse__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:3012:1: ( ( rule__SystemResponse__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:3012:1: ( ( rule__SystemResponse__Group_3__0 )? )
            // InternalInfluenceDSL.g:3013:2: ( rule__SystemResponse__Group_3__0 )?
            {
             before(grammarAccess.getSystemResponseAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:3014:2: ( rule__SystemResponse__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInfluenceDSL.g:3014:3: rule__SystemResponse__Group_3__0
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
    // InternalInfluenceDSL.g:3023:1: rule__SystemResponse__Group_3__0 : rule__SystemResponse__Group_3__0__Impl rule__SystemResponse__Group_3__1 ;
    public final void rule__SystemResponse__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3027:1: ( rule__SystemResponse__Group_3__0__Impl rule__SystemResponse__Group_3__1 )
            // InternalInfluenceDSL.g:3028:2: rule__SystemResponse__Group_3__0__Impl rule__SystemResponse__Group_3__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalInfluenceDSL.g:3035:1: rule__SystemResponse__Group_3__0__Impl : ( 'resulting' ) ;
    public final void rule__SystemResponse__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3039:1: ( ( 'resulting' ) )
            // InternalInfluenceDSL.g:3040:1: ( 'resulting' )
            {
            // InternalInfluenceDSL.g:3040:1: ( 'resulting' )
            // InternalInfluenceDSL.g:3041:2: 'resulting'
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
    // InternalInfluenceDSL.g:3050:1: rule__SystemResponse__Group_3__1 : rule__SystemResponse__Group_3__1__Impl rule__SystemResponse__Group_3__2 ;
    public final void rule__SystemResponse__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3054:1: ( rule__SystemResponse__Group_3__1__Impl rule__SystemResponse__Group_3__2 )
            // InternalInfluenceDSL.g:3055:2: rule__SystemResponse__Group_3__1__Impl rule__SystemResponse__Group_3__2
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
    // InternalInfluenceDSL.g:3062:1: rule__SystemResponse__Group_3__1__Impl : ( 'in' ) ;
    public final void rule__SystemResponse__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3066:1: ( ( 'in' ) )
            // InternalInfluenceDSL.g:3067:1: ( 'in' )
            {
            // InternalInfluenceDSL.g:3067:1: ( 'in' )
            // InternalInfluenceDSL.g:3068:2: 'in'
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
    // InternalInfluenceDSL.g:3077:1: rule__SystemResponse__Group_3__2 : rule__SystemResponse__Group_3__2__Impl ;
    public final void rule__SystemResponse__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3081:1: ( rule__SystemResponse__Group_3__2__Impl )
            // InternalInfluenceDSL.g:3082:2: rule__SystemResponse__Group_3__2__Impl
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
    // InternalInfluenceDSL.g:3088:1: rule__SystemResponse__Group_3__2__Impl : ( ( rule__SystemResponse__ObservationAssignment_3_2 ) ) ;
    public final void rule__SystemResponse__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3092:1: ( ( ( rule__SystemResponse__ObservationAssignment_3_2 ) ) )
            // InternalInfluenceDSL.g:3093:1: ( ( rule__SystemResponse__ObservationAssignment_3_2 ) )
            {
            // InternalInfluenceDSL.g:3093:1: ( ( rule__SystemResponse__ObservationAssignment_3_2 ) )
            // InternalInfluenceDSL.g:3094:2: ( rule__SystemResponse__ObservationAssignment_3_2 )
            {
             before(grammarAccess.getSystemResponseAccess().getObservationAssignment_3_2()); 
            // InternalInfluenceDSL.g:3095:2: ( rule__SystemResponse__ObservationAssignment_3_2 )
            // InternalInfluenceDSL.g:3095:3: rule__SystemResponse__ObservationAssignment_3_2
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
    // InternalInfluenceDSL.g:3104:1: rule__EmergentBehavior__Group__0 : rule__EmergentBehavior__Group__0__Impl rule__EmergentBehavior__Group__1 ;
    public final void rule__EmergentBehavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3108:1: ( rule__EmergentBehavior__Group__0__Impl rule__EmergentBehavior__Group__1 )
            // InternalInfluenceDSL.g:3109:2: rule__EmergentBehavior__Group__0__Impl rule__EmergentBehavior__Group__1
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
    // InternalInfluenceDSL.g:3116:1: rule__EmergentBehavior__Group__0__Impl : ( () ) ;
    public final void rule__EmergentBehavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3120:1: ( ( () ) )
            // InternalInfluenceDSL.g:3121:1: ( () )
            {
            // InternalInfluenceDSL.g:3121:1: ( () )
            // InternalInfluenceDSL.g:3122:2: ()
            {
             before(grammarAccess.getEmergentBehaviorAccess().getEmergentBehaviorAction_0()); 
            // InternalInfluenceDSL.g:3123:2: ()
            // InternalInfluenceDSL.g:3123:3: 
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
    // InternalInfluenceDSL.g:3131:1: rule__EmergentBehavior__Group__1 : rule__EmergentBehavior__Group__1__Impl rule__EmergentBehavior__Group__2 ;
    public final void rule__EmergentBehavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3135:1: ( rule__EmergentBehavior__Group__1__Impl rule__EmergentBehavior__Group__2 )
            // InternalInfluenceDSL.g:3136:2: rule__EmergentBehavior__Group__1__Impl rule__EmergentBehavior__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalInfluenceDSL.g:3143:1: rule__EmergentBehavior__Group__1__Impl : ( 'Emergent' ) ;
    public final void rule__EmergentBehavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3147:1: ( ( 'Emergent' ) )
            // InternalInfluenceDSL.g:3148:1: ( 'Emergent' )
            {
            // InternalInfluenceDSL.g:3148:1: ( 'Emergent' )
            // InternalInfluenceDSL.g:3149:2: 'Emergent'
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
    // InternalInfluenceDSL.g:3158:1: rule__EmergentBehavior__Group__2 : rule__EmergentBehavior__Group__2__Impl rule__EmergentBehavior__Group__3 ;
    public final void rule__EmergentBehavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3162:1: ( rule__EmergentBehavior__Group__2__Impl rule__EmergentBehavior__Group__3 )
            // InternalInfluenceDSL.g:3163:2: rule__EmergentBehavior__Group__2__Impl rule__EmergentBehavior__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalInfluenceDSL.g:3170:1: rule__EmergentBehavior__Group__2__Impl : ( 'Behavior' ) ;
    public final void rule__EmergentBehavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3174:1: ( ( 'Behavior' ) )
            // InternalInfluenceDSL.g:3175:1: ( 'Behavior' )
            {
            // InternalInfluenceDSL.g:3175:1: ( 'Behavior' )
            // InternalInfluenceDSL.g:3176:2: 'Behavior'
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
    // InternalInfluenceDSL.g:3185:1: rule__EmergentBehavior__Group__3 : rule__EmergentBehavior__Group__3__Impl ;
    public final void rule__EmergentBehavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3189:1: ( rule__EmergentBehavior__Group__3__Impl )
            // InternalInfluenceDSL.g:3190:2: rule__EmergentBehavior__Group__3__Impl
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
    // InternalInfluenceDSL.g:3196:1: rule__EmergentBehavior__Group__3__Impl : ( ( rule__EmergentBehavior__Group_3__0 )? ) ;
    public final void rule__EmergentBehavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3200:1: ( ( ( rule__EmergentBehavior__Group_3__0 )? ) )
            // InternalInfluenceDSL.g:3201:1: ( ( rule__EmergentBehavior__Group_3__0 )? )
            {
            // InternalInfluenceDSL.g:3201:1: ( ( rule__EmergentBehavior__Group_3__0 )? )
            // InternalInfluenceDSL.g:3202:2: ( rule__EmergentBehavior__Group_3__0 )?
            {
             before(grammarAccess.getEmergentBehaviorAccess().getGroup_3()); 
            // InternalInfluenceDSL.g:3203:2: ( rule__EmergentBehavior__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalInfluenceDSL.g:3203:3: rule__EmergentBehavior__Group_3__0
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
    // InternalInfluenceDSL.g:3212:1: rule__EmergentBehavior__Group_3__0 : rule__EmergentBehavior__Group_3__0__Impl rule__EmergentBehavior__Group_3__1 ;
    public final void rule__EmergentBehavior__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3216:1: ( rule__EmergentBehavior__Group_3__0__Impl rule__EmergentBehavior__Group_3__1 )
            // InternalInfluenceDSL.g:3217:2: rule__EmergentBehavior__Group_3__0__Impl rule__EmergentBehavior__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalInfluenceDSL.g:3224:1: rule__EmergentBehavior__Group_3__0__Impl : ( 'characterized' ) ;
    public final void rule__EmergentBehavior__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3228:1: ( ( 'characterized' ) )
            // InternalInfluenceDSL.g:3229:1: ( 'characterized' )
            {
            // InternalInfluenceDSL.g:3229:1: ( 'characterized' )
            // InternalInfluenceDSL.g:3230:2: 'characterized'
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
    // InternalInfluenceDSL.g:3239:1: rule__EmergentBehavior__Group_3__1 : rule__EmergentBehavior__Group_3__1__Impl rule__EmergentBehavior__Group_3__2 ;
    public final void rule__EmergentBehavior__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3243:1: ( rule__EmergentBehavior__Group_3__1__Impl rule__EmergentBehavior__Group_3__2 )
            // InternalInfluenceDSL.g:3244:2: rule__EmergentBehavior__Group_3__1__Impl rule__EmergentBehavior__Group_3__2
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
    // InternalInfluenceDSL.g:3251:1: rule__EmergentBehavior__Group_3__1__Impl : ( 'by' ) ;
    public final void rule__EmergentBehavior__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3255:1: ( ( 'by' ) )
            // InternalInfluenceDSL.g:3256:1: ( 'by' )
            {
            // InternalInfluenceDSL.g:3256:1: ( 'by' )
            // InternalInfluenceDSL.g:3257:2: 'by'
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
    // InternalInfluenceDSL.g:3266:1: rule__EmergentBehavior__Group_3__2 : rule__EmergentBehavior__Group_3__2__Impl ;
    public final void rule__EmergentBehavior__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3270:1: ( rule__EmergentBehavior__Group_3__2__Impl )
            // InternalInfluenceDSL.g:3271:2: rule__EmergentBehavior__Group_3__2__Impl
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
    // InternalInfluenceDSL.g:3277:1: rule__EmergentBehavior__Group_3__2__Impl : ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) ) ;
    public final void rule__EmergentBehavior__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3281:1: ( ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) ) )
            // InternalInfluenceDSL.g:3282:1: ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) )
            {
            // InternalInfluenceDSL.g:3282:1: ( ( rule__EmergentBehavior__DescriptionAssignment_3_2 ) )
            // InternalInfluenceDSL.g:3283:2: ( rule__EmergentBehavior__DescriptionAssignment_3_2 )
            {
             before(grammarAccess.getEmergentBehaviorAccess().getDescriptionAssignment_3_2()); 
            // InternalInfluenceDSL.g:3284:2: ( rule__EmergentBehavior__DescriptionAssignment_3_2 )
            // InternalInfluenceDSL.g:3284:3: rule__EmergentBehavior__DescriptionAssignment_3_2
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


    // $ANTLR start "rule__InfluenceModel__NameAssignment_2"
    // InternalInfluenceDSL.g:3293:1: rule__InfluenceModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InfluenceModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3297:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3298:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3298:2: ( ruleEString )
            // InternalInfluenceDSL.g:3299:3: ruleEString
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
    // InternalInfluenceDSL.g:3308:1: rule__InfluenceModel__OwnedArtifactsAssignment_3_0 : ( ruleArtifact ) ;
    public final void rule__InfluenceModel__OwnedArtifactsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3312:1: ( ( ruleArtifact ) )
            // InternalInfluenceDSL.g:3313:2: ( ruleArtifact )
            {
            // InternalInfluenceDSL.g:3313:2: ( ruleArtifact )
            // InternalInfluenceDSL.g:3314:3: ruleArtifact
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
    // InternalInfluenceDSL.g:3323:1: rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1 : ( ruleRequirementSatisfaction ) ;
    public final void rule__InfluenceModel__OwnedRequirementSatisfactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3327:1: ( ( ruleRequirementSatisfaction ) )
            // InternalInfluenceDSL.g:3328:2: ( ruleRequirementSatisfaction )
            {
            // InternalInfluenceDSL.g:3328:2: ( ruleRequirementSatisfaction )
            // InternalInfluenceDSL.g:3329:3: ruleRequirementSatisfaction
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
    // InternalInfluenceDSL.g:3338:1: rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2 : ( ruleCyberPhysicalPhenomena ) ;
    public final void rule__InfluenceModel__OwnedCyberPhysicalPhenomenaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3342:1: ( ( ruleCyberPhysicalPhenomena ) )
            // InternalInfluenceDSL.g:3343:2: ( ruleCyberPhysicalPhenomena )
            {
            // InternalInfluenceDSL.g:3343:2: ( ruleCyberPhysicalPhenomena )
            // InternalInfluenceDSL.g:3344:3: ruleCyberPhysicalPhenomena
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
    // InternalInfluenceDSL.g:3353:1: rule__InfluenceModel__OwnedInfluencesAssignment_3_3 : ( ruleInfluence ) ;
    public final void rule__InfluenceModel__OwnedInfluencesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3357:1: ( ( ruleInfluence ) )
            // InternalInfluenceDSL.g:3358:2: ( ruleInfluence )
            {
            // InternalInfluenceDSL.g:3358:2: ( ruleInfluence )
            // InternalInfluenceDSL.g:3359:3: ruleInfluence
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
    // InternalInfluenceDSL.g:3368:1: rule__MultiPhenomenon__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MultiPhenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3372:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3373:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3373:2: ( ruleEString )
            // InternalInfluenceDSL.g:3374:3: ruleEString
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
    // InternalInfluenceDSL.g:3383:1: rule__MultiPhenomenon__AggregationOfAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiPhenomenon__AggregationOfAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3387:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3388:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3388:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3389:3: ( ruleEString )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_1_0()); 
            // InternalInfluenceDSL.g:3390:3: ( ruleEString )
            // InternalInfluenceDSL.g:3391:4: ruleEString
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
    // InternalInfluenceDSL.g:3402:1: rule__MultiPhenomenon__AggregationOfAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiPhenomenon__AggregationOfAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3406:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3407:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3407:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3408:3: ( ruleEString )
            {
             before(grammarAccess.getMultiPhenomenonAccess().getAggregationOfCyberPhysicalPhenomenaCrossReference_3_2_1_0()); 
            // InternalInfluenceDSL.g:3409:3: ( ruleEString )
            // InternalInfluenceDSL.g:3410:4: ruleEString
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
    // InternalInfluenceDSL.g:3421:1: rule__MultiPhenomenon__ConfigurationAssignment_4_1 : ( ruleEString ) ;
    public final void rule__MultiPhenomenon__ConfigurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3425:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3426:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3426:2: ( ruleEString )
            // InternalInfluenceDSL.g:3427:3: ruleEString
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
    // InternalInfluenceDSL.g:3436:1: rule__MultiPhenomenon__ConfigurationAssignment_4_2_1 : ( ruleEString ) ;
    public final void rule__MultiPhenomenon__ConfigurationAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3440:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3441:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3441:2: ( ruleEString )
            // InternalInfluenceDSL.g:3442:3: ruleEString
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
    // InternalInfluenceDSL.g:3451:1: rule__SimplePhenomenon__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimplePhenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3455:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3456:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3456:2: ( ruleEString )
            // InternalInfluenceDSL.g:3457:3: ruleEString
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
    // InternalInfluenceDSL.g:3466:1: rule__SimplePhenomenon__ConfigurationAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SimplePhenomenon__ConfigurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3470:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3471:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3471:2: ( ruleEString )
            // InternalInfluenceDSL.g:3472:3: ruleEString
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
    // InternalInfluenceDSL.g:3481:1: rule__SimplePhenomenon__ConfigurationAssignment_3_2_1 : ( ruleEString ) ;
    public final void rule__SimplePhenomenon__ConfigurationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3485:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3486:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3486:2: ( ruleEString )
            // InternalInfluenceDSL.g:3487:3: ruleEString
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
    // InternalInfluenceDSL.g:3496:1: rule__Influence__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3500:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3501:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3501:2: ( ruleEString )
            // InternalInfluenceDSL.g:3502:3: ruleEString
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
    // InternalInfluenceDSL.g:3511:1: rule__Influence__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Influence__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3515:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3516:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3516:2: ( ruleEString )
            // InternalInfluenceDSL.g:3517:3: ruleEString
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
    // InternalInfluenceDSL.g:3526:1: rule__Influence__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__Influence__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3530:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3531:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3531:2: ( ruleEString )
            // InternalInfluenceDSL.g:3532:3: ruleEString
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
    // InternalInfluenceDSL.g:3541:1: rule__Influence__SourceArtifactAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__SourceArtifactAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3545:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3546:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3546:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3547:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_7_0()); 
            // InternalInfluenceDSL.g:3548:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3549:4: RULE_ID
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
    // InternalInfluenceDSL.g:3560:1: rule__Influence__SourceArtifactAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__SourceArtifactAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3564:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3565:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3565:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3566:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getSourceArtifactArtifactCrossReference_8_1_0()); 
            // InternalInfluenceDSL.g:3567:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3568:4: RULE_ID
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
    // InternalInfluenceDSL.g:3579:1: rule__Influence__SourcePhenomenaAssignment_12 : ( ( ruleEString ) ) ;
    public final void rule__Influence__SourcePhenomenaAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3583:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3584:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3584:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3585:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_12_0()); 
            // InternalInfluenceDSL.g:3586:3: ( ruleEString )
            // InternalInfluenceDSL.g:3587:4: ruleEString
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
    // InternalInfluenceDSL.g:3598:1: rule__Influence__SourcePhenomenaAssignment_13_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__SourcePhenomenaAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3602:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3603:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3603:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3604:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getSourcePhenomenaCyberPhysicalPhenomenaCrossReference_13_1_0()); 
            // InternalInfluenceDSL.g:3605:3: ( ruleEString )
            // InternalInfluenceDSL.g:3606:4: ruleEString
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
    // InternalInfluenceDSL.g:3617:1: rule__Influence__ProducesAssignment_15 : ( ruleEmergentBehavior ) ;
    public final void rule__Influence__ProducesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3621:1: ( ( ruleEmergentBehavior ) )
            // InternalInfluenceDSL.g:3622:2: ( ruleEmergentBehavior )
            {
            // InternalInfluenceDSL.g:3622:2: ( ruleEmergentBehavior )
            // InternalInfluenceDSL.g:3623:3: ruleEmergentBehavior
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
    // InternalInfluenceDSL.g:3632:1: rule__Influence__ProducesAssignment_16_1 : ( ruleEmergentBehavior ) ;
    public final void rule__Influence__ProducesAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3636:1: ( ( ruleEmergentBehavior ) )
            // InternalInfluenceDSL.g:3637:2: ( ruleEmergentBehavior )
            {
            // InternalInfluenceDSL.g:3637:2: ( ruleEmergentBehavior )
            // InternalInfluenceDSL.g:3638:3: ruleEmergentBehavior
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
    // InternalInfluenceDSL.g:3647:1: rule__Influence__AffectsAssignment_19 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3651:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3652:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3652:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3653:3: ruleSystemResponse
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
    // InternalInfluenceDSL.g:3662:1: rule__Influence__AffectsAssignment_20_1 : ( ruleSystemResponse ) ;
    public final void rule__Influence__AffectsAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3666:1: ( ( ruleSystemResponse ) )
            // InternalInfluenceDSL.g:3667:2: ( ruleSystemResponse )
            {
            // InternalInfluenceDSL.g:3667:2: ( ruleSystemResponse )
            // InternalInfluenceDSL.g:3668:3: ruleSystemResponse
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
    // InternalInfluenceDSL.g:3677:1: rule__Influence__EvaluatedByAssignment_24 : ( ( ruleEString ) ) ;
    public final void rule__Influence__EvaluatedByAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3681:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3682:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3682:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3683:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_24_0()); 
            // InternalInfluenceDSL.g:3684:3: ( ruleEString )
            // InternalInfluenceDSL.g:3685:4: ruleEString
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
    // InternalInfluenceDSL.g:3696:1: rule__Influence__EvaluatedByAssignment_25_1 : ( ( ruleEString ) ) ;
    public final void rule__Influence__EvaluatedByAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3700:1: ( ( ( ruleEString ) ) )
            // InternalInfluenceDSL.g:3701:2: ( ( ruleEString ) )
            {
            // InternalInfluenceDSL.g:3701:2: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3702:3: ( ruleEString )
            {
             before(grammarAccess.getInfluenceAccess().getEvaluatedByRequirementSatisfactionCrossReference_25_1_0()); 
            // InternalInfluenceDSL.g:3703:3: ( ruleEString )
            // InternalInfluenceDSL.g:3704:4: ruleEString
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
    // InternalInfluenceDSL.g:3715:1: rule__Influence__TargetArtifactAssignment_32 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__TargetArtifactAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3719:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3720:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3720:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3721:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_32_0()); 
            // InternalInfluenceDSL.g:3722:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3723:4: RULE_ID
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactIDTerminalRuleCall_32_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactIDTerminalRuleCall_32_0_1()); 

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
    // InternalInfluenceDSL.g:3734:1: rule__Influence__TargetArtifactAssignment_33_1 : ( ( RULE_ID ) ) ;
    public final void rule__Influence__TargetArtifactAssignment_33_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3738:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3739:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3739:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3740:3: ( RULE_ID )
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactCrossReference_33_1_0()); 
            // InternalInfluenceDSL.g:3741:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3742:4: RULE_ID
            {
             before(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactIDTerminalRuleCall_33_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfluenceAccess().getTargetArtifactArtifactIDTerminalRuleCall_33_1_0_1()); 

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
    // InternalInfluenceDSL.g:3753:1: rule__RequirementSatisfaction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3757:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3758:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3758:2: ( ruleEString )
            // InternalInfluenceDSL.g:3759:3: ruleEString
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
    // InternalInfluenceDSL.g:3768:1: rule__RequirementSatisfaction__ConcerningRequirementAssignment_6 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__ConcerningRequirementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3772:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3773:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3773:2: ( ruleEString )
            // InternalInfluenceDSL.g:3774:3: ruleEString
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
    // InternalInfluenceDSL.g:3783:1: rule__RequirementSatisfaction__SatisfactionAssignment_9 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3787:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3788:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3788:2: ( ruleEString )
            // InternalInfluenceDSL.g:3789:3: ruleEString
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
    // InternalInfluenceDSL.g:3798:1: rule__RequirementSatisfaction__SatisfactionAssignment_10_1 : ( ruleEString ) ;
    public final void rule__RequirementSatisfaction__SatisfactionAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3802:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3803:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3803:2: ( ruleEString )
            // InternalInfluenceDSL.g:3804:3: ruleEString
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
    // InternalInfluenceDSL.g:3813:1: rule__Artifact__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Artifact__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3817:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3818:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3818:2: ( ruleEString )
            // InternalInfluenceDSL.g:3819:3: ruleEString
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
    // InternalInfluenceDSL.g:3828:1: rule__Artifact__RefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Artifact__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3832:1: ( ( ( RULE_ID ) ) )
            // InternalInfluenceDSL.g:3833:2: ( ( RULE_ID ) )
            {
            // InternalInfluenceDSL.g:3833:2: ( ( RULE_ID ) )
            // InternalInfluenceDSL.g:3834:3: ( RULE_ID )
            {
             before(grammarAccess.getArtifactAccess().getRefEObjectCrossReference_4_0()); 
            // InternalInfluenceDSL.g:3835:3: ( RULE_ID )
            // InternalInfluenceDSL.g:3836:4: RULE_ID
            {
             before(grammarAccess.getArtifactAccess().getRefEObjectIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getRefEObjectIDTerminalRuleCall_4_0_1()); 

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
    // InternalInfluenceDSL.g:3847:1: rule__SystemResponse__ObservationAssignment_3_2 : ( ruleEString ) ;
    public final void rule__SystemResponse__ObservationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3851:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3852:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3852:2: ( ruleEString )
            // InternalInfluenceDSL.g:3853:3: ruleEString
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
    // InternalInfluenceDSL.g:3862:1: rule__EmergentBehavior__DescriptionAssignment_3_2 : ( ruleEString ) ;
    public final void rule__EmergentBehavior__DescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfluenceDSL.g:3866:1: ( ( ruleEString ) )
            // InternalInfluenceDSL.g:3867:2: ( ruleEString )
            {
            // InternalInfluenceDSL.g:3867:2: ( ruleEString )
            // InternalInfluenceDSL.g:3868:3: ruleEString
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
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});

}