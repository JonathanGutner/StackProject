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
    @DisplayName("Second To Last Number (array)")
    void secondToLastNumberArray() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();

        assertEquals(1, (int) stack.peek());
    }

    @Test
    @DisplayName("Second To Last Number (linked)")
    void secondToLastNumberLinked() {
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();

        assertEquals(1, (int) stack.peek());
    }

    @Test
    @DisplayName("Does Clear Turn The Stack To Null (array)")
    void clearStackArray() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.clear();

        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Does Clear Turn The Stack To Null (linked)")
    void clearStackLinked() {
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.clear();

        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Size Of Stack (array)")
    void sizeOfStackArray() {
        Stack<Integer> stack = new ArrayStack<>();
        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        stack.pop();
        assertEquals(2, stack.size());
        stack.push(3);
        stack.pop();
        stack.pop();

        assertEquals(1, stack.size());
    }

    @Test
    @DisplayName("Size Of Stack (linked)")
    void sizeOfStackLinked() {
        Stack<Integer> stack = new LinkedStack<>();
        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        stack.pop();
        assertEquals(2, stack.size());
        stack.push(3);
        stack.pop();
        stack.pop();

        assertEquals(1, stack.size());
    }

    @Test
    @DisplayName("Do Linked Stack And Array Stack Match")
    void doBothStacksMatch() {
        Stack<Integer> arrayStack = new LinkedStack<>();
        Stack<Integer> linkedStack = new LinkedStack<>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        assertEquals(linkedStack.size(), arrayStack.size());
        arrayStack.clear();
        linkedStack.clear();
        assertEquals(linkedStack.size(), arrayStack.size());
    }
}
