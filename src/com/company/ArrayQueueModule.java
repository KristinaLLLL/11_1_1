package com.company;

public class ArrayQueueModule {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int size;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public ArrayQueueModule(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        size = 0;
    }

    public void enqueue(int elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queue[++rear] = elem;
        size++;
    }

    public int element(){
        return queue[front++];
    }

    public int dequeue() {
        int temp = queue[front++]; // получаем первый элемент из очереди

        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        size--; // уменьшаем количество элементов в очереди
        return temp;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void clear(){
        for(int i=0; i<=size+1; i++){
            queue[i]=0;
            size--;
        }
    }
}
