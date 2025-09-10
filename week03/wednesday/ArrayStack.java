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
    public void push(T item) throws IllegalStateException {
        if (numItems == stackContents.length) {
            // meaning, # of spots available in my array
            // is the same as # of existing items
            // meaning the array is full
            // which consequently, means can't add to the stack
            // unless i do some magic
            // but... we already told the user of this class
            // that an exception may occur
            throw new IllegalStateException("I could create a new array... but I won't, because I want to save memory.");

            // immediately exits this method, so same as a "return" in that sense
        }
        stackContents[this.length()] = item;
        numItems++;
    }

    @Override
    public T pop() {
        // how do I remove an item from the stack?
        T returnData = stackContents[numItems-1];
        numItems--;
        // instead of lines 56-57, we could do this in one line
        // T returnData = stackContents[--numItems];
        // ############## previous line might be on exam #1 #################
        return returnData;
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

    @Override
    public String toString() {
        // something like TOP["pikachu", "raichu"]BOTTOM
        // or [1,2,3,4]
        // or ["Hello", "World"]
        // if Mr. An were in charge
        /*
        pikachu
        raichu

        or

        1
        2
        3
        4

        or

        "Hello"
        "World"
         */

        if(isEmpty()) {
            return "EMPTY STACK.";
        }

        StringBuilder output = new StringBuilder();
        output.append("Bottom of stack\n");
        // some stuff

        for (int i = 0; i < numItems; i++) {
            output.append(stackContents[i] + "\n");
        }
        output.append("Top of stack\n");
        return output.toString();

    }
}
