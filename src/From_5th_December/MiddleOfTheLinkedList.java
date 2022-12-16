package From_5th_December;

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
    // we have [2,3,4,5,6]
    // first we add to array: 2 count is 0, temp becomes 3
    // then we add to array: 3 count is 1, temp becomes 4
    // then we add to array: 4 count is 2, temp becomes 5
    // then we add to array: 5 count is 3, temp becomes 6
    // then we add to array: 6 count is 4, temp becomes null
    // so in actuality all elements we added, count here becomes 5
    // thus count/2=2 and we give from 4, i.e [4,5,6]
    //if we had another element [2,3,4,5,6,7], the count would have become 6,
    // thus count/2=3 which would have given us [5,6,7] the req result, thus no problemo!
}
