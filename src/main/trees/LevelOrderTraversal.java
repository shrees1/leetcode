import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node {
        int key;
        LevelOrderTraversal.Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static Node root;

    LevelOrderTraversal() {
        root = null;
    }

    static void printElementsInTheLevel(Node node) {
        if (node == null) {
            return;
        }
        Queue<LevelOrderTraversal.Node> lQueue = new LinkedList<>();
        lQueue.add(node);
        while (!lQueue.isEmpty()) {
            node=lQueue.poll();
            System.out.println(node.key);

            if (node.left != null) {
                lQueue.add(node.left);
            }
            if (node.right != null) {
                lQueue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(10);
        tree.root.left = new Node(-5);
        tree.root.right = new Node(16);
        tree.root.left.left = new Node(-8);
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(18);
        printElementsInTheLevel(root);
        // System.out.println(resultTree.key);
    }
}


