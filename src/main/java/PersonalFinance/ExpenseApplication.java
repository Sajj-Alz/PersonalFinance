package PersonalFinance;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ExpenseApplication extends Application {
    public static void main(String[] args){launch (args);}
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExpenseApplication.class.getResource("expense-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Add Expense");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
