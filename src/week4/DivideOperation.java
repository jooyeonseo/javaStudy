package week4;

import week4.AbstractOperation;

public class DivideOperation implements AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}
