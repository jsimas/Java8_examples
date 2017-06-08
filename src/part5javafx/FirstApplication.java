package part5javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label message = new Label("Hello World!");
		message.setFont(new Font(100));
		
		Label message2 = new Label("Hello World2!");
		message2.setFont(new Font(100));
		
		VBox vbox = new VBox(message, message2);
		
		primaryStage.setScene(new Scene(vbox));
		primaryStage.setTitle("JSimas");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
