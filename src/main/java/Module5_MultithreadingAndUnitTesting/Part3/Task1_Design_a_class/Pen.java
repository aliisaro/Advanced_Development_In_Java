package Module5_MultithreadingAndUnitTesting.Part3.Task1_Design_a_class;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    private Color currentColor;
    private boolean cap; // true if capped, false if uncapped

    public Pen() {
        this(Color.RED); // Default color: red
    }

    public Pen(Color initialColor) {
        this.currentColor = initialColor;
        this.cap = true; // pen is capped by default
    }

    public String draw() {
        if (!cap) {
            return "Drawing " + currentColor.toString();
        } else {
            return "";
        }
    }

    public void capOff() {
        cap = false;
    }

    public void capOn() {
        cap = true;
    }

    public void changeColor(Color newColor) {
        currentColor = newColor;
    }
}
