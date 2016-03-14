package com.dumer.stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by rakesh.barik on 27-02-2016.
 */
public class StackArray<E> implements Stack<E>{

    //java.util.Stack
    private E[] elementArray;
    private int total;

    public StackArray() {
        elementArray =  (E[]) new Object[2];
    }

    private void resize(int capacity) {
        E[] tmp = (E[]) new Object[capacity];
        System.arraycopy(elementArray,0,tmp,0,total);
        elementArray = tmp;
    }


    @Override
    public StackArray push(E element) {
        if(elementArray.length == total) resize(elementArray.length * 2);
        elementArray[total++] = element;
        return this;
    }

    @Override
    public E pop() {
        if(total == 0) throw new NoSuchElementException();
        E popElement = elementArray[--total];
        elementArray[total] = null;
        if (total > 0 && total == elementArray.length / 4) resize(elementArray.length / 2);
        return popElement;
    }

    @Override
    public E peek() {
        return elementArray[total-1];
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "elementArray=" + Arrays.toString(elementArray) +
                ", total=" + total +
                '}';
    }
}
