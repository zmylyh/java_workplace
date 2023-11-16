package Practical9;

import java.util.Scanner;

public class match {
    public static void main(String[] args) {
        System.out.println("enter a string");
        String str = new Scanner(System.in).nextLine();
        System.out.println("enter a string to match");
        String str2 = new Scanner(System.in).nextLine();
        System.out.println(str.regionMatches(true,0, str2, 0, 5));
    }
}
