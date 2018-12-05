package designolor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

/**
 * FXML Controller class
 *
 * @author Walid Amriou
 */
public class FluentController implements Initializable {

    @FXML
    private AnchorPane A;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //We have a 48 button so we make a loop from 1 to 48
        for (int i = 1; i < 48; i++) {
            //from the AnchorPan A we get the button object with the number i
            Button button = (Button) A.getChildren().get(i);
            button.setOnAction((event) -> { // here we work with the click in the button of the color
                String myString = button.getText();
                StringSelection stringSelection = new StringSelection(myString);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            });
        }
                
    }    



 

 
    
}
