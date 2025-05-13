package com.blab.stackqueue;

// linked list class generic type
public class LinkedList<E> {

    // head node to start linked list
    Node<E> head;
    // method to add element to node from head
    public boolean add(E data)
    {
        // node object created
        Node node = new Node(data);
        // temp node pointing to head
        Node temp = head;
        this.head = node;
        node.next = temp;
        return true;
    }

    // Overridden toString() to display node elements
    public String toString()
    {
        // checking head is empty or not
        if(head==null)
            return "";
        // display node data's by using loop traversing
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
        return "";
    }

    // method to fetch first element
    public E access()
    {
        // checking head is empty or not
        if(head == null){
            throw new RuntimeException("Stack is empty.");
        }
        return head.data;
    }

    // method to fetch and remove the top element
    public E delete()
    {
        // creating temp node pointing to head
        Node<E> temp = head;
        // checking head is empty or not
        if(head == null){
            throw new RuntimeException("Stack is empty.");
        }
        head = head.next;
        return temp.data;
    }

    // method to add element to node from tail
    public boolean append(E data)
    {
        // node object created
        Node node = new Node(data);
        // checking head is empty or not
        if(head==null) {
            head = node;
        }
        else{
            // pointing temp to head and traversing to access last node
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return true;
    }


}
