package com.company;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("John","Johnson","johnnyJonson@aol.com", "johnny");
        User u2 = new User("Andy", "Anderson", "andyAnders@gmail.com", "coolAndy");
        User u3 = new User("royRoyson@gmail.com");
        User u4 = new User("Ralph","Reaner","reannyRalph@hotmail.com","reaningtoRean" );


        Product bread = new Product("WhiteBread", 3.50, 01, 10);
        Product juice = new Product("Orange Juice", 2, 02,6);
        Product soda = new Product("Coke", 1, 03,7);
        Product apple = new Product("Apple", 0.5, 04, 15);
        Product pear = new Product("Pear", 0.7, 05, 12);



        ArrayList<Product> itemListA = new ArrayList<>(asList(bread,juice));
        ArrayList<Product> itemListB = new ArrayList<>(asList(apple));

        Category carbs = new Category();
        Category bevs = new Category("Beverage");
        Category fruit = new Category("fruits", itemListA );

        carbs.addNewProduct(bread);
        bevs.addNewProduct(juice);
        bevs.addNewProduct(soda);
        fruit.addNewProduct(apple);
        fruit.addNewProduct(pear);

        Basket basketJohn=new Basket();
        Basket hasketAndy= new Basket(u1);
        Basket basketGuest= new Basket(u2,itemListB);

        basketJohn.add(bread);
        hasketAndy.add(juice);
        hasketAndy.buy();
        basketGuest.remove(apple);

    }
}
