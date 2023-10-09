package LinkedIN_Learning.Java_Algorithms;

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
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
        public Node(T data){
           this(data,null);
        }
    }
    public static class CustomLinkedList<T>{
        Node<T> head;
        Node<T> current;
        int size;
        public CustomLinkedList(){
            this.size = 0;
        }
        public void add(T data){
            if(size==0){
                head = new Node<>(data);
                head.next = this.current;
            }
            current = new Node<>(data);
            current = current.next;
            size+=1;
        }
        public String toString(){
            StringBuffer buff = new StringBuffer();
            Node<T> dumpHead = head;
            buff.append("[");
            while(dumpHead.next!=null){
                buff.append(dumpHead.data);
                buff.append(",");
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
        System.out.println(make2);
    }
}
