package JAN_24th_2023;

import JAN_11_2023.TreeNode;

import java.util.ArrayDeque;
public class MaximumDepthOfBinaryTree {
    //Runtime: 1ms beats 14.63%, Memory: 42.3MB beats 56.91%
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        else{
            int[] level={1};
            ArrayDeque<TreeNode> counter=new ArrayDeque<>();
            counter.push(root);
            goDown(counter,level);
            return level[0];
        }
    }
    public void goDown(ArrayDeque<TreeNode> maker, int[] val){
        int count=maker.size();
        for(int i=0;i<count;i++){
            TreeNode node=maker.pollFirst();
            if(node.left!=null && node.right!=null){
                maker.add(node.left);
                maker.add(node.right);
            }else if(node.left!=null){
                maker.add(node.left);
            }else if(node.right!=null){
                maker.add(node.right);
            }
        }
        if(!maker.isEmpty()){
            val[0]++;
            goDown(maker,val);
        }
    }
    public static void main(String...args){
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)))));
        TreeNode tn=new TreeNode(1,new TreeNode(2,new TreeNode(4),null),new TreeNode(3,null,new TreeNode(5)));
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(tn));
    }
}
