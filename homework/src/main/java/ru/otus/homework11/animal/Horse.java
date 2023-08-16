package ru.otus.homework11.animal;

public class Horse extends Animal {
    public Horse(String name, int speed, int stamina) {
        super(name, speed, stamina);
        swimEnergyConsumption = 4;
        typeOfAnimal = "Лошадь";
    }
}
