package functional;

import java.util.function.Function;

public class PureVsImperative {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(cube(a));
        
        Function<Integer, Integer> my_cube = (x) -> { return x * x * x; };
    
        System.out.println(my_cube.apply(5));
    }


    private static int cube(int x) {
        return x * x * x;
    }
}
