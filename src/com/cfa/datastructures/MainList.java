package com.cfa.datastructures;
import com.cfa.datastructures.myLists.MyList;

public class MainList {
    public static void main(String[] args) {

        //Main for the linked list

        MyList myLinkedList = new MyList();

        //Create objects fro the collection
        Object banana = new Object();
        Object orange = new Object();
        Object apple = new Object();
        Object pear = new Object();
        Object music = new Object();

        //Add elements to the list
        myLinkedList.add(banana);
        myLinkedList.add(orange);
        myLinkedList.add(apple);
        myLinkedList.add(pear);

        //Print all element's references from the collection, with get method
        for(int i = 0; i < myLinkedList.size(); i++){
            Object data = myLinkedList.get(i);
            System.out.println(data);
        }
        //Check the size
        System.out.println("The size of myLinkedlist is: " + myLinkedList.size());

        // Remove an element from the list
        System.out.println("Removing 'Banana'");
        myLinkedList.remove(banana);
        System.out.println("The size of myLinkedlist is: " + myLinkedList.size());

        // Check if the list contains "Banana" and "Orange" and "Music"
        System.out.println("Contains Banana: " + myLinkedList.contains(banana));
        System.out.println("Contains orange: " + myLinkedList.contains(orange));
        System.out.println("Contains music: " + myLinkedList.contains(music));

        //Check which one is the index of "Banana" and "Pear".
        System.out.println("Banana is in index: " + myLinkedList.indexOf(banana));
        System.out.println("Pear is in index: " + myLinkedList.indexOf(pear));

        //Creating two other Lists from the range of indexes 2 - 5 (which should throw exception and 1 - 3
        //System.out.println(myLinkedList.sublist(2,5));
        System.out.println(myLinkedList.sublist(1,3));
        //System.out.println(myLinkedList.sublist(2,1));
        System.out.println(myLinkedList.sublist(2,2));

        //Check if list is empty
        System.out.println("MyList is empty: " + myLinkedList.isEmpty());

        //Remove all items from the list
        myLinkedList.clear();
        System.out.println("MyList is empty after clearing: " + myLinkedList.isEmpty());

    }
}