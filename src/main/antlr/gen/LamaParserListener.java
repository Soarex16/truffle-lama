// Generated from java-escape by ANTLR 4.11.1

package com.soarex.truffle.lama.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LamaParser}.
 */
public interface LamaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LamaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LamaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LamaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#scopeExpression}.
	 * @param ctx the parse tree
	 */
	void enterScopeExpression(LamaParser.ScopeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#scopeExpression}.
	 * @param ctx the parse tree
	 */
	void exitScopeExpression(LamaParser.ScopeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(LamaParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(LamaParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(LamaParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(LamaParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#variableDefinitionSequence}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionSequence(LamaParser.VariableDefinitionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#variableDefinitionSequence}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionSequence(LamaParser.VariableDefinitionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#variableDefinitionItem}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionItem(LamaParser.VariableDefinitionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#variableDefinitionItem}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionItem(LamaParser.VariableDefinitionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(LamaParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(LamaParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(LamaParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(LamaParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(LamaParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(LamaParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LamaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LamaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(LamaParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(LamaParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#assocExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssocExpression(LamaParser.AssocExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#assocExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssocExpression(LamaParser.AssocExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LamaParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LamaParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptySuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterEmptySuffix(LamaParser.EmptySuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptySuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitEmptySuffix(LamaParser.EmptySuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(LamaParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(LamaParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression(LamaParser.IndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression(LamaParser.IndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(LamaParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(LamaParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeNumberLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNegativeNumberLiteral(LamaParser.NegativeNumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeNumberLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNegativeNumberLiteral(LamaParser.NegativeNumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(LamaParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(LamaParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(LamaParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(LamaParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(LamaParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(LamaParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(LamaParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(LamaParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(LamaParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(LamaParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sExp}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSExp(LamaParser.SExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sExp}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSExp(LamaParser.SExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LamaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LamaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scope}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterScope(LamaParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scope}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitScope(LamaParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSkip(LamaParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSkip(LamaParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterConditional(LamaParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitConditional(LamaParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(LamaParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(LamaParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(LamaParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(LamaParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(LamaParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(LamaParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(LamaParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(LamaParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(LamaParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(LamaParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#caseBranches}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranches(LamaParser.CaseBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#caseBranches}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranches(LamaParser.CaseBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(LamaParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(LamaParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(LamaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(LamaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(LamaParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(LamaParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(LamaParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(LamaParser.ElsePartContext ctx);
}