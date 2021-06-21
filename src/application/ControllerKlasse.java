package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerKlasse {
	
	private Stage Fenster;
	private Scene Szene;
	private Parent root;
	
	@FXML
	TextField GroesseFeld;
	
	public void bmiOK(ActionEvent e) throws IOException{
		 
		String groesse = GroesseFeld.getText();
		
		FXMLLoader GroesseLoader = new FXMLLoader(getClass().getResource("AbnehmenSzene.fxml"));
		root = GroesseLoader.load();
		EventKlasse eventLoader = GroesseLoader.getController();
		eventLoader.groesseAnzeigen(groesse);
		
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
	}
	public void AbbruchKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("BmiAbfrage.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
}
}