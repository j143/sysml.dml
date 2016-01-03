/*
 * generated by Xtext 2.9.0
 */
package sysml.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import sysml.services.DmlGrammarAccess;

@SuppressWarnings("all")
public class DmlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DmlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DI___LeftSquareBracketKeyword_0_1_0_CommaKeyword_0_1_2_RightSquareBracketKeyword_0_1_4__q;
	protected AbstractElementAlias match_ID___ColonColonKeyword_2_1_0_SINGLEIDTerminalRuleCall_2_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DmlGrammarAccess) access;
		match_DI___LeftSquareBracketKeyword_0_1_0_CommaKeyword_0_1_2_RightSquareBracketKeyword_0_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDIAccess().getLeftSquareBracketKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getDIAccess().getCommaKeyword_0_1_2()), new TokenAlias(false, false, grammarAccess.getDIAccess().getRightSquareBracketKeyword_0_1_4()));
		match_ID___ColonColonKeyword_2_1_0_SINGLEIDTerminalRuleCall_2_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getIDAccess().getColonColonKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getIDAccess().getSINGLEIDTerminalRuleCall_2_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getASRule())
			return getASToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getESRule())
			return getESToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSINGLEIDRule())
			return getSINGLEIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AS: ('<-' | '=');
	 */
	protected String getASToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<-";
	}
	
	/**
	 * terminal ES: ';';
	 */
	protected String getESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal SINGLEID:
	 * 	ALPHA(ALPHA|DIGIT|'_')*
	 * ;
	 */
	protected String getSINGLEIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DI___LeftSquareBracketKeyword_0_1_0_CommaKeyword_0_1_2_RightSquareBracketKeyword_0_1_4__q.equals(syntax))
				emit_DI___LeftSquareBracketKeyword_0_1_0_CommaKeyword_0_1_2_RightSquareBracketKeyword_0_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ID___ColonColonKeyword_2_1_0_SINGLEIDTerminalRuleCall_2_1_1__a.equals(syntax))
				emit_ID___ColonColonKeyword_2_1_0_SINGLEIDTerminalRuleCall_2_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('[' ',' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID (ambiguity) (rule end)
	 */
	protected void emit_DI___LeftSquareBracketKeyword_0_1_0_CommaKeyword_0_1_2_RightSquareBracketKeyword_0_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('::' SINGLEID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=SINGLEID (ambiguity) (rule end)
	 */
	protected void emit_ID___ColonColonKeyword_2_1_0_SINGLEIDTerminalRuleCall_2_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}