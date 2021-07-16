package strukturdata;
class Array3 {
   private int arr[]; 
   private int nElemen;
   public Array3(int size) { 
       arr = new int[size];
       nElemen = 0;
   }
   public void insert(int value) { 
       arr[nElemen] = value;
       nElemen++;
   }
   public void display() {
       for (int i = 0; i < nElemen; i++) { 
          System.out.print(arr[i] + " ");
       }
       System.out.println("");
   }
   public void QuickSort() { 
       recQuickSort(0, nElemen - 1);
   }
   public void recQuickSort(int batasKiri,int batasKanan) { 
       if (batasKanan - batasKiri <= 0) {
           return ;
       } else {
           int pivot = arr[(batasKanan-batasKiri)/2];
           int partisi = partitionIt(batasKiri,batasKanan, pivot); 
           recQuickSort(batasKiri, partisi - 1); 
           recQuickSort(partisi + 1, batasKanan);
       }
   }
   public int partitionIt(int batasKiri,int batasKanan, int pivot) { 
       int indexKiri = batasKiri - 1;
       int indexKanan = batasKanan + 1; 
       while (true) {
          while (indexKiri < batasKanan && arr[++indexKiri] < pivot) ;
          while (indexKanan > batasKiri && arr[--indexKanan] > pivot) ;
          if (indexKiri >= indexKanan) { 
              break;
          } else {
             swap(indexKiri, indexKanan);
          }
       }
       return indexKiri;
   }
   public void swap(int one, int two) { 
        int temp = arr[one];
        arr[one] = arr[two]; 
        arr[two] = temp;
    }
}   
public class QuickSortApp {
    public static void main(String[] args) {
        Array3 B = new Array3(8);
        B.insert(15);
        B.insert(2);
        B.insert(33);
        B.insert(8);
        B.insert(19);
        B.insert(5);
        B.insert(10);
        B.insert(64);
        B.display();
        B.QuickSort();
        B.display();
    }
}
