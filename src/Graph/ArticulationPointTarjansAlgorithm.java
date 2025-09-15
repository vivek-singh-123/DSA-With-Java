package Graph;

import java.util.ArrayList;

public class ArticulationPointTarjansAlgorithm {
    //Edge class
    public static class Edge{
        int source;
        int destination;

        Edge(int s, int d){
            this.source=s;
            this.destination=d;
        }
    }

    //create a graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    //dfs
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time[], boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0];
        int children = 0;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.destination;

            if(par == neigh){
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfs(graph, neigh, curr, dt, low, vis, time, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] <= low[neigh] && par != -1){
                    ap[curr] = true;
                }
                children++;
            }
        }

        if(par == -1 && children > 1){
            ap[curr] = true;
        }
    }

    //get articulation point
    public static void getAP(ArrayList<Edge> graph[], int V){
        // T.C ==> O(V+E)
        // Space ==> O(V + E) (adjacency list + arrays + recursion stack)

        int dt[] = new int[V];
        int low[] = new int[V];
        int time[] = {0};
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph, i, -1, dt, low, vis, time, ap);
            }
        }

        for(int i=0; i<V; i++){
            if(ap[i]){
                System.out.println("AP : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        getAP(graph, V);
    }
}
