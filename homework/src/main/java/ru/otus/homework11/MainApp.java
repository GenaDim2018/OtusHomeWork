package ru.otus.homework11;

import ru.otus.homework11.animal.Cat;
import ru.otus.homework11.animal.Dog;
import ru.otus.homework11.animal.Horse;

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
public class MainApp {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик", 5, 100);
        Horse loshadb = new Horse("Лошад", 10, 500);
        Cat mihalpalbl4 = new Cat("МихалПалыч", 2, 4); //ленивый котейка https://dropmefiles.com/OSshN
        bobik.info();
        System.out.println();
        int time = bobik.run(50);
        System.out.println("за " +time+ " секунд.");
        System.out.println();
        bobik.info();
        System.out.println();
        time = bobik.swim(10);
        System.out.println("за " +time+ " секунд.");
        System.out.println();
        bobik.info();
        System.out.println();
        bobik.swim(1000);
        System.out.println();
        loshadb.info();
        System.out.println();
        time = loshadb.swim(100);
        System.out.println("за " +time+ " секунд.");
        System.out.println();
        loshadb.info();
        System.out.println();
        mihalpalbl4.swim(100000);
    }
}
