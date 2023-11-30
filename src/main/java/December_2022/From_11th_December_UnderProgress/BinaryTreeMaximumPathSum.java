package December_2022.From_11th_December_UnderProgress;

public class BinaryTreeMaximumPathSum {
    //works for 14/94 test-cases
    //fails at 15th test-case
    int sum=0;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return sum;
    }
    public boolean traverse(TreeNode root){
        if(root.left!=null && root.right!=null){
            if(traverse(root.left) && traverse(root.right)) {
                int tempSum = root.val + root.left.val + root.right.val;
                if(tempSum>sum)
                    sum=tempSum;
            }

        }else{
            if(root.right==null && root.left==null){
                sum+=root.val;
                return true;
            }
            if(root.left!=null){
                traverse(root.left);
            }
            if(root.right!=null){
                traverse(root.right);
            }
        }
        return false;
    }

}
