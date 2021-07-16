package strukturdata;
public class Stack {
    private int maxSize; 
    private Node[] stackArray; 
    private int top;

    public Stack(int size) { 
        maxSize = size;
        stackArray = new Node[maxSize]; 
        top = -1;
    }

    public void push(Node item) { 
        stackArray[++top] = item;
    }

    public Node pop() {
        return stackArray[top--];
    }
    
    public Node peek() {
        return stackArray[top];
    }

    public boolean isEmpty() { 
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }    
}
