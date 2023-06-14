public class SwapNoThirdVar {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // append a and b
        a = a + b;// helloworld
        // store initial value of a in b
        b = a.substring(0, a.length() - b.length());// hello
        // store initial value of b in a
        a = a.substring(b.length());// world

        System.out.println("After  swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
