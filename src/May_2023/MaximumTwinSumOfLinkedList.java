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
    public int pairSum_SecondAttempt(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
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
}
