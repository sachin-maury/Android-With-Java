

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class problem {
     public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
    
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JPanel centerPanel = new JPanel();
        centerPanel.add(new JLabel("Center"));
    
        frame.getContentPane().setLayout(new BorderLayout());
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
    
        frame.setSize(400, 300);
        frame.setVisible(true);
      }
    
}
