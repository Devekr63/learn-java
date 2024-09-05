package org.example;

public class Car implements Vehicle, Engine{
    @Override
    public Double power() {
        return 500.0;
    }

    @Override
    public String type() {
        return "Sports";
    }



    @Override
    public String weight() {
        return "1400 kg";
    }

//    @Override
//    public void start() {
//        Vehicle.super.start();
//    }
}
