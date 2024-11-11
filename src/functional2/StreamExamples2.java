package functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples2 {
    public static int product(int a, int b) {
		return a * b;
	}

	public static boolean divisBy9(int i) {

		return i % 9 == 0;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static void printPlus2(Integer i) {
		System.out.println(i + 2);
	}

	public static int square(Integer i) {
		// System.out.println("squaring " + i);
		return i * i;
	}

	public static boolean isEven(int i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDivisBy3(int i) {
		return i % 3 == 0;
	}

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(6, 12, 1, 4, 5, 7, 0, 2));
        Stream<Integer> theStream = a.stream();
        // theStream.forEach(System.out::println);
        // theStream.forEach(StreamExamples2::printPlus2);
        // theStream.map(StreamExamples2::square)
        //          .map(StreamExamples2::square)
        //          .forEach(System.out::println);

		// theStream.forEach(StreamExamples2::square);
		// IntStream.range(0,10)
                //  .forEach(System.out::println);

		// theStream.filter(StreamExamples2::isEven)
                //  .forEach(System.out::println);

		// IntStream.range(0, 100)
        //          .filter(StreamExamples2::isEven)
        //          .filter(StreamExamples2::isDivisBy3)
        //          .forEach(System.out::println);

		// IntStream.range(0, 100)
        //          .map(StreamExamples2::square)
        //          .filter(StreamExamples2::isDivisBy3)
        //          .forEach(System.out::println);

		// IntStream.range(0, 100)
        //          .filter(StreamExamples2::isDivisBy3)
        //          .map(StreamExamples2::square)
        //          .forEach(System.out::println);

		// List<Integer> divisibleBy3 = (List<Integer>) theStream.filter(StreamExamples2::isDivisBy3)
        //                                                       .filter(StreamExamples2::isEven)
		// 		                                              .collect(Collectors.toList());

		// int result = IntStream.range(0, 100)
        //                       .filter(StreamExamples2::isDivisBy3)
        //                       .map(StreamExamples2::square)
        //                       .reduce(0, StreamExamples2::add);

		// result = IntStream.range(1, 100)
        //                   .filter(StreamExamples2::divisBy9)
        //                   .map(StreamExamples2::square)
        //                   .reduce(1, StreamExamples2::product);

		// System.out.println("product of stuff " + result);
		// IntStream.range(1, 100)
        //          .filter(s -> s % 10 == 0)
        //          .forEach(System.out::println);
    }
}
