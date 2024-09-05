package org.example;

public class Puppy extends Dog{

    private String parentName;
    public Puppy(String type, String size, String sound, String weight, String earShape, String tailShape, String parentName) {
        super(type, size, sound, weight, earShape, tailShape);
        this.parentName = parentName;
    }

    public void printParentName(){
        System.out.println("My parent name is "+parentName);
    }
}
