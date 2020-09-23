import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
class Node1 {

  public int val;
  public List<Node1> children;

  public Node1() {
  }

  public Node1(int _val) {
    val = _val;
  }

  public Node1(int _val, List<Node1> _children) {
    val = _val;
    children = _children;
  }
};


class BFS {

  public static int maxDepth(Node1 root) {
    List<Node1> node1LinkedList = new LinkedList<>();
    node1LinkedList.add(root);
    int count = 0;
    while (Objects.nonNull(node1LinkedList)) {
      node1LinkedList = new LinkedList<>();
      node1LinkedList.add(root);
      for (Node1 item : root.children) {
        node1LinkedList.remove(root);
        node1LinkedList.add(item);
        count++;
      }
    }
    return Math.max(count, node1LinkedList.size());

  }
}