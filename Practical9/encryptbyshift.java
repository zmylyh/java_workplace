package Practical9;

import java.util.Scanner;

public class encryptbyshift {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        System.out.println("enter shift");
        int shift = new Scanner(System.in).nextInt();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                encrypted.append((char) ((ch - 'a' + shift) % 26 + 'a'));
            else if (ch >= 'A' && ch <= 'Z')
                encrypted.append((char) ((ch - 'A' + shift) % 26 + 'A'));
            else
                encrypted.append(ch);
        }
        System.out.println(encrypted);
    }
}
