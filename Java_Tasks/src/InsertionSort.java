import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 24, 8, 72, 10, 0, 52, 1, 44, 96, 100, 33};
        for (int i = 1; i < array.length; ++i) {
            int sort = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > sort) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = sort;
        }
        System.out.println(Arrays.toString(array));
    }
}

