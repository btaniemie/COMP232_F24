package functional;

import java.util.Arrays;
import java.util.List;

public class external {
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

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        System.out.println("Printing external iterator Basic For Loop");
        printBasicFor(numbers);

        System.out.println("Printing external iterator For Each Loop");
        printForEach(numbers);
    }
}
