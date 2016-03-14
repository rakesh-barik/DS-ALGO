package com.dumer.linkedlist;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public interface LinkedList<E> {
    E add(E element);
    E addAfter(E element, E after);
    E deleteFront(E element);
    E deleteAfter(E element);
    void traverse();
}
