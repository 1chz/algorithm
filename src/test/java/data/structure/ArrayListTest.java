package data.structure;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayListTest {

    private ArrayList<String> arrayList;

    @BeforeEach
    void setUp() {
        arrayList = new ArrayList<>();
        arrayList.add("shirohoo");
    }

    @Test
    void get() {
        Assertions.assertThat(arrayList.get(0)).isEqualTo("shirohoo");
    }

    @Test
    void size() {
        Assertions.assertThat(arrayList.size()).isEqualTo(1);
    }

    @Test
    void add_1() {
        arrayList.add("shirohoo2");
        Assertions.assertThat(arrayList.size()).isEqualTo(2);
    }

    @Test
    void add_2() {
        arrayList.add(0, "shirohoo2");
        arrayList.add(0, "shirohoo3");
        assertAll(
                () -> Assertions.assertThat(arrayList.size()).isEqualTo(3),
                () -> Assertions.assertThat(arrayList.get(0)).isEqualTo("shirohoo3"),
                () -> Assertions.assertThat(arrayList.get(1)).isEqualTo("shirohoo2"),
                () -> Assertions.assertThat(arrayList.get(2)).isEqualTo("shirohoo")
        );

    }

    @Test
    void remove() {
        arrayList.remove(0);
        Assertions.assertThat(arrayList.size()).isEqualTo(0);
    }

    @Test
    void testToString() {
        arrayList.add("shirohoo2");
        Assertions.assertThat(arrayList.toString()).isEqualTo("[ shirohoo, shirohoo2 ]");
    }
}
