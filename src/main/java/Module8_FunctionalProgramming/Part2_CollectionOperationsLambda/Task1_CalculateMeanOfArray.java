package Module8_FunctionalProgramming.Part2_CollectionOperationsLambda;

import java.util.Arrays;
import java.util.List;

public class Task1_CalculateMeanOfArray {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // calculate sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        // calculate amount of numbers
        long count = numbers.stream()
                .count();

        // calculate mean
        double mean = sum / count;

        System.out.println("Mean of array: " + mean);
    }
}