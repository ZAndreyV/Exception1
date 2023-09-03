package org.example.lesson2.task3;

public class DivisionByZeroException extends Exception{
    private int number;

    public DivisionByZeroException(String message, int number) {
        super(message);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
