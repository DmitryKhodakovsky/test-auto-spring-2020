package lesson04.dp.strategy;

public class RussianFederationTaxCalculator implements TaxCalculator {

    private static final double TAX = 0.13;

    @Override
    public double calculateTax(double salary) {
        return salary * TAX;
    }
}
