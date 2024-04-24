package com.cfa.datastructures.myLists.Interfaces;

public interface QueueI extends MyCollection {

    //Should return a boolean representing if the operation was successful; it should add an object to the Queue.
   boolean offer(Object data);

    //Should return the object at the head of the queue without removing it.
    Object peek();

    //Should return the object of the head of the queue, removing it.
    Object poll();
}
