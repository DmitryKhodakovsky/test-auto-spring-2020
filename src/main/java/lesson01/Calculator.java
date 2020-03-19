package lesson01;

import java.util.Arrays;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int[] ints) {
        return Arrays.stream(ints).sum();
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(double... doubles) {
        double res = 1;
        for (double aDouble : doubles) {
            res *= aDouble;
        }
        return res;
    }
}
