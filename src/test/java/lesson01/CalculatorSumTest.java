package lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSumTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
        calculator = new Calculator();
    }

    @Test(groups = {"gr2"})
    public void sumTwoDigits() {
        System.out.println("sumTwoDigits");
        int actual = calculator.sum(1, 2);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test(groups = {"gr1"})
    public void sumArray() {
        System.out.println("sumArray");
        int actual = calculator.sum(new int[] {1, 2, 3});
        int expected = 6;
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
        System.out.println("After Method");
    }

    @AfterClass
    public void tearDownClass() {
        calculator = null;
        System.out.println("After Class");
    }
}
