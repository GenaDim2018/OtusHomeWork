package ru.otus.homework13.transport;

import ru.otus.homework13.TypeOfTerrain;
import ru.otus.homework13.transport.interfaces.FuelUsingTransport;
import ru.otus.homework13.transport.interfaces.Transport;

public class AllTerrainVehicle implements Transport, FuelUsingTransport {

    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        return false;
    }

    @Override
    public void info() {

    }

    @Override
    public void wasteFuel(int distance) {

    }

    @Override
    public void refuel() {

    }
}
