package com.example.demo2;


public class Item {
    public int price;
    public int itemQty;
    private String item;
    private int qty;
    private int value;
    public Item(String item, int qty, int value){
        this.item = item;
        this.qty = qty;
        this.value = value;
    }

    public String getItem(){
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public int getQty(){
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
