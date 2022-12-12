package From_10th_December_UnderProgress;
import java.util.ArrayList;
public class MaximumProductOfSplitBinaryTree {
    //primitive, based on test-cases
    //works for 10/54 test cases
    //fails on the 11th test case
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
    private int sum1=0;
    private int sum2=0;
    private ArrayList<TreeNode> gotcha=new ArrayList<>();

    public int maxProduct(TreeNode root) {
        finder(root);
        sum1=0;
        if(gotcha.isEmpty()){
            return 1;
        }
        else if(gotcha.size()==2){
            sideStream(root.left);
            sum2=sum1;
            sum1=0;
            sideStream(root,root.left);
            return sum1*sum2;
        }else{
            TreeNode main=gotcha.get(0);
            sideStream(root,main);
            sum2=sum1;
            sum1=0;
            sideStream(main);
            return sum1*sum2;
        }
    }
    public void finder(TreeNode root){
        if(root.left!=null && root.right==null){
            sum1+=root.left.val;
            finder(root.left);
        }else if(root.right!=null && root.left==null){
            sum1+=root.right.val;
            finder(root.right);
        }
        if(root.left!=null && root.right!=null){
            if(sum1==0){
                gotcha.add(root.left);
                gotcha.add(root);
            }else{
                gotcha.add(root.right);
            }

        }

        //return find;//this is an error-prone condition, if in case the method doesn't work trying using void
    }
    public void sideStream(TreeNode node,TreeNode except){
        sum1+=node.val;
        if(node.left!=null && node.left!=except){
            sideStream(node.left,except);
        }
        if(node.right!=null && node.right!=except){
            sideStream(node.right,except);
        }
    }
    public void sideStream(TreeNode node){
        sum1+=node.val;
        if(node.left!=null){
            sideStream(node.left);
        }
        if(node.right!=null){
            sideStream(node.right);
        }
    }
    public static void main(String...args){
        TreeNode node=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6),null));
        TreeNode node2=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),new TreeNode(4,new TreeNode(5),new TreeNode(6))));
        TreeNode node3=new TreeNode(1,new TreeNode(1),null);
        System.out.println(new MaximumProductOfSplitBinaryTree().maxProduct(node));
        System.out.println(new MaximumProductOfSplitBinaryTree().maxProduct(node2));
        System.out.println(new MaximumProductOfSplitBinaryTree().maxProduct(node3));
    }
    //[6,10,null,null,6,1,null,1]
    //                     6
    //                    / \
    //                   /   \
    //                  10   null
    //

}
