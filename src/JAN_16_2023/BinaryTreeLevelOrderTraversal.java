package JAN_16_2023;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        List<List<Integer>> l=new LinkedList<>();
        l.add(new ArrayList<>(List.of(Objects.requireNonNull(queue.pollFirst()).val)));
        while(!queue.isEmpty()){
        }
        return null;
    }
    public void recurse(ArrayDeque<TreeNode> queue,List<List<Integer>> main){
        TreeNode start=queue.pollFirst();
        if(start.left!=null && start.right!=null){
            queue.add(start.left);
            queue.add(start.right);
        }else if(start.left!=null){
            queue.add(start.left);
        }else if(start.right!=null){
            queue.add(start.right);
        }

        recurse(queue,main);
    }
    public static void main(String...args){
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<100;i++){
            queue.add(i);
        }
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
