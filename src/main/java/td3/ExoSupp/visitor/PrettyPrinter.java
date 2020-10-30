package td3.ExoSupp.visitor;

import td3.ExoSupp.expressions.Addition;
import td3.ExoSupp.expressions.Literal;
import td3.ExoSupp.expressions.Subtraction;

public class PrettyPrinter implements ExpressionVisitor<String> {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void visitLiteral(Literal literal) {
        buffer.append(literal.getValue());
    }

    @Override
    public void visitAddition(Addition addition) {
        buffer.append("(");
        addition.getLeft().accept(this);
        buffer.append( " + ");
        addition.getRight().accept(this);
        buffer.append(")");
    }

    @Override
    public void visitSubtraction(Subtraction subtraction) {
        buffer.append("(");
        subtraction.getLeft().accept(this);
        buffer.append( " - ");
        subtraction.getRight().accept(this);
        buffer.append(")");
    }

    @Override
    public String getResult() { return buffer.toString(); }
}
