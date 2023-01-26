package wilson_adeline.river;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Buttons extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

            //Creating a Button
            Button button = new Button();
            //Setting text to the button
            button.setText("Cool Button");
            //Setting the location of the button
            button.setTranslateX(150);
            button.setTranslateY(60);
            //Setting the stage
            Group root = new Group(button);
            Scene scene = new Scene(root, 595, 150, Color.BEIGE);
            primaryStage.setTitle("This is a cool button");
            primaryStage.setScene(scene);
            primaryStage.show();
    }

}
