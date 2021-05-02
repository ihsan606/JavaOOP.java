package Modifier.data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("mengakses aplication");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
