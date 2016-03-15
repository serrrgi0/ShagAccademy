package lesson9.jframe;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by Serrrgi0 on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("first UI");
        JLabel label = new JLabel("Hello World!");
        Border b = new LineBorder(Color.black);
        System.out.println(label.getInsets());
        label.setBorder(b);
        window.add(label);
        window.setSize(400,300);
        window.setVisible(true);

    }
}
