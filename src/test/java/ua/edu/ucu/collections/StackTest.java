package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    private  Stack stack;
    @Before
    public void setUp() {
        stack = new Stack();
        stack.push("first");
        stack.push("second");
        stack.push(3);
        stack.push(4.0);
    }

    @Test
    public void testPeek() {
        assertEquals(stack.peek(), 4.0);
    }

    @Test
    public void testPop() {
        assertEquals(stack.pop(), 4.0);
    }

    @Test
    public void testPop2() {
        stack.pop();
        stack.pop();
        assertEquals(stack.peek(), "second");
    }
}
