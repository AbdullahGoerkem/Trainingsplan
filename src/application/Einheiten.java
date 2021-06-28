package application;

import java.io.IOException;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Einheiten {
	
	@FXML
	static
	Button startKnopfMuskel;
	@FXML
	Button weiterButton;
	@FXML
	Label MuskelEinheit;
	@FXML
	Label abnehmenEinheit;
	
	private Stage Fenster;
	private Scene Szene;
	private Parent root;
	int z;

	public void TrainingAbnehmen() {

		
		
	}
	public void MenuKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("OberflaecheMain.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
	}
	static int Liegestuetze = 101; 	// --------------------------------------------------
	static int Planke = 102;
	static int GluteBridge = 201;     // Einheiten für Muskelaufbau (100-300)
	static int Situp = 202;
	static int Kniebeuge = 301;
	static int Squat = 302;		  // --------------------------------------------------
	
	static int Crunch = 701;		  // --------------------------------------------------
	static int PlankJack = 702;
	static int Bergsteiger = 801;    // Einheiten für Abnehmen (700-900)
	static int HighKnee = 802;
	static int Joggen = 901;
	static int Kaefer = 902;		 // --------------------------------------------------
	
	
	static int[] MuskelEinheiten = {Kniebeuge, GluteBridge, Liegestuetze, Squat, Situp, Planke};
	static int[] AbnehmenEinheiten = {HighKnee, Joggen, PlankJack, Crunch, Kaefer, Bergsteiger};
	
	
	
	public void startMuskelTraining() {
		Quicksort q = new Quicksort();
		q.quicksort(MuskelEinheiten, 0, 5);
		
		int[] MuskelnSortiert = MuskelEinheiten;
		int f = MuskelnSortiert[z];
		
		switch (f) {
		case 101:
			MuskelEinheit.setText("15 Liegestütze");
			break;
		case 102:
			MuskelEinheit.setText("5 Min. Planke");
			break;
		case 201:
			MuskelEinheit.setText("5 Min. Glute Bridge");
			break;
		case 202:
			MuskelEinheit.setText("10 Situps");
			break;
		case 301:
			MuskelEinheit.setText("10 Kniebeugen");
			break;
		case 302:
			MuskelEinheit.setText("10 Squats");
			break;
		}
		}
	public void weiterTraining() {
		if (z == 0) {
			startMuskelTraining();
			z++;
		} else if (z == 1) {
			z++;
			startMuskelTraining();
		} else if (z == 2) {
			z++;
			startMuskelTraining();
		} else if (z == 3) {
			z++;
			startMuskelTraining();
		} else if (z == 4) {
			z++;
			startMuskelTraining();
		} else if (z == 5) {
			startMuskelTraining();
			z++;
		} else if (z == 6) {
			MuskelEinheit.setText("Training Beendet!");
		}																//----------------------------
	}																	//Abnehmen Code
	public void startAbnehmenTraining() {
		int[] AbnehmenSortiert = AbnehmenEinheiten;
		Selectionsort.selectionsort(AbnehmenSortiert);
		
		int f = AbnehmenSortiert[z];
		
		switch (f) {
		case 701:
			abnehmenEinheit.setText("15 Crunches");
			break;
		case 702:
			abnehmenEinheit.setText("15 Plank Jacks");
			break;
		case 801:
			abnehmenEinheit.setText("10 Bergsteiger");
			break;
		case 802:
			abnehmenEinheit.setText("10 Highknees");
			break;
		case 901:
			abnehmenEinheit.setText("5 Min. Joggen");
			break;
		case 902:
			abnehmenEinheit.setText("5 Käfer");
			break;
		}
		}
	public void weiterAbnehmenTraining() {
		if (z == 0) {
			startAbnehmenTraining();
			z++;
		} else if (z == 1) {
			z++;
			startAbnehmenTraining();
		} else if (z == 2) {
			z++;
			startAbnehmenTraining();
		} else if (z == 3) {
			z++;
			startAbnehmenTraining();
		} else if (z == 4) {
			z++;
			startAbnehmenTraining();
		} else if (z == 5) {
			startAbnehmenTraining();
			z++;
		} else if (z == 6) {
			abnehmenEinheit.setText("Training Beendet!");
		}
	}
}
