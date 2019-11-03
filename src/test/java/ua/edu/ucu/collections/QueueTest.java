package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    private  Queue queue;
    @Before
    public void setUp() {
        queue = new Queue();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue(3);
        queue.enqueue(4.0);
    }
    
    @Test
    public void testPeek() {
        assertEquals(queue.peek(), "first");
    }

    @Test
    public void testDequeue() {
        assertEquals(queue.dequeue(), "first");
    }

    @Test
    public void testDequeue2() {
        queue.dequeue();
        queue.dequeue();
        assertEquals(queue.dequeue(), 3);
    }
}
