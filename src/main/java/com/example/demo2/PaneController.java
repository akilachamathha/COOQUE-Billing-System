package com.example.demo2;

        import javafx.beans.Observable;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Button;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.TextField;
        import javafx.scene.control.cell.PropertyValueFactory;

        import java.net.URL;
        import java.util.List;
        import java.util.ResourceBundle;

public class PaneController implements Initializable {

    //@FXML
    //private Button bVanila;

    @FXML
    private TableView<Items> table;
    @FXML
    private TableColumn<Items, String> tcItem;

    @FXML
    private TableColumn<Items, Integer> tcQty;

    @FXML
    private TableColumn<Items, Integer> tcValue;

    ObservableList<Items> list = FXCollections.observableArrayList(
            new Items("Vanila",5,500),
            new Items("Vanila",10,500)
    );

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle){
        tcItem.setCellValueFactory(new PropertyValueFactory<Items,String>("item"));
        tcQty.setCellValueFactory(new PropertyValueFactory<Items, Integer>("qty"));
        tcValue.setCellValueFactory(new PropertyValueFactory<Items,Integer>("value"));
        
        table.setItems(list);

    }

    @FXML
    private TextField tfCash;

    @FXML
    private TextField tfTotal;


    @FXML
    private void onHelloButtonClick() {

        tfTotal.setText("10000");
        System.out.println("Clicked...........");
    }
}


