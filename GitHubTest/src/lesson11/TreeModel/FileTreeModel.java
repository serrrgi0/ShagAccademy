package lesson11.TreeModel;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.io.File;

/**
 * Created by Serrrgi0 on 15.03.2016.
 */
public class FileTreeModel implements TreeModel {

    public FileTreeModel(File root) {
        this.root = root;
    }
    private File root;

    @Override
    public Object getRoot() {
        return this.root;
    }
    @Override
    public boolean isLeaf(Object node) {
        return ((File)node).isFile();
    }

    @Override
    public Object getChild(Object parent, int index) {
        File parentFile = (File) parent;
        String[] children = parentFile.list();
        if(index >=children.length || children == null)
            return null;
        return new File(parentFile, children[index]);

    }

    @Override
    public int getChildCount(Object parent) {
        File parentFile = (File) parent;
        String[] children = parentFile.list();
        if (children==null)
            return 0;
        return children.length;
    }



    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {

    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        File parentFile = (File) parent;
        File childFile = (File) child;
        String[] children = parentFile.list();
        for (int i = 0; i <children.length ; i++) {
            if(children[i].equals(childFile.getName()))
                return i;
        }
        return -1;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {

    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {

    }
}
