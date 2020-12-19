package logic;

import java.util.Scanner;

public class LogicFirstExercise {

    public static void getDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        try {
            int input = scanner.nextInt();
            if (input > 0) {
                int remainder = (input % 2);
                if (remainder == 0) {
                    System.out.println(String.format("Ваше число '%d' является четным", input));
                } else {
                    System.out.println(String.format("Ваше число '%d' является нечетным", input));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Вы ввели не число");
        }
    }

}
