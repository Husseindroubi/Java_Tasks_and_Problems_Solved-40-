

import java.util.Random;
import java.util.Scanner;

public class MuenzeWerfenV4 {
    public MuenzeWerfenV4() {
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ich = 0;
        int stefan = 0;

        boolean zu;
        do {
            int a;
            do {
                do {
                    System.out.println("Wie oft soll die Münze geworfen werden??");
                    a = sc.nextInt();
                } while(a < 1);
            } while(a > 10);

            for(int i = 0; i < a; ++i) {
                boolean kopf = r.nextBoolean();
                if (kopf) {
                    System.out.println("Werfe Münze... Kopf");
                    ++ich;
                } else {
                    System.out.println("Werfe Münze... Zahl");
                    ++stefan;
                }
            }

            System.out.println("Summe Kopf : " + ich);
            System.out.println("Summe Zahl : " + stefan);
            System.out.println("bist du zufrieden mit dem Ergebnis?");
            zu = sc.nextBoolean();
        } while(!zu);

        if (ich > stefan) {
            System.out.println("Ich bekomme das Ticket!");
        } else if (ich == stefan) {
            System.out.println("Ohne Entscheidung!!");
        } else {
            System.out.println("Stefan bekommt das Ticket!!");
        }

    }
}
