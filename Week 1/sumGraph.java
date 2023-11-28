import java.util.ArrayList;
import java.util.List;

public class sumGraph {

    public static int sumOfDependencies(List<List<Integer>> adj, int V) {
        // code here
        int[] dependencies = new int[V];

        // Iterate through the adjacency list and update the dependencies array
        for (int i = 0; i < V; i++) {
            for (int j : adj.get(i)) {
                dependencies[j]++;
            }
        }

        // Calculate the sum of dependencies
        int sum = 0;
        for (int dependency : dependencies) {
            sum += dependency;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> lst = new ArrayList<>();
        int V = 4;
        lst.add(List.of(0, 2));
        lst.add(List.of(0, 3));
        lst.add(List.of(1, 3));
        lst.add(List.of(2, 3));
        System.out.println(sumOfDependencies(lst, V));
    }
}