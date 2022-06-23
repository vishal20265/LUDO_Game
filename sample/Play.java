package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Play {

    public TextField player;
    public TextField winnertext;
    Main main;
    public void setMain(Main main) {
        this.main = main;
    }
    @FXML
    public GridPane G1,G2,G3, G4, G5, G6, G7, G8, G10, G11, G12, G13, G14, G15, G16, G17, G18, G19, G20, G21, G22, G23, G24, G25, G26, G27, G28, G29, G30, G31, G32, G33, G34, G35, G36, G37, G38, G39, G40, G41, G42, G43, G44, G45, G46, G47, G48, G49, G50, G51, G52;
    public GridPane G9,G53,G54,G55,G56,G57,G58,G59,G60,G61,G62,G63,G64,G65,G66,G67,G68,G69,G70,G71,G72;
    public GridPane redfinal,Yellowfinal,Gfinal,bluefinal;
    public GridPane R1, R2, R3, R4;
    public Circle R1coin,R2coin,R3coin,R4coin;
    public GridPane Gr1,Gr2,Gr3,Gr14;
    public Circle Gr1coin,Gr2coin,Gr3coin,Gr4coin;
    public GridPane y1,y2,y3,y4;
    public Circle y1coin,y2coin,y3coin,y4coin;
    public GridPane b1,b2,b3,b4;
    public Circle b1coin,b2coin,b3coin,b4coin;
    public ImageView Diceimage;
    LinkedList<GridPane> redpathlist = new LinkedList<>();
    LinkedList<GridPane> ypathlist = new LinkedList<>();
    ArrayList<GridPane> gpathlist = new ArrayList<>();
    LinkedList<GridPane> bpathlist = new LinkedList<>();
    @FXML
    public void addredpath() {
        redpathlist.add(0, G1);
        redpathlist.add(1, G2);
        redpathlist.add(2, G3);
        redpathlist.add(3, G4);
        redpathlist.add(4, G5);
        redpathlist.add(5, G6);
        redpathlist.add(6, G7);
        redpathlist.add(7, G8);
        redpathlist.add(8, G9);
        redpathlist.add(9, G10);
        redpathlist.add(10, G11);
        redpathlist.add(11, G12);
        redpathlist.add(12, G13);
        redpathlist.add(13, G14);
        redpathlist.add(14, G15);
        redpathlist.add(15, G16);
        redpathlist.add(16, G17);
        redpathlist.add(17, G18);
        redpathlist.add(18, G19);
        redpathlist.add(19, G20);
        redpathlist.add(20, G21);
        redpathlist.add(21, G22);
        redpathlist.add(22, G23);
        redpathlist.add(23, G24);
        redpathlist.add(24, G25);
        redpathlist.add(25, G26);
        redpathlist.add(26, G27);
        redpathlist.add(27, G28);
        redpathlist.add(28, G29);
        redpathlist.add(29, G30);
        redpathlist.add(30, G31);
        redpathlist.add(31, G32);
        redpathlist.add(32, G33);
        redpathlist.add(33, G34);
        redpathlist.add(34, G35);
        redpathlist.add(35, G36);
        redpathlist.add(36, G37);
        redpathlist.add(37, G38);
        redpathlist.add(38, G39);
        redpathlist.add(39, G40);
        redpathlist.add(40, G41);
        redpathlist.add(41, G42);
        redpathlist.add(42, G43);
        redpathlist.add(43, G44);
        redpathlist.add(44, G45);
        redpathlist.add(45, G46);
        redpathlist.add(46, G47);
        redpathlist.add(47, G48);
        redpathlist.add(48, G49);
        redpathlist.add(49, G50);
        redpathlist.add(50, G51);
        redpathlist.add(51, G53);
        redpathlist.add(52, G54);
        redpathlist.add(53, G55);
        redpathlist.add(54, G56);
        redpathlist.add(55, G57);
        redpathlist.add(56, redfinal);
    }
    @FXML
    public void addgreenpath(){
        gpathlist.add(0,G14);
        gpathlist.add(1,G15);
        gpathlist.add(2,G16);
        gpathlist.add(3,G17);
        gpathlist.add(4,G18);
        gpathlist.add(5,G19);
        gpathlist.add(6,G20);
        gpathlist.add(7,G21);
        gpathlist.add(8,G22);
        gpathlist.add(9,G23);
        gpathlist.add(10,G24);
        gpathlist.add(11,G25);
        gpathlist.add(12,G26);
        gpathlist.add(13,G27);
        gpathlist.add(14,G28);
        gpathlist.add(15,G29);
        gpathlist.add(16,G30);
        gpathlist.add(17,G31);
        gpathlist.add(18,G32);
        gpathlist.add(19,G33);
        gpathlist.add(20,G34);
        gpathlist.add(21,G35);
        gpathlist.add(22,G36);
        gpathlist.add(23,G37);
        gpathlist.add(24,G38);
        gpathlist.add(25,G39);
        gpathlist.add(26,G40);
        gpathlist.add(27,G41);
        gpathlist.add(28,G42);
        gpathlist.add(29,G43);
        gpathlist.add(30,G44);
        gpathlist.add(31,G45);
        gpathlist.add(32,G46);
        gpathlist.add(33,G47);
        gpathlist.add(34,G48);
        gpathlist.add(35,G49);
        gpathlist.add(36,G50);
        gpathlist.add(37,G51);
        gpathlist.add(38,G52);
        gpathlist.add(39,G1);
        gpathlist.add(40,G2);
        gpathlist.add(41,G3);
        gpathlist.add(42,G4);
        gpathlist.add(43,G5);
        gpathlist.add(44,G6);
        gpathlist.add(45,G7);
        gpathlist.add(46,G8);
        gpathlist.add(47,G9);
        gpathlist.add(48,G10);
        gpathlist.add(49,G11);
        gpathlist.add(50,G12);
        gpathlist.add(51,G58);
        gpathlist.add(52,G59);
        gpathlist.add(53,G60);
        gpathlist.add(54,G61);
        gpathlist.add(55,G62);
        gpathlist.add(56,Gfinal);
    }
    @FXML
    public void addyellownpath(){
        ypathlist.add(0,G27);
        ypathlist.add(1,G28);
        ypathlist.add(2,G29);
        ypathlist.add(3,G30);
        ypathlist.add(4,G31);
        ypathlist.add(5,G32);
        ypathlist.add(6,G33);
        ypathlist.add(7,G34);
        ypathlist.add(8,G35);
        ypathlist.add(9,G36);
        ypathlist.add(10,G37);
        ypathlist.add(11,G38);
        ypathlist.add(12,G39);
        ypathlist.add(13,G40);
        ypathlist.add(14,G41);
        ypathlist.add(15,G42);
        ypathlist.add(16,G43);
        ypathlist.add(17,G44);
        ypathlist.add(18,G45);
        ypathlist.add(19,G46);
        ypathlist.add(20,G47);
        ypathlist.add(21,G48);
        ypathlist.add(22,G49);
        ypathlist.add(23,G50);
        ypathlist.add(24,G51);
        ypathlist.add(25,G52);
        ypathlist.add(26,G1);
        ypathlist.add(27,G2);
        ypathlist.add(28,G3);
        ypathlist.add(29,G4);
        ypathlist.add(30,G5);
        ypathlist.add(31,G6);
        ypathlist.add(32,G7);
        ypathlist.add(33,G8);
        ypathlist.add(34,G9);
        ypathlist.add(35,G10);
        ypathlist.add(36,G11);
        ypathlist.add(37,G12);
        ypathlist.add(38,G13);
        ypathlist.add(39,G14);
        ypathlist.add(40,G15);
        ypathlist.add(41,G16);
        ypathlist.add(42,G17);
        ypathlist.add(43,G18);
        ypathlist.add(44,G19);
        ypathlist.add(45,G20);
        ypathlist.add(46,G21);
        ypathlist.add(47,G22);
        ypathlist.add(48,G23);
        ypathlist.add(49,G24);
        ypathlist.add(50,G25);
        ypathlist.add(51,G63);
        ypathlist.add(52,G64);
        ypathlist.add(53,G65);
        ypathlist.add(54,G66);
        ypathlist.add(55,G67);
        ypathlist.add(56,Yellowfinal);
    }
    @FXML
    public void addbluepath() {
        bpathlist.add(0, G40);
        bpathlist.add(1, G41);
        bpathlist.add(2, G42);
        bpathlist.add(3, G43);
        bpathlist.add(4, G44);
        bpathlist.add(5, G45);
        bpathlist.add(6, G46);
        bpathlist.add(7, G47);
        bpathlist.add(8, G48);
        bpathlist.add(9, G49);
        bpathlist.add(10, G50);
        bpathlist.add(11, G51);
        bpathlist.add(12, G52);
        bpathlist.add(13, G1);
        bpathlist.add(14, G2);
        bpathlist.add(15, G3);
        bpathlist.add(16, G4);
        bpathlist.add(17, G5);
        bpathlist.add(18, G6);
        bpathlist.add(19, G7);
        bpathlist.add(20, G8);
        bpathlist.add(21, G9);
        bpathlist.add(22, G10);
        bpathlist.add(23, G11);
        bpathlist.add(24, G12);
        bpathlist.add(25, G13);
        bpathlist.add(26, G14);
        bpathlist.add(27, G15);
        bpathlist.add(28, G16);
        bpathlist.add(29, G17);
        bpathlist.add(30, G18);
        bpathlist.add(31, G19);
        bpathlist.add(32, G20);
        bpathlist.add(33, G21);
        bpathlist.add(34, G22);
        bpathlist.add(35, G23);
        bpathlist.add(36, G24);
        bpathlist.add(37, G25);
        bpathlist.add(38, G26);
        bpathlist.add(39, G27);
        bpathlist.add(40, G28);
        bpathlist.add(41, G29);
        bpathlist.add(42, G30);
        bpathlist.add(43,G31);
        bpathlist.add(44,G32);
        bpathlist.add(45,G33);
        bpathlist.add(46,G34);
        bpathlist.add(47,G35);
        bpathlist.add(48,G36);
        bpathlist.add(49,G37);
        bpathlist.add(50,G38);
        bpathlist.add(51,G68);
        bpathlist.add(52,G69);
        bpathlist.add(53,G70);
        bpathlist.add(54,G71);
        bpathlist.add(55,G72);
        bpathlist.add(56,bluefinal);

    }

    public Button button;
    public Text numbershow;

    Random randome = new Random();
    public int dice(){
        int dice = randome.nextInt(6) + 1;
        return dice;
    }
    @FXML
    public void patheset(String x,boolean flag,int dicenumber){
        R1coin.setDisable(true);
        R2coin.setDisable(true);
        R3coin.setDisable(true);
        R4coin.setDisable(true);
        y1coin.setDisable(true);
        y2coin.setDisable(true);
        y3coin.setDisable(true);
        y4coin.setDisable(true);
        boolean flag1=true;
        if(x.equals("Red")){
            flag1=!flag;
            addredpath();
            R1coin.setDisable(flag1);
            R2coin.setDisable(flag1);
            R3coin.setDisable(flag1);
            R4coin.setDisable(flag1);
            redchange(dicenumber);
        }
        else if(x.equals("Blue")){
            addbluepath();


        }
        else if(x.equals("Green")){
            addgreenpath();
        }
        else if(x.equals("Yellow")){
            flag1=!flag;
            addyellownpath();
            y1coin.setDisable(flag1);
            y2coin.setDisable(flag1);
            y3coin.setDisable(flag1);
            y4coin.setDisable(flag1);
            yellowchange(dicenumber);
        }
    }
    //RED function
    @FXML
    public void redchange(int dicenumber) {
        GridPane R11 =(GridPane)R1coin.getParent();
        GridPane R12 =(GridPane)R2coin.getParent();
        GridPane R13 =(GridPane)R3coin.getParent();
        GridPane R14 =(GridPane)R4coin.getParent();
        if(R11==R1 & R12==R2 & R13==R3 & R14==R4){
            System.out.println(" FOUR coin present");
            if(dicenumber==6){
                redpathlist.get(0).add(R1coin,0,0);
            }

        }
        else if((R14==R4 & R12==R2 & R13==R3)){
            System.out.println("three coin present");
             if (dicenumber!=6){
                GridPane currnentlocationl=(GridPane) R1coin.getParent();
                int currentindex= redpathlist.indexOf(currnentlocationl);
                redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
            }
        }
    }
    @FXML
    public void movered(javafx.scene.input.MouseEvent event,int dicenumber){
        GridPane R11 =(GridPane)R1coin.getParent();
        GridPane R12 =(GridPane)R2coin.getParent();
        GridPane R13 =(GridPane)R3coin.getParent();
        GridPane R14 =(GridPane)R4coin.getParent();
        if(R11==redfinal && R12==redfinal && R13==redfinal && R14==redfinal){
            winnertext.setText("!!!!!PLAYER1 WON!!!!!");
            winnertext.setVisible(true);

        }
        GridPane currnentlocationl;
        if(event!=null){
            if(event.getSource().equals(R1coin)){
                currnentlocationl=(GridPane) R1coin.getParent();
                int currentindex;
                    if(currnentlocationl==G53 ){
                        if(dicenumber==6){
                            System.out.println("don't move");
                        }
                        else{
                            currentindex= redpathlist.indexOf(currnentlocationl);
                            redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
                        }

                    }
                    else if(currnentlocationl==G54){
                         if(dicenumber==5 || dicenumber==6){
                             System.out.println("don't move");
                         }
                         else{
                            currentindex= redpathlist.indexOf(currnentlocationl);
                            redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
                        }

                    }
                    else if(currnentlocationl==G55){
                        if(dicenumber==4|| dicenumber==5||dicenumber==6){
                            System.out.println("don't move");
                        }
                        else{
                            currentindex= redpathlist.indexOf(currnentlocationl);
                            redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
                        }


                    }
                    else if(currnentlocationl==G56){
                         if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                             System.out.println("don't move");
                         }
                         else{
                            currentindex= redpathlist.indexOf(currnentlocationl);
                            redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
                        }

                    }
                    else if(currnentlocationl==G57){
                         if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                             System.out.println("don't move");
                         }
                         else{
                             currentindex= redpathlist.indexOf(currnentlocationl);
                             redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
                         }
                    }
                    else if(currnentlocationl==redfinal){
                        R1coin.setDisable(true);
                    }
                    else{
                    currnentlocationl=(GridPane) R1coin.getParent();
                     currentindex= redpathlist.indexOf(currnentlocationl);
                        System.out.println("current "+currentindex);
                    redpathlist.get(currentindex+dicenumber).add(R1coin,0,0);
                    }
                }
            else if(event.getSource().equals(R2coin)){
                currnentlocationl=(GridPane) R2coin.getParent();
                int currentindex;
                if(R2coin.getParent()==R2 & dicenumber==6){
                    redpathlist.get(0).add(R2coin,0,0);
                    }
                else if(currnentlocationl==G53 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R2coin,0,0);
                    }

                }
                else if(currnentlocationl==G54){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R2coin,0,0);
                    }

                }
                else if(currnentlocationl==G55){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R2coin,0,0);
                    }


                }
                else if(currnentlocationl==G56){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R2coin,0,0);
                    }

                }
                else if(currnentlocationl==G57){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R2coin,0,0);
                    }
                }
                else if(currnentlocationl==redfinal){
                    R2coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) R2coin.getParent();
                    currentindex= redpathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    redpathlist.get(currentindex+dicenumber).add(R2coin,0,0);
                }

            }
                else if(event.getSource().equals(R3coin)){
                currnentlocationl=(GridPane) R3coin.getParent();
                int currentindex;
                if(R3coin.getParent()==R3 & dicenumber==6){
                    redpathlist.get(0).add(R3coin,0,0);
                }
                else if(currnentlocationl==G53 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R3coin,0,0);
                    }

                }
                else if(currnentlocationl==G54){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R3coin,0,0);
                    }

                }
                else if(currnentlocationl==G55){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R3coin,0,0);
                    }


                }
                else if(currnentlocationl==G56){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R3coin,0,0);
                    }

                }
                else if(currnentlocationl==G57){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R3coin,0,0);
                    }
                }
                else if(currnentlocationl==redfinal){
                    R3coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) R3coin.getParent();
                    currentindex= redpathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    redpathlist.get(currentindex+dicenumber).add(R3coin,0,0);
                }
                }
                else if(event.getSource().equals(R4coin)){
                currnentlocationl=(GridPane) R3coin.getParent();
                int currentindex;
                if(R4coin.getParent()==R4 & dicenumber==6){
                    redpathlist.get(0).add(R4coin,0,0);
                }
                else if(currnentlocationl==G53 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R4coin,0,0);
                    }

                }
                else if(currnentlocationl==G54){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R4coin,0,0);
                    }

                }
                else if(currnentlocationl==G55){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R4coin,0,0);
                    }


                }
                else if(currnentlocationl==G56){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R4coin,0,0);
                    }

                }
                else if(currnentlocationl==G57){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= redpathlist.indexOf(currnentlocationl);
                        redpathlist.get(currentindex+dicenumber).add(R4coin,0,0);
                    }
                }
                else if(currnentlocationl==redfinal){
                    R4coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) R4coin.getParent();
                    currentindex= redpathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    redpathlist.get(currentindex+dicenumber).add(R4coin,0,0);
                }

            }
        }
    }
    @FXML
    public void mainred(javafx.scene.input.MouseEvent event) {
        int dicen=Integer.parseInt(numbershow.getText());
        movered(event,dicen);
    }
    public void R1change(javafx.scene.input.MouseEvent mouseEvent){
        mainred(mouseEvent);
    }
    public void R2change(javafx.scene.input.MouseEvent mouseEvent) {
        mainred(mouseEvent);
    }
    public void R3change(javafx.scene.input.MouseEvent mouseEvent) {
        mainred(mouseEvent);
    }
    public void R4change(javafx.scene.input.MouseEvent mouseEvent) {
        mainred(mouseEvent);
    }
    //Red close all function
    //yellow function
    @FXML
    public void yellowchange(int dicenumber) {
        GridPane y11 =(GridPane)y1coin.getParent();
        GridPane y12 =(GridPane)y2coin.getParent();
        GridPane y13 =(GridPane)y3coin.getParent();
        GridPane y14 =(GridPane)y4coin.getParent();
        if(y11==y1 & y12==y2 & y13==y3 & y14==y4){
            System.out.println(" FOUR coin present");
            if(dicenumber==6){
                ypathlist.get(0).add(y1coin,0,0);
            }

        }
        else if((y14==y4 & y12==y2 & y13==y3)){
            System.out.println("three coin present");
            if (dicenumber!=6){
                GridPane currnentlocationl=(GridPane) y1coin.getParent();
                int currentindex= ypathlist.indexOf(currnentlocationl);
                ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
            }
        }
    }
    @FXML
    public void moveyellow(javafx.scene.input.MouseEvent event,int dicenumber){
        GridPane y11 =(GridPane)y1coin.getParent();
        GridPane y12 =(GridPane)y2coin.getParent();
        GridPane y13 =(GridPane)y3coin.getParent();
        GridPane y14 =(GridPane)y4coin.getParent();

        if(y11==Yellowfinal && y12==Yellowfinal && y13==Yellowfinal && y14==Yellowfinal){
            winnertext.setVisible(true);
            winnertext.setText("!!!!!PLAYER1 WON!!!!!");

        }
        GridPane currnentlocationl;
        if(event!=null){
            if(event.getSource().equals(y1coin)){
                currnentlocationl=(GridPane) y1coin.getParent();
                int currentindex;
                if(currnentlocationl==G63 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
                    }

                }
                else if(currnentlocationl==G64){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
                    }

                }
                else if(currnentlocationl==G65){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
                    }


                }
                else if(currnentlocationl==G66){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
                    }

                }
                else if(currnentlocationl==G67){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
                    }
                }
                else if(currnentlocationl==Yellowfinal){
                    y1coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) y1coin.getParent();
                    currentindex= ypathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    ypathlist.get(currentindex+dicenumber).add(y1coin,0,0);
                }
            }
            else if(event.getSource().equals(y2coin)){
                currnentlocationl=(GridPane) y2coin.getParent();
                int currentindex;
                if(y2coin.getParent()==y2 & dicenumber==6){
                    ypathlist.get(0).add(y2coin,0,0);
                }
                else if(currnentlocationl==G63 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y2coin,0,0);
                    }

                }
                else if(currnentlocationl==G64){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y2coin,0,0);
                    }

                }
                else if(currnentlocationl==G65){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y2coin,0,0);
                    }
                }
                else if(currnentlocationl==G66){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y2coin,0,0);
                    }

                }
                else if(currnentlocationl==G67){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y2coin,0,0);
                    }
                }
                else if(currnentlocationl==Yellowfinal){
                    y2coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) y2coin.getParent();
                    currentindex= ypathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    ypathlist.get(currentindex+dicenumber).add(y2coin,0,0);
                }
                }
            else if(event.getSource().equals(y3coin)){
                currnentlocationl=(GridPane) y3coin.getParent();
                int currentindex;
                if(y3coin.getParent()==y3 & dicenumber==6){
                    ypathlist.get(0).add(y3coin,0,0);
                }
                else if(currnentlocationl==G63 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y3coin,0,0);
                    }

                }
                else if(currnentlocationl==G64){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y3coin,0,0);
                    }

                }
                else if(currnentlocationl==G65){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y3coin,0,0);
                    }
                }
                else if(currnentlocationl==G66){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y3coin,0,0);
                    }

                }
                else if(currnentlocationl==G67){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y3coin,0,0);
                    }
                }
                else if(currnentlocationl==Yellowfinal){
                    y3coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) y3coin.getParent();
                    currentindex= ypathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    ypathlist.get(currentindex+dicenumber).add(y3coin,0,0);
                }
            }
            else if(event.getSource().equals(y4coin)){
                currnentlocationl=(GridPane) y4coin.getParent();
                int currentindex;
                if(y4coin.getParent()==y4 & dicenumber==6){
                    ypathlist.get(0).add(y4coin,0,0);
                }
                else if(currnentlocationl==G63 ){
                    if(dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y4coin,0,0);
                    }

                }
                else if(currnentlocationl==G64){
                    if(dicenumber==5 || dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y4coin,0,0);
                    }

                }
                else if(currnentlocationl==G65){
                    if(dicenumber==4|| dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y4coin,0,0);
                    }
                }
                else if(currnentlocationl==G66){
                    if(dicenumber==3 || dicenumber==4||dicenumber==5||dicenumber==6){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y4coin,0,0);
                    }

                }
                else if(currnentlocationl==G67){
                    if(dicenumber==5||dicenumber==4||dicenumber==3||dicenumber==2){
                        System.out.println("don't move");
                    }
                    else{
                        currentindex= ypathlist.indexOf(currnentlocationl);
                        ypathlist.get(currentindex+dicenumber).add(y4coin,0,0);
                    }
                }
                else if(currnentlocationl==Yellowfinal){
                    y4coin.setDisable(true);
                }
                else{
                    currnentlocationl=(GridPane) y4coin.getParent();
                    currentindex= ypathlist.indexOf(currnentlocationl);
                    System.out.println("current "+currentindex);
                    ypathlist.get(currentindex+dicenumber).add(y4coin,0,0);
                }
            }
        }
    }
    @FXML
    public void mainyellow(javafx.scene.input.MouseEvent event) {
        int dicen=Integer.parseInt(numbershow.getText());
        moveyellow(event,dicen);
    }
    public void Y1change(javafx.scene.input.MouseEvent event) {
        mainyellow(event);
    }
    public void Y2change(javafx.scene.input.MouseEvent event) {
        mainyellow(event);
    }
    public void Y3change(javafx.scene.input.MouseEvent event) {
        mainyellow(event);
    }
    public void Y4change(javafx.scene.input.MouseEvent event) {
        mainyellow(event);
    }

    public void number(ActionEvent actionEvent) {
        int x=dice();
        String y = Integer.toString(x);
        button.setDisable(true);
        Thread thread = new Thread() {
            public void run() {
                try {
                    File file = new File("src\\sample\\images1/Dice"+x+".jpg");
                    numbershow.setText(y);
                    Diceimage.setImage(new Image(file.toURI().toString()));
                    Thread.sleep(2000);
                    button.setDisable(false);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        player(x);
        thread.start();

    }
    public void player(int dicenumber) {
        if (player.getText().equals("Player1")) {
            if(dicenumber==6){
                patheset("Red", true, dicenumber);
            }
            else{
                patheset("Red", true, dicenumber);
                player.setText("Player2");
            }

        }
            else if(player.getText().equals("Player2")){
            if(dicenumber==6){
                patheset("Yellow", true, dicenumber);
            }
            else{
                patheset("Yellow", true, dicenumber);
                player.setText("Player1");
            }
               }
    }



    public void playertext(javafx.scene.input.MouseEvent event) {
        player.setText("Player1");
    }
}
