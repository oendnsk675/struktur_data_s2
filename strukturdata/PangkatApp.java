package strukturdata;
public class PangkatApp {
    public static int pangkat_eksponen(int x, int y){     
        if ( y == 0 ){         
            return 1;     
        }else {         
            return x * pangkat_eksponen(x, y - 1);     
        } 
    } 
 
    public static void main(String[] args) {
        System.out.println("2 ^ 10 : "+pangkat_eksponen(2,10));     
        System.out.println("3 ^ 5 : "+pangkat_eksponen(3,5));     
        System.out.println("3 ^ 16 : "+pangkat_eksponen(3,16)); 
    }
}
