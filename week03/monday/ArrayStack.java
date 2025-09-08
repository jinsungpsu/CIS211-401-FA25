public class ArrayStack<T> implements Stack<T> {
    // this one stores stuff in an array
    // we want index 0 to be at the bottom of the stack

    // default size is important
    // b/c arrays are immutable/cannot change in size
    private final int DEFAULT_SIZE = 10;

    // how many items are in my stack
    // DIFFERENT than length of my array
    // bc length of array is constant
    private int numItems;

    // this defines a ref var
    // however, there is NO array at this point...
    private T[] stackContents;

    // no arg constructor
    // meaning - no initial data related to creating
    // this object
    public ArrayStack() {
        // this creates an array
        // meaning, allocates memory
        // there's an error here
        // b/c I can't create an array of
        // unknown size
        // stackContents = new T[DEFAULT_SIZE];
        stackContents = (T[])(new Object[DEFAULT_SIZE]);
    }

    public ArrayStack(int size) {
        stackContents = (T[])(new Object[size]);
    }

    @Override
    public void push(T item) {
        stackContents[this.length()] = item;
        numItems++;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return numItems;
    }
}
