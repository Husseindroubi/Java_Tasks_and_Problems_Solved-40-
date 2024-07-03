
import java.util.Scanner;

public class TaschenrechnerV3 {
    public TaschenrechnerV3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        do {
            System.out.println("Gib den Operator (+, -, *, /, %) ein:");
            op = sc.nextLine().charAt(0);
            System.out.println("Gib die erste Zahl ein:");
            int a = sc.nextInt();
            System.out.println("Gib die zweite Zahl ein:");
            int b = sc.nextInt();
            switch (op) {
                case '%':
                    System.out.println("" + a + " % " + b + " = " + a % b);
                    break;
                case '&':
                case '\'':
                case '(':
                case ')':
                case ',':
                case '.':
                default:
                    System.out.println("Falscher Operator!!!");
                    break;
                case '*':
                    System.out.println("" + a + " * " + b + " = " + a * b);
                    break;
                case '+':
                    System.out.println("" + a + " + " + b + " = " + (a + b));
                    break;
                case '-':
                    System.out.println("" + a + " - " + b + " = " + (a - b));
                    break;
                case '/':
                    System.out.println("" + a + " / " + b + " = " + (double)(a / b));
            }

            sc.nextLine();
        } while(op != 'x');

    }
}
