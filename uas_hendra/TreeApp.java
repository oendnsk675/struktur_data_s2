package uas_hendra;

import uas_s2.*;

/**
 *
 * @author oendn
 */
public class TreeApp {
    
    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(18, "+");
        myTree.insert(19, "J");
        myTree.insert(10, "*");
        myTree.insert(8, "/");
        myTree.insert(9, "E");
        myTree.insert(2, "*");
        myTree.insert(1, "A");
        myTree.insert(6, "-");
        myTree.insert(7, "D");
        myTree.insert(4, "+");
        myTree.insert(3, "B");
        myTree.insert(5, "C");
        
        myTree.insert(12, "+");
        myTree.insert(11, "F");
        myTree.insert(14, "*");
        myTree.insert(13, "G");
        myTree.insert(16, "^");
        myTree.insert(15, "H");
        myTree.insert(17, "I");
        
        myTree.displayTree();
        
        myTree.traverse(2); // inorder
        // A * B + C - D / E * F + G * H ^ I + J
    }
}
