import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

    HashMap<String, String> eng2ger;
    HashMap<String, String> ger2eng;

    public Dictionary() {
        eng2ger = new HashMap<>();
        ger2eng = new HashMap<>();
    }
    public void addEnglishWords(String english, String german) {
        eng2ger.put(english, german);
        System.out.println("Added: "+ english+" , "+german);
    }
    public void addGermanWords(String german, String english) {
        ger2eng.put(german, english);
        System.out.println("Added: "+ german+" , "+english);
    }
    public void deleteENG(String english) {
        eng2ger.remove(english);
        if (!ger2eng.containsValue(english) && !ger2eng.containsKey(english)) {
            System.out.println("Deleted: "+english);
        }
    }
    public void deleteGER(String german) {
        ger2eng.remove(german);
        if (!ger2eng.containsValue(german) && !ger2eng.containsKey(german)) {
            System.out.println("Deleted: "+ german);
        }
    }
    public void searchENG(String english) {
        if (eng2ger.containsKey(english)) {
            System.out.println("Found: "+ english);
        } else {
            System.out.println("Not Found " );
        }
    }
    public void searchGER(String german) {
        if (eng2ger.containsKey(german)) {
            System.out.println("Found: "+ german);
        } else {
            System.out.println("Not Found " );
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        //adding words
        dictionary.addEnglishWords("Cat", "Katze");
        dictionary.addEnglishWords("love","liebe");
        dictionary.addEnglishWords("Mouse", "Maus");
        dictionary.addEnglishWords("I love you", "Ich liebe dich");

        dictionary.addGermanWords("Katze", "Cat");
        dictionary.addGermanWords("gut", "good");
        dictionary.addGermanWords("Tee", "Tea");
        dictionary.addGermanWords("Hund", "Dog");

        //delete Words
        dictionary.deleteENG("cat");
        dictionary.deleteGER("gut");

        //search for a word
        dictionary.searchENG("love");
        dictionary.searchGER("gut");
    }
}
