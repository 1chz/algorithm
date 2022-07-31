package io.github.shirohoo.datastructure;

import io.github.shirohoo.datastructure.Queue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("큐")
class QueueTest {

    private Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @Test
    void enqueue() throws Exception {
        queue.enqueue(1);
        Assertions.assertThat(queue.size()).isEqualTo(1);

        queue.enqueue(2);
        Assertions.assertThat(queue.size()).isEqualTo(2);

        queue.enqueue(3);
        Assertions.assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    void dequeue() throws Exception {
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(3);
        Assertions.assertThat(queue.dequeue()).isEqualTo(10);
        Assertions.assertThat(queue.dequeue()).isEqualTo(2);
        Assertions.assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    void isEmpty() throws Exception {
        Assertions.assertThat(queue.isEmpty()).isTrue();

        queue.enqueue(1);
        Assertions.assertThat(queue.isEmpty()).isFalse();
    }
}
