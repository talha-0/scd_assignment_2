package datastructures;

public class GenericStack<T>{
    private Node<T> head=null;
    private Node<T> tail=null;
    private int size=0;

    public T pop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack");
        }
        T data = tail.data;
        if (size>1) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            head = null;
            tail = null;
        }
        size--;
        return data;
    }

    public void push(T o){
        if (size==0)
            tail = head = new Node<T>(o);
        else {
            Node<T> node = new Node<T>(o);
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void print(){
        for (Node<T> node = head; node != null; node = node.next)
            System.out.print(node.data + "->");
        System.out.println();
    }
}

