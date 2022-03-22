package hello.world;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author Ahmed Kandil
 * @since 21-3-2022
 * @version 1.0
 */
public class Password {

    public static void main(String[] args) {
        JFrame window = new JFrame("Adm");
        JLabel userNameLabel, passwordLabel, information;
        JTextField userNameField;
        JPasswordField passwordField;
        JButton sginIn;

        userNameLabel = new JLabel("Enter Your User Name :");
        userNameLabel.setBounds(25, 25, 150, 30);

        userNameField = new JTextField("");
        userNameField.setBounds(20, 55, 250, 30);

        passwordLabel = new JLabel("Enter Your Password :");
        passwordLabel.setBounds(25, 105, 150, 30);

        passwordField = new JPasswordField("");
        passwordField.setBounds(20, 135, 250, 30);

        information = new JLabel();
        information.setBounds(25, 155, 250, 60);

        sginIn = new JButton("Sgin In");
        sginIn.setBounds(100, 225, 100, 30);

        window.add(userNameLabel);
        window.add(userNameField);

        window.add(passwordLabel);
        window.add(passwordField);

        window.add(information);

        window.add(sginIn);

        window.setSize(300, 300);
        window.setLayout(null);
        window.setVisible(true);

        sginIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                short attempts = 3;
                String userName, password, oldPassword = "0000", massage = "";
                userName = userNameField.getText();
                password = new String(passwordField.getPassword());
                do {
                    attempts--;
                    if (attempts <= 3) {
                        massage = "Wrong Password You Still Have\n";
                        massage += attempts + " attempts Left";

                    } else if (attempts == 1) {
                        massage = "Wrong Password It's Your Last attempt!!!";
                    } else {
                        massage = "You Are Fired Ms" + userName;
                    }
                    information.setText(massage);
                } while (password != oldPassword && attempts != 0);
                massage = "Welcome Back Ms " + userName;
            }
        });
    }
}
