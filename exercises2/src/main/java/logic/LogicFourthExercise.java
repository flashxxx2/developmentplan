package logic;

public class LogicFourthExercise {
    public static void rnd() {
        int number = 100 + (int) (Math.random() * (900));
        System.out.println("Случайно сгенерированное число " + number);
        final int base = 10;
        int max = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = (number % (base));
            number = number / base;
            if (max < lastDigit) {
                max = lastDigit;
            }
        }
        System.out.println("Наибольшая цифра из рандомного трехзначного числа это " + max);
    }
}
