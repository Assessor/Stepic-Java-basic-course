import java.math.BigInteger;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 */
public class Factorial {
    public static void main(String[] args) {
        BigInteger bigI = factorial(0);
        System.out.println(bigI);
    }

    private static BigInteger factorial(int value) {
        int i = 1;
        BigInteger res = BigInteger.valueOf(1);
        while (i <= value) {
            res = res.multiply(BigInteger.valueOf(i));
            i++;
        }
        return res;
    }
}
