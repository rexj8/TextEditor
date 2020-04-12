import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Text Editor");

        final JTextField tf = new JTextField();
        tf.setBounds(100, 50, 150, 20);                // tf coordinates and dimensions
        frame.add(tf);

        JButton btn = new JButton("Save");
        btn.setBounds(50, 100, 95, 30);                // btn coordinates and dimensions
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(400, 400);                            // frame dimensions
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
