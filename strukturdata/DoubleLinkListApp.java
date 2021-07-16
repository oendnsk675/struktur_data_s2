package strukturdata;
class DoubleLink {
    public int Data; 
    public DoubleLink next; 
    public DoubleLink previous;

    public DoubleLink(int Data) { 
        this.Data = Data;
    }
    public void displayLink() { 
        System.out.print(Data + " ");
    }
}
class DoublyLinkedList { 
    private DoubleLink first;
    private DoubleLink last;
    
    public DoublyLinkedList() { 
        first = null;
        last = null;
    }
    public boolean isEmpty() { 
        return first == null;
    }

    public void insertFirst(int Data) { 
        DoubleLink newDoubleLink = new DoubleLink(Data);
        if (isEmpty()) {
            last = newDoubleLink;
        } else {
            first.previous = newDoubleLink;
        }
        newDoubleLink.next = first; 
        first = newDoubleLink;
    }
    public void insertLast(int Data) { 
        DoubleLink newDoubleLink = new DoubleLink(Data);
        if (isEmpty()) {
            first = newDoubleLink;
        } else {
            last.next = newDoubleLink; 
            newDoubleLink.previous = last;
        }
        last = newDoubleLink;
    }
    public DoubleLink deleteFirst() { 
        DoubleLink temp = first;
        if (first.next == null) { 
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next; 
        return temp;
    }
    public DoubleLink deleteLast() { 
        DoubleLink temp = last;
        if (first.next == null) { 
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous; 
        return temp;
    }
    public boolean insertAfter(int key, int Data) {
        DoubleLink current = first;
        while (current.Data != key) { 
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        DoubleLink newLink = new DoubleLink(Data); 
        if (current == last) {
            newLink.next = null; 
            last = newLink;
        } else {
            newLink.next = current.next; 
            current.next.previous = newLink;
        }
        newLink.previous = current; 
        current.next = newLink; 
        return true;
    } 
    public DoubleLink deleteKey(int key) { 
        DoubleLink current = first;
        while (current.Data != key) { 
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }
    public void displayForward() {
        System.out.print("List" + "(first-->last): "); 
        DoubleLink current = first;
        while (current != null) { 
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    public void displayBackward() { 
        System.out.print("List "+ "(last-->first): "); 
        DoubleLink current = last;
        while (current != null) { 
            current.displayLink(); 
            current = current.previous;
        }
        System.out.println("");
    }
} 
              
public class DoubleLinkListApp {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList(); 
        theList.insertFirst(22); 
        theList.insertFirst(44); 
        theList.insertFirst(66); 
        theList.displayForward(); 
        theList.insertLast(11); 
        theList.insertLast(33); 
        theList.insertLast(55); 
        theList.displayForward(); 
        theList.displayBackward();
        theList.deleteFirst();
        theList.displayForward(); 
        theList.deleteLast(); 
        theList.displayForward(); 
        theList.deleteKey(11); 
        
        theList.displayForward(); 
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88); 
        theList.displayForward();
    }
}
