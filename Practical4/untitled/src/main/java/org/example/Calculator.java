package Practical4.untitled.src.main.java.org.example;

class NotDivisibleException extends Exception {
    public NotDivisibleException(String message) {
        super(message);
    }
}

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws NotDivisibleException {
        if (a % b != 0) {
            throw new NotDivisibleException("Not divisible");
        }
        return a / b;

    }
}


