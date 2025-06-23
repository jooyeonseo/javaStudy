package week3.step01;

public class Calculator01 {
//             - Calulator 클래스는 연산을 수행하는 반환 타입이 double인 calculate 메서드를 가지고 있습니다.
//            - calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
//            - int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
//            - calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.

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
        }

        return answer;
    }
}
