package May18_StackProjects;

public abstract class AbstractStack<T> implements Stack<T> {
    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
