package org.example.lesson2.task3;

import java.util.Scanner;

public class CheckNumbers {
    public static double checkNumbers(int firstNumber, int secondNumber, int thirdNumber) throws DivisionByZeroException, NumberOutOfRangeException, NumberSumException {
        if (firstNumber > 100) {
            throw new NumberOutOfRangeException("First number out of range.", firstNumber);
        } else if (secondNumber < 0){
            throw new NumberOutOfRangeException("Second number out of range.", secondNumber);
        } else if ((firstNumber + secondNumber) < 10){
            throw new NumberSumException("The sum of the first and second numbers is too small", (firstNumber +secondNumber));
        } else if (thirdNumber == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.", thirdNumber);
        }
        return (double) (firstNumber + secondNumber) / thirdNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        try {
            double result = checkNumbers(firstNumber, secondNumber, thirdNumber);
            System.out.println("Result: " + result);
        } catch (NumberOutOfRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Number: " + e.getNumber());
        } catch (NumberSumException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Sum first and second: " + e.getDigit());
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Third number: " + e.getNumber());
        }
    }
}
