package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ImmutableArrayList arrayList = new ImmutableArrayList();
//        ImmutableArrayList list = arrayList.add('c');
//        list = list.add("Taras");
//        list = list.add(6.82);
//        System.out.println(list);
//        list = list.add(1, "UCU");
//        System.out.println(list);

//        ImmutableArrayList list = new ImmutableArrayList(new Object[] {"hello", 5, 'c'});
//        list = list.add(2, -7);
//        System.out.println(list);

//        ImmutableArrayList list = new ImmutableArrayList();
//        list = list.add(0, -7);
//        System.out.println(list);
//        list = list.add("hello");
//        System.out.println(list);

//        ImmutableArrayList list = new ImmutableArrayList(new Object[] {"hello", 5, 'c'});
//        list = list.addAll(new Object[] {1,2,3});
//        System.out.println(list);

//        ImmutableArrayList list1 = new ImmutableArrayList();
//        Object[] arr = {5, 3, 9};
//        for (Object i:arr) {
//            list1 = list1.add(i);
//        }
//        System.out.println(list1);

//        ImmutableArrayList list2 = new ImmutableArrayList(new Object[] {"hello", 5, 'c'});
//        Object[] arr2 = {5, 3, 9};
//        for (Object i:arr2) {
//            list2 = list2.add(i);
//        }
//        list2 = list2.addAll(3, new Object[] {"hi", -3.4, 9});
//        System.out.println(list2);
//        list2 = list2.remove(3);
//        System.out.println(list2);
//        list2 = list2.set(2, "Arman");
//        System.out.println(list2);
//
//        ImmutableLinkedList lst = new ImmutableLinkedList();
//        lst = lst.add("hello");
//        lst = lst.add(1);
//        lst = lst.add('c');
//        lst = lst.add(3);
//        lst = lst.add(2, "insert at 2");
//        System.out.println(lst);
//        lst = lst.addAll(2, new Object[] {"first", 3, -7.6});
//        System.out.println(lst);
//        lst = lst.addAll(new Object[] {"last1", 2, '3'});
//        System.out.println(lst);
//        Object el = lst.get(5);
//        System.out.println(el);
//        lst = lst.remove(3);
//        System.out.println(lst);
//        lst = lst.set(2, "changed");
//        System.out.println(lst);
//        System.out.println(lst.indexOf('c'));
//        Object[] arr = lst.toArray();
//        System.out.println(Arrays.toString(arr));
//        lst = lst.addFirst("First");
//        lst = lst.add("Last");
//        System.out.println(lst);
//        el = lst.getFirst();
//        System.out.println(el);
//        lst = lst.removeLast();
//        System.out.println(lst);
//        lst = lst.remove(0);
//        System.out.println(lst);
//        lst = lst.removeFirst();
//        System.out.println(lst);
        ImmutableLinkedList lst = new ImmutableLinkedList(new Object[] {"hello", 5, 'c'});
        System.out.println(lst);
        lst = lst.add("added1");
        System.out.println(lst);
        lst = lst.addAll(new Object[] {"UCU", 3, "Arman"});
        System.out.println(lst);
        lst = lst.remove(3);
        System.out.println(lst);
        lst = lst.add("end");
        System.out.println(lst);
        lst = lst.addFirst("first");
        System.out.println(lst);
        System.out.println(lst.size());
        lst = lst.add("last");
        System.out.println(lst);
    }
}
