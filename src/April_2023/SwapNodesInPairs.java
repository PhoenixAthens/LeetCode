package April_2023;

public class SwapNodesInPairs {
    //Runtime: 0ms beats 100%, Memory: 40.4MB beats 41.82%
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        curse(head);
        return head;
    }
    public void curse(ListNode node){
        if(node==null || node.next==null)return;
        int val=node.val;
        node.val=node.next.val;
        node.next.val=val;
        curse(node.next.next);
    }
}
