package com.dumer.stack;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public interface Stack<E> {
     Stack<E> push(E element);
     E pop();
     E peek();

}
