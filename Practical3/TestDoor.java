package Practical3;

import java.util.Scanner;

class Door {
    protected Boolean isOpen = false;

    public Boolean openDoor() {
        if (isOpen) {
            System.out.println("Door already open");
            return isOpen;
        } else {
            isOpen = true;
            System.out.println("Door opened");
            return isOpen;
        }
    }

    public Boolean closeDoor() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Door closed");
            return isOpen;
        } else {
            System.out.println("Door already closed");
            return isOpen;
        }
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
}


public class TestDoor {
    public static void main(String[] args) {
        System.out.println("Test Door: enter 1 to open door; enter 2 to close door; enter 3 to Lock door; enter 4 to unlock door; enter 5 to exit");
        Scanner sc = new Scanner(System.in);
        int status = sc.nextInt();
        Door door = new Door();
        DoorWithLock doorWithLock = new DoorWithLock();
        DoorWithCodeLock doorWithCodeLock = new DoorWithCodeLock();
        switch (status) {
            case 1:
                door.openDoor();
                break;
            case 2:
                door.closeDoor();
                break;
            case 3:
                doorWithLock.lockDoor();
                break;
            case 4:
                doorWithLock.unlockDoor();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("Test DoorWithLockCode, enter a code to lock door");
        doorWithCodeLock.lockDoor();
        System.out.println("enter a code to unlock door");
        doorWithCodeLock.unlockDoor();

    }
}