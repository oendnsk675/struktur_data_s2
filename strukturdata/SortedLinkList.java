package strukturdata;
public class SortedLinkList {
    private HashLink first;
    public SortedLinkList() { 
        first = null;
    }

    public void insert(HashLink theHashLink) { 
        int key = theHashLink.getKey(); 
        HashLink previous = null;
        HashLink current = first;
        while (current != null && key > current.getKey()) { 
            previous = current;
            current = current.next;
        }
        if (previous == null) { 
            first = theHashLink;
        } else {
            previous.next = theHashLink;
        }
        theHashLink.next = current;
    }
    
    public void delete(int key) { 
        HashLink previous = null; 
        HashLink current = first;
        while (current != null && key != current.getKey()) { 
            previous = current;
            current = current.next;
        }
        if (previous == null) { 
            first = first.next;
        } else {
            previous.next = current.next;
        }
    }

    public HashLink find(int key) { 
        HashLink current = first;
        while (current != null && current.getKey() <= key) { 
            if (current.getKey() == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayList() { 
        System.out.print("List (first-->last): "); 
        HashLink current = first;
        while (current != null) { 
            current.displayLink(); 
            current = current.next;
        }
        System.out.println("");
    }
}
