package strukturdata;
class Queue {
    private int maxSize; 
    private long[] queArray; 
    private int front; 
    private int rear; 
    private int nItems;

    public Queue(int size) { 
        this.maxSize = size;
        queArray = new long[maxSize]; 
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long value) { 
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = value; 
        nItems++;
   }

   public long remove() {
        long temp = queArray[front++]; 
        if (front == maxSize) {
            front = 0;
        }
        nItems--; return temp;
   }
   
   public long peekFront() { 
       return queArray[front];
   }

   public boolean isEmpty() { 
       return (nItems == 0);
   }

   public boolean isFull() { 
       return (nItems == maxSize);
   }

   public int size() { 
       return nItems;
   }
}

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(10); 
        theQueue.insert(10); 
        theQueue.insert(20); 
        theQueue.insert(30); 
        theQueue.insert(40); 
        //theQueue.remove(); 
        //theQueue.remove(); 
        //theQueue.remove(); 
        theQueue.insert(50); 
        theQueue.insert(60); 
        theQueue.insert(70); 
        theQueue.insert(80);
        theQueue.insert(90);
        System.out.println("Jumlah elemen dalam antrian ="+theQueue.size());
        if (theQueue.isFull()) {
            System.out.println("Queue Full");
        }
        System.out.println("Nilai elemen pada antrian terdepan ="+theQueue.peekFront());
        while (!theQueue.isEmpty()){
             long n = theQueue.remove(); 
             System.out.print(n); 
             System.out.print(" ");
        }
        System.out.println("");
    }
}
