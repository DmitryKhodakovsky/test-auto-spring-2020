package lesson04.dp.strategy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyProviderTest {

    @DataProvider
    public Object[][] strategyDataProvider() {
        return new Object[][] {
                {new RussianFederationTaxCalculator(), 1000, 130},
                {new UnitedStatesTaxCalculator(), 2000, 460},
                {new IrelandTaxCalculator(), 1000, 0}
        };
    }

    @Test(dataProvider = "strategyDataProvider")
    public void testName(TaxCalculator calculator, double salary, double expectedOut) {
        TaxCalculatorProvider provider = new TaxCalculatorProvider(calculator);
        assertThat(provider.calculate(salary)).isEqualTo(expectedOut);
    }
}
