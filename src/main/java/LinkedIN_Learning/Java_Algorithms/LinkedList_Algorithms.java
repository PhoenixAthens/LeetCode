package LinkedIN_Learning.Java_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_Algorithms {
    /**
     * Linked List is another common data structure that one can use
     * to store and retrieve data. Similar to an array, it's a linear data
     * data structure, where elements are ordered one after the other,
     * However, with a linked-list elements are not stored at contiguous
     * locations. Instead, they're linked using pointers. The idea of an index
     * does not exist for linked-list. We call each element in a linked-list a
     * node. Each node contains a piece of data and a pointer to the next piece of
     * data. Several nodes can be linked together through these next pointers.
     * The first node in a linked-list is often referred to as the head of the list
     * while the last node is referred to as the tail of the list.
     *
     * The size of a linked-list can vary over time. With an array, it's size must be
     * set as soon as it is created and the size cannot change. In order to store
     * more elements in a given array, a bigger array must be created and the current items be
     * copied over to the larger array, along with new items. With a linked-list this is not needed
     * because elements are linked by pointers, which can be changed or moved any time.
     *
     * Say, you want to reduce the length of a linked-list to half its current size,
     * you can simply find the middle element and set the pointer associated with it to null.
     * Thus, the middle element points to nothing. In other languages when performing such an action
     * More memory management might be required but not in Java, in Java we have a garbage collector,
     * and it will manage memory automatically.
     * */
    public static class Node<T>{
        T data;
        Node<T> next;
        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        public Node(T data){
           this(data,null);
        }
    }
    private static <T> int lengthCalculator(Node<T> node){
        int size = 0;
        while(node!=null){
            node=node.next;
            size++;
        }
        return size;
    }
    public static <T> void removeKthNode(Node<T> node, int k){
        int size = lengthCalculator(node)-1;
        System.out.println(size);
        int till = size-k;
        if(till<0)return;
        for(int i=0;i<till;i++){
            node=node.next;
        }
        node.next = node.next.next;
    }
    public static <T> void ManualLinkedListIterator(Node<T> head ){
        if(head!=null){
            while(head!=null){
                System.out.print(head.data+", ");
                head=head.next;
            }
            System.out.println();
        }
    }
    public static <T> void setHalfManualLinkedListNull(Node<T> head){
        if(head!=null){
            Node<T> fast = head;
            Node<T> slow = head;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                head = slow;
                slow = slow.next;
            }
            head.next=null;
        }
    }

    public static class CustomLinkedList<T>{
        private Node<T> head;
        private Node<T> tail;
        int size = 0;
        public void add(T data){
            Node<T> node = new Node<>(data,null);
            if(tail==null){
                head = node;
            }else{
                tail.next = node;
            }
            tail=node;
            size++;
        }
        @Override
        public String toString(){
            StringBuffer buff = new StringBuffer();
            Node<T> dumpHead = head;
            buff.append("[");
            while(dumpHead!=null){
                buff.append(dumpHead.data);
                dumpHead = dumpHead.next;
                if(dumpHead!=null) buff.append(",");
            }
            buff.append("]");
            return buff.toString();
        }
    }

    public static void main(String...args){
        LinkedList<Integer> make = new LinkedList<>();
        make.add(2);
        make.add(5);
        make.add(8);
        make.add(9);
        System.out.println(make);
        CustomLinkedList<Integer> make2=new CustomLinkedList<>();
        make2.add(2);
        make2.add(5);
        make2.add(8);
        make2.add(9);
        while(make2.head!=null){
            System.out.println(make2.head.data);
            make2.head=make2.head.next;
        }
        //System.out.println(make2);
        Node<Integer> first = new Node<>(23,new Node<>(46,new Node(90,new Node(120, new Node(1,null)))));
        ManualLinkedListIterator(first);
        setHalfManualLinkedListNull(first);
        ManualLinkedListIterator(first);
        Node<Integer> second = new Node<>(23,new Node<>(46,new Node(90,new Node(120, new Node(1,null)))));
        removeKthNode(second,4);
        ManualLinkedListIterator(second);
        removeKthNode(second,1);
        ManualLinkedListIterator(second);
        removeKthNode(second,4);
        ManualLinkedListIterator(second);
        ArrayList<Integer> mi = new ArrayList<>();
        mi.add(2);
        mi.add(5);
        mi.add(9);
        mi.stream().map(x-> Arrays.asList(x-1,x,x+1)).forEach(System.out::println);
        /*[1, 2, 3]
        [4, 5, 6]
        [8, 9, 10]*/





    }
}
