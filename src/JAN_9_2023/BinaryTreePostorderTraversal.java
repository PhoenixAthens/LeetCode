package JAN_9_2023;
import java.util.*;
public class BinaryTreePostorderTraversal {
    //Runtime: 0ms beats 100%, Memory: 40.4MB beats 88.39%
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> main=new ArrayList<>();
        if(root==null)return main;
        Traversal(root,main);
        main.add(root.val);
        return main;
    }
    public void Traversal(TreeNode root,ArrayList<Integer> main){
        if(root.left!=null){
            Traversal(root.left,main);
            main.add(root.left.val);
        }
        if(root.right!=null){
            Traversal(root.right,main);
            main.add(root.right.val);
        }
    }
}
