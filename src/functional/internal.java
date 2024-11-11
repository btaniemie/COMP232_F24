package functional;

import java.util.Arrays;
import java.util.List;

public class internal {
    
    private static void printInternal(List<Integer> myList) {
        myList.forEach(number -> System.out.print(number + " "));
        System.out.print("\n");
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        System.out.println("Printing from internal iterator");
        printInternal(numbers);
    }
}
