package week3.step04;

public class AddOperation implements AbstractOperation{


    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
