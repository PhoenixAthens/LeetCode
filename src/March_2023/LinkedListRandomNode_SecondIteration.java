package March_2023;

import java.util.Random;

//Date: March 10, 2023
public class LinkedListRandomNode_SecondIteration {
    //Runtime: 12ms beats 48.76%, Memory: 45.1MB beats 14.16%
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }
    public ListNode values;
    public int length;
    public Random rand;
    public LinkedListRandomNode_SecondIteration(ListNode head) {
        this.values=head;
        rand=new Random();
        while(head!=null){
            length++;
            head=head.next;
        }
    }
    public int getRandom() {
        int random=rand.nextInt(length);
        int count=0;
        ListNode temp=values;
        while(count<random){
            temp=temp.next;
            count++;
        }
        return temp.val;
    }
}
