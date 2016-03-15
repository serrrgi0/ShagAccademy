package lesson10.gridbaglayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Serrrgi0 on 11.03.2016.
 */
public class GridBagLayoutTest {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.start();

    }
}
    class LoginForm extends JFrame {
        public LoginForm() throws HeadlessException {
            super("Login Form");
            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            this.setLayout(layout);
            constraints.ipadx = 5;
            constraints.ipady = 5;
            constraints.insets = new Insets(5,5,5,5);

            JLabel label0 = new JLabel("login");
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.gridwidth = 3;
            this.add(label0,constraints);

            JLabel lun = new JLabel("user Name:");
            constraints.gridx = 0;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight =1;
            constraints.weighty =0;
            constraints.anchor = GridBagConstraints.CENTER;
            constraints.fill = GridBagConstraints.BOTH;
            this.add(lun,constraints);

            JLabel lup = new JLabel("password:");
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight =1;
            constraints.weighty =1;
            constraints.anchor = GridBagConstraints.NORTH;
            constraints.fill = GridBagConstraints.NONE;
            this.add(lup,constraints);

            JTextField tun = new JTextField();
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth = 2;
            constraints.gridheight =1;
            constraints.anchor = GridBagConstraints.CENTER;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.weightx =1;
            constraints.weighty =0;
            this.add(tun,constraints);

            JTextField tup = new JPasswordField();
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.gridwidth = 2;
            constraints.gridheight =1;
            constraints.anchor = GridBagConstraints.NORTH;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.weightx =1;
            constraints.weighty =1;
            this.add(tup,constraints);

            JButton ok = new JButton("OK");
            constraints.gridx = 1;
            constraints.gridy = 3;
            constraints.gridwidth = 1;
            constraints.gridheight =1;
            constraints.anchor = GridBagConstraints.LINE_END;
            constraints.fill = GridBagConstraints.NONE;
            constraints.weightx =1;
            constraints.weighty =0;
            this.add(ok,constraints);

            JButton csl = new JButton("Cancel");
            constraints.gridx = 2;
            constraints.gridy = 3;
            constraints.gridwidth = 1;
            constraints.gridheight =1;
            constraints.anchor = GridBagConstraints.CENTER;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.weightx =0;
            this.add(csl,constraints);
        }
        public void start() {
            this.pack();
            this.setMinimumSize(this.getSize());
            this.setVisible(true);
        }
    }

