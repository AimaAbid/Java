
interface inter {
    public void getDetails();
}

public class lambdaExp {
    public static void main(String[] args) {
        inter in = () -> {
            System.out.println("This is a lambda expression");

        };
        in.getDetails();

    }

}
