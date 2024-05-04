module your.module.name {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.testng;
    // Add other JavaFX modules if needed

    exports Module6_GUIAndEventDrivenProgramming.Part2 to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part1.VirtualDictionary to javafx.graphics;
}
