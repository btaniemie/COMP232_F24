package analysis;

import java.util.stream.IntStream;

/**
 * First example used in introducing and practing analysis of algorithms. 
 * Used to illustrate basic operation counts and the idea that the constants
 * and slower growing terms do not matter as much as problems get larger.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Jan 31, 2024
 */
public class DoubleArrayEntries {
    public static void doubleArrayEntriesLong(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            int curr = arr[i];
            int doubleCurr = curr * 2;
            arr[i] = doubleCurr;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void doubleArrayEntriesShort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        doubleArrayEntriesLong(temp);
        temp = IntStream.range(1, 11).toArray();
        doubleArrayEntriesShort(temp);
    }
}
