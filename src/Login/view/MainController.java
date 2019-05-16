package Login.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public void showHomePage() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root, 600, 750));
        primaryStage.show();

    }
    public void goShopping() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Shopping.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root, 600, 750));
        primaryStage.show();
    }
    public void goFline() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FLine.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root, 600,750));
        primaryStage.show();
    }
    public void goHook() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Hook.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root, 600, 750));
        primaryStage.show();

    }
    public void goReel() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Reel.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root,600,750));
        primaryStage.show();
    }
    public void goRod() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Rod.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root,600,750));
        primaryStage.show();
    }
    public void goSwivel() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Swivel.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root,600,750));
        primaryStage.show();
    }
    public void goSinker() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Sinker.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root,600,750));
        primaryStage.show();
    }
    public void goSignUp() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root,600,750));
        primaryStage.show();
    }
    public void goLogin() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Jeff's Fishing Sack");
        primaryStage.setScene(new Scene(root,600,750));
        primaryStage.show();
    }






}
