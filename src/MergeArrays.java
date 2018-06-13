import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
 * Массивы могут быть любой длины, в том числе нулевой.
 */

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = {5, 7, 9, 19};
        int[] a2 = {1, 3, 4};
        int[] i = mergeArrays(a1, a2);

        for (int item : i) {
            System.out.println(item);
        }

    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int s = a1.length + a2.length;
        int[] result = new int[s];
        int x = 0, y = 0;
        
        for (int i = 0; i < s; i++){
            if (y == a2.length || x < a1.length && a1[x] <= a2[y]) {
                result[i] = a1[x++];
            } else {
                result[i] = a2[y++];
            }
        }

        return result;
    }
}