package April_2023;
import java.util.*;
//Date: April 17th, 2023
public class KidsWithGreatestNumberOfCandies {
    //Runtime: 0ms beats 100%, Memory: 42.7MB beats 44.70%
    //Replacing for-loop with for-enhanced loop
    //Runtime: 1ms beats 81.75, Memory: 42.7MB beats 44.70%
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>(candies.length);
        int max=0;
        for(int i:candies){
            max=Math.max(i,max);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
