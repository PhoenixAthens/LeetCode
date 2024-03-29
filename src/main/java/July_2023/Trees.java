package July_2023;

import java.util.*;

public class Trees {
    public static class TreeDef{
        private int root;
        private TreeDef leftNode;
        private TreeDef rightNode;
        public TreeDef(int rootVal){
            this.root=rootVal;
            leftNode=null;
            rightNode=null;
        }
        public TreeDef(int val, TreeDef leftNode, TreeDef rightNode){
            this.root = val;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }
    public static ArrayList<Integer> inorderTraversal(TreeDef tree, ArrayList<Integer> recorder){
        if(tree!=null){
            inorderTraversal(tree.leftNode,recorder);
            recorder.add(tree.root);
            inorderTraversal(tree.rightNode,recorder);
        }
        return recorder;
    }
    public static ArrayList<Integer>  preOrderTraversal(TreeDef tree, ArrayList<Integer> recorder){
        if(tree!=null){
            recorder.add(tree.root );
            preOrderTraversal(tree.leftNode, recorder);
            preOrderTraversal(tree.rightNode, recorder);
        }
        return recorder;
    }
    public static ArrayList<Integer> postOrderTraversal(TreeDef tree, ArrayList<Integer> recorder){
        if(tree!=null){
            postOrderTraversal(tree.leftNode,recorder );
            postOrderTraversal(tree.rightNode,recorder);
            recorder.add(tree.root);
        }
        return recorder;
    }
    //Using loop
    public static ArrayList<Integer> BFS_1_loop(TreeDef tree){
        ArrayList<Integer> result=new ArrayList<>();
        if(tree!=null){
            ArrayDeque<TreeDef> deque = new ArrayDeque<>();
            deque.addLast(tree);
            while(!deque.isEmpty()){
                TreeDef currentNode = deque.removeFirst();
                if(currentNode!=null){
                    result.add(currentNode.root);
                    if(currentNode.leftNode!=null)deque.addLast(currentNode.leftNode);
                    if(currentNode.rightNode!=null)deque.addLast(currentNode.rightNode);
                }
            }
        }
        return result;
    }
    //Using Recursion
    public static ArrayList<Integer> BFS_1_recursion(ArrayDeque<TreeDef> deq, ArrayList<Integer> cassette){
        if(deq.isEmpty())return cassette;
        TreeDef currentNode = deq.removeFirst();
        cassette.add(currentNode.root);
        if(currentNode.leftNode!=null)deq.addLast(currentNode.leftNode);
        if(currentNode.rightNode!=null)deq.addLast(currentNode.rightNode);
        return BFS_1_recursion(deq,cassette);
    }
    //Implement BFS from Mathematics II
    public static void main(String...args){
        // Let A-Z be represented by 1-26
        TreeDef tree1= new TreeDef(1,
                new TreeDef(2,
                        new TreeDef(4),
                        null),
                new TreeDef(3,
                        new TreeDef(5,
                                new TreeDef(7),
                                null
                        ),
                        new TreeDef(6))
                );

        System.out.println("The inorder-traversal of tree gives us: "+inorderTraversal(tree1,new ArrayList<>()));
        System.out.println("The preorder-traversal of tree gives us: "+preOrderTraversal(tree1,new ArrayList<>()));
        System.out.println("The postorder-traversal of tree gives us: "+postOrderTraversal(tree1, new ArrayList<>()));
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.addLast(5);
        numbers.addLast((6));
        System.out.println(numbers.removeFirst());
        System.out.println("The BFS of tree gives us: "+BFS_1_loop(tree1));
        System.out.println("The BFS of tree gives us: "+BFS_1_recursion(new ArrayDeque<>(List.of(tree1)),new ArrayList<>()));

    }


}
