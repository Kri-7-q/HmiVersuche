package Utility;

import Domain.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;

import java.util.Random;


/**
 * A factory to get some controls.
 */
public class ControlFactory {

    // Static
    // Get a horizontal box with buttons.
    static public Node buttonHBox(String[] captionList, int padding, int spacing) {
        if (captionList == null) {
            captionList = new String[] {"Open", "Open file", "Save", "Save as", "Import", "Export", "Close", "Close project"};
        }
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(padding));
        hbox.setSpacing(spacing);
        for (String caption : captionList) {
            hbox.getChildren().add(new Button(caption));
        }

        return hbox;
    }

    // Static
    // Get a table view object filled with person objects.
    static public Node personTableView(int listSize) {
        Random rnd = new Random(System.currentTimeMillis());
        ObservableList<Person> list = FXCollections.observableArrayList();
        for (int count=0; count<listSize; ++count) {
            list.add(Person.randomObject(rnd));
        }
        TableView<Person> tableView = new TableView<>(list);
        for (String column : Person.properties) {
            String header[] = column.split(":");
            TableColumn<Person, String> col = new TableColumn<>(header[0]);
            col.setCellValueFactory(new PropertyValueFactory<Person, String>(header[1]));
            tableView.getColumns().add(col);
        }

        return tableView;
    }

}
