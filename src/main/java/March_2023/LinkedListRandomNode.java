package March_2023;

import java.util.ArrayList;
//Date: March 10th, 2023
public class LinkedListRandomNode {
    //Runtime: 13ms beats 35.62%, Memory: 44.9MB beats 14.89%
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}
    }
    public ArrayList<Integer> values;
    public LinkedListRandomNode(ListNode head){
        this.values=new ArrayList<>();
        while(head!=null){
            values.add(head.val);
            head=head.next;
        }
    }
    public int getRandom(){
        int random=(int)Math.floor(Math.random()*values.size());
        return values.get(random);
    }
}
