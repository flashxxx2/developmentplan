package variables;

import java.util.Scanner;

public class VariablesSecondExercise {
    public static void getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое двузначное натуральное число");
        try {
            int input = scanner.nextInt();
            if (input < 100 && input > 10) {
                final int base = 10;
                int sumOfDigits = 0;
                int lastDigit;
                while (input != 0) {
                    lastDigit = (input % (base));
                    input = input / base;
                    sumOfDigits += lastDigit;
                }
                System.out.println("Сумма цифр равна = " + sumOfDigits);
            } else
                throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException("Вы ввели не двузначное натуральное число");
        }
    }
}
