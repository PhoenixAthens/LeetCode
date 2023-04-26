package April_2023;
import April_2023.SwapNodesInPairs.ListNode;
public class ReverseLinkedList {
    //Runtime: 0ms beats 100%, Memory: 42.5MB beats 62.52%
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode result=new ListNode(head.val);
        return cursive(result,head.next);
    }
    public ListNode cursive(ListNode result,ListNode head) {
        if(head==null)return result;
        ListNode temp=result;
        result=new ListNode(head.val);
        result.next=temp;
        return cursive(result,head.next);
    }
}
