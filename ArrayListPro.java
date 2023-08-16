import java.util.*;

public class ArrayListPro {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();

        a1.add("Jake");
        a1.add("Mika");
        a1.add("Eren");
        a1.add("Neji");
        System.out.println("Names :");
        System.out.println(a1);

        a2.add(26);
        a2.add(10);
        a2.add(20);
        a2.add(1);
        System.out.println("Numbers : ");
        System.out.println(a2);

        a3 = (ArrayList<String>) a1.clone();
        System.out.println("Cloning names into another arraylist :");
        System.out.println(a3);

    }
}