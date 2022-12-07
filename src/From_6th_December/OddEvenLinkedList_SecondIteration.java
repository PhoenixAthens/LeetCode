package From_6th_December;

public class OddEvenLinkedList_SecondIteration {
    //Runtime:0ms beats 100%, Memory: 41.9MB beats 88.84%
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            //[1,2,3,4,5]
            int counter=1;
            ListNode main=new ListNode();
            ListNode point=main;
            ListNode bane=new ListNode();
            ListNode point2=bane;
            while(head!=null){
                if(counter%2!=0){
                    main.next=new ListNode(head.val);
                    main=main.next;
                }else{
                    bane.next=new ListNode(head.val);
                    bane=bane.next;
                }
                counter++;
                head=head.next;
            }
            main.next=point2.next;
            return point.next;

        }
    }
}
