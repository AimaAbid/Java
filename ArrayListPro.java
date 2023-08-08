import java.util.*;

public class ArrayListPro {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();

        a1.add(0, 70);

        a2.add(0, 50);
        a2.add(1, 60);
        a2.add(2, 70);
        a2.add(3, 80);

        System.out.println("a2's elements:");
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }
        a1.addAll(0, a2);
        System.out.println("a1's elements after copying a2 elements into a1:");
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a1.get(i));
        }

        a1.clear();
        // incomplete

    }
}