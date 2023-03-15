package March_2023;

import java.util.ArrayDeque;
import March_2023.Sum_Root_To_Leaf_Numbers_SecondIteration.TreeNode;
//Date: 14th March 2023
public class Sum_Root_To_Leaf_Numbers {
    //Runtime: 1ms beats 29.90%, Memory: 40.2MB beats 34.34%
    public static int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        else{
            ArrayDeque<Integer> deque=new ArrayDeque<>();
            int[] total={0};
            int[] level={0};
            depthGoer(root,deque,total,level);
            return total[0];
        }
    }
    public static void depthGoer(TreeNode node,ArrayDeque<Integer> toDown, int[] total, int[] level){
        if(node.left!=null){
            toDown.push(node.val);
            level[0]++;
            depthGoer(node.left,toDown,total,level);
            level[0]--;
            while(toDown.size()!=level[0]){
                toDown.pop();
            }
        }
        if(node.right!=null){
            toDown.push(node.val);
            level[0]++;
            depthGoer(node.right,toDown,total,level);
            level[0]--;
            while(toDown.size()!=level[0]){
                toDown.pop();
            }
        }
        if(node.left==null && node.right==null){
            total[0]+=node.val;
            int val=10;
            ArrayDeque<Integer> copyOF = new ArrayDeque<>(toDown);
            while(!copyOF.isEmpty()){
                total[0]+=copyOF.pop()*val;
                val*=10;
            }
        }
    }

}
