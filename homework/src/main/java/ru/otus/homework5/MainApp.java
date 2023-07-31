package ru.otus.homework5;

//Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
// -Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
//      значение которых больше 5, и печатающий полученную сумму в консоль.
// -Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//      метод должен заполниться каждую ячейку массива указанным числом.
// -Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//      увеличивающий каждый элемент которого на указанное число.
// -Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
//      и печатающий в консоль сумма элементов какой из половин массива больше.
public class MainApp {
    public static void main(String[] args) {
        System.out.println("1.");
        printStringIntTimes("Hello", 3);
        System.out.println("2.");
        int[] arr = createRandomIntArray(10);
        printArray(arr);
        arrSumOfElem5Plus(arr);
        System.out.println("3.");
        fillArrayWithOneInt(5, arr);
        printArray(arr);
        System.out.println("Перезаполним массив ради приличия");
        arr = createRandomIntArray(9);
        printArray(arr);
        System.out.println("4.");
        increaseOnInt(4, arr);
        printArray(arr);
        System.out.println("5.");
        sumOfHalvesComparing(arr);
    }

    public static void printStringIntTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static int[] createRandomIntArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int j : arr) {
            System.out.print("[" + j + "]");
        }
        System.out.println(" ]");
    }

    public static void arrSumOfElem5Plus(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j > 5) sum += j;
        }
        System.out.println("Сумма элементов массива, больших 5 равна: " + sum);
    }

    public static void fillArrayWithOneInt(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
    }

    public static void increaseOnInt(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
        System.out.println("Элементы увеличены на " + number);
    }

    public static void sumOfHalvesComparing(int[] arr) {
        int comparator = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            comparator += arr[i] - arr[arr.length-1 - i];
        }
        if (comparator > 0) System.out.println("Сумма элементов первой половины больше суммы второй");
        else if (comparator < 0) System.out.println("Сумма элементов второй половины больше суммы первой");
        else System.out.println("Суммы элементов половин равны");
    }
}

