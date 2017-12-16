import Utility.ControlFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Application launcher
 */
public class AppLauncher extends Application {

    // Applications entry point.
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = AnchorPaneScene.anchorPaneScene();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Human Machine Interface");
        primaryStage.show();
    }
}
