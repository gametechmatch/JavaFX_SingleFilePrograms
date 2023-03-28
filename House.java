/*
House.java
//-----------------------------------------------------------------
Author: gametechmatch
Date: 3/22/2023
Course: Object Oriented Programming 1
Source: Instructor for course & textbook "Java Software Solutions"
//-----------------------------------------------------------------
This file creates a scene with a house and some flora
//-----------------------------------------------------------------
 */
package house;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class House extends Application 

{
 // launch the application
    public void start(Stage stage)
    {
        
        // initialize stage
        stage.setTitle("House");
        stage.show();
  
        // create shapes for house
        Rectangle chimney = new Rectangle(180, 120, 20, 80);
        chimney.setFill(Color.BLACK);
        Rectangle houseBase = new Rectangle(60, 200, 150, 100);   
        houseBase.setFill(Color.GREEN);
        Polygon attic = new Polygon(140, 100, 60, 200, 210, 200);
        attic.setFill(Color.GREEN);
        Line leftRoof = new Line(140, 100, 52, 210);
        leftRoof.setStrokeWidth(3);
        Line rightRoof = new Line(140, 100, 218, 210);
        rightRoof.setStrokeWidth(3);
        Rectangle leftLowerWindow = new Rectangle(90, 220, 15, 20);
        leftLowerWindow.setFill(Color.YELLOW);
        Rectangle rightLowerWindow = new Rectangle(175, 220, 15, 20);
        rightLowerWindow.setFill(Color.YELLOW);
        Rectangle atticWindow = new Rectangle(120, 170, 40, 20);
        atticWindow.setFill(Color.DARKBLUE);
        Rectangle door = new Rectangle(120, 250, 40, 50);
        door.setFill(Color.GREY);
        Circle doorHandle = new Circle(125, 270, 3);
        
        // create shapes for smoke
        Circle smokeOne = new Circle(185, 110, 10);
        smokeOne.setFill(Color.LIGHTGREY);
        Circle smokeTwo = new Circle(195, 103, 8);
        smokeTwo.setFill(Color.LIGHTGREY);
        Circle smokeThree = new Circle(175, 97, 10);
        smokeThree.setFill(Color.LIGHTGREY);
        Circle smokeFour = new Circle(187, 95, 10);
        smokeFour.setFill(Color.LIGHTGREY);
        Circle smokeFive = new Circle(180, 87, 8);
        smokeFive.setFill(Color.LIGHTGREY);
        
        // create shapes for sun
        Circle sun = new Circle(60, 65, 20);
        sun.setFill(Color.GOLD);
        Rectangle ground = new Rectangle(0, 270, 500, 50);
        ground.setFill(Color.DARKGOLDENROD);
        
        // create shapes for cloud one
        Circle cloudOne1 = new Circle(260, 50, 40);
        cloudOne1.setFill(Color.WHITE);
        Circle cloudOne2 = new Circle(300, 70, 30);
        cloudOne2.setFill(Color.WHITE);
        Circle cloudOne3 = new Circle(310, 55, 30);
        cloudOne3.setFill(Color.WHITE);
        Circle cloudOne4 = new Circle(340, 60, 20);
        cloudOne4.setFill(Color.WHITE);
        
        // create shapes for cloud two
        Circle cloudTwo1 = new Circle(360, 150, 40);
        cloudTwo1.setFill(Color.WHITE);
        Circle cloudTwo2 = new Circle(400, 170, 30);
        cloudTwo2.setFill(Color.WHITE);
        Circle cloudTwo3 = new Circle(410, 155, 30);
        cloudTwo3.setFill(Color.WHITE);
        Circle cloudTwo4 = new Circle(440, 160, 20);
        cloudTwo4.setFill(Color.WHITE);
        
        //create shapes for bushes One
        Circle bushOne = new Circle(260, 270, 30);
        bushOne.setFill(Color.DARKGREEN);
        Circle bushTwo = new Circle(290, 280, 25);
        bushTwo.setFill(Color.DARKGREEN);
        Circle bushThree = new Circle(315, 265, 35);
        bushThree.setFill(Color.DARKGREEN);
        Circle bushFour = new Circle(345, 275, 33);
        bushFour.setFill(Color.DARKGREEN);
        
        //create shapes for bushes Two
        Circle bushTwo1 = new Circle(60, 280, 30);
        bushTwo1.setFill(Color.DARKGREEN);
        Circle bushTwo2 = new Circle(30, 285, 25);
        bushTwo2.setFill(Color.DARKGREEN);
        Circle bushTwo3 = new Circle(315, 265, 35);
        bushTwo3.setFill(Color.DARKGREEN);     
        
        //create shapes for tree
        Rectangle treeBase = new Rectangle(275, 170, 30, 120);
        treeBase.setFill(Color.TAN);
        Circle treeLeavesOne = new Circle(275, 160, 40);
        treeLeavesOne.setFill(Color.YELLOWGREEN);
        Circle treeLeavesTwo = new Circle(310, 160, 40);
        treeLeavesTwo.setFill(Color.YELLOWGREEN);
        Circle treeLeavesThree = new Circle(280, 130, 40);
        treeLeavesThree.setFill(Color.YELLOWGREEN);
        Circle treeLeavesFour = new Circle(300, 120, 33);
        treeLeavesFour.setFill(Color.YELLOWGREEN);
  
        // create Groups
        Group smoke = new Group(smokeOne, smokeTwo, smokeThree,
                smokeFour, smokeFive);
        Group house = new Group(chimney, houseBase, attic, leftRoof, 
                rightRoof, leftLowerWindow, rightLowerWindow, 
                atticWindow, door, doorHandle);
        Group bushesOne = new Group(bushOne, bushTwo, bushThree, bushFour);
        Group bushesTwo = new Group(bushTwo1, bushTwo2, bushTwo3);
        
        Group tree = new Group(treeBase, treeLeavesOne, treeLeavesTwo,
        treeLeavesThree, treeLeavesFour);
        Group cloudOne = new Group(cloudOne1, cloudOne2, cloudOne3,
        cloudOne4);
        Group cloudTwo = new Group(cloudTwo1, cloudTwo2, cloudTwo3,
        cloudTwo4);
        Group clouds = new Group(cloudOne, cloudTwo);
        Group background = new Group(ground, sun, clouds, smoke);
        Group foreground = new Group(tree, bushesOne, bushesTwo);
        Group fullScene = new Group(background, house, foreground);
        
  
        // create a scene, set, and show the scene
        Scene scene = new Scene(fullScene, 500, 300, Color.LIGHTBLUE);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
