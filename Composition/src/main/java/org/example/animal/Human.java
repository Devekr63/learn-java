package org.example.animal;

public class Human extends Animal{
    private String race;

    public Human(String race, String type) {
        super(type);
        this.race = race;
    }


    public String getRace() {
        return race;
    }
}
