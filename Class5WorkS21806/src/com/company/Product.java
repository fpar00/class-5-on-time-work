package com.company;

public class Product {
    public String itemName;
    public double itemPrice;
    public int itemCode;
    public int numOfItems;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setitemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public Product(String itemName, double itemPrice, int itemCode) {
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemCode=itemCode;

    }
    public Product(String itemName, double itemPrice, int itemCode, int numOfItems) {
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemCode=itemCode;
        this.numOfItems=numOfItems;
    }

    public void setPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
