package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);

        // classic way to print out list contents
        // for(int i = 0; i < myList.size(); i++) {
        //     System.out.println(myList.get(i));
        // }

        // More modern way to print out list contents
        // for(Integer myInt: myList) {
        //     System.out.println(myInt);
        // }

        // using pure function
        // myList.stream().forEach(s -> {System.out.println(s);});

        // more pure
        // myList.stream().forEach(System.out::println);

        // now lets play around with the values
        // myList.stream()
        //       .map(s -> s+2) 
        //       .forEach(System.out::println);

        // myList.stream()
        //       .filter(s -> s < 5)
        //       .forEach(System.out::println);
        
        List<Integer> newList = (List<Integer>) myList.stream()
                                                      .filter(s -> s < 5)
                                                      .collect(Collectors.toList());
        
        // newList.stream()
        //        .forEach(System.out::println);
        
        // System.out.println(newList.stream().reduce(0, (x, y) -> x + y));
        // System.out.println(newList.stream().reduce(1, (x, y) -> x * y));
    }
}
