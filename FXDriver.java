package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		/*
		FXMainPane root = new FXMainPane();
		stage.setTitle("Hello");
		stage.show();
		*/
		
		//  set the scene to hold root
		
		/*  Task1
		Scene scene = new Scene(root);
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();
		
		
		
		Label label = new Label("Hello World!!!");
		Scene scene2 = new Scene(label, 300,80);
		stage.setScene(scene2);
		stage.show();
		Button b1 = new Button("One");
		Button b2 = new Button("Two");
		VBox vPane = new VBox();
		vPane.getChildren().addAll(b1, b2);
		stage.setScene(new Scene(vPane));
		stage.show();
		
		*/

		FXMainPane fmp = new FXMainPane();
		fmp.start(stage);
		stage.setTitle("Hello World GUI");
		stage.show();
		
		
	}
}
