import java.util.Scanner;

public class PseudoCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Type any number..");
            n = sc.nextInt();
        } while (n < 2);

        int c = 0;

        for (int k = 2; k < n / 2; ++k) {
            if (n % k == 0) {
                ++c;
            }
        }

        if (c > 0) {
            System.out.println(" " + n + " is not a prime number");
        } else {
            System.out.println(" " + n + " is a prime number");
        }

    }
}


