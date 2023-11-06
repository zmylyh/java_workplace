package org.example;

import java.util.Objects;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
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
        } else {
            System.out.println("Invalid operation");
        }
        System.out.println("Do you want to continue? (Y/N)");
        String comfirm =  sc.next();
        if (comfirm.equals("Y") || comfirm.equals("y")) {
            main(args);
        } else {
            System.out.println("quit");
        }
    }
}
