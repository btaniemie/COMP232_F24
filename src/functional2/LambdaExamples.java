package functional2;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class LambdaExamples {
    int x;

	public LambdaExamples(int myX) {
		x = myX;
	}
	
	public static boolean divisBy2(int i) {
		return i % 2 == 0;
	}

    public static void main(String[] args) {
        // IntStream.range(0, 10)
		// 		 .filter(LambdaExamples::divisBy2)
		// 		 .forEach(num-> System.out.println(num));

		// IntStream.range(0, 10)
        //          .filter((int i) -> { return i % 2 == 0;})
        //          .forEach(System.out::println);

		// IntStream.range(0, 10)
        //          .filter(i -> i % 2 == 0)
        //          .forEach(System.out::println);

		// System.out.println(IntStream.range(9, 20)
        //                             .filter(StreamExamples2::divisBy9)
        //                             .map(StreamExamples2::square)
        //                             .reduce(1, StreamExamples2::product));

		// System.out.println(IntStream.range(9, 20)
        //                             .filter((i) -> { return i % 9 == 0;})
        //                             .map((i) -> { return i * i; })
        //                             .reduce(1, (a, b) -> { return a * b; }));

		// System.out.println(IntStream.range(9, 20)
        //                             .filter((i) -> i % 9 == 0)
        //                             .map(i -> i * i)
        //                             .reduce(1,(a, b) -> a * b));

		// want to make an ArrayList of primes
		// IntStream.range(0, 20).filter(s -> {
		// 	for (int i = 2; i < s; ++i) {
		// 		if (s % i == 0) {
		// 			return false;
		// 		}
		// 	}
		// 	return true;
		// }).forEach(System.out::println);

		ArrayList<Integer> primes = new ArrayList<Integer>();
		IntStream.range(0, 100).filter(s -> {
			for (int i = 2; i < s; ++i) {
				if (s % i == 0) {
					return false;
				}
			}
			return true;
		}).forEach((e) -> primes.add(e));

		primes.stream().filter(s -> {return (s % 4) == 1;})
					   .forEach(System.out::println);
		System.out.println("starting parrallel");
		primes.parallelStream().filter((s) -> (s % 4) == 1)
							   .forEach(System.out::println);
	}
}
