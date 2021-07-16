package strukturdata;
class Recursion {
    public int triangleIter(int n) { 
       int result = 0;
       for (int i = n; i > 0; i--) { 
           result += i;
       }
       return result;
    }
    public int triangleRecur (int n){
       if (n == 1) { 
           return 1;
       } else {
           return n + triangleRecur(n - 1);
       }
    }
}
public class RecursionApp {
    public static void main(String[] args) {
        Recursion theRecursion = new Recursion(); 
        System.out.println("Bilangan segitiga dari 5 = "+theRecursion.triangleRecur(5));
    }
}
