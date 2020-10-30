package td3.ExoSupp.expressions;

import td3.ExoSupp.visitor.ExpressionVisitor;

public class Literal implements Expression  {

    private int value;

    public Literal(int value) { this.value = value; }

    public int getValue() { return value; }

    @Override public void accept(ExpressionVisitor e) { e.visitLiteral(this); }

}
