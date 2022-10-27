public class LowestCommonAncestorInBST {
  
    //Input : 4, 9
    //Expected Output: 7
  
    static class Node {
        private final int data;
        private Node left;
        private Node right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }


    public static Node lowestCommonAncestor(Node root, int child1, int child2) {
        if (root == null) return null;
        if (child1 < root.data && child2 < root.data) {
            return lowestCommonAncestor(root.left, child1, child2);
        } else if (child1 > root.data && child2 > root.data) {
            return lowestCommonAncestor(root.right, child1, child2);
        }
        return root;
    }


    public static void main(String[] args) {
    /* Constructing the following tree
               3
             /   \
            /     \
           2       7
          /      /   \
         /      /     \
        1      5       9
              / \
             /   \
            4    6
    */
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.right.left = new Node(5);
        root.right.right = new Node(9);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(6);
        System.out.println(lowestCommonAncestor(root, 4, 9).data);

    }
}
