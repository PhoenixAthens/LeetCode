package December_2022.From_25th_December;
import java.util.Arrays;
import java.util.HashMap;
public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        HashMap<Integer,Integer> subSets=new HashMap<>();
        int numsLen=nums.length;
        int queriesLen=queries.length;

        for(int k=0;k<numsLen;k++){
            int counter=0;
            int presentSum=0;
            subSets.put(nums[k],counter+1);
            for(int i=k;i<=numsLen-1;i++){
                presentSum+=nums[i];
                ++counter;
                //subSets.put(presentSum,++counter);
                for(int j=i+1;j<numsLen;j++){
                    subSets.put(presentSum+nums[j],counter+1);
                }
            }
        }

        int[] answer=new int[queriesLen];

        /** Fix from down here*/

        /*int index=0;
        int prev=0;
        int len=(int)Math.pow(2,queriesLen);
        Integer[] array=subSets.keySet().toArray(new Integer[len]);
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
        for(int i:queries){
            if(subSets.containsKey(i))answer[index++]= subSets.get(i);
            else{
                *//*for(int j: subSets.keySet()){
                    if(j==i)answer[index++]=subSets.get(i);
                    else if(j>i)answer[index++]= subSets.get(prev);
                    prev=j;
                }*//*
                //This should fix the problem
                *//*for(int j=0;j< subSets.keySet().size()-1;j+=2){
                    int present=array[j+1];
                    if(array[j]<i && i<array[j+1])answer[index++]=subSets.get(present);

                }*//*
                //if(array[len]<i)answer[index++]=subSets.get(array[len]);
            }
        }
        //if(index==0)answer[index]=index;
        *//*else*//* if(index<queriesLen)answer[index]=subSets.get(prev);
        */return answer;

    }
    public static void main(String...args){
        //System.out.println(new LongestSubsequenceWithLimitedSum().answerQueries(new int[]{4,5,2,1},new int[]{3,10,21}));
        System.out.println(Arrays.toString(new LongestSubsequenceWithLimitedSum().answerQueries(new int[]{4,5,2,1},new int[]{3,10,21})));
        //System.out.println(Arrays.toString(new LongestSubsequenceWithLimitedSum().answerQueries(new int[]{2,3,4,5},new int[]{1})));
        //System.out.println(Arrays.toString(new LongestSubsequenceWithLimitedSum().answerQueries(new int[]{736411,184882,914641,37925,214915},new int[]{331244,273144,118983,118252,305688,718089,665450})));
        //still working on it!!
    }
}
