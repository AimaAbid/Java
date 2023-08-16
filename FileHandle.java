//In this code, I've surrounded the FileWriter object creation and usage with a try-catch block to handle the potential IOException. Additionally, I've added a close() call to properly close the FileWriter when you're done writing. It's important to close the resources you open to avoid memory leaks and ensure proper resource management.

//FileNotFoundException: Like with the previous code, the FileWriter constructor can throw a FileNotFoundException if the specified file does not exist. To handle this, you should use a try-catch block or declare that the method throws this exception.IOException: The FileWriter constructor can also throw an IOException if there are issues with opening or writing to the file. This is a broader exception that encompasses various I/O-related problems.
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
    public static void main(String[] args) {
        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("file created" + f.getName());

            } else {
                System.out.println("File not created");
            }
            FileWriter w = new FileWriter("file.txt");
            w.write("Store info in file");
            w.close();
            System.out.println("Written successfully");
            Scanner Sc = new Scanner(f);
            while (Sc.hasNextLine()) {
                String data = Sc.nextLine();
                System.out.println(data);
            }
            Sc.close();
            if(f.delete()){
                System.out.println("the deleted file is "+f.getName());
            }
            else{
                System.out.println("file not deleted");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
