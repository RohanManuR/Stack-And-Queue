package com.blab.stackqueue;

public class Stack<E> {

    // Linked list object creation
    LinkedList<E> list = new LinkedList();
    // method to push the element to stack
    public boolean push(E data)
    {
        // node object created
        Node node = new Node(data);
        // adding data to linked list node
        return list.add(data);
    }

    // Overridden toString() to display stack elements
    public String toString()
    {
        // calling toString() from linkedList to display nodes
        return list.toString();
    }


}
