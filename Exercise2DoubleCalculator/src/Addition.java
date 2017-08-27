/**
 * Created by ilya on 27.08.17.
 */
public class Addition extends BinaryExpression {
    @Override
    public double calculate() {
        return operandOne+operandTwo;
    }

    public Addition(double operandOne, double operandTwo) {
        super(operandOne, operandTwo);
    }
}
