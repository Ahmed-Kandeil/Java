package hello.world;

import javax.swing.*;

/**
 * @author Ahmed Kandil
 * @since 11-3-2022
 * @version 1.0
 */
public class ReverseMe {

    public static void main(String[] args) {
        JFrame window;
        window = new JFrame();
        ImageIcon icon = new ImageIcon("src/images/logo.png");
        String name = JOptionPane.showInputDialog(window, "Enter Your Name :");
        JOptionPane.showMessageDialog(
                null,
                name + " You Are Genius",
                "Amazing GUI !!!",
                JOptionPane.INFORMATION_MESSAGE,
                icon);
    }
}
