import Utility.Constant;
import Utility.ControlFactory;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 * Created by Christian on 16.12.17.
 */
public class BorderPaneScene {

    // Static
    // Build a border pane scene.
    static public Scene borderPaneScene() {
        BorderPane pane = new BorderPane();

        pane.setTop(ControlFactory.buttonHBox(null, 20, 10));
        pane.setLeft(ControlFactory.personTableView(7));
        pane.setCenter(ControlFactory.imageView((String) Constant.MapImagePath.value()));

        return new Scene(pane, 800, 600);
    }

}
