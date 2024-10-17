public class StackArray {
    int size;
    int top;
    int[] arrayStack;

    public StackArray(int size) {
        this.size = size;
        arrayStack = new int[this.size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.err.println("Stack is full");
            return;
        } else {
        top = + 1;
        arrayStack[top] = value;
        }
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        return arrayStack[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        }
        int value = arrayStack[top];
        top = top - 1;
        return value;
    }
}
