package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ControllerKlasse {
	
	private Stage Fenster;
	private Scene Szene;
	private Parent root;
	
	@FXML
	TextField nameTextFeld;
	@FXML
	TextField passTextFeld;
	@FXML
	Label loginFalsch;
	@FXML
    private TextField tf1;
    @FXML
    private TextField tf2; 
    @FXML
    private Label lb1; 
    @FXML
    private Label lb2; 
	

public void bmiOK(ActionEvent e) throws IOException{
   		
    	Bmi_rechner();	
}
public void Bmi_rechner() {
    if(tf2.getText().trim().isEmpty() || tf1.getText().trim().isEmpty()){
            Alert a = new Alert(AlertType.NONE);
            a.setContentText("Bitte geben sie ihre Größe ein");
            a.setAlertType(AlertType.ERROR);
            a.show(); 
            
    }else {
            float a=Float.parseFloat(tf1.getText());
            float b=Float.parseFloat(tf2.getText()); 
            float bmi=b/(a*a); 
            lb1.setText(""+bmi); {
                    
            
            
            if (bmi<=18.5) {
                    lb2.setText("unter Gewicht"); 
            }else if (bmi<24.9) {
                    lb2.setText("normal Gewicht"); 
            }else if (bmi<29.9) {
                    lb2.setText("über Gewicht"); 
            }
            else {
                    lb2.setText("Adipositas"); 
            }
            }                   
    }
    
            
    }
	public void AbbruchKnopf(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("OberflaecheMain.fxml"));
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
}
	public void login(ActionEvent e) throws IOException {
		String name = nameTextFeld.getText();
		String pass = passTextFeld.getText();
		
		FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("OberflaecheMain.fxml"));
		if (name.equals("admin") && pass.equals("admin")) {
		root = loginLoader.load();
		EventKlasse eventController = loginLoader.getController();
		eventController.NameUndPasswort(name, pass);
		
		Fenster = (Stage)((Node)e.getSource()).getScene().getWindow();
		Szene = new Scene(root);
		Fenster.setScene(Szene);
		Fenster.show();
		} else {
			
			
			loginFalsch.setText("Falsche angaben");
		}
		
		}
		}