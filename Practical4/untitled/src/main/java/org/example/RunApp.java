package Practical4.untitled.src.main.java.org.example;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class RunApp {
    public static void input() throws NotDivisibleException {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter operation: ");
        String operation = sc.next();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        if (operation.equals("+")) {
            System.out.println(calculator.add(a, b));
        } else if (operation.equals("-")) {
            System.out.println(calculator.subtract(a, b));
        } else if (operation.equals("*")) {
            System.out.println(calculator.multiply(a, b));
        } else if (operation.equals("/")) {
            System.out.println(calculator.divide(a, b));
        } else {
            System.out.println("Invalid operation");
        }
        System.out.println("Do you want to continue? (Y/N)");
        String comfirm = sc.next();
        if (comfirm.equals("Y") || comfirm.equals("y")) {
            input();
        } else {
            System.out.println("quit");
        }
    }

    public static void main(String[] args) {
        try {
            input();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (NotDivisibleException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our calculator!");
        }
    }
}

