import java.io.*;

 class MakeSerial implements Serializable {
    public int x;
    public String Name;
    public MakeSerial(int x,String Name) {
        this.x=x;
        this.Name=Name;

    
}
}

public class Deserial {
    public static void main(String[] args) {
        String filename = "try.txt"; // Change the filename if you'd like

        MakeSerial s1 = null;

        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            s1 = (MakeSerial) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            System.out.println("Object Deserialized");
            System.out.println("x: " + s1.x);
            System.out.println("str: " + s1.Name);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        System.out.println("Deserialization completed");
    }
}


