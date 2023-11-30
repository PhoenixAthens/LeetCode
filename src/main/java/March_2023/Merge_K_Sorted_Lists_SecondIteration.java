package March_2023;
import March_2023.Merge_K_Sorted_Lists.ListNode;
import java.util.*;
//Date: 12th March 2023
public class Merge_K_Sorted_Lists_SecondIteration {
    //Runtime: 10ms beats 24.88%, Memory: 43.9MB beats 86.13%
    //Replacing .toArray(new Integer[listOfNodes.size()] with a for-loop to create a new Array
    //Runtime: 5ms beats 71.47%, Memory: 44.3MB beats 44.65%
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
        int[] makeIt=new int[listOfNodes.size()];
        int index=0;
        for(int j:listOfNodes)makeIt[index++]=j;
        Arrays.parallelSort(makeIt);
        ListNode main=new ListNode(makeIt[0]);
        ListNode result=main;
        for(int j=1;j<makeIt.length;j++){
            result.next=new ListNode(makeIt[j]);
            result=result.next;
        }
        return main;
    }
    public static void main(String...args){
        new Merge_K_Sorted_Lists_SecondIteration().mergeKLists(new ListNode[]{new ListNode(1),new ListNode(0)});
    }
}
