
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    static void divide(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        int n = 0;
        for (int j = mid; j < arr.length; j++) {
            arr2[n++] = arr[j];
        }
        divide(arr1);
        divide(arr2);
        mergeSort(arr, arr1, arr2);
    }

    static void mergeSort(int[] arr, int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int sort = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = sort;
                }
            }
        }
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int sort = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = sort;
                }
            }
        }
        int n = 0, n1 = 0, n2 = 0;
        while (n1 < arr1.length && n2 < arr2.length) {
            if (arr1[n1] <= arr2[n2]) {
                arr[n] = arr1[n1];
                n++; n1++;
            } else {
                arr[n] = arr2[n2];
                n++; n2++;
            }
        }
        while (n1 < arr1.length) {
            arr[n] = arr1[n1];
            n++; n1++;
        }
        while (n2 < arr2.length) {
            arr[n] = arr2[n2];
            n++; n2++;
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(101);
        }
        System.out.println("Unsorted array: " + Arrays.toString(array));

        divide(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

