package April_2023;
import java.util.*;
public class SmallestNumberInInfiniteSet_SecondAttempt {
    //Fails on 84th out of 135 test cases
    public static class SmallestInfiniteSet {
        Stack<Integer> poppy;
        public SmallestInfiniteSet() {
            poppy=new Stack<>();
            for(int i=1000;i>0;i--)poppy.push(i);

        }
        public int popSmallest() {
            return poppy.pop();
        }
        public void addBack(int num) {
            if(num<poppy.peek())poppy.push(num);
        }
    }
}
