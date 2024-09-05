package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","small", "some noise", "20lbs");
        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "medium");

        Dog newDog = new Dog("Mutt","medium","bark","100lbs","long","long");
        doAnimalStuff(newDog,"medium");

        Nonliving stone = new Nonliving("3d random", "1000kg", "huge");
        System.out.println(stone);

        Puppy joey = new Puppy("Mutt","very small","bark","10lbs","long","long", "laila");
        doAnimalStuff(joey,"slow");
        joey.printParentName();
    }

    public static void doAnimalStuff(Animal animal, String speed){
        System.out.println(animal);
        animal.move(speed);
    }
}