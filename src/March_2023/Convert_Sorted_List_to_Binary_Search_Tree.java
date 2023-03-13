package March_2023;
import java.util.ArrayList;
public class Convert_Sorted_List_to_Binary_Search_Tree {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> listOfElements=new ArrayList<>();
        while(head!=null){
            listOfElements.add(head.val);
            head=head.next;
        }
        if(listOfElements.size()==0)return null;
        int rootIndex=(listOfElements.size()-1)/2;
        int midVal= listOfElements.get(rootIndex);
        TreeNode tree=new TreeNode(midVal);
        TreeNode temp=tree;
        for(int i=rootIndex-1;i>=0;i--){
            temp.left=new TreeNode(listOfElements.get(i));
            temp=temp.left;
        }
        temp=tree;
        for(int i=rootIndex+1;i<listOfElements.size();i++){
            temp.right=new TreeNode(listOfElements.get(i));
            temp=temp.right;
        }
        return tree;
    }
}
