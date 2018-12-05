package designolor;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Walid Amriou
 */
public class FlatController implements Initializable {

    @FXML
    private AnchorPane c;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
                for (int i = 1; i < 48; i++) {
            //from the AnchorPan A we get the button object with the number i
            Button button = (Button) c.getChildren().get(i);
            button.setOnAction((event) -> { // here we work with the click in the button of the color
                String myString = button.getText();
                StringSelection stringSelection = new StringSelection(myString);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            });
        }
    }    
    
}
