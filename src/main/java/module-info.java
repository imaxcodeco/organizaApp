module main.organizaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.organizaapp to javafx.fxml;
    exports main.organizaapp;
}