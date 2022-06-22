package Graph_Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer>[] adj;
    private int V;

    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i<V; i++){
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int main, int connect_to){
        adj[main].add(connect_to);
    }

    public void BFS(int start){
        boolean[] visited =  new boolean[V];

        LinkedList<Integer> queue =  new LinkedList<Integer>();

        visited[start] = true;
        queue.add(start);


        while(!queue.isEmpty()){
            start = queue.poll();
            System.out.print( start + " ");

            Iterator<Integer> iterat = adj[start].listIterator();
            while(iterat.hasNext()){
                int n = iterat.next();
                if(!visited[n]){
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph myObject = new Graph(5);
        myObject.addEdge(0,1);
        myObject.addEdge(0, 3);
        myObject.addEdge(1, 3);
        myObject.addEdge(1, 4);
        myObject.addEdge(4, 2);
        myObject.addEdge(2, 1);

        myObject.BFS(0);
    }
}

