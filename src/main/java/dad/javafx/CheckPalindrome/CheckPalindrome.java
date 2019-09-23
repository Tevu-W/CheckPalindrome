package dad.javafx.CheckPalindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CheckPalindrome extends Application {

	private TextField nombreText;
	private Label saludoLabel;
	private Button esPalindroma;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		nombreText = new TextField();
		nombreText.setText("Introduce un texto");
		nombreText.setMaxWidth(150);
		
		esPalindroma = new Button("Comprobar");
		esPalindroma.setDefaultButton(true);
		esPalindroma.setOnAction(e -> checkPalindrome(e));
		
		saludoLabel = new Label("Aquí va la palabra a comprobar");
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText,esPalindroma,saludoLabel);
		
		Scene scene = new Scene(root,320,200);
		
		primaryStage.setTitle("Comprobador de palindromos");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void checkPalindrome(ActionEvent e) {
		String inputString = nombreText.getText();
	    String back = "";
	    boolean pal = false;
	    for(int i=inputString.length()-1; i>=0 ;i--){
	        back = back + inputString.charAt(i);
	    }

	    pal = inputString.contentEquals(back);
	    
	    if(pal == true) {
	    	saludoLabel.setText("Es palindromo");
	    	saludoLabel.setStyle("-fx-text-fill: green; -fx-font: italic bold 30 sans-serif;");
	    }
	    else {
	    	saludoLabel.setText("NO es palindromo");
	    	saludoLabel.setStyle("-fx-text-fill: red; -fx-font: italic bold 30 sans-serif;");
	    }
	    
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
