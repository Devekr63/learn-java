package org.example;

public class Nonliving extends Object{

    private String shape;
    private String weight;
    private String type;

    public Nonliving(String shape, String weight, String type) {
        this.shape = shape;
        this.weight = weight;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Nonliving{" +
                "shape='" + shape + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
