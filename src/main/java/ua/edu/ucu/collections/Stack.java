package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList linkedList;

    public Stack() {
        linkedList = new ImmutableLinkedList();
    }

    Object peek() {
        return linkedList.getLast();
    }

    Object pop() {
        Object obj = this.peek();
        linkedList = linkedList.removeLast();
        return obj;
    }

    void push(Object e) {
        linkedList = linkedList.addLast(e);
    }
}
