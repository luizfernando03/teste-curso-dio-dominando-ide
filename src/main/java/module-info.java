module com.example.primeiroprogramaintellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroprogramaintellij to javafx.fxml;
    exports com.example.primeiroprogramaintellij;
}