package lesson11.TreeModel;

import javax.swing.*;
import java.io.File;

/**
 * Created by Serrrgi0 on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        FileTreeModel treeModel = new FileTreeModel(new File("c:\\"));
        JTree tree = new JTree(treeModel);
        JScrollPane scrollPane = new JScrollPane(tree);
        JFrame window = new JFrame("File System");
        window.add(scrollPane);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }
}
