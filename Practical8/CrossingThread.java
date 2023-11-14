package Practical8;

import static Practical8.TrafficSimulator.cross;

public class CrossingThread extends Thread {
    String direction;

    public int westCount = 0;
    public int southCount = 0;

    public CrossingThread(String direction) {
        this.direction = direction;

    }



    public void run() {
        while (true) {
            cross();
        }
    }
}
