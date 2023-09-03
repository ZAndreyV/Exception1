package org.example.lesson3;

public class InsufficientQuantityException extends Exception{
    public InsufficientQuantityException(String message){
        super(message);
    }
}
