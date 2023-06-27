package practicum1;

public class Graph<T> {
    T[] vertex;
    LinkedList list[];
    boolean isDirected;

    public Graph(T[] vertex, boolean isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new LinkedList[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);

        if (!isDirected) {
            // add back edge (for undirected)
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        // degree undirected graph
        System.out.println("Degree vertex " + source + " : " + list[source].size());

            // degree directed graph
            if (isDirected) {
                int totalIn = 0, totalOut = 0;
                for (int i = 0; i < vertex.length; i++) {
                    for (int j = 0; j < list[i].size(); j++) {
                        if (list[i].get(j) == source) {
                            ++totalIn;
                        }
                    }
                    if (i == source) {
                        totalOut += list[i].size();
                    }
                }
                System.out.println("Indegree from vertex " + source + " : " + totalIn);
                System.out.println("Outdegree from vertex " + source + " : " + totalOut);
                System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
            }
    }

    public void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
        if (!isDirected) {
            list[destination].remove(source);
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("Graph successfully cleared.");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " connects with: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean graphType() {
        return isDirected;
    }
}