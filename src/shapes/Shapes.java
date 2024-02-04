package shapes;

import javax.swing.JFrame;
import shape.MainWindow;

public class Shapes {

    public static void main(String[] args) {
        MainWindow frame = new MainWindow();
        frame.setTitle("Shapes");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
