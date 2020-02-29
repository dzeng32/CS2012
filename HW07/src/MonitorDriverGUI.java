package Homework4;

import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MonitorDriverGUI extends Application{

	public static void main(String args[]) {
		
		launch(args);
		//You have to use the console to enter the information
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		AttackMonitor test = new AttackMonitor();
		String output = "";
		
		Label lbl = new Label("Output below:");
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		Button choice1 = new Button("Report Attacks");
		Button choice2 = new Button("Show Attacks");
		Button choice3 = new Button("Show Damages");
		Button choice4 = new Button("Show Attacked Dates");
		Button choice5 = new Button("Save Attacks to File");
		Button choice6 = new Button("Read Attacks from File");
		
		pane.getChildren().addAll(choice1, choice2, choice3, choice4, choice5, choice6, lbl);
		
		TextArea outputText = new TextArea();
		BorderPane bp = new BorderPane();
		
		bp.setTop(pane);
		bp.setBottom(outputText);
		
		choice1.setOnAction( e -> {
			test.reportAttacks();
		});
		
		choice2.setOnAction( e -> {
			 outputText.setText(test.showAttacks());
		});
		
		choice3.setOnAction( e -> {
			outputText.setText(test.showDamages());
		});
		
		choice4.setOnAction( e -> {
			outputText.setText(test.findAttacks());
		});
		
		choice5.setOnAction( e -> {
			try {
				
				test.writeData();
			
			}catch (IOException i) {
				System.err.println(i);
				System.exit(1);
			}
		});
		
		choice6.setOnAction( e -> {
			try {
				
				test.replaceOldData();
				
			}catch (IOException i) {
				System.err.println(i);
				System.exit(1);
			}
		});
		
		
		Scene sc = new Scene(bp);
		
		primaryStage.setTitle("Homework 7");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
