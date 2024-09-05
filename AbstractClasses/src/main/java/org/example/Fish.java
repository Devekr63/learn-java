package org.example;

public class Fish extends Animal{

    public Fish(String type, String size, double weight){
        super(type, size, weight);
    }
    @Override
    public void move(String speed) {
        switch(speed){
            case "slow" -> System.out.println("The Fish is toddling.");
            case "fast" -> System.out.println("The Fish is blazing.");
            default -> System.out.println("The Fish is still in the water.");
        }
    }

    @Override
    public void makeNoise() {
        switch (type){
            case "Dolphin" -> System.out.println("The dolphin is whistling.");
            case "Shark" -> System.out.println("The shark is growling.");
        }
    }
}
