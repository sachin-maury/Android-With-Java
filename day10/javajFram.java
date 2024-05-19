
import javax.swing.*;
public class javajFram {
   


  public static void main(String[] args) {
  
    JFrame frame = new JFrame("My Swing Application");

    JButton button = new JButton("Click Me");

   
    JLabel label = new JLabel("Click the button!");

    
    frame.add(button);
    frame.add(label);

   

    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}

    

