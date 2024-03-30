package org.example;

/*
    Вариант 1
 */
public class Node<E> {
    public E value;
    public Node<E> next;

    Node(E value){
        this.value = value;
        next = null;
    }
}
