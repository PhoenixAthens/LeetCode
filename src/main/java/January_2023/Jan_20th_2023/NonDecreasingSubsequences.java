package January_2023.Jan_20th_2023;
import java.util.*;
public class NonDecreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> main=new HashSet<>();
        for(int start=0;start<nums.length;start++){
            ArrayList<Integer> temp=new ArrayList<>();
            int present=nums[start];
            temp.add(present);
            for(int size=2;size<=nums.length;size++){
                int preStart=start+1;
                int prev=present;
                while (preStart < nums.length) {
                    for(int elements=preStart;elements<nums.length;elements++){
                        if(nums[elements]>=prev){
                            temp.add(nums[elements]);
                            prev=nums[elements];
                        }
                        if(temp.size()==size){
                            main.add(temp);
                            ArrayList<Integer> temp2=new ArrayList<>();
                            for(int k=0;k<temp.size()-1;k++)temp2.add(temp.get(k));
                            temp=temp2;
                            prev=temp.get(temp.size()-1);
                        }
                    }
                    temp=new ArrayList<>();
                    temp.add(present);
                    preStart++;
                }
                temp=new ArrayList<>();
                temp.add(present);
            }
        }
        return new ArrayList<>(main);
    }
    public static void main(String...args){
        /*List<List<Integer>> checker=new ArrayList<>();
        checker.add(new ArrayList<>(List.of(1,2)));
        ArrayList<Integer> dup=new ArrayList<>(List.of(1,2));
        System.out.println(checker.contains(dup));
        List<List<Integer>> deck=new ArrayList<>(new HashSet<>());*/
        System.out.println(new NonDecreasingSubsequences().findSubsequences(new int[]{4,6,7,7}));
        System.out.println(new NonDecreasingSubsequences().findSubsequences(new int[]{4,4,3,2,1}));
    }

}
