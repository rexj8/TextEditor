import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame {

    private JButton bt;
    private JTextArea textArea;

    public MainFrame() {
        super("Hello world");

        setLayout(new BorderLayout());
        bt = new JButton("Click me");
        textArea = new JTextArea();

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });

        add(textArea, BorderLayout.CENTER);
        add(bt, BorderLayout.SOUTH);

        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainFrame();
    }
}