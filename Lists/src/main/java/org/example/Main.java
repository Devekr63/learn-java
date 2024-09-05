package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<GroceryItem> buyingList = new ArrayList<>();
        buyingList.add(new GroceryItem("soap", 5));

        ArrayList<GroceryItem> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(new GroceryItem("soap", 5), new GroceryItem("butter", 10), new GroceryItem("cooking oil", 3)));

//        newList.add("Devendra");

        ArrayList someList;
        someList=newList;
        someList.add("Devendra");

        addData(newList);
        newList.add(new GroceryItem("shampoo", 4));
//        newList.add(" ");
        System.out.println(newList);
    }

    public static void addData(ArrayList list){
        list.add("Oranges");
    }
}

record GroceryItem(
        String name,
        String type,
        Integer quantity
){
    public GroceryItem(String name, Integer quantity){
        this(name, "everyday item", quantity);
    }
}
