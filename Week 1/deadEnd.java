public class deadEnd {

   class Node {
    int data;
    Node left, right;
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static boolean helper(Node node, int MIN, int MAX) {
        if (node == null)
            return false;

        if (node.data == MIN && node.data == MAX)
            return true;

        return helper(node.left, MIN, node.data - 1) || helper(node.right, node.data + 1, MAX);
    }

    public static boolean isDeadEnd(Node root) {
        return helper(root, 1, Integer.MAX_VALUE);
    }

}
