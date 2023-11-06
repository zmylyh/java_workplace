package Practical3;

public class DoorWithLock extends Door {
    private Boolean isLocked = false;

    public Boolean lockDoor() {
        if (isLocked) {
            System.out.println("Door already locked!");
            return isLocked;
        }
        if (super.getIsOpen()) {
            System.out.println("Open door cannot be\n" +
                    "locked!");
            return false;
        } else {
            isLocked = true;
            System.out.println("Door locked");
            return isLocked;
        }
    }

    public Boolean unlockDoor() {
        if (isLocked) {
            isLocked = false;
            System.out.println("Door unlocked");
        } else {
            System.out.println("Door is not\n" +
                    "locked!");
        }
        return isLocked;
    }

    public Boolean openDoor() {
        if (isLocked) {
            System.out.println("Door is locked and cannot be opened!");
            return false;
        } else {
            return super.openDoor();
        }
    }

    public Boolean closeDoor() {
        if (isLocked) {
            System.out.println("Door locked, cannot close");
            return false;
        } else {
            return super.closeDoor();
        }
    }

}
