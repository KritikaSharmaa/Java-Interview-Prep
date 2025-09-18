package ExceptionHandling;

import java.util.Scanner;
// Q1. Divide Safely
// Write a program that takes two numbers (a and b) and prints the division result.
// If b = 0, throw and handle an ArithmeticException.
// Ensure a message like "Division by zero is not allowed" is shown.

class Calculator {
    public static int divide(int a, int b) {
        return a / b;
    } 
}

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter denominator (b): ");
        int b = scanner.nextInt();
        try {
            int res = Calculator.divide(a, b);
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}
