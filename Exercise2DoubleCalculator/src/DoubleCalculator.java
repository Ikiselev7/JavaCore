import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ilya on 26.08.17.
 */
public class DoubleCalculator {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        DoubleCalculator calculator = new DoubleCalculator();

        ConsoleASCIIPrinter printer = new ConsoleASCIIPrinter();

        System.out.println("Hello! I'm double calculator");

        try {
            while(true){
                System.out.println("Please, enter the operation that you need to do(+,-,*,/) or \"exit\" to exit");
                String operator = bufferedReader.readLine();
                if("exit".equalsIgnoreCase(operator)) break;
                System.out.println("Please, enter operands (use space as delimeter)");
                String operands = bufferedReader.readLine();
                try {
                    double result = calculator.calculate(operator,operands.split(" "));
                    printer.print(Double.toString(result));
                } catch (CalculatorExeption calculatorExeption) {
                    System.out.println(calculatorExeption.getMessage());
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }



            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void check(String... args) throws CalculatorExeption {
        if(args.length>2){
            throw new CalculatorExeption("Too many operands");
        }else if(args.length<2){
            throw new CalculatorExeption("Not enough operands");
        }
    }

    private double[] parse(String argOne, String argTwo) throws NumberFormatException{
        double[] parsedOperands = new double[2];
        parsedOperands[0] = Double.parseDouble(argOne);
        parsedOperands[1] = Double.parseDouble(argTwo);
        return parsedOperands;
    }

    public double calculate(String operator, String... operands) throws CalculatorExeption {
        double calculationResult = 0;

        this.check(operands);

        double[] doubleOperands = this.parse(operands[0],operands[1]);


        switch (operator){
            case "+":
                calculationResult = doubleOperands[0]+doubleOperands[1];
                break;
            case "-":
                calculationResult = doubleOperands[0]-doubleOperands[1];
                break;
            case "*":
                calculationResult = doubleOperands[0]*doubleOperands[1];
                break;
            case"/":
                if(doubleOperands[1]==0) System.out.println("Bad gay, your divorsed by zero, but I still have a result");
                calculationResult = doubleOperands[0]/doubleOperands[1];
                break;
            default:
                throw new CalculatorExeption("Illegal operation");
        }

        //System.out.println(calculationResult);

        return calculationResult;
    }

}
