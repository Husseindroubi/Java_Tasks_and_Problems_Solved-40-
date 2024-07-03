
import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] bingo = new int[5][5];
        int max1 = 15; int max2 = 30; int max3 = 45; int max4 = 60; int max5 = 75;
        ArrayList<Integer> array1 = new ArrayList<>();  for (int i = 1; i <= max1; i++) {  array1.add(i);  }
        ArrayList<Integer> array2 = new ArrayList<>();  for (int i = 16; i <= max2; i++) {  array2.add(i);  }
        ArrayList<Integer> array3 = new ArrayList<>();  for (int i = 31; i <= max3; i++) {  array3.add(i);  }
        ArrayList<Integer> array4 = new ArrayList<>();  for (int i = 46; i <= max4; i++) {  array4.add(i);  }
        ArrayList<Integer> array5 = new ArrayList<>();  for (int i = 61; i <= max5; i++) {  array5.add(i);  }

        System.out.println(" B  I  N  G  O");
        for (int a = 0; a < 5; a++) {
            bingo[a][0] = array1.remove(r.nextInt(max1 -1)+1); max1--;
            bingo[a][1] = array2.remove(r.nextInt(max2 -16)+1); max2--;
            bingo[a][2] = array3.remove(r.nextInt(max3 -31)+1); max3--;
            bingo[a][3] = array4.remove(r.nextInt(max4 -46)+1); max4--;
            bingo[a][4] = array5.remove(r.nextInt(max5 -61)+1); max5--;
        }
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                if (i == 2 && j == 2) {
                    System.out.print("[\uD83C\uDF40]");
                } else {
                    System.out.print("[" + bingo[i][j] + "]");
                }

            }
            System.out.println();
        }
    }
}

