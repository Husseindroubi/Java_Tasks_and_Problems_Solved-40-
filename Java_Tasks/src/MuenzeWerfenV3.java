
import java.util.Random;
import java.util.Scanner;

public class MuenzeWerfenV3 {
    public MuenzeWerfenV3() {
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ich = 0;
        int stefan = 0;

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
        if (ich > stefan) {
            System.out.println("Ich bekomme das Ticket!");
        } else if (ich == stefan) {
            System.out.println("Ohne Entscheidung!!");
        } else {
            System.out.println("Stefan bekommt das Ticket!!");
        }

    }
}
