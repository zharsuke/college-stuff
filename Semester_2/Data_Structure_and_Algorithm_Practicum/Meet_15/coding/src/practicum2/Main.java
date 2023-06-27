package practicum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray<String> graph;
        try {
            System.out.print("Insert amount of vertices : ");
            v = sc.nextInt();
            System.out.print("Insert amount of edges : ");
            e = sc.nextInt();
            sc.nextLine();
            String [] vertex = new String[v+1];

            for (int i = 1; i <= v; i++) {
                System.out.print("Insert data vertex -" + i +  " : ");
                vertex[i] = sc.next();
            }
            graph = new GraphArray<String>(vertex);
            System.out.println("Insert edges : <to> <from> ");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D as a representation graph : ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(vertex[i] + "\t");
            }
            System.out.println();
            for (int i = 1; i <= v; i++) {
                System.out.print(vertex[i] + "\t");
                for (int j = 1; j <= v; j++) {
                System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Try to check again!\n");
        }
        sc.close();
    }
}
