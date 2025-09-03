package Graph;

import java.util.ArrayList;

public class PrintAllPath {
    //edge class
    public static class Edge{
        int source;
        int designation;

        Edge(int s, int d){
            this.source=s;
            this.designation=d;
        }
    }

    //create graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    //print path
    public static void printPath(ArrayList<Edge> graph[], String path, boolean vis[], int curr, int target){
        if(curr==target){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);

            if(!vis[e.designation]){
                vis[curr]=true;
                printPath(graph, path+e.designation, vis, e.designation, target);
                vis[curr]=false;
            }
        }
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        int src=0, tar=5;
        printPath(graph, "0", new boolean[v], src, tar);
    }
}
