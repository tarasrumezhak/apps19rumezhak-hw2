package ua.edu.ucu.collections.immutable;

public final class ImmutableArrayList implements ImmutableList{
    private static final int INITIAL_SIZE = 1;
    private Object[] array;
    private int size;
    private int elements_count;

    ImmutableArrayList() {
        array = new Object[INITIAL_SIZE];
        size = INITIAL_SIZE;
        elements_count = 0;
    }

    ImmutableArrayList(Object[] elements) {
        array = new Object[elements.length];
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                break;
            }
            array[i] = elements[i];
            count++;
        }
        size = elements.length;
        elements_count = count;
    }

    private Object[] newSize() {
        Object[] temp;
        if (elements_count < size) {
            temp = new Object[size];
        }
        else {
            temp = new Object[size * 2];
        }
        return temp;
    }

    public ImmutableArrayList add(Object e) {
        return add(elements_count, e);
    }

    public ImmutableArrayList add(int index, Object e) {
        if (index < 0 || index > elements_count) {
            throw new IndexOutOfBoundsException();
        }
        Object[] temp = newSize();
        System.arraycopy(array, 0, temp, 0, index);
        temp[index] = e;
        System.arraycopy(array, index, temp, index + 1 , elements_count - index);
        return new ImmutableArrayList(temp);
    }

    private ImmutableArrayList addAll(Object[] c, boolean index_val, int index) {
        ImmutableArrayList list2 = new ImmutableArrayList(array);
        for (Object o : c) {
            if (index_val) {
                list2 = list2.add(index, o);
                index++;
            }
            else {
                list2 = list2.add(o);
            }
        }
        return list2;
    }

    public ImmutableArrayList addAll(Object[] c) {
        return this.addAll(c, false, 0);
    }

    public ImmutableArrayList addAll(int index, Object[] c) {
        return this.addAll(c, true, index);
    }

    public Object get(int index) {
        if (index < 0 || index > elements_count) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public ImmutableArrayList remove(int index) {
        if (index < 0 || index >= elements_count) {
            throw new IndexOutOfBoundsException();
        }
        Object[] temp = new Object[size];
        System.arraycopy(array, 0, temp, 0, index);
        System.arraycopy(array, index + 1, temp, index , elements_count - index - 1);
        return new ImmutableArrayList(temp);

    }

    public ImmutableArrayList set(int index, Object e) {
        if (index < 0 || index > elements_count) {
            throw new IndexOutOfBoundsException();
        }
        Object[] temp = new Object[size];
        System.arraycopy(array, 0, temp, 0, elements_count);
        temp[index] = e;
        return new ImmutableArrayList(temp);
    }

    public int indexOf(Object e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
//        return elements_count;
        return size;
    }

    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    public boolean isEmpty() {
        return elements_count < 1;
    }

    public Object[] toArray() {
        return array;
    }

    @Override
    public String toString() {
        if (elements_count == 0) {
            return "";
        }
        StringBuilder arrayText = new StringBuilder();
        for (Object i : array) {
            if (i == null) {
                break;
            }
            arrayText.append(i).append(", ");
        }
        return arrayText.toString().substring(0, arrayText.length() - 2);
    }

}
