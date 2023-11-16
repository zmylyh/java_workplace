package Practical9;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = scanner.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nString before reverse: " + str);
        System.out.println("String after reverse: " + reverse);
    }
}
