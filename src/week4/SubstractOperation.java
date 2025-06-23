package week4;

import week4.AbstractOperation;

public class SubstractOperation implements AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
