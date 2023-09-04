package ru.otus.homework13;

import ru.otus.homework13.transport.AllTerrainVehicle;
import ru.otus.homework13.transport.Bike;
import ru.otus.homework13.transport.Car;
import ru.otus.homework13.transport.Horse;
import ru.otus.homework13.transport.interfaces.Transport;

public class MainApp {
    public static void main(String[] args) {
        Human oleg = new Human("Олег");
        oleg.move(1000, TypeOfTerrain.forest);
        Transport car = new Car("Ламборгуни", 10000);
        oleg.useTransport(car);
        oleg.move(11000, TypeOfTerrain.plain);
        oleg.move(1000, TypeOfTerrain.forest);
        oleg.move(1000, TypeOfTerrain.plain);
        Human olga = new Human("Ольга");
        olga.useTransport(car);
        oleg.freeTransport();
        Transport atv = new AllTerrainVehicle("atv", 10000);
        oleg.useTransport(atv);
        oleg.move(1000, TypeOfTerrain.swamp);
        oleg.freeTransport();
        Transport bike = new Bike("bmx");
        oleg.useTransport(bike);
        oleg.move(1000000, TypeOfTerrain.forest);
        oleg.freeTransport();
        oleg.freeTransport();
        Transport horse = new Horse("Horse", 20000);
        oleg.useTransport(horse);
        oleg.move(1000, TypeOfTerrain.swamp);
        oleg.move(1000, TypeOfTerrain.plain);
    }
}
