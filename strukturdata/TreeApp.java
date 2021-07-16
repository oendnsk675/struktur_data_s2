package strukturdata;
public class TreeApp {
    public static void main(String[] args) {
       int value;
       String data;
       Tree theTree = new Tree(); 
       theTree.insert(50, "Ahmad"); 
       theTree.insert(25, "Rosa"); 
       theTree.insert(75, "Raisa"); 
       theTree.insert(12, "Naya"); 
       theTree.insert(37, "Gagas"); 
       theTree.insert(43, "Ainun"); 
       theTree.insert(30, "Beri"); 
       theTree.insert(33, "Vivid"); 
       theTree.insert(87, "Orin"); 
       theTree.insert(93, "Wiwid"); 
       theTree.insert(97, "Sasa");
       theTree.displayTree();
       theTree.delete(25);
       theTree.displayTree();
       theTree.delete(30);
       theTree.displayTree();
       
       theTree.insert(65,"Erwin");
       theTree.displayTree();
       value=30;
       Node found = theTree.find(value); 
       if (found != null) {
           System.out.print("Found: "); 
           found.displayNode(); 
           System.out.print("\n");
       } else {
           System.out.println("Could not find "+ value);
       }
       theTree.displayTree();
       theTree.traverse(1);
       theTree.traverse(2);
       theTree.traverse(3);
    }
}

