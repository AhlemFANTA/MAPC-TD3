package td3.ExoSupp.expressions;

import td3.ExoSupp.visitor.ExpressionVisitor;

public interface Expression {

    void accept(ExpressionVisitor e);

}