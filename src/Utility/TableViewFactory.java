package Utility;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.Random;

/**
 * Created by Christian on 14.12.17.
 */
public class TableViewFactory {

    static public <T> ObservableList<T> getRandomObjectList(int listSize) {
        Random rnd = new Random(System.currentTimeMillis());
        ObservableList<T> list = FXCollections.observableArrayList();
        for (int count=0; count<listSize; ++count) {
            // Add T objects to the list
        }

        return list;
    }

}
