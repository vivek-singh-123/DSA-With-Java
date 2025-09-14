package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
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

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    //Pair class
    public static class Pair implements Comparable<Pair>{
        int node;
        int distance;

        Pair(int n, int d){
            this.node = n;
            this.distance = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.distance - p2.distance;
        }
    }

    //dijkstra algo function
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){  //T.C ==> O(E + E logV-->bcz of priority queue)
        //initialization..............
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(src,0));

        //bfs like similar code ........
        while (!pq.isEmpty()){
            Pair curr = pq.remove(); //shortest destination
            if(!vis[curr.node]){
                vis[curr.node] = true;
            }

            for(int i=0; i<graph[curr.node].size(); i++){
                Edge e = graph[curr.node].get(i);
                int u = e.source;
                int v = e.destination;

                if(dist[u] + e.weight < dist[v]){   //relaxation
                    dist[v] = dist[u] + e.weight;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        for(int i=0; i<V; i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        dijkstra(graph, 0, V);
    }
}
