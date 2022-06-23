package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import java.io.File;
import java.util.Random;


public class MainLayout {
    public ImageView diceimage;
    public Button dicebutton;
    public Circle Red1;
    public Circle Red2;
    public Circle Red3;
    public Circle Red4;
    public Circle Blue1;
    public Circle Blue2;
    public Circle Blue3;
    public Circle Blue4;
    public Circle Yellow1;
    public Circle Yellow2;
    public Circle Yellow3;
    public Circle Yellow4;
    public Circle Green1;
    public Circle Green2;
    public Circle Green3;
    public Circle Green4;


    public void setcoin(Boolean x){

    }
    public static int random_number() {
        Random rondom = new Random();
        int dice_number = rondom.nextInt(6) + 1;
        return dice_number;

    }
    public void roll_dice(ActionEvent mouseEvent) throws InterruptedException {
        int x = random_number();
        dicebutton.setDisable(true);
        Thread thread = new Thread() {
            public void run() {
                try {
                    File file = new File("src\\sample\\images1/Dice"+x+".jpg");
                    diceimage.setImage(new Image(file.toURI().toString()));
                    Thread.sleep(50);
                    dicebutton.setDisable(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        };
        thread.start();
        player l;



    }

}
class player{
    public void setplayer(String colour){
        Random obj;
        if(colour.equals("Red")){
        }

    }
}
