package javafxapplication3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

// Author Vlad Crihan
// Exercise 14.3 from Introduction to Java by Y.Daniel Liang 10th Edition
// Extracurricular exercise

public class JavaFXApplication3 extends Application {
    
    Button refreshBt = new Button("Refresh");
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a Grid Pannel
        GridPane gridPane = new GridPane();
        gridPane.setHgap(4);
        gridPane.setVgap(1);
        
        //put the frist 4 cards on the screen
        refresh(gridPane);
        
        //action handler for the button
        refreshBt.setOnAction(e -> refresh(gridPane));
        
        //add the button to the screen/grid
        gridPane.add(refreshBt,2,1);
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Random Cards"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    private void refresh(GridPane gridPane) {
        
        Image[] images = {
            //club
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//2C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//3C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//4C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//5C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//6C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//7C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//8C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//9C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//10C.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//JC.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//QC.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//KC.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//AC.jpg"),
            
            //Diamonds
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//2D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//3D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//4D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//5D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//6D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//7D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//8D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//9D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//10D.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//JD.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//QD.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//KD.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//AD.jpg"),
            
            //hearth
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//2H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//3H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//4H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//5H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//6H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//7H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//8H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//9H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//10H.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//JH.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//QH.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//KH.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//AH.jpg"),
            
            //spades
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//2S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//3S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//4S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//5S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//6S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//7S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//8S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//9S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//10S.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//JS.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//QS.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//KS.jpg"),
            new Image("file:///D://School//Semester 2//Java 2//Cards//Images//AS.jpg"),
        };
        
        for (int i = 0; i < 4; i++) {
            int random = (int)(Math.random()*images.length);
            gridPane.add(new ImageView(images[random]),i,0);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
