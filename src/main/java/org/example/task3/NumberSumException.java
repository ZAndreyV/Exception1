package org.example.task3;

public class NumberSumException extends Exception{
    private int digit;

    public NumberSumException(String message, int digit) {
        super(message);
        this.digit = digit;
    }

    public int getDigit() {
        return digit;
    }
}
