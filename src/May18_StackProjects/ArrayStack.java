package May18_StackProjects;

@SuppressWarnings("unchecked")
public class ArrayStack<T> extends AbstractStack<T> {
    private static final int MIN_SIZE = 4;

    private T[] buffer;

    public ArrayStack() {
        buffer = (T[]) new Object[MIN_SIZE];
        size = 0;
    }

    @Override
    public void push(T x) {
        if (size == buffer.length) {
            T[] buffer = (T[]) new Object[this.buffer.length * 2];
            System.arraycopy(this.buffer, 0, buffer, 0, size);
            this.buffer = buffer;
        }
        buffer[size] = x;
        size++;
    }

    @Override
    public T pop() {
        T result = peek();
        size--;
        if (size <= buffer.length / 4 && buffer.length > MIN_SIZE) {
            T[] buffer = (T[]) new Object[this.buffer.length / 2];
            System.arraycopy(this.buffer, 0, buffer, 0, size);
            this.buffer = buffer;
        }
        return result;
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return buffer[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        buffer = (T[]) new Object[MIN_SIZE];
        size = 0;
    }
}
