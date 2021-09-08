package collection;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {
    private final List<E> list;

    private Stack() {
        this.list = new ArrayList<>();
    }

    public static <E> Stack<E> createStack() {
        return new Stack<>();
    }

    public void push(final E ele){
        list.add(ele);
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.remove(lastIndex());
    }

    public E top(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(lastIndex());
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    private int lastIndex() {
        return list.size() - 1;
    }
}
