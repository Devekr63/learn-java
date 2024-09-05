package org.example.animal;

public class Person extends Human{
    private String name;

    public Person(String name, String race, String type) {
        super(race, type);
        this.name = name;
        System.out.println("Name of the person is: "+this.name+" of race "+super.getRace()+" of type "+super.getType());
    }

    public String getName() {
        return name;
    }
}
