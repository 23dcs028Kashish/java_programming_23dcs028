import java.util.ArrayList;

public class P38 {
    private ArrayList<Object> stackList;

    public P38() {
        stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int getSize() {
        return stackList.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.remove(getSize() - 1);
    }

    public void push(Object o) {
        stackList.add(o);
    }

    public static void main(String[] args) {
        P38 stack = new P38();

        stack.push("Hello");
        stack.push(123);
        stack.push(45.67);
        
        System.out.println("Size of stack: " + stack.getSize());
        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Size of stack after pop: " + stack.getSize());
        
        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
