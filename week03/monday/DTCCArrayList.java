public class DTCCArrayList {
    private final int DEFAULT_SIZE = 10;
    private int numItems;
    private int[] listItems;

    public DTCCArrayList() {
        listItems = new int[DEFAULT_SIZE];
    }

    public DTCCArrayList(int size) {
        listItems = new int[size];
    }
}
