package org.example;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, String size, String sound, String weight, String earShape, String tailShape) {
        super(type, size, sound, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(){
        super("Mutt","medium","bark","100lbs");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
