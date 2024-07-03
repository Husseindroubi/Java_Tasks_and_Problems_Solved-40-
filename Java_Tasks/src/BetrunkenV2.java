

import java.util.Scanner;

public class BetrunkenV2 {
    public BetrunkenV2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie Alt bist du?");
        int Age = sc.nextInt();
        System.out.println("Hast du Führerschein dabei?");
        boolean FS = sc.nextBoolean();
        System.out.println("Wie viel Bier hast du getrunken?");
        int Bier = sc.nextInt();
        System.out.println("Wie viel Shots hast du getrunken?");
        int Shots = sc.nextInt();
        int x = Bier + Shots;
        if (x == 0 && Age >= 17 && FS) {
            System.out.println("Du darfst Auto fahren!!");
        } else if (x <= 2 && Age >= 19 && FS) {
            System.out.println("Du darfst Auto fahren!!");
        } else {
            System.out.println("Du darfst nicht Auto fahren!!");
        }

    }
}
