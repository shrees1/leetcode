import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {

  int val;
  TreeNode left;
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

class BinaryTreeTraversalII {

  List<List<Integer>> bTlist = new ArrayList<>();
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    lOT(root,0);
    Collections.reverse(bTlist);
    return bTlist;
  }
  public void lOT(TreeNode root, int level){
    if(root==null){
      return;
    }
    if(bTlist.size()<=level)
    {
      bTlist.add(new ArrayList<>());
    }
    bTlist.get(level).add(root.val);
    if(root.left!=null){
      lOT(root.left,level+1);
    }
    if(root.right!=null){
      lOT(root.right,level+1);
    }
  }

  public List<List<Integer>> levelOrderBottoma(TreeNode root) {
    List<List<Integer>> output = new ArrayList<>();
    List<TreeNode> parent= new ArrayList<>();
    parent.add(root);
    while(parent.size()>0)
    {
      List<Integer> level = new ArrayList<>();
      List<TreeNode> child= new ArrayList<>();
      for(TreeNode node:parent)
      {
        level.add(node.val);
        if(node.left!=null)
          child.add(node.left);
        if(node.right!=null)
          child.add(node.right);
      }
      output.add(level);
      parent = child;
    }
    Collections.reverse(output);
    return output;

  }



}

