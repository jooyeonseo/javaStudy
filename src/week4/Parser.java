package week4;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        // Pattern.match() 사용
        // Calculator - setFirstNumebr 설정

        boolean check = Pattern.matches(NUMBER_REG, firstInput);
        if (!check) {
            throw new BadInputException("정수");
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        // setSecondNumber

        boolean check = Pattern.matches(NUMBER_REG, secondInput);
        if(!check) {
            throw new BadInputException("정수");
        }
        calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;

    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        // 연산자
        // setOperation

        boolean check = Pattern.matches(OPERATION_REG, operationInput);
        if(!check) {
            throw new BadInputException("연산자");
        }

        if(operationInput.equals("+")) {
            calculator.setOperation(new AddOperation());
        }else if(operationInput.equals("-")) {
            calculator.setOperation(new SubstractOperation());
        }else if(operationInput.equals("*")) {
            calculator.setOperation(new MultiplyOperation());
        }else if(operationInput.equals("/")) {
            calculator.setOperation(new DivideOperation());
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
