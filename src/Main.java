import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Example");

        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);                // tf coordinates and dimensions

        JButton btn = new JButton("Click Here");
        btn.setBounds(50, 100, 95, 30);                // btn coordinates and dimensions

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(btn);
        frame.add(tf);
        frame.setSize(400, 400);                            // frame dimensions
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
