package Module6_GUIAndEventDrivenProgramming.Part4_Notebook.Model;

import java.util.HashMap;
import java.util.Map;

public class Notebook {
    Map<String, String> notebook = new HashMap<>();

    public void addNote(Note note) {
        notebook.put(note.getTitle(), note.getContent());
    }

    // Method to retrieve the content of a note by its title
    public String getContentByTitle(String title) {
        return notebook.get(title);
    }
}
