package analysis;

public class FirstExample {
    public static int maxElement(int[] arr) {
        /*
         * First we have two instructions
         *    1. looking up the value at arr[0], and we assume arr.length >= 1
         *    2. assiging this valus to max
         * Regardless of the size of arr, these instructions will always happen
         */
        int max = arr[0];
         /*
         * similar, regardless of the size of arr.length, the for loop will 
         *      always run. This gives us two more instructions:
         *      1. int i = 0
         *      2. i < n
         *      These instructions run *before* the first iteration.
         *      **After** each iteration, we will run two more instrctuions
         *      1. ++1
         *      2. i < n
         * 
         * Before even looking at the body of the for loop, our algorithm runs 
         * 4 + 2n instructions. Therefore our initial formula is 
         *<math>
         *       f(n) = 2n + 4
         * </math>
         * 
         * In the worst case scenario, we would run four additonal instructions
         * within the body of the for loop
         *      1. arr[i]
         *      2. arr[1] >= max
         *      3. arr[i]
         *      4. max = arr[i]
         * 
         * This makes our function
         * <math>
         *      f(n) = 2n + 4 + 4n
         *           = 6n + 4
         * </math>
         */
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] temp = {4, 3, 2, 1, 5};
        int result = maxElement(temp);
        System.out.println(result);
    }
}
