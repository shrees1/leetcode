
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeinBST {

  public static int[] findMode(TreeNode root) {
    if (root == null) {
      return null;
    }
    Map<Integer, Integer> hmap = new HashMap<>();
    inorderTraversal(root, hmap);
    int max = Collections.max(hmap.values());
    List<Integer> list = new ArrayList<>();
    for (Map.Entry i : hmap.entrySet()) {
      if (i.getValue().equals(max)) {
        list.add((Integer) i.getKey());
      }
    }
    int rt[] = new int[list.size()];
    int j = 0;
    for (Integer i : list) {
      rt[j++] = i;
    }
    return rt;
  }

  public static void inorderTraversal(TreeNode root, Map<Integer, Integer> hmap) {
    if (root == null) {
      return;
    }
    inorderTraversal(root.left, hmap);
    hmap.put(root.val, hmap.getOrDefault(root.val, 0) + 1);
    inorderTraversal(root.right, hmap);
  }

  class TreeNode {

    int val;
    public TreeNode left;

    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static void main(String[] args) {
   // findMode()
  }
}
