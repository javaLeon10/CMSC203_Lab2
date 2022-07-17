package application;

import javafx.application.Application;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */

//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	/*
	Label label = new Label("Hello World!!!");
	Scene scene = new Scene(label, 300,80);
	stage.setScene(scene);
	*/
	
	public void start(Stage stage) {
		HBox box1 = new HBox();
		HBox box2 = new HBox();
		TextField tx = new TextField();
		Label l1 =  new Label("Feedback");
		Button b1 = new Button("Hello");
		Button b2 = new Button("Howdy");
		Button b3 = new Button("Chinese");
		Button b4 = new Button("Clear");
		Button b5 = new Button("Exit");
		
		VBox vBox = new VBox(70);
		vBox.setAlignment(Pos.CENTER);
		Insets inset = new Insets(20,20,20,20);
		vBox.setSpacing(20);
		vBox.setMargin(tx,  new Insets(20,20,20,20) );
		vBox.setMargin(b1,  new Insets(20,20,20,20) );
		vBox.setMargin(b2,  new Insets(20,20,20,20) );
		vBox.setMargin(b3,  new Insets(20,20,20,20) );
		vBox.setMargin(b4,  new Insets(20,20,20,20) );
		vBox.setMargin(b5,  new Insets(20,20,20,20) );
		
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(l1,tx,box2);
		ObservableList<Node> listVal = vBox.getChildren();
		listVal.addAll(tx,b1,b2,b3,b4,b5,box1);
		
		Scene scene2 = new Scene(vBox);
		stage.setScene(scene2);
		stage.show();
		
		
	
	}
	
	
	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		
		/*
		Label label = new Label("Hello World!!!");
		Scene scene2 = new Scene(label, 300,80);
		Stage.setScene(scene2);
		Stage.show();
		Button b1 = new Button("One");
		Button b2 = new Button("Two");
		VBox vPane = new VBox();
		vPane.getChildren().addAll(b1, b2);
		stage.setScene(new Scene(vPane));
		stage.show();
		*/
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
}
	
