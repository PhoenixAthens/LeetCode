package Scrap;
import java.util.*;
public class TestingLinkedList {
    public static void main(String...args){
        /*LinkedList<Integer> numbers=new LinkedList<>();
        for(int i=0;i<20;i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        //output: [0,1,2,3,4,5,6,...]
        Iterator<Integer> it=numbers.iterator();
        Stack<Integer> temp=new Stack<>();
        while(it.hasNext()){
            Integer num=it.next();
            temp.push(num);
        }
        numbers.clear();
        while(!temp.isEmpty()){
            numbers.add(temp.pop());
        }
        System.out.println(numbers);*/
        NodeList<Integer> nodeList=new NodeList<>(8);
        for(int i=0;i<10;i++){
            nodeList.Add(i);
        }
        while(nodeList.next!=null){
            System.out.print(" "+nodeList.value);
            nodeList.next=nodeList.next.next;
        }

    }
    public static class NodeList<T>{
        private T value;
        private NodeList<T> next;
        public NodeList(T val){
            this.value=val;

        }
        public NodeList(ArrayList<T> collection){

        }
        public void Add(T val){
            this.next=new NodeList<T>(val);
            next=next.next;
        }
        public void remove(int index){
            int count=0;
            while(this.next!=null || count!=index){
                next=next.next;
                count++;
                if(count==index){
                    next=null;
                    break;
                }
            }
        }
    }
}
