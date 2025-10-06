package PracticeQuestion;

import java.util.ArrayList;

public class BellmanFordAlgorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int V, int source){
        int[] distance = new int[V];
        for(int i=0; i<V; i++){
            if(i != source){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        //main logic
        for(int k=0; k<V-1; k++){
            for(int i=0; i<V; i++){
                for(int j=0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;
                    if(distance[u] != Integer.MAX_VALUE && distance[u]+e.wt < distance[v]){
                        distance[v] = distance[u] + e.wt;
                    }
                }
            }
        }

        //for detection negative cycle
        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                int u = e.src;
                int v = e.dest;
                if(distance[u] != Integer.MAX_VALUE && distance[u]+e.wt < distance[v]){
                    System.out.println("negative cycle exist!!!!!!");
                }
            }
        }

        for(int i=0; i< distance.length; i++){
            System.out.print(distance[i]+" ");
        }

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, V, 0);
    }
}
