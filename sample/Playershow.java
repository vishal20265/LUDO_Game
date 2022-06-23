package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Playershow {


    public VBox vbox;


    public TextField player1;

    public void selectcolour(MouseEvent actionEvent) {
        vbox.getChildren().addAll(new Button("Red"),new Button("Yellow"),new Button("Green"),new Button("Blue"));
    }

}
