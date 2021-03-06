package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //меню настроек из fxml файла
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/startMenu.fxml")));
        //значок и название окна
        primaryStage.setTitle("Minesweeper");
        InputStream iconStream = getClass().getResourceAsStream("/icon.png");
        Image icon = null;
        if (iconStream != null) {
            icon = new Image(iconStream);
        }
        primaryStage.getIcons().add(icon);
        //запуск окна с настройками
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}