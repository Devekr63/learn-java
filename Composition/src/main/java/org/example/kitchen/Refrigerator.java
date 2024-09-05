package org.example.kitchen;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        hasWorkToDo = !hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}
