package strukturdata;
public class HashLinkTable {
    private SortedLinkList[] hashArray; 
    private int size;

    public HashLinkTable(int size) { 
        this.size = size;
        hashArray = new SortedLinkList[size]; 
        for (int i = 0; i < size; i++) {
            hashArray[i] = new SortedLinkList();
        }
    }

    public void displayTable() { 
        System.out.println("Table: "); 
        for (int j = 0; j < size; j++) {
            System.out.print(" "+j + ". "); 
            hashArray[j].displayList();
        }
    }
    
    public int hashFunc(int key) { 
        return key % size;
    }

    public void insert(int data) { 
        HashLink theHashLink=new HashLink(data); 
        int key = theHashLink.getKey(); 
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theHashLink);
    }
    
    public void delete(int key) { 
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public HashLink find(int key) {
        int hashVal = hashFunc(key); 
        HashLink theLink = hashArray[hashVal].find(key); 
        return theLink;
    }

}
