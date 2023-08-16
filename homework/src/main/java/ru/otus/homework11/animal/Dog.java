package ru.otus.homework11.animal;

public class Dog extends Animal {
    public Dog(String name, int speed, int stamina) {
        super(name, speed, stamina);
        swimEnergyConsumption = 2;
        typeOfAnimal = "Собака";
    }
}
