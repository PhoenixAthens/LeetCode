package February_2023;


import java.util.*;
//Still working on IT!
public class FindDuplicateSubtrees{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.right=right;
            this.left=left;
        }
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if(root==null)return new ArrayList<>();
        else{
            Stack<ArrayList<Integer>> list=new Stack<>();
            ArrayList<Integer> list2=new ArrayList<>();
            List<TreeNode> ans=new ArrayList<>();
            GoDown(root,list,ans);
            return ans;
        }
    }
    public void GoDown(TreeNode root,Stack<ArrayList<Integer>> list,List<TreeNode> answer){
        if(root.left!=null){
            GoDown(root.left,list,answer);
            ArrayList<Integer> temp=list.peek();
            temp.add(root.left.val);
            if(list.contains(temp))answer.add(root.left);
            else list.push(temp);
        }
        if(root.right!=null){
            GoDown(root.right,list,answer);
            ArrayList<Integer> temp=list.peek();
            temp.add(root.right.val);
            if(list.contains(temp))answer.add(root.right);
            else list.push(temp);
        }
        if(root.left==null && root.right==null){
           ArrayList<Integer> temp=new ArrayList<>(List.of(root.val));
           list.push(temp);
        }
    }
    public static void main(String...args){
        ArrayList<Integer> arr1=new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> arr2=new ArrayList<>(List.of(1,2,3));
        ArrayList<ArrayList<Integer>> arr3=new ArrayList<>();
        arr3.add(arr1);
        System.out.println(arr3.contains(arr2));


    }
}
