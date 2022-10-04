
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

    }
}*/

/**
 * Learning about Trees!!
 * Work in Progress,
 */

import java.util.*;
public class PathSum {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static  boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> listOfSums=new ArrayList<>();
        int TempoSum=root.val;
        boolean flag=true;
        while(flag){
            if(root.left!=null){
                listOfSums.add(TempoSum+SumOfStem(root.left));
            }else if(root.right!=null){
                listOfSums.add(TempoSum+SumOfStem(root.right));
            }else{
                flag=false;
            }

        }
        System.out.println(listOfSums);
        if(listOfSums.contains(targetSum)) return true;
        return false;

    }
    public static int SumOfStem(TreeNode root){
        int TempSum=root.val;
        if(root.left!=null){
            TempSum+=root.left.val;
            return TempSum+SumOfStem(root.left);
        }else if(root.right!=null){
            TempSum+=root.right.val;
            return TempSum+SumOfStem(root.right);
        }else{
            root=null;
            return TempSum;
        }
    }
    public static void main(String...args){
        TreeNode toPass=new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));
        System.out.println(SumOfStem(toPass.left));
        //System.out.println(hasPathSum(new TreeNode(1,new TreeNode(4),new TreeNode(5)),5));
    }

}

