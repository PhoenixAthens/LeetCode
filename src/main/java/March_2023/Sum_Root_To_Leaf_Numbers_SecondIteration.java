package March_2023;
import java.util.ArrayList;
//Date: 14th March 2023
public class Sum_Root_To_Leaf_Numbers_SecondIteration{
    //Runtime: 0ms beats 100%, Memory: 40.2MB beats 34.34%
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
    public static int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        else{
            ArrayList<Integer> deque=new ArrayList<>();
            int[] total={0};
            int[] level={0};
            depthGoer(root,deque,total,level);
            return total[0];
        }
    }
    public static void depthGoer(TreeNode node,ArrayList<Integer> toDown, int[] total, int[] level){
        if(node.left!=null){
            toDown.add(node.val);
            level[0]++;
            depthGoer(node.left,toDown,total,level);
            level[0]--;
            ArrayList<Integer> changer=new ArrayList<>();
            int i=0;
            while(i<level[0]){
                changer.add(toDown.get(i));
                i++;
            }
            toDown=changer;
        }
        if(node.right!=null){
            toDown.add(node.val);
            level[0]++;
            depthGoer(node.right,toDown,total,level);
            level[0]--;
            ArrayList<Integer> changer=new ArrayList<>();
            int i=0;
            while(i<level[0]){
                changer.add(toDown.get(i));
                i++;
            }
            toDown=changer;
        }
        if(node.left==null && node.right==null){
            total[0]+=node.val;
            int val=10;
            int i=toDown.size()-1;
            while(i>-1){
                total[0]+=toDown.get(i)*val;
                val*=10;
                i--;
            }
        }
    }
    public static void main(String...args){
        var result1=sumNumbers(new TreeNode(1,new TreeNode(2),new TreeNode(3)));
        var result2=sumNumbers(new TreeNode(4,new TreeNode(9,new TreeNode(5), new TreeNode(1)),new TreeNode(0)));
        System.out.println(result1);
        System.out.println(result2);
    }
}
