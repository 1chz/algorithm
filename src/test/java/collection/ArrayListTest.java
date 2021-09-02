package collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayListTest {
    private ArrayList arrayList;

    @BeforeEach
    void setUp() {
        arrayList = ArrayList.create();
    }

    @Test
    void print() throws Exception {
        arrayList.printHash();
    }
}