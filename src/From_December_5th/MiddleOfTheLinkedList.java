package From_December_5th;

public class MiddleOfTheLinkedList {
    //Runtime: 0ms beats 100%, Memory:39.8MB beats 91.4%
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        ListNode[] nodeList=new ListNode[200];
        while(temp!=null){
            nodeList[count]=temp;
            temp=temp.next;
            count++;
        }
        nodeList[count]=temp;
        int quantity=count/2;
        return nodeList[quantity];

    }
}
