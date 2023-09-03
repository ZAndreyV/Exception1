package org.example.lesson2.task3;

public class NumberOutOfRangeException extends Exception{
    private int number;

    public NumberOutOfRangeException(String message, int number) {
        super(message);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
