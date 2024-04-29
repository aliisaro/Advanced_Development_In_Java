package Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String word, String meaning) {
        if (word == null || word.isEmpty()) {
            System.out.println("Can't add an empty word to the dictionary.");
        } else {
            dictionary.put(word, meaning);
            System.out.println("Word '" + word + "' added to dictionary.");
        }
    }

    public String searchWord(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return null;
        }
    }
}
