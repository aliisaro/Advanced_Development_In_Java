package Module6_GUIAndEventDrivenProgramming.Part1_VirtualDictionary;

import java.util.HashMap;

public class DictionaryModel {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String word, String meaning) {
        if (word == null) {
            System.out.println("Can't add an empty word to the dictionary.");
        } else {
            dictionary.put(word.toLowerCase(), meaning); // Convert word to lowercase before storing
            System.out.println("Word '" + word + "' added to dictionary.");
        }
    }

    public String searchWord(String word) {
        String lowercaseWord = word.toLowerCase(); // Convert word to lowercase before searching
        if (dictionary.containsKey(lowercaseWord)) {
            return dictionary.get(lowercaseWord);
        } else {
            return null;
        }
    }
}
