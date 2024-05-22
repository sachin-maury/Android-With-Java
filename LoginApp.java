import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginApp {
 public static void main(String[] args) {
 JFrame frame = new JFrame("Login App");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300, 150);
 frame.setLayout(new GridLayout(3, 2));
 JLabel userLabel = new JLabel("Username:");
 JTextField usernameField = new JTextField();
 JLabel passLabel = new JLabel("Password:");
 JPasswordField passwordField = new JPasswordField();
 JButton loginButton = new JButton("Login");
 loginButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 String username = usernameField.getText();
 char[] password = passwordField.getPassword();
 // Check credentials (for demonstration, use hardcoded values)
 if (username.equals("admin") && new String(password).equals("secret")) {
 JOptionPane.showMessageDialog(frame, "Login successful!");
 } else {
 JOptionPane.showMessageDialog(frame, "Invalid credentials. Try again.");
 }
 }
 });
 frame.add(userLabel);
 frame.add(usernameField);
 frame.add(passLabel);
 frame.add(passwordField);
 frame.add(new JLabel()); // Empty label for spacing
 frame.add(loginButton);
 frame.setVisible(true);
 }
}
