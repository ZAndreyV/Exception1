package org.example.task1;

import java.util.Scanner;

public class CheckNumberIsEven {
    public static int checkNumberIsEven(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Invalid number.", number);
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
       int number = scanner.nextInt();
        try {
            int result = checkNumberIsEven(number);
            System.out.println("Number is correct " + result);
        } catch (InvalidNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Number: " + e.getDigit());
        }
    }
}
