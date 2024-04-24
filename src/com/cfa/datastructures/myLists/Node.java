package com.cfa.datastructures.myLists;

public class Node {

    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
        next = null;
    }

    public Object getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(Object data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
