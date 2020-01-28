package com.company;

//https://codereview.stackexchange.com/questions/207657/josephus-problem-with-cyclic-iterator
//http://gewton.nfshost.com/java-circular-iterator/

import java.util.Iterator;
import java.util.List;


class CircularList implements Iterator {

    private final List list;
    private Iterator iterator;


    public CircularList(List list) {
        this.list = list;
        initIterator(list);
    }

    private void initIterator(List list) {
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty();
    }

    //When it reaches the end the point gets reset to make it work circularly
    @Override
    public Object next() {
        if (!this.iterator.hasNext())
            initIterator(list);
        return this.iterator.next();
    }

    @Override
    public void remove() {
        this.iterator.remove();
    }
}
