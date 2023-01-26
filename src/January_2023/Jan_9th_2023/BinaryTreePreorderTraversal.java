package January_2023.Jan_9th_2023;
import java.util.*;
public class BinaryTreePreorderTraversal {
    //Runtime: 0ms beats 100%, Memory: 40MB beats 99.91%
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> main=new ArrayList<>();
        if(root==null)return main;
        main.add(root.val);
        traverseTree(root,main);
        return main;
    }
    public void traverseTree(TreeNode root,ArrayList<Integer> main){
        if(root.left!=null) {
            main.add(root.left.val);
            traverseTree(root.left, main);
        }
        if(root.right!=null){
            main.add(root.right.val);
            traverseTree(root.right, main);
        }
    }

}
