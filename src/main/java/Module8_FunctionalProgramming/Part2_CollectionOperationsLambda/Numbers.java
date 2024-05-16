package Module8_FunctionalProgramming.Part2_CollectionOperationsLambda;

import java.util.Arrays;
import java.util.List;

public class Numbers {

    // list of integers
    static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // lambda expression to filter even numbers
    public static void filterEvenNumbers() {
        System.out.println("Even numbers:");
        integers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    // lambda expression to double odd numbers
    public static void doubleOddNumbers() {
        System.out.println("\nOdd numbers doubled:");
        integers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }

    // lambda expression to calculate sum of all numbers
    public static void calculateSum() {
        int sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\nSum of all numbers: " + sum);
    }


    // main method
    public static void main(String[] args) {
        filterEvenNumbers();
        doubleOddNumbers();
        calculateSum();
    }
}
