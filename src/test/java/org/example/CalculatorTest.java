package org.example;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setupEachTest() {
        // run before each test
        calculator = new Calculator();
    }

    @Test
    public void divisionPositive()
    {
        double result = calculator.division(6.0, 3.0);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void divisionOneNegativeNumber()
    {
        double result = calculator.division(-8.0, 2.0);
        assertEquals(-4.0, result, 0.001);
    }

    @Test
    public void divisionTwoNegativeNumbers()
    {
        double result = calculator.division(-4.2, -2.0);
        assertEquals(2.1, result, 0.001);
    }

    @Test
    public void divisionZero()
    {
        double result = calculator.division(0.0, 12.0);
        assertEquals(0, result, 0.001);
    }

    @Test
    public void multiplyPositive()
    {
        double result = calculator.multiplication(3.5, 4.5);
        assertEquals(15.75, result, 0.001);
    }

    @Test
    public void multiplyOneNegative()
    {
        double result = calculator.multiplication(-10.5, 2.3);
        assertEquals(-24.15, result, 0.001);
    }

    @Test
    public void multiplyTwoNegativeNumbers()
    {
        double result = calculator.multiplication(-4.2, -2.0);
        assertEquals(8.4, result, 0.001);
    }

    @Test
    public void multiplyByZero()
    {
        double result = calculator.multiplication(13.6, 0.0);
        assertEquals(0.0, result, 0.001);
    }
}
