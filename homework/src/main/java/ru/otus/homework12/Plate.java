package ru.otus.homework12;

public class Plate {
    private final int capacity;
    private int currentAmountOfFood;


    public Plate(int capacity) {
        this.capacity = capacity;
        currentAmountOfFood = capacity;
    }

    public boolean eat(Cat cat) {
        if (currentAmountOfFood < cat.getAppetite()) {
            return false;
        } else {
            currentAmountOfFood -= cat.getAppetite();
            cat.eat();
            return true;
        }
    }

    public void reFill() {
        currentAmountOfFood = capacity;
    }

    public void info() {
        System.out.println("Сейчас в тарелке " + currentAmountOfFood + " еды.");
    }
}
