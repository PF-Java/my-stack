public class MyStack {
    int size;
    int[] array;
    int index = 0;

    public MyStack(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        array[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty");
        }

        return array[--index];
    }

    public int size() {
        return index;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
}
