import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер метода");
        int answer = scanner.nextInt();
        switch (answer) {
            case 1 -> greetings();
            case 2 -> checkSign(1, 2, -5);
            case 3 -> selectColor();
            case 4 -> compareNumbers();
            case 5 -> addOrSubtractAndPrint(10, 6, false);
            default -> System.out.println("Введено неверное значение");
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int val1, int val2, int val3) {
        int sum = val1 + val2 + val3;
        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 31);
        //System.out.println(data);
        if (data <= 10)
            System.out.println("Красный");
        else if (data > 20)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 31);
        int b = (int) (Math.random() * 31);
        //System.out.println("a=" + a + "\n" + "b=" + b);
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment)
            initValue += delta;
        else
            initValue -= delta;
        System.out.println(initValue);
    }

}