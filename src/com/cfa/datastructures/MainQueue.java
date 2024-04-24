package com.cfa.datastructures;

import com.cfa.datastructures.myLists.MyQueue;

public class MainQueue {
    public static void main(String[] args) {

        //Main for the linked list

        MyQueue myLinkedList = new MyQueue();

        //Create objects from the collection
        Object banana = new Object();
        Object orange = new Object();
        Object apple = new Object();
        Object pear = new Object();
        Object music = new Object();

        //Add elements to the list
        myLinkedList.offer(banana);
        myLinkedList.offer(orange);
        myLinkedList.offer(apple);
        myLinkedList.offer(pear);

        //
        System.out.println("Music object was added to the list: " + myLinkedList.offer(music));

        //
        System.out.println("The first element from the queue is : " + myLinkedList.peek());

        //
        System.out.println("The element to be removed from the queue is :" + myLinkedList.poll());

        //
        System.out.println("The size of the queue is :" + myLinkedList.size());

        //
        System.out.println("Adding music to the Queue :" + myLinkedList.add(music));

        //
        System.out.println("Removing music to the queue : " + myLinkedList.remove(music));

        //
        System.out.println("Does lalala belong to this list? " + myLinkedList.contains("lalala"));
        System.out.println("Does music belong to this list? " + myLinkedList.contains(music));
        System.out.println("Does pear belong to this list? " + myLinkedList.contains(pear));
        System.out.println("Does 5 belong to this list? " + myLinkedList.contains(5));

        //
        System.out.println("Is the Queue empty? " + myLinkedList.isEmpty());

        //
        myLinkedList.clear();
        System.out.println("Clearing list...");
        System.out.println("Is the Queue empty, after removing all elements? " + myLinkedList.isEmpty());
        System.out.println("Does lalala belong to this list? " + myLinkedList.contains("lalala"));
        System.out.println("Does music belong to this list? " + myLinkedList.contains(music));
        System.out.println("Does pear belong to this list? " + myLinkedList.contains(pear));
        System.out.println("Does 5 belong to this list? " + myLinkedList.contains(5));
        System.out.println("The size of the queue is :" + myLinkedList.size());
        System.out.println("The first element from the queue is : " +myLinkedList.peek());
        System.out.println("The element to be removed from the queue is :" + myLinkedList.poll());
        System.out.println("Music object was added to the list: " + myLinkedList.offer(music));

        myLinkedList.offer(banana);
        myLinkedList.offer(orange);
        myLinkedList.offer(apple);
        myLinkedList.offer(pear);

        for(int i = 0; i < myLinkedList.size(); i++){
            System.out.println(myLinkedList.peek());
            System.out.println(myLinkedList.get(i));
        }
    }

}
