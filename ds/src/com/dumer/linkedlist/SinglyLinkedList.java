package com.dumer.linkedlist;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public class SinglyLinkedList<E> implements LinkedList<E>{
    private Node<E> head;
    private Node<E> tail;

    public SinglyLinkedList() {}

    @Override
    public E add(E element) {
        Node<E> newNode = new Node<>();
        newNode.setData(element);
        System.out.println("Added " + element);
        //if linked list is empty
        if(head == null){
            //since there is only one element
            //both head and tail points to the same
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            //set tail as newly created node
            tail = newNode;
        }
        return tail.getData();
    }

    @Override
    public E addAfter(E element,E after) {
        Node<E> tmp = head;
        Node<E> refNode = null;
        System.out.println("Traversing to all nodes in addAfter");
        //1. traverse till given element
        while (true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNext();
        }
        if(refNode != null){
          //2.add element after the target node
            Node<E> newNode = new Node<>();
            newNode.setData(element);
            newNode.setNext(tmp.getNext());
            if(tmp == tail){
                tail = newNode;
            }
            tmp.setNext(newNode);
        }else{
            System.out.println("Unable to find the given element");
        }
        return element;
    }

    @Override
    public E deleteFront(E element) {
        Node<E> tmp = head;
        head = tmp.getNext();
        if(head == null){
            tail = null;
        }
        System.out.println("Deleted value"+ tmp.getData());
        return tmp.getData();
    }

    @Override
    public E deleteAfter(E after) {
        Node<E> tmp = head;
        Node<E> refNode = null;
        System.out.println("Traversing to all nodes in delete after");
        while (true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, delete after this node
                refNode = tmp;
                break;
            }
        }
        if(refNode != null){
            tmp = refNode.getNext();
            refNode.setNext(tmp.getNext());
            if(refNode.getNext() == null){
                tail = refNode;
            }
            System.out.println("Deleted: " + tmp.getData());
        }else{
            System.out.println("Unable to find the given element");
        }
        return tmp.getData();
    }

    @Override
    public void traverse() {
        Node<E> tmp = head;
        System.out.println("Complete traversal: ");
        while (true){
            if(tmp == null){
                break;
            }
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }
}
