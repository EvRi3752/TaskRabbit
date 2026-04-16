import javafx.application.Application;
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 


public class App extends Application {
    @Override
    public void main(Stage stage) throws Exception {
        if (getResource() == null){
            return;
        }
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage.setScene(new Scene(root)); 
        stage.show(); 
    }

    public static void main(String[] args) throws Exception {
        launch(args); 
    }
}