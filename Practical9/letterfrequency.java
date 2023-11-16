package Practical9;

import java.util.Scanner;

public class letterfrequency {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine().toLowerCase();
        int[] freq = new int[str.length()];
        int i, j;
        char[] string = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + ": " + freq[i]);
        }
    }
}
