package com.cfa.datastructures.myLists.Interfaces;

public interface MyCollection {

    //Should return an int representing the size of the collection.
    int size();

    //Should return a boolean representing if the add was successful.
    boolean add(Object data);

    //Should return a boolean representing if the removal was successful.
    boolean remove(Object data);

    //Should return a boolean representing if the collection contains that object.
    boolean contains(Object data);

    //Should return a boolean representing if the collection is empty or not.
    boolean isEmpty();

    //Should clear the collection.
    void clear();

    //Should get the Object in the position of the requested index.
    Object get(int index);
}
