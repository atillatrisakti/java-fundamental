package com.juaracoding.learnjava.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        Assert.assertEquals(result, 12);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        Assert.assertEquals(result, 5.0, 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
        System.out.println("Test Divide by Zero");
    }
}
