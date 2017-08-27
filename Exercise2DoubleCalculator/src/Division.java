/**
 * Created by ilya on 27.08.17.
 */
public class Division extends BinaryExpression {
    @Override
    public double calculate() {
        return operandOne/operandTwo;
    }

    public Division(double operandOne, double operandTwo) {
        super(operandOne, operandTwo);
    }
}
