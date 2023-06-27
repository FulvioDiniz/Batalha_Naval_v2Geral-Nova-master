package bat.Controller;

import java.io.IOException;

import bat.App;
import javafx.fxml.FXML;

public class TelaPrincipalController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
