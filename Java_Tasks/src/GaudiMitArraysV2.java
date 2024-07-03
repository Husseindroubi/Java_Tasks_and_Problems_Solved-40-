

import java.util.Arrays;
import java.util.Scanner;

public class GaudiMitArraysV2 {
    public GaudiMitArraysV2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] shift = alpha.toCharArray();
        System.out.println("How many letters should we shift ? ");
        int howMuch = sc.nextInt();
        char[] shift2 = new char[26];

        for(int i = 0; i < shift.length; ++i) {
            int num = (i + howMuch) % alpha.length();
            if (num < 0) {
                num += 26;
            }

            shift2[num] = shift[i];
        }

        System.out.println(Arrays.toString(shift2));
    }
}
