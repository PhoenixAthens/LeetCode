package March_2023;
import java.util.*;
public class Max_Heap {
    private LinkedList<Integer> mainArray;
    public Max_Heap(){
        mainArray=new LinkedList<>();
    }
    public boolean isEmpty(){
        return mainArray.isEmpty();
    }
    public int size(){
        return mainArray.size();
    }
    private int getParent(int index){
        return Math.floorDiv(index-1,2);
    }
    public void addElement(int value){
        mainArray.add(value);
        int index=size()-1;
        while(index>0){
            int parent=getParent(index);
            if(mainArray.get(parent)< mainArray.get(index)){
                int temp = mainArray.get(parent);
                mainArray.set(parent, mainArray.get(index));
                mainArray.set(index,temp);
            }else break;
            index=parent;
        }
    }
    private int maxChild(int index){
        if(index*2+2 >= size()) return index*2+1;
        else if(mainArray.get(index*2+1)>mainArray.get(index*2+2))return index*2+1;
        else return index*2+2;

    }
    public int ExtractMax(){
        int max = mainArray.remove(0);
        if(size()!=0) {
            mainArray.add(0,mainArray.remove(size()-1));
            int index = 0;
            while (index * 2 < size() - 1) {
                int child = maxChild(index);
                if (mainArray.get(child) > mainArray.get(index)) {
                    int temp = mainArray.get(child);
                    mainArray.set(child, mainArray.get(index));
                    mainArray.set(index, temp);
                } else break;
                index = child;
            }
        }
        return max;
    }
    public int getMax(){
        return mainArray.get(0);
    }
    public void printHeap(){
        System.out.println(mainArray);
    }
    public static void main(String...args){
        Max_Heap testRun=new Max_Heap();
        long time=System.currentTimeMillis();
        int[] arr={
                57, 99, 63, 2, 31, 48, 80, 70, 14, 95,
                35, 23, 64, 50, 44, 58, 8, 11, 90, 61, 68,
                97, 25, 52, 46, 71, 55, 29, 76, 13, 93, 60,
                79, 38, 86, 22, 69, 16, 5, 83, 43, 74, 28,
                66 ,91 ,18 ,33 ,56 ,98 ,62 ,3 ,32 ,49 ,81 ,
                72 ,15 ,96 ,36 ,24 ,65 ,51 ,45 ,59 ,9 ,12 ,92
                ,67 ,100 ,26 ,53 ,47 ,73 ,54 ,30 ,77 ,19 ,94
                ,41 ,78 ,39 ,87 ,21 ,17 ,6 ,84 ,42 ,75};

        for (int j : arr) {
            testRun.addElement(j);
        }
        testRun.printHeap();
      /*  testRun.addElement(12);
        testRun.addElement(11);
        testRun.addElement(13);
        testRun.addElement(5);
        testRun.addElement(6);
        testRun.addElement(7);*/

        /*ArrayList<Integer> sortedArray=new ArrayList<>();
        while(!testRun.isEmpty()){
            sortedArray.add(testRun.ExtractMax());
        }
        time=System.currentTimeMillis()-time;
        System.out.println(sortedArray);
        long time2=System.currentTimeMillis();
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
        time2=System.currentTimeMillis()-time2;
        System.out.printf("Time1: %d, Time2: %d",time,time2);*/

    }
}
