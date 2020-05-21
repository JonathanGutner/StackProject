package May18_StackProjects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class StackTest extends Assert {
    @Test
    @DisplayName("Size Test (linked)")
    void sizeTestLinked() {
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
    }

    @Test
    @DisplayName("Size Test (array)")
    void sizeTestArray() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
    }

    @Test
    @DisplayName("Is It A Stack (linked)")
    void isFifoLinked() {
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());

        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Is It A Stack (array)")
    void isFifoArray() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());

        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Second To Last Number")
    void secondToLastNumber() {

    }
}
