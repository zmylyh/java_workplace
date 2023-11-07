package Practical5;

import java.util.Scanner;

public class collatz_with_steps {
    public int b = 0;

    public int collatz(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else {
            if (n == 1) {
                return 0;
            } else if (n % 2 == 0) {
                this.b++;
                return collatz(n / 2);
            } else {
                this.b++;
                return collatz(3 * n + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        collatz_with_steps c = new collatz_with_steps();
        c.collatz(a);
        System.out.printf("For initial n = %d, it took %d steps to reach 1.", a, c.b);
    }
}
