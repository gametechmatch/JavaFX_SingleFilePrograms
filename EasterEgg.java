/*
EasterEgg.java
Author: gametechmatch
Class: OOP1
Date: 4/4/23
This program generates decorated easter eggs
 */
package easteregg;

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.awt.Image;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;

public class EasterEgg extends Application
{
    public void start(Stage primaryStage) throws FileNotFoundException
    {
        ////////////////////// CREATE TEXT ////////////////////////////////
         Text easterText = new Text(50, 110, "Happy Easter!");
        easterText.setFont(Font.font ("Calibre", 60));
        easterText.setFill(Color.SANDYBROWN);
        
        ////////////////////// KIRBY EGG ////////////////////////////////

        // ______________________ Create egg ______________________
        Ellipse kirbyEgg = new Ellipse(250, 250, 160, 200);
        kirbyEgg.setFill(Color.PINK);
        
        // ______________________ Create face ______________________
        // left eye
        Ellipse lEye = new Ellipse(180, 180, 20, 50);
        lEye.setFill(Color.BLACK);
        Ellipse lEyeWhite = new Ellipse(180, 160, 10, 20);
        lEyeWhite.setFill(Color.WHITE);
        Arc lEyeDarkBlue = new Arc(180, 200, 15, 25, 195, 150);
        lEyeDarkBlue.setFill(Color.BLUE);
        
        // right eye
        Ellipse rEye = new Ellipse(320, 180, 20, 50);
        rEye.setFill(Color.BLACK);
        Ellipse rEyeWhite = new Ellipse(320, 160, 10, 20);
        rEyeWhite.setFill(Color.WHITE);
        Arc rEyeDarkBlue = new Arc(320, 200, 15, 25, 195, 150);
        rEyeDarkBlue.setFill(Color.BLUE);
        
        // mouth
        Arc mouthBottom = new Arc(250, 250, 40, 80, 195, 150);
        mouthBottom.setFill(Color.BROWN);
        
        Arc mouthTop = new Arc(250, 247, 40, 25, 195, 150);
        mouthTop.setFill(Color.BROWN);
        mouthTop.setRotate(180);
        
        // tongue
        Arc tongueBottom = new Arc(250, 285, 30, 43, 195, 150);
        tongueBottom.setFill(Color.RED);
        
        Arc tongueTop = new Arc(250, 276, 30, 20, 195, 150);
        tongueTop.setFill(Color.RED);
        tongueTop.setRotate(180);
        
        // cheeks
        Ellipse lCheek = new Ellipse(150, 250, 30, 15);
        lCheek.setFill(Color.VIOLET);
        
        Ellipse rCheek = new Ellipse(350, 250, 30, 15);
        rCheek.setFill(Color.VIOLET);
        
        // ______________________ Create designs ______________________
        Line lineOne = new Line(97, 191, 248, 50);
        lineOne.setStroke(Color.RED);
        
        Line lineTwo = new Line(91, 270, 307, 64);
        lineTwo.setStroke(Color.ORANGE);
        
        Line lineThree = new Line(104, 330, 350, 94);
        lineThree.setStroke(Color.YELLOW);
        
        Line lineFour = new Line(128, 379, 381, 136);
        lineFour.setStroke(Color.GREEN);
        
        Line lineFive = new Line(163, 417, 402, 188);
        lineFive.setStroke(Color.BLUE);
        
        Line lineSix = new Line(210, 443, 410, 253);
        lineSix.setStroke(Color.PURPLE);
        
        Line lineSeven = new Line(280, 446, 390, 346);
        lineSeven.setStroke(Color.VIOLET);
        
        ////////////////////// LEFT EGG ////////////////////////////////
        
        // ______________________ Create egg ______________________
        Ellipse leftEgg = new Ellipse(250, 250, 160, 200);
        leftEgg.setFill(Color.CORNFLOWERBLUE);
        
        // ______________________ Create designs ______________________
        Line lLineOne = new Line(97, 191, 248, 50);
        lLineOne.setStroke(Color.RED);
        
        Line lLineTwo = new Line(91, 270, 307, 64);
        lLineTwo.setStroke(Color.ORANGE);
        
        Line lLineThree = new Line(104, 330, 350, 94);
        lLineThree.setStroke(Color.YELLOW);
        
        Line lLineFour = new Line(128, 379, 381, 136);
        lLineFour.setStroke(Color.GREEN);
        
        Line lLineFive = new Line(163, 417, 402, 188);
        lLineFive.setStroke(Color.BLUE);
        
        Line lLineSix = new Line(210, 443, 410, 253);
        lLineSix.setStroke(Color.PURPLE);
        
        Line lLineSeven = new Line(280, 446, 390, 346);
        lLineSeven.setStroke(Color.VIOLET);
        
        ////////////////////// RIGHT EGG ////////////////////////////////
        
        // ______________________ Create egg ______________________
        Ellipse rightEgg = new Ellipse(250, 250, 160, 200);
        rightEgg.setFill(Color.LIGHTGOLDENRODYELLOW);
        
        // ______________________ Create designs ______________________
        Line rLineOne = new Line(97, 191, 248, 50);
        rLineOne.setStroke(Color.RED);
        
        Line rLineTwo = new Line(91, 270, 307, 64);
        rLineTwo.setStroke(Color.ORANGE);
        
        Line rLineThree = new Line(104, 330, 350, 94);
        rLineThree.setStroke(Color.YELLOW);
        
        Line rLineFour = new Line(128, 379, 381, 136);
        rLineFour.setStroke(Color.GREEN);
        
        Line rLineFive = new Line(163, 417, 402, 188);
        rLineFive.setStroke(Color.BLUE);
        
        Line rLineSix = new Line(210, 443, 410, 253);
        rLineSix.setStroke(Color.PURPLE);
        
        Line rLineSeven = new Line(280, 446, 390, 346);
        rLineSeven.setStroke(Color.VIOLET);
        
        ////////////////////// CREATE GROUPS  ///////////////////////////
        
        // __________ Create Kirby Egg Groups ______________________
        // Egg Designs
        Group kEggDesigns = new Group(lineOne, lineTwo, lineThree, lineFour,
                lineFive, lineSix, lineSeven);
        
        // Face Designs
        Group eyes = new Group(lEye, rEye, rEyeWhite, lEyeWhite,
                lEyeDarkBlue, rEyeDarkBlue);
        Group tongue = new Group(tongueTop, tongueBottom);
        Group mouth = new Group(mouthBottom, mouthTop, tongue, tongueTop);
        Group face = new Group(eyes, mouth, lCheek, rCheek);
        
        // Egg Groups
        Group kirbyEggGroup = new Group(kirbyEgg, kEggDesigns, face);
        kirbyEggGroup.setScaleX(.5);
        kirbyEggGroup.setScaleY(.5);
        
        // __________ Create Left Egg Groups ______________________
        Group lEggDesigns = new Group(lLineOne, lLineTwo, lLineThree,
                lLineFour, lLineFive, lLineSix, lLineSeven);
        
        Group leftEggGroup = new Group(leftEgg, lEggDesigns);
        leftEggGroup.setScaleX(.5);
        leftEggGroup.setScaleY(.5);
        leftEggGroup.setRotate(-45);
        leftEggGroup.setTranslateX(-50);
        
        // __________ Create Right Egg Groups ______________________
        Group rEggDesigns = new Group(rLineOne, rLineTwo, rLineThree,
                rLineFour, rLineFive, rLineSix, rLineSeven);
        
        Group rightEggGroup = new Group(rightEgg, rEggDesigns);
        rightEggGroup.setScaleX(.5);
        rightEggGroup.setScaleY(.5);
        rightEggGroup.setRotate(45);
        rightEggGroup.setTranslateX(50);
        
        // __________ Bring Groups Together ______________________
        Group allObjects = new Group(leftEggGroup, rightEggGroup,
                kirbyEggGroup, easterText);
             
        //Set up the scene
        Scene eggScene = new Scene(allObjects, 500, 500, Color.GREEN);
        primaryStage.setTitle("Easter Egg");
        primaryStage.setScene(eggScene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
