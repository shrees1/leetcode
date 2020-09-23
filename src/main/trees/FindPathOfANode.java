import java.util.ArrayList;
import java.util.List;

class Noda {
    int data;
    Noda left, right;

    Noda(int item) {
        data = item;
        left = right = null;
    }
}

public class FindPathOfANode {
    Noda root;
    static List<Integer> fPath = new ArrayList<>();

    static void findPathOfNode(Noda node, int nFind) {
        if (node == null) {
            return;
        }
        fPath.add(node.data);
        if (node.data == nFind) {
            System.out.println(fPath);
        }
        findPathOfNode(node.left, nFind);
        findPathOfNode(node.right, nFind);
        fPath.remove(fPath.size() - 1);
    }

    public static void main(String args[]) {
        FindPathOfANode tree = new FindPathOfANode();
        tree.root = new Noda(10);
        tree.root.left = new Noda(8);
        tree.root.right = new Noda(2);
        tree.root.left.left = new Noda(3);
        tree.root.left.left.left = new Noda(1);
        tree.root.left.right = new Noda(5);
        tree.root.right.left = new Noda(6);
        FindPathOfANode.findPathOfNode(tree.root, 6);
        // System.out.println(result);
    }
}