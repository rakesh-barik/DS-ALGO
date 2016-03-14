package com.dumer.stack;

import java.util.NoSuchElementException;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public class StackLinkedList<E> implements Stack<E> {

    Node first;
    private int total;

    public StackLinkedList() {
    }

    private class Node{
        E data;
        Node next;
    }
    @Override
    public StackLinkedList push(E element) {
        first = new Node();
        Node current = first;
        first.data = element;
        first.next = current;
        total++;
        return this;
    }

    @Override
    public E pop() {
        if(total == 0) throw new NoSuchElementException();
        E element = first.data;
        first = first.next;
        total--;
        return element;
    }

    @Override
    public E peek() {
        E element = first.data;
        return element;
    }

    @Override
    public String toString() {
        Node tmp = first;
        StringBuilder output = new StringBuilder();
        for(int i = 0; i< total;i++){
            output.append(first.data.toString() + ",");
            first = tmp.next;
        }
        return output.toString();
    }
}
