package org.example;

public class Product {
    private String model;
    private String manufacturer;

    private int width;
    private int height;
    private int length;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{

    private String resolution;
    private int xAxis;
    private int yAxis;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, String resolution, int xAxis, int yAxis) {
        super(model, manufacturer);
        this.resolution = resolution;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public String getResolution() {
        return resolution;
    }
}

class MotherBoard extends Product{
    String ram;
    String diskStorage;
    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, String ram, String diskStorage) {
        super(model, manufacturer);
        this.ram = ram;
        this.diskStorage = diskStorage;
    }

    public String getRam() {
        return ram;
    }

    public String getDiskStorage() {
        return diskStorage;
    }

    public void loadProgram(String program){
        System.out.println("Loading "+program+" .......");
    }
}

class Cabinet extends Product{
    private String powerSupply;
    public Cabinet(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}
