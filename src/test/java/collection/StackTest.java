package collection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = Stack.createStack();
    }

    @Test
    void push() throws Exception{
        Assertions.assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        Assertions.assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    void pop() throws Exception{
        stack.push(1);
        Assertions.assertThat(stack.pop()).isEqualTo(1);
        Assertions.assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    void top() throws Exception{
        stack.push(1);
        Assertions.assertThat(stack.top()).isEqualTo(1);
        Assertions.assertThat(stack.isEmpty()).isFalse();
    }
}