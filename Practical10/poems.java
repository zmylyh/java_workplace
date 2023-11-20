package Practical10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class poems {
    public static void main(String[] args) {
        try {
           File file = new File("poems1.txt");

            File TUNE = new File("tune.txt");
            if (TUNE.createNewFile()) {
                System.out.println("File created: " + TUNE.getName());
            } else {
                System.out.println("File already exists.");
            }
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.contains("Tune--")) {
                    new FileWriter(TUNE, true).append(data).append("\n");
                } else if (data.contains("Address To A Haggis")) {
                    System.out.println(data);
                    StringBuilder sb = new StringBuilder();
                    for (char c : data.toCharArray()) {
                        if (c == '!') {
                            sb.append("$");
                        }
                        sb.append(c);
                    }
                    System.out.println(sb);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
