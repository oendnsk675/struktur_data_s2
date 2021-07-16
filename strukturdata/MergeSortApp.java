package strukturdata;
class Arrays {
   private int arr[]; 
   private int nElemen;
   public Arrays(int size) { 
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
   public void mergeSort() {
       int[] workSpace = new int[nElemen]; 
       recMergeSort(workSpace, 0, nElemen-1);
   }
   public void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
       if (lowerBound == upperBound) { 
           return;
       } else {
           int mid = (lowerBound + upperBound)/ 2; 
           recMergeSort(workSpace, lowerBound,mid); 
           recMergeSort(workSpace, mid + 1,upperBound); 
           merge(workSpace, lowerBound,mid + 1, upperBound);
       }
   }
   public void merge(int[] workSpace, int lowIndex, int highIndex, int upperBound) {
       int j = 0;
       int lowerBound = lowIndex; 
       int mid = highIndex - 1;
       int nItem = upperBound - lowerBound + 1;
       while (lowIndex <= mid && highIndex <= upperBound) {
           if (arr[lowIndex] < arr[highIndex]) { 
               workSpace[j++] = arr[lowIndex++];
           } else {
               workSpace[j++] = arr[highIndex++];
           }
       }
       while (lowIndex <= mid) { 
           workSpace[j++] = arr[lowIndex++];
       }
       while (highIndex <= upperBound) { 
           workSpace[j++] = arr[highIndex++];
       }
       for (j = 0; j < nItem; j++) { 
           arr[lowerBound + j] = workSpace[j];
       }
   }
}

public class MergeSortApp {
    public static void main(String[] args) {
        Arrays theArrayA = new Arrays(10);
        //Isi nilai elemen Array A
        theArrayA.insert(129);
        theArrayA.insert(40);
        theArrayA.insert(7);
        theArrayA.insert(15);
        theArrayA.insert(13);
        theArrayA.insert(2);
        theArrayA.insert(47);
        theArrayA.insert(62);
        theArrayA.insert(84);
        theArrayA.insert(95);
        //Tampilkan isi array A
        System.out.println("Isi Array sebelum Mergesort");        
        theArrayA.display();
        theArrayA.mergeSort();
        System.out.println("Isi Array setelah Mergesort");        
        theArrayA.display();
    }
}
