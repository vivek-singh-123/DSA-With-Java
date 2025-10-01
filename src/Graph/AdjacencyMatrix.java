package Graph;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no of vertex: ");
        int V = sc.nextInt();

        System.out.print("enter no of edges: ");
        int E = sc.nextInt();

        int[][] adjacencyMatrix = new int[V][V];

        System.out.println("enter edges in (u v) format:");

        for(int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1;
        }

        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
