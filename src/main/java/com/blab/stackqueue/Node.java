package com.blab.stackqueue;
// Node class to represent node
public class Node<E> {

    // next node address
    Node<E> next;
    // node data
    E data;

    // constructor to initialize
    Node(E data)
    {
        this.data = data;
        this.next = null;
    }
}
