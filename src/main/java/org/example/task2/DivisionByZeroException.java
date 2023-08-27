package org.example.task2;

public class DivisionByZeroException extends Exception{
    private int dividend;

    public DivisionByZeroException(String message, int dividend) {
        super(message);
        this.dividend = dividend;
    }

    public int getDividend() {
        return dividend;
    }

}
