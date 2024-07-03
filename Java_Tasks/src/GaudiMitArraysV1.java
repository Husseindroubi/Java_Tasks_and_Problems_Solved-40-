import java.util.Arrays;
import java.util.Random;

public class GaudiMitArraysV1 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] array2 = new int[100];
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; ++i) {
            array2[i] = r.nextInt(101);
        }

        boolean[] array3 = new boolean[100];
        System.out.println(Arrays.toString(array3));

        int y;
        for (y = 0; y < array3.length; y += 2) {
            array3[y] = true;
        }

        for (y = 0; y < array3.length; ++y) {
            System.out.println(array3[y]);
        }

        System.out.println(Arrays.toString(array1));
    }
}


