package week3.step02;

public class Calculator02 {
    //나머지 연산자(%)를 수행할 수 있게 Calculator 클래스 내부 코드를 변경합니다.

    public double calculate(String operator, int firstNumber, int secondNumber) {


        double answer = 0;

        if(operator.equals("+")) {
            answer =  firstNumber + secondNumber;
        }else if(operator.equals("-")) {
            answer =   firstNumber - secondNumber;
        }else if(operator.equals("*")) {
            answer =   firstNumber * secondNumber;
        }else if(operator.equals("/")) {
            answer =   (double)firstNumber / secondNumber;
        }else if(operator.equals("%")) {
            answer =   firstNumber % secondNumber;
        }

        return answer;
    }

}
