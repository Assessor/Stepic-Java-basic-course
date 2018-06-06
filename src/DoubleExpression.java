/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */
public class DoubleExpression {
    public static void main(String[] args) {
        boolean res = doubleExpression(0.1, 0.2, 0.3);
        System.out.println(res);
    }

    private static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) < 0.1e-4;
    }
}
