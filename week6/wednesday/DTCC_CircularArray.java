public class DTCCArrayList {
    private int front, back, count;
    private int[] listContents = new int[10];
    /*
    (initially) left side (towards 0 in the array) is the front of the queue
    -- this design choice means we never wrap to the "left" - negative index
    right side is the back of the queue
     */

    public void add(int num) {
        if (count < listContents.length) {
            listContents[back++ % listContents.length] = num;
            count++;
        } else {
            throw new IllegalStateException("ahhh");
        }
    }

    public int removeFront() {
        if (count > 0) {
            front++;
            count--;
            return listContents[(front-1)% listContents.length];
        } else {
            return Integer.MIN_VALUE;  // this is stupid
            // should throw an exception
            // if using generics, could return null
            // check if the interface specifies
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (count == 0) return "[ ]";
        else {
            for (int i = front; i < back; i++) {
                // front and back both get incremented as needed
                output.append(listContents[i % listContents.length] + " ");
            }
        }
        return output.toString();
    }

}

class Test {
    public static void main(String[] args) {
        DTCCArrayList list = new DTCCArrayList();
        for (int i = 0; i < 10; i++)
            list.add(i+1);
        // add 1 - 10

        System.out.println(list); // 1-10

        for (int i = 0; i < 5; i++)
            list.removeFront();
        // removing 1-5

        System.out.println(list); // 6-10

        for (int i = 0; i < 5; i++)
            list.add(i+11);
        // add (11-15)

        System.out.println(list);  // 6-15
    }

}
