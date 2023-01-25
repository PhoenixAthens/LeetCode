package JAN_24th_2023;

public class PathSum {
    //Runtime: 0ms beats 100%, Memory: 43.9MB beats 13.54%
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        else{
            int sum=root.val;
            if(root.left==null && root.right==null){
                return sum==targetSum;
            }
            else{
                boolean[] val={false};
                digging(root,val,sum,targetSum);
                return val[0];
            }

        }
    }
    public void digging(TreeNode root,boolean[] val, int sum, int target){
        if(root.left!=null){
            digging(root.left,val,sum+root.left.val,target);
        }
        if(root.right!=null){
            digging(root.right,val,sum+root.right.val,target);
        }
        if(root.left==null && root.right==null){
            if(sum==target)val[0]=true;
        }
    }

}
