package week4;

import week4.AbstractOperation;

public class MultiplyOperation implements AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
