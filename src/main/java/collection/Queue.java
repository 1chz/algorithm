package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> {

    private List<T> queue;

    public Queue() {
        this.queue = new ArrayList<>();
    }

    public void enqueue(final T ele) {
        queue.add(ele);
    }

    public T dequeue() {
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
