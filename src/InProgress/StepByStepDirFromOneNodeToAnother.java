package InProgress;

public class StepByStepDirFromOneNodeToAnother {
    //Figure the tree put!!

     static class TreeNode {
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
    static class Solution {
        public String getDirections(TreeNode root, int startValue, int destValue) {
            TreeNode copy=root;
            StringBuilder path= new StringBuilder();
            if(root.val==startValue){
                while(copy.val!=destValue){
                    copy=copy.left;
                    path.append("L");

                }
            }
            return null;
        }
    }
    public static void main(String...args){
         System.out.println(new Solution().getDirections((new TreeNode(5,new TreeNode(1,new TreeNode(3),null),new TreeNode(2,new TreeNode(6),new TreeNode(4)))),3,6));
        //[5,1,2,3,null,6,4]
     }
}
