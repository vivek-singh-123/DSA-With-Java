package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgorithm {
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

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    //topological sort
    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> st){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.destination]){
                topSort(graph, e.destination, vis, st);
            }
        }
        st.push(curr);
    }

    //dfs function
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.destination]){
                dfs(graph, e.destination, vis);
            }
        }
    }

    //kosaraju algorithm
    public static void kosarajuAlgo(ArrayList<Edge> graph[], int V){
        //step1 --> O(V+E)
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                topSort(graph, i, vis, st);
            }
        }

        //step2 --> O(V+E)
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0; i< graph.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j); //e.source(i) -> e.destination
                transpose[e.destination].add(new Edge(e.destination, e.source));  //e.destination -> e.source
            }
        }

        //step3 --> O(V+E)
        while (!st.isEmpty()){
            int curr = st.pop();
            if(!vis[curr]){
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        kosarajuAlgo(graph, V);
    }
}
