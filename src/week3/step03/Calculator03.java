package week3.step03;

public class Calculator03 {

    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator03(
            AddOperation addOperation
            , SubstractOperation substractOperation
            , MultiplyOperation multiplyOperation
            , DivideOperation divideOperation
    ) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operator, int firstNumber, int secondNumber) {


        double answer = 0;

        if(operator.equals("+")) {
            answer = addOperation.operator(firstNumber, secondNumber);
        }else if(operator.equals("-")) {
            answer =  substractOperation.operator(firstNumber, secondNumber);
        }else if(operator.equals("*")) {
            answer =   multiplyOperation.operator(firstNumber, secondNumber);
        }else if(operator.equals("/")) {
            answer =   divideOperation.operator(firstNumber, secondNumber);
        }

        return answer;
    }

}
