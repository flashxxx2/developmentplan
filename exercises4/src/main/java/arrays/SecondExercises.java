package arrays;

import java.util.Arrays;

public class SecondExercises {

    public static void getArray() {
        int[] array = new int[100];
        for (int a = 0; a < array.length; a++) {
            array[a] = a + 1;
        }
        String newArray = null;
        for (int i = 0; i < array.length; i++) {
            newArray = Arrays.toString(Arrays.stream(array).filter(element -> element % 2 != 0).toArray());
        }
        System.out.println(newArray);
    }
}
