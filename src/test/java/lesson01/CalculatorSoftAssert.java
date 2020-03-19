package lesson01;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorSoftAssert {

    @Test
    public void softAssertExample() {
        Calculator calculator = new Calculator();
        // (2 + 3) * 4 + 10
        SoftAssert sa = new SoftAssert();
        int first = calculator.sum(2, 3);
        sa.assertEquals(first, 5);
        double second = calculator.multiply(first, 4);
        sa.assertEquals(second, 20.0);
        int last = calculator.sum((int) second, 10);
        sa.assertEquals(last, 30);
        sa.assertAll();
    }
}
