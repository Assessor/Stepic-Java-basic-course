/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 */

import java.lang.*;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        boolean b = isPowerOfTwo(3);
        System.out.println(b);
    }

    private static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
