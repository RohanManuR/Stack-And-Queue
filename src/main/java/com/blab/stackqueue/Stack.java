package com.blab.stackqueue;
// created Stack class to perform Stack operation(FILO)
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

    // method to access first element from stack
    public E peek()
    {
        // calling access method from linked list to fetch first element
        return list.access();
    }

    // method to access and remove the first element from stack
    public E pop()
    {
        // calling delete method to display and delete first element
        return list.delete();
    }

    // Overridden toString() to display stack elements
    public String toString()
    {
        // calling toString() from linkedList to display nodes
        return list.toString();
    }


}
