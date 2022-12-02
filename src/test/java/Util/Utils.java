package Util;

public class Utils {
    public static void showSumBetween5and45(int[] mas) {
        int sum = 0;
        for (int t : mas) {
            if (t > 5 && t < 45) {
                sum += t;
            }
        }
        System.out.println("Sum2 of numbers >5 and <45 = " + sum);
    }

    public static void showEvenNumbers(int[] mas) {
        int sum = 0;
        for (int t : mas) {
            if (t % 2 == 0) {
                sum += t;
            }
        }
        System.out.println("Sum of even numbers = " + sum);
    }

    public static int[] getRandomMassive() {
        System.out.println("Massif:");
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
            System.out.println(mas[i]);
        }
        return mas;
    }
}
