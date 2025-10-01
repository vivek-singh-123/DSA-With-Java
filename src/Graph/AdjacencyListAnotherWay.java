package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacencyListAnotherWay {
    public static class Edge{
        int vertex;
        int weight;

        Edge(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {  //undirected and weighted graph
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no of vertex: ");
        int V = sc.nextInt();

        System.out.print("enter no of edges: ");
        int E = sc.nextInt();

        List<List<Edge>> adjacencyList=new ArrayList<>();
        for(int i=0; i<V; i++){
            adjacencyList.add(new ArrayList<>());
        }

        System.out.println("enter edges in (u v w) format:");

        for(int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            adjacencyList.get(u).add(new Edge(v, w));
            adjacencyList.get(v).add(new Edge(u, w));
        }

        for(int i=0; i<V; i++){
            System.out.print(i+" -> ");
            for(Edge edge : adjacencyList.get(i)){
                System.out.print("(" + edge.vertex+", "+edge.weight + ")");
            }
            System.out.println();
        }
    }
}
