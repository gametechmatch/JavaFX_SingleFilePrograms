/*
MyCircles.java
//--------------------------------------------------
Author: gametechmatch
Course: Object Oriented Programming 1
Date: March 2023
Resources: Instructor code & textbook "Java Software Solutions"
//--------------------------------------------------
This Program prints the symbol for the olympics
//--------------------------------------------------
 */
package mycircles;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MyCircles extends Application 

{
 // launch the application
    public void start(Stage stage)
    {
        // set title for the stage
        stage.setTitle("creating circle");
  
        // create a circle
        Circle circleBlue = new Circle();
        Circle circleYellow = new Circle();
        Circle circleBlack = new Circle();
        Circle circleGreen = new Circle();
        Circle circleRed = new Circle();
  
        // set the position of center of the  circle
        //.0f is means "float" can also just use .0
        circleBlue.setCenterX(80.0f);
        circleBlue.setCenterY(100.0f);
        
        circleYellow.setCenterX(120.0f);
        circleYellow.setCenterY(150.0f);
        
        circleBlack.setCenterX(180.0f);
        circleBlack.setCenterY(100.0f);
        
        circleGreen.setCenterX(240.0f);
        circleGreen.setCenterY(150.0f);
        
        circleRed.setCenterX(280.0f);
        circleRed.setCenterY(100.0f);
  
        // set Radius of the circle
          circleBlue.setRadius(50.0f);
          circleYellow.setRadius(50.0f);
          circleBlack.setRadius(50.0f);
          circleGreen.setRadius(50.0f);
          circleRed.setRadius(50.0f);
        //circle.setRadius(50);
  
        // set the fill of the circle
        circleBlue.setStroke(Color.BLUE);
        circleYellow.setStroke(Color.YELLOW);
        circleBlack.setStroke(Color.BLACK);
        circleGreen.setStroke(Color.GREEN);
        circleRed.setStroke(Color.RED);
        
        // set the fill of the circle
        circleBlue.setFill(null);
        circleYellow.setFill(null);
        circleBlack.setFill(null);
        circleGreen.setFill(null);
        circleRed.setFill(null);
        
        // set the fill of the circle
        circleBlue.setStrokeWidth(5);
        circleYellow.setStrokeWidth(5);
        circleBlack.setStrokeWidth(5);
        circleGreen.setStrokeWidth(5);
        circleRed.setStrokeWidth(5);
  
        // create a Group
        Group group = new Group(circleBlue, circleYellow, circleBlack,
        circleGreen, circleRed);
  
        // create a scene
        Scene scene = new Scene(group, 500, 300);
  
        // set the scene
        stage.setScene(scene);
  
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
