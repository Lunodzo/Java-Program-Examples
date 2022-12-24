package Registration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registration {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JLabel userLabel = new JLabel("user");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField("user");
        userLabel.setBounds(10,20,80,25);
        panel.add(userText);

        JLabel passwordJLabel = new JLabel("password");
        passwordJLabel.setBounds(10,50,80,25);
        panel.add(passwordJLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton button = new JButton("Registration");
        button.setBounds(10,80,80,25);
        panel.add(button);

    }
}
