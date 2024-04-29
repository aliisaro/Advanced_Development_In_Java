module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires org.testng;
    requires junit;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;

    opens Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary to javafx.graphics;
    exports Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary;
}


