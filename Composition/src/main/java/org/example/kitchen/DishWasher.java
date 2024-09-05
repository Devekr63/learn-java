package org.example.kitchen;

public class DishWasher {
    private boolean hasWorkToDo;
    public void doDishes(){
        hasWorkToDo = !hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}
