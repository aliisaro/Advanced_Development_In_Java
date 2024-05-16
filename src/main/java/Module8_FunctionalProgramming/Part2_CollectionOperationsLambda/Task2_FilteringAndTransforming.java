package Module8_FunctionalProgramming.Part2_CollectionOperationsLambda;

import java.util.Arrays;
import java.util.List;

public class Task2_FilteringAndTransforming {
    // list of integers
    static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void filterEvenNumbers() {
        System.out.println("Even numbers:");
        integers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void doubleOddNumbers() {
        System.out.println("\nOdd numbers doubled:");
        integers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }

    public static void calculateSumOfRemainingNumbers() {
        System.out.println("\nSum of resulting numbers: ");
        int sum = integers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        filterEvenNumbers();
        doubleOddNumbers();
        calculateSumOfRemainingNumbers();
    }
}
