package ru.otus.homework26;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> apples = new Box<>("Apples");
        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple(1);
            apples.putFruit(apple);
        }
        apples.printContent();
        System.out.println(apples.getWeight());
        Box<Orange> oranges = new Box<>("Apples");
        for (int i = 0; i < 10; i++) {
            Orange orange = new Orange(2);
            oranges.putFruit(orange);
        }
        oranges.printContent();
        System.out.println(oranges.getWeight());

        System.out.println(oranges.compare(apples));

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple(1);
            apples.putFruit(apple);
        }

        System.out.println(oranges.compare(apples));

        Box <Fruit> fruits = new Box<>("Fruits");
        oranges.moveFruitsToBox(fruits);
        apples.moveFruitsToBox(fruits);
        fruits.printContent();
    }
}
