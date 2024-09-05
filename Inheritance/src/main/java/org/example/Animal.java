package org.example;

public class Animal {

    private String type;
    private String size;
    private String sound;
    private String weight;

    public Animal(){}

    public Animal(String type, String size, String sound, String weight) {
        this.type = type;
        this.size = size;
        this.sound = sound;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println(type+" moves "+speed);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", sound='" + sound + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
