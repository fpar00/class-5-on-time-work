package com.company;

import java.util.ArrayList;

public class Basket {
    public User user;
    public ArrayList<Product> ItemList = new ArrayList<Product>();

    public void setUser(User user) {
        this.user = user;
    }

    public Basket(User user){

        this.user = user;
    }

    public void setItemList(ArrayList<Product> productList) {
        this.ItemList = ItemList;
    }

    public Basket() {
    }


    public Basket(User user, ArrayList<Product> products) {
        this.user = user;
        this.ItemList = ItemList;
    }

    public void buy() {
        double total = 0;
        for(int i = 0; i<ItemList.size(); i++) {
            total = total + ItemList.get(i).getItemPrice();
        }
    }

    public void remove(Product product){
        int maximumSize = ItemList.size();
        boolean full = true;
        int numOfItems = product.getNumOfItems();
        if (maximumSize >= 1){
            ItemList.remove(product);
            product.setNumOfItems(numOfItems + 1);
        }else{
            full = false;
            System.out.println("error");
        }
    }

    public void add(Product product)
    {
        int maximumSize = ItemList.size();
        boolean full = true;
        int numOfItems = product.getNumOfItems();

        if (numOfItems >= 1){
            ItemList.add(product);
            product.setNumOfItems(numOfItems - 1);

        }else{
            full = false;
            System.out.println("no items remaining");
        }


    }

}
