import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : A.D.Liyanage
 * @since : 0.1.0
 **/

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/lk/ijse/chat_project/view/LoginForm.fxml"))));
        primaryStage.setMaximized(false);
        primaryStage.setResizable(true);
        primaryStage.show();
       /* primaryStage.setMaximized(true);
        primaryStage.setMaximized(false);*/

    }
}
