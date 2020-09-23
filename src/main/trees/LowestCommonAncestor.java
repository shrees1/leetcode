class Nodal {
    int data;
    Nodal left, right;

    Nodal(int item) {
        data = item;
        left = right = null;
    }
}

public class LowestCommonAncestor {
    Nodal root;

    static int lowestCommonAncestor(Nodal node, int node1, int node2) {
        if (node == null) {
            return -1;
        }
        if ((node.data == node1) || (node.data == node2)) {

            return node.data;

        }

        int nLeft = lowestCommonAncestor(node.left, node1, node2);
        int nRight = lowestCommonAncestor(node.right, node1, node2);

        if ((nLeft != -1) && (nRight != -1)) {
            return node.data;
        }
        if ((nLeft == -1) && (nRight == -1)) {
            return -1;
        }
        return nRight != -1 ? nRight : nLeft;
    }


    public static void main(String args[]) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Nodal(10);
        tree.root.left = new Nodal(8);
        tree.root.right = new Nodal(2);
        tree.root.left.left = new Nodal(3);
        tree.root.left.left.left = new Nodal(1);
        tree.root.left.right = new Nodal(5);
        tree.root.right.left = new Nodal(6);
        int result = LowestCommonAncestor.lowestCommonAncestor(tree.root, 3, 2);
        System.out.println(result);
    }
}


