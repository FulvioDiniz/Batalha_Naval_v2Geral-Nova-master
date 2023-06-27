module bat {
    requires javafx.controls;
    requires javafx.fxml;

    opens bat.Controller to javafx.fxml; 
    opens bat to javafx.fxml;
    exports bat;
}
