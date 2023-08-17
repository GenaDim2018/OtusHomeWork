package ru.otus.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {
        isFull = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void info() {
        if (isFull) System.out.println(name + " сейчас сыт.");
        else System.out.println(name + " голоден.");
    }
}
