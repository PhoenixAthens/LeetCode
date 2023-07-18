package June_2023;

public class Merge_Two_SortedLists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        return null;
    }
}
