package strukturdata;
class StackIn {
    private int maxSize; 
    private double[] stackArray; 
    private int top;

    public StackIn(int size) { 
        maxSize = size;
        stackArray = new double[maxSize]; 
        top = -1;
    }

    public void push(double item) { 
        stackArray[++top] = item;
    }

    public double pop() {
        return stackArray[top--];
    }
    
    public double peek() {
        return stackArray[top];
    }

    public boolean isEmpty() { 
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }    
}

public class StackApp {
    public static void main(String[] args) {
        StackIn theStack = new StackIn(10);// menciptakan objek theStack turunn dari class 
        System.out.println(">> push some items"); 
        theStack.push(20); 
        double nilai = theStack.pop();
        System.out.println("Yang terhapus dari stack adalah "+nilai);
        theStack.push(30.77);
        theStack.push(40); 
        double top2 = theStack.peek();
        System.out.println("Yang ada di puncak stack adalah "+top2);
        theStack.push(60); 
        theStack.push(8.5);
        theStack.push(90);
        theStack.push(10);
        theStack.push(11);
        theStack.push(130); 
        theStack.push(130);
        theStack.push(-13);
        if (theStack.isFull()) {
            System.out.println("Stack Penuh");
        }
        double top3 = theStack.peek();
        System.out.println("Yang ada di puncak stack adalah "+top3);
        System.out.println("\n>> pop items in the stack"); 
        while (!theStack.isEmpty()) {
             double value = theStack.pop(); 
             System.out.print(value + " ");
        } 
    }
}
