package AnonymousClass;

public class HelloApp {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void hello() {
                System.out.println("hallo");
            }

            @Override
            public void hello(String name) {
                System.out.println("hallo" + name);
            }
        };
        helloWorld.hello();
        helloWorld.hello("ihsan");
    }
}
