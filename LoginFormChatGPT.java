import javax.swing.*;
import java.awt.*;

public class LoginFormChatGPT extends JFrame {
  private JLabel usernameLabel;
  private JLabel passwordLabel;
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton loginButton;

  public LoginFormChatGPT() {
    // Set the title of the frame
    super("Login Form");

    // Set the default close operation
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the layout of the frame
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Create the username label and field
    usernameLabel = new JLabel("Username: ");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(usernameLabel, constraints);

    usernameField = new JTextField(20);
    constraints.gridx = 1;
    constraints.gridy = 0;
    add(usernameField, constraints);

    // Create the password label and field
    passwordLabel = new JLabel("Password: ");
    constraints.gridx = 0;
    constraints.gridy = 1;
    add(passwordLabel, constraints);

    passwordField = new JPasswordField(20);
    constraints.gridx = 1;
    constraints.gridy = 1;
    add(passwordField, constraints);

    // Create the login button
    loginButton = new JButton("Login");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 1;
    constraints.gridy = 2;
    add(loginButton, constraints);

    // Set the size of the frame and make it visible
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    new LoginFormChatGPT();
  }
}
