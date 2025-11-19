import java.util.HashMap;
import java.util.Map;

public class UUGraphMatrix<T> {
    private Map<T, Integer> map = new HashMap<>();
    private boolean[][] adjMatrix = new boolean[5][5];
    private int count;

    public void addNode(T node) {
        map.put(node, count++);
    }

    public void addEdge(T src, T dest) {
        int srcIndex = map.get(src);
        int destIndex = map.get(dest);
        adjMatrix[srcIndex][destIndex] = true;
        adjMatrix[destIndex][srcIndex] = true;
    }
}
