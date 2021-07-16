package strukturdata;
class HighArray {
    private int[] arr; 
    private int nElemen;
    public HighArray(int max) { 
        arr = new int[max];
        nElemen = 0;
    }
    public void insert(int value) { 
        arr[nElemen] = value; 
        System.out.println(value +" telah ditambahkan pada index ke "+nElemen);
        nElemen++;
    }

    public boolean find(int key) { 
        int i;
        for (i = 0; i < nElemen; i++) { 
            if (arr[i] == key) {
               break;
            }
        }
        if (i == nElemen) { 
            return false;
        } else {
            return true;
        }
    }
    
    public boolean findBinary(int key) {
        int batasAtas=nElemen-1;
        int batasBawah=0;
        boolean notfound=true;
        while (notfound) {
            int posisiSekarang = (batasAtas + batasBawah)/2;
            if (arr[posisiSekarang] == key) {
                return true;
            } else if (batasBawah>batasAtas) {
                notfound=false;
            } else if(arr[posisiSekarang]< key) {
                batasBawah = posisiSekarang+1;
            } else {
                batasAtas = posisiSekarang-1;
            }
        }
        return false;
    }
    
    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) { 
            if (value == arr[i]) {
               break;
            }
        }
        if (i == nElemen) { 
            return false;
        } else {
            for (int j = i; j < nElemen; j++) { 
                arr[j] = arr[j + 1];
            }
            nElemen--; 
            System.out.println(value +" telah dihapus dari array");
            return true;
        }
     }
    public void display() {
        for (int i = 0; i < nElemen; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public int size() { 
        return arr.length; 
    }
   
    public int size2() { 
        int counter = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                counter++; 
            }
        } 
        return counter;
    }
    public void insert2(int value, int idx){
        int s=nElemen;
        insert(arr[s-1]);
        for (int i=(s-1); i>idx; i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=value;
    }
    public void insert3(int value){
        int s=nElemen;
        int i;
        for (i=0; i < s; i++){
            if (arr[i] > value){
                break;
            }
        }
        for (int j = s; j >= i; j--) { 
                arr[j] = arr[j-1];
            }
        arr[i]=value;
        System.out.println(value +" telah ditambahkan pada index ke "+i);
        nElemen++;
    }

    public void BubbleSort(){
        int s=size2();
        int swap;
        for (int i=0; i<s;i++) {
            for(int j=0; j<s-i;j++) {
                if (arr[j] > arr[j+1]) {
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=swap;
                }
             }
         }
    }

}

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.display();
        
        arr.insert(70); 
        arr.display();
        System.out.println("Jumlah Elemen Array yang diklarasikan ="+arr.size());
        System.out.println("Jumlah Elemen Array yang terisi saja ="+arr.size2());
        arr.insert(80); 
        arr.insert(75); 
        arr.insert(55); 
        arr.insert(85); 
        arr.display();
        System.out.println("Jumlah Elemen Array yang diklarasikan ="+arr.size());
        System.out.println("Jumlah Elemen Array yang terisi saja ="+arr.size2());
        arr.insert(25); 
        arr.insert(30); 
        arr.insert(00); 
        arr.insert(90); 
        arr.insert(40);
        arr.size2();
        arr.display();
        
        arr.insert2(10,4);
        arr.display();
        
        int key = 25;
        if (arr.find(key)) { 
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }
        
        if (arr.findBinary(key)) { 
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }
        
        arr.BubbleSort();
        arr.display();
        
        if (arr.find(key)) { 
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }

        if (arr.findBinary(key)) { 
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }
        arr.insert3(85);
        arr.display();
        arr.insert3(45);
        arr.display();
        
        arr.delete(00); 
        arr.display();
        arr.delete(80); 
        arr.display();
        arr.delete(55);
        arr.display();
    }
}