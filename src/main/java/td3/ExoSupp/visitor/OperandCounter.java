package td3.ExoSupp.visitor;

import td3.ExoSupp.expressions.Addition;
import td3.ExoSupp.expressions.Literal;
import td3.ExoSupp.expressions.Subtraction;

public class OperandCounter implements ExpressionVisitor<Integer> {

    private int counter = 0;

    @Override
    public void visitLiteral(Literal literal) { counter++; }

    @Override
    public void visitAddition(Addition addition) {
        addition.getLeft().accept(this);
        addition.getRight().accept(this);
    }

    @Override
    public void visitSubtraction(Subtraction subtraction) {
        subtraction.getLeft().accept(this);
        subtraction.getRight().accept(this);
    }

    @Override
    public Integer getResult() { return counter; }
}
