package ru.otus.homework13;

import ru.otus.homework13.transport.interfaces.Transport;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void useTransport(Transport transport) {
        if (transport.use()) {
            currentTransport = transport;
            System.out.println(name + " занял транспорт.");
            currentTransport.info();
        } else System.out.println("Транспорт уже занят");
    }

    public void freeTransport() {
        if (currentTransport == null) System.out.println(name + " и так был без транспорта");
        else {
            currentTransport.free();
            currentTransport = null;
            System.out.println(name + " теперь без транспорта");
        }
    }

    public void move(int distance, TypeOfTerrain terrain) {
        if (currentTransport == null) System.out.println(name + " прошел " + distance + " по " + terrain.toString());
        else if (currentTransport.move(distance, terrain)) {
            System.out.println(name + " проехал " + distance + " по " + terrain.toString());
            currentTransport.info();
        }
    }
}
