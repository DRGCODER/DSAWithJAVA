public class StackArrayDynamic {
    int size;
    int top;
    int[] arrayStack;

    public StackArrayDynamic(int size) {
        this.size = size;
        arrayStack = new int[this.size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            expand(top + 2);
        }
        top = +1;
        arrayStack[top] = value;
    }
    private void expand(int expandVal) {
        int newSize = arrayStack.length + expandVal;
        int[] newArr = new int[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arrayStack[i];
        }
        
        arrayStack = newArr;
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
