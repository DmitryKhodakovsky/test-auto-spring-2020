package lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorMultiplyTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before Class CalculatorMultiplyTest");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
        calculator = new Calculator();
    }

    @Test(groups = {"gr1"})
    public void multiplyTwoDigits() {
        System.out.println("multiplyTwoDigits");
        double actual = calculator.multiply(1, 2);
        double expected = 2;
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] multiplyTwoDigitsDataProvider() {
        return new Object[][]{
                {1, 2, 2},
                {3, 3, 9},
                {12, 12, 144},
                {6, 8, 48}
        };
    }

    @Test(dataProvider = "multiplyTwoDigitsDataProvider", groups = {"gr2"})
    public void multiplyTwoDigitsWithDataProvider(double a, double b, double expected) {
        System.out.println("multiplyTwoDigits");
        double actual = calculator.multiply(a, b);
        assertEquals(actual, expected);
    }

    @Test
    public void multiplyArray() {
        System.out.println("multiplyArray");
        double actual = calculator.multiply(1, 2, 3, 4);
        double expected = 24;
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
