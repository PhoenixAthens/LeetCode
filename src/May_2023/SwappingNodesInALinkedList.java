package May_2023;

import java.util.ArrayList;

public class SwappingNodesInALinkedList {
    //Runtime: 6ms, Memory: 57MB
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> keeper=new ArrayList<>();
        ListNode headCopy=head;
        while(head!=null){
            keeper.add(head);
            head=head.next;
        }
        int total=keeper.size();
        ListNode fromStart=keeper.get(k-1);
        int valueFromStart=fromStart.val;
        ListNode fromEnd=keeper.get(total-k);
        fromStart.val=fromEnd.val;
        fromEnd.val=valueFromStart;
        return headCopy;
    }
    public static void main(String...args){
        ListNode submit=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result=new SwappingNodesInALinkedList().swapNodes(submit,2);
        while(result!=null){
            System.out.print(result.val);
            System.out.print(",");
            result=result.next;
        }
    }
}
