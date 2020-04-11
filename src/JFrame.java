import javax.swing.*;

class GUITest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {                               // used for multithreading  ??????????
            @Override
            public void run() {
                JFrame frame = new JFrame("App");
                frame.setSize(600,500);                                          //set size of the frame
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //used to terminate the task when we click on exit-cross button
                frame.setVisible(true);
            }
        });

    }
}
