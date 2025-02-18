import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int j : numbers) {
            System.out.print(j + " ");
        }

        System.out.println();

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        int[] reversedArray = new int[numbers.length];
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArray[j] = numbers[i];
            j++;
        }

        for (int k : reversedArray) {
            System.out.print(k + " ");
        }
    }
}
