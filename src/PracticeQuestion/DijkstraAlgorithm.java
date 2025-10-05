package PracticeQuestion;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
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

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }
    public static void dijkstraAlgo(ArrayList<Edge> graph[], int source, int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int distance[]=new int[V];
        for(int i=0; i<V; i++){
            if(i != source){
                distance[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[V];

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()){
            Pair curr =pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(distance[u]+e.wt < distance[v]){
                        distance[v] = distance[u]+e.wt;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        for(int i=0; i<V; i++){
            System.out.print(distance[i]+" ");
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        dijkstraAlgo(graph, 0, V);
    }
}
