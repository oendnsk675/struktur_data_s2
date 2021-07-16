package strukturdata;
public class HashChainApp {
    public static void main(String[] args) {
        HashLinkTable theHashLink = new HashLinkTable(15);
        theHashLink.insert(906);        
        theHashLink.insert(881);
        theHashLink.insert(807);
        theHashLink.insert(458);
        theHashLink.insert(383);
        theHashLink.insert(333);
        theHashLink.insert(559);
        theHashLink.insert(661);
        theHashLink.insert(536);
        theHashLink.insert(461);
        theHashLink.displayTable();
        theHashLink.delete(536);
        theHashLink.displayTable();
    }
}
