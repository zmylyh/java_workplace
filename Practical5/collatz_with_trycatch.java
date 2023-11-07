package Practical5;

import java.util.Scanner;

public class collatz_with_trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Collatz c = new Collatz();
        try {
            System.out.println(c.collatz(a));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input!");
        }
    }
}
