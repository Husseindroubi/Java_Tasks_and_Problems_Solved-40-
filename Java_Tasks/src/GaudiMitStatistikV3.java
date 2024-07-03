

import java.util.ArrayList;
import java.util.Random;

public class GaudiMitStatistikV3 {
    public GaudiMitStatistikV3() {
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[30];
        System.out.println("Urliste:");

        int sum;
        for(sum = 0; sum < array.length; ++sum) {
            array[sum] = r.nextInt(101);
            System.out.print("[" + array[sum] + "]");
        }

        int y;
        int sort;
        for(sum = 0; sum < array.length - 1; ++sum) {
            for(y = 0; y < array.length - 1; ++y) {
                if (array[y] > array[y + 1]) {
                    sort = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = sort;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Aufsteigend sortiert:");
        int[] var18 = array;
        y = array.length;

        int range;
        for(sort = 0; sort < y; ++sort) {
            range = var18[sort];
            System.out.print("[" + range + "]");
        }

        System.out.println(" ");
        System.out.print("Arithmetisches Mittel: ");
        sum = 0;
        int[] var19 = array;
        sort = array.length;

        for(range = 0; range < sort; ++range) {
            int k = var19[range];
            sum += k;
        }

        double mean = (double)sum / (double)array.length;
        System.out.printf("(%.2f)", mean);
        System.out.println(" ");
        System.out.print("Spannweite: ");
        range = array[array.length - 1] - array[0];
        System.out.println("(" + range + ")");
        System.out.print("Median: ");
        double median;
        if (array.length % 2 == 0) {
            median = (double)(array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
            System.out.printf("(%.1f) ", median);
        } else {
            median = (double)array[(array.length - 1) / 2];
            System.out.println("(" + (int)median + ")");
        }

        System.out.println(" ");
        System.out.print("Modalwert: ");
        ArrayList<Integer> count = new ArrayList();
        int mode = 0;
        int maxCount = 0;
        int current = 1;
        int[] var13 = array;
        int var14 = array.length;

        int var15;
        int w;
        for(var15 = 0; var15 < var14; ++var15) {
            w = var13[var15];
            count.add(w);
        }

        int sum2;
        for(sum2 = 1; sum2 < count.size(); ++sum2) {
            if (((Integer)count.get(sum2)).equals(count.get(sum2 - 1))) {
                ++current;
            } else {
                if (current > maxCount) {
                    maxCount = current;
                    mode = (Integer)count.get(sum2 - 1);
                }

                current = 1;
            }
        }

        if (current > maxCount) {
            mode = (Integer)count.get(count.size() - 1);
        }

        System.out.println("(" + mode + ")");
        System.out.print("Mittlere absolute Abweichung: ");
        sum2 = 0;
        int[] var23 = array;
        var15 = array.length;

        for(w = 0; w < var15; ++w) {
            int m = var23[w];
            sum2 += (int)Math.abs((double)m - mean);
        }

        double deviation = 1.0 / (double)array.length * (double)sum2;
        System.out.printf("(%.2f)", deviation);
    }
}
