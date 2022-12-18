import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class LoginPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userID = new JTextField();
    JPasswordField userPassword = new JPasswordField();
    JLabel userIDlabel = new JLabel("User ID: ");
    JLabel userPasswordlabel = new JLabel("Password: ");
    JLabel userMessageLabel = new JLabel("You are about to login");

    HashMap<String, String> loginData = new HashMap<String, String>();
    //Setup the constructor
    LoginPage(HashMap<String, String> loginDetails){
        loginData = loginDetails;

        userIDlabel.setBounds(50, 100, 75, 25);
        userPasswordlabel.setBounds(50, 150, 75, 25);
        userMessageLabel.setBounds(125, 250, 250, 35);
        userMessageLabel.setFont(new Font(null, Font.ITALIC, 15));

        userID.setBounds(125, 100, 200, 25);
        userPassword.setBounds(125, 150, 200, 25);
        
        button.setBounds(125, 200, 100, 25);
        button.setFocusable(false);
        button.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        button.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDlabel);
        frame.add(userPasswordlabel);
        frame.add(userMessageLabel);
        frame.add(userID);
        frame.add(userPassword);
        frame.add(button);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 320);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==resetButton) {
            userID.setText("");
            userPassword.setText("");
        }

        if (e.getSource()==button) {
            String userName = userID.getText();
            String password = String.valueOf(userPassword.getPassword());

            //Verify information 
            if (loginData.containsKey(userName)) {
                if(loginData.get(userName).equals(password)){
                    userMessageLabel.setForeground(Color.green);
                    userMessageLabel.setText("Login success");

                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userName);
                }else{
                    userMessageLabel.setForeground(Color.red);
                    userMessageLabel.setText("Login failure");
                }
            }else{
                userMessageLabel.setForeground(Color.red);
                userMessageLabel.setText("Username not found");
            }
        }
    }
}