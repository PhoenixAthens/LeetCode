package Scrap;
import java.util.*;
import java.util.function.Consumer;

public class TestingComparator{
    private ArrayList<Integer> Dstore=new ArrayList<>();
    public void mantra(){
        Consumer<Integer> cons=new Consumer<>(){
            ArrayList<Integer> store=new ArrayList<>();
            @Override
            public void accept(Integer integer) {
                store.add(integer);
                if(integer==5){
                    return;
                    /*System.out.println(this.store);
                    System.out.println("OUT OF:" +TestingComparator.this.Dstore);
                    System.out.println();
                    System.out.println(this.getClass());
                    //System.out.println(TestingComparator.name);
                    //if our list had the same name as our inner arrayList, there would have been no way to
                    *///access it inside our innerClass
                }
            }
        };
    }

    public static void main(String... args){
        var Mstore=new ArrayList<>(Arrays.asList(1,4,2,67,1,23,5,99,0,22,11,3));
        Consumer<Integer> cons=new Consumer<>(){
            ArrayList<Integer> store=new ArrayList<>();
            @Override
            public void accept(Integer integer) {
                store.add(integer);
                if(integer==5){
                    System.out.println(store);
                    return;
                }
            }
        };
        Mstore.forEach(cons);
        Consumer<Integer> pons=new Consumer<>(){
            ArrayList<Integer> detour=new ArrayList<>();
            @Override
            public void accept(Integer integer) {
                detour.add(integer);
                if(integer==23){
                    System.out.println(this.detour);
                    System.out.println("OUT OF:" +Mstore);
                    System.out.println(this.getClass());
                }
            }
        };

        Mstore.forEach(pons);
        Consumer<Integer> don=x->{
            ArrayList<Integer> go=new ArrayList<>();
            
        };
        //One thing that is clear from this input is that the compiler is creating a class for all elements of our list
        //and it's being done ones, this refers to innerClass

        /*list.forEach(x->{
            if(x==67){
                return;
            }else{
                System.out.print(x+" ");
            }
        });
        System.out.println();
        for(int i:list){
            if(i==67)break;
            else{
                System.out.print(i+" ");
            }
        }
        list.forEach(x->{
            if(x==67){
                break;
            }else{
                System.out.print(x+" ");
            }
        });*/
        /*Comparator<Integer> comparator=new Comparator<>(){
            public int compare(Integer o1, Integer o2){
                if(o1>o2){
                    return 1;
                }else{
                    return o1<o2?-1:0;
                }
            }
            public boolean equals(Object obj){
                if(this==obj){
                    return true;
                }else{
                    return false;
                }
            }
        };
        list.sort(comparator);
        System.out.println(list);
        list.forEach(x->{
            if(x==5) return;//return; //so we have local return statement.//you can't use break in forEach,
                // the program will crash
            else{
                System.out.println(x);
            }
        });
        Runnable r=()->System.out.println("Hello");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.getState());
        t.setPriority(9);
        t.start();

        new Thread(()->System.out.println("Joseph")).start();
*/
    }

}
