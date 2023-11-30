package October_2022;

import java.util.*;
public class DeleteTheMiddleNodeOfALinkedList {
    //Runtime: 54ms beats 7.20%, Memory: 254.8MB beats 5.3%
    private static class ListNode{
        private int val;
        private ListNode next;
        public ListNode(){

        }
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val, ListNode nextNode){
            this.val=val;
            this.next=nextNode;
        }

    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode p1=head,p2=head;
        if (head == null) {
            return null;
        }
        ArrayList<Integer> tempArray=new ArrayList<>();
        tempArray.add(p1.val);
        while(p1.next!=null){
            p1=p1.next;
            tempArray.add(p1.val);
        }
        tempArray.remove((tempArray.size())/2);
        ListNode ln=new ListNode(),ln2;
        ln2=ln;
        if(tempArray.size()==0){
            return null;
        }else{
            for(int i=0;i<tempArray.size();i++){
                ln2.val=tempArray.get(i);
                if(i!=tempArray.size()-1){
                    ln2.next=new ListNode();
                    ln2=ln2.next;
                }else{
                    break;
                }
            }
            return ln;
        }


    }

}
