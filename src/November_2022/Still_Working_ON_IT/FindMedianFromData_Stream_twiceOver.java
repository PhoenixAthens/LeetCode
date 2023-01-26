package November_2022.Still_Working_ON_IT;

import java.util.*;
import java.util.stream.Stream;

public class FindMedianFromData_Stream_twiceOver {
    // this won't work because we have duplicates in inputs
    public static class MedianFinder{
        TreeSet<Integer> tree;
        public MedianFinder() {
            tree=new TreeSet<>();
        }
        public void addNum(int num) {
            tree.add(num);
        }

        public double findMedian() {
            ArrayList<Integer> list=new ArrayList<>(tree);
            int size=list.size();
            if(size%2==0){
                return (list.get(size/2)+list.get(size/2-1))/2.0;
            }else{
                int val=size/2;
                return list.get(val);
            }
        }
    }
}
