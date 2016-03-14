package com.dumer.linkedlist;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public class LinkedListTest {
    public static void main(String arg[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(6);
        singlyLinkedList.addAfter(4,3);
        singlyLinkedList.traverse();

    }
}
