package ru.otus.homework13.transport;

import ru.otus.homework13.TypeOfTerrain;
import ru.otus.homework13.transport.interfaces.FuelUsingTransport;
import ru.otus.homework13.transport.interfaces.Transport;

public class Car implements Transport, FuelUsingTransport {
    private String name;
    private int tank;
    private int fuel;
    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        return false;
    }

    @Override
    public void wasteFuel(int distance) {
        
    }

    @Override
    public void refuel() {

    }

    @Override
    public void info() {

    }
}
