package week3.step03;


public class Main {
    public static void main(String[] args) {
        Calculator03 calculator  = new Calculator03(new AddOperation(), new SubstractOperation(),
                new MultiplyOperation(), new DivideOperation());
        System.out.println(calculator.calculate("+", 10, 20));
        System.out.println(calculator.calculate("*", 10, 20));

    }
}
