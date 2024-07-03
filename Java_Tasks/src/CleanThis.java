
import java.util.Scanner;

class CleanThis {
    CleanThis() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        boolean withAdult = true;
        if (age >= 18) {
            System.out.println("Grünes Band");
        } else if (age != 16 && age != 17) {
            if (age >= 4 && age < 16) {
                System.out.println("With Adult??");
                withAdult = sc.nextBoolean();
                if (withAdult) {
                    System.out.println("Rotes Band");
                } else {
                    System.out.println("kein Zutritt");
                }
            } else {
                System.out.println("Kein Zutritt");
            }
        } else {
            System.out.println("Gelbes Band");
        }

        if (age > 15 || age >= 4 && age < 16 && withAdult) {
            System.out.println("Are you VIP?");
            boolean vip = sc.nextBoolean();
            if (vip) {
                System.out.println("Goldenes Band dazu!");
            } else {
                System.out.println("Nichts dazu!!");
            }
        }

        sc.close();
    }
}
