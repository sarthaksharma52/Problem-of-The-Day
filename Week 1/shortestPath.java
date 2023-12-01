public class shortestPath {

    public int minStep(int n) {
        // code here
        // Create an array to store the minimum number of steps to reach each vertex
        int[] dp = new int[n + 1];

        // Initialize the array with a large value, except for vertex 1 (0 steps)
        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Iterate through each vertex and update the minimum steps
        for (int i = 1; i <= n; i++) {
            // Update the next vertex if it is within the bounds
            if (i + 1 <= n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
            if (3 * i <= n) {
                dp[3 * i] = Math.min(dp[3 * i], dp[i] + 1);
            }
        }

        // The result is stored in dp[n]
        return dp[n];

    }
    
    public static void main(String[] args) {
        
    }
}
