import java.io.Console;

public class Example {
    // static int a = 10;

    // static void display() {
    // System.out.println(a);
    // }

    // public static void main(String[] args) {
    // System.out.println("a = " + a);
    // display();

    // }

    public static void main(String[] args) {

        Console console = System.console();

        if (console != null) {
            String name = console.readLine("Enter your name: ");
            int age = Integer.parseInt(console.readLine("Enter your age: "));

            console.printf("Hello, %s! You are %d years old.\n", name, age);
        } else {
            System.out.println("Console is not available!");
        }
    }

}
