package org.example;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 2, 2};
        int[] arr2 = {2, 2, 2, 2, 2};
        int[] arr3 = {1, 3, 1, 2, 2};
        int[] arr4 = {1, 2, 1, 0, 10};
        System.out.println("arr1: " + checkIsConsistsOnly1or2(arr1));
        System.out.println("arr2: " + checkIsConsistsOnly1or2(arr2));
        System.out.println("arr3: " + checkIsConsistsOnly1or2(arr3));
        System.out.println("arr4: " + checkIsConsistsOnly1or2(arr4));
        System.out.println("arr1: " + Arrays.toString(afterOne(arr1)));
        System.out.println("arr3: " + Arrays.toString(afterOne(arr3)));
        System.out.println("arr4: " + Arrays.toString(afterOne(arr4)));
        System.out.println("arr2: " + Arrays.toString(afterOne(arr2)));
    }

    public static int[] afterOne(int[] arr) {
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) lastIndex = i;
        }
        if (lastIndex == 0) throw (new RuntimeException());
        return Arrays.copyOfRange(arr, lastIndex + 1, arr.length);
    }

    public static boolean checkIsConsistsOnly1or2(int[] arr) {
        boolean flagOne = false;
        boolean flagTwo = false;
        for (int i : arr) {
            if (i == 1) flagOne = true;
            else if (i == 2) flagTwo = true;
            else return false;
        }
        return flagOne && flagTwo;
    }
}
