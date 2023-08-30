// Check this program
// Implement different types of layout classes in Java
// 3. CardLayout class

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panelCont = new JPanel();
        CardLayout cardLayout = new CardLayout();
        panelCont.setLayout(cardLayout);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panelCont.add(panel1, "red");

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panelCont.add(panel2, "blue");

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panelCont.add(panel3, "green");

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.YELLOW);
        panelCont.add(panel4, "yellow");

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.ORANGE);
        panelCont.add(panel5, "orange");

        frame.add(panelCont);

        JButton nextButton = new JButton("Next");
        JButton prevButton = new JButton("Previous");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners to the buttons
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(panelCont);
            }
        });

        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(panelCont);
            }
        });

        frame.setVisible(true);
    }
}
