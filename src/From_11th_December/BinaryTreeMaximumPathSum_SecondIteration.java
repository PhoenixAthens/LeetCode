package From_11th_December;
public class BinaryTreeMaximumPathSum_SecondIteration {
    //works for 31/94 test-cases
    //fails at 32nd testCase;
    int sum=0;
    public int maxPathSum(TreeNode root) {
        sum=root.val;
        traverse(root);
        return sum;
    }
    public boolean traverse(TreeNode root){
        if(root.left!=null && root.right!=null){
            if(root.val>sum)sum=root.val;
            if(traverse(root.left) && traverse(root.right)) {
                int tempSum = root.val + root.left.val + root.right.val;
                if(tempSum>sum)
                    sum=tempSum;
            }

        }else{
            if(root.right==null && root.left==null){
                if(root.val>sum)sum=root.val;
                return true;
            }
            if(root.left!=null){
                if(root.val>sum)sum=root.val;
                traverse(root.left);
            }
            if(root.right!=null){
                if(root.val>sum)sum=root.val;
                traverse(root.right);
            }
        }
        return false;
    }
}
