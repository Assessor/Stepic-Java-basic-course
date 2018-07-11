/**
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
 */

import java.util.function.DoubleUnaryOperator;

public class Integrate {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }
    private static double integrate(DoubleUnaryOperator f, double a, double b) {
        final double step = 1E-6;
        double result = 0;

        while (b > a) {
            result += f.applyAsDouble(a) * step;
            a += step;
        }

        return result;
    }
}
