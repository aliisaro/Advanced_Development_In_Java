module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires junit;
    requires org.testng;


    opens Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary;
}


