package org.example.task2;

import java.util.Scanner;

public class Calculator {
    public static double divide(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.", dividend);
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int dividend = scanner.nextInt();
        System.out.println("Enter second number: ");
        int divisor = scanner.nextInt();
        try {
            double result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Dividend: " + e.getDividend());
        }
    }
}
