import java.awt.*;
import javax.swing.*;
public class Design{
        Design(){

        
        JFrame Obj= new JFrame("swing");
        JButton a =new JButton ("click");
        Obj.setBackground(Color.BLUE);
        a.setBounds(50,150,150,50);
        JTextField tf = new JTextField("LOGIN");
        tf.setBounds(50,50,150,20);
        Obj.add(a);
        Obj.add(tf);
        Obj.setSize(300,300);
        Obj.setVisible(true);
        Obj.setLayout(null);
        
        }
    
    public static void main(String[] args)
    {
      new Design();
    

    }
}
// import java.awt.*;
// public class Design extends Frame{
//     Design(){   
//         this.setLayout(new FlowLayout());
//         TextField one = new TextField(30);
//         Button two = new Button("click here");
//         this.add (one);
//         this.add (two);
//         one.setBounds(90,60,30)
//     }
// }