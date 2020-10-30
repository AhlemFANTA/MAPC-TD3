package td3.ExoSupp.expressions;

import td3.ExoSupp.visitor.ExpressionVisitor;

public class Addition extends BinaryOperation implements Expression {

    public Addition(Expression left, Expression right) { super(left, right); }

    @Override public void accept(ExpressionVisitor e) { e.visitAddition(this); }

}