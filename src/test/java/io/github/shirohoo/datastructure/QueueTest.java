package io.github.shirohoo.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("큐")
class QueueTest {
    Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @Test
    void enqueue() throws Exception {
        queue.enqueue(1);
        assertThat(queue.size()).isEqualTo(1);

        queue.enqueue(2);
        assertThat(queue.size()).isEqualTo(2);

        queue.enqueue(3);
        assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    void dequeue() throws Exception {
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(3);
        assertThat(queue.dequeue()).isEqualTo(10);
        assertThat(queue.dequeue()).isEqualTo(2);
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    void isEmpty() throws Exception {
        assertThat(queue.isEmpty()).isTrue();
        queue.enqueue(1);
        assertThat(queue.isEmpty()).isFalse();
    }
}
