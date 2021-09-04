package collection;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] arrayList;

    private int size;

    public ArrayList() {
        this.size = 0;
        this.arrayList = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(final int capacity) {
        this.size = 0;
        this.arrayList = (E[]) new Object[capacity];
    }

    public E get(final int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        return arrayList[index];
    }

    public int size() {
        return this.size;
    }

    public void add(final E e) {
        if (size == arrayList.length) {
            this.arrayList = Arrays.copyOf(arrayList, arrayList.length + DEFAULT_CAPACITY);
        }
        this.arrayList[size++] = e;
    }

    public void add(final int index, final E e) {
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

    public void remove(final int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        for (int i = index + 1; i < size; i++) {
            this.arrayList[i - 1] = arrayList[i];
        }
        Objects.isNull(this.arrayList[size--]);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < this.size; i++) {
            if (i == this.size - 1) {
                sb.append(this.arrayList[i].toString() + " ");
                break;
            }
            sb.append(this.arrayList[i].toString() + ", ");
        }
        return sb.append("]")
                .toString();
    }

}
