package part5javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

	@FXML
	private TextField username;
	@FXML
	private PasswordField password;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public void okAction(ActionEvent event) {
		System.out.println("Username: " + this.username.getText() + ", Password: " + this.password.getText());
		System.out.println("OK Button Fired!");
	}

	public void cancelAction(ActionEvent event) {
		this.username.setText("");
		this.password.setText("");
		System.out.println("Cancel Button Fired!");
	}

}
