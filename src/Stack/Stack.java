package Stack;

public class Stack {

    String [] stack = new String[7];
    private int index = -1;

    public boolean isEmpty() {
        return index == -1;
    }

    public void push(String input) {
        stack[index += 1] = input;

    }


    public int size() {
        return index + 1;
    }

    public int pop() {
        if(isEmpty()){
           throw new IllegalArgumentException("Cannot remove element from an empty collection");
        }
        return index --;

    }

    public int capacity() {
        return stack.length;
    }

    public String peek() {
        if(isEmpty()){
            return "Stack is Empty, no element to see";
        }
        return stack[index];
    }
}
