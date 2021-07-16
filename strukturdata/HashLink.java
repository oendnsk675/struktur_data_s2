package strukturdata;
public class HashLink {
    private int iData;
    public HashLink next;
    public HashLink(int iData) { 
        this.iData = iData;
    }

    public int getKey() { 
        return iData;
    }
    public void displayLink() { 
        System.out.print(iData + " ");
    }
    
}
