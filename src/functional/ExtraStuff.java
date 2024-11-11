package functional;

import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;

public class ExtraStuff {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        printBasicFor(numbers);
        System.out.println("-----");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.print("\n");

        // System.out.println("The primes from 2 to 1000 are:");
        // IntStream.rangeClosed(2, 1000)
        //         .filter(InClassExamples::isPrime)
        //         .forEach(System.out::println);
    }

    

    private static void printBasicFor(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.print("\n");
    }

    private static void printForEach(List<Integer> myList) {
        for (Integer n : myList) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}
