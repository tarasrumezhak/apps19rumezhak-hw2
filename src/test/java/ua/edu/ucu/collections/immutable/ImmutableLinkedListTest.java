package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private ImmutableLinkedList linkedList;
    private ImmutableLinkedList linkedEmpty;
    @Before
    public void setUp() {
       linkedList = new ImmutableLinkedList(new Object[] {"hello", 5, 'c'});
       linkedEmpty = new ImmutableLinkedList();
    }


    @Test
    public void testPrint() {
        assertEquals(linkedList.toString(), "hello, 5, c");
    }

    @Test
    public void testAdd() {
        ImmutableLinkedList newList = linkedList.add("Taras");
        assertEquals(newList.toString(), "hello, 5, c, Taras");
    }

    @Test
    public void testAddToEmpty() {
        ImmutableLinkedList newList = linkedEmpty.add("one");
        newList = newList.add("two");
        newList = newList.add("three");
        assertEquals(newList.toString(), "one, two, three");
    }

    @Test
    public void testAddAt() {
        ImmutableLinkedList newList = linkedList.add(1, "Second");
        System.out.println(newList);
        assertEquals(newList.toString(), "hello, Second, 5, c");
    }

    @Test
    public void testAddAtEmpty() {
        ImmutableLinkedList newList = linkedEmpty.add(0,"one");
        newList = newList.add(1,"two");
        newList = newList.add(2,"three");
        assertEquals(newList.toString(), "one, two, three");
    }

    @Test
    public void testAddAllTo() {
        ImmutableLinkedList list = linkedList.addAll(new Object[] {"UCU", 3, "Arman"});
        assertEquals(list.toString(), "hello, 5, c, UCU, 3, Arman");
    }

    @Test
    public void testAddAllEmpty() {
        ImmutableLinkedList empty = linkedEmpty.addAll(new Object[] {"UCU", 3, "Arman"});
        assertEquals(empty.toString(), "UCU, 3, Arman");
    }

    @Test
    public void testAddAllByIndex() {
        ImmutableLinkedList list = linkedList.addAll(2, new Object[] {"UCU", 3, "Arman"});
        assertEquals(list.toString(), "hello, 5, UCU, 3, Arman, c");
    }

    @Test
    public void testAddAllByIndexEmpty() {
        ImmutableLinkedList empty = linkedEmpty.addAll(0, new Object[] {"UCU", 3, "Arman"});
        assertEquals(empty.toString(), "UCU, 3, Arman");
    }

    @Test
    public void testGet() {
        assertEquals(linkedList.get(2), 'c');
    }

    @Test
    public void testRemove() {
        ImmutableLinkedList list = linkedList.remove(1);
        assertEquals(list.toString(), "hello, c");
    }

    @Test
    public void testSet() {
        ImmutableLinkedList list = linkedList.set(1, 8.9);
        assertEquals(list.toString(), "hello, 8.9, c");
    }

    @Test
    public void testIndexOf() {
        int index = linkedList.indexOf('c');
        assertEquals(index, 2);
    }

    @Test
    public void testSize() {
        int size = linkedList.size();
        assertEquals(size, 3);
    }

    @Test
    public void testSizeAfterAdding() {
        ImmutableLinkedList list =  linkedList.add(4);
        list = list.addAll(new Object[] {1,2,3,4});
        int size = list.size();
        assertEquals(size, 8);
    }

    @Test
    public void testSizeAfterAddingAndRemoving() {
        ImmutableLinkedList list =  linkedList.addAll(new Object[] {1,2,3,4});
        list = list.remove(1);
        list = list.remove(2);
        list = list.remove(3);
        int size = list.size();
        assertEquals(size, 4);
    }

    @Test
    public void testClear() {
        ImmutableLinkedList list = linkedList.clear();
        int size = list.size();
        assertEquals(size, 0);
    }

    @Test
    public void testIsEmpty() {
        boolean empty = linkedList.isEmpty();
        assertFalse(empty);
    }

    @Test
    public void testIsEmptyTrue() {
        boolean empty = linkedEmpty.isEmpty();
        assertTrue(empty);
    }

    @Test
    public void testToArray() {
        Object[] arr = linkedList.toArray();
        assertArrayEquals(arr, new Object[] {"hello", 5, 'c'});
    }

    @Test
    public void testAddFisrt() {
        ImmutableLinkedList newList = linkedList.addFirst("First");
        assertEquals(newList.toString(), "First, hello, 5, c");
    }

    @Test
    public void testAddLast() {
        ImmutableLinkedList newList = linkedList.addLast("Last");
        assertEquals(newList.toString(), "hello, 5, c, Last");
    }

    @Test
    public void testGetFirst() {
        assertEquals(linkedList.getFirst(), "hello");
    }

    @Test
    public void testGetLast() {
        assertEquals(linkedList.getLast(), 'c');
    }

    @Test
    public void testRemoveFirst() {
        ImmutableLinkedList list = linkedList.removeFirst();
        assertEquals(list.toString(), "5, c");
    }

    @Test
    public void testRemoveLast() {
        ImmutableLinkedList list = linkedList.removeLast();
        assertEquals(list.toString(), "hello, 5");
    }
}

