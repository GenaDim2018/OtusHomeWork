import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson12HomeWork {
    public static void main(String[] args) {
        int[] arr1 = new int[50000];
        Integer[] arr2 = new Integer[50000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 1000);
            arr2[i] = arr1[i];
        }

        boolean isSorted = false;
        int buf;
        long startTimeBubbles = System.currentTimeMillis();
        while (!isSorted) {
            isSorted = true;
            for (int k = 0; k < arr1.length - 1; k++) {
                if (arr1[k] > arr1[k + 1]) {
                    isSorted = false;
                    buf = arr1[k];
                    arr1[k] = arr1[k + 1];
                    arr1[k + 1] = buf;
                }
            }
        }
        long endTimeBubbles = System.currentTimeMillis();
        //System.out.println(Arrays.toString(arr1));
        System.out.println("Примерное время сортировки пузырьком в миллисекундах: " + (endTimeBubbles - startTimeBubbles));
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr2);
        long startTimeCollectionsSort = System.currentTimeMillis();
        Collections.sort(list);
        long endTimeCollectionsSort = System.currentTimeMillis();
        //or (Integer j : list) {
        //System.out.print(j+" ");
        //}
        //System.out.println();
        System.out.println("Примерное время сортировки Collection.sort в миллисекундах: " + (endTimeCollectionsSort - startTimeCollectionsSort));
    }
}

