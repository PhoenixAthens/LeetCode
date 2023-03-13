package March_2023;
import java.util.ArrayList;
//Date: 13th March 2023
public class Convert_Sorted_List_to_Binary_Search_Tree {
    //Runtime: 1ms beats 33.97%, Memory: 43.7MB beats 69.58%
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
        ArrayList<Integer> fromList=new ArrayList<>();
        while(head!=null){
            fromList.add(head.val);
            head=head.next;
        }
        if(fromList.size()==0)return null;
        else if(fromList.size()==1)return new TreeNode(fromList.get(0));
        return maker(0,fromList.size(),fromList);
    }
    public TreeNode maker(int start, int stop, ArrayList<Integer> arr){
        int len=stop-start;
        if(len==0)return null;
        else{
            int middle=len/2+start;
            TreeNode result=new TreeNode(arr.get(middle));
            result.left=maker(start,middle,arr);
            result.right=maker(middle+1,stop,arr);
            return result;
        }
    }
}
