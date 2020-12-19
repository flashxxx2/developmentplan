package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdExercises {

    public static void getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное четное число");
        try {
            int input = scanner.nextInt();
            int number;
            if (input > 0 && input % 2 == 0) {
                int[] array = new int[input];
                for (int i = 0; i < input; i++) {
                    number = -5 + (int) (Math.random() * 11);
                    array[i] = number;
                }
                System.out.println(Arrays.toString(array));

            } else
                throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException("Вы ввели не целое положительное четное число");
        }
    }
}
