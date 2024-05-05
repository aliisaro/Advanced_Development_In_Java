module your.module.name {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.testng;
    // Add other JavaFX modules if needed

    exports Module6_GUIAndEventDrivenProgramming.Part1_VirtualDictionary to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part2_CurrencyConverter to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part3_VirtualPet to javafx.graphics;
}
