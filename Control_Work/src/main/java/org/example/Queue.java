package org.example;

import java.util.NoSuchElementException;

public class Queue<E> {
    private Node<E> head;
    public int size;

    public Queue(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean add(E value){
        if(value == null){
            throw new NullPointerException();
        }
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
        return true;
    }

    public void remove(){
        if(isEmpty()){
            throw new NoSuchElementException("This Queue is Empty");
        }
        head = head.next;
        size--;
    }

    public E peek(){
        return (isEmpty()) ? null : head.value;
    }

    public E poll(){
        if(isEmpty()){
            throw new NoSuchElementException("This Queue is Empty");
        }
        E val = head.value;
        head = head.next;
        size--;

        return val;
    }
}

