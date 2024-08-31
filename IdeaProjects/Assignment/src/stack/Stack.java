package stack;

public class Stack {
    private int stackSize;
    private final String[] stackArray;

    public Stack(int capacity) {
        stackArray = new String[capacity];
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public void push(String element) {
        if (isFull()) throw new IllegalArgumentException("Stack is full");

        else {
            stackArray[stackSize] = element;
            stackSize++;
        }
    }

    public String pop() {
        if (stackSize > 0)return stackArray[--stackSize];
        else return null;

    }

    public int count() {
        return stackSize;
    }

    public boolean isFull() {
        if (stackSize == stackArray.length) return true;
        else return stackSize > stackArray.length;
    }
}

