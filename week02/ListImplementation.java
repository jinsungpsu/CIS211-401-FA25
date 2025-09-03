import java.util.ArrayList;

public class ListImplementation<T> implements List<T>{

    private ArrayList<T> listContents = new ArrayList<>();

    @Override
    public void add(T it) {
        listContents.add(it);
    }

    @Override
    public void remove(T it) {
        listContents.remove(it);
    }

    @Override
    public int size() {
        return listContents.size();
    }
}
