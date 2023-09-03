package org.example.lesson2.task2;

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
