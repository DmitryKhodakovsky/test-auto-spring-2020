package lesson04.dp.strategy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class USTaxCalculatorTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        taxCalculatorProvider = new TaxCalculatorProvider(new UnitedStatesTaxCalculator());
    }

    @Test
    public void testTax() {
        double taxAmount = taxCalculatorProvider.calculate(1000);
        assertThat(taxAmount).isEqualTo(230);
    }

}
