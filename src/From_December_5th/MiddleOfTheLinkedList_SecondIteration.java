package From_December_5th;
import java.util.ArrayList;
public class MiddleOfTheLinkedList_SecondIteration {
    //Time: 0ms, Memory: 41.4MB
    class ListNode_Neun {
        int val;
        ListNode_Neun next;
        ListNode_Neun() {}
        ListNode_Neun(int val) { this.val = val; }
        ListNode_Neun(int val, ListNode_Neun next) { this.val = val; this.next = next; }
    }
    public ListNode_Neun middleNode(ListNode_Neun head) {
        ListNode_Neun tempo=head;
        ArrayList<ListNode_Neun> nodeList=new ArrayList<>();
        while(tempo!=null){
            nodeList.add(tempo);
            tempo=tempo.next;
        }
        int quantity=(nodeList.size())/2;
        return nodeList.get(quantity);

    }
}
