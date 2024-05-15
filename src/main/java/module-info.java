module Module6_GUIAndEventDrivenProgramming {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.testng;
    requires javafx.graphics;
    requires java.sql;

    // Add other JavaFX modules if needed

    exports Module6_GUIAndEventDrivenProgramming.Part1_VirtualDictionary to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part2_CurrencyConverter to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part3_VirtualPet to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part4_Notebook to javafx.fxml, javafx.graphics;
    exports Module7_Persistence.Part2_EnhancedCurrencyConverter.View;

}


