package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        File file = new File("SweetsPackage.txt");
        if (file.exists()) {
            Parent createFile = FXMLLoader.load(getClass().getResource("CreateFile.fxml"));
            primaryStage.setTitle("Create File");
            primaryStage.setScene(new Scene(createFile, 469, 73));
            primaryStage.show();
        } else {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Choice Sweets");
            primaryStage.setScene(new Scene(root, 416, 294));
            primaryStage.show();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
