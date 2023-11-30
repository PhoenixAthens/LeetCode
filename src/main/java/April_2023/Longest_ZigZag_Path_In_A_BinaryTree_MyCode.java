package April_2023;
//Left: false
//Right: true
//bfs and then gunIn
import java.util.Stack;

public class Longest_ZigZag_Path_In_A_BinaryTree_MyCode {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right= right;
        }
    }
    public int longestZigZag(TreeNode root) {
        int[] counter = {0};
        Stack<TreeNode> deque=new Stack<>();
        deque.push(root);
        DFS(deque,counter);
        return counter[0];
    }

    private int caller(TreeNode root) {
        int[] l={0};
        int[] r={0};
        gunIn(root,false,l);
        gunIn(root,true, r);
        return Math.max(l[0],r[0]);
    }

    public void DFS(Stack<TreeNode> deque, int[] counter ){
        while(!deque.isEmpty()){
            TreeNode current = deque.pop();
            int result = caller(current);
            counter[0]=Math.max(result,counter[0]);
            if(current.left!=null){
                deque.push(current.left);

            }
            if(current.right!=null){
                deque.push(current.right);
            }
        }
    }
    public void gunIn(TreeNode root, boolean direction,int[] counter){
        if(direction){
            if(root.right!=null){
                counter[0]++;
                gunIn(root.right,false,counter);
            }
        }else{
            if(root.left!=null){
                counter[0]++;
                gunIn(root.left,true,counter);
            }
        }
    }
    public static void main(String...args){
        TreeNode node = new TreeNode(1,
                new TreeNode(1,
                        null,
                        new TreeNode(1,
                                new TreeNode(1,null,new TreeNode(1)),
                                new TreeNode(1))),
                new TreeNode(1));
        System.out.println(new Longest_ZigZag_Path_In_A_BinaryTree_MyCode().longestZigZag(node));
        System.out.println(new Longest_ZigZag_Path_In_A_BinaryTree_MyCode().longestZigZag(new TreeNode(1)));
    }
}
