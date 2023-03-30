/*
Crayola.java
Author: gametechmatch
Course: Object Oriented Programming 1
Date: 3/30/23
 */
package crayola;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Crayola extends Application
{

    public void start(Stage primaryStage)
    {
        // Create box
        Rectangle boxBottom = new Rectangle(60, 60, 180, 180);
        boxBottom.setFill(Color.GOLDENROD);
        
        Arc backBoxTop = new Arc();
        backBoxTop.setCenterX(150);
        backBoxTop.setCenterY(60);
        backBoxTop.setRadiusX(90.0f);
        backBoxTop.setRadiusY(30.0f); 
        backBoxTop.setStartAngle(-150.0f); 
        backBoxTop.setLength(-239.0f); 
        backBoxTop.setType(ArcType.OPEN);
        backBoxTop.setFill(Color.GOLDENROD);
        
        // Create crayons
        Rectangle blueCrayon = new Rectangle(63, 63, 20, 140);
        blueCrayon.setFill(Color.BLUE);
        Polygon blueCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        blueCrayonTip.setFill(Color.BLUE);
        
        Rectangle greenCrayon = new Rectangle(85, 61, 20, 140);
        greenCrayon.setFill(Color.GREEN);
        Polygon greenCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        greenCrayonTip.setFill(Color.GREEN);
        greenCrayonTip.setTranslateX(22);
        greenCrayonTip.setTranslateY(-2);
        
        Rectangle redCrayon = new Rectangle(107, 59, 20, 140);
        redCrayon.setFill(Color.RED);
        Polygon redCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        redCrayonTip.setFill(Color.RED);
        redCrayonTip.setTranslateX(44);
        redCrayonTip.setTranslateY(-4);
        
        Rectangle yellowCrayon = new Rectangle(129, 57, 20, 140);
        yellowCrayon.setFill(Color.YELLOW);
        Polygon yellowCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        yellowCrayonTip.setFill(Color.YELLOW);
        yellowCrayonTip.setTranslateX(66);
        yellowCrayonTip.setTranslateY(-6);
        
        Rectangle blackCrayon = new Rectangle(151, 57, 20, 140);
        blackCrayon.setFill(Color.BLACK);
        Polygon blackCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        blackCrayonTip.setFill(Color.BLACK);
        blackCrayonTip.setTranslateX(88);
        blackCrayonTip.setTranslateY(-6);
        
        Rectangle brownCrayon = new Rectangle(173, 59, 20, 140);
        brownCrayon.setFill(Color.BROWN);
        Polygon brownCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        brownCrayonTip.setFill(Color.BROWN);
        brownCrayonTip.setTranslateX(110);
        brownCrayonTip.setTranslateY(-4);
        
        Rectangle orangeCrayon = new Rectangle(195, 61, 20, 140);
        orangeCrayon.setFill(Color.ORANGE);
        Polygon orangeCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        orangeCrayonTip.setFill(Color.ORANGE);
        orangeCrayonTip.setTranslateX(132);
        orangeCrayonTip.setTranslateY(-2);
        
        Rectangle purpleCrayon = new Rectangle(217, 63, 20, 140);
        purpleCrayon.setFill(Color.PURPLE);
        Polygon purpleCrayonTip = new Polygon(63, 63, 71, 55,75, 55, 83, 63);
        purpleCrayonTip.setFill(Color.PURPLE);
        purpleCrayonTip.setTranslateX(154);
        
        // Create front box
        Rectangle frontBox = new Rectangle(60, 80, 180, 180);
        frontBox.setFill(Color.GOLDENROD);
        
        Text frontBoxText = new Text(110, 100, "Crayola");
        frontBoxText.setFont(Font.font ("Anja Eliane accent Nornal", 20));
        frontBoxText.setFill(Color.BLUE);
 
        
        //Create groups
        Group blCrayon = new Group(blueCrayon, blueCrayonTip);
        Group gCrayon = new Group(greenCrayon, greenCrayonTip);
        Group rCrayon = new Group(redCrayon, redCrayonTip);
        Group yCrayon = new Group(yellowCrayon, yellowCrayonTip);
        Group blkCrayon = new Group(blackCrayon, blackCrayonTip);
        Group brCrayon = new Group(brownCrayon, brownCrayonTip);
        Group oCrayon = new Group(orangeCrayon, orangeCrayonTip);
        Group pCrayon = new Group(purpleCrayon, purpleCrayonTip);
                
        Group crayons = new Group(blCrayon, gCrayon, rCrayon, yCrayon,
                blkCrayon, brCrayon, oCrayon, pCrayon);
        
        Group backBox = new Group(boxBottom, backBoxTop);
        Group frontBoxGroup = new Group(frontBox, frontBoxText);
        
        Group allObjects = new Group(backBox, crayons, frontBoxGroup);
        
        
             
        //Set up the scene
        Scene crayonsScene = new Scene(allObjects, 300, 350, Color.WHITE);
        primaryStage.setTitle("Crayons");
        primaryStage.setScene(crayonsScene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
