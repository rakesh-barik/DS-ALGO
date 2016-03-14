package com.dumer.linkedlist;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public class Node<E> implements Comparable<E> {
    E data;
    Node next;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public int compareTo(E arg) {
        if(arg == this.data){
            return 0;
        }else {
            return 1;
        }
    }
}