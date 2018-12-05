package designolor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Walid Amriou
 */
public class HomeController implements Initializable {

    @FXML
    private Button fluent;
    @FXML
    private Button material;
    @FXML
    private Button flat;
    @FXML
    private AnchorPane content;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //When the app start it call the Home.fxml and after that call Fluent.fxml 
        //inside the Home.fxml, in "content" space
        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource("Fluent.fxml"));
            content.getChildren().setAll(loader);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    //When clike in fluent, material or flat button, the app call the .fxml file
    //with the same so fluent call fluent.fxml ... 
    //We just add by setStyle to change the color of the button when click in to 
    //see the change in the button and know where you are. 
    
    @FXML
    private void fluent(ActionEvent event) {
        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource("Fluent.fxml"));
            content.getChildren().setAll(loader);
            fluent.setStyle("-fx-background-color:  #E1BEE7;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
            flat.setStyle("-fx-background-color:  #FAFAFA;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
            material.setStyle("-fx-background-color:  #FAFAFA;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void material(ActionEvent event){

        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource("Material.fxml"));
            content.getChildren().setAll(loader);
            material.setStyle("-fx-background-color:  #E1BEE7;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
            flat.setStyle("-fx-background-color:  #FAFAFA;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
            fluent.setStyle("-fx-background-color:  #FAFAFA;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void flat(ActionEvent event){

        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource("Flat.fxml"));
            content.getChildren().setAll(loader);
            flat.setStyle("-fx-background-color:  #E1BEE7;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
            fluent.setStyle("-fx-background-color:  #FAFAFA;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
            material.setStyle("-fx-background-color:  #FAFAFA;-fx-effect: dropshadow(three-pass-box, gray, 10, 0, 0, 0);");
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
