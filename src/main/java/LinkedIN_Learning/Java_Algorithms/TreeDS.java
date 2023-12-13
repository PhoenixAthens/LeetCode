package LinkedIN_Learning.Java_Algorithms;

import java.util.ArrayList;

class Node{
    Node left;
    Node right;
    int data;
}
public class TreeDS {
    static class BinaryTree{
        Node root;
        public void add(int value){
            root = insert(root, value);
        }
        private Node insert(Node root, int value){
            if(root == null){
                root = new Node();
                root.data = value;
            }else if(value < root.data){
                root.left = insert(root.left,value);
            }else if(value > root.data){
                root.right = insert(root.right, value);
            }
            return root;
        }
        public void inOrder(){
            ArrayList<Integer> list = new ArrayList<>();
            inOrderTraversal(list,this.root);
            System.out.println(list);
        }
        private void inOrderTraversal(ArrayList<Integer> list, Node root){
            if(root!=null){
                if(root.left!=null) inOrderTraversal(list, root.left);
                list.add(root.data);
                if(root.right!=null) inOrderTraversal(list, root.right);
            }
        }
        public void preOrder(){
            ArrayList<Integer> list = new ArrayList<>();
            preOrderTraversal(list,this.root);
            System.out.println(list);
        }
        private void preOrderTraversal(ArrayList<Integer> list, Node root){
            if(root!=null){
                list.add(root.data);
                if(root.left!=null) preOrderTraversal(list, root.left);
                if(root.right!=null) preOrderTraversal(list, root.right);
            }
        }
        public void postOrder(){
            ArrayList<Integer> list = new ArrayList<>();
            postOrderTraversal(list,this.root);
            System.out.println(list);
        }
        private void postOrderTraversal(ArrayList<Integer> list, Node root){
            if(root!=null){
                if(root.left!=null) postOrderTraversal(list, root.left);
                if(root.right!=null) postOrderTraversal(list, root.right);
                list.add(root.data);
            }
        }
        public boolean searchInBT( int value){
            return search(root,value);
        }
        private boolean search(Node root, int value){
            if(root!=null){
                if(value < root.data)return search(root.left,value);
                if(value > root.data) return search(root.right, value);
                return true;
            }
            return false;
        }
    }

    public static void main(String... args){
        BinaryTree bt = new BinaryTree();
        bt.add(2);
        bt.add(1);
        bt.add(9);
        bt.add(4);
        bt.add(5);
        bt.add(3);
        bt.inOrder();//  [1, 2, 3, 4, 5, 9]
        bt.preOrder();// [2, 1, 9, 4, 3, 5]
        bt.postOrder();// [1, 3, 5, 4, 9, 2]
        System.out.println(bt.searchInBT(9)); //true
        System.out.println(bt.searchInBT(11)); //false
        System.out.println(bt.searchInBT(5)); //true
        System.out.println(bt.searchInBT(20)); //false

    }
}
