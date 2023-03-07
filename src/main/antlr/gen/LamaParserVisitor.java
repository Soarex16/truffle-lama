// Generated from java-escape by ANTLR 4.11.1

package com.soarex.truffle.lama.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LamaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LamaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LamaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LamaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#scopeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeExpression(LamaParser.ScopeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(LamaParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(LamaParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#variableDefinitionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitionSequence(LamaParser.VariableDefinitionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#variableDefinitionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitionItem(LamaParser.VariableDefinitionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(LamaParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(LamaParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(LamaParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LamaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(LamaParser.BasicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#assocExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssocExpression(LamaParser.AssocExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LamaParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptySuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptySuffix(LamaParser.EmptySuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(LamaParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpression(LamaParser.IndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(LamaParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeNumberLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeNumberLiteral(LamaParser.NegativeNumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(LamaParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(LamaParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(LamaParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(LamaParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(LamaParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sExp}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSExp(LamaParser.SExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LamaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scope}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(LamaParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(LamaParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(LamaParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(LamaParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(LamaParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(LamaParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(LamaParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(LamaParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#caseBranches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranches(LamaParser.CaseBranchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(LamaParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(LamaParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#ifThenElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(LamaParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamaParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(LamaParser.ElsePartContext ctx);
}