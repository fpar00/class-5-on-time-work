package com.company;

import java.util.ArrayList;

public class Category {
    public String categoryName;
    public ArrayList<Product> basketProductArray;
    {
        basketProductArray = new ArrayList<>();
    }

    public Category () {
        this.categoryName = "main";
    }

    public Category (String categoryName){
        this.categoryName=categoryName;
    }

    public Category (String name,ArrayList<Product> products) {
        this.categoryName=categoryName;
        this.basketProductArray = products;
    }

    public void addNewProduct (Product newProduct) {
        basketProductArray.add(newProduct);
    }
    public void deleteNewProduct (Product oldProduct){
        basketProductArray.remove(oldProduct);
    }

    public void setName(String categoryName) {
        this.categoryName = categoryName;
    }
}
