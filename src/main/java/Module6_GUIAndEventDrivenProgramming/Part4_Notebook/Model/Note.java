package Module6_GUIAndEventDrivenProgramming.Part4_Notebook.Model;

public class Note {
    // properties
    private String title;
    private String content;

    // constructor
    public Note() {
        this.title = "";
        this.content = "";
    }

    // getters & setters
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
