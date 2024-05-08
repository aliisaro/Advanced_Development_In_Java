package Module6_GUIAndEventDrivenProgramming.Part4_Notebook;

import Module6_GUIAndEventDrivenProgramming.Part4_Notebook.Model.Note;
import Module6_GUIAndEventDrivenProgramming.Part4_Notebook.Model.Notebook;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NotebookController {
    private Notebook notebook; // create a notebook instance
    @FXML
    private TextField titleField; // create a text field for the title
    @FXML
    private TextArea contentArea; // create a text area for the content
    @FXML
    private Label titleLabel; // create a label to display the title
    @FXML
    private Label contentLabel; // create a label to display the content
    @FXML
    private Label noteAddedLabel; // Label to display when a note is added
    @FXML
    private Label notFoundLabel; // Label to display when a note is not found
    @FXML
    private TextField findNoteField; // create a text field to find a note

    // Constructor
    public NotebookController() {
        notebook = new Notebook();
    }

    // Method to add a note
    @FXML
    public void addNote() {
        Note note = new Note();
        note.setTitle(titleField.getText());
        note.setContent(contentArea.getText());
        notebook.addNote(note);

        // Show note added message
        String message = "Note '" + note.getTitle() + "' added to notebook successfully!";
        noteAddedLabel.setText(message);
        noteAddedLabel.setVisible(true);

        // Clear the text fields upon adding a note
        titleField.setText("");
        contentArea.setText("");
    }

    // Method to search for a note
    @FXML
    public void getNote() {
        String content = notebook.getContentByTitle(findNoteField.getText()); // Retrieve the content from the notebook
        if (content != null) {
            // Update labels if note is found
            titleLabel.setText(findNoteField.getText());
            contentLabel.setText(content);
            notFoundLabel.setVisible(false);
        } else {
            // Update labels if note is not found
            titleLabel.setText("");
            contentLabel.setText("");
            notFoundLabel.setVisible(true);
        }
    }
}
