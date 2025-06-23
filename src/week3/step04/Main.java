package week3.step04;

public class Main {
    public static void main(String[] args) {
        Calculator04 calculator  = new Calculator04(new AddOperation());
        System.out.println(calculator.calculate(10, 20));
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10,20));
    }
}
