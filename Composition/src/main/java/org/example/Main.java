package org.example;

import org.example.animal.Person;
import org.example.kitchen.SmartKitchen;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.loadDishWasher();

        kitchen.setKitchenState(false, true,false);

        kitchen.doKitchenWork();

        Person dev = new Person("Devendra", "Indian", "Land");
    }
}