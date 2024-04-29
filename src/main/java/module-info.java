module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires junit;
    requires org.testng;


    exports Module6_GUIAndEventDrivenProgramming.Part1.VirtualDictionary;
    opens Module6_GUIAndEventDrivenProgramming.Part1.VirtualDictionary to javafx.graphics;

    exports Module5_MultithreadingAndUnitTesting.Part4.Task1_PalindromeChecker;
    exports Module5_MultithreadingAndUnitTesting.Part4.Task2_ShoppingCart;

}


