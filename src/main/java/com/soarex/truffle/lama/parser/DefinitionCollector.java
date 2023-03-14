package com.soarex.truffle.lama.parser;

import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.parser.LamaParserBaseVisitor;
import com.soarex.truffle.lama.parser.LamaParser.BasicExpressionContext;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

record VariableAssignment(String name, BasicExpressionContext value) {
}

public class DefinitionCollector extends LamaParserBaseVisitor<Void> {
    private final List<ParserRuleContext> definitions = new ArrayList<>();
    private final List<VariableAssignment> variableAssignments = new ArrayList<>();

    @Override
    public Void visitScopeExpression(LamaParser.ScopeExpressionContext ctx) {
        for (LamaParser.DefinitionContext def : ctx.defs) {
            visitDefinition(def);
        }
        return null;
    }

    @Override
    public Void visitFunctionDefinition(LamaParser.FunctionDefinitionContext ctx) {
        definitions.add(ctx);
        return null;
    }

    @Override
    public Void visitVariableDefinitionItem(LamaParser.VariableDefinitionItemContext ctx) {
        definitions.add(ctx);
        variableAssignments.add(new VariableAssignment(ctx.name.getText(), ctx.value));
        return null;
    }

    public List<ParserRuleContext> getDefinitions() {
        return definitions;
    }

    public List<VariableAssignment> getVariableAssignments() {
        return variableAssignments;
    }
}
