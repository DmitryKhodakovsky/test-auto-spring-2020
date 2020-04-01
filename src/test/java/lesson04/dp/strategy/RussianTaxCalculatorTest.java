package lesson04.dp.strategy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RussianTaxCalculatorTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        taxCalculatorProvider = new TaxCalculatorProvider(new RussianFederationTaxCalculator());
    }

    @Test
    public void testTax() {
        double taxAmount = taxCalculatorProvider.calculate(1000);
        assertThat(taxAmount).isEqualTo(130);
    }

}
