package uas_s2;

/**
 *
 * @author oendn
 */
public class TreeApp {
    
    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(50, "A");
        myTree.insert(30, "B");
        myTree.insert(60, "C");
        myTree.insert(70, "F");
        myTree.insert(65, "I");
        myTree.insert(66, "L");
        myTree.insert(20, "D");
        myTree.insert(10, "G");
        myTree.insert(40, "E");
        myTree.insert(35, "H");
        myTree.insert(32, "J");
        myTree.insert(36, "K");
        
        myTree.displayTree();
        
        myTree.traverse(1); // preorder
        myTree.traverse(2); // inorder
        myTree.traverse(3); // postorder
    }
}
