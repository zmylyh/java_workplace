package Practical8;

import java.util.Random;

import static java.lang.Thread.sleep;

class WestArrivalThread extends Thread {
    CrossingThread crossingThread = new CrossingThread("West");
    public void run() {
        crossingThread.start();
        while (true) {
            try {
                int randomNum = new Random().nextInt(3501) + 500;
                sleep(randomNum);
                System.out.println("Car arrived from the west");
                crossingThread.westCount++;
                System.out.println("west: " + crossingThread.westCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class southArrivalThread extends Thread {
    CrossingThread crossingThread = new CrossingThread("South");
    public void run() {
        crossingThread.start();
        while (true) {
            try {
                int randomNum = new Random().nextInt(3501) + 500;
                sleep(randomNum);
                System.out.println("Car arrived from the south");
                crossingThread.southCount++;
                System.out.println("south: " + crossingThread.southCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TrafficSimulator {
    public static void  cross() {
        synchronized (TrafficSimulator.class) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        WestArrivalThread westArrivalThread = new WestArrivalThread();
        southArrivalThread eastArrivalThread = new southArrivalThread();
        westArrivalThread.start();
        eastArrivalThread.start();
    }
}

