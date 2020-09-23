import java.util.ArrayList;
import java.util.List;


public class LevelOrderTraversalUsingRecursion {

  static Node root;

  static class Node {

    public int key;
    public LevelOrderTraversalUsingRecursion.Node left, right;

    public Node(int item) {
      key = item;
      left = right = null;
    }
  }


  public static List<List<Node>> levelOrderBottom(Node root) {
    List<List<Node>> bt = new ArrayList<List<Node>>();
    int level = 0;
    bt.add(new ArrayList<>());
    bt.get(level).add(root);
    while (bt.get(level).size() > 0) {
      bt.add(new ArrayList<>());
      for (int i = 0; i <= level; i++) {
        if (bt.get(level).get(i).left != null) {
          bt.get(level + 1).add(bt.get(level).get(i).left);
        }
        if (bt.get(level).get(i).right != null) {
          bt.get(level + 1).add(bt.get(level).get(i).right);
        }
      }
      if (bt.get(level).size() > 0) {
        level++;
      }

    }

    return bt;
  }

  public static void main(String[] args) {
    LevelOrderTraversalUsingRecursion tree = new LevelOrderTraversalUsingRecursion();
    tree.root = new Node(3);
    tree.root.left = new Node(9);
    tree.root.right = new Node(20);
    List<List<Node>> result = levelOrderBottom(root);
    for (int i = 0; i < result.size(); i++) {
      for (int j = 0; j < result.get(i).size(); j++) {
        System.out.print(result.get(i).get(j).key);
        System.out.println();
      }
    }
  }
}
