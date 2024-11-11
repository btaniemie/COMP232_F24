package functional;

import java.util.Arrays;
import java.util.List;

public class imperativeDeclariative {
    public static void imperativeSum(List<Integer> myList) {
        int result = 0;
        for (Integer n : myList) {
            if (n % 2 == 0) {
                result += n * 2;
            }
        }
        System.out.println(result);
    }

    public static void declarativeSum(List<Integer> myList) {
        System.out.println(
            myList.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum()
        );
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        System.out.println("First, let's see the imperative implementation");
        imperativeSum(numbers);
        System.out.println("Next the declarative implementation");
        declarativeSum(numbers);
    }
}
