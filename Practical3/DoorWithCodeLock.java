package Practical3;

import java.util.Scanner;

public class DoorWithCodeLock extends DoorWithLock {
    int code = 0;

    public Boolean lockDoor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code: ");
        code = sc.nextInt();
        return super.lockDoor();


    }

    public Boolean unlockDoor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code: ");
        int code2 = sc.nextInt();
        if (code2 == code) {
            return super.unlockDoor();
        } else {
            System.out.println("Invalid code!");
            return false;
        }
    }
}
