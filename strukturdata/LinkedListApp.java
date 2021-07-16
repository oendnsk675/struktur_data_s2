package strukturdata;
class StackLink {
    public int ID;
    public String NamaBarang;
    public StackLink next;

    public StackLink(int ID, String NamaBarang) { 
       this.ID = ID;
       this.NamaBarang = NamaBarang;
    }
    public void displayLink() { 
       System.out.println("{"+ID +" , "+NamaBarang+"}");
    }
}

class LinkedList {
    private StackLink first; 
    public LinkedList() {
        first = null;
    }
    public void push(int ID, String NamaBarang) { 
        StackLink newLink = new StackLink(ID, NamaBarang);
        newLink.next = first;
        first = newLink;
    }
    public StackLink pop() { 
        StackLink temp = first;
        first = first.next; 
        return temp;
    }
     public void displayStack() { 
         System.out.println("Stack(top-->bottom):"); 
         StackLink current = first;
         while (current != null) { 
             current.displayLink();
             current = current.next;
         }
         System.out.println("");
     }
}

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();
        theList.push(1,"VCD"); 
        theList.push(2,"TV"); 
        theList.displayStack();
        theList.push(3,"Kulkas"); 
        theList.push(4,"PC"); 
        theList.push(5,"Rice Cooker"); 
        theList.push(6,"Dispencer"); 
        theList.displayStack();
        theList.pop();
        theList.pop();
        theList.pop();
        theList.displayStack();
    }
}
