package io.github.shirohoo.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("동적 할당 배열")
class ArrayListTest {
    ArrayList<String> arrayList;

    @BeforeEach
    void setUp() {
        arrayList = new ArrayList<>();
        arrayList.add("shirohoo");
    }

    @Test
    void get() {
        assertThat(arrayList.get(0)).isEqualTo("shirohoo");
    }

    @Test
    void size() {
        assertThat(arrayList.size()).isEqualTo(1);
    }

    @Test
    void add_1() {
        arrayList.add("shirohoo2");
        assertThat(arrayList.size()).isEqualTo(2);
    }

    @Test
    void add_2() {
        arrayList.add(0, "shirohoo2");
        arrayList.add(0, "shirohoo3");
        assertAll(
                () -> assertThat(arrayList.size()).isEqualTo(3),
                () -> assertThat(arrayList.get(0)).isEqualTo("shirohoo3"),
                () -> assertThat(arrayList.get(1)).isEqualTo("shirohoo2"),
                () -> assertThat(arrayList.get(2)).isEqualTo("shirohoo")
        );

    }

    @Test
    void remove() {
        arrayList.remove(0);
        assertThat(arrayList.size()).isEqualTo(0);
    }

    @Test
    void testToString() {
        arrayList.add("shirohoo2");
        assertThat(arrayList.toString()).isEqualTo("[ shirohoo, shirohoo2 ]");
    }
}
