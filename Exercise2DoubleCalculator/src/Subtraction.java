/**
 * Created by ilya on 27.08.17.
 */
public class Subtraction extends BinaryExpression {

    @Override
    public double calculate() {
        return operandOne-operandTwo;
    }

    public Subtraction(double operandOne, double operandTwo) {
        super(operandOne, operandTwo);
    }
}
