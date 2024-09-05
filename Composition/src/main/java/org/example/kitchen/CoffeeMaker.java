package org.example.kitchen;

public class CoffeeMaker {
    private boolean hasWorkToDo;
    public void brewCoffee(){
        hasWorkToDo = !hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}
