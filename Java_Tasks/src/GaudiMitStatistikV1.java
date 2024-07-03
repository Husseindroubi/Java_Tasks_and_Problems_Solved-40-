
public class GaudiMitStatistikV1 {
    public GaudiMitStatistikV1() {
    }

    public static void main(String[] args) {
        String sentence = "1.My 2.lovely 3.#Mobile 4.NOKIA 3210 5.is 'not' 6.there...7.WHAT can I do?";
        int capital = 0;
        int small = 0;
        int number = 0;
        int symbol = 0;
        char[] array = sentence.toCharArray();

        for(int i = 0; i < sentence.length(); ++i) {
            char x = array[i];
            if (x >= 'A' && x <= 'Z') {
                ++capital;
            } else if (x >= 'a' && x <= 'z') {
                ++small;
            } else if ('0' <= x && x <= '9') {
                ++number;
            } else {
                ++symbol;
            }
        }

        System.out.println("Satz: " + sentence);
        System.out.println("Großbuchstaben: " + capital);
        System.out.println("Kleinbuchstaben: " + small);
        System.out.println("Zahlen: " + number);
        System.out.println("Sonderzeichnen: " + symbol);
    }
}
