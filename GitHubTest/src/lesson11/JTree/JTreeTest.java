package lesson11.JTree;

import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Created by Serrrgi0 on 15.03.2016.
 */
public class JTreeTest {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        root.add(new DefaultMutableTreeNode("Leaf"));
        JTree tree = new JTree(root);
        JFrame frame = new JFrame("JTree Test");
        frame.add(tree);
        frame.pack();
        frame.setVisible(true);
    }
}
