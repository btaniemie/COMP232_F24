package functional;

public class annonymous {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello from run");
            }
        };

        r.run();
        System.out.println("Hello from main");
    }
}
