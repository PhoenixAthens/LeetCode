package February_2023;
import java.util.*;
//Date: 20th Feb, 2023
public class BT_ZigZagLevelOrderTraversal {
    //Runtime: 1ms beats 87.41%, Memory: 40.81MB beats 81.93%
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val){this.val=val;}
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        boolean[] right={true};
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>(List.of(root.val)));
        ArrayDeque<ArrayDeque<TreeNode>> nodes=new ArrayDeque<>();
        nodes.push(new ArrayDeque<>(List.of(root)));
        levelOrderTraversal(nodes,result,right);
        return result;
    }
    public void levelOrderTraversal(ArrayDeque<ArrayDeque<TreeNode>> traverse, List<List<Integer>> result, boolean[] zigzag){
        ArrayDeque<TreeNode> lastEntry=traverse.peek();
        ArrayDeque<TreeNode> development=new ArrayDeque<>();
        ArrayList<Integer> levelC=new ArrayList<>();
        if(zigzag[0]){
            //going from right
            while(!lastEntry.isEmpty()){
                TreeNode current=lastEntry.pop();
                if(current.left!=null && current.right!=null){
                    levelC.add(current.right.val);
                    levelC.add(current.left.val);
                    development.push(current.right);
                    development.push(current.left);
                }else if(current.right!=null){
                    levelC.add(current.right.val);
                    development.push(current.right);
                }else if(current.left!=null){
                    levelC.add(current.left.val);
                    development.push(current.left);
                }
            }
            zigzag[0]=false;
        }else{
            //going from left
            while(!lastEntry.isEmpty()){
                TreeNode current=lastEntry.pop();
                if(current.left!=null && current.right!=null){
                    levelC.add(current.left.val);
                    levelC.add(current.right.val);
                    development.push(current.left);
                    development.push(current.right);
                }else if(current.left!=null){
                    levelC.add(current.left.val);
                    development.push(current.left);
                }else if(current.right!=null){
                    levelC.add(current.right.val);
                    development.push(current.right);
                }
            }
            zigzag[0]=true;
        }
        if(development.size()>0){
            traverse.push(development);
            result.add(levelC);
            levelOrderTraversal(traverse,result,zigzag);
        }
    }
}
