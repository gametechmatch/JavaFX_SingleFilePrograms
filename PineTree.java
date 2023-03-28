/*
PineTree.java
//--------------------------------------------------------------------
Author: gametechmatch
3/28/2023
Object Oriented Programming 1
Source: Course Instructor Code & Textbook "Java Software Solutions"
//------------------------------------------------------------------
This file creates a pine tree with the triangle layers not filled in
//--------------------------------------------------------------------
 */
package pinetree;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class PineTree extends Application
{
    //--------------------------------------------------------------------
    //  Presents a pine tree
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {        
        /////////////////CREATE TREE TIP TRIANGLE////////////////////////
        
        // middle triangle left line
        Line tipLeftLine = new Line(120, 39, 100, 65);
        tipLeftLine.setStrokeWidth(3);
        tipLeftLine.setStroke(Color.DARKOLIVEGREEN);
        
        // middle triangle right line
        Line tipRightLine = new Line(120, 39, 140, 65);
        tipRightLine.setStrokeWidth(3);
        tipRightLine.setStroke(Color.DARKOLIVEGREEN);
       
        // middle triangle bottom line
        Line tipBottomLine = new Line (100, 65, 140, 65);
        tipBottomLine.setStrokeWidth(3);
        tipBottomLine.setStroke(Color.DARKOLIVEGREEN);


        ////////////////CREATE TOP TREE TRIANGLE///////////////////

        // top triangle left line
        Line topLeftLine = new Line(80, 130, 121, 65);
        topLeftLine.setStrokeWidth(3);
        topLeftLine.setStroke(Color.DARKOLIVEGREEN);
        

        // top triangle right line
        Line topRightLine = new Line(160, 130, 121, 65);
        topRightLine.setStrokeWidth(3);
        topRightLine.setStroke(Color.DARKOLIVEGREEN);
        
       
        // top triangle bottom line
        Line topBottomLine = new Line (80, 130, 160, 130);
        topBottomLine.setStrokeWidth(3);
        topBottomLine.setStroke(Color.DARKOLIVEGREEN);

        /////////////////CREATE MIDDLE TREE TRIANGLE////////////////////////
        
        // middle triangle left line
        Line midLeftLine = new Line(120, 131, 60, 221);
        midLeftLine.setStrokeWidth(3);
        midLeftLine.setStroke(Color.DARKOLIVEGREEN);
        
        // middle triangle right line
        Line midRightLine = new Line(120, 131, 180, 221);
        midRightLine.setStrokeWidth(3);
        midRightLine.setStroke(Color.DARKOLIVEGREEN);
       
        // middle triangle bottom line
        Line midBottomLine = new Line (60, 221, 180, 221);
        midBottomLine.setStrokeWidth(3);
        midBottomLine.setStroke(Color.DARKOLIVEGREEN);
        
        ////////////////CREATE BOTTOM TREE TRIANGLE////////////////////////
        
        // bottom triangle left line
        Line bottomLeftLine = new Line(120, 222, 40, 338);
        bottomLeftLine.setStrokeWidth(3);
        bottomLeftLine.setStroke(Color.DARKOLIVEGREEN);
        
        // bottom triangle right line
        Line bottomRightLine = new Line(120, 222, 200, 338);
        bottomRightLine.setStrokeWidth(3);
        bottomRightLine.setStroke(Color.DARKOLIVEGREEN);
       
        // bottom triangle bottom line
        Line bottomBottomLine = new Line (40, 338, 200, 338);
        bottomBottomLine.setStrokeWidth(3);
        bottomBottomLine.setStroke(Color.DARKOLIVEGREEN);
        
        /////////////////////CREATE TREE TRUNK////////////////////////
        Rectangle treeTrunk = new Rectangle(80, 339, 80, 40);
        treeTrunk.setFill(Color.SIENNA);
        /////////////////////////CREATE GROUPS//////////////////////////
        Group treeTip = new Group(tipLeftLine, tipRightLine, tipBottomLine);
        Group treeTop = new Group(topLeftLine, topRightLine, topBottomLine);
        Group treeMiddle = new Group(midLeftLine, midRightLine, midBottomLine);
        Group treeBottom = new Group(bottomLeftLine, bottomRightLine, bottomBottomLine);
        
        
        //Create group for whole tree
        Group tree = new Group(treeTip, treeTop, treeMiddle, treeBottom, treeTrunk);
        tree.setTranslateX(170);
        tree.setTranslateY(0);
        
        //Establish the ground
        Rectangle ground = new Rectangle(0, 300, 500, 200);
        ground.setFill(Color.MAROON);
        
        // Create group and adjust the scene
        Group root = new Group(ground,tree);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);
        primaryStage.setTitle("Tree");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
