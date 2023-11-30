package December_2022.From_10th_December_UnderProgress;

public class MaximumProductOfSplitBinaryTree_SecondIteration {
    public static class TreeNode {
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
    int sum1=0;int sum2=0;
    public int maxProduct(TreeNode root) {
        return 0;
    }
    public void iterate(TreeNode root,int sum){
        if(root.left!=null && root.right!=null){
            sum1+=root.val;
            iterate(root.right,sum1);
        }
        else{
            if(root.left!=null){

            }
        }

    }
}
