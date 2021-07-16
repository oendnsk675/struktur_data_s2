package strukturdata;
import java.util.Scanner;
public class MenaraHanoiApp {
    static int move = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Cakram/Disc: ");
        int Cakram = input.nextInt();
        hanoi(Cakram, 'A', 'B', 'C');
    }
    static void hanoi (int Cakram, char awal, char bantu, char tujuan){
    if (Cakram >= 1) { 
        hanoi (Cakram-1, awal, tujuan, bantu);
        move(Cakram, awal, tujuan);
        hanoi (Cakram-1, bantu, awal, tujuan);
        }
    }
     static void move (int step, char awal, char tujuan){
        System.out.print("Langkah "+move+": ");
        move++;
        System.out.print("Pindahkan Cakram "+step);
        System.out.print(" dari "+awal);
        System.out.println(" ke "+tujuan);
    }
}
