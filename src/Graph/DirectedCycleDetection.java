package Graph;

import java.util.ArrayList;

public class DirectedCycleDetection {
    //Edge class
    public static class Edge{
        int source;
        int destination;

        Edge(int s, int d){
            this.source=s;
            this.destination=d;
        }
    }

    //build graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    //cycle detection----> this is modified DFS approach
    public static boolean isCycleDetection(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]){  //rec-->recursion(stack) array
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(rec[e.destination]){  //it means cycle exist krta hai
                return true;
            }else if(!vis[e.destination]){
                if(isCycleDetection(graph, vis, e.destination, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(!vis[i]){
                boolean isCycle = isCycleDetection(graph, vis, i, rec);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
