package May_2023;
import May_2023.SwappingNodesInALinkedList.ListNode;
//This code is inspired by someone else's code!
//Date: 15th May 2023
public class SwappingNodesInALinkedList_SecondAttempt {
    //Runtime: 2ms, Memory: 57MB
    public ListNode swapNodes(ListNode head, int k) {
        ListNode OneBehind=head;
        ListNode firstStop=head;
        ListNode LastStop=head;
        int i=1;
        while(i<k){
            firstStop=firstStop.next;
            LastStop=LastStop.next;
            i++;
        }
        while(LastStop.next!=null){
            LastStop=LastStop.next;
            OneBehind=OneBehind.next;
        }
        int tempVal= firstStop.val;
        firstStop.val=OneBehind.val;
        OneBehind.val=tempVal;
        return head;
    }
    public static void main(String...args){
        ListNode submit=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result=new SwappingNodesInALinkedList_SecondAttempt().swapNodes(submit,2);
        while(result!=null){
            System.out.print(result.val);
            System.out.print(",");
            result=result.next;
        }
    }
}
