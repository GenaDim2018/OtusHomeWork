package ru.otus.homework15;

import java.util.ArrayList;
import java.util.List;

public class CollectionTesting {
    public static List<Integer> fillArrListFromMinToMax(int min, int max) {
        List<Integer> arr = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arr.add(i);
        }
        return arr;
    }

    public static int sumOfElementsMoreThen5(List<Integer> arr) {
        int sum = 0;
        for (int ints : arr) {
            if (ints > 5) sum += ints;
        }
        return sum;
    }

    public static List<Integer> fillListWithNumber(List<Integer> arr, int numb) {
        arr.replaceAll(ignore -> numb);
        return arr;
    }

    public static List<Integer> incElementsOnNumber(List<Integer> arr, int numb) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + numb);
        }
        return arr;
    }
    public static void run (){
        System.out.println("1)");
        List<Integer> arr = fillArrListFromMinToMax(-5, 20);
        System.out.println(arr);
        System.out.println("2)");
        System.out.println(sumOfElementsMoreThen5(arr));
        System.out.println("3)");
        System.out.println(fillListWithNumber(arr, 0));
        System.out.println("4)");
        System.out.println(incElementsOnNumber(arr, 10));
    }
}
