import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class UUGraphAdjList<T> {

    private Map<T, LinkedList<T>> map = new HashMap<>();

    public void addNode(T node) {
        map.put(node, new LinkedList<>());
    }

    public void addEdge(T src, T dest) {
        map.get(src).add(dest);
        map.get(dest).add(src);
    }

}

class Airports {
    public static void main(String[] args) {
        UUGraphAdjList<String> airports = new UUGraphAdjList<>();
        airports.addNode("EWR");
        airports.addNode("JFK");
        airports.addEdge("EWR", "JFK");
    }
}
