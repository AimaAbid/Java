import java.awt.*;

public class login {
   login(){
Frame f = new Frame("Login Page");
    Label L1 = new Label("UserName");
     Label L2 = new Label("Password");
     Button b1 = new Button("Done");
      Button b2 = new Button("Cancel");

      TextField t=new TextField();
      TextField p=new TextField();
      L1.setBounds(60,60,60,20);
      L2.setBounds(60,100,60,20);

      t.setBounds(180,60,60,20);
      p.setBounds(180,100,60,20);
      b1.setBounds(120,180,60,20);
      b2.setBounds(180,180,60,20);
      
      f.add(L1);
       f.add(L2);
        f.add(t);
         f.add(p);
          f.add(b1);
           f.add(b2);
           f.setSize(400,300);
           f.setLayout(null);
           f.setVisible(true);

    }
    public static void main(String[] args){
      new login();
     
    }

    


    
}
