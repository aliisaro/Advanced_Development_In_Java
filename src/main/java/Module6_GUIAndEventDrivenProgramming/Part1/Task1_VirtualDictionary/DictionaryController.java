package Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        // Initialize the dictionary
        dictionary = new Dictionary();
        // Populate dictionary with some initial words (temporary)
        dictionary.addWord("Dog", "A mammal part of the canine kind.");
        dictionary.addWord("Cat", "A small domesticated carnivorous mammal with soft fur.");
        dictionary.addWord("Bird", "A warm-blooded egg-laying vertebrate animal with feathers.");
    }

    public String searchWord(String word) {
        String lowercaseWord = word.toLowerCase(); // Convert user input to lowercase before search
        if (lowercaseWord == null || lowercaseWord.trim().isEmpty()) {
            return "Please enter a word.";
        } else {
            String meaning = dictionary.searchWord(lowercaseWord);
            if (meaning != null) {
                return meaning;
            } else {
                return "Word not found in dictionary.";
            }
        }
    }
}
