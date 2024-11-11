package functional;

import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class InClassExamples {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                 .filter(
                    x -> {
                        System.out.printf("%nfilter: %d%n", x);
                        return x % 2 == 0;
                    })
                 .map(
                    x -> {
                        System.out.println("map: " + x);
                        return x * 3;
                 })
                 .sum();
        int sum = 0;
        for (int i = 2; i <= 20; i+=2) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println(IntStream.rangeClosed(1, 10)
                                    .map((x) -> {return x * 2;})
                                    .sum());
        IntStream.rangeClosed(1, 10)
                 .forEach(System.out::println);

        // System.out.println("The primes from 2 to 1000 are:");
        // IntStream.rangeClosed(2, 1000)
        //         .filter(InClassExamples::isPrime)
        //         .forEach(System.out::println);

        // List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        // printBasicFor(numbers);
        // System.out.println("-----");
        // numbers.forEach(number -> System.out.print(number + " "));
        // numbers.forEach(System.out::println);
        // System.out.print("\n");
    }

    private static boolean isPrime(int n) {
        return IntStream.range(2, (int) Math.sqrt(n) + 1)
                        .noneMatch(i -> n % i == 0);
    }

    private static void printBasicFor(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.print("\n");
    }
}
