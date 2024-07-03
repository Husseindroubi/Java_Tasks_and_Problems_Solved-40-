import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {6, 8, 2, 99, 1, 4, 3, 10, 7, 9, 15, 28, 0, 3};

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int sort = array[min];
            array[min] = array[i];
            array[i] = sort;
        }
        System.out.println(Arrays.toString(array));
    }
}
