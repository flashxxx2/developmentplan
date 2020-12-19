package logic;

import java.util.Scanner;

public class LogicThirdExercise {
    public static void checkIncludeInterval(int first, int second) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int number = scanner.nextInt();
        int max;
        int min;
        if (first > second) {
            max = first;
            min = second;
        } else
            max = second;
        min = first;

        if (number >= min && number <= max) {
            System.out.println(String.format("Ваше число входит в интевал [%s,%s]", min, max));
        } else
            System.out.println(String.format("Ваше число не входит в интервал [%s,%s]", min, max));

    }
}
