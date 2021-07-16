package strukturdata;
class Mahasiswa {
    private long nim;
    private String nama;
    private String asal;
    
    public Mahasiswa (long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }
    
    public void displayMhs() {
        System.out.print("\tNIM: "+nim);
        System.out.print(", Nama: "+nama);
        System.out.println(", Asal: "+asal);
    }
    public long getNim(){
        return nim;
    }
}   

class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;
    
    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }
    
    public Mahasiswa find(long searchNim){
        int i;
        for (i =0; i<nElemen; i++){
            if (mhs[i].getNim()==searchNim){
                break;
            }
        }
        if (i==nElemen) {
            return null;        
        } else {
            return mhs[i];
        }   
    }   
    public void insert(long nim, String nama, String asal) {
        mhs[nElemen]= new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
    public boolean delete(long searchNim){
        int i;
        for (i=0; i<nElemen; i++){
            if (mhs[i].getNim()==searchNim){
                break;
            }
        }
        if (i==nElemen){
            return false;
        } else {
            for (int j=i; j<nElemen; j++){
                mhs[j]=mhs[j+1];
            }
            nElemen--;
            return true;
        }
    }
    public void displayArray(){
        for (int i=0; i<nElemen; i++){
            mhs[i].displayMhs();
        }
    }
}


public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650200,"Jundi", "Malang");
        arr.insert(16650210,"Ahmad", "Sidoarjo");
        arr.insert(16650220,"Ismail", "Banyuwangi");
        arr.insert(16650230,"Sofi", "Semarang");
        arr.insert(16650240,"Dinda", "Bandung");
        arr.insert(16650250,"Rais", "Ambon");
        arr.insert(16650260,"Helmi", "Madura");
        arr.insert(16650270,"Agung", "Madiun");
        arr.insert(16650280,"Arina", "Malang");
        
        arr.displayArray();
        
        long searchKey = 16650270;
        Mahasiswa mhs = arr.find(searchKey);
        if (mhs != null){
            System.out.print("\nketemu");
            mhs.displayMhs();
        } else {
            System.out.println("tidak ketemu "+searchKey);
        }
        
        searchKey=16650240;
        System.out.println("\nhapus nim: "+searchKey);
        arr.delete(searchKey);
        
        arr.displayArray();
    }
}
