public class UniValuesBT {
    //Runtime: 0ms, Memory: 40.86MB

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
    public boolean isUnivalTree(TreeNode root) {
        int rootval = root.val;
        return iterate(root, rootval);
    }

    public boolean iterate(TreeNode current, int rootVal) {
         boolean left = (current.left==null) || (current.left.val == rootVal && iterate(current.left, rootVal));
         boolean right = (current.right==null) || (current.right.val == rootVal && iterate(current.right, rootVal));
         return left && right;
    }
    public static void main(String...args){
         TreeNode node = new TreeNode(2,new TreeNode(2, new TreeNode(5),new TreeNode(2)), new TreeNode(2));
         System.out.println(new UniValuesBT().isUnivalTree(node));
         TreeNode node2 = new TreeNode(9,new TreeNode(9, new TreeNode(9),new TreeNode(9)), new TreeNode(6));
         System.out.println(new UniValuesBT().isUnivalTree(node2));

    }
}
