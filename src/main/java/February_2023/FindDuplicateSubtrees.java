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
            ArrayList<ArrayList<Integer>> list=new ArrayList<>();
            ArrayList<Integer> temp=new ArrayList<>();
            List<TreeNode> answer=new ArrayList<>();
            GoDown(root,list,answer,temp);
            return answer;
        }
    }
    public void GoDown(TreeNode root,ArrayList<ArrayList<Integer>> list,List<TreeNode> answer,ArrayList<Integer> temp){
        if(root.left!=null){
            GoDown(root.left,list,answer,temp);
            ArrayList<Integer> temp2=new ArrayList<>(temp);
            temp2.add(root.val);
            temp.add(root.val);
            if(list.contains(temp2))answer.add(root.left);
            list.add(temp2);
        }
        if(root.right!=null){
            temp=new ArrayList<>();
            GoDown(root.right,list,answer,temp);
            ArrayList<Integer> temp2=new ArrayList<>(temp);
            temp2.add(root.val);
            temp.add(root.val);
            if(list.contains(temp2))answer.add(root.right);
            list.add(temp2);
        }
        if(root.left!=null && root.right!=null){
            temp.add(root.val);
            if(list.contains(temp))answer.add(root);
            else list.add(temp);
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
