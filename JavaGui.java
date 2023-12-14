// TUMULAK, IVAN STEIVEN A. - ACTIVITY 42

import javax.swing.*;

public class JavaGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");

        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);

        frame.add(b);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}