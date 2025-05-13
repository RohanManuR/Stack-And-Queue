package com.blab.stackqueue;

public class Queue <E>{

    // Linked list object created to perform Queue operation
    LinkedList<E> list = new LinkedList();
    public boolean enqueu(E data)
    {
        // calling append method from linked list to add element at last
        return list.append(data);
    }

    // Overridden to toString() to display elements from front side
    public String toString()
    {
        // calling toString() from linkedList to display nodes
        return list.toString();
    }

}
