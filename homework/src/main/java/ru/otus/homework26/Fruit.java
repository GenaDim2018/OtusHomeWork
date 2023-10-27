package ru.otus.homework26;

public abstract class Fruit {
    protected int weight;
    protected String type;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return type+" "+weight;
    }
}
