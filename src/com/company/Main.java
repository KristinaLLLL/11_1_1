package com.company;

public class Main {

    public static void main(String[] args) {
	ArrayQueueModule Q1 = new ArrayQueueModule(5);
	Q1.enqueue(10);
	Q1.enqueue(15);
	Q1.enqueue(13);
	Q1.enqueue(4);
	Q1.enqueue(8);
	while (!Q1.isEmpty()) {
        System.out.println(Q1.dequeue());
    }
	Q1.enqueue(13);
	Q1.enqueue(4);
	Q1.enqueue(8);
	Q1.clear();
	System.out.println(Q1.size());
    }
}
