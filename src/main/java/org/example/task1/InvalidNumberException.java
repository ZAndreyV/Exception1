package org.example.task1;

public class InvalidNumberException extends Exception{
    private int digit;

    public InvalidNumberException(String message, int digit) {
        super(message);
        this.digit = digit;
    }

    public int getDigit() {
        return digit;
    }

}
