package ru.otus.homework13.transport.interfaces;

import ru.otus.homework13.TypeOfTerrain;

public interface Transport {
    public boolean move(int distance, TypeOfTerrain terrain);

    public void info();

    public boolean checkTerrain(TypeOfTerrain terrain);

    public boolean use();

    public boolean free();
}
