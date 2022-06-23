package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.io.IOException;

public class Main extends Application {
    Stage stage;
    public Main(){
        
    }
  
    public void showhome_page() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("home.fxml"));
        Parent root = loader.load();
        HomeController controller = (HomeController) loader.getController();
        controller.setMain(this);
        this.stage.setTitle("LUDO");
        this.stage.setScene(new Scene(root, 546.0D, 407.0D));
        this.stage.show();
        this.stage.setResizable(false);
//        this.stage.setFullScreen(true);
    }

    public void show_play() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("play.fxml"));
        Parent root = (Parent) loader.load();
        Play controller = (Play) loader.getController();
        controller.setMain(this);
        this.stage.setTitle("GAME MODE");
        this.stage.setScene(new Scene(root, 546, 618));
        this.stage.show();
        this.stage.setResizable(false);
//        this.stage.setFullScreen(true);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stage=primaryStage;
        this.showhome_page();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
