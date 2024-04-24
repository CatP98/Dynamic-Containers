package com.cfa.datastructures.myLists;
import com.cfa.datastructures.myLists.Interfaces.ListI;
import com.cfa.datastructures.myLists.Interfaces.MyCollection;

/**
 * Represents a custom implementation of a list data structure.List is the best option
 * when you want to store elements in a specific order and be able to accept duplicate values.
 * This implementation provides methods to add, remove, and access elements in the list.
 */
public class MyList implements ListI {

    private Node head;
    private int length;

    public MyList() {
        this.head = null;
        this.length = 0;
    }

    /**
     * Get the size of the collection.
     *
     * @return length An int representing the size of the collection.
     */
    @Override
    public int size() {
        return length;
    }

    /**
     * Appends the specified element to the end of this linked list.
     *
     * @param data the element to be appended to this linked list
     * @return {@code true} if the element was successfully added
     */
    @Override
    public boolean add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        length++;
        return true;
    }

    /**
     * Removes the first occurrence of the specified element from this linked list,
     * if it is present. If the list does not contain the element, it remains unchanged.
     *
     * @param data the element to be removed from this linked list
     * @return {@code true} if the element was successfully removed, {@code false} otherwise
     */
    @Override
    public boolean remove(Object data) {
        if (head == null) {
            return false;

        } if ( head.getData().equals(data)){
            head = head.getNext();
            length--;
            return true;

        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                if (currentNode.getNext().getData().equals(data)) {
                    currentNode.setNext(currentNode.getNext().getNext());
                    length--;
                    return true;

                } else {
                    currentNode = currentNode.getNext();
                }
            }
            return false;
        }
    }

    /**
     * Check wether the collection contains an object
     *
     * @param data
     * @return true If contains, false if does't contain
     */
    @Override
    public boolean contains(Object data) {
        if (head == null) {
            return false;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                if (currentNode.getData().equals(data)) {
                    return true;
                }
                currentNode = currentNode.getNext();
            }
            return false;
        }
    }

    /**
     * Checks whether the collection is empty.
     *
     * @return {@code true} if the collection contains no elements, {@code false} otherwise.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Removes all elements from the collection, making it empty.
     */
    @Override
    public void clear() {
        head = null;
        length = 0;
    }

    /**
     * Retrieves the element at the specified index.
     *
     * @param index The position of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException If the index is out of bounds.
     */
    @Override
    public Object get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    //+++++++++++++++++++++++++++++++METHOD IS STILL WRONG+++++++++++++++++=++++=++++//

    /**
     * Returns the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element. More formally, returns the lowest
     * index {@code i} such that {@code Objects.equals(o, get(i))},
     * or -1 if there is no such index.
     *
     * @param data the element to search for
     * @return the index of the first occurrence of the specified element in this list,
     *         or -1 if this list does not contain the element
     */
    @Override
    public int indexOf(Object data) {
        if(head == null){
            return -1;
        }
        if(head.getData().equals(data)){
            return 0;
        }
        Node currentNode = head.getNext();
        int index = 1;
        while(currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    /**
     * Returns a new {@code MyList} containing elements from the specified {@code fromIndex}
     * (inclusive) to the specified {@code toIndex} (exclusive) in this list.
     * The returned list is backed by this list, so changes in the returned list are reflected
     * in this list, and vice-versa. The returned list supports all optional list operations
     * supported by this list.
     *
     * @param fromIndex the index of the first element to be included in the sublist (inclusive)
     * @param toIndex the index after the last element to be included in the sublist (exclusive)
     * @return a new {@code MyList} containing elements from the specified range of indexes
     * @throws IndexOutOfBoundsException if the specified indexes are out of range
     *         ({@code fromIndex < 0 || toIndex > size() || fromIndex > toIndex})
     */
    @Override
    public MyList sublist(int fromIndex, int toIndex) {
        if (head == null) {
            return null;
        }
        if(fromIndex > toIndex || toIndex < 0 || toIndex > length){
            throw new IndexOutOfBoundsException("Index out of bounds: " + fromIndex);
        }
        MyList sublist = new MyList();
        Node currentNode = head;
        for( int index = 0; index <= toIndex; index++){
            if(index >= fromIndex){
                sublist.add(currentNode);
            }
        }
        return sublist;
    }
}


