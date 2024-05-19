

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class flowLayoutExample {
     public static void main(String[] args) {
    JFrame frame = new JFrame("FlowLayout Example");

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JLabel label = new JLabel("This is a label");

    frame.getContentPane().setLayout(new flowLayout());
    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.add(label);
     
    frame.setSize(400, 100);
    frame.setVisible(true);
  }
}
