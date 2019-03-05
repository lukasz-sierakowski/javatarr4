package com.java.unitTest;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldSumTwoNumbers() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(5, 4);
        Assert.assertTrue("Sum of two numbers is invalid", sum == 9);
    }
}