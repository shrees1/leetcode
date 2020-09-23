
import java.util.ArrayList;
import java.util.List;

public class RootToLeafToSum {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    public boolean printPath(Node root, int sum, List<Node> path) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (root.data == sum) {
                path.add(root);
                return true;
            } else {
                return false;
            }
        }
        if (printPath(root.left, sum - root.data, path) || printPath(root.right, sum - root.data, path)) {
            path.add(root);
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        RootToLeafToSum rtl = new RootToLeafToSum();
        rtl.root = new Node(10);
        rtl.root.left = new Node(8);
        rtl.root.right = new Node(2);
        rtl.root.left.left = new Node(3);
        rtl.root.left.right = new Node(5);
        rtl.root.right.left = new Node(6);
        List<Node> result = new ArrayList<>();
        boolean r = rtl.printPath(root, 21, result);
        if (r) {
            result.forEach(node -> System.out.print(node.data + " "));
        } else {
            System.out.println("No path for sum " + 21);
        }
    }
}