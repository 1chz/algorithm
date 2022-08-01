package io.github.shirohoo.datastructure;

import java.util.Arrays;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private E[] arrayList;

    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        this.size = 0;
        this.arrayList = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        this.size = 0;
        this.arrayList = (E[]) new Object[capacity];
    }

    public E get(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        return arrayList[index];
    }

    public int size() {
        return this.size;
    }

    public void add(E e) {
        if (size == arrayList.length) {
            this.arrayList = Arrays.copyOf(arrayList, arrayList.length + DEFAULT_CAPACITY);
        }
        this.arrayList[size++] = e;
    }

    public void add(int index, final E e) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        if (size == arrayList.length) {
            this.arrayList = Arrays.copyOf(arrayList, arrayList.length + DEFAULT_CAPACITY);
        }
        for (int i = size - 1; i >= index; i--) {
            this.arrayList[i + 1] = arrayList[i];
        }
        this.arrayList[index] = e;
        size++;
    }

    public void remove(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        for (int i = index + 1; i < size; i++) {
            this.arrayList[i - 1] = arrayList[i];
        }
        this.arrayList[size--] = null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < this.size; i++) {
            if (i == this.size - 1) {
                sb.append(this.arrayList[i].toString()).append(" ");
                break;
            }
            sb.append(this.arrayList[i].toString()).append(", ");
        }
        return sb.append("]")
                .toString();
    }
}
