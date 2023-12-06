package November_2022;
public class CountCompleteTreeNodes {
    //Time: 0ms beats 100%, Memory: 45.2MB beats 56.82%
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
    public static int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            return recurse(1,root);
        }
    }
    public static int recurse(int count,TreeNode root){
        if(root.left==null && root.right==null){
            return count;
        }else if(root.left!=null && root.right==null){
            return count+recurse(count,root.left);
        }else if(root.right!=null && root.left==null){
            return count+recurse(count,root.right);
        }else{
            return count+recurse(count,root.left)+recurse(count,root.right);
        }
    }


    public static void main(String...args){
        TreeNode tn=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6),null));
        TreeNode gn=null;
        TreeNode dn=new TreeNode(1,new TreeNode(2),null);
        System.out.println(countNodes(gn));
    }

}
