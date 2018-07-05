public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack: ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack pop operations: " + stack.size());
        System.out.println("4. Is stack full? " + "\n   Answer: " + stack.isFull());
    }
}
