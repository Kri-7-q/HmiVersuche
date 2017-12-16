import Utility.Constant;
import Utility.ControlFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Created by Christian on 16.12.17.
 */
public class AnchorPaneScene {

    // Static
    // Get an anchor pane scene.
    static public Scene anchorPaneScene() {
        Node btnNode = ControlFactory.buttonHBox(null, 20, 10);
        Node tableView = ControlFactory.personTableView(12);
        Node imgView = ControlFactory.imageView((String) Constant.MapImagePath.value());
        AnchorPane pane = new AnchorPane(btnNode, tableView, imgView);
        AnchorPane.setLeftAnchor(imgView, 0.0);
        AnchorPane.setTopAnchor(imgView, 0.0);
        AnchorPane.setTopAnchor(btnNode, 0.0);
        AnchorPane.setLeftAnchor(tableView, 0.0);
        AnchorPane.setBottomAnchor(tableView, 0.0);
        Scene scene = new Scene(pane, 800, 600);

        return scene;
    }

}
