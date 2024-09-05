package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Extension methods in Java 8
        //default & static methods
        //from jdk 9 interfaces also included
        //private static and non-static methods

        Car lambo = new Car();
        System.out.println(lambo.type()+" "+lambo.power()+" "+lambo.weight());
        lambo.start();


    }
}