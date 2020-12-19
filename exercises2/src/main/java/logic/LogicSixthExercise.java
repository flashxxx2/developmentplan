package logic;

import java.util.Scanner;

public class LogicSixthExercise {

    public static void getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int sum;
        try {
            int first = scanner.nextInt();
            System.out.println("Введите второе число");
            int second = scanner.nextInt();
            sum = first + second;
        } catch (Exception e) {
            throw new RuntimeException("Вы ввели не число");
        }
        System.out.println("Сумма цифр равна = " + sum);
    }
}
