import java.util.List;

public class eulerPath{
     public int isEulerCircuit(int V, List<Integer>[] adj) {
       
        if (V == 0) {
            return 0;
        }

       
        if (!isConnected(V, adj)) {
            return 0;
        }

        int oddDegreeCount = 0;
        for (int i = 0; i < V; i++) {
            if (adj[i].size() % 2 != 0) {
                oddDegreeCount++;
            }
        }

        
        if (oddDegreeCount == 0) {
           
            return 2;
        } else if (oddDegreeCount == 2) {
            
            return 1;
        } else {
            
            return 0;
        }
    }

    // Check if the graph is connected using DFS
    private boolean isConnected(int V, List<Integer>[] adj) {
        boolean[] visited = new boolean[V];

        // Find the first non-zero degree node
        int i;
        for (i = 0; i < V; i++) {
            if (adj[i].size() > 0) {
                break;
            }
        }

        // If no edges are present, the graph is connected
        if (i == V) {
            return true;
        }

        // Start DFS traversal from the first non-zero degree node
        dfs(i, visited, adj);

        // Check if all nodes are visited
        for (i = 0; i < V; i++) {
            if (!visited[i] && adj[i].size() > 0) {
                return false;
            }
        }

        return true;
    }

    // Perform DFS traversal
    private void dfs(int v, boolean[] visited, List<Integer>[] adj) {
        visited[v] = true;
        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
    
    
}
