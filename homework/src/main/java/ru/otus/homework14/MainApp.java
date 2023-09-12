package ru.otus.homework14;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr1 =
                {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};
        String[][] arr2 = new String[4][5];
        String[][] arr3 = new String[3][4];
        String[][] arr4 =
                {{"1", "2", "3", "4"},
                        {"5", "6", "QWE", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};
        String[][] arr5 =
                {{"", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};
        while (true) {
            System.out.println("Введите номер проверяемого массива:");
            try {
                switch (sc.nextInt()) {
                    case 1 -> System.out.println(sumOfStringArrToIntCalculator4x4(arr1));
                    case 2 -> System.out.println(sumOfStringArrToIntCalculator4x4(arr2));
                    case 3 -> System.out.println(sumOfStringArrToIntCalculator4x4(arr3));
                    case 4 -> System.out.println(sumOfStringArrToIntCalculator4x4(arr4));
                    case 5 -> System.out.println(sumOfStringArrToIntCalculator4x4(arr5));
                }
            }
            catch (AppArrayDataException | AppArraySizeException e){
                System.out.println(e.getMessage());
            }
        }

    }

    public static int sumOfStringArrToIntCalculator4x4(String[][] arr) throws AppArrayDataException, AppArraySizeException{
        int sum = 0;
        if (!checkStringArrayLength4x4(arr)) throw new AppArraySizeException("Неверный размер массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Некорректное значение в ячейке: [" + i + "]" + "[" + j + "]");
                }
//                finally {
//                    return -1;
//                }
            }
        }
        return sum;
    }

    public static boolean checkStringArrayLength4x4(String[][] arr) {
        if (!(arr.length == 4)) return false;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].length == 4)) return false;
        }
        return true;
    }
}
