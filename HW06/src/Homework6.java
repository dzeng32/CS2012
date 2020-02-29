
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Homework6 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane bp = new BorderPane();
		Label label = new Label("Enter Answer");
		Button btn = new Button("Find Problems");
		TextField userInput = new TextField();
		
		HBox userBar = new HBox(20);
		userBar.getStyleClass().addAll("grid", "barBG");
		userBar.getChildren().addAll(label, userInput, btn);
		userBar.setAlignment(Pos.CENTER);
		
		
		GridPane gp = new GridPane();
		gp.getStyleClass().addAll("grid");
		gp.setPadding(new Insets(50, 50, 50, 50));
		gp.setHgap(25);
		gp.setVgap(10);
		
		Label[][] trackLabel = new Label[10][10];
		for(int rowCounter = 0; rowCounter <= 10; rowCounter++) {
			for(int colCounter = 0; colCounter <= 10; colCounter++) {
				
				Label equation = new Label();
				if(rowCounter == 0) {
					equation.setText(String.valueOf(colCounter));
					equation.getStyleClass().addAll("font", "align");
					//gp.add(equation, colCounter, rowCounter);
				} else if(colCounter == 0) {
					equation.setText(String.valueOf(rowCounter));
					equation.getStyleClass().add("font");
					//gp.add(equation, colCounter, rowCounter);
				} else {
					equation.setText((rowCounter ) + " * " + (colCounter));
					//gp.add(equation, colCounter, rowCounter);
					trackLabel[rowCounter -1][colCounter -1] = equation;
				}
				gp.add(equation, colCounter, rowCounter);

			}
		}
		
		btn.setOnAction( e -> {
			int answer = Integer.parseInt(userInput.getText());
			
			for(int row = 0; row < 10; row++)
				for(int col = 0; col < 10; col++) {
					if( (row + 1) * (col + 1) == answer) {
						trackLabel[row][col].getStyleClass().add("labelBG");
					} else {
						trackLabel[row][col].getStyleClass().remove("labelBG");
					}
				}
		});	
		
		Scene sc = new Scene(bp);
		sc.getStylesheets().add("styles1.css");

		bp.setTop(userBar);
		bp.setBottom(gp);
		primaryStage.setTitle("Homework 6");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

}
