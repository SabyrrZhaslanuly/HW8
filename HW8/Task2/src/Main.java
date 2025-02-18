import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] peopleWeight = new int[10];
        for (int i = 0; i < peopleWeight.length; i++) {
            peopleWeight[i] = new Random().nextInt(40, 100);
        }

        // average weight
        int summary = 0;
        for (int j : peopleWeight) {
            summary += j;
        }
        int averageWeight = summary / peopleWeight.length;
        System.out.println("Средний вес всех людей равен: " + averageWeight + " кг.");

        // range from 60 to 80
        int counter = 0;
        for (int j : peopleWeight) {
            if (60 <= j && j <= 80) {
                counter += 1;
            }
        }
        System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг: " + counter);
    }
}
