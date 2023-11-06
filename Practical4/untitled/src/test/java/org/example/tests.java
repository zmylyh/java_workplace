package org.example;

import org.junit.Test;

public class tests {
    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        assert calculator.add(1, 2) == 3;
        assert calculator.add(1, 3) == 4;
        assert calculator.add(1, 4) == 6;

    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        assert calculator.subtract(1, 2) == -1;
        assert calculator.subtract(1, 3) == -2;
        assert calculator.subtract(1, 4) == -5;
    }

    @Test
    public void test3() {
        Calculator calculator = new Calculator();
        assert calculator.multiply(1, 2) == 2;
        assert calculator.multiply(1, 3) == 3;
        //assert calculator.multiply(1, 4) == 5;
    }
}
