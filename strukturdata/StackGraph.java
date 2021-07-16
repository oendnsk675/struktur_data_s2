package strukturdata;
public class StackGraph {
    private int maxSize; 
    private int[] stackArray; 
    private int top;

    public StackGraph(int size) { 
        maxSize = size;
        stackArray = new int[maxSize]; 
        top = -1;
    }

    public void push(int item) { 
        stackArray[++top] = item;
    }

    public int pop() {
        return stackArray[top--];
    }
    
    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() { 
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }        
}
