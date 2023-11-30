package May_2023;
import May_2023.SwappingNodesInALinkedList.ListNode;
import java.util.*;
public class MaximumTwinSumOfLinkedList {
    //Runtime: 10ms, Memory: 65.1MB
    public int pairSum(ListNode head) {
        ArrayList<ListNode> values=new ArrayList<>();
        while(head!=null){
           values.add(head);
           head=head.next;
        }
        int maxSum=0;
        int totalNodes=values.size();
        int halfWay=totalNodes/2;
        for(int i=0;i<halfWay;i++){
            int tempSum=values.get(i).val+values.get(totalNodes-i-1).val;
            maxSum=(tempSum>maxSum)?tempSum:maxSum;
        }
        return maxSum;
    }
    //Runtime: 52ms, Memory: 64.8MB
    //Using ArrayDeque
    //Runtime: 15ms, Memory: 65.8MB
    public int pairSum_SecondAttempt(ListNode head) {
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        ListNode decoy=head;
        while(decoy!=null){
            stack.push(decoy);
            decoy=decoy.next;
        }
        int maxSum=0;
        int len=stack.size();
        int i=0;
        while(i<len){
            int tempSum=stack.pop().val+head.val;
            maxSum = (maxSum<tempSum)?tempSum:maxSum;
            head=head.next;
            i++;
        }
        return maxSum;
    }
    //Runtime: 13ms, Memory: 66.2MB
    public int pairSum_ThirdAttempt(ListNode head) {
        ListNode slow=head;
        ListNode halfMover=head;
        ArrayDeque<Integer> values = new ArrayDeque<>();
        while(halfMover!=null && halfMover.next!=null){
            values.push(slow.val);
            slow=slow.next;
            halfMover=halfMover.next.next;

        }
        int maxSum=0;
        while(slow!=null){
            int tempSum = slow.val+values.pop();
            maxSum=(maxSum>tempSum)?maxSum:tempSum;
            slow=slow.next;
        }
        return maxSum;
    }
}
