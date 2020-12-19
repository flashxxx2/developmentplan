package loop;

public class LoopFirst {
    public static void printNumbers() {
        for (int i = 10000; i < 99997; ) {
            i = i + 3;
            System.out.println(i);
        }
    }
}
