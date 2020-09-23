public class InsertionInABST {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static Node root;

    InsertionInABST() {
        root = null;
    }

    static void insert(Node node, int key) {
        if (node == null) {
            return;
        }

        if (node.key < key) {
            if (node.right == null) {
                node.right = new Node(key);
            }
            insert(node.right, key);
        }

        if (node.key > key) {
            if (node.left == null) {
                node.left = new Node(key);
            }
            insert(node.left, key);
        }
    }

    static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        InsertionInABST tree = new InsertionInABST();
        tree.root = new Node(10);
        tree.root.left = new Node(-5);
        tree.root.right = new Node(16);
        tree.root.left.left = new Node(-8);
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(18);
        insert(root, 6);
        inorderRec(root);
        // System.out.println(resultTree.key);
    }
}
