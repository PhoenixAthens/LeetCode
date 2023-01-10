package JAN_10_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class SameTree {
    //Runtime: 0ms beats 100%, Memory: 39.7MB beats 81.46%
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        if(p==null && q==null) return true;
        else if(p==null || q==null)return false;
        else if(p.val!=q.val ) return false;
        else if(p.left==null && q.left==null && p.right==null && q.right==null) {
            return p.val == q.val;
        }
        checker(p,arr1);
        checker(q,arr2);
        return arr1.equals(arr2);

    }
    public void checker(TreeNode p,ArrayList<Integer> arr){
        if(p.left!=null){
            arr.add(p.left.val);
            checker(p.left,arr);
        }else{
            arr.add(0);
        }
        if(p.right!=null){
            arr.add(p.right.val);
            checker(p.right,arr);
        }else{
            arr.add(0);
        }

    }
}
