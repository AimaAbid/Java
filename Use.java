import java.awt.*;
import java.awt.event.*;

public class Use extends Frame implements ActionListener
{
    TextField tf;
    Choice c;
    Button b;
    TextArea ta;
    List l;

    Use()
    {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        add(tf);

        c = new Choice();
        c.setBounds(50, 100, 75, 75);
        c.add("English");
        c.add("Maths");
        c.add("Urdu");
        c.add("Science");
        c.add("SST");
        add(c);

        b = new Button("Add");
        b.setBounds(50, 150, 50, 30);
        b.addActionListener(this); // to add action listener to the button
        add(b);

        ta = new TextArea();
        ta.setBounds(50, 200, 400, 200);
        add(ta);

        l = new List(5);
        l.setBounds(50, 500, 75, 75);
        l.add("Japanese");
        l.add("Mandarin");
        l.add("Korean");
        l.add("Arabic");
        l.add("German");
        add(l);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        String text = tf.getText(); // to get the text from the text field
        ta.setText(text); // to set the text in the text area
        l.add(text);
    }

    public static void main(String[] args)
    {
        new Use();
    }
}