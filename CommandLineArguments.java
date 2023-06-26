public class CommandLineArguments {
    public static void main(String[] args) {
        int count = args.length;

        System.out.println("Number of arguments: " + count);
        System.out.println("Arguments:");

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
