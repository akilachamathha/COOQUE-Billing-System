package com.example.demo2;

        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.TextField;
        import javafx.scene.control.cell.PropertyValueFactory;

        import java.net.URL;
        import java.util.List;
        import java.util.ResourceBundle;

public class PaneController implements Initializable {

    //.........TableView....................................................
    @FXML
    private TableView<Item> table;
    @FXML
    private TableColumn<Item, String> tcItem;
    @FXML
    private TableColumn<Item, Integer> tcQty;
    @FXML
    private TableColumn<Item, Integer> tcValue;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle){
        tcItem.setCellValueFactory(new PropertyValueFactory<Item,String>("item"));
        tcQty.setCellValueFactory(new PropertyValueFactory<Item, Integer>("qty"));
        tcValue.setCellValueFactory(new PropertyValueFactory<Item,Integer>("value"));

    }
    //....................................................................
    //..........Variables.................................................
    private int ttl =0;
    private int vanilaQty = 0;
    private int chocolateQty = 0;
    private int fruitQty = 0;
    private int mangoQty = 0;
    private int butterQty = 0;
    private int veryQty = 0;
    private int rockeyQty = 0;
    private int creamQtyQty = 0;
    private int espressoQty = 0;
    private int coconutQty = 0;
    private int rumQty = 0;

    //.............................................................................

    private void updateTable(Item item){
        ObservableList<Item> items = table.getItems();
        boolean itemExists = false;
        int index=0;
        for (Item existingItem : items) {
            if (existingItem.getItem().equals(item.getItem())) {
                index = items.indexOf(existingItem);
                itemExists = true;
                break;
            }
        }
        if(!itemExists){
            items.add(item);
        }else{
            items.set(index,item);
        }
        table.setItems(items);

        ttl = ttl + item.price;
        tfTotal.setText(String.valueOf(ttl));
    }
    //............Items_Buttons....................................................
    @FXML
    void ButtonVanila(ActionEvent event) {
        vanilaQty += 1;
        int multifyValue = vanilaQty * 100;
        Item vanila = new Item("Vanila", vanilaQty, multifyValue);
        vanila.price=100;
        updateTable(vanila);
    }
    @FXML
    void ButtonChocolate(ActionEvent event) {
        chocolateQty += 1;
        int multifyValue = chocolateQty * 120;
        Item chocolate = new Item("Chocolate", chocolateQty, multifyValue);
        chocolate.price=120;
        updateTable(chocolate);
    }
    @FXML
    void ButtonFruitNut(ActionEvent event) {
        fruitQty += 1;
        int multifyValue = fruitQty * 150;
        Item fruitNuts = new Item("Fruit & Nuts", fruitQty, multifyValue);
        fruitNuts.price=150;
        updateTable(fruitNuts);
    }
    @FXML
    void ButtonMango(ActionEvent event) {
        mangoQty += 1;
        int multifyValue = mangoQty * 150;
        Item mango = new Item("Mango", mangoQty, multifyValue);
        mango.price=150;
        updateTable(mango);
    }
    @FXML
    void ButtonButterScotch(ActionEvent event) {
        Item item = new Item("Butter Scotch", 1, 150);
        ObservableList<Item> items = table.getItems();
        items.add(item);
        table.setItems(items);
    }
    @FXML
    void ButtonVeryBerry(ActionEvent event) {
        Item item = new Item("Very Berry", 1, 200);
        ObservableList<Item> items = table.getItems();
        items.add(item);
        table.setItems(items);
    }
    @FXML
    void ButtonCookieCream(ActionEvent event) {
        Item item = new Item("Cokie Cream", 1, 200);
        ObservableList<Item> items = table.getItems();
        items.add(item);
        table.setItems(items);
    }
    @FXML
    void ButtonRockeyRoad(ActionEvent event) {
        Item item = new Item("RockeyRoad", 1, 200);
        ObservableList<Item> items = table.getItems();
        items.add(item);
        table.setItems(items);
    }

    //............................................................................................

    @FXML
    private TextField tfCash;

    @FXML
    private TextField tfTotal;
    @FXML
    private TextField tfBalance;

    //............Number Pad..............................
    String cash ="";
    int balance = 0;
    @FXML
    void no0(){
        if(cash != ""){
            cash = cash+"0";
            tfCash.setText(cash);
            tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
        }
    }
    @FXML
    void no1(){
        cash = cash+"1";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no2(){
        cash = cash+"2";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no3(){
        cash = cash+"3";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no4(){
        cash = cash+"4";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no5(){
        cash = cash+"5";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no6(){
        cash = cash+"6";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no7(){
        cash = cash+"7";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no8(){
        cash = cash+"8";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void no9(){
        cash = cash+"9";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void dot (){
        cash = cash+".";
        tfCash.setText(cash);
        tfBalance.setText(String.valueOf(Integer.valueOf(cash)-ttl));
    }
    @FXML void clear(){
        cash="";
        tfCash.setText(cash);
        tfBalance.setText("");
    }




}


