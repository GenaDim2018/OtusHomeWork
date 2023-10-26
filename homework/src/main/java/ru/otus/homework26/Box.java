package ru.otus.homework26;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final String name;
    private int weight;
    private List<T> content = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void putFruit(T fruit) {
        content.add(fruit);
        weight += fruit.getWeight();
    }

    public boolean compare(Box<?> box){
        return box.weight == this.weight;
    }

    public void moveFruitsToBox(Box<? super T> box){
        for(T fruit:content) box.putFruit(fruit);
        content.clear();
        weight = 0;
    }
    public void printContent() {
        System.out.println(name);
        for (Fruit fruit:content){
            System.out.print("["+fruit.toString()+"]");
        }
        System.out.println();
    }
}
