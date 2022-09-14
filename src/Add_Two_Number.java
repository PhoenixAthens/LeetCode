import java.util.*;
public class Add_Two_Number {
    private static class ListNode{
        int val;
        ListNode next;
        public ListNode(){
        }
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
        public String toString(){
            return +val+","+next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String number1=l1.toString();
        String[] arrTemp1=number1.split(",");
        String[] arr1=Arrays.copyOf(arrTemp1,arrTemp1.length-1);
        //System.out.println(Arrays.toString(arr1));
        String number2=l2.toString();
        String[] arrTemp2=number2.split(",");
        String[] arr2=Arrays.copyOf(arrTemp2,arrTemp2.length-1);
        String rev1=reverseString(arr1);
        Integer num1=Integer.parseInt(rev1);
        String rev2=reverseString(arr2);
        Integer num2=Integer.parseInt(rev2);
        Integer sum=num1+num2;
        String PrepSum=String.valueOf(sum);
        String[] SumArray=new String[PrepSum.length()];
        for(int i=0;i<PrepSum.length();i++){
            SumArray[i]=String.valueOf(PrepSum.charAt(i));
        }
        String reverse=reverseString(SumArray);
        char[] arrOfSum=reverse.toCharArray();
        System.out.println(Arrays.toString(arrOfSum));
        ListNode l3=new ListNode();
        ListNode node=l3;
        for(int i=0;i<arrOfSum.length-1;i++){
            l3.val=Integer.parseInt(String.valueOf(arrOfSum[i]));
            node.next=new ListNode(Integer.parseInt(String.valueOf(arrOfSum[i+1])));
            node=node.next;
        }
        return l3;

    }
    public static String reverseString(String[] array){
        for(int i=0;i<(array.length)/2;i++){
            String temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        String reverse="";
        for(String i:array){
            reverse+=i;
        }
        return reverse;
    }
    public static void main(String...args){
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(8);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        l2.next.next.next=new ListNode(9);
        System.out.println(addTwoNumbers(l1,l2));

    }
}
