
import java.util.Scanner;
public class WorkAndFreetime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;
        int minutes;
        do {
            System.out.println("write the Time as hours (0-23) then minutes (0-59) ");
            hours = sc.nextInt();
            minutes = sc.nextInt();
        } while (hours < 0 || hours > 23 || minutes < 0 || minutes > 59);
        int time = (hours * 60) + minutes;
        if ((time >= 60 * 8.5 && time <= 60 * 12) || (time >= 60 * 12+30 && time <= 60 * 15.5)) {
            System.out.println(hours + ":" + minutes + " It's Work time !");
        } else {
            System.out.println(hours + ":" + minutes + " It's free time !!");
        }
        System.out.println("-------------------------------------");
    }
}
