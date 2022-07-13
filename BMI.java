/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Vernon Ong, 13 Jul 2022 11:10:04 pm
 */

package bmi;

import java.util.regex.Pattern;

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
	private Label display = new Label();
	private Button calculate = new Button();
	private Button reset = new Button();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		weightText.setText("Enter Your Weight in (kg):");
		heightText.setText("Enter your Height Metre (m):");
		resultText.setText("Result:");
		calculate.setText("Calculate BMI");
		reset.setText("Reset");
		weight.setPrefColumnCount(25);
		height.setPrefColumnCount(25);
		result.setPrefColumnCount(25);
		result.setEditable(false);
		
		pane.getChildren().addAll(weightText, weight, heightText, height, resultText, result, calculate, reset, display);
		pane.setAlignment(Pos.CENTER);
		
		EventHandler<ActionEvent> res = (ActionEvent e) -> reset();
		reset.setOnAction(res);
		
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
		
		String regEx = "[1-9](.){1}[1-9]";
		double total = 0;
		boolean matching = Pattern.matches(regEx, height.getText());
		if (matching == true) {
			double WEIGHT = Double.valueOf(weight.getText());
			double HEIGHT = Double.valueOf(height.getText());
			total = WEIGHT/(HEIGHT * HEIGHT);
			result.setText(String.valueOf(total));
		} else {
			display.setText("Invalid value!");
		}
		
	}
	
	public void reset() {
		weight.clear();
		height.clear();
		result.clear();
		pane.getChildren().remove(display);
	}

}
