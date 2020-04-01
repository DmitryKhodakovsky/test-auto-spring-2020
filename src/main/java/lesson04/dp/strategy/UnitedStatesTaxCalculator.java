package lesson04.dp.strategy;

public class UnitedStatesTaxCalculator implements TaxCalculator {

    private static final double TAX = 0.23;

    @Override
    public double calculateTax(double salary) {
        return salary * TAX;
    }
}
