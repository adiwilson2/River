package wilson_adeline.river;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RiverController {
    @FXML
    private Label riverText;

    @FXML
    protected void onRiverButtonClick() {
        riverText.setText("Lets build a river!");
    }
}