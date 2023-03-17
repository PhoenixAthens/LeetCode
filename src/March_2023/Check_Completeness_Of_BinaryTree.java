package March_2023;
import March_2023.Sum_Root_To_Leaf_Numbers_SecondIteration.TreeNode;

import java.util.*;
//Date: March 18th 2023
public class Check_Completeness_Of_BinaryTree {
    //Runtime: 1ms beats 89.96%, Memory: 41.9MB beats 78.1%
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean nullNode=false;
        while(!queue.isEmpty()){
            TreeNode present=queue.poll();
            if(present==null)nullNode=true;
            else{
                if(nullNode)return false;
                else{
                    queue.offer(present.left);
                    queue.offer(present.right);
                }
            }
        }
        return true;
    }
}
