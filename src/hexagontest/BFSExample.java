package hexagontest;

import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    private int vertices; // Number of vertices in the graph
    private LinkedList<Integer>[] adjacencyList; // Adjacency list

    // Constructor
    public BFSExample(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    // BFS traversal starting from a given source
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Track visited vertices
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true; // Mark the starting vertex as visited
        queue.add(startVertex); // Enqueue the starting vertex

        System.out.println("Breadth-First Search (BFS) traversal:");

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll(); // Dequeue a vertex
            System.out.print(currentVertex + " ");

            // Enqueue all unvisited adjacent vertices
            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSExample graph = new BFSExample(5); // Create a graph with 5 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        // Perform BFS starting from vertex 0
        graph.bfs(0);
    }
}
