package ru.otus.homework13.transport;

import ru.otus.homework13.TypeOfTerrain;
import ru.otus.homework13.transport.interfaces.Transport;

public class Horse implements Transport {
    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        return false;
    }

    @Override
    public void info() {

    }
}
