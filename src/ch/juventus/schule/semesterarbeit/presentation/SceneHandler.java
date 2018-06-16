package ch.juventus.schule.semesterarbeit.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : ${user}
 * @since: ${date}
 */
public class SceneHandler {
    private static SceneHandler instance;
    private SceneHandler(){

    }
    public static SceneHandler getInstance(){
        if(SceneHandler.instance == null){
            SceneHandler.instance = new SceneHandler();
        }
        return SceneHandler.instance;
    }

    public void renderScene(Stage primaryStage , String fileName, String sceneName) throws IOException {
        Stage window = primaryStage;
        Parent parent = FXMLLoader.load(getClass().getResource(fileName + ".fxml"));
        Scene scene = new Scene(parent);
        window.setScene(scene);
        window.setTitle(sceneName);
        window.show();
    }

    public void goBackToTheMainMenu(ActionEvent actionEvent) throws IOException {
        Node node=(Node) actionEvent.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void renderNextScene(ActionEvent actionEvent, String fileName) throws IOException {
        Node node=(Node) actionEvent.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(fileName + ".fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}