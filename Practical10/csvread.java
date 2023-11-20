package Practical10;

import java.io.File;
import java.util.List;
import java.util.Scanner;

class Bear {
    static List<Bear> bearList;
    String id;
    String capture_latitude;
    String capture_longitude;
    String sex;
    String age;
    String tagged_ear;

    Bear(String id, String capture_latitude, String capture_longitude, String sex, String age, String tagged_ear) {
        this.id = id;
        this.capture_latitude = capture_latitude;
        this.capture_longitude = capture_longitude;
        this.sex = sex;
        this.age = age;
        this.tagged_ear = tagged_ear;
    }

}

public class csvread {
    public static void main(String[] args) {
        try {
            File file = new File("polarbear.csv");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dataArr = data.split(",");
                System.out.println("ID: " + dataArr[0] + " ear tagged" + dataArr[11]);
                Bear.bearList.add(new Bear(dataArr[0], dataArr[6], dataArr[7], dataArr[9], dataArr[10], dataArr[11]));
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
