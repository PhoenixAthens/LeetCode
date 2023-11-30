package March_2023;
import java.util.ArrayList;
//Date: 12th March 2023
public class Merge_K_Sorted_Lists {
    //Runtime: 7ms beats 34.43%, Memory: 44.4MB beats 35.80%
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> listOfNodes=new ArrayList<>();
        int i=0;
        while(i<lists.length){
            ListNode present=lists[i];
            while(present!=null){
                listOfNodes.add(present.val);
                present=present.next;
            }
            i++;
        }
        if(listOfNodes.size()==0)return null;
        listOfNodes.sort(null);
        ListNode main=new ListNode(listOfNodes.get(0));
        ListNode result=main;
        for(int j=1;j<listOfNodes.size();j++){
            result.next=new ListNode(listOfNodes.get(j));
            result=result.next;
        }
        return main;
    }
    public static void main(String...args){
        new Merge_K_Sorted_Lists().mergeKLists(new ListNode[]{new ListNode(1),new ListNode(0)});
    }
}
