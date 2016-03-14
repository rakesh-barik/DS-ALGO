package com.dumer.list;

import java.util.NoSuchElementException;

/**
 * Created by rakesh.barik on 03-03-2016.
 */
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 2;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        //
        if(size == DEFAULT_CAPACITY) resizeMyList(size * 2);
        element[size++] = e;

    }

    public void remove(E e){
        if(size == 0) throw new NoSuchElementException();


    }

    private void resizeMyList(int capacity) {
        E[] tmp = (E[])new Object[capacity];
        System.arraycopy(element,0,tmp,0,capacity);
        element = tmp;
    }
}
