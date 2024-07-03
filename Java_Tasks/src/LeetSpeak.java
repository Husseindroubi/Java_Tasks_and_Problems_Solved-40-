
import java.util.HashMap;
import java.util.Scanner;

public class LeetSpeak {
    static String leetspeak(String str) {
        HashMap<Character, Character> myHash = new HashMap<>();
        myHash.put('A', '@');
        myHash.put('B', '8');
        myHash.put('C', '(');
        myHash.put('E', '3');
        myHash.put('G', '9');
        myHash.put('H', '#');
        myHash.put('I', '!');
        myHash.put('L', '1');
        myHash.put('O', '0');
        myHash.put('S', '$');
        myHash.put('Z', '2');

        StringBuilder build = new StringBuilder();
        for (char x : str.toCharArray()) {
            char y = myHash.getOrDefault(Character.toUpperCase(x), x);
            build.append(y);
        }
        return build.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your Text Here...");
        String text = sc.nextLine().toUpperCase();
        String text2 = leetspeak(text);
        System.out.println(text2);
    }
}

