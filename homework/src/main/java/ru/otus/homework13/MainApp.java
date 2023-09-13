package ru.otus.homework13;

import ru.otus.homework13.transport.AllTerrainVehicle;
import ru.otus.homework13.transport.Bike;
import ru.otus.homework13.transport.Car;
import ru.otus.homework13.transport.Horse;
import ru.otus.homework13.transport.interfaces.Transport;

public class MainApp {
    public static void main(String[] args) {
        Human oleg = new Human("Олег");
        oleg.move(1000, TypeOfTerrain.FOREST);
        Transport car = new Car("Ламборгуни", 10000);
        oleg.useTransport(car);
        oleg.move(11000, TypeOfTerrain.PLAIN);
        oleg.move(1000, TypeOfTerrain.FOREST);
        oleg.move(1000, TypeOfTerrain.PLAIN);
        Human olga = new Human("Ольга");
        olga.useTransport(car);
        oleg.freeTransport();
        Transport atv = new AllTerrainVehicle("atv", 10000);
        oleg.useTransport(atv);
        oleg.move(1000, TypeOfTerrain.SWAMP);
        oleg.freeTransport();
        Transport bike = new Bike("bmx");
        oleg.useTransport(bike);
        oleg.move(1000000, TypeOfTerrain.FOREST);
        oleg.freeTransport();
        oleg.freeTransport();
        Transport horse = new Horse("Horse", 20000);
        oleg.useTransport(horse);
        oleg.move(1000, TypeOfTerrain.SWAMP);
        oleg.move(1000, TypeOfTerrain.PLAIN);
    }
}
