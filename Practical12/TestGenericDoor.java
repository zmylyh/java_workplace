package Practical12;

import Practical3.DoorWithCodeLock;
import Practical3.DoorWithLock;

import java.util.Scanner;

class Door {
    protected Boolean isOpen = false;

    public Boolean openDoor() {
        if (isOpen) {
            System.out.println("Door already open");
        } else {
            isOpen = true;
            System.out.println("Door opened");
        }
        return isOpen;
    }

    public Boolean closeDoor() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Door closed");
        } else {
            System.out.println("Door already closed");
        }
        return isOpen;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void lockDoor() {
        System.out.println("This type of door cannot be locked");
    }
    public void unlockDoor() {
        System.out.println("This type of door cannot be locked");
    }
}


public class TestGenericDoor<T extends Door> {
    T door;
    TestGenericDoor(T value) {
        door = value;
        // sth.
        // I just don't want to write
    }
}