package From_8th_December;

import java.util.Stack;

public class Left_Similar_Tree_SecondIteration {
    //Runtime: 1ms beats 77.58%, Memory: 42.4MB beats 17.39%
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean leafSimilar(TreeNode root1,TreeNode root2) {
        StringBuffer r1=new StringBuffer();
        sendDown(root1,r1);
        StringBuffer r2=new StringBuffer();
        sendDown(root2,r2);
        return r1.toString().equals(r2.toString());
    }
    public void sendDown(TreeNode root, StringBuffer node){
        if(root.left!=null){
            sendDown(root.left,node);
        }
        if(root.right!=null){
            sendDown(root.right,node);
        }
        if(root.left==null && root.right==null)
            node.append(root.val).append(",");

    }
}
