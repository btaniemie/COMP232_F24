package functional;

public class lambda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello from run");
        r.run();
        System.out.println("Hello from main");
    }
}
