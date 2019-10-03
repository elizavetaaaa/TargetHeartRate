package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
   // Controller myController = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Target Heart Rate Calculator");
        primaryStage.setScene(new Scene(root, 262, 135));
        //myController.maxHeartRateEntry.setEditable(false);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
