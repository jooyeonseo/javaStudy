package week3.step04;

public class MultiplyOperation implements AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
