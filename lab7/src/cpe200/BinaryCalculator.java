package cpe200;

/**
 * Created by Nickky on 9/11/2559.
 */
public class BinaryCalculator {
    public IOperand firstOperand;
    public IOperand secondOperand;

    public BinaryCalculator() {
    }
    private int binaryToInt(String operand){
        return Integer.parseInt(operand,2);
    }

    public void setFirstOperand(IOperand operand) {
        for (int i=0; i<operand.getOperand().length(); i++){
            if (operand.getOperand().charAt(i) != '0'){
                if (operand.getOperand().charAt(i) != '1'){
                    throw new ArithmeticException();
                }
            }
        }
        firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        for (int i=0; i<operand.getOperand().length(); i++){
            if (operand.getOperand().charAt(i) != '0'){
                if (operand.getOperand().charAt(i) != '1'){
                    throw new ArithmeticException();
                }
            }
                    }
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        int first, second;
        first = binaryToInt(firstOperand.getOperand());
        second = binaryToInt(secondOperand.getOperand());
        return Integer.toBinaryString(first + second);
    }

    public String subtract() throws RuntimeException {
        int first, second;
        first = binaryToInt(firstOperand.getOperand());
        second = binaryToInt(secondOperand.getOperand());
        return Integer.toBinaryString(first - second);
    }

    public String multiply() throws RuntimeException {
        int first, second;
        first = binaryToInt(firstOperand.getOperand());
        second = binaryToInt(secondOperand.getOperand());
        return Integer.toBinaryString(first * second);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        int first, second;
            first = binaryToInt(firstOperand.getOperand());
            second = binaryToInt(secondOperand.getOperand());
        return Integer.toBinaryString(first / second);
    }

    public String power() throws RuntimeException {
        int first, second;
        first = binaryToInt(firstOperand.getOperand());
        second = binaryToInt(secondOperand.getOperand());
        return Integer.toBinaryString((int)Math.pow((double) first, (double) second));
    }



}
