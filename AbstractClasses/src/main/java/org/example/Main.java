package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepherd", "Medium", 150.0));
        animals.add(new Fish("Shark", "Big", 3000.0));
        animals.add(new Fish("Dolphin", "Big", 2000.0));

        for(Animal animal:animals){
            doAnimalThings(animal, "fast");
            System.out.println();
        }
    }

    private static void doAnimalThings(Animal animal, String speed){
        animal.move(speed);
        animal.makeNoise();
    }
}