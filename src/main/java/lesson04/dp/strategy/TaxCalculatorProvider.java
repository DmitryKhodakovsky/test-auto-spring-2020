package lesson04.dp.strategy;

public class TaxCalculatorProvider {

    private TaxCalculator calculator;

    public TaxCalculatorProvider(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculate(double salary) {
        return calculator.calculateTax(salary);
    }
}
