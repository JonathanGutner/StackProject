package May18_StackProjects;

public class LinkedStack<T> extends AbstractStack<T> {
    private static class Node<T> {
        T payload;
        Node<T> prev;
        Node<T> next;

        public Node(T payload, Node<T> prev, Node<T> next) {
            this.payload = payload;
            this.prev = prev;
            this.next = next;
        }

        public Node(T payload) {
            this.payload = payload;
            next = prev = this;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public LinkedStack() {
        size = 0;
        first = last = null;
    }

    @Override
    public void push(T x) {
        if (!isEmpty()) {
            Node<T> newLast = new Node<>(x, last, first);
            last.next = newLast;
            last = newLast;
            first.prev = last;
        } else {
            first = last = new Node<>(x);
        }
        size++;
    }

    @Override
    public T pop() {
        T ans = peek();
        if (size == 1) {
            first = last = null;
        } else {
            last = last.prev;
            last.next = first;
            first.prev = last;
        }
        size--;
        return ans;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return last.payload;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = last = null;
    }
}
