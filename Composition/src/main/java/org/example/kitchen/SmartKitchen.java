package org.example.kitchen;

public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

    public void addWater(){
        if(coffeeMaker.isHasWorkToDo()){
            System.out.println("Coffee is being prepared.....");
            return;
        }
        coffeeMaker.brewCoffee();
        System.out.println("Coffee is being prepared.....");
    }
    public void pourMilk(){
        if(refrigerator.isHasWorkToDo()){
            System.out.println("Pouring Milk....");
            return;
        }
        refrigerator.orderFood();
        System.out.println("Pouring Milk....");
    }
    public void loadDishWasher(){
        if (dishWasher.isHasWorkToDo()){
            System.out.println("Washing clothes....");
            return;
        }
        dishWasher.doDishes();
        System.out.println("Washing clothes....");
    }
    public void setKitchenState(boolean makeCoffee, boolean useFridge, boolean doDishes){
        if(makeCoffee){
            addWater();
        }
        if(useFridge){
            pourMilk();
        }
        if(doDishes){
            loadDishWasher();
        }
    }
    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishWasher();
    }
}
