import java.util.LinkedList;
import java.util.List;

class GraphUWAdjList {
    private LinkedList<Entry>[] adjList;

    class Entry {
        int dest;
        int weight;
    }
}

class GraphUWAdjMatrix {
    // undirected, weighted
    private final int DEFAULT_SIZE = 10;
    private int[][] adjMatrix;

    public void addEdge(int src, int dest, int weight) {
        adjMatrix[src][dest] = weight;
        adjMatrix[dest][src] = weight;
    }

    public int getEdge() {
        // we're not merely checking does an edge exist?
        // we want to know the weight between them
        return 0;
    }
}

class GraphUUAdjList {
    private final int DEFAULT_SIZE = 10;
    private List<Integer>[] adjList;
    // this is an adjList...
    // this could be a directed OR undirected, can't tell
    // this can only hold integers

    public GraphUUAdjList() {
        adjList = new List[DEFAULT_SIZE];
    }

    public GraphUUAdjList(int size) {
        adjList = new List[size];
    }

    public void addEdge(int src, int dest) {
        // simple example
        // not checking for duplicates or anything
        if (adjList[src] == null) {
            adjList[src] = new LinkedList<>();
        }
        if (adjList[dest] == null) {
            adjList[dest] = new LinkedList<>();
        }
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public boolean hasEdge(int src, int dest) {
        return adjList[src].contains(dest);
        // downside of using abstraction, we can't see that contains method is O(n)
        // could also do adjList[dest].contains(src)
        // only b/c this is an undirected graph
    }
}


public class GraphUU {
    // undirected, unweighted
    // linked lists?  arrays??
    // adj matrix, or adj list, or edge list??
    // depending on which, arrays or linked lists will
    // naturally be a better fit
    // whatever we choose...
    // it'll have some kind of efficiency implication

    // adj matrix
    // 2D array
    // array of what??????
    // data in the array represents whether there is
    // an edge or not

    private final int DEFAULT_SIZE = 10;
    // this graph can only hold up to 10 nodes
    // right now, we're only holding integers
    // so we can only hold integers 0 to 9

    private boolean[][] adjMatrix;
    // this can only be an unweighted graph
    // cannot infer from this single line of code
    // if it's directed or undirected

    public GraphUU() {
        adjMatrix = new boolean[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public GraphUU(int size) {
        adjMatrix = new boolean[size][size];
    }

    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = adjMatrix[dest][src] = true;
    }

    public boolean hasEdge(int src, int dest) {
        // can be answered 2 different ways
        return adjMatrix[src][dest]; // [dest][src]
    }
}

class GraphTester {
    public static void main(String[] args) {
        //GraphUU mygraph = new GraphUU();
        GraphUUAdjList mygraph = new GraphUUAdjList();
        // this constructor basically implicitly "adds" 10 nodes in it
        // or... at least saves enough memory to be able to hold
        // information (the edges/relationships) about 10 nodes

        // I don't have an addNode method

        mygraph.addEdge(0, 1);
        mygraph.addEdge(2, 1);
        mygraph.addEdge(5, 3);
        mygraph.addEdge(5, 9);
        mygraph.addEdge(8, 2);

        System.out.println("Is there an edge between 5 and 2? ");
        System.out.println(mygraph.hasEdge(5, 2));
    }
}
