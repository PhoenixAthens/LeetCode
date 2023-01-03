package JAN_3_2023;

import java.util.Iterator;
import java.util.LinkedList;

public class DeleteColumnsToMakeSorted_ED2 {
    // First RUN
    //Runtime: 9ms beats 84.49%, Memory: 42.6MB beats 71.46%
    // Second RUN
    //Runtime: 15ms beats 50.56%, Memory: 47.2MB beats 62.70%
    // Third RUN
    //Runtime: 23ms beats 20.45%, Memory: 47.6MB beats 50.11%
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j< strs.length;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    /* Intellij created the following code
    //Runtime: 40ms to 65ms, Memory: 50.8MB
    public int minDeletionSize(String[] strs) {
        int count= (int) IntStream.range(0, strs[0].length()).filter(i -> IntStream.range(1, strs.length).anyMatch(j -> strs[j].charAt(i) < strs[j - 1].charAt(i))).count();
        return count;
    }
    *
    * */
    public static void main(String...args){
        System.out.println(new DeleteColumnsToMakeSorted_ED2().minDeletionSize(new String[]{"cba","daf","ghi"}));
        System.out.println(new DeleteColumnsToMakeSorted_ED2().minDeletionSize(new String[]{"a","b"}));
        System.out.println(new DeleteColumnsToMakeSorted_ED2().minDeletionSize(new String[]{"zyx","wvu","tsr"}));
        // z y x
        // w v u
        // t s r
    }
}
