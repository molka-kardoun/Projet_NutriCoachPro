/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author omnia
 */
public class MainConvention extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        //front office
   Parent root = FXMLLoader.load(getClass().getResource("FXMLoffreF.fxml"));

   //back office
   // Parent root = FXMLLoader.load(getClass().getResource("FXMLconventionB.fxml"));
  
  
  
  
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        launch(args);
        
        
        
        
      
       
    }

}
