package designolor;

import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

/**
 *
 * @author Walid Amriou
 */
public class Designolor extends Application {

    /**
     * @param stage
     * @throws java.io.IOException
     */
    @Override
    public void start(Stage stage) throws Exception {
        // TODO code application logic here
        
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        Scene scene = new Scene(root);
        stage.getIcons().add(new Image("logo.png"));        
        stage.setTitle("Designolor");
        new JMetro(JMetro.Style.LIGHT).applyTheme(root);
        stage.setResizable(false);
        
        
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
