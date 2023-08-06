package ru.otus.homework7;

//  1.Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
//        метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
//  2.Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
//  3.Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его
//        диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
//  4.Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
//  5.Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки
//        не существует, то в качестве результата необходимо вернуть -1
public class MainApp {
    public static void main(String[] args) {
        int[][] arr = createSquareRandomIntArrayWithNegatives(2);
        printArray2D(arr);
        System.out.println("1.");
        System.out.println("Сумма элементов, больших 0 равна: " + sumOfPositiveElements(arr));
        System.out.println("2.");
        drawSquare(10);
        System.out.println("3.");
        arr = createSquareRandomIntArray(10);
        printArray2D(arr);
        System.out.println();
        setToZeroDiagonalElements(arr);
        printArray2D(arr);
        System.out.println("4.");
        System.out.println("Максимальный элемент массива: " + findMax(arr));
        System.out.println("5.");
        System.out.println("Сумма элементов второй строки равна : "+sumOfSecondLine(arr));
        System.out.println("Для массива, в котором второй строки нет: "+sumOfSecondLine(createSquareRandomIntArray(1)));
    }

    public static int[][] createSquareRandomIntArray(int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }

    public static int[][] createSquareRandomIntArrayWithNegatives(int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 20) - 10;
            }
        }
        return arr;
    }

    public static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1) || j == 0 || j == (size - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void setToZeroDiagonalElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == (arr.length - (j + 1))) arr[i][j] = 0;
            }
        }
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }

    public static int sumOfSecondLine(int[][] arr) {
        if (arr.length < 2) return -1;
        else {
            int sum = 0;
            for (int i = 0; i < arr[1].length; i++) {
                sum+=arr[1][i];
            }
            return sum;
        }
    }
}

