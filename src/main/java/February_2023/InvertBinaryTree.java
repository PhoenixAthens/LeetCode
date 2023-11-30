package February_2023;
//Date: 19th Feb, 2023
public class InvertBinaryTree {
    //Runtime: 0ms beats 100%, Memory: 39.8MB beats 85.11%
    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(){}
        public TreeNode(int val){this.val=val;}
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        invert(root);
        traverseRest(root);
        return root;
    }
    public void traverseRest(TreeNode root){
        if(root.left!=null){
            invert(root.left);
            traverseRest(root.left);
        }
        if(root.right!=null){
            invert(root.right);
            traverseRest(root.right);
        }

    }
    public void invert(TreeNode root){
        if(root.left!=null && root.right!=null){
            TreeNode tempLeft=root.left;
            root.left=root.right;
            root.right=tempLeft;
        }else if(root.left!=null){
            root.right=root.left;
            root.left=null;
        }else if(root.right!=null){
            root.left=root.right;
            root.right=null;
        }
    }
    public static void main(String...args){
        TreeNode nodes=new TreeNode(4, new TreeNode(2, new TreeNode(1),new TreeNode(3)),new TreeNode(7, new TreeNode(6),new TreeNode(9)));
        new InvertBinaryTree().invertTree(nodes);
    }
}
