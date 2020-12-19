package arrays;

import java.util.Arrays;

public class FirstExercises {

    public static void getArray() {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String newArray = null;
        for (int i = 0; i < array.length; i++) {
            newArray = Arrays.toString(Arrays.stream(array).filter(element -> element % 2 == 0).toArray());
        }
        System.out.println(newArray);
    }
}
