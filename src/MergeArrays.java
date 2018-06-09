import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
 * Массивы могут быть любой длины, в том числе нулевой.
 */

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 3};
        int[] i = mergeArrays(a1, a2);

        for (int item : i) {
            System.out.println(item);
        }

    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int x1 = a1.length;
        int x2 = a2.length;
        int s = x1 + x2;
        int[] result = new int[s];

        if (x1 == 0) {
            return  a2;
        }

        if (x2 == 0) {
            return a1;
        }

        int lastA1 = a1[x1 - 1];
        int lastA2 = a2[x2 - 1];
        int max = lastA1 > lastA2 ? 1 : 2;

        int tmp;
        int y1 = 0;
        int y2 = 0;
        int end = 0;
        for (int x = 0; x < s; x++) {
            if (max == 2) {
                if (end == 0 && (a1[y1] <= a2[y2])) {
                    tmp = a1[y1];
                    y1++;
                    if (y1 > x1 - 1) {
                        end = 1;
                    }
                } else {
                    tmp = a2[y2];
                    y2++;
                }

                result[x] = tmp;
            } else {
                if (end == 0 && (a1[y1] <= a2[y2])) { // {1, 2, 3, 4}; {1, 3}
                    tmp = a1[y1];
                    y1++;
                    /*-if (y1 > x1 - 1) {
                        end = 1;
                    }*/
                } else {
                    tmp = a2[y2];
                    y2++;
                }

                result[x] = tmp;
            }
        }

        return result;
    }
}
