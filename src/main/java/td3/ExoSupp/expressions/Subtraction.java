package td3.ExoSupp.expressions;

import td3.ExoSupp.visitor.ExpressionVisitor;

public class Subtraction extends BinaryOperation implements Expression {

    public Subtraction(Expression left, Expression right) { super(left, right); }

    @Override public void accept(ExpressionVisitor e) { e.visitSubtraction(this); }

}