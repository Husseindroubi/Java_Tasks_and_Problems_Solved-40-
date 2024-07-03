
import java.util.Scanner;

public class CaeserChiffre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");
        String caeser = "Ein Charakter namens Caeser";
        System.out.println("Caeser Chiffre: ");
        System.out.println(caeser);
        char[] cipher1 = caeser.toCharArray();
        int offset;
        System.out.println("----------------------------------------");
        do {
            System.out.println("Type a number between 1-26 only");
            offset = sc.nextInt();
        } while (offset < 1 || offset > 26);

        StringBuilder cipher2 = new StringBuilder();
        for (char x : cipher1) {
            if (x >= 'a' && x <= 'z') {
                int y = x - 'a';
                int z = (y + offset) % 26;
                char chr = (char) ('a' + z);
                cipher2.append(chr);
            } else if (x >= 'A' && x <= 'Z') {
                int y = x - 'A';
                int z = (y + offset) % 26;
                char chr2 = (char) ('A' + z);
                cipher2.append(chr2);
            } else {
                cipher2.append(x);
            }
        }
        System.out.println(cipher2);

    }
}
