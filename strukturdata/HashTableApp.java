package strukturdata;
public class HashTableApp {
    public static void main(String[] args) {
        Data nilai;
        HashTable theHash=new HashTable(15);
        theHash.insert(906);        
        theHash.insert(881);
        theHash.insert(807);
        theHash.insert(458);
        theHash.insert(383);
        theHash.insert(333);
        theHash.insert(559);
        theHash.insert(661);
        theHash.insert(536);
        theHash.insert(461);
        theHash.displayTable();
        theHash.insert(876);
        theHash.insert(491);
        theHash.displayTable();
        theHash.delete(383);
        theHash.displayTable();
        nilai = theHash.find(559);
        System.out.println("Data yang dicari "+nilai.getKey());
    }
}
