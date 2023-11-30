package May_2023;

import java.util.ArrayList;

public class Remove_Nth_Node_From_End_Of_List {
    //Works for 32/208 test case, Still Working on it!
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n){
        /*if(n==1){
            ListNode tempHead=head;
            while(tempHead.next!=null){
                tempHead=tempHead.next;
            }
            tempHead=null;
            return head;
        }*/
        int count=0;
        ListNode rear=head;
        ListNode front=head;
        while(front.next!=null){
            front=front.next;
            count++;
            if(count>n)rear=rear.next;
        }
        if(count==0)return null;
        if(count==1){
            rear.next=null;
            return rear;
        }
        rear.next=front;
        return head;
    }
    public static void main(String...args){
        new Remove_Nth_Node_From_End_Of_List().removeNthFromEnd(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),2);
    }
}
