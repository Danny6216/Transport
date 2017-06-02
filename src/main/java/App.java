import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;


public class App extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = this.getClass().getClassLoader().getResource("sample.fxml");

        GridPane root = FXMLLoader.<GridPane>load(fxmlURL);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.getScene();
    }

}