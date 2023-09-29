package com.example.demo2;
public class Items {
    private String item;
    private int qty;
    private int value;
    public Items(String item, int qty, int value){
        this.item = item;
        this.qty = qty;
        this.value = value;

    }
    public String getItem(){
        return item;
    }
    public int getQty(){
        return qty;
    }
    public int getValue(){
        return value;
    }
}
