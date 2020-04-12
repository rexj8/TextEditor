import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextAreaExample extends Frame implements ActionListener {
    JFrame frame;
    Label l1, l2;
    TextArea area;
    Button b;

    TextAreaExample() {

        frame = new JFrame();

        l1 = new Label();
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label();
        l2.setBounds(160, 50, 100, 30);
        area = new TextArea();
        area.setBounds(20, 100, 300, 300);
        b = new Button("Count Words");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);
        frame.add(l1);
        frame.add(l2);
        frame.add(area);
        frame.add(b);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaExample();

    }

    public void actionPerformed(ActionEvent e) {                       // button ActionListener
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Words: " + words.length);
        l2.setText("Characters: " + text.length());
    }
}