
import java.util.ArrayList;
import java.util.Scanner;

public class RPGV1 {
    public RPGV1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] choices = new String[][]{{"-1", "0", "", "Du stehst in einer Bar."}, {"0", "1", "Geh in die Wildnis", "Du bist in der Wildnis angekommen."}, {"0", "2", "Trink ein Getränk", "Du lässt dir ein Getränk schmecken", "0"}, {"1", "3", "Kämpf gegen das Monster", "Das Monster ist ein harter Gegner, aber du besiegst es.", "1"}, {"1", "4", "Lauf vor dem Monster davon", "Du läufst wie ein Feigling zurück zur Bar.", "0"}};
        int currentChoice = 0;
        ArrayList<Integer> viableChoices = new ArrayList();

        while(true) {
            viableChoices.clear();
            System.out.println(choices[currentChoice][3]);
            System.out.println("-----------------------------");
            String[][] var5 = choices;
            int var6 = choices.length;

            int var7;
            for(var7 = 0; var7 < var6; ++var7) {
                String[] xxx = var5[var7];
                if (Integer.parseInt(xxx[0]) == currentChoice) {
                    System.out.println(xxx[1] + ".) " + xxx[2]);
                    viableChoices.add(Integer.parseInt(xxx[1]));
                }
            }

            System.out.println("-----------------------------");

            int myInput;
            do {
                System.out.println("Was willst du als nächstes tun?");
                myInput = sc.nextInt();
            } while(!viableChoices.contains(myInput));

            String[][] var11 = choices;
            var7 = choices.length;

            for(int var12 = 0; var12 < var7; ++var12) {
                String[] yyy = var11[var12];
                if (Integer.parseInt(yyy[1]) == myInput && yyy.length == 5) {
                    System.out.println(yyy[3]);
                    currentChoice = Integer.parseInt(yyy[4]);
                } else if (Integer.parseInt(yyy[1]) == myInput) {
                    System.out.println(yyy[3]);
                    currentChoice = myInput;
                }
            }
        }
    }
}
