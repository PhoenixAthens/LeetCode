import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
//17/21 test case working, Time limit exceeded

public class FindMedianFromData_Stream {
    public static class MedianFinder{
        private final ArrayList<Integer> list;
        public MedianFinder() {
            list=new ArrayList<>();
        }

        public void addNum(int num) {
            list.add(num);
            list.sort(null);
        }

        public double findMedian() {
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
