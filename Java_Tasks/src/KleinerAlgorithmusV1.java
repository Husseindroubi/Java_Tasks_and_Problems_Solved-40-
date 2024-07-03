
import java.util.Scanner;

public class KleinerAlgorithmusV1 {
    public KleinerAlgorithmusV1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anyNumber;
        do {
            System.out.println("Gib die Counter Zahl ein: ");
            anyNumber = sc.nextInt();
        } while(anyNumber < 1);

        int a = 1;
        int b = 1;

        for(int counter = 1; counter <= anyNumber; ++counter) {
            int c = a + b;
            System.out.println("" + a + " + " + b + " = " + c);
            a = b;
            b = c;
        }

    }
}
