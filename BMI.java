/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Vernon Ong, 13 Jul 2022 11:10:04 pm
 */

package bmi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;

public class BMI extends Application {

	private TextField weight = new TextField();
	private TextField height = new TextField();
	private TextField result = new TextField();
	private FlowPane pane = new FlowPane();
	private Label weightText = new Label();
	private Label heightText = new Label();
	private Label resultText = new Label();
	private Button calculate = new Button();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		weightText.setText("Enter Your Weight:");
		heightText.setText("Enter your Height:");
		resultText.setText("Result:");
		calculate.setText("Calculate BMI");
		weight.setPrefColumnCount(25);
		height.setPrefColumnCount(25);
		result.setPrefColumnCount(25);
		
		pane.getChildren().addAll(weightText, weight, heightText, height, resultText, result, calculate);
		pane.setAlignment(Pos.CENTER);
		
		EventHandler<ActionEvent> cal = (ActionEvent e) -> calculateBMI();
		calculate.setOnAction(cal);
		
		Scene mainScene = new Scene(pane);
		
		
		primaryStage.setTitle("BMI Calculator");
		primaryStage.setWidth(325);
		primaryStage.setHeight(500);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public void calculateBMI() {
		
	}

}
