package logic;

public class LogicSecondExercise {


    public static void getNumberAroundTen(int first, int second) {
        int number = 10;
        int num1 = Math.abs(number - first);
        int num2 = Math.abs(number - second);
        if (num1 > num2) {
            System.out.printf("Число '%d' ближе к '%d', чем '%d'%n", second, number, first);
        }
        if (num1 == num2) {
            System.out.println("Числа являются равноудаленными от 10");
        }
        if (num1 < num2) {
            System.out.printf("Число '%d' ближе к '%d', чем '%d'%n", first, number, second);
        }
    }
}
