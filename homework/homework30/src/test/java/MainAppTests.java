import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.MainApp.afterOne;
import static org.example.MainApp.checkIsConsistsOnly1or2;


public class MainAppTests {
    @Test
    public void afterOneTest() {
        int[] arr1 = {1, 2, 1, 2, 2};
        int[] arr2 = {2, 2};
        Assertions.assertArrayEquals(arr2, afterOne(arr1));
    }
    @Test
    public void afterOneExceptionTest() {
        int[] arr = {2, 2, 2, 2, 2};
        Assertions.assertThrows(RuntimeException.class, ()->afterOne(arr));
    }
    @Test
    public void checkIsConsistsOnly1or2Test() {
        int[] arr1 = {1, 2, 1, 2, 2};
        int[] arr2 = {2, 2, 2, 2, 2};
        int[] arr3 = {1, 3, 1, 2, 2};
        int[] arr4 = {1, 2, 1, 0, 10};
        Assertions.assertTrue(checkIsConsistsOnly1or2(arr1));
        Assertions.assertFalse(checkIsConsistsOnly1or2(arr2));
        Assertions.assertFalse(checkIsConsistsOnly1or2(arr3));
        Assertions.assertFalse(checkIsConsistsOnly1or2(arr4));
    }
}
