package JAN_16_2023;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {
    //Runtime: 1ms beats 82.31%, Memory: 42.3MB beats 79.51%;
     public static class TreeNode {
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
         List<List<Integer>> main=new ArrayList<>();
         int level=0;
         if(root!=null){
             ArrayDeque<TreeNode> nodes=new ArrayDeque<>();
             nodes.push(root);
             verse(nodes,main);
         }else{
             return new ArrayList<>();
         }
         return main;
    }
    public void verse(ArrayDeque<TreeNode> nodes, List<List<Integer>> list){

        ArrayDeque<TreeNode> nodeNext=new ArrayDeque<>();
        LinkedList<Integer> lol=new LinkedList<>();
        while(!nodes.isEmpty()){
            TreeNode present=nodes.pollFirst();
            if(present.left!=null &&present.right!=null){
                nodeNext.add(present.left);
                nodeNext.add(present.right);
            }else if(present.left!=null){
                nodeNext.add(present.left);
            }else if(present.right!=null){
                nodeNext.add(present.right);
            }
            lol.add(present.val);
        }
        list.add(lol);
        if(!nodeNext.isEmpty())verse(nodeNext,list);
    }
    /*public void finder(int level,HashMap<Integer,List<TreeNode>>map){
         List<TreeNode> list=map.get(level-1);
         for(TreeNode nodes:list){
             if(nodes.left!=null && nodes.right!=null){
                 if(map.containsKey(level))map.get(level).addAll(new LinkedList<>(List.of(nodes.left,nodes.right)));
                 else map.put(level,new LinkedList<>(List.of(nodes.left,nodes.right)));
             }else if(nodes.left!=null){
                 if(map.containsKey(level))map.get(level).addAll(new LinkedList<>(List.of(nodes.left)));
                 else map.put(level,new LinkedList<>(List.of(nodes.left)));
             }else if(nodes.right!=null){
                 if(map.containsKey(level))map.get(level).addAll(new LinkedList<>(List.of(nodes.right)));
                 else map.put(level,new LinkedList<>(List.of(nodes.right)));
             }
         }
         if(map.get(level).size()==0)return;
         System.out.println(map);
         finder(level++,map);

    }*/
    /*public void recurse(ArrayDeque<TreeNode> queue,List<List<Integer>> main){

        TreeNode start=queue.pollFirst();
        if(start.left!=null && start.right!=null){
            queue.add(start.left);
            queue.add(start.right);
            main.add(new LinkedList<>(List.of(start.left.val,start.right.val)));
        }else if(start.left!=null){
            queue.add(start.left);
            main.add(new LinkedList<>(List.of(start.left.val)));
        }else if(start.right!=null){
            queue.add(start.right);
            main.add(new LinkedList<>(List.of(start.right.val)));
        }

        recurse(queue,main);
    }*/

    public static void main(String...args){
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<100;i++){
            queue.add(i);
        }
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        TreeNode node=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(node));
    }
}
