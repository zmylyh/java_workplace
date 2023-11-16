package Practical9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class matchid {
    public static void main(String[] args) {
        String id = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("[0-3]\\d[0-1]\\d\\d\\d-[0-9A-Za-z]{4}");
        System.out.println(pattern.matcher(id).matches());
    }
}
