package com.cfa.datastructures.myLists;
import com.cfa.datastructures.myLists.Interfaces.QueueI;

/**
 * An implementation of the Queue data structure using a linked list.
 */

public class MyQueue implements QueueI {

    private Node head;
    private Node tail;
    private int length;


    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * Adds the specified element to the end of this queue.
     * It's always possible to add a new element.
     * @param data the element to be added to the queue
     * @return true if the element was successfully added to this queue, false otherwise
     */
    @Override
    public boolean offer(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        length++;
        return true;
    }

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return the head of this queue, or null if this queue is empty
     */
    @Override
    public Object peek() {
        if (head == null){
            return null;
        } else{
            return head.getData();
        }
    }

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head of this queue, or null if this queue is empty
     */
    @Override
    public Object poll() {
        if(head == null){
            return null;

        } else {
            Node removedNode = head.getNext();
            head = head.getNext();
            length--;

            if(head.getNext() == null){
                tail = null;
            }
            return removedNode.getData();
        }
    }

    /**
     * Returns the number of elements in this queue.
     *
     * @return the number of elements in this queue
     */
    @Override
    public int size() {
        if (head == null) {
            return 0;
        }
        return length;
    }

    /**
     * Adds the specified element to the end of this queue.
     *
     * @param data the element to be added to the queue
     * @return true if the element was successfully added to this queue, false otherwise
     */
    @Override
    public boolean add(Object data) {
        return offer(data);
    }

    /**
     * Removes the specified element from this queue, if it is present.
     *
     * @param data the element to be removed from this queue, if present
     * @return true if the element was removed from this queue, false otherwise
     */
    @Override
    public boolean remove(Object data) {
        return poll() != null;
    }

    /**
     * Returns true if this queue contains the specified element.
     *
     * @param data element whose presence in this queue is to be tested
     * @return true if this queue contains the specified element, false otherwise
     */
    @Override
    public boolean contains(Object data) {
        if (head == null) {
            return false;
        }
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return true;

            } else {
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    /**
     * Returns true if this queue contains no elements.
     *
     * @return true if this queue contains no elements, false otherwise
     */
    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }


    /**
     * Removes all of the elements from this queue.
     */
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * Returns the element at the specified position in this queue.
     * This method is not typically supported by queues and will always return null.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this queue, or null if the index is out of range
     */
    @Override
    public Object get(int index) {
        if (head == null) {
            return null;
        } else if (index == 0)  {
            return tail.getData();
        } else if (index == length - 1) {
            return head.getData();
        } else {
            return null;
        }
    }
}
