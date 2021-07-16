package strukturdata;
class HighArray2 {
    private int[] arr; 
    private int nElemen;
    public HighArray2(int max) { 
        arr = new int[max];
        nElemen = 0;
    }
    public void insert(int value) { 
        arr[nElemen] = value; 
        System.out.println(value +" telah ditambahkan pada index ke "+nElemen);
        nElemen++;
    }
    public void BubbleSort() { 
        int batas, i;
        int iterasi=1;
        for (batas = nElemen-1; batas>0; batas--) { 
            System.out.println("Iterasi ke "+iterasi++);
            for (i = 0; i < batas; i++) {
                 for (int k = 0; k < nElemen; k++) { 
                     System.out.print(arr[k] + " ");
                 }
                 System.out.println("");
                 if (arr[i] < arr[i + 1]) { 
                     swap(i, i + 1);
                 }
            }
        }
        System.out.println("");
    }
    
    public void SelectionSort() { 
        int awal, i, min;
        for (awal=0; awal< nElemen-1; awal++) { 
            min = awal;
            for (i = awal + 1; i < nElemen; i++) { 
                if (arr[i] < arr[min]) {
                   min = i;
                }
            }
            swap(awal, min);
            System.out.println(arr[awal]+" ");
        }
    }
    
    public void InsertionSort() { 
        int i, curIn;
        for (curIn= 1; curIn < nElemen; curIn++) { 
            int temp = arr[curIn];
            i = curIn;
            while (i > 0 && arr[i - 1] >= temp) { 
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = temp;
        }
    }

    public void swap(int one, int two) { 
        int temp = arr[one];
        arr[one] = arr[two]; 
        arr[two] = temp;
    }
    public void display() {
        for (int i = 0; i < nElemen; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}

public class SimpleSortingApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray2 arr;
        arr = new HighArray2(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(77);
        arr.display();
        System.out.println("Insertion Sort ");
        //arr.BubbleSort();
        arr.InsertionSort();
        //arr.SelectionSort();
        arr.display();
    }
}
