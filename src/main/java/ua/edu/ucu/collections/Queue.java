package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList linkedList;

    public Queue() {
        linkedList = new ImmutableLinkedList();
    }

    Object peek() {
        return linkedList.getFirst();
    }

    Object dequeue() {
        Object obj = this.peek();
        linkedList = linkedList.removeFirst();
        return obj;
    }

    void enqueue(Object e) {
        linkedList = linkedList.addLast(e);
    }

}
