package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    //Edge class
    public static class Edge{
        int source;
        int destination;
        int weight;

        Edge(int s, int d, int w){
            this.source=s;
            this.destination=d;
            this.weight=w;
        }
    }

    //build graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
        graph[3].add(new Edge(3,0,30));

    }

    //Pair class
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    //prims algorithm
    public static void primsAlgo(ArrayList<Edge> graph[], int V){   //T.C ==> O(E logE)
        PriorityQueue<Pair> pq = new PriorityQueue<>(); //non-mst
        boolean vis[] = new boolean[V];  //mst
        pq.add(new Pair(0,0));
        int mstCost = 0;
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstCost += curr.cost;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.destination]){
                        pq.add(new Pair(e.destination, e.weight));
                    }
                }
            }
        }
        System.out.println("minimum cost of mst: "+mstCost);
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        primsAlgo(graph, V);
    }
}
