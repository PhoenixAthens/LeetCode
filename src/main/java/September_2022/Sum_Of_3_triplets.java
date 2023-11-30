package September_2022;

import java.util.*;

public class Sum_Of_3_triplets {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> tempNumbers=iterateThroughList(i,nums);
            if(tempNumbers!=null){
                listOfLists.addAll(tempNumbers);
            }
        }

        Set<List<Integer>> removeDuplicates=new HashSet<>();
        for(List<Integer> i:listOfLists){
            removeDuplicates.add(i);
        }

        List<List<Integer>> finalList=new ArrayList<>(removeDuplicates);
        //List<List<Integer>> finalSure=new ArrayList<>();

        System.out.println(finalList);
        for(int i=0;i<finalList.size()-1;i++){
            removeDuplicates(i,finalList);
        }
        return finalList;

    }
    public static List<List<Integer>> iterateThroughList(int i,int[] nums){
        List<List<Integer>> list=new ArrayList<>();
        int temp=nums[i];

        for(int j=i+1;j<nums.length-1;j++){
            ArrayList<Integer> tempArray=new ArrayList<>();
            for(int k=j+1;k<nums.length;k++){
                int temp2=nums[j]+nums[k];
                if((temp2+temp)==0){
                    tempArray.add(temp);
                    tempArray.add(nums[j]);
                    tempArray.add(nums[k]);
                    list.add(tempArray);
                    break;
                }
            }

        }
        return list;
    }
    public static void removeDuplicates(int i, List<List<Integer>> listOfLists){
        List<Integer> temp=listOfLists.get(i);
        int identifier=temp.hashCode();
        Object[] tempArray=temp.toArray();
        Arrays.parallelSort(tempArray,null);
        Iterator<List<Integer>> it=listOfLists.iterator();
        it.next();
        while(it.hasNext()){
            List<Integer> nextOne=it.next();
            if(nextOne.hashCode()==identifier){
                continue;
            }
            Object[] tempArray2=nextOne.toArray();
            Arrays.parallelSort(tempArray2,null);
            if(Arrays.equals(tempArray,tempArray2)){
                it.remove();
            }
            System.out.println(listOfLists);
        }
    }
    public static void main(String...args){
        System.out.println(threeSum(new int[]{}));



    }
}
