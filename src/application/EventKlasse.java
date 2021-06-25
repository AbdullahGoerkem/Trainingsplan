package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EventKlasse {

	
	@FXML
	Label eingeloggtAls;
	Label groesseAusgabe;
	
	
	private Stage Fenster;
	private Scene Szene;
	private Parent root;
	

	public void AbnehmenKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("AbnehmenSzene.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
	}
	public void MuskelKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MuskelSzene.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
}
	public void MenuKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("OberflaecheMain.fxml"));
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

	public void AdminKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("AdminEinheiten.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
	}
	public void BmiKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("BmiJa.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
	}
	public void NameUndPasswort(String name, String pass) {
		if (name.equals("admin") && pass.equals("admin")) {
				eingeloggtAls.setText("Eingeloggt als: " + name);
		}
		else {
			System.out.println("Nutzerdaten ung�ltig");
			
			
		}
	}
	}