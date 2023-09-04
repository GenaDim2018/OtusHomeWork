package ru.otus.homework13.transport;

import ru.otus.homework13.TypeOfTerrain;
import ru.otus.homework13.transport.interfaces.FuelUsingTransport;
import ru.otus.homework13.transport.interfaces.Transport;

public class Car implements Transport, FuelUsingTransport {
    private String name;
    private int tank;
    private int fuel;
    private boolean inUse;

    @Override
    public boolean use() {
        if (!inUse) return inUse = true;
        return false;
    }

    @Override
    public boolean free() {
        if (inUse) {
            inUse = false;
            return true;
        }
        return false;
    }

    public Car(String name, int tank) {
        this.name = name;
        this.tank = tank;
        fuel = tank;
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        return checkTerrain(terrain) && wasteFuel(distance);
    }

    @Override
    public boolean wasteFuel(int distance) {
        if (distance > fuel) {
            System.out.println("Недостаточно топлива");
            return false;
        }
        fuel -= distance;
        return true;
    }

    @Override
    public void refuel() {
        fuel = tank;
    }

    @Override
    public void info() {
        System.out.println("Машина " + name);
        System.out.println("Остаток топлива " + fuel);
    }

    @Override
    public boolean checkTerrain(TypeOfTerrain terrain) {
        if (terrain == TypeOfTerrain.plain) return true;
        System.out.println("Машина не может передвигаться по этой местности.");
        return false;
    }
}
