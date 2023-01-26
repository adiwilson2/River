module wilson_adeline.river {
    requires javafx.controls;
    requires javafx.fxml;


    opens wilson_adeline.river to javafx.fxml;
    exports wilson_adeline.river;
}