package January_2023.Jan_1st_2023;
// using pointers
// Runtime: 0ms beats 100%, Memory: 39.9MB

public class MiddleOfTheLinkedList_ED2 {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public ListNode middleNode(ListNode head) {
         ListNode middle=head;
         ListNode end=head;
         //we made end as well just to keep things clear, we could have simply used head in place of end as well!!
         while(end!=null && end.next!=null ){
            middle=middle.next;
            end=end.next.next;
         }
         return middle;
     }
}
