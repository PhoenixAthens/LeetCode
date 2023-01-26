package December_2022.From_9th_December;

public class MaximumDifferenceBetweenNodeAndAncestor {
    // Runtime:179 ms beats 7.2%, Memory: 42.2MB beats 76.13%
    // Some optimization, and a few re-runs results in Runtime reduction from
    // 179ms to 92 ms
    // The solution is still slower than what it can be!
    //
    // eliminating the use of field for storing difference might help!

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
    private static int answer=0;
    public static int maxAncestorDiff(TreeNode root) {
        All(root);
        return answer;
    }
    public static void All(TreeNode root){
        if(root.left!=null){
            FromRootToLead(root,root);
            All(root.left);
        }
        if(root.right!=null){
            FromRootToLead(root,root);
            All(root.right);
        }
    }
    public static void FromRootToLead(TreeNode root,TreeNode next){
        /**
         * next is the changing head,
         * root on the other hand will stay consistent
         * */
        if(next.left!=null){
            int tempDiff=Math.abs(root.val-next.left.val);
            if(tempDiff>answer) answer=tempDiff;
            FromRootToLead(root,next.left);
        }
        if(next.right!=null){
            int tempDiff=Math.abs(root.val-next.right.val);
            if(tempDiff>answer) answer=tempDiff;
            FromRootToLead(root,next.right);
        }
    }
    public static void main(String...args){
    //[8,3,10,1,6,null,14,null,null,4,7,13]
        TreeNode node=new TreeNode(8,new TreeNode(3,new TreeNode(1),new TreeNode(6,new TreeNode(4),new TreeNode(7))),new TreeNode(10,null,new TreeNode(14,new TreeNode(13),null)));
        TreeNode node2=new TreeNode(5,new TreeNode(2),new TreeNode(9));
        System.out.println(maxAncestorDiff(node2));
        System.out.println(maxAncestorDiff(node));
        //                            8
        //                           / \
        //                          /   \
        //                         /     \
        //                        3       10
        //                       / \        \
        //                      /   \        \
        //                     1     6        14
        //                          / \      /
        //                         4   7    13
    }
}
