package Practical5;

import java.util.Scanner;

public class Collatz {
    public int collatz(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else {
            if (n == 1) {
                return 0;
            } else if (n % 2 == 0) {
                return collatz(n / 2);
            } else {
                return collatz(3 * n + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Collatz c = new Collatz();
        System.out.println(c.collatz(a));

    }
}

