package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private ImmutableArrayList arrayList;
    private ImmutableArrayList arrayEmpty;
    @Before
    public void setUp() throws Exception {
        arrayList = new ImmutableArrayList(new Object[] {"hello", 5, 'c'});
        arrayEmpty = new ImmutableArrayList();

    }
    
    @Test
    public void testSomeMethod() {
    }

    @Test
    public void testToString() {
        ImmutableArrayList arrayList = new ImmutableArrayList(new Object[] {"hello", 5});
        assertEquals(arrayList.toString(), "hello, 5");
    }

    @Test
    public void testAddWithExisting() {
        ImmutableArrayList arrayList = new ImmutableArrayList(new Object[] {"hello", 5});
        ImmutableArrayList list = arrayList.add('c');
        assertEquals(list.toString(), "hello, 5, c");
    }

    @Test
    public void testAddToEmpty() {
        ImmutableArrayList arrayList = new ImmutableArrayList();
        ImmutableArrayList list = arrayList.add('c');
        ImmutableArrayList list2 = list.add("Taras");
        ImmutableArrayList list3 = list2.add(6.82);
        assertEquals(list3.toString(), "c, Taras, 6.82");
    }

    @Test
    public void testAddAtIndex() {
        ImmutableArrayList list = arrayList.add(2, "Java");
        assertEquals(list.toString(), "hello, 5, Java, c");
    }

    @Test
    public void testAddAtIndexEmpty() {
        ImmutableArrayList empty = arrayEmpty.add(0, 5);
        assertEquals(empty.toString(), "5");
    }

    @Test
    public void testAddAllEmpty() {
        ImmutableArrayList empty = arrayEmpty.addAll(new Object[] {"UCU", 3, "Arman"});
        assertEquals(empty.toString(), "UCU, 3, Arman");
    }

    @Test
    public void testAddAllTo() {
        ImmutableArrayList list = arrayList.addAll(new Object[] {"UCU", 3, "Arman"});
        assertEquals(list.toString(), "hello, 5, c, UCU, 3, Arman");
    }

    @Test
    public void testAddAllByIndex() {
        ImmutableArrayList list = arrayList.addAll(2, new Object[] {"UCU", 3, "Arman"});
        assertEquals(list.toString(), "hello, 5, UCU, 3, Arman, c");
    }

    @Test
    public void testGet() {
        Object element = arrayList.get(1);
        assertEquals(element, 5);
    }

    @Test
    public void testRemove() {
        ImmutableArrayList list = arrayList.remove(1);
        assertEquals(list.toString(), "hello, c");
    }

    @Test
    public void testSet() {
        ImmutableArrayList list = arrayList.set(1, 8.9);
        assertEquals(list.toString(), "hello, 8.9, c");
    }

    @Test
    public void testIndexOf() {
        int index = arrayList.indexOf('c');
        assertEquals(index, 2);
    }

    @Test
    public void testSize() {
        int size = arrayList.size();
        assertEquals(size, 3);
    }

    @Test
    public void testSizeAfterAdding() {
        ImmutableArrayList list = arrayList.add(4);
        int size = list.size();
        assertEquals(size, 6);
    }

    @Test
    public void testClear() {
        ImmutableArrayList list = arrayList.clear();
        int size = list.size();
        assertEquals(size, 1);
    }

    @Test
    public void testIsEmpty() {
        boolean empty = arrayList.isEmpty();
        assertFalse(empty);
    }

    @Test
    public void testIsEmptyTrue() {
        ImmutableArrayList list = new ImmutableArrayList();
        boolean empty = list.isEmpty();
        assertTrue(empty);
    }

    @Test
    public void testToArray() {
        Object[] arr = arrayList.toArray();
        assertArrayEquals(arr, new Object[] {"hello", 5, 'c'});
    }

}
