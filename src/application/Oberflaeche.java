package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Oberflaeche extends Application {

        @Override
        public void start(Stage arg0) {
        	try {
        		Parent root = FXMLLoader.load(getClass().getResource("OberflaecheMain.fxml"));
        		Scene szene = new Scene(root);
        		szene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        		arg0.setScene(szene);
        		arg0.show();
        	} catch(Exception e) {
        		e.printStackTrace();   
        	}

        }
}
