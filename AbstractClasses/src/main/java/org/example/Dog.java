package org.example;

public class Dog extends Animal{

    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }
    @Override
    public void move(String speed) {
        switch(speed){
            case "slow" -> System.out.println("The dog is walking.");
            case "fast" -> System.out.println("The dog is running.");
            default -> System.out.println("The dog is sleeping.");
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog is barking.");
    }
}
