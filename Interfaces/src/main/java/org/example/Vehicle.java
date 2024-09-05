package org.example;

public interface Vehicle {
    String vehicleType = "Land Vehicle";

    String type();
    String weight();

    default void start(){
        honk();
        System.out.println("Start Engine.");
    }

    static void honk(){
        doNothing();
        System.out.println("Honk.....");
    }

    private static void doNothing(){
        System.out.println("Vehicle is still");
    }
}
