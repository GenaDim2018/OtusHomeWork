package ru.otus.homework13.transport;

import ru.otus.homework13.TypeOfTerrain;
import ru.otus.homework13.transport.interfaces.Transport;

public class Bike implements Transport {

    private String name;
    private boolean inUse;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public boolean checkTerrain(TypeOfTerrain terrain) {
        if (terrain == TypeOfTerrain.PLAIN || terrain == TypeOfTerrain.FOREST) return true;
        return false;
    }

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

    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        return checkTerrain(terrain);
    }

    @Override
    public void info() {
        System.out.println("Велосипед " + name);
    }
}
