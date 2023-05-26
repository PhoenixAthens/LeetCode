package May_2023;

public class Delete_Node_In_A_LinkedList {
    //Date: 26th May 2023
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
        }
    }
    //Runtime: 0ms, Memory: 43.2MB
    public void deleteNode(ListNode node){
        ListNode prev=node;
        node.val=node.next.val;
        node=node.next;
        while(node.next!=null){
            node.val=node.next.val;
            node=node.next;
            prev=prev.next;
        }
        prev.next=null;
    }
}
