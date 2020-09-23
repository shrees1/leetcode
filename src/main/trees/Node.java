import java.util.LinkedList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    static List<Integer> pathList = null;

    static void printPathsRecur(Node node, List pathList) {
        if (node != null) {
            pathList.add(node.data);
        }

        if (node.left == null && node.right == null) {
            printArray(pathList);
            pathList.remove(pathList.size()-1);
        } else {
            printPathsRecur(node.left, pathList);
            printPathsRecur(node.right, pathList);
            pathList.remove(pathList.size()-1);
        }
    }

    static void printArray(List pathList) {
        int i;
  //      for (i = 0; i < pathList.size(); i++) {
            System.out.print(pathList + " ");
     //   }
        System.out.println("");
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        BinaryTree.printPathsRecur(tree.root, new LinkedList());
    }
}
