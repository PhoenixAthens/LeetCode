package May_2023;
import java.util.*;
import java.util.stream.Stream;

//Date: 24th May 2023
public class Kth_Largest_Element_In_A_Stream {
    //Attempt 1
    //Runtime: 234ms, Memory: 51.3MB
    public class KthLargest{
        int[] elements;
        int findAt;
        public KthLargest(int k, int[] nums) {
            elements=nums;
            Arrays.parallelSort(elements);

            findAt=k;
        }
        public int add(int val) {
            int n = elements.length;
            int[] OneElementLonger=new int[n+1];
            System.arraycopy(elements,0,OneElementLonger,0,n);
            int i=n-1;
            for(;i>=0 && OneElementLonger[i]>val;i--)OneElementLonger[i+1]=OneElementLonger[i];
            OneElementLonger[i+1]=val;
            this.elements=OneElementLonger;
            return OneElementLonger[n+1-findAt];

        }

    }
    //Attempt 2
    //Time Limit Exceeded!
    public class KthLargest_2{
        LinkedList<Integer> elements;
        int size;
        int findAt;
        public KthLargest_2(int k, int[] nums) {
            size=nums.length;
            Arrays.parallelSort(nums);
            elements=new LinkedList<>();
            for(int i=0;i<size;i++)elements.add(nums[i]);
            findAt=k;
        }
        public int add(int val) {
            int i=size-1;
            while(i>=0 && elements.get(i)>val)i--;
            elements.add(i+1,val);
            size+=1;
            return elements.get(size-findAt);

        }

    }

}
