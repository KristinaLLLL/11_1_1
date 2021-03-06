package com.company;

public class ArrayQueue {
    protected int size;
    protected int head;
    protected int tail;
    protected int[] elements;
    ArrayQueue(int size) {
        this.size = size;
        elements = new int [size];
    }

    public final boolean isFull() {
        return (head == size-1);
    }

    public final int getSize() {
        return size;
    }
    public void add(int value) {
        if (++tail == size)
            tail = 0;
        elements[tail] = value;
    }

    public int peek() {
        return elements[++head];

    }
}
