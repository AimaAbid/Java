import java.util.*;
//The problem here is that the Set interface is an abstract interface in Java and cannot be directly instantiated with the new keyword. You should use a concrete class that implements the Set interface, such as HashSet, TreeSet, or others. Here's an example using HashSet:

public class Sets {
    public static void main (String[] args)  {
        
        Set<String> sets = new HashSet<>();
        sets.add("Guava");
         sets.add("Dragon fruit");
          sets.add("Litchi"); 
         sets.add("Blue Berry");
         System.out.println(sets);
        
    }
}

    

    

