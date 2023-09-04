package ru.otus.homework13.transport;

import ru.otus.homework13.TypeOfTerrain;
import ru.otus.homework13.transport.interfaces.Transport;

public class Horse implements Transport {
    private String name;
    private int stamina;

    public Horse(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    @Override
    public boolean checkTerrain(TypeOfTerrain terrain) {
        if (terrain == TypeOfTerrain.plain || terrain == TypeOfTerrain.forest) return true;
        return false;
    }

    private boolean inUse;

    @Override
    public boolean use() {
        if (!inUse) return inUse = true;
        return false;
    }

    @Override
    public boolean free() {
        if (inUse) return inUse = false;
        return false;
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        return checkTerrain(terrain) && wasteStamina(distance);
    }

    public boolean wasteStamina(int distance) {
        if (distance > stamina) {
            System.out.println("У лошади недостаточно сил");
            return false;
        }
        stamina -= distance;
        return true;
    }

    @Override
    public void info() {
        System.out.println("Лошадь " + name);
        System.out.println("Остаток сил " + stamina);
    }
}
