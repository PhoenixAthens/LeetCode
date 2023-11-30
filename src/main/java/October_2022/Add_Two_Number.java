package October_2022;

import java.util.*;
public class Add_Two_Number {
    //Runtime: 4ms beats 25.72%, Memory: 47.1MB beats 36.56%
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode main=new ListNode();
        ListNode returner=main;
        while(true){
            int tempSum=l1.val+l2.val+carry;
            if(tempSum>9){
                carry=tempSum/10;
            }
            returner.val=tempSum%10;
            if(l1.next==null && l2.next==null){
                break;
            }else if(l2.next==null){
                while(l1.next!=null){
                    l1=l1.next;
                    returner.next=new ListNode();
                    returner=returner.next;
                    tempSum=l1.val+carry;
                    if(tempSum>9){
                        carry=tempSum/10;
                    }
                    returner.val=tempSum%10;
                }
                returner.next=new ListNode(carry);
                return main;
            }else if(l1.next==null){
                while(l2.next!=null){
                    l2=l2.next;
                    returner.next=new ListNode();
                    returner=returner.next;
                    tempSum=l2.val+carry;
                    if(tempSum>9){
                        carry=tempSum/10;
                    }
                    returner.val=tempSum%10;
                }
                returner.next=new ListNode(carry);
                return main;
            } else{
                l1=l1.next;
                l2=l2.next;
                returner.next=new ListNode();
                returner=returner.next;
            }

        }
        return main;
    }
    public static void main(String...args){
        ListNode found=addTwoNumbers(new ListNode(2,new ListNode(4,new ListNode(3))),new ListNode(5,new ListNode(6,new ListNode(4))));
        System.out.println(found.val);
        System.out.println(found.next.val);
        System.out.println(found.next.next.val);

    }

}
