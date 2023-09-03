package org.example.lesson2.task3;

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
