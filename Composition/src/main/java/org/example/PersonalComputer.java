package org.example;

public class PersonalComputer extends Product{

    private Monitor monitor;
    private Cabinet cabinet;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Cabinet cabinet, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.cabinet = cabinet;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
