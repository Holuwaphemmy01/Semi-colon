package queue;

public class Queue {
private int size;
private String[] queue;

    public Queue(int capacity) {
        queue = new String[capacity];
    }
    public int exist() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean enqueue(String value) {
        queue[size++] = value;
        return true;
    }

    public String dequeue() {
        for(int index = 0; index <= size; index++) {
            //if (queue[index] != null) {
                size--;
                return queue[index];

          //  }
            //else throw new IllegalArgumentException("Queue is empty");

        }
//        int var = queue.length - size;
//      return queue[size - var];
        return null;
    }

    public int count() {
        return size;
    }
}
