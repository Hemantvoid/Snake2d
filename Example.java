
import java.awt.Color;
import javax.swing.*;

public class Example{


    public static void main(String[] args) {
        
        JFrame f;

        f = new JFrame("Example");
        f.setBounds(10,10,905,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
        //f.setBackground(Color.GREEN);

        MyPanel panel = new MyPanel();
        panel.setBackground(Color.DARK_GRAY);
        f.add(panel);
    }

}