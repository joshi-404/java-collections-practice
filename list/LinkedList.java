package com.collectionframework;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence(1);
        System.out.println(linkedList);
        linkedList.removeLastOccurrence(1);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("dog", "cat", "monkey", "lion", "elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("lion", "dog"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
