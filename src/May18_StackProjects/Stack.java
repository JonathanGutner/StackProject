package May18_StackProjects;

public interface Stack<T> {
    void push(T x);

    T pop();

    T peek();

    int size();

    void clear();

    boolean isEmpty();
}
