package HSClass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HSClassApplication extends Application {
    public static void main(String[] args){launch (args);}
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HSClassApplication.class.getResource("hsclass-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Class Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
