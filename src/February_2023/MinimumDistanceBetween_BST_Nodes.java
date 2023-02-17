package February_2023;
import java.util.ArrayList;
import java.util.List;
//Date: 18th February 2023
public class MinimumDistanceBetween_BST_Nodes {
    //Runtime: 1ms beats 25.81%, Memory: 40.1MB beats 35.39%
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public int minDiffInBST(TreeNode root) {
        int[] values=new int[]{100_000_000};
        ArrayList<Integer> coveredNodes=new ArrayList<>(List.of(root.val));
        walkTheTree(root, values, coveredNodes);
        return values[0];
    }
    public void walkTheTree(TreeNode root, int[] values, ArrayList<Integer> soFar){
        if(root.left!=null){
            for(int i: soFar){
                values[0]=Math.min(values[0],Math.abs(i-root.left.val));
            }
            soFar.add(root.left.val);
            walkTheTree(root.left,values,soFar);
        }
        if(root.right!=null){
            for(int i: soFar){
                values[0]=Math.min(values[0],Math.abs(i-root.right.val));
            }
            soFar.add(root.right.val);
            walkTheTree(root.right,values,soFar);
        }
    }
    public static void main(String...args){
        System.out.println(new MinimumDistanceBetween_BST_Nodes().minDiffInBST(new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(6))));
    }
}
