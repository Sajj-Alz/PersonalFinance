package HSClass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConverterApp extends Application {
    public static void main(String[] args) {launch(args);}  // Launch the JavaFX application
    public void start(Stage primaryStage) throws IOException {
        // Example code to show a basic UI setup (replace with your actual UI logic)
        FXMLLoader fxmlLoader = new FXMLLoader(ConverterApp.class.getResource("converter-view.fxml"));
        //StackPane root = new StackPane();
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
