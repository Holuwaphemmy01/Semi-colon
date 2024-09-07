package set;

import java.util.Arrays;

public class Set {
    private int size;
    private final int [] arraySet;

    public Set(int capacity) {
        arraySet = new int[capacity];
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int value) {
        if (size <= arraySet.length) {
            for (int index = 0; index < 1; index++) {
                for (int number = 0; number < size; number++) {
                    if (arraySet[number] == value) throw new IllegalArgumentException(value + " already exists");
                }
                arraySet[size] = value;
                size++;
            }
        }
        else throw new IndexOutOfBoundsException("Set is full");

    }

    public int count() {
        return size;
    }

    public int remove(int value) {
        for(int index = 0; index < size; index++) {
            if (arraySet[index] == value) {
                size--;
                return arraySet[index];
             }
        }
            throw new IllegalArgumentException(value+ "doesn't exist");

    }

    public boolean check(int value) {
        for (int index = 0; index < size; index++) {
            if (arraySet[index] == value) return true;
        }
        return false;
    }
}
