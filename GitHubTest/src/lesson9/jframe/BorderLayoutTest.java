package lesson9.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Serrrgi0 on 10.03.2016.
 */
public class BorderLayoutTest {
    public static void main(String[] args) {
        ProgramWindow pm = new ProgramWindow();
        pm.Start();
    }
}
class ProgramWindow extends JFrame {
    public ProgramWindow() throws HeadlessException {
        this.setLayout(new BorderLayout());
        JButton btn10 = new JButton("bottom");
        this.add(btn10,BorderLayout.PAGE_END);
        JButton btn1 = new JButton("TOP");
        this.add(btn1,BorderLayout.PAGE_START);
        JButton btn2 = new JButton("left");
        this.add(btn2,BorderLayout.LINE_START);
        JButton btn3 = new JButton("left");
        this.add(btn3,BorderLayout.CENTER);
        JButton btn4 = new JButton("right");
        this.add(btn4,BorderLayout.LINE_END);
    }
    public void Start() {
        this.pack();
        this.setVisible(true);
    }
}
