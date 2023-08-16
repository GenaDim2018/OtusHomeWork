package ru.otus.homework11.animal;

//Создайте классы Cat, Dog и Horse с наследованием от класса Animal
//        У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
//        Затраты выносливости:
//        Все животные на 1 метр бега тратят 1 ед выносливости,
//        Собаки на 1 метр плавания - 2 ед.
//        Лошади на 1 метр плавания тратят 4 единицы
//        Кот плавать не умеет.
//        Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
//        указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1
//        и указываем что у животного появилось состояние усталости. При выполнении действий пишем сообщения в консоль.
//        Добавляем метод info(), который выводит в консоль состояние животного.
public abstract class Animal {
    protected String name;
    protected int speed;
    protected int stamina;
    protected String typeOfAnimal;

    protected int runEnergyConsumption = 1;

    protected int swimEnergyConsumption;

    public Animal(String name, int speed, int stamina) {
        this.name = name;
        this.speed = speed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        if (distance * runEnergyConsumption > stamina) {
            tired();
            return -1;
        }
        stamina -= distance * runEnergyConsumption;
        System.out.println(typeOfAnimal + " " + name + " пробежала " + distance + " метров.");
        return (int) distance / speed;
    }

    public int swim(int distance) {
        if (distance * swimEnergyConsumption > stamina) {
            tired();
            return -1;
        }
        stamina -= distance * swimEnergyConsumption;
        System.out.println(typeOfAnimal + " " + name + " проплыла " + distance + " метров.");
        return (int) distance / speed;
    }

    public void info() {
        System.out.println(typeOfAnimal + " " + name);
        System.out.println("Скорость " + speed);
        System.out.println("Остаток сил " + stamina);
    }

    protected void tired() {
        System.out.println(typeOfAnimal + " " + name + " устала, остаток сил " + stamina);
    }
}
