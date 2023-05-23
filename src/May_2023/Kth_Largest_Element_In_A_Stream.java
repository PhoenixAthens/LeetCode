package May_2023;
import java.util.Arrays;
//Date: 24th May 2023
public class Kth_Largest_Element_In_A_Stream {
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
}
