/**
 * Created by ilya on 27.08.17.
 */
public class Multiplication extends BinaryExpression {
    @Override
    public double calculate() {
        return operandOne*operandTwo;
    }

    public Multiplication(double operandOne, double operandTwo) {
        super(operandOne, operandTwo);
    }
}
