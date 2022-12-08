package From_8th_December;
import java.util.*;
public class Left_Similar_Tree {
    //Runtime: 1ms beats 77.58%, Memory 39.98 beats 94.3%
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> r1=new Stack<>();
        sendDown(root1,r1);
        Stack<Integer> r2=new Stack<>();
        sendDown(root2,r2);
        return r1.equals(r2);
    }
    public void sendDown(TreeNode root,Stack<Integer> node){
        if(root.left!=null){
            sendDown(root.left,node);
        }
        if(root.right!=null){
            sendDown(root.right,node);
        }
        if(root.left==null && root.right==null)
            node.push(root.val);
    }
    public static void main(String...args){
    }
    //                        3
    //                      /   \
    //                     /     \
    //                    5       1
    //                   / \     / \
    //                  6   2   9   8
    //                     / \
    //                    /   \
    //                   7     14
    //                        3
    //                      /   \
    //                     /     \
    //                    5       1
    //                   / \     / \
    //                  6  71   4   2
    //                             / \
    //                            9   8
}
