package com.blab.stackqueue;

public class Queue <E>{

    // Linked list object created to perform Queue operation
    LinkedList<E> list = new LinkedList();
    // method to enqueu the element to Queue
    public boolean enqueu(E data)
    {
        // calling append method from linked list to add element at last
        return list.append(data);
    }

    // method to dequeue the element from queue(remove element from front side)
    public E dequeue()
    {
        // calling delete method from linked list to remove the front element
        return list.delete();
    }

    // Overridden to toString() to display elements from front side
    public String toString()
    {
        // calling toString() from linkedList to display nodes
        return list.toString();
    }

}
