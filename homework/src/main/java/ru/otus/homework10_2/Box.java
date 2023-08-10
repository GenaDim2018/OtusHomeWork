package ru.otus.homework10_2;

public class Box {
    private final int size;
    private String color;
    private boolean isOpened = false;
    private boolean isEmpty = true;
    private String item = null;

    public Box(String color, int size) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Коробка цвета: " + color + ", размера: " + size;
    }

    public void open() {
        if (!isOpened) {
            isOpened = true;
            System.out.println(this + " - открыта.");
        } else System.out.println(this + " уже была открыта.");
    }

    public void close() {
        if (isOpened) {
            isOpened = false;
            System.out.println(this + " - закрыта.");
        } else System.out.println(this + " - уже была закрыта.");
    }

    public void setColor(String color) {
        System.out.println(this + " - была перекрашена.");
        this.color = color;
        System.out.println("Новый цвет: " + color + ".");
    }

    public void addItem(String item) {
        if (isOpened && isEmpty) {
            System.out.println(this + " - в коробку положили предмет - " + item + ".");
            this.item = item;
            isEmpty = false;
        } else if (!isOpened) System.out.println(this + " - коробка закрыта, сначала ее нужно открыть.");
        else if (!isEmpty) System.out.println(this + " - в коробке уже есть предмет.");
    }

    public void removeItem() {
        if (isOpened && !isEmpty) {
            System.out.println(this + " - из коробки выкинули - " + item + ".");
            this.item = null;
            isEmpty = true;
        } else if (!isOpened) System.out.println(this + " - коробка закрыта, сначала ее нужно открыть.");
        else if (isEmpty) System.out.println(this + " - коробка уже пуста, нечего выкинуть.");
    }

    public void info() {
        System.out.println(this);
        if (isOpened) System.out.println("Коробка открыта.");
        else System.out.println("Коробка закрыта.");
        if (isEmpty) System.out.println("Коробка пуста.");
        else System.out.println("В коробке лежит "+item+".");
    }
}
