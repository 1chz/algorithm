package io.github.shirohoo.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<E> {

    private List<E> queue;

    public Queue() {
        this.queue = new ArrayList<>();
    }

    public void enqueue(final E ele) {
        queue.add(ele);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
