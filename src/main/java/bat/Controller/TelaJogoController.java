package bat.Controller;
import java.io.IOException;

import bat.App;
import javafx.fxml.FXML;

public class TelaJogoController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}