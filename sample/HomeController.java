package sample;

import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HomeController {
    Main main;

    public void play(MouseEvent mouseEvent) {
        try{
            this.main.show_play();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exit(MouseEvent mouseEvent) {
        this.main.stage.close();

    }

    public void setMain(Main main) {
        this.main = main;
    }
}
