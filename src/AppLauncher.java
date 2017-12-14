import Utility.ControlFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Christian on 14.12.17.
 */
public class AppLauncher extends Application {

    // Applications entry point.
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(ControlFactory.buttonHBox(null, 20, 10));
        pane.setLeft(ControlFactory.personTableView(7));

        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Human Machine Interface");
        primaryStage.show();
    }
}
