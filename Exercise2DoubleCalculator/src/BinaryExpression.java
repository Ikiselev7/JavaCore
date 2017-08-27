/**
 * Created by ilya on 27.08.17.
 */
public abstract class BinaryExpression {
    double operandOne;
    double operandTwo;

    public abstract double calculate();

    public BinaryExpression(double operandOne, double operandTwo) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
    }
}
