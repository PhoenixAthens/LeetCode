package JAN_13_2023;
import java.util.*;
public class BinaryTreeInorderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        if(root.left==null && root.right==null) {
            list.add(root.val);
            return list;
        }
        Traverse(root,list);
        return list;

    }
    public void Traverse(TreeNode node, ArrayList<Integer> list){
        if(node.left!=null) {
            Traverse(node.left, list);
        }
        list.add(node.val);
        if(node.right!=null){
            Traverse(node.right,list);
        }

    }
    public static void main(String...args){
        TreeNode n1=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        TreeNode n2=new TreeNode();
        TreeNode n3=new TreeNode(1);
        TreeNode n4=new TreeNode(1, new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(6),null)),new TreeNode(3,null,new TreeNode(5,new TreeNode(7,null,new TreeNode(9)),new TreeNode(8))));
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(n1));
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(n2));
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(n3));
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(n4));

    }
}
