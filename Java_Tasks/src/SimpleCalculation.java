public class SimpleCalculation {
    public static void main(String[] args) {
        int num1 = 38;
        int num2 = 5;
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %.1f\n", num1, num2, (double) num1 / num2);
        System.out.println("-------------------------------------");
    }
}
