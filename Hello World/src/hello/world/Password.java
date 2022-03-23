package hello.world;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author Ahmed Kandil
 * @since 21-3-2022
 * @version 1.0
 */
public class Password implements ActionListener {

    static short attempts = 4;
    static String userName, password, oldPassword = "0000", massage = "";
    static JFrame window = new JFrame("Adm");
    static JLabel userNameLabel, passwordLabel, check;
    static JTextField userNameField;
    static JPasswordField passwordField;
    static JButton sginIn;

    public static void main(String[] args) {
        userNameLabel = new JLabel("Enter Your User Name :");
        userNameLabel.setBounds(25, 25, 150, 30);
        userNameField = new JTextField("");
        userNameField.setBounds(20, 55, 250, 30);
        passwordLabel = new JLabel("Enter Your Password :");
        passwordLabel.setBounds(25, 105, 150, 30);
        passwordField = new JPasswordField("");
        passwordField.setBounds(20, 135, 250, 30);
        check = new JLabel();
        check.setBounds(25, 155, 250, 60);
        sginIn = new JButton("Sgin In");
        sginIn.setBounds(100, 225, 100, 30);
        window.add(userNameLabel);
        window.add(userNameField);
        window.add(passwordLabel);
        window.add(passwordField);
        window.add(check);
        window.add(sginIn);
        window.setSize(300, 300);
        window.setLayout(null);
        window.setVisible(true);
        sginIn.addActionListener(new Password());
    }

    public void actionPerformed(ActionEvent e) {
        userName = userNameField.getText();
        password = new String(passwordField.getPassword());
        if (password != oldPassword) {
            attempts--;
            if (attempts > 1) {
                massage = "Wrong Password You Still Have\n";
                massage += attempts + " attempts Left";
            } else if (attempts == 1) {
                massage = "Wrong Password It's Your Last attempt!!!";
            } else {
                massage = "You Are Fired Ms " + userName;
            }
            check.setText(massage);
        } else {
            massage = "Welcome Back Ms " + userName;
            check.setText(massage);
        }
    }
}
