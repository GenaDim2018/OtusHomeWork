package ru.otus.homework11.animal;

public class Cat extends Animal {
    public Cat(String name, int speed, int stamina) {
        super(name, speed, stamina);
        typeOfAnimal = "Кошка";
    }

    @Override
    public int swim(int distance) {
        System.out.println("Наши кошки не умеют плавать, не топите кошку");
        return -1000;
    }
}
