
class Nod {
    int data;
    Nod left, right;

    Nod(int item) {
        data = item;
        left = right = null;
    }
}

public class DiameterOfATree {
    Nod root;
//    static int nLeft = 0;
//    static int nRight = 0;
//    static int fHeight = 0;
    static int diameter=Integer.MIN_VALUE;

    static int findHeight(Nod node) {
        if (node == null) {
            return 0;
        }

        int nLeft = findHeight(node.left);
        int nRight = findHeight(node.right);
        int fHeight = 1+Math.max(nLeft,nRight);
        diameter=Math.max(diameter,1+nLeft+nRight);
        return fHeight;
    }

    public static void main(String args[]) {
        DiameterOfATree tree = new DiameterOfATree();
        tree.root = new Nod(10);
        tree.root.left = new Nod(8);
        tree.root.right = new Nod(2);
        tree.root.left.left = new Nod(3);
        tree.root.left.right = new Nod(5);
        tree.root.right.left = new Nod(6);
        int result = DiameterOfATree.findHeight(tree.root);
        System.out.println(diameter);
    }

}
