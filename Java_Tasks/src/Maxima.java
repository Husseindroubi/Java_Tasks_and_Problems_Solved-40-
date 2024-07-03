import java.util.ArrayList;
import java.util.Scanner;

public class Maxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int max;
        System.out.println("enter your numbers...");

        while (true) {
            String str = sc.nextLine();
            if (str.equals("q")) {
                break;
            }
            else {
                array.add(Integer.parseInt(str));
            }
        }
        max = array.get(0);
        for (int i = 0; i < array.size() - 1; i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        System.out.println(max);
    }
}
