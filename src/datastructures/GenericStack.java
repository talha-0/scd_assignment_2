package datastructures;

import java.util.ArrayList;

public class GenericStack<T>{
    private ArrayList<T> list = new ArrayList<T>();

    public int getSize(){
        return list.size();
    }
    public T pop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack");
        }
        T o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(T o){
        list.add(o);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
}

