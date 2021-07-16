package strukturdata;
class Array2 {
   private int arr[]; 
   private int nElemen;
   public Array2(int size) { 
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
   public void ShellSort () {
       int in, out; 
       int temp;
       int h = nElemen / 2;
       while (h > 0) {
          for (out = h; out < nElemen; out++) { 
              temp = arr[out];
              in = out;
              while (in > h - 1 && arr[in - h] >= temp) { 
                  arr[in] = arr[in - h];
                  in -= h;
              }
              arr[in] = temp;
              display();
          }
          System.out.println();
          h /= 2;
      }
    }
      public void ShellSort2() {
       int in, out; 
       int temp;
       int h = 1;
       while (h > 0) {          
           for (out = h; out < nElemen; out++) { 
              temp = arr[out];
              in = out;
              while (in > h - 1 && arr[in - h] >= temp) { 
                  arr[in] = arr[in - h];
                  in -= h;
              }
              arr[in] = temp;
              display();
          }
          System.out.println(); 
          h = h*3+1;
      }
    }
}

public class ShellSortApp {
    public static void main(String[] args) {
       Array2 A = new Array2(8);
       A.insert(15);
       A.insert(2);
       A.insert(33);
       A.insert(8);
       A.insert(19);
       A.insert(5);
       A.insert(10);
       A.insert(64);
//       A.display();
       A.ShellSort2();
//       A.display();
    }
}
