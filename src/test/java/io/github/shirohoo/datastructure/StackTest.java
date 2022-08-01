package io.github.shirohoo.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("스택")
class StackTest {
    Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = Stack.createStack();
    }

    @Test
    void push() throws Exception {
        assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    void pop() throws Exception {
        stack.push(1);
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    void top() throws Exception {
        stack.push(1);
        assertThat(stack.top()).isEqualTo(1);
        assertThat(stack.isEmpty()).isFalse();
    }
}