package studio2.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text here:");
        String textToCount = input.nextLine();
        char[] charactersInString = textToCount.toLowerCase().toCharArray();

        HashMap<Character, Integer> charactersCounted = new HashMap<>();
        for (char alphanumeric : charactersInString) {
            if (Character.isLetterOrDigit(alphanumeric)) {
                if (charactersCounted.containsKey(alphanumeric)) {
                    charactersCounted.put(alphanumeric, charactersCounted.get(alphanumeric) + 1);
                } else {
                    charactersCounted.put(alphanumeric, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> character: charactersCounted.entrySet()) {
            System.out.println(character.getKey() + ": "+ character.getValue());
        }
    }
}
