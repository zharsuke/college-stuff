package practicum1;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert amount of vertices : ");
        String [] vertex = new String[sc.nextInt()];
        System.out.print("Is the graph directed ? (true/false) ");
        boolean isDirected = sc.nextBoolean();
        Graph<String> graph = new Graph<String>(vertex, isDirected);
        System.out.println();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Insert data vertex -" + i +  " : ");
            vertex[i] = sc.next();
        }

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Insert source : ");
            int source = sc.nextInt();
            System.out.print("Insert destination : ");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
            System.out.println();
        }
        graph.printGraph();
        System.out.println();
        boolean directedGraph = graph.graphType();
        System.out.println("Graph type : " + (directedGraph ? "Directed" : "Undirected"));
        sc.close();
    }
}
