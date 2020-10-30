package td3.ExoSupp.visitor;

import td3.ExoSupp.expressions.Addition;
import td3.ExoSupp.expressions.Literal;
import td3.ExoSupp.expressions.Subtraction;

public interface ExpressionVisitor<T> {

    void visitLiteral(Literal literal);
    void visitAddition(Addition addition);
    void visitSubtraction(Subtraction subtraction);

    T getResult();

}
