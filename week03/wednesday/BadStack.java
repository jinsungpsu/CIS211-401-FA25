public class BadStack<T> implements Stack<T> {
    // this one stores stuff in an array
    // we want index 0 to be at the top of the stack

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
    public BadStack() {
        // this creates an array
        // meaning, allocates memory
        // there's an error here
        // b/c I can't create an array of
        // unknown size
        // stackContents = new T[DEFAULT_SIZE];
        stackContents = (T[])(new Object[DEFAULT_SIZE]);
    }

    public BadStack(int size) {
        stackContents = (T[])(new Object[size]);
    }

    @Override
    public void push(T item) {
        for (int i = numItems-1; i >= 0; i--) {
            stackContents[i+1] = stackContents[i];
        }
//        stackContents[this.length()] = item;
//        numItems++;
    }

    @Override
    public T pop() {
        T itemToPop = stackContents[0];

        // need to shift EVERYTHING back one spot
        // because item in spot #0 is being
        // removed

        // shift items
        for (int i = 0; i < numItems-1; i++) {
            stackContents[i] = stackContents[i+1];
        }

        // do I need to clear the last item????
        // i could do this
        // stackContents[numItems-1] = null;
        // or... do nothing
        // if we keep the count accurate... it's not necessary

        // student suggested maybe...
        // but might go out of bounds
//        for (int i = 0; i < numItems; i++) {
//            stackContents[i] = stackContents[i+1];
//        }


        numItems--;
        return itemToPop;
    }

    @Override
    public T peek() {
        return stackContents[0];
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
