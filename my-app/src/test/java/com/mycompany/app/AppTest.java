package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSquareRootOf4() {
        Sqrt sqrt = new Sqrt(4);
        double result = sqrt.calc();
        assertEquals(2.0, result, 1e-7);
    }

    @Test
    public void testSquareRootOf9() {
        Sqrt sqrt = new Sqrt(9);
        double result = sqrt.calc();
        assertEquals(3.0, result, 1e-7);
    }

    @Test
    public void testSquareRootOf1() {
        Sqrt sqrt = new Sqrt(1);
        double result = sqrt.calc();
        assertEquals(1.0, result, 1e-7);
    }

    @Test
    public void testSquareRootOf0() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.calc();
        assertEquals(0.0, result, 1e-7);
    }

    @Test
    public void testSquareRootOfNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2);
        double result = sqrt.calc();
        assertEquals(Math.sqrt(2), result, 1e-7);
    }

    @Test
    public void testAverageFunction() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(5.0, sqrt.average(3, 7), 1e-7);
    }

    @Test
    public void testGoodFunctionIsTrue() {
        Sqrt sqrt = new Sqrt(1);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodFunctionIsFalse() {
        Sqrt sqrt = new Sqrt(1);
        assertFalse(sqrt.good(1.0, 10.0));
    }

    @Test
    public void testImproveFunction() {
        Sqrt sqrt = new Sqrt(1);
        double guess = 1.0;
        double improved = sqrt.improve(guess, 4.0);
        assertEquals(2.5, improved, 1e-7);
    }

    @Test
    public void testCalcForLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000);
        double result = sqrt.calc();
        assertEquals(1000.0, result, 1e-5);
    }
}