package greeter;

public class Greeter {
    public static void main(String[] args) {
        final String output = GreetingFormatter.greeting("John Smith");
        System.out.println(output);
    }
}