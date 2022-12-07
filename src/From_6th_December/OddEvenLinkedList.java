package From_6th_December;

public class OddEvenLinkedList {
    //Runtime: 2ms, Memory:45.6MB
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        //[1,2,3,4,5]
        ListNode temp=head;
        int counter=1;
        ListNode main=new ListNode();
        ListNode point=main;
        ListNode bane=new ListNode();
        ListNode point2=bane;
        while(temp!=null){
            if(counter%2!=0){
                main.next=new ListNode(temp.val);
                main=main.next;
            }else{
                bane.next=new ListNode(temp.val);
                bane=bane.next;
            }
            counter++;
            temp=temp.next;
        }
        main.next=point2.next;
        return point.next;

    }
}
