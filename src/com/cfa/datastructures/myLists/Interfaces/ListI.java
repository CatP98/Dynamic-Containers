package com.cfa.datastructures.myLists.Interfaces;

import com.cfa.datastructures.myLists.MyList;

public interface ListI extends MyCollection {

    //Should return an object of the list when given an int index.
    Object get(int index);

    //Should return the index of a given object.
    int indexOf(Object data);

    //Should return a new list given the indexes: int fromIndex, int toIndex.
    MyList sublist(int fromIndex, int toIndex);
}
