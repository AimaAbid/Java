import java.awt.*;
import javax.swing.*;
public class GridDesign{

    GridDesign(){
        
        JFrame f = new JFrame("grid design");
        JTextField tf = new JTextField();
        tf.setBounds(10,50,4000,100);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bA = new JButton("+");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bM = new JButton("-");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
         JButton bMU = new JButton("*");
        JButton bE = new JButton("=");
        JButton bD = new JButton("/");
        f.add(tf);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bA);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bM);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bMU);
        f.add(bE);
        f.add(bD);
        f.setLayout(new GridLayout(4, 4, 3, 3));
        f.setSize(300,300);
        f.setVisible(true);
       
         
    }
        public static void main(String[] args) {
            
            new GridDesign();
        }

    
}